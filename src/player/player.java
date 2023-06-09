package player;

import item.*;

public class player {
	private String name;
	private double atk = 10;
	private double def = 5;
	private double criper = 0.05;
	private double cridmg = 1.5;
	private double leastCriper = 0.05;
	private double leastCridmg = 1.5;
	private int maxHp = 50;
	private double hp;
	private int maxMp = 50;
	private int mp;
	private double exp = 0;
	private int maxexp = 20;
	private int level = 1;
	private int money = 0;
	private Item[] equipItems;
	private Item[] useItems;

	public double getLeastCriper() {
		return leastCriper;
	}

	public void setLeastCriper(double leastCriper) {
		this.leastCriper += leastCriper;
	}

	public double getLeastCridmg() {
		return leastCridmg;
	}

	public void setLeastCridmg(double leastCridmg) {
		this.leastCridmg += leastCridmg;
	}

	public player(String name) {
		this.name = name;
		this.hp = maxHp;
		this.mp = maxMp;
		this.equipItems = new Item[] { ItemsWeapon.WOODSWORD.getWeapon(), new Sheild(), new Head(), new Glove(),
				new Shoes(), new Armor() };
		this.useItems = new Item[] {};
		this.atk += this.equipItems[0].getAtk();
		this.cridmg += this.equipItems[0].getCridmg();
	}

	@Override
	public String toString() {

		System.out.println("스탯 ----------------------");
		System.out.printf("이름\t: %s\n", this.name);
		System.out.printf("레벨\t: %d\n", this.level);
		System.out.printf("공격력\t: %.1f\n", this.atk);
		System.out.printf("방어력\t: %.1f\n", this.def);
		System.out.printf("체력\t: %.1f/%d\n", this.hp, this.maxHp);
		System.out.printf("마나\t: %d/%d\n", this.mp, this.maxMp);
		System.out.printf("경험치\t: %.1f/%d(%.2f%s)\n", this.exp, this.maxexp, (this.exp / this.maxexp) * 100, "%");
		System.out.printf("돈\t: %d원\n", this.money);
		System.out.println("현재 장비 상태 ( 공, 수 )");
		for (int i = 0; i < this.equipItems.length; i++) {
			if (this.equipItems[i].getName() != null) {
				System.out.print(this.equipItems[i].getKind() + " : ");
				System.out.print(this.equipItems[i].getName() + " ");
				System.out.print(this.equipItems[i].getAtk() + " ");
				System.out.print(this.equipItems[i].getDef() + "\n");
			}
		}
		System.out.println("-------------------------");

		return super.toString();
	}

	public Item[] getItems() {
		return equipItems;
	}

	public void setItems(Item item) {
		if (item instanceof Head) {
			equipItems[2] = item;
		} else if (item instanceof Glove) {
			equipItems[3] = item;
			this.cridmg = this.leastCridmg;
			this.criper = this.leastCriper;
			this.setCridmg(this.equipItems[0].getCridmg());
			this.setCridmg(item.getCridmg());
			this.setCriper(item.getCriper());
		} else if (item instanceof Shoes) {
			equipItems[4] = item;
		} else if (item instanceof Armor) {
			equipItems[5] = item;
		} else if (item instanceof Weapon) {
			this.cridmg = 1.5;
			this.setCridmg(this.equipItems[3].getCridmg());
			this.setCridmg(item.getCridmg());
			equipItems[0] = item;
		} else if (item instanceof Sheild) {
			equipItems[1] = item;
		}

		this.setAtk(item.getAtk());
		this.setDef(item.getDef());
		this.setMaxHp(item.getPlusHp());
		this.setMaxMp(item.getPlusMp());
	}

	public player() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAtk() {
		return this.atk;
	}

	public void setAtk(double atk) {
		this.atk += atk;
	}

	public double getDef() {
		return this.def;
	}

	public void setDef(double def) {
		this.def += def;
	}

	public double getCriper() {
		return criper;
	}

	public void setCriper(double criper) {
		this.criper += criper;
		if (this.criper > 1)
			this.criper = 1;
	}

	public double getCridmg() {
		return cridmg;
	}

	public void setCridmg(double cridmg) {
		this.cridmg += cridmg;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp += maxHp;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp += hp;
		if (this.hp > this.maxHp)
			this.hp = this.maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp += maxMp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp += mp;
		if (this.mp > this.maxMp)
			this.mp = this.maxMp;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp += exp;
		while (this.exp >= this.maxexp) {
			this.exp -= this.maxexp;
			this.maxexp += level * 10;
			this.maxHp += level * 15;
			this.hp = this.maxHp;
			this.maxMp += level * 10;
			this.mp = this.maxMp;
			this.atk += 5;
			this.def += 5;
			this.level++;
			if (this.level % 5 == 0) {
				this.leastCridmg += 0.05;
				this.leastCriper += 0.01;
			}
		}
	}

	public int getLevel() {
		return level;
	}

	public int getMaxexp() {
		return maxexp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}

	public void buy(Item item) {
		if (this.getMoney() >= item.getMoney()) {
			this.setItems(item);
			this.setMoney(-1 * item.getMoney());
		} else {
			System.out.println("돈이 없어서 " + item.getName() + "을(를) 살 수 없습니다.");
		}
	}

	public Item sell(String equip) {
		Item item = this.getItems()[2];

		switch (equip) {
		case "투구":
			item = this.getItems()[2];
			Head h = new Head(null, 0, 0, 0, 0, 0);
			this.setItems(h);
			break;
		case "장갑":
			item = this.getItems()[3];
		}
		this.setMoney((int) (item.getMoney() * 0.5));
		return item;
	}

}