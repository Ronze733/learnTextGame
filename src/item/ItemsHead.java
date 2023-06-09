package item;

public enum ItemsHead {
	FABRICHELMET("천 모자", 0, 5, 10, 0, 100), LEATHERHELMET("가죽 모자", 0, 10, 12, 5, 150), BRONZEHELMET("청동 투구", 2, 13, 15, 5, 200),
	SILVERHELMET("은 투구", 4, 15, 18, 8, 250), IRONHELMET("철 투구", 6, 23, 25, 15, 600), STEELHELMET("강철 투구", 10, 30, 35, 7, 800),
	BROKENIRONHELMET("부서진 철 투구", 4, 18, 22, 0, 20), BORKENSTEELHELMET("부서진 강철 투구", 5, 21, 26, 0, 50);

	private Head head;

	ItemsHead(String name, int atk, int def, int hp, int mp, int money) {
		head = new Head(name, atk, def, hp, mp, money);
	}

	public Head getHead() {
		return head;
	}

}
