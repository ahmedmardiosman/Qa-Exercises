package com.qa.Assesment_Week_2;

import java.util.Random;
//User Input feature which is needed
import java.util.Scanner;

public class Runner {

	static Direction direction = new Direction(0, 0);

	static Random xLoc = new Random();

	static int xL = xLoc.nextInt(20);

	static Random yLoc = new Random();

	static int yL = yLoc.nextInt(20);

	public static void main(String[] args) {

		System.out.println("Welcome to the Infinite grey swamp Game !! \n");

		System.out.println("Lets Start off by creating your Charecter !! \n ");

		System.out.println("Please enter a Charecter name (words Please)");

		Scanner charName = new Scanner(System.in);

		String charecterName = charName.nextLine();

		System.out.println("Please enter a Colour (words Please)");

		Scanner charColour = new Scanner(System.in);

		String charecterColour = charColour.nextLine();

		System.out.println("Please enter a Charecter Age (numbers please)");

		Scanner charAge = new Scanner(System.in);

		int charecterAge = charAge.nextInt();

		System.out.println("Please enter a Charecter Height in cm (numbers please) ");

		Scanner charHeight = new Scanner(System.in);

		int charecterHeight = charHeight.nextInt();

		System.out.println("Please choose a Charecter type (Please Choose) \n1: Princess  \n2: Gangster \n3: Warrior");

		Scanner charType = new Scanner(System.in);

		int charecterType = charType.nextInt();

		switch (charecterType) {

		case 1:
			System.out.println("You chose the Princess Charecter");

			Princess p1 = new Princess(charecterName, charecterColour, charecterAge, charecterHeight);

			p1.princessCharecteristics();

			break;

		case 2:
			System.out.println("You chose the Gangster Charecter");

			Gangster g1 = new Gangster(charecterName, charecterColour, charecterAge, charecterHeight);

			g1.gangsterCharecteristics();

			break;

		case 3:
			System.out.println("You chose the Warrior Charecter");

			Warrior w1 = new Warrior(charecterName, charecterColour, charecterAge, charecterHeight);

			w1.warriorCharecteristics();

			break;

		default:
			System.out.println("Incorrect option chosen");
			break;

		}

		System.out.println(
				"There are monsters appoaching and they want to eat you!! \n You need to get out of there!! \n There is a safe area close by. Hurry !! \n");

		Random xPos = new Random();

		int x = xPos.nextInt(20);

		Random yPos = new Random();

		int y = yPos.nextInt(20);

		direction.setxPosition(x);

		direction.setyPosition(y);

		System.out.println("your starting position is " + "( " + x + " , " + y + " )");

		// saftey zone location

		coordinatesOfCharecter();

	}

	public static void coordinatesOfCharecter() {

		System.out.println(
				"Which direction would you like to travel? (Please Choose) \n1: North  \n2: East \n3: South \n4: West ");

		Scanner d1 = new Scanner(System.in);

		int direction1 = d1.nextInt();

		switch (direction1) {
		case 1:
			System.out.println("You chose North");

			direction.setyPosition(direction.getyPosition() + 1);

			System.out.println("Your New Coordinates are: ( " + direction.getxPosition() + " , "
					+ direction.getyPosition() + " )");

			System.out.println("You are ( " + xDistanceDifference() + " , " + yDistanceDifference()
					+ " ) away from the saftey zone");

			coordinatesOfCharecter();

			break;

		case 2:
			System.out.println("You chose East");

			direction.setxPosition(direction.getxPosition() + 1);

			System.out.println("Your New Coordinates are: ( " + direction.getxPosition() + " , "
					+ direction.getyPosition() + " )");

			System.out.println("You are ( " + xDistanceDifference() + " , " + yDistanceDifference()
					+ " ) away from the saftey zone");

			coordinatesOfCharecter();

			break;

		case 3:
			System.out.println("You chose South");

			direction.setyPosition(direction.getyPosition() - 1);

			System.out.println("Your New Coordinates are: ( " + direction.getxPosition() + " , "
					+ direction.getyPosition() + " )");

			System.out.println("You are ( " + xDistanceDifference() + " , " + yDistanceDifference()
					+ " ) away from the saftey zone");

			coordinatesOfCharecter();

			break;

		case 4:
			System.out.println("You chose West");

			direction.setxPosition(direction.getxPosition() - 1);

			System.out.println("Your New Coordinates are: ( " + direction.getxPosition() + " , "
					+ direction.getyPosition() + " )");

			System.out.println("You are ( " + xDistanceDifference() + " , " + yDistanceDifference()
					+ " ) away from the saftey zone");

			coordinatesOfCharecter();

			break;

		default:
			System.out.println("Incorrect option chosen");
			break;

		}

	}

	public static int xDistanceDifference() {

		int xDifference = direction.getxPosition() - xL;

		return xDifference;

	}

	public static int yDistanceDifference() {

		int yDifference = direction.getyPosition() - yL;

		return yDifference;

	}

}
