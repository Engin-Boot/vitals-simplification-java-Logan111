package vitals;

public abstract class Alert
    { 
        static String msgalert = "";
        abstract void sendAlert(String msgalert);
    }
 class AlertbySound extends Alert
    {
        void sendAlert(String msgalert) {
            System.out.println("Alerting via Sound: " + msgalert + "\n");
        }

    }
 class AlertbySMS extends Alert
    {   
        void sendAlert(String msgalert) {
           System.out.println("Alerting via SMS: " + msgalert + "\n");
        }

    }

