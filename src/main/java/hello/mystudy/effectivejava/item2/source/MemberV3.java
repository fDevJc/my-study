package hello.mystudy.effectivejava.item2.source;

/**
 * 빌더 패턴
 * (Builder Pattern)
 */
public class MemberV3 {
    //필수 매개변수
    private String name;
    private String mobilePhoneNumber;

    //선택 매개변수
    private String address;
    private String homePhoneNumber;
    private String hobby;

    public MemberV3(Builder builder) {
        this.name = builder.name;
        this.mobilePhoneNumber = builder.mobilePhoneNumber;
        this.address = builder.address;
        this.homePhoneNumber = builder.homePhoneNumber;
        this.hobby = builder.hobby;
    }

    public static class Builder {
        private final String name;
        private final String mobilePhoneNumber;

        //선택 매개변수
        private String address;
        private String homePhoneNumber;
        private String hobby;

        public Builder(String name, String mobilePhoneNumber) {
            this.name = name;
            this.mobilePhoneNumber = mobilePhoneNumber;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder homePhoneNumber(String homePhoneNumber) {
            this.homePhoneNumber = homePhoneNumber;
            return this;
        }

        public Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public MemberV3 builder() {
            return new MemberV3(this);
        }
    }

    void main() {
        MemberV3 member1 = new Builder("name", "010-0000-0000").address("address").builder();
        MemberV3 member2 = new Builder("name", "010-0000-0000").hobby("hobby").homePhoneNumber("02-000-0000").builder();
    }
}
