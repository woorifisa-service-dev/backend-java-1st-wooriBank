# java-01-wooribank

## 우리은행 대출, 예금 업무 구현 프로그램
WOORI FISA에서 Java를 학습하며 간단한 은행 업무 상황을 구현해보았습니다.

<img width="80%" src="https://simg.wooribank.com/img/section/bp/img_adcenter_logo05.gif"/>

## 팀 소개

| Developoer | Developoer | Developer |
| :-: | :-: | :-: |
| <img src="https://avatars.githubusercontent.com/u/63109802?v=4" alt="백재원_프로필이미지" width="150" height="150"> | <img src="https://avatars.githubusercontent.com/u/116792686?v=4" alt="정민성_프로필이미지" width="150" height="150" /> | <img src="https://avatars.githubusercontent.com/u/61819350?v=4" alt="김승연_프로필이미지" width="150" height="150"> |
| 백재원  |  정민성 | 김승연 |
<br>
## 프로젝트 소개
은행의 대출, 예금 업무를 Java로 간단히 구현한 프로젝트입니다.<br>

## 프로젝트 UML

<img width="80%" src="https://github.com/woorifisa-service-dev/java-01-wooribank/blob/main/img/wooriBankUML.png"/>

<br>
프로젝트의 로직은 다음과 같습니다.
<br>
1. 손님이 입장한다. (손님 객체 생성)<br>
2. 손님이 업무(대출 or 예금)를 고른다.<br>
3. 번호표를 뽑는다.<br>
4. 창구가 비었는지 확인한다.<br>
5. 창구가 비었다면 손님을 부른다.<br>
6. 손님이 원하는 업무를 진행한다.<br>
7. 업무가 끝나면 손님의 잔액을 출력해준다.<br>


# Stacks
<br>

## Environment
<br>

<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<br><br>

## Development
<br>

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">

<br><br>


## 배운 점
- 페어 프로그래밍을 통해 static final과 final의 차이점, 추상 클래스에 대한 이해를 할 수 있는 시간이었다.<br>

## 향후 보완하고 싶은 점
- 추상 클래스를 만들 때 필드를 private으로 선언하면 자식 객체에 상속이 되지 않아 setter, getter 함수를 선언해줘야 했다. 이 부분을 protect 선언으로 변경해서 리팩토링해보고 싶다.<br>
- 시간적 제약으로 시나리오 기반의 상황만 구현했지만, 향후 정반복문을 사용해 은행 업무 프로그램을 완성시켜보고 싶다.<br>
- 예외처리 기능 추가<br>




