package item;

public enum ItemsWeapon {
	WOODSWORD("나뭇가지", 5, 0.01, 5), WOODENSWORD("목검", 8, 0.02, 100), BEGINNERSWORD("초보자용 철검", 10, 0.034, 110),
	BRONZESWORD("청동검", 12, 0.06, 150), IRONSWORD("철검", 18, 0.15, 200), STEELSWORD("강철 검", 25, 0.3, 500);
	
	private Weapon weapon;
	
	ItemsWeapon(String name, int atk, double cridmg, int money){
		weapon = new Weapon(name, atk, cridmg, money);
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
}
