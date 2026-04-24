package plan.attack.ooptest2;

public class Student {
    private String name;
    private int age;
    private double score;
    public void setName(String str) {
        name = str;
    }
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
        else {
            System.out.println("年龄不合法");
        }
    }
    public void setScore(double score) {
        if (score >= 0 && score <= 150) {
            this.score = score;
        }
        else {
            System.out.println("分数不合法");
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getScore() {
        return score;
    }
}
