package com.test03;

import java.awt.*;
import java.awt.event.*;
/* 1. �߻�Ŭ����
 * 2. �������̽��� ����
 * 3. �̳�Ŭ������
 * 4. ���� Ŭ������ ��ӹ޴� ���
 */

@SuppressWarnings("serial")
public class MTest01 extends Frame {
	public MTest01() {
		super("�̺�Ʈ ����");

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
