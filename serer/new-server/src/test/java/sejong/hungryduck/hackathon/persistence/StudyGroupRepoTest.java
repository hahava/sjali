package sejong.hungryduck.hackathon.persistence;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import sejong.hungryduck.hackathon.model.StudyGroup;

@SpringBootTest
@Slf4j
public class StudyGroupRepoTest {

	@Autowired
	private StudyGroupRepository studyGroupRepository;

	@Ignore
	@Test
	public void addStudyGroupTest() {
		StudyGroup studyGroup = StudyGroup.builder()
			.name("user")
			.cellPhone("01000000000")
			.contents("contents")
			.major("major")
			.personel("personel")
			.title("title")
			.subject("subject")
			.build();
		studyGroupRepository.save(studyGroup);
		log.info(studyGroup.toString());
	}

	@Ignore
	@Test
	public void getStudyGroupTest() {
		StudyGroup studyGroup = studyGroupRepository.findByNo(1L);
		log.info(studyGroup.toString());
	}

	@Ignore
	@Test
	public void getStudyGroupsTest() {
		Pageable pageable = PageRequest.of(0, 2);
		studyGroupRepository.findAll(pageable).forEach(studyGroup -> {
			log.info(studyGroup.toString());
		});
	}
}
