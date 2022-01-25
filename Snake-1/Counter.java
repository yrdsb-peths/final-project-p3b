import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author Frankie Lin  
 * @version 2022-01-25
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    // Creates the score counter
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }
    // Shows the score counter
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void addScore()
    {
        score++;
    }
}