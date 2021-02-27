package hellojpa;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public abstract class Item extends BaseEntity{
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private int price;

}
