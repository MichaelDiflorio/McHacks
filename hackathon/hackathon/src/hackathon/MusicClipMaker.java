package hackathon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.jfugue.player.Player;
import org.jfugue.theory.Chord;
import org.jfugue.theory.ChordProgression;
import org.jfugue.theory.Note;

//import junit.framework.Assert;

//import org.junit.Test;

public class MusicClipMaker {
	public static void create(){
	
	 ChordProgression cp = new ChordProgression("I IV V");
	 Chord[] chords = cp.setKey("C").getChords();{
	    
	    for (Chord chord : chords) {
	      System.out.print("Chord "+chord+" has these notes: ");
	      Note[] notes = chord.getNotes();
	      for (Note note : notes) {
	        System.out.print(note+" ");
	      }
	      System.out.println();
	    }

	    Player player = new Player();
	    player.play(cp);
	  }
}
}

	  


