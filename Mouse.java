import java.util.Random; 
public class Mouse extends Creature {
    int lasttime = 0;
    public Mouse(int row, int column, City c, Random rn){
    super(row,column, c, rn);
    this.lab = LAB_BLUE;
    
    
    
    }
    public void possibleturn(){
        if (rand.nextInt(100) <= 20){
            randomTurn();
        }
    }

    public void takeAction() { 
        possibleturn();
        if ( lasttime == 20){ 
            city.creaturesToAdd.add(new Mouse (getX(), getY(), city, rand));

        }
        if (lasttime == 30){

            dead = true; 

        }
        lasttime++;
    }
}