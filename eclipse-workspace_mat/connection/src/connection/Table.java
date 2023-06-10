package connection;

public class Table extends SecondaryData {

	private String id;
	private String name;
	private String designation;
	public Table() {
		super();
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Table [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
	
}
