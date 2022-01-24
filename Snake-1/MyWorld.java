import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player bluePlayer = new Player(0,0,0,255);
    Player greenPlayer = new Player(4,0,255,0);
    Counter blueCounter = new Counter();
    Counter greenCounter = new Counter();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(bluePlayer, 550, 400);
        addObject(blueCounter, 600, 50);
        addObject(greenPlayer, 150, 400);
        addObject(greenCounter, 50, 50);
    }

    public void act()
    {
        count++;
        if(count > 100)
        {
            addObject(new Food(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1 ));
            count =0;
        }
    }
}
