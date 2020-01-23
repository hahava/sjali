package sejong.hungryduck.hackathon.controller;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sejong.hungryduck.hackathon.model.Pagination;
import sejong.hungryduck.hackathon.model.Posting;
import sejong.hungryduck.hackathon.persistence.PostingRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PostingController {

	private final PostingRepository postingRepository;

	@GetMapping("/posting/{id}")
	public Posting getPosting(@PathVariable Long id) {
		return postingRepository.findByNo(id);
	}

	@GetMapping("/postings")
	public List<Posting> getPostings(Pagination pagination) {
		return postingRepository
			.findAll(PageRequest.of(pagination.getPage(), pagination.getSize()))
			.getContent();
	}

	@PostMapping("/posting")
	public ResponseEntity<String> addPosting(@Valid @RequestBody Posting posting, BindingResult br) {
		if (br.hasErrors()) {
			return new ResponseEntity<>("Not valid param", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
