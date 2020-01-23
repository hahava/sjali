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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudyGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	@NotNull
	private String title;
	@NotNull
	private String subject;
	@NotNull
	private String personel;
	@NotNull
	private String contents;
	@NotNull
	private String name;
	@NotNull
	private String major;
	@NotNull
	private String cellPhone;

	@CreationTimestamp
	private LocalDateTime creationTime;

	@UpdateTimestamp
	private LocalDateTime updateTime;
}
