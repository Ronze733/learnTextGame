package item;

public class Armor extends Item {
	public Armor() {
		// TODO Auto-generated constructor stub
	}
	
	public Armor(int atk, int def, int hp, int mp) {
		this.atk = atk;
		this.def = def;
		this.plusHp = hp;
		this.plusMp = mp;
	}
}
