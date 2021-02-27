package hellojpa;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Setter
public class Book extends Item{
	private String author;
	private String isbn;
}
