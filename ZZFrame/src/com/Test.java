package com;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		MFrame mFrame = new MFrame();
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.setVisible(true);
		mFrame.setSize(300, 200);
		mFrame.setResizable(false);
		mFrame.setLocationRelativeTo(null);
	}

}
