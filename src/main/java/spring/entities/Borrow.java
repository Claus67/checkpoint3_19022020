package spring.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Borrow {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	LocalDateTime date;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	Person person;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	Book book;

}
