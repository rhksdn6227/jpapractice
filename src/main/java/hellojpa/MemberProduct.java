package hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MemberProduct {
	@Id
	@GeneratedValue
	private String id;

	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;

	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	private int amount;
	private LocalDateTime orderDateTime;
}
