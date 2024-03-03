package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address() {

    }

    // 값 타입은 변경 불가능하게 설계해야 함
    // @Setter를 제거하고, 생성자를 통해서 값을 초기화하도록 한다 -> 변경 불가능한 클래스
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

}
