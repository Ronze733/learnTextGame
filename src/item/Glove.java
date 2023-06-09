package item;

public class Glove extends Item {
	
	public Glove() {
		// TODO Auto-generated constructor stub
	}
	
	public Glove(int atk, int def, int hp, int mp, int criper, int cridmg) {
		this.kind = "장갑";
		this.atk = atk;
		this.def = def;
		this.plusHp = hp;
		this.plusMp = mp;
		this.criper = criper;
		this.cridmg = cridmg;
	}

}
