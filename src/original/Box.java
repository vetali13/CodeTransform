package original;

public class Box implements BoxInterface {
	private int id;
	
	public Box() {
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}
}
