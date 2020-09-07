
package vitals;

public class Vitalfun {
    
     int[] bp_limit = {70 , 150 };
     int[] so2_limit = { 30 , 100};
     int[] resp_limit = {30 , 95};
    
    Alert alert;
    
    void setAlert(Alert alert_requested)
    {
        alert = alert_requested;
    }
  
   boolean vitalsAreOk(float bpm, float spo2, float respRate)
    {    
        boolean res = true;
        res &= isBpOk(bpm);
        res &= isSpo2Ok(spo2);;
        res &= isRespOk(respRate);
        return res;
        
    }
    
    boolean isBpOk(float bpm)
    {
        if (checkVitalLimit( bpm , bp_limit[0] , bp_limit[1]))
        {
            return true;
        }
        
        alert.sendAlert("Abnormal Bp levels");
        return false;
    }
    
    boolean isSpo2Ok(float spo2)
    {
        if(checkVitalLimit(spo2, so2_limit[0] , so2_limit[1]) )
        {
            return true;
        }
        alert.sendAlert("Abnormal Spo2 levels");
        return false;
    }
    
    boolean isRespOk(float respRate)
    {
       if (checkVitalLimit(respRate, resp_limit[0] , resp_limit[1]) )
       {
           return true;
       }
       alert.sendAlert("Abnormal Respiration rate");
       return false;
    }
    
    
    boolean checkVitalLimit(float val, int low, int high)
    {
        if(val < (float)low)
        {
            System.out.println("There is a LOW limit breach in the " + Thread.currentThread().getStackTrace()[2].getMethodName()  );
            return false;
        }
        if (val > (float)high)
        {
            System.out.println("There is a HIGH limit breach in the " + Thread.currentThread().getStackTrace()[2].getMethodName()  );
            return false;
        }
       
        return true;
        
    }
    
}
