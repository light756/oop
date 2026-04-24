package plan.attack.ooptest3;

public class StudentTest2 {
    static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("无参张三");
        student1.setAge(17);
        student1.setScore(80);
        System.out.println("学生姓名：" + student1.getName() + "，年龄：" + student1.getAge()
                + "，分数：" + student1.getScore());
        Student student2 = new Student("有参张三", 18, 90);
        System.out.println("学生姓名：" + student2.getName() + "，年龄：" + student2.getAge()
                + "，分数：" + student2.getScore());
    }

}
