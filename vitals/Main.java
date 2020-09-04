package vitals;

public class Main {
    static boolean vitalsAreOk(float bpm, float spo2, float respRate) {
        if(bpm < 70 || bpm > 150) {
            return false;
        } else if(spo2 < 90) {
            return false;
        } else if(respRate < 30 || respRate > 95) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        assert(vitalsAreOk(80, 97, 40) == true);
        assert(vitalsAreOk(60, 98, 40) == false);
        System.out.println("Some more tests needed");
    }
}
