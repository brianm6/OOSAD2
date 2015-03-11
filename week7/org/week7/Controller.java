package org.week7;

public class Controller {
	private static GameFascade gameFascade;
	public static void main(String[] args) {
		gameFascade = new GameFascade();
		gameFascade.play();
	}
}
