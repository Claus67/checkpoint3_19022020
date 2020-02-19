package spring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Library {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Lob
	private String address;

	@ManyToMany 
	@JoinTable(name = "library_book", 
		joinColumns = @JoinColumn(name = "library_id"), 
		inverseJoinColumns = @JoinColumn(name = "book_id")) 
	private List<Book> books = new ArrayList<>();

}
