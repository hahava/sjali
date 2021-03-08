package sejong.hungryduck.hackathon.controller;

import lombok.AllArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sejong.hungryduck.hackathon.model.Pagination;
import sejong.hungryduck.hackathon.model.Posting;
import sejong.hungryduck.hackathon.persistence.PostingRepository;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
	public ResponseEntity<String> addPosting(Posting posting, @RequestPart(required = false) MultipartFile multipartFile) {

		if (multipartFile != null) {
			final String filePath = "../images/" + multipartFile.getOriginalFilename();
			File addedFile = new File(filePath);
			try (
				FileOutputStream outputStream = new FileOutputStream(addedFile)) {
				IOUtils.write(multipartFile.getBytes(), outputStream);
				posting.setImgPath(filePath);
			} catch (IOException e) {
				return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
			}
		}
		postingRepository.save(posting);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
