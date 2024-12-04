package galaxy;

public class CrewMember {
    private String name;
    private String role;
    private int energy;
    private int health;

    public CrewMember(String name, String role, int energy, int health) {
        this.name = name;
        this.role = role;
        this.energy = energy;
        this.health = health;
    }

    public CrewMember(String name, String role, int health) {
        this.name = name;
        this.role = role;
        this.health = health;
    }

    public CrewMember() {
    }

    public String performTask (int minus){
        this.energy =- minus;
        return "Ваше энергия уменьшилась: " + this.energy;
    }

    public String recover (){
        if (this.energy < 100) {
            this.energy = 100;
        } else {
            return "У вас: " + this.energy;
        }
        return "У вас: " + this.energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", energy=" + energy +
                ", health=" + health +
                '}';
    }
}

