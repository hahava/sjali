package sejong.hungryduck.hackathon.persistence;

import org.springframework.data.repository.PagingAndSortingRepository;
import sejong.hungryduck.hackathon.model.Postings;

public interface PostingsRepository extends PagingAndSortingRepository<Postings, Long> {

	Postings findByNo(Long no);

}
