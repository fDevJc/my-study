package hello.mystudy.jpa.nplusone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Team {
	@Id
	@GeneratedValue
	private Long id;

	private String teamName;

	// @Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "team_id")
	private List<Player> players = new ArrayList<>();

	public Team(String teamName, List<Player> players) {
		this.teamName = teamName;
		this.players = players;
	}
}
