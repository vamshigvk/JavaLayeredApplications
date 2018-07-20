package lab11_4;

public class InstanceImpl 
{
	int age;
	String name;
	int id;

	public InstanceImpl(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		Person per = new Person(age, name, id);
		System.out.println(per);
		
	}

	public InstanceImpl getInstanceImpl(int id, String name, int age) {
		return null;
	}



	public static void main(String[] args) {

		InstanceInterface lm = InstanceImpl::new;
		lm.getInstanceImpl(21, "vamshi", 111);

	}
}
