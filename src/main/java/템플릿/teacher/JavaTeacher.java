package 템플릿.teacher;

public class JavaTeacher extends Teacher {

    // 재정의
    void 강의하기() { // 동적바인딩
        System.out.println("Java 강의하기");
    }
}
