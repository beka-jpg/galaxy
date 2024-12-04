package galaxy;

import java.util.Random;

public class spaceStation {
    private int oxygenLevel;
    private int energyReserve;
    private int damageLevel;

    public spaceStation(int oxygenLevel, int energyReserve, int damageLevel) {
        this.oxygenLevel = oxygenLevel;
        this.energyReserve = energyReserve;
        this.damageLevel = damageLevel;
    }

    Random random = new Random();

    public int simulateEvent() {
        return random.nextInt(4); // 0 - поломка 1 - нехватка кислорода 2 - нападение астериодов 3 - спокойно проходить день
    };

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public int getEnergyReserve() {
        return energyReserve;
    }

    public void setEnergyReserve(int energyReserve) {
        this.energyReserve = energyReserve;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }


    @Override
    public String toString() {
        return "spaceStation{" +
                "oxygenLevel=" + oxygenLevel +
                ", energyReserve=" + energyReserve +
                ", damageLevel=" + damageLevel +
                '}';
    }
}
