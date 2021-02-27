package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member extends BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;

	@OneToOne
	@JoinColumn(name="locker_id")
	private Locker locker;

	@OneToMany(mappedBy = "member")
	private List<MemberProduct> memberProductList=new ArrayList<>();
}
