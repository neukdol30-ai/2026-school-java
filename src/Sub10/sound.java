package Sub10;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class sound {
    public static void main(String[] args) throws Exception {
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();

        MidiChannel channel = synth.getChannels()[0];

        // 3옥타브 도레미파솔라시도
        int[] notes = {72, 74, 76, 77, 79, 81, 83, 84};

        for (int note : notes) {
            channel.noteOn(note, 100);   // 음 시작
            Thread.sleep(400);           // 재생 시간
            channel.noteOff(note);       // 음 끝
            Thread.sleep(80);            // 음과 음 사이 간격
        }

        Thread.sleep(100);
        synth.close();
    }
}