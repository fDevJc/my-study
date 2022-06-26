package hello.mystudy.jpa.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
/*
- 붙은 클래스는 JPA가 관리, 엔티티라 함.
- 기본 생성자 필수 !!!!!
- final 클래스, enum, interface, inner 클래스 사용 X
- 저장할 필드에 final 사용 X
- 속성: name
    - JPA에서 사용할 엔티티 이름을 지정
    - 기본값: 클래스 이름을 그대로 사용
    - 같은 클래스 이름이 없으면 가급적 기본값을 사용
 */
@Table
/*
- 속성
    - name: 매핑할 테이블 이름
    - catalog: 데이터베이스 catalog 매핑
    - schema: 데이터베이스 schema 매핑
    - uniqueConstraints(DDL): DDL 생성 시에 유니크 제약 조건 생성
 */
public class HelloEntity {
    @Id
    private Long id;

    @Column(name = "name")
    /*
    name
    insertable or updatable
    nullable
    unique
    columnDefinition
    length
    precision or scale
     */
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    /*
    이넘사용할때 기본이 EnumType.ORDINAL 인데 사용하지마라!!!!!
    순서를 데이터베이스에 저장한다.
     */
    private RoleType roleType;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Transient
    //테이블에 컬럼을 추가 하는게 아니라 메모리상 필요한경우 추가
    private String temp;

    @Lob
    //큰 컨텐츠 clob or blob
    private String description;

}
