package plan.attack.ooptest2;

public class Student {
    private String name;
    private int age;
    private double score;
    public void setName(String str) {
        name = str;
    }
    public void setAge(int n) {
        if (n > 0 && n < 120) {
            age = n;
        }
        else {
            System.out.println("年龄不合法");
        }
    }
    public void setScore(double s) {
        if (s >= 0 && s <= 150) {
            score = s;
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
