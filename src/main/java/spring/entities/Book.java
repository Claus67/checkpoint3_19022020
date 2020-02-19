package spring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String author;
	
	@OneToMany (mappedBy = "book")
	private List<Person> person = new ArrayList<>();
	
	@OneToMany(mappedBy = "book")
	private List<Borrow> borrows = new ArrayList<>();
	
	@ManyToMany(mappedBy = "books")
	private List<Library> libraries = new ArrayList<>();

}
