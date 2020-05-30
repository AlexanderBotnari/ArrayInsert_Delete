
public class Person {
	
	private String fullname;

	public Person() {}
    public Person(String fullname) {
		this.fullname = fullname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String toString() {
		return "FullName : [" + fullname + "]";
	}

}
