/*
 * Created by: 21343010-Natasya febriani
 */
package Latihan2_Inheritance;

public class Employ extends Person {
	private String noKaryawan;
	
	//konstruktor
	public Employ (String noKaryawan, String name, int age) {
		super(name, age);
		this.noKaryawan = noKaryawan;
	}
	
	//metode
	public void info() {
		System.out.println("No. Karyawan : " + this.noKaryawan);
		super.Info();
	}

}
