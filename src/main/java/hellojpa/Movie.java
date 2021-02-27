package hellojpa;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Setter
public class Movie extends Item{
	private String director;
	private String actor;
}
