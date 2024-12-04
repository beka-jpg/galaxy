package galaxy;

import java.util.Timer;
import java.util.TimerTask;

public class Engineer extends  CrewMember{
    private int repairSpeed; // до 10 наверно
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("Ремонт успешно завершена ");
        }
    };

    public Engineer(String name, String role, int energy, int health, int repairSpeed) {
        super(name, role, energy, health);
        this.repairSpeed = repairSpeed;
    }


    public void repairStation (int complexity) {
        int state = 10;
        for (int i = 0 ;  state == 100; i++){
            state *= repairSpeed;
            if (state == 100) {
                task.run();
                break;
            }
        }
    }
}
