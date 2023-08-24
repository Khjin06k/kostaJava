package practice.chap7;

public class P6 {
    // 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
    // 조상 클래스에서 이미 생성자가 있다면 해당 생성자를 호출해서 자손 클래스의 생성자를 만들 때 활용하여 코드를 조금 더 간단하게 만들 수 있음
    // new에 의해 메모리 생성 직후에 생성자가 호출이 됨. 초기화 코드를 넣기 때문에 자식 객체는 부모를 포함해서 자식 객체를 생성하면 부모 객체도 생성됨
    //
}
