package sejong.hungryduck.hackathon.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import sejong.hungryduck.hackathon.model.StudyGroup;

public interface StudyGroupRepository extends PagingAndSortingRepository<StudyGroup, Long> {
	StudyGroup findByNo(Long no);
}
