package hello.mystudy.codingtest.programmers.wesang;

public class Version {
	private String version;

	public Version(String version) {
		if (version == null) {
			throw new IllegalArgumentException("'version' must not be null!");
		}
		this.version = version;
	}

	public int compareTo(Object o) {
		if (o == null) {
			throw new IllegalArgumentException("'other' must not be null!");
		}
		return 0;
	}

	public boolean isSnapshot() {
		return true;
	}
}
