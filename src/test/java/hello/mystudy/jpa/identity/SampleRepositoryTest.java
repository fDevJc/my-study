package hello.mystudy.jpa.identity;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class SampleRepositoryTest {
	@Autowired
	SampleRepository sampleRepository;

	@Autowired
	EntityManager em;

	@Test
	void test() {
		Sample sample = new Sample("sample1");

		Sample savedSample = sampleRepository.save(sample);

		Sample savedSample2 = sampleRepository.findById(savedSample.getId()).get();

		assertThat(sample).isEqualTo(savedSample);
		assertThat(sample).isEqualTo(savedSample2);

		int size1 = sampleRepository.findAll().size();
		System.out.println("size = " + size1);

		em.clear();
		em.flush();

		int size = sampleRepository.findAll().size();
		System.out.println("size = " + size);

		Sample savedSample3 = sampleRepository.findById(savedSample.getId()).get();
		assertThat(sample).isEqualTo(savedSample3);

	}
}