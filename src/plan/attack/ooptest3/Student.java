package plan.attack.ooptest3;

public class Student {
    //利用自定义的构造函数，创建一个学生的类
    //同时，带参的构造函数应当包含对于年龄和分数的合理性判断
    private String name;
    private int age;
    private double score;
    //无参构造函数
    public Student() {
        System.out.println("已采用无参方案建立对象");
    }
    //带参构造函数
    public Student(String name, int age, double score) {
        this.name = name;
        //年龄的合理性判断
        if (age > 0 && age < 120) {
            this.age = age;
        }
        else {
            System.out.println("年龄不合法");
        }
        //分数的合理性判断
        if (score >= 0 && score <= 150) {
            this.score = score;
        }
        else {
            System.out.println("分数不合法");
        }
        System.out.println("已采用带参方案建立对象");
    }
    //记住，从此之后尽量采用this关键字！
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        //年龄的合理性判断
        if (age > 0 && age < 120) {
            this.age = age;
        }
        else {
            System.out.println("年龄不合法");
        }
    }
    public void setScore(double score) {
        //分数的合理性判断
        if (score >= 0 && score <= 150) {
            this.score = score;
        }
        else {
            System.out.println("分数不合法");
        }
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getScore() {
        return this.score;
    }
}
