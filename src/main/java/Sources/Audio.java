/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Alexander
 */
public class Audio {
    private Clip clip;
    private URL soundURL;

    public Audio() {
        try {
            soundURL = getClass().getResource("/audio/" + "background.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        }
    }

    public void start() {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY); // This will start the audio loop
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
//            clip.setFramePosition(0); //This will restart the audio
        }
    }
}
