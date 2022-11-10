/*
 * Created by: 21343010-Natasya febriani
 */

package Latihan2_Inheritance;

public class Person {
	protected String name;
	protected int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//metode
	public void Info() {
		System.out.println("Nama : "  +this.name);
		System.out.println("Usia : " +this.age);
	}
	
	//akhir kelas program
}
