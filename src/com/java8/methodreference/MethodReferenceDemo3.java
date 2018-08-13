package com.java8.methodreference;

//Constructor Method interface 
//Here we are passing the variables to constructor and return the object
public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		UserFactory userFactory = new UserFactory() {
			
			@Override
			public User createUser(int id, String name) {
				return new User(id,name);
			}
		};
		
		UserFactory userFactory1 = (id,name)-> new User(id,name);
		UserFactory userFactory2 = User::new;
		
		System.out.println(userFactory.createUser(1, "John"));
		System.out.println(userFactory1.createUser(2, "James"));
		System.out.println(userFactory2.createUser(3, "Ryan"));
	}

}


@FunctionalInterface
interface UserFactory {
	public abstract User createUser(int id , String name);
}



class User{
	private int id;
	private String name;
	
	protected User(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}
