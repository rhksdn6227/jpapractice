package hellojpa;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
public class Album extends Item{
	private String artist;
}
