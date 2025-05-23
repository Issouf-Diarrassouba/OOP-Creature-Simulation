import java.util.Random;
public class ZombieCat extends Cat {
    int lasttime = 0;
    public ZombieCat(int row, int column, City c, Random rn){
        super(row, column, c, rn);
        this.lab = LAB_RED;
        this.radius = 40 ;
        this.lasttime = 0;
        this.stepLen = 3;
        this.mouse = null;

    }
    public void chase() {
        if (( Math.abs(this.getX()-this.mouse.getX()) > Math.abs(this.getY()-this.mouse.getY()))){
            if (this.getX() < this.mouse.getX()){
                this.setDir(EAST);
            }
        }
        else {
                if (this.getY() < this.mouse.getY()){
                    this.setDir(SOUTH);
                }
                if (this.getY() < this.mouse.getY()){
                    this.setDir(NORTH);
        }
    }
    
}
    public void takeAction(){
        if ( this.lasttime == 100){
            this.dead = true;
        }
        for (Creature i: this.city.creatures){
            if ((this.mouse == null) && (this.dist(i) <= this.radius)){
                if (!(i instanceof ZombieCat) && (i instanceof Mouse || i instanceof Cat)){
                    lab = LAB_BLACK;
                    this.mouse = i;
                }
            }
            if ((this.mouse == null) && (this.dist(i) < this.dist(this.mouse))){
            if (!(i instanceof ZombieCat) && (i instanceof Mouse || i instanceof Cat)){
                this.mouse = i;
        }
    }
}
        if((this.mouse != null)) {
            if ((this.mouse.dead  == true) || (this.dist(this.mouse) > this.radius)){
                    this.lab = LAB_RED;
                    this.mouse = null;
        }

    }

    if (this.mouse != null){
        this.chase();

    }

    if ((this.mouse != null) && (this.dist(this.mouse) == 0)){
        if(!(mouse instanceof ZombieCat)){
            if(this.mouse instanceof Mouse){
                this.mouse.dead = true;
                this.mouse = null;
            }
            else if ((mouse instanceof Cat)) {
                this.mouse.dead = true;
                this.mouse = null;
                city.creaturesToAdd.add(new ZombieCat(this.getX(), this.getY(), this.city,this.rand));
            }
            this.lasttime = 0;
            this.lab = LAB_RED;
        }

}
this.lasttime++;
}
}
