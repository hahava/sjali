package sejong.hungryduck.hackathon.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Postings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	private String mainTitle;
	private String secondTitle;
	private String host;
	private String limitingCondition;
	private String contents;
	private String winnerPrize;
	private String startDate;
	private String endDate;
	private String reception;
	private String notice;
	private String contact;

	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;

}
