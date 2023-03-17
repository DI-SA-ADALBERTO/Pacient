
public class TestPatient {

        private String name;
        private double height;
        private double weight;
        private char sex;
        private int age;

        public void paciente (String name, double height, double weight, char sex, int age) {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
            this.age = age;
        }

        public String getname() {
            return name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public double getheight() {
            return height;
        }

        public void setheight(double height) {
            this.height = height;
        }

        public double getweight() {
            return weight;
        }

        public void setweigt(double weight) {
            this.weight = weight;
        }

        public char getsex() {
            return sex;
        }

        public void setsex(char sex) {
            this.sex = sex;
        }

        public int getage() {
            return age;
        }

        public void setage(int age) {
            this.age = age;
        }

        /**
         * Muestra por consola todos los datos del Paciente
         */
        public void mostrar() {
            System.out.println("\n\t---------------");
            System.out.println("Name: " + name);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Sex: " + sex);
            System.out.println("Age: " + age);
            System.out.println("\t---------------");
        }
    }

