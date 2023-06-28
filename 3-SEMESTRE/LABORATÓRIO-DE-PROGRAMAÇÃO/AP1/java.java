// trecho1
public class Shape {
    protected double area;

    public Shape() {
        this.area = 0;
    }

    public void calculateArea() {
        System.out.println("Calculating the area of the shape.");
    }
}

public class Circle extends Shape {
    private double radius;

   public Circle(double radius) {
   super();
   this.radius=radius;
   }

   public void calculateArea() {
    this.area = Math.PI *Math.pow(radius,2);
    System.out.println("The area of the circle is: " + area);
   }
}


// trecho2
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("the animal makes a sound!");
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("the dog barks.");
    }
}

// trecho3

public class person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("h, mu name is " + name + ".");
    }
}

public class Student extends Person {
    private int grade;

    public Stundent(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("hi, my name is " + name + "and I in grade " + grade + ".");
    }
}

// trecho4
public class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("the car is driving");
    }
}

public class Bicycle extends Car {
        public Bicycle(String brand){
            super(brand);
        }

        public void drive() {
            System.out.println("the car is driving");
        }
    }


    // questao2

    //exerc1
    public class Animal{
        protected String nome;

        public Animal(String nome){
            this.nome = nome;
        }

        public void emitirSom(){
            System.out.println("O animal emite o som.");
        }

        public void emitirSom(String som){
            System.out.println("O animal emite o som. " + som);
        }
    }


    //exerc2

    public class Calculadora {
        public int somar (int a, int b){
            return a + b;
        }

        public double somar(double a, double b){
            return a + b;
        }

        public int somar(int a, int b, int c){
            return a + b + c;
        }
    }

    //exerc3

    public class Figura {
        protected double area;
        public void calcularArea(double lado){
            this.area = Math.pow(lado, 2);
            System.out.println("A area do quadrado é: " + area);
        }

        public void calcularArea(double base, double altura){
            this.area = base * altura / 2;
            System.out.println("A area do triangulo é: " + area);
        }

        public void calcularArea(double raio){
            this.area = Math.PI * Math.pow(raio, 2);
            System.out.println("A Area do circulo é: " + area);
        }
    }

    //exerc4

    public class Pessoa {
        private String nome;

        public Pessoa(String nome){
            this.nome = nome;
        }

        public void apresentar(){
            System.out.println("oi, meu nome é " + nome + ".");
        }

        public void apresentar(String saudacao){
            System.out.println(saudacao + ", meu nome é " + nome + ".");
        }
    }