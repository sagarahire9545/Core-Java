package generic_example;

public class Student {
	private String name;
	private int rollno;
	private double age;
	private float fees;
	private Address add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno, double age, float fees, Address add) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.fees = fees;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", fees=" + fees + ", add=" + add
				+ "]";
	}

}
