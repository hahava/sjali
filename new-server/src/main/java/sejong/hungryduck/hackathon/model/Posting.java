package sejong.hungryduck.hackathon.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Posting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	@NotNull
	private String mainTitle;
	@NotNull
	private String secondTitle;
	@NotNull
	private String host;
	@NotNull
	private String limitingCondition;
	@NotNull
	private String contents;
	@NotNull
	private String winnerPrize;
	@NotNull
	private String startDate;
	@NotNull
	private String endDate;
	@NotNull
	private String reception;
	@NotNull
	private String notice;
	@NotNull
	private String contact;

	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;

}
