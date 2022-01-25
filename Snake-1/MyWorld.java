import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * Basic Snake Game
 * @author Frankie Lin 
 * @version 2022-01-25
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player bluePlayer = new Player(0,0,255);
    Counter blueCounter = new Counter();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(bluePlayer, 550, 400);
        addObject(blueCounter, 50, 50);
    }

    public void act()
    {
        // Creates the Food
        count++;
        if(count > 100)
        {
            addObject(new Food(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1 ));
            count = 0;
        }
    }
}
