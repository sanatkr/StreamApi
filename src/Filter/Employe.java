package Filter;



public class Employe {
	
	public Employe(int roll, String name, int marks, String section) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.section = section;
	}
	int roll;
	String name;
	int marks;
	String section;
	@Override
	public String toString() {
		return "Employe [roll=" + roll + ", name=" + name + ", marks=" + marks + ", section=" + section + "]";
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	

}
