class Hello{
	public static void main (String [] args){
		
		System.out.println("Hello world!");
		List <Integer> list = ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(524);
		
		Person person1 = new Person(1, "Andrey");
		Person person1 = new Person(3, "Sergey");
		System.out.println("123");
		 
		 Map <Integer, String> map = new HashMap<>();
		 map.put(1, "Stack");
		 map.put(2,"List");
		 map.put(3, "Queue");
		 
		 System.out.println(person1.getId);
		 
	}
}

class Person{
	private String name;
	private int id;
	
	public int getId(){
		return this.id;
	}
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}