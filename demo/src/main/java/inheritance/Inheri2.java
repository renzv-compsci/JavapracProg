// Instrument Sound Simulator 
// Concepts Practiced: Method overriding , dynamic binding 


package inheritance;

class Instrument {
    public void playSound() {
        System.out.println("Instrument Sound");
    }
    public void tuneInstrument() {
        System.out.println("Now testing individual instruments: ");
    }
}

class Guitar extends Instrument {
    @Override
    public void playSound() { 
        System.out.println("Strumming guitar");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Now testing guitar");
    }
    
}

class Drums extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Beating drums");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Now testing drums");
    }
}

class Piano extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Playing piano keys");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Now testing piano");
    }
}

public class Inheri2 {
    public static void main(String[] args) {
        
        Instrument[] instrument = new Instrument[] {
            new Guitar(),
            new Drums(),
            new Piano()
        };

        for (Instrument i : instrument) {
            i.playSound();
            i.tuneInstrument();
        }


        Guitar  guitar = new Guitar();
        Drums drums = new Drums();
        Piano piano = new Piano();

        guitar.playSound();
        guitar.tuneInstrument();

        drums.playSound();
        drums.tuneInstrument();

        piano.playSound();
        piano.tuneInstrument();
    }
}