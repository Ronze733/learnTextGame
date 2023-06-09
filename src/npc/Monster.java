package npc;

public class Monster {
	protected String kind;
	protected String name;
	protected int level;
	protected double exp;
	protected int money;
	protected double hp;
	protected double mp;
	protected double maxHp;
	protected double maxMp;
	protected double criper;
	protected double cridmg;
	protected double atk;
	protected double def;
	
	public Monster() {
		// TODO Auto-generated constructor stub
	}

	public Monster(String kind, String name, int level, double exp, int money, double maxHp, double maxMp,
			double criper, double cridmg, double atk, double def) {
		super();
		this.kind = kind;
		this.name = name;
		this.level = level;
		this.exp = exp;
		this.money = money;
		this.maxHp = maxHp;
		this.hp = maxHp;
		this.maxMp = maxMp;
		this.mp = maxMp;
		this.criper = criper;
		this.cridmg = cridmg;
		this.atk = atk;
		this.def = def;
	}
	
	@Override
	public String toString() {
		System.out.println("스탯 ----------------------");
		System.out.printf("이름\t: %s\n", this.name);
		System.out.printf("레벨\t: %d\n", this.level);
		System.out.printf("공격력\t: %.1f\n", this.atk);
		System.out.printf("방어력\t: %.1f\n", this.def);
		System.out.printf("체력\t: %.1f/%.1f\n", this.hp, this.maxHp);
		System.out.printf("마나\t: %.1f/%.1f\n", this.mp, this.maxMp);
		return super.toString();
	}
	
	

	public double getAtk() {
		return atk;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}

	public double getDef() {
		return def;
	}

	public void setDef(double def) {
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp += hp;
		if(this.hp > this.maxHp)
			this.hp = this.maxHp;
	}

	public double getMp() {
		return mp;
	}

	public void setMp(double mp) {
		this.mp += mp;
		if(this.mp > this.maxMp)
			this.mp = this.maxMp;
	}

	public double getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(double maxHp) {
		this.maxHp = maxHp;
		if(this.hp > this.maxHp)
			this.hp = this.maxHp;
	}

	public double getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(double maxMp) {
		this.maxMp = maxMp;
		if(this.mp > this.maxMp)
			this.mp = this.maxMp;
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
