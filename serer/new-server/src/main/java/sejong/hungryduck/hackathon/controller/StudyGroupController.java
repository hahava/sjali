package sejong.hungryduck.hackathon.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sejong.hungryduck.hackathon.model.Pagination;
import sejong.hungryduck.hackathon.model.StudyGroup;
import sejong.hungryduck.hackathon.persistence.StudyGroupRepository;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
@Slf4j
public class StudyGroupController {

	private final StudyGroupRepository studygroupRepository;

	@GetMapping("/studyGroup/{id}")
	public StudyGroup getStudyGroup(@PathVariable Long id) {
		return studygroupRepository.findByNo(id);
	}

	@GetMapping("/studyGroups")
	public List<StudyGroup> getStudyGroups(Pagination pagination) {
		return studygroupRepository
			.findAll(PageRequest.of(pagination.getPage(), pagination.getSize()))
			.getContent();
	}

	@PostMapping("/studyGroup")
	public ResponseEntity<String> addStudyGroup(@Valid @RequestBody StudyGroup studyGroup, BindingResult br) {
		if (br.hasErrors()) {
			return new ResponseEntity<>("Not valid params", BAD_REQUEST);
		}
		studygroupRepository.save(studyGroup);
		return new ResponseEntity<>("register success", OK);
	}

}
