package npc;

public enum KindOfMonster {
	SLIME("슬라임", "초록 슬라임", 1, 10, 5, 30, 5, 0.01, 1.1, 5, 6),
	GOBLIN("고블린", "고블린", 3, 15, 10, 80, 10, 0.05, 1.1, 20, 15),
	WITCH("위치", "마녀", 5, 20, 30, 200, 500, 0.2, 1.3, 26, 8),
	ZOMBIE("좀비", "죽지 못한 자", 10, 150, 100, 300, 2, 0.01, 1.7, 40, 0),
	MAWANG("마왕", "마왕", 50, 0, 100000000, 10000, 5000, 0.7, 1.8, 500, 1000);
	// GOLEM(5), GHOST(6), GHOUL(7), DARKELF(8),
	// GARUDA(9)

	private Monster monster;


	KindOfMonster(String kind, String name, int level, double exp, int money, double maxHp, double maxMp, double criper,
			double cridmg, double atk, double def) {
		monster = new Monster(kind, name, level, exp, money, maxHp, maxMp, criper, cridmg, atk, def);
	}

	public Monster getMonster() {
		return monster;
	}

}
