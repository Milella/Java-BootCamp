package com.coderscampus.learning_java_1;

public class Person implements Comparable<Person> {

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;

	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person that) {
		if (this.age > that.age) {
			return -1;
		}
			else if (this.age < that.age) {
				return 1;
			}

			else return 0;
	}	
}		
			 




