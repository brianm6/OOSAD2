package org.week7;

public class GameFascade {
	private Audio audioSubsystem;
	private Graphic graphicsSubsystem;
	private Input inputSubsystem;
	
	public void play() {
		audioSubsystem.loadAudioFiles();
		audioSubsystem.sequenceAudioFiles();
		audioSubsystem.connectToSpeackers();	
		graphicsSubsystem.loadBitmaps();
		graphicsSubsystem.spliceBitmaps();
		graphicsSubsystem.connectToDisplay();
		inputSubsystem.testKeyRate();
		inputSubsystem.connectToInput();
		System.out.println("Playing game, enjoy");
	}

	public GameFascade() {
		System.out.println("GameFascade Create");
		audioSubsystem = new Audio();
		graphicsSubsystem = new Graphic();
		inputSubsystem = new Input();
	}

}
