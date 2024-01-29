enum Pitch {
    C("C"), Db("D♭"), D("D"), Eb("E♭"), E("E"), F("F"), 
    Gb("G♭"), G("G"), Ab("A♭"), A("A"), Bb("B♭"), B("B");

    private Pitch(String flat) {
        this.flat = flat;
    }
    private String flat;

    @Override
    public String toString()
    {
        return flat;
    }
}

public class Note {
    public Note(Pitch pitch, int octave) {
        this.pitch = pitch;
        if (octave < -5) {
            this.octave = -5;
        }
        else if (octave > 4) {
            this.octave = 4;
        }
        else {
            this.octave = octave;
        }
    }
    public Note() {
        this.pitch = null;
    }
    @Override
    public String toString() {
        String superScript = "";
        if (pitch == null) {
            return " ";
        }
        else {
            switch (octave) {
                case -5:
                    superScript = "⁻⁵";
                    break;
                case -4:
                    superScript = "⁻⁴";
                    break;
                case -3:
                    superScript = "⁻³";
                    break;
                case -2:
                    superScript = "⁻²";
                    break;
                case -1:
                    superScript = "⁻¹";
                    break;
                case 1:
                    superScript = "¹";
                    break;
                case 2:
                    superScript = "²";
                    break; 
                case 3:
                    superScript = "³";
                    break;  
                case 4:
                    superScript = "⁴";
                    break; 
                default:
                    break;
            }
            return pitch + (octave != 0 ? superScript : "");
        }
    }
    private Pitch pitch;
    private int octave;
}
