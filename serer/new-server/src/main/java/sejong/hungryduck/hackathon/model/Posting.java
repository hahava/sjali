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

<<<<<<< HEAD
	@NotNull
	private String mainTitle, secondTitle, host, limitingCondition, contents, winnerPrize, startDate, endDate, reception, notice, contact;

	private String imgPath="";
=======
	@Column(length = 1000, nullable = false)
	private String mainTitle, secondTitle, host, limitingCondition, contents, winnerPrize, startDate, endDate, reception, notice, contact;

	private String imgPath = "";
>>>>>>> develop

	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;

}
