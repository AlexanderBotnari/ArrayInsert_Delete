
public class Aplication {
	
	public static void main(String[] args) {
		
		Insert.insert();
		Delete.delete();
		deletePerson();
		insertPerson();
	}
	
	 public static void deletePerson() {

	        String[] fullName = {"Giku", "Ion", "Marin", "Serghei", "Iura"};
	        Person[] people = new Person[5];
	        Person[] newPeople = new Person[people.length - 1];
	        int indexToDelete = 3;

	        for (int i = 0; i < people.length; i++) {
	            people[i] = new Person(fullName[i]);
	        }


	        for (int i = 0, c = 0; i < people.length; i++) {
	            if (i != indexToDelete) {
	                newPeople[c++] = people[i];
	            }

	        }
	        people = newPeople;

	        for (Person person : people) {
	            System.out.println(person.getFullname());
	        }

       }
	 
	 public static void insertPerson() {
	        String[] FullName = {"Ion", "Vasile", "Andrei", "Pavel", "Mihai"};
	        Person[] people = new Person[5];
	        Person[] newPeople = new Person[people.length + 1];
	        int indexToInsert = 3;
	        String newFullName = "Grigore";

	        for (int i = 0; i < people.length; i++) {
	            people[i] = new Person(FullName[i]);
	        }

            for (int i = 0, k = 0; i < people.length; i++) {
	            if (i == indexToInsert) {
	                people[i].setFullname(newFullName);
	                newPeople[k++] = people[i];
	            }else {
	                newPeople[k++] = people[i];
	            }

	        }
	        people = newPeople;
          try {
	        for (Person person : people) {
	                System.out.println(person.getFullname());
                }
          }catch(NullPointerException e) {
        	     System.out.println("6th position name null");
          }
	 }
}
