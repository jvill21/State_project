
public class State {

	// fields for a state object
	private String name;
	private String capitol;
	private int population;
	private String state_flower;
	
	
	public State() {
		
	}
	
	public State(String name, String cap, int pop, String flower) {
		this.name = name;
		this.capitol = cap;
		this.population = pop;
		this.state_flower = flower;
	}
	
	
	// setter methods to assign new values to a State
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setCapitol(String newCap) {
		this.capitol = newCap;
	}
	
	public void setPopulation(int newPop) {
		this.population = newPop;
	}
	
	public void setFlower(String newFlower) {
		this.state_flower = newFlower;
	}
	
	
	// getter methods to receive values of a State
	public String getName() {
		return name;
	}
	
	public String getCap() {
		return capitol;
	}
	
	public int getPop() {
		return population;
	}
	
	public String getFlower() {
		return state_flower;
	}
	
}
