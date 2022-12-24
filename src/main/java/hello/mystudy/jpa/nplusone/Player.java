package hello.mystudy.jpa.nplusone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Player {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private Integer backNumber;

	public Player(String name, Integer backNumber) {
		this.name = name;
		this.backNumber = backNumber;
	}

	public String getName() {
		return this.name;
	}
}
