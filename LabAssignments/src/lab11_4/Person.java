package lab11_4;

public class Person 
{
	int age;
	String name;
	int id;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person[age=" + age + ", name=" + name + ", id=" + id
				+ "]";
	}
}
