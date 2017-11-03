package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;


public class DiceAImpl implements Dice {
	private int value;
	
	public DiceAImpl() {
		System.out.println("::"+getClass().getName()+" 생성자 호출.....");
	}
	

	//==> 주사위를 던저 선택되는 숫자를 생산하는 행위(무작위로 숫자 생산)
	public void selectedNumber(){
		value = new Random().nextInt(6) + 1;
	}

	public int getValue() {
		return value;
	}

}
