package spring.service.dice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.service.dice.play.Player02;

public class DiceTestAppUseSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/diceservice.xml");
		// xml �ϳ��� �ϸ鼭 �̰����� �ϳ��� �׽�Ʈ�Ѵ�...
		Player02 player01 = (Player02) factory.getBean("player01");
		player01.playDice(3);
		System.out.println("======================");
		System.out.println("���õ� �ֻ��� ���� ������ :" + player01.getTotalValue());
		System.out.println("=============\n\n");

		Player02 player02 = (Player02) factory.getBean("player02");
		player02.playDice(3);
		System.out.println("======================");
		System.out.println("���õ� �ֻ��� ���� ������ :" + player02.getTotalValue());
		System.out.println("=============\n\n");

		Player02 player03 = (Player02) factory.getBean("player03");
		player03.playDice(3);
		System.out.println("======================");
		System.out.println("���õ� �ֻ��� ���� ������ :" + player03.getTotalValue());
		System.out.println("=============\n\n");

		Player02 player04 = (Player02) factory.getBean("player04");
		player04.playDice(3);
		System.out.println("======================");
		System.out.println("���õ� �ֻ��� ���� ������ :" + player04.getTotalValue());
		System.out.println("=============\n\n");

	}

}// end of class