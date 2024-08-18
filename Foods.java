/*import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter x value");
        x=scanner.nextDouble();
        System.out.print("enter y value");
        y=scanner.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.print(z);
        scanner.close();
    }
}*/

/* 
import java.util.Random;
public class triangle {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt();
        System.out.println(x);
    }
}*/


/*public class triangle{
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0]="BMW";
        cars[0][1]="Hero";
        cars[0][2]="Suziki";
        cars[1][0]="Maruti";
        cars[1][1]="Odde";
        cars[1][2]="HondA";
        cars[2][0]="Tata";
        cars[2][1]="Tvs";
        cars[2][2]="Ola";

        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }
        String name ="Sampath";
        //boolean result=name.equals("Sampath");    "compares strings
       // char result=name.charAt(0);               specifies index of the charcter
       //int result = name.indexOf("t");      find out the index"
       //String result=name.toUpperCase();
       String result=name.replace('S','M');

        System.out.print(result);
        Boolean b="true";           "wrapper class"
        Character c="@";
        Integer d=123;
    }
}*/
/* 
import java.util.ArrayList;

public class triangle{
    public static void main(String[] args) {
        ArrayList<String>food=new ArrayList<String>();         "ArrayList"
        food.add("pizza");
        food.add("chicken-fry");
        food.add("Ice-cream");
        food.set(0,"KFC");
        food.remove(2);
        food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}*/
/* 
import java.util.ArrayList;

public class triangle{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>groceryList = new ArrayList<>();

        ArrayList<String> BakeryList=new ArrayList<>();     "2D ArrayLIst"
        BakeryList.add("Milk shakes");
        BakeryList.add("chokolates");
        BakeryList.add("cakes");

        ArrayList<String> ProductList=new ArrayList<>();
        ProductList.add("Bikes");
        ProductList.add("Bicycles");
        ProductList.add("cars");

        ArrayList<String> drinkList=new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coka-cola");
        drinkList.add("thumbs-up");

        groceryList.add(BakeryList);
        groceryList.add(ProductList);
        groceryList.add(drinkList);
        System.out.println(groceryList.get(1).get(0));



    }
}*/
/* 
import java.util.ArrayList;

public class triangle{
    public static void main(String[] args) {
        String [] animals = {"cat","brid","cow","dog"};
        for(String i : animals){
            System.out.println(i);
        }
        ArrayList<String>animals=new ArrayList<String>();
        animals.add("brid");                                      //for-each loop
        animals.add("parrot");
        animals.add("dog");
        for(String i:animals){
            System.out.println(i);
        }
    }
}*/

/* 
public class triangle{
    public static void main(String[] args) {                      // method
        String name="Sampath";
        int age=21;
        String work="JAVA";
        method(name,age,work);
    }
    static void method(String name,int age,String work){
        System.out.println(name+" "+age+" "+work);
        int x=5;
        int y=4;
        int z = add(x,y);
        System.out.println(z);
    }
    static int add(int x,int y){
        int z=x+y;
        return z;
    }
}*/
/* 
public class triangle{
    public static void main(String[] args) {                            "Method overloaded"
        int x = add(1,2,5,7);
        System.out.print(x);
    }
    static int add(int a,int b){
        System.out.println("this method #1");
        return a + b;             " Method overloading allows you to define multiple methods 
                                   with the same name but with different parameter lists in the same class.""
    }
    static int add(int a,int b,int c){
        System.out.println("this method #2");
        return a + b + c;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("this method #3");
        return a + b + c + d;
    }
}*/

/*public class triangle{
    public static void main(String[] args) {
        //System.out.printf("iam %d Sampath ",123);
        final double pi = 3.12343;
       // pi = 12;
        System.out.println(pi);
    }
}*/

/*public class Car{
   
        String name ="BMW";                                 // "Attritubes/properties"
        String model ="BMW-model";
        int year =2023;
        double price=50000.00;

        void drive(){
            System.out.println("you drive the car");                 //  "Methods/Behaviour"
        }
        void brake(){
            System.out.println("you step on brakes");
        }
}
*/


