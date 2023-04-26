public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    ///Constructor
    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    ///getter and setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public String getMove(){
        return move;
    }

    public void setMove(String move){
        this.move = move;
    }

    public void setMovePower(int movePower){
        this.movePower = movePower;
    }

    public int getMovePower(){
        return movePower;
    }

    public void setAttackSpeed(int attackSpeed){
        this.attackSpeed = attackSpeed;
    }

    public int getAttackSpeed(){
        return attackSpeed;
    }


    ///packages the information into the proper string format
    public String displayPokemonStats(){
        name = getName();
        int hp = getHitPoints();
        move =getMove();
        int mp = getMovePower();
        int ats = getAttackSpeed();

        return String.format("Name: %s%n Hit Points: %d%n Move: %s%n Move Power: %d%n Attack Speed: %d%n", name, hp, move, mp, ats);
    }

}
