package item;

public class Weapon extends Item {
	
	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	
	public Weapon(String name, int atk, double cridmg, int money) {
		this.kind = "무기";
		this.name = name;
		this.atk = atk;
		this.cridmg = cridmg;
		this.money = money;
	}
	
	
}
