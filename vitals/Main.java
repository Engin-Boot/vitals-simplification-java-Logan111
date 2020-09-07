package vitals;

import vitals.Vitalfun;

public class Main {
   
    public static void main(String[] args) {
        
         Vitalfun x = new Vitalfun();
         x.setAlert(new AlertbySound());
        //These are cases to test checkvitallimit function
        
        /*assert(checkVitalLimit(66, 75, 100)) == false;
        assert(checkVitalLimit(123, 55, 95)) == false;
        assert(checkVitalLimit(80, 70, 120)) == true;*/
        
        assert(x.vitalsAreOk(60, 80, 50)) ==  false; //bp value less than lowerlimit
        assert(x.vitalsAreOk(160, 95, 70)) == false; //bp value more than upperlimit

        assert(x.vitalsAreOk(100, 20, 70)) == false; //spo2 value less than lower limit
        assert(x.vitalsAreOk(80, 120, 70)) == false; // spo2 value more than upperlimit

        assert(x.vitalsAreOk(115, 95, 25)) == false; //Resprate value less than lowerlimit
        assert(x.vitalsAreOk(85, 95, 98)) == false;// Resprate value more than upperlimit
        
        x.setAlert(new AlertbySMS());
       
        assert(x.vitalsAreOk(180, 120, 116)) == false; // all vitals are above upper limit
        assert(x.vitalsAreOk(60, 25, 29)) == false;  //all vitals are below lower limit
        
        System.out.println("Vitals checked");
 
    }

}
