package item;

public class Potion {
	private int healHp;
	private int healMp;
	private int num = 0;
	
	public Potion() {
		// TODO Auto-generated constructor stub
	}
	
	public Potion(int hp) {
		this.healHp = hp;
	}
	
	public Potion(int hp, int mp) {
		this.healHp = hp;
		this.healMp = mp;
	}

	public int getHealHp() {
		return healHp;
	}

	public void setHealHp(int healHp) {
		this.healHp = healHp;
	}

	public int getHealMp() {
		return healMp;
	}

	public void setHealMp(int healMp) {
		this.healMp = healMp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num += num;
	}
	
	
	
}
