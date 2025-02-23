package midtermsjava;

public class Person {
	
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    
   
    public static void main(String[] args) {

        Person person1 = new Person("Lovely", 25, "123 Seoul, Korea");
        Person person2 = new Person("Bashful", 30, "455 Osaka, Japan");
        Person person3 = new Person("Sadness", 22, "789 Busan, Korea");
        Person person4 = new Person("General", 28, "321 Manila, Philippines");
        Person person5 = new Person("Grumpy", 35, "654 Tokyo, Japan");

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Address: " + person1.getAddress());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Address: " + person2.getAddress());
        System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Address: " + person3.getAddress());
        System.out.println("Name: " + person4.getName() + ", Age: " + person4.getAge() + ", Address: " + person4.getAddress());
        System.out.println("Name: " + person5.getName() + ", Age: " + person5.getAge() + ", Address: " + person5.getAddress());
    }
}
