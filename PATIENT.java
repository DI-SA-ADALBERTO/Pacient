public class PATIENT {
    private String name;
    private double height;
    private double weight;
    private char sex;
    private int age;

    public PATIENT(String name, char sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

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


    public PATIENT() {
    }
    public void imc(){
        double imc=getWeight()/(getHeight()*getHeight());
        if ((imc<18.50) || (imc <24.99)){
            System.out.println("Peso normal"
                    +"\nIMC obtenido:"+imc
                    +"\nnombre:"+getName());
        }else if((imc<25.00) || (imc<29.99)){
            System.out.println("esta en sobrepeso;"
                    +"\nIMC obtenido:"+imc
                    +"\nname"+getName());
        }
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
}


