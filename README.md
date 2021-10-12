# K-Digital Credit <Java & Springboot로 시작하는 웹 프로그래밍> 최종 프로젝트

### 

### 1. 프로젝트명

패스트 서점에서 책을 관리, 판매하는 서비스를 만듭니다.



### 2. 프로젝트 설명

서점과 관련된 개념을 여러 개의 객체로 만들어 도메인에 대한 이해를 쌓고, 데이터를 처리하는 서비스의 개념을 학습합니다. 서점 재고 관리, 판매, 책 관리, 할인 정책 관리 등의 서비스를 개발하고 테스트합니다.



### 3. 프로젝트 과제 상세

|         기준         | 과제 상세                                                    |
| :------------------: | :----------------------------------------------------------- |
| Entity및 서비스 개발 | 1. 스프링 설정 파일, 엔티티, 레포지터리를 보고 이해합니다.   |
|                      | 2. 서비스 곳곳의 TODO로 비워진 부분을 1번에서 이해했던 엔티티, 레포지터리 통해 구현합니다. |
|   테스트 코드 작성   | 1. 주어진 엔티티에 관한 테스트를 보고 이해한 후, TODO로 비워진 테스트를 완성합니다. |
|                      | 2. 주어진 서비스에 관한 테스트를 보고 이해한 후, TODO로 비워진 테스트를 완성합니다. |



### 4. 점검 및 합격 기준표

#### Entity 및 서비스 개발

- [x] DiscountPolicy를 수정하여 DiscountPolicyTest를 성공시킨다.
- [x] BookSale을 수정하여 BookSaleTest를 성공시킨다.
- [x] BookInventoryService의 TODO를 구현한다.
- [x] BookSaleService의 TODO를 구현한다.
- [x] BookService의 TODO를 구현한다.

#### 테스트 코드 작성

- [x] BookInventoryServiceTest의 TODO를 구현한다.
- [x] BookSaleServiceTest의 TODO를 구현한다.
- [x] BookServiceTest의 TODO를 구현한다.



### 5. 테스트 실행 방법

```bash
./gradlew -x test build
```

