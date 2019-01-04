package com.test03;

import java.awt.*;
import java.awt.event.*;
/* 1. 추상클래스
 * 2. 인터페이스를 구현
 * 3. 이너클래스로
 * 4. 직접 클래스를 상속받는 방법
 */

@SuppressWarnings("serial")
public class MTest01 extends Frame {
	public MTest01() {
		super("이벤트 연습");

	}

	public void go() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MTest01().go();
	}
}
