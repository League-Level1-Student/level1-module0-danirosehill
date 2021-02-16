package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {

		rob.setWindowSize(500, 500);
		rob.setSpeed(50);
		rob.moveTo(0, 500);
		rob.penDown();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int x = rand.nextInt(3);
			if (x == 0) {
				drawHouse("small", Color.blue);
				
			}
			if (x == 1) {
				drawHouse("medium", Color.pink);
			}
			if (x == 2) {
				drawHouse("large", Color.green);
			}
		}
	}

	void drawHouse(int height, Color col) {
		rob.setPenColor(col);
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.turn(270);
		rob.move(50);
		rob.turn(270);
	}
	
	void drawPointyRoof(int height, Color col) {
		rob.move(height);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(height);
		rob.turn(270);
		rob.move(50);
		rob.turn(270);
	}
	
	void drawFlatRoof(int height, Color col) {
		rob.setPenColor(col);
		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(height);
		rob.turn(270);
		rob.move(50);
		rob.turn(270);
	}

	void drawHouse(String height, Color col) {
		if (height.equals("small")) {
			drawFlatRoof(60, col);
			
		}
		if (height.equals("medium")) {
			drawFlatRoof(90, col);
		}
		if (height.equals("large")) {
			drawPointyRoof(120, col);
		}

	}
}
