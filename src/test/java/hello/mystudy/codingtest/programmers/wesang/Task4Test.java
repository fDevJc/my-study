package hello.mystudy.codingtest.programmers.wesang;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/*

스냅샷 버전은 항상 비-스냅샷 버전보다 낮아야 합니다.
즉, 1.0.0-SNAPSHOT < 1.0.0입니다. 두 개의 주어진 버전에 대해서, 정수 비교에서 이.x > other.x 인 경우 이 버전이 더 크며, 같은 경우에는 이.y > other.y입니다.
또 같은 경우, 이.z > other.z입니다. x, y, z가 모두 같은 두 버전은 모두 같은 것으로 간주됩니다.
 */

class Task4Test {

	@Test
	public void compareVersion() {
		Version v1 = new Version("1.0.0");
		Version v2 = new Version("1.1.0");
		Version v3 = new Version("1.1.0-SNAPSHOT");
		Version v4 = new Version("1.1.1");
		Version v5 = new Version("1.1.1-SNAPSHOT");
		Version v6 = new Version("2.0.0");
		Version v7 = new Version("2.0.0-SNAPSHOT");

		assertThat(v1.compareTo(v2) < 0).isEqualTo(true);
		assertThat(v2.compareTo(v3) < 0).isEqualTo(false);
		assertThat(v3.compareTo(v4) < 0).isEqualTo(true);
		assertThat(v4.compareTo(v5) < 0).isEqualTo(false);
		assertThat(v5.compareTo(v6) < 0).isEqualTo(true);
		assertThat(v6.compareTo(v7) < 0).isEqualTo(false);
	}

	@Test
	public void acceptVersion() {
		List<String> versions = Arrays.asList("1", "1.2", "1.2.3", "1-SNAPSHOT", "1.2-SNAPSHOT", "1.2.3-SNAPSHOT");
		for (String version : versions) {
			assertThatCode(() -> new Version(version)).doesNotThrowAnyException();
		}
		assertThatCode(() -> new Version("1")).doesNotThrowAnyException();
	}

	@Test
	public void isSnapshot_true() {
		List<String> snapshotVersions = Arrays.asList("1-SNAPSHOT", "1.2-SNAPSHOT", "1.2.3-SNAPSHOT");
		for (String snapshotVersion : snapshotVersions) {
			Version version = new Version(snapshotVersion);
			assertThat(version.isSnapshot()).isEqualTo(true);
		}
	}

	@Test
	public void isSnapshot_false() {
		List<String> nonSnapshotVersions = Arrays.asList("1", "1.2", "1.2.3");
		for (String nonSnapshotVersion : nonSnapshotVersions) {
			Version version = new Version(nonSnapshotVersion);
			assertThat(version.isSnapshot()).isEqualTo(false);
		}
	}

	@Test
	public void errorVersionMustNotBeNull() {
		//when & then
		assertThatThrownBy(() -> new Version(null))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage(errorVersionMustNotBeNull);
	}

	@Test
	public void errorVersionMustMatchPattern() {
		List<String> errorVersions = Arrays.asList("X", "1.2.3.4.5", "1.2.3-SNAP");

		for (String errorVersion : errorVersions) {
			assertThatThrownBy(() -> new Version(errorVersion))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage(errorVersionMustMatchPattern);
		}
	}

	@Test
	public void errorOtherMustNotBeNull() {
		Version version = new Version("1");
		assertThatThrownBy(() -> version.compareTo(null))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage(errorOtherMustNotBeNull);
	}

	static final String errorVersionMustNotBeNull = "'version' must not be null!";
	static final String errorOtherMustNotBeNull = "'other' must not be null!";
	static final String errorVersionMustMatchPattern = "'version' must match: 'major.minor.patch(-SNAPSHOT)'!";
}