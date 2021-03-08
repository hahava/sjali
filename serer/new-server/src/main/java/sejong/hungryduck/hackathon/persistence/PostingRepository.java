package sejong.hungryduck.hackathon.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import sejong.hungryduck.hackathon.model.Posting;

public interface PostingRepository extends PagingAndSortingRepository<Posting, Long> {
	Posting findByNo(Long no);
}
