import galaxy.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        CrewMember crewMember = new CrewMember();


        Explorer explorer = new Explorer(
                "Explorer",
                "explorer",
                100,
                2
        );

        Medic medic = new Medic(
                "Medic",
                "medic",
                100 ,
                2
        );
        medic.setHealingEfficiency(6);

        Engineer engineer = new Engineer(
                "Engineer",
                "engineer",
                100,
                100,
                10
        );

        spaceStation spaceStation = new spaceStation(100, 100, 0);

        for (int i = 0; i < 7 ; i++) {
            int event = spaceStation.simulateEvent();
            switch (event){
                case 0:
                    int randomNumber = random.nextInt(100);
                    int randomComplexity = random.nextInt(10);

                    spaceStation.setDamageLevel(randomNumber);
                    engineer.repairStation(randomComplexity);
                    break;
                case 1:
                    int randomOxygenLevel = random.nextInt(30);

                    spaceStation.setOxygenLevel(randomOxygenLevel);

                    if (randomOxygenLevel < 30){

                        explorer.setHealth(medic.getHealth() - 5);
                        medic.setHealth(medic.getHealth() - 5);
                        engineer.setHealth(medic.getHealth() - 5);

                        medic.healCrewmateYourself();
                        medic.healCrewmateEngineer(engineer);
                        medic.healCrewmateExplorer(explorer);

                    } else if (randomOxygenLevel < 20 ){
                        explorer.explorePlanet(0);
                    } else {

                    }
                    break;
                case 2:
                    int countOf = random.nextInt(10);
                    int countOfDamage = ( countOf / 3 ) * 8;

                    spaceStation.setDamageLevel(countOfDamage);

                    if (countOfDamage > 8 ){
                        engineer.repairStation(7);
                    } else {
                        engineer.repairStation(4);
                    }

                    break;
                case 3:
                    explorer.explorePlanet(2);
                    break;
            }
        }


    }
}