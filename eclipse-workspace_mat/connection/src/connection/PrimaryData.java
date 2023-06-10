package connection;

public class PrimaryData {

	private String id;
	private String name;

	public PrimaryData() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "name=" + name + " Designation=" + id + "\n";
	}
}
