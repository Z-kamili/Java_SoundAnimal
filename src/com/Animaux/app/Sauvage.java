package com.Animaux.app;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sauvage extends Animal {
	
	
	public Sauvage(String name,String kind,int size){
		// TODO Auto-generated constructor stub
		super(name,kind,size);
	}
@Override
public void ReadSound(String effectSource)
		throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	// TODO Auto-generated method stub
	super.ReadSound(effectSource);
}
	
	

	
	

}