/*public class human{
    String name;                                        //properties of the class
    int age;                                                      
    double weight;

    human(String name,int age,double weight){                      //constructor
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void eat(){
        System.out.println(this.name+"is eating");
    }
    void drink(){
        System.out.println(this.name+"is drinking");
    }
}*/

/*import java.util.Random;
public class DiceRoller{
    public static void main(String[] args) {
        
    
    Random random;
    int number;

    DiceRoller(){
        random=new Random();
        
        roll();
    }
    }
    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }

}*/
/* 
import java.util.Random;

public class DiceRoller {
    // Instance variables
    Random random;
    int number;

    // Constructor                                                    //CALLED MAIN METHOD 
    DiceRoller() {
        random = new Random();
        roll();
    }

    // Method to roll the dice
    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of DiceRoller
        new DiceRoller();
    }
}*/

/*public class Pizza{
    String bread;        
    String sauce;                                     //overload constructor---arugments pass to main class
    String cheese;
    String topping;

    Pizza(String bread,String sauce,String cheese,String topping){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;
        this.topping=topping;

    }
    Pizza(String bread,String sauce,String cheese){
        this.bread=bread;
        this.sauce=sauce;
        this.cheese=cheese;  
    }
    Pizza(String bread){
        this.bread=bread;
    }
}*/
/*public class Car{                                  //toString()
    String name="ODDY";
    String model="TATA";
    int year=1990;
    public String toString (){
        return name+"\n"+model+"\n"+year;
    }
}*/
/*class Food {
    String name;
    Food(String name){
        this.name=name;
    }
}
public class Foods{                                          //"Arrays of objects"
    public static void main(String[] args) {
        Food[] refrigerator =new Food[4];
        Food food1=new Food("Pizza");
        Food food2=new Food("Samosa");
        Food food3=new Food("rice");
        Food food4=new Food("water");

        refrigerator[0]=food1;
        refrigerator[1]=food2;
        refrigerator[2]=food3;
        refrigerator[3]=food4;
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
        System.out.println(refrigerator[3].name);
    }
}*/

/*class Car{
    String name;                                                      //"Object passing"
    Car(String name){
        this.name=name;
    }
}

class Garage {
    void park( Car car){
        System.out.println("the car "+car.name+" is parked in the garage");
    }
}
public class Foods{
    public static void main(String[] args) {
        Car car=new Car("BMW");
        Garage garage=new Garage();

        garage.park(car);
    }
}*/
/*class Friend{
    String name;                                     //static keyword
    static int numberOfFriend;
    Friend(String name){
        this.name=name;
        numberOfFriend++;
    }
    static void displayFriends(){
        System.out.println("you have "+numberOfFriend+" friends");
    }
}
public class Foods{
    public static void main(String[] args) {
        Friend friend1=new Friend("rohith");
        Friend friend2=new Friend("rohith");
        Friend friend3=new Friend("rohith");
        Friend.displayFriends();
    }
}*/
/*class Vehcile{                                               //"Inheritance"
    double speed;
    void go(){
        System.out.println("vehcile is moving");
    }
    void stop(){
        System.out.println("you vehcile is stopped");
    }
}
class Car extends Vehcile{
    int doors=4;
    String model="BMW";
}
class Bicycle extends Vehcile{
    int wheels=2;
    String name="Gear-cycle";

}
public class Foods{
    public static void main(String[] args) {
        Vehcile vehcile=new Vehcile();
        Car car=new Car();
        car.go();
        Bicycle bicycle=new Bicycle();
        bicycle.stop();
        System.out.println(car.model);
        System.out.println(bicycle.speed);
        System.out.println(bicycle.name);
        System.out.println(vehcile.speed);
    }
}*/
/*class Dog extends Animal{                                           //method overriding
    void speak(){
        System.out.println("dog was *brake*");
    }
}
class Animal{
    //@overriding
    void speak(){
        System.out.println("the Animal speaks");
    }

}
public class Foods{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.speak();
        
    }
}*/
/*class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;

    }
}
class Hero extends Person{
    String power;                                             //"Super keyword"
    Hero(String name,int age,String power){
        super(name,age);
        this.power=power;
    }
}
public class Foods{
    public static void main(String[] args) {
        Person person=new Person("rohith",20);
        Hero hero1=new Hero("sampath",21, "coding");
        System.out.println(hero1.name +" "+ hero1.age +" "+ hero1.power );
       System.out.println(person.name +" "+ person.age );
    }
}*/

