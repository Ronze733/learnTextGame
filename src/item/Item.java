package item;

public class Item {
	protected String kind;
	protected String name;
	protected int atk;
	protected int def;
	protected int plusHp;
	protected int plusMp;
	protected double criper;
	protected double cridmg;
	protected int money;
	
	
	
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getPlusHp() {
		return plusHp;
	}

	public void setPlusHp(int plusHp) {
		this.plusHp = plusHp;
	}

	public int getPlusMp() {
		return plusMp;
	}

	public void setPlusMp(int plusMp) {
		this.plusMp = plusMp;
	}

	public double getCriper() {
		return criper;
	}

	public void setCriper(double criper) {
		this.criper = criper;
	}

	public double getCridmg() {
		return cridmg;
	}

	public void setCridmg(double cridmg) {
		this.cridmg = cridmg;
	}

}
