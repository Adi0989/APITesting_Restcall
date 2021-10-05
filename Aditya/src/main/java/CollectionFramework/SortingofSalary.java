package CollectionFramework;

public class SortingofSalary {

	
		private String name;
		private int id;
		private long salary;
		private int  age;
		
		
		
		@Override
		public String toString() {
			return "SortingofSalary [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + "]";
			
		}
		public SortingofSalary(String name, int id, long salary, int age) {
			super();
			
			
			this.name = name;
			this.id = id;
			this.salary = salary;
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
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	
	}


