package sejong.hungryduck.hackathon.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import sejong.hungryduck.hackathon.model.Pagination;
import sejong.hungryduck.hackathon.model.StudyGroup;
import sejong.hungryduck.hackathon.persistence.StudyGroupRepository;

import java.util.List;

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
	public void addStudyGroup(StudyGroup studyGroup) {
		studygroupRepository.save(studyGroup);
	}

}
