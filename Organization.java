import java.util.LinkedList;
import java.util.List;

public class Organization {
	
	private String id;
	private String name;
	private String description;
	private String password;
	
	private List<Fund> funds;
	
	public Organization(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		funds = new LinkedList<>();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<Fund> getFunds() {
		return funds;
	}
	
	public void addFund(Fund fund) {
		funds.add(fund);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
