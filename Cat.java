import java.util.Random;

public class Cat extends Creature { 
    protected Creature mouse; 
    protected int radius;
    int lasttime = 0;
    // Cat Constructor

    public Cat ( int row, int column, City c, Random rn){
        super(row,column,c,rn);
        this.lab = LAB_YELLOW;
        this.radius = 40;
        this.lasttime = 0;
        this.stepLen = 2;
        this.mouse = null;

    }

    public void chase() {
        if (( Math.abs(getX()-mouse.getX()) > Math.abs(getY()-mouse.getY()))) {
            if (getX() < mouse.getX()) {
                setDir(EAST);
            }
            if (getX() > mouse.getX()) {
                setDir(WEST);

            }
        }
        else {
            if (getY() < mouse.getY()){
                setDir(SOUTH);
            }
            if (getY() > mouse.getY()) {
                setDir(NORTH);
            }
        }
    }
    public void possibleturn(){
        if(rand.nextInt(100) <= 5){
            randomTurn();

        }
    }
    public void takeAction(){
        if (lasttime == 50){
            city.creaturesToAdd.add(new ZombieCat(getX(), getY(), city , rand));
            dead = true; 

        }
    for ( Creature i: city.creatures){
        if((mouse == null) && (dist(i) <= radius )){
            if ( i instanceof Mouse){
                lab = LAB_CYAN;
                mouse = i;

            }
        }
        if ((mouse != null) && (dist(i) < dist(mouse))){
            if ( i instanceof Mouse){
                mouse = i;
            }
        }
    }
    
    if ((lab == LAB_YELLOW)){
        possibleturn();

    }
    if ((mouse != null)){
        if (((mouse.dead == true) || (dist(mouse) > radius))){
            lab = LAB_YELLOW;
            mouse = null;

        }
    }
    if (mouse != null){
        chase();
    }
    if ((mouse != null) && (dist(mouse) == 0)){
        lasttime = 0;
        mouse.dead = true; 
        mouse = null;
        lab = LAB_YELLOW;
    }
    lasttime ++;


    }
    }
