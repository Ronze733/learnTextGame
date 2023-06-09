package Main;

import java.io.IOException;
import java.util.*;

import item.*;
import npc.*;
import player.*;
import space.Shop;
import method.*;

public class Main {

	public static void clearScreen() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		boolean game = true;
		int select = 0;
		boolean battle = true;
		
		

		System.out.println("이 게임은 저장이 없는 게임입니다.");
		
		Shop shop = new Shop();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해 주세요 : ");
		String name = sc.next();
		player p1 = new player(name);

		p1.toString();
		shop.showShop(p1);


//		ItemsHead helmetType = ItemsHead.IRONHELMET; // 헬멧 종류 선택
//        Head headItem = helmetType.getHead(); // 헬멧 아이템 생성
//        p1.setItems(headItem); // 플레이어에 헬멧 아이템 장착
//		
//		p1.toString();

		Monster m1;

		while (game) {
			m1 = KindOfMonster.MAWANG.getMonster();

			System.out.println("전투가 시작됩니다.");
			m1.toString();
			while (battle) {
				System.out.println("1. 공격\t 2. 강공격(마나 10)\t 3. 도망");
				select = sc.nextInt();
				battle = Battle.Bat(p1, m1, select);
				if (battle == false) {
					p1.toString();
					if (!m1.getName().equals("마왕")) {
						double hp = -m1.getHp();
						double mp = -m1.getMp();
						m1.setHp(hp + m1.getMaxHp());
						m1.setMp(mp + m1.getMaxMp());
					}
				} else {
					p1.toString();
					m1.toString();
				}
			}

			battle = true;

			if (p1.getHp() <= 0) {
				System.out.println("사망하였습니다. 게임에서 패배하셨습니다.");
				game = false;
			}
			
			if(m1.getHp() <= 0 && m1.getName().equals("마왕")) {
				System.out.println("축하합니다. 마왕을 쓰러트렸습니다! 게임에서 승리하셨습니다!");
			}
			
			m1 = null;
		}

		sc.close();
	}
}
