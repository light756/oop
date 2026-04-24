package plan.attack.ooptest2;

public class StudentTest {
    static void main() {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setScore(70);
        System.out.println("学生姓名：" + student1.getName() + "，年龄：" + student1.getAge() + "，分数：" + student1.getScore());
        //第二次考试，进步10分
        student1.setScore(student1.getScore() + 10);
        System.out.println("第二次考试，张三获得了"+ student1.getScore());
        //错误赋值
        student1.setScore(-10);
        System.out.println("错误赋值，张三的分数为：" + student1.getScore());
        //第三次考试，张三进步35分
        student1.setScore(student1.getScore() + 35);
        System.out.println("第三次考试，张三获得了"+ student1.getScore());
        //最终，张三的信息为
        System.out.println("最终，张三的信息为：" + student1.getName() + "，年龄：" + student1.getAge()
                + "，分数：" + student1.getScore());
    }
}
