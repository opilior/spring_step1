package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;


public class DiceAImpl implements Dice {
	private int value;
	
	public DiceAImpl() {
		System.out.println("::"+getClass().getName()+" ������ ȣ��.....");
	}
	

	//==> �ֻ����� ���� ���õǴ� ���ڸ� �����ϴ� ����(�������� ���� ����)
	public void selectedNumber(){
		value = new Random().nextInt(6) + 1;
	}

	public int getValue() {
		return value;
	}

}
