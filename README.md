## 전략패턴
객체들이 할 수 있는 클래스를 생성하고, 유사한 행위들을 캡슐화 하는 인터페이스를 정의해서,<br>
객체들의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고, 전략만 수정함으로써<br>
행위를 유연하게 변경 및 확장하는 것을 의미한다.<br>

## 프록시패턴
어떤 객체에 대한 접근을 제어하는 용도로 대리인이나 대변인에 해당하는 객체를 제공하는 패턴이다.<br>
실제 객체를 수행하기 전에 전처리를 하거나 기본 객체를 캐싱할 수 있다<br>
실제 객체를 수정하지 않고 추가적인 기능을 삽입할 수 있다.<br>

## 어댑터패턴
관계가 없는 인터페이스 간 같이 사용할 때 사용한다.<br>
한 클래스의 인터페이스를 사용하고자 하는 다른 인터페이스로 변환할 때 주로 사용한다.<br>
이를 이용하면 인터페이스 호환성이 맞지 않아 같이 쓸 수 없는 클래스를 연관 관계로 연결해서 사용할 수 있다.<br>

## 싱글톤패턴
객체의 인스턴스가 오직 1개만 생성되는 패턴이다.<br>
메모리 낭비를 하지 않는 것과 다른 클래스 간에 데이터 공유가 용이하다는 것이 장점이다.<br>
다른 클래스간의 결합도가 높아져 개방-폐쇄의 원칙에 위배되며, 결합도가 높아질수록 유지보수 및 테스트가 힘들다는 것이 단점이다<br>

## 템플릿 메소드 패턴
특정 작업을 처리하는 일부분을 서브 클래스로 캡슐화하여 전체적인 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내용을 바꾸는 패턴이다.<br>
중복코드를 줄일 수 있고, 자식 클래스의 역할을 줄여 핵심 로직의 관리가 용이하며, 조금 더 객체지향적인 코드를 구성할 수 있는 것이 장점이다.<br>
추상 메소드가 많아지면 클래스 관리가 복잡해지고, 코드가 꼬일 염려가 있는 것이 단점이다.<br>

## 데코레이트 패턴
객체의 결합을 통해 기능을 확장할 수 있게 해주는 패턴<br>
기본 기능에 추가할 수 있는 기능의 종류가 많은 경우에 각 추가 기능을 데코레이트 클래스로 정의 한 후<br>
필요한 데코레이트 객체를 조합해서 추가 기능을 설계하는 방식<br>

