package item;

public class Head extends Item {
	
	
	public Head() {
		// TODO Auto-generated constructor stub
	}
	
	public Head(String name, int atk, int def, int hp, int mp, int money) {
		this.kind = "투구";
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.plusHp = hp;
		this.plusMp = mp;
		this.money = money;
	}
	
}
