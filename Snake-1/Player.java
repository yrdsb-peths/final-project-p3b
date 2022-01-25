import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author Frankie Lin 
 * @version 2022-01-25
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, player;
    int speed = 3;
    int count = 0;
    // Creates the Player
    public Player(int player, int r, int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        this.player = player;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    // Runs the Player
    public void act()
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(), getY());
        move(speed);
        moveAround();
        eatFood();
    }
    
    public void moveAround()
    {
        if(this.player == 0)
        {
            if(Greenfoot.isKeyDown("right"))
                setRotation(0);
            if(Greenfoot.isKeyDown("left"))
                setRotation(180);
            if(Greenfoot.isKeyDown("up"))
                setRotation(270);
            if(Greenfoot.isKeyDown("down"))
                setRotation(90);
        }
    }
    // Increases Score when you eat Food
    public void eatFood()
    {
        if(isTouching(Food.class) && player == 0)
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.blueCounter.addScore();
        }
    }
}
