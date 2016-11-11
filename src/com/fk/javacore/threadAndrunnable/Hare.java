package com.fk.javacore.threadAndrunnable;

public class Hare implements Runnable {
	private boolean[] flags = { true, false };
	private int totalStep;
	private int step ;

	public Hare(int totalStep) {
		this.totalStep = totalStep;
	}

	@Override
	public void run() {
		while (step < totalStep) {
			boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];

			if (isHareSleep) {
				System.out.println("兔子睡着了 zzzZZZ...");
			} else {
				step += 2;
				System.out.println("兔子跑了  " + step + "  步");
			}
		}
	}

}