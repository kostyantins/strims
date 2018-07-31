package eleks_academy_java;

public class ClassAndObject {

    public class Human {

        private String sex;
        private String name;
        private int age;

        public Human() {
        }

        public Human(String sex, String name, int age) {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public class Male {
            Human male = new Human("male", "Chandler", 25);
        }

        public class Female {
            Human female = new Human("female", "Monica", 20);
        }
    }
}
