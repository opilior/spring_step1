package spring.service.dice.test;

import spring.service.dice.impl.DiceAImpl;
import spring.service.dice.impl.DiceBImpl;
import spring.service.dice.play.Player02;

/*
 * FileName : DiceTestApp01.java
 * �� DiceA / Player01 Test �ϴ� Application 
 */
public class DiceTestApp02 {
	///Main Method
	//���â �ݵ�� Ȯ��!!!
	public static void main(String[] args){
		//�����ڸ� �̿� ����� Dice�� DiceImpl ��ü�� �����ڸ� ���ؼ� ����..
				Player02 player01 = new Player02(new DiceAImpl());
				player01.playDice(3);
				System.out.println("=======================");
				System.out.println("���õ� �ֻ��� ���� ������ : "+player01.getTotalValue());
				System.out.println("=======================\n\n");
				
			
			//setter �޼ҵ带 �̿��ؼ� ����� DiceImpl ��ü�� ������..
			Player02 player02 = new Player02();
			player02.setDice(new DiceBImpl());
			player02.playDice(3);
			System.out.println("=======================");
			System.out.println("���õ� �ֻ��� ���� ������ : "+player02.getTotalValue());
			System.out.println("=======================\n\n");
			}
		}//end of class
 
