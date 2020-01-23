package sejong.hungryduck.hackathon.persistence;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import sejong.hungryduck.hackathon.model.Posting;

@SpringBootTest
@Slf4j
public class PostingRepoTest {

	@Autowired
	private PostingRepository postingRepository;

	@Ignore
	@Test
	public void addPostingTest() {
		Posting posting = Posting.builder()
			.contact("contact")
			.contents("contents")
			.startDate("startDate")
			.endDate("endDate")
			.host("host")
			.notice("notice")
			.mainTitle("mainTitle")
			.limitingCondition("limitingCondition")
			.secondTitle("secondTitle")
			.reception("reception")
			.winnerPrize("winnerPrize")
			.build();
		postingRepository.save(posting);
	}

	@Ignore
	@Test
	public void getPosting() {
		Posting posting = postingRepository.findByNo(1L);
		log.info(posting.toString());
	}

	@Ignore
	@Test
	public void getPostings() {
		Pageable pageable = PageRequest.of(0, 2);
		postingRepository.findAll(pageable).forEach(posting -> {
			log.info(posting.toString());
		});
	}

}
