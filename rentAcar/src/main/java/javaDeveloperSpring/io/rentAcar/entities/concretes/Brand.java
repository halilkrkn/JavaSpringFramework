package javaDeveloperSpring.io.rentAcar.entities.concretes;

//Concretes - Somut Nesneler için
// Veri tabanı ile alakalı olan yer.
public class Brand {

	private int id;
	private String name;

	// Constructor
	public Brand() {
		super();
	}

	// Constructor
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// Getter & Setter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
