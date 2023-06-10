package connection;

public class SecondaryData extends PrimaryData {

	private String id;
	private String Designation;
	
	public SecondaryData() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "id=" + id + " Designation=" + Designation;
	}
	
	
}
