package hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Team extends BaseEntity{
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	@OneToMany(mappedBy = "team")
	private List<Member> memberList=new ArrayList<>();
}
