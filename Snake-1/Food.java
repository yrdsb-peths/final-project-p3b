import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author Frankie Lin  
 * @version 2022-01-25
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b;
    int count = 0;
    // Creates the Image of the Food
    public Food(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    // Removes the Food
    public void act()
    {
        count++;
        if(count > 400)
            getWorld().removeObject(this);
        else if (isTouching(Player.class))
            getWorld().removeObject(this);
    }
}