/*abstract class Vehcile{        //Abstract--Abstract classes can't instantiated,but they can have a subclass 
    abstract void go();              //      abstract methods are declared without an implementation

}
class Car extends Vehcile{
    void go(){
        System.out.println("I Love BMW Car");
    }

}
public class Foods {
    public static void main(String[] args) {
        //Vehcile vehcile=new Vehcile();
        Car car=new Car();
        car.go();
    }
}*/
/*class c{                                                           Access modifier
    public String publicMessage="This public message";
    protected String protectedMessage= "This protected message";
    String defaultMessage= "This default message";
    private String privateMessage= "This private message";
}*/
 
/*class Car{
    private String name;
    private String model;
    private int year;
    Car(String name,String model,int year){ 

        //this.name=name;
        //this.model=model;
        //this.year=year;

        this.setName(name);
        this.setModel(model);
        this.setYear(year);
    }
    public String getName(){            //getter methods
        return name;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){      //setter methods
        this.name=name;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void copy(Car x){
        this.setName(x.getName());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
                                 //encapsulation--ensuring that the internal representation of the object is hidden from
                                        // outside code and can only be accessed and modified through these methods.
public class Foods{
    public static void main(String[] args) {
        Car car1=new Car("BMW","Japan", 1990);
        Car car2=new Car("Oddy", "Indoisa", 2011);

        car2.copy(car1);
        //car.setModel("Max of BMW");
        //car.setName("Benchcar");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        
    }
}*/
/*class Rabbit implements Prey{                    //interface
    public void flee(){
        System.out.println("the rabbit is feeling");
    }

}
class Fish implements Prey,Predator{
    public void flee(){
        System.out.println("the Fish is feeling");
    }
    public void hunt(){
        System.out.println("fish  is hunting small fishes");
    }

}
class Hawk implements Predator{
    public void hunt(){
        System.out.println("Hawk is hunting");
    }
}
interface Prey {
    void flee();
}
interface Predator {
    void hunt();
}
public class Foods{
    public static void main(String[] args) {
        Rabbit r=new Rabbit();
        r.flee();
        Hawk h=new Hawk();
        h.hunt();
        Fish f=new Fish();
        f.flee();
        f.hunt();
    }
}*/
/*class Vehcile{
    public void go(){                    //polymorhism

    };

}
class Car extends Vehcile{
    public void go(){
        System.out.println("the car becomes moving");
    }
}
class Bicycle extends Vehcile{
    public void go(){
        System.out.println("the bicycle becomes moving");
    }
}
class Boat extends Vehcile{
    public void go(){
        System.out.println("the boat becomes moving");
    }
}
public class Foods{
    public static void main(String[] args) {
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat=new Boat();

        Vehcile [] racer= {car,bicycle,boat};
        for(Vehcile x : racer){
            x.go();
        }
        
    }
}*/

/*import java.util.Scanner;

class Animal{                                         //Dynamic polymorhism
    public void speak(){
        System.out.println("*brrw");
    }

}
class Cat extends Animal{
    public void speak(){
        System.out.println("*meyyyooo*cat");
    }

}
class Dog extends Animal{
    public void speak(){
        System.out.println("*brake*Dog");
    }
}
public class Foods{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Animal animal;
        System.out.println("what animal do u want??");
        System.out.print("(1 =Dog) or (2=Cat) :");
        int choice=scanner.nextInt();
        if(choice==1){
            animal=new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal=new Cat();
            animal.speak();
        }
        else {
            animal=new Animal();
            System.out.println("that choice is invalid");
            animal.speak();
        }
    }
}*/
import java.util.Scanner;
public class Foods{
    public static void main(String[] args) {
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter a whole number divde: ");
            int x=scanner.nextInt();
            System.out.print("Enter a whole number divde by: ");
            int y=scanner.nextInt();
            int z=x/y;
            System.out.print("result: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("you can't divide by zero! Error");
        }
    }
}