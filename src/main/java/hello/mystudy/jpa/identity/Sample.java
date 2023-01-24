package hello.mystudy.jpa.identity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Sample {
	@Id @GeneratedValue
	private Long id;

	private String name;

	public Sample(String name) {
		this.name = name;
	}

	public Long getId() {
		return this.id;
	}
}
