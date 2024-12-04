package galaxy;

public class Medic extends CrewMember{
    private int healingEfficiency; // 0 - - 10

    public Medic(String name, String role, int health, int healingEfficiency) {
        super(name, role, health);
        this.healingEfficiency = healingEfficiency;
    }


    public String healCrewmateYourself () {
        if (super.getHealth() < 100){
            if (super.getHealth() * healingEfficiency > 100){
                super.setHealth(100);
            } else {
                super.setHealth(
                        super.getHealth() * healingEfficiency
                ) ;
            }
        }
        return "Ваше здоровье восстановилось: " + super.getHealth();
    }

    public String healCrewmateEngineer (Engineer engineer) {
        if (engineer.getHealth() < 100){
            if (engineer.getHealth() * healingEfficiency > 100){
                engineer.setHealth(100);
            } else {
                engineer.setHealth(
                        engineer.getHealth() * healingEfficiency
                ) ;
            }
        }
        return "Ваше здоровье восстановилось: " + engineer.getHealth();
    }


    public String healCrewmateExplorer (Explorer explorer) {
        if (explorer.getHealth() < 100){
            if (explorer.getHealth() * healingEfficiency > 100){
                explorer.setHealth(100);
            } else {
                explorer.setHealth(
                        explorer.getHealth() * healingEfficiency
                ) ;
            }
        }
        return "Ваше здоровье восстановилось: " + explorer.getHealth();
    }


    public int getHealingEfficiency() {
        return healingEfficiency;
    }

    public void setHealingEfficiency(int healingEfficiency) {
        this.healingEfficiency = healingEfficiency;
    }

    @Override
    public String toString() {
        return "Medic{" +
                super.toString()  +
                "healingEfficiency=" + healingEfficiency +
                '}';
    }
}
