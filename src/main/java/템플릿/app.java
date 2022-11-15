package 템플릿;

import 템플릿.teacher.JavaTeacher;
import 템플릿.teacher.PythonTeacher;
import 템플릿.teacher.Teacher;

public class app {

    public static void start(Teacher t) {
        t.수업시작();
    }

    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        start(t1);

        PythonTeacher p1 = new PythonTeacher();
        start(p1);
    }
}
