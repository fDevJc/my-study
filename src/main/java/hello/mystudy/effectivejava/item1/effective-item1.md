# 이펙티브자바 / 아이템1 / 생성자 대신 정적 팩터리 메서드를 고려하라

# 팩터리 메서드가 생성자보다 좋은 장점 다섯가지

## 1.이름을 가질 수 있다.

- 생성자 자체만으로는 반환될 객체의 특성을 제대로 설명하지 못한다.

```java
void 이름을_가질수있다() {
		//반환될 동물의 특성을 알 수 없다.
    Animal animal = new Animal();
		//반환될 동물의 특성을 알 수 있다.
    Animal swimAbleAnimal = Animal.swimAbleAnimal();
}
```

- 하나의 시그니처로 생성자는 하나만 만들 수 있지만 정적 팩터리 메서드에는 제약이 없다.

```java
public Animal(String name) {
    this.name = name;
}
//컴파일 에러 발생
public Animal(String hometown) {
		this.hometown = hometown;
}

public static Animal getAnimalByName(String name) {
        Animal animal = new Animal();
        animal.setName(name);
        return animal;
}

public static Animal getCatByHometown(String hometown) {
        Animal animal = new Animal();
        animal.setHometown(hometown);
        return animal;
}
```

## 2.호출될 때마다 인스턴스를 새로 생성하지는 않아도 된다.

- 이 덕분에 불변클래스(아이템17, 추후 정리 예정)는 인스턴스를 미리 만들어 놓거나 새로 생성한 인스턴스를 캐싱하여 재활용하는 식으로 불필요한 객체 생성을 피할 수 있어 객체 생성 비용을 아낄 수 있다.
- 플라이웨이트 패턴[Gamma95](추후 정리 예정)과 비슷한 기법

```java
@HotSpotIntrinsicCandidate
public static Boolean valueOf(boolean b) {
    return (b ?TRUE:FALSE);
}
```

- 인스턴스를 철저히 통제할 수 있다. 이런 클래스를 인스턴스통제(instance-controlled) 클래스라 한다.
- 인스턴스를 통제할경우
    - 클래스를 싱글턴(아이템3, 추후 정리 예정)으로 만들 수 있다.
    - 인스턴스화 불가(아이템4, 추후 정리 예정)으로 만들 수도 있다.
    - 불변 값 클래스(아이템17, 추후)에서 동치인 인스턴스가 단 하나임을 보장할 수 있다.

## 3.반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.

```java
public class Cat extends Animal{}
public class Dog extends Animal{}

public static Animal getCat() {
    return new Cat();
}

public static Animal getDog() {
    return new Dog();
}
```

- 반환할 객체의 클래스를 자유롭게 선택할 수 있어 엄청난 유연성을 선물한다.
- 이는 인터페이스 기반 프레임워크(아이템20, 추후)를 만드는 핵심 기술이다.
- 참고 - 자바8에서는 인터페이스 public 정적 멤버만 허용
          자바9에서는 인터페이스 private 정적 멤버까지 허용

## 4.입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.

```java
public static Dog getDogByAge(int age) {
    if (age > 5) {
        return new OldDog();
    }
    return new YoungDog();
}
```

- 책에서는 EnumSet 클래스(아이템36, 추후)의 예를 사용했다.

## 5.정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.

```java
public class Animal {
		private Cow cow;
		
		public void setCow(Cow cow) {
		    this.cow = cow;
		}
		
		public Cow getCow() {
		    return cow;
		}
}
```

- 적절한 예인지 모르겠다, DI 프레임워크를 생각하면 편하게 이해될 듯 하다.
- 리플렉션(아이템65, 추후)
- 브리지 패턴[Gamma95](추후)
- 위의 아이템과 패턴을 더 깊게 이해하면 더 좋은 예시를 만들어 보겠다.

# 팩터리 메서드의 단점

## 1. 정적 팩토리만을 제공하면 하위 클래스를 만들 수 없다.

- private 생성자는 하위 클래스를 만들 수 없다.
- 어찌 보면 이 제약은 상속보다 컴포지션 사용(아이템18, 추후) 하도록 유도하고
불변타입(아이템17, 추후)으로 만들려면 이 제약을 지켜야한다는 점에서 장점일 수 있다.

## 2. 이름이 난해할 경우 인스턴스 방법을 찾기 귀찮다.

- 명명 규칙이 잘 협의가 된다면 크게 단점이 아닌거 같다.

# 정리

- 생성자와 정적 팩토리 메서드는 각자의 쓰임새가 있으니 이해하고 사용하자.
- 무작정 public으로 생성자를 작성하던 습관은 버리자.

- 책정리에서도 나와있듯 무지성 public 생성자 작성보다는
해당 아이템을 생각하여 고려해보자.