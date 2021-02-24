
// Solution to Question 2

class Monster{
	private String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public String attack() {
		return "No type, No attack";
	}
}

class FireMonster extends Monster{
	
	public FireMonster(String name) {
		super(name);
	}
	
	public String attack() {
		return "I attack with Fire";
	}
}

class WaterMonster extends Monster{
	
	public WaterMonster(String name) {
		super(name);
	}
	
	public String attack() {
		return "I attack with Water";
	}
}

class StoneMonster extends Monster{
	
	public StoneMonster(String name) {
		super(name);
	}
	
	public String attack() {
		return "I attack with Stones";
	}
}



public class Q2 {

	public static void main(String[] args) {
		Monster f1 = new FireMonster("Darkfire Dragon");
		Monster a1 = new WaterMonster("Aqua Dragon");
		Monster s1 = new StoneMonster("Block Dragon");
		
		System.out.println("FireMonster : " + f1.attack());
		System.out.println("WaterMonster : " + a1.attack());
		System.out.println("StoneMonster : " + s1.attack());
				
		

	}

}
