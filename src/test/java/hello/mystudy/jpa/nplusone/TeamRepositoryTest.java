package hello.mystudy.jpa.nplusone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class TeamRepositoryTest {

	@Autowired
	TeamRepository teamRepository;

	@Autowired
	EntityManager em;

	@Test
	void test() {
		List<Player> playerList1 = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			playerList1.add(new Player("name" + i, i));
		}

		Team team = new Team("team1", playerList1);

		List<Player> playerList2 = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			playerList2.add(new Player("name" + i, i));
		}

		Team team2 = new Team("team2", playerList2);

		teamRepository.save(team);
		teamRepository.save(team2);

		em.flush();
		em.clear();

		List<Team> teams = teamRepository.findAll();

		for (Team team1 : teams) {
			String name = team1.getPlayers().get(0).getName();
			System.out.println("name = " + name);
		}
	}
}