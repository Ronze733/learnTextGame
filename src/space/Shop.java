package space;

import java.util.LinkedList;

import item.Item;
import player.player;

public class Shop extends Field {
	private LinkedList<Item> items;
	
	public Shop() {
		// TODO Auto-generated constructor stub
		this.fieldName = "상점";
		this.fieldNum = 2;
		this.items = new LinkedList<Item>();
	}

	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items.add(items);
	}
	
	public void showShop(player p) {
		System.out.println("상점-----------");
		System.out.printf("돈\t: %d원\n", p.getMoney());
		for(int i = 0; i < items.size(); i++) {
			System.out.println("-------------");
			System.out.println(items.get(i).getName());
			System.out.println(items.get(i).getAtk());
			System.out.println(items.get(i).getDef());
			System.out.println(items.get(i).getMoney());
			if(i == items.size() - 1)
				System.out.println("-------------");
		}
	}
	
	
	
}
