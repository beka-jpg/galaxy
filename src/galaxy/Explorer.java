package galaxy;

public class Explorer extends  CrewMember{
    private int  explorationSpeed ;



    public Explorer(String name, String role,  int health, int explorationSpeed) {
        super(name, role, health);
        this.explorationSpeed = explorationSpeed;
    }


    public String explorePlanet(int count) {
        explorationSpeed =+ count;
        return "Вы исследовали: " + explorationSpeed + " планет";
    }


    public int getExplorationSpeed() {
        return explorationSpeed;
    }

    public void setExplorationSpeed(int explorationSpeed) {
        this.explorationSpeed = explorationSpeed;
    }

    @Override
    public String toString() {
        return "Explorer{" +
                super.toString() +
                "explorationSpeed=" + explorationSpeed +
                '}';
    }
}
