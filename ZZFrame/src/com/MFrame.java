package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MFrame extends JFrame {
	CustomScheduledExecutor customExecutor = new CustomScheduledExecutor(3);
	PauseableThread thread = new PauseableThread();
	public MFrame() {
		// TODO Auto-generated constructor stub
		JButton but1 = new JButton("start");
		JButton but2 = new JButton("pause");
		JButton but3 = new JButton("resume");
		but1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				customExecutor.submit(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						int count = 0;
						while (true) {
							count++;
							System.out.println("ÔËÐÐÖÐ..." + count);
							try {
								Thread.currentThread().sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});
			}
		});
		but2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				customExecutor.pause();
			}
		});
		but3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				customExecutor.resume();
			}
		});

		JPanel panel = new JPanel();
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		this.add(panel);
	}
}
