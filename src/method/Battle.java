package method;

import java.util.Random;

import npc.Monster;
import player.player;

public class Battle {
	public static boolean Bat(player p, Monster m, int select) {
		Random rand = new Random();
		if(select == 1) {
			double pDmg = p.getAtk() - m.getAtk();
			double mDmg = m.getAtk() - p.getDef();
			
			if(pDmg < 0)
				pDmg = 0;
			if(mDmg <= 0)
				mDmg = 0;
			
			double dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
			pDmg *= dmgper;
			
			dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
			mDmg *= dmgper;
			
			System.out.println(p.getName() + "이(가) " + m.getName() + "을(를) 공격합니다.");
			int criper = rand.nextInt(100) + 1;
			if(criper <= p.getCriper() * 100) {
				pDmg = pDmg * p.getCridmg();
				if(pDmg == 0)
					pDmg = 1;
				System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", pDmg);
				m.setHp(-pDmg);
				if(m.getHp() <= 0) {
					System.out.println("전투에서 승리했습니다!");
					p.setExp(m.getExp());
					p.setMoney(m.getMoney());
					return false;
				}
			} else {
				System.out.printf("%.1f만큼의 데미지를 줍니다.\n", pDmg);
				m.setHp(-pDmg);
				if(m.getHp() <= 0) {
					System.out.println("전투에서 승리했습니다!");
					p.setExp(m.getExp());
					p.setMoney(m.getMoney());
					return false;
				}
			}
			
			System.out.println(m.getName() + "이(가) " + p.getName() + "을(를) 공격합니다.");
			criper = rand.nextInt(100) + 1;
			if(criper <= m.getCriper() * 100) {
				mDmg = mDmg * m.getCridmg();
				if(mDmg == 0)
					mDmg = 1;
				System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", mDmg);
				p.setHp(-mDmg);
				if(p.getHp() <= 0) {
					System.out.println("전투에서 패배하였습니다.");
					double hp = -p.getHp();
					p.setHp(hp);
					
					
					return false;
				}
			} else {
				if(mDmg <= 0)
					mDmg = 1;
				System.out.printf("%.1f만큼의 데미지를 줍니다.\n", mDmg);
				p.setHp(-mDmg);
				if(p.getHp() <= 0) {
					System.out.println("전투에서 패배하였습니다.");
					double hp = -p.getHp();
					p.setHp(hp);
					return false;
				}
			}
			
			return true;
			
			
		} else if(select == 3) {
			int escapePer = m.getLevel() - p.getLevel();
			if(escapePer < 0) {
				System.out.println("도망에 성공했습니다.");
				return false;
			} else if(escapePer == 0) {
				escapePer = rand.nextInt(2);
				if(escapePer == 0) {
					System.out.println("도망에 성공했습니다.");
					return false;
				} else {
					System.out.println("도망에 실패하였습니다.");
					
					double mDmg = m.getAtk() - p.getDef();
					if(mDmg <= 0)
						mDmg = 0;
					
					double dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
					mDmg *= dmgper;
					
					
					System.out.println(m.getName() + "이(가) " + p.getName() + "을(를) 공격합니다.");
					int criper = rand.nextInt(100) + 1;
					criper = rand.nextInt(100) + 1;
					if(criper <= m.getCriper() * 100) {
						mDmg = mDmg * m.getCridmg();
						if(mDmg == 0)
							mDmg = 1;
						System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", mDmg);
						p.setHp(-mDmg);
						if(p.getHp() <= 0) {
							System.out.println("전투에서 패배하였습니다.");
							double hp = -p.getHp();
							p.setHp(hp);
							return false;
						}
					} else {
						if(mDmg <= 0)
							mDmg = 1;
						System.out.printf("%.1f만큼의 데미지를 줍니다.\n", mDmg);
						p.setHp(-mDmg);
						if(p.getHp() <= 0) {
							System.out.println("전투에서 패배하였습니다.");
							double hp = -p.getHp();
							p.setHp(hp);
							return false;
						}
					}
					
					return true;
				
				}
			} else {
				if(escapePer >= 10) {
					if(m.getHp() <= m.getMaxHp() * 0.05) {
						System.out.println("도망에 성공했습니다.");
						return false;
					} else {
						System.out.println("도망에 실패하였습니다.");
						
						double mDmg = m.getAtk() - p.getDef();
						if(mDmg <= 0)
							mDmg = 0;
						
						double dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
						mDmg *= dmgper;
						
						
						System.out.println(m.getName() + "이(가) " + p.getName() + "을(를) 공격합니다.");
						int criper = rand.nextInt(100) + 1;
						criper = rand.nextInt(100) + 1;
						if(criper <= m.getCriper() * 100) {
							mDmg = mDmg * m.getCridmg();
							if(mDmg == 0)
								mDmg = 1;
							System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", mDmg);
							p.setHp(-mDmg);
							if(p.getHp() <= 0) {
								System.out.println("전투에서 패배하였습니다.");
								double hp = -p.getHp();
								p.setHp(hp);
								return false;
							}
						} else {
							if(mDmg <= 0)
								mDmg = 1;
							System.out.printf("%.1f만큼의 데미지를 줍니다.\n", mDmg);
							p.setHp(-mDmg);
							if(p.getHp() <= 0) {
								System.out.println("전투에서 패배하였습니다.");
								double hp = -p.getHp();
								p.setHp(hp);
								return false;
							}
						}
						
						return true;
					
					}
				} else {
					int random = rand.nextInt(10);
					if(m.getHp() <= m.getMaxHp() * 0.05) {
						System.out.println("도망에 성공했습니다.");
						return false;
					}
					
					if(random > escapePer) {
						System.out.println("도망에 성공했습니다.");
						return false;
					} else {
						System.out.println("도망에 실패하였습니다.");
						
						double mDmg = m.getAtk() - p.getDef();
						if(mDmg <= 0)
							mDmg = 0;
						
						double dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
						mDmg *= dmgper;
						
						
						System.out.println(m.getName() + "이(가) " + p.getName() + "을(를) 공격합니다.");
						int criper = rand.nextInt(100) + 1;
						criper = rand.nextInt(100) + 1;
						if(criper <= m.getCriper() * 100) {
							mDmg = mDmg * m.getCridmg();
							if(mDmg == 0)
								mDmg = 1;
							System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", mDmg);
							p.setHp(-mDmg);
							if(p.getHp() <= 0) {
								System.out.println("전투에서 패배하였습니다.");
								double hp = -p.getHp();
								p.setHp(hp);
								return false;
							}
						} else {
							if(mDmg <= 0)
								mDmg = 1;
							System.out.printf("%.1f만큼의 데미지를 줍니다.\n", mDmg);
							p.setHp(-mDmg);
							if(p.getHp() <= 0) {
								System.out.println("전투에서 패배하였습니다.");
								double hp = -p.getHp();
								p.setHp(hp);
								return false;
							}
						}
						
						return true;
					}
				}
			}
		} else {
			if(p.getMp() < 10) {
				System.out.println("마나가 부족하여 스킬을 사용할 수 없습니다.");
				return true;
			}
			p.setMp(-10);
			double pDmg = (p.getAtk() - m.getAtk()) * 2;
			double mDmg = m.getAtk() - p.getDef();
			
			if(pDmg < 0)
				pDmg = 0;
			if(mDmg <= 0)
				mDmg = 0;
			
			double dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
			pDmg *= dmgper;
			
			dmgper = (((double) rand.nextInt(10)) / 100.0) + 1;
			mDmg *= dmgper;
			
			System.out.println(p.getName() + "이(가) " + m.getName() + "을(를) 공격합니다.");
			int criper = rand.nextInt(100) + 1;
			if(criper <= p.getCriper() * 100) {
				if(pDmg == 0)
					pDmg = 2;
				pDmg = pDmg * p.getCridmg();
				System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", pDmg);
				m.setHp(-pDmg);
				if(m.getHp() <= 0) {
					System.out.println("전투에서 승리했습니다!");
					p.setExp(m.getExp());
					p.setMoney(m.getMoney());
					return false;
				}
			} else {
				System.out.printf("%.1f만큼의 데미지를 줍니다.\n", pDmg);
				if(pDmg == 0)
					pDmg = 2;
				m.setHp(-pDmg);
				if(m.getHp() <= 0) {
					System.out.println("전투에서 승리했습니다!");
					p.setExp(m.getExp());
					p.setMoney(m.getMoney());
					return false;
				}
			}
			
			
			
			System.out.println(m.getName() + "이(가) " + p.getName() + "을(를) 공격합니다.");
			criper = rand.nextInt(100) + 1;
			if(criper <= m.getCriper() * 100) {
				mDmg = mDmg * m.getCridmg();
				if(mDmg == 0)
					mDmg = 1;
				System.out.printf("크리티컬 발동! %.1f만큼의 데미지를 줍니다.\n", mDmg);
				p.setHp(-mDmg);
				if(p.getHp() <= 0) {
					System.out.println("전투에서 패배하였습니다.");
					double hp = -p.getHp();
					p.setHp(hp);
					return false;
				}
			} else {
				if(mDmg <= 0)
					mDmg = 1;
				System.out.printf("%.1f만큼의 데미지를 줍니다.\n", mDmg);
				p.setHp(-mDmg);
				if(p.getHp() <= 0) {
					System.out.println("전투에서 패배하였습니다.");
					double hp = -p.getHp();
					p.setHp(hp);
					return false;
				}
			}
			
			return true;
			
		}
	}



}
