public class PATIENT {
    private String name;
    private double height;
    private double weight;
    private char sex;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PATIENT(String name, double height, double weight, char sex, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public PATIENT() {
    }
}
