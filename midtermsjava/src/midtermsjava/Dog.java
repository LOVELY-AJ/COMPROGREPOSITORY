package midtermsjava;

public class Dog {
 private String name;
 private String breed;

 public Dog(String name, String breed) {
     this.name = name;
     this.breed = breed;
 }

 public String getName() {
     return name;
 }

 public String getBreed() {
     return breed;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setBreed(String breed) {
     this.breed = breed;
 }

 public static void main(String[] args) {

	 Dog dog1 = new Dog("Pomie", "Pomeranian");
     Dog dog2 = new Dog("Kenshin", "Dachshund mix Shih Tzu");

     System.out.println("Initial Values:");
     System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
     System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

     dog1.setName("Pomie");
     dog1.setBreed("Pomeranian cutie");

     dog2.setName("Kenshin");
     dog2.setBreed("Dachshund mix Shih Tzu another cutie");

     System.out.println("\nUpdated Values:");
     System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
     System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
 }
}
