package example.matasolutions.productivityrpg;

public class Skill {

    public String name;

    public double multiplier;

    public int level_number;

    public Double totalXP;

    public Double totalXP_next_level;

    public Double xp_left;

    public Double starting_xp_left;

    public Double previous_xp_left;

    public Double previous_totalXP_next_level;

    public Skill(String name, double multiplier){

        this.name = name;
        this.multiplier = multiplier;

        level_number = 1;

        totalXP  = new Double(0);

        previous_totalXP_next_level = new Double(0);

        totalXP_next_level = new Double(83);

        starting_xp_left = totalXP_next_level;

        previous_xp_left = starting_xp_left;

        xp_left = starting_xp_left;


    }

    public void LevelUp(){

        if(totalXP >= totalXP_next_level){

            level_number++;

            previous_totalXP_next_level = totalXP_next_level;

            Double newXp = ( (previous_xp_left)  + ((previous_xp_left) * 1.1) )  * multiplier ;

            previous_xp_left = newXp;

            totalXP_next_level = totalXP + newXp;

            xp_left = totalXP_next_level - totalXP;

        }

    }

    public void addXP(double add){
        totalXP += add;
        LevelUp();


    }






}
