import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Tail here.
 * 
 * @author Frankie Lin  
 * @version 2022-01-25
 */
public class Tail extends Actor
{
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, player;
    int countLength = 0;
    int[] HighScore = {10,3,5,7,15,21,30,19};
    static int blueLength = 1;
    // Creates the Tail Image
    public Tail(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    // Ends the Game and having problems saving the High Scores, so just did all the sorting together, it prints multiple times because of the multiple collisions.
    public void act()
    {
        countLength++;
        if(countLength>15 && isTouching(Player.class))
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2); 
            bubbleSort(HighScore);
            System.out.println("High Scores: ");
            Greenfoot.stop();
            for(int i =0; i < HighScore.length; i++){
                System.out.println(HighScore[i]);
            } 
        }
        if(countLength>60)
        {
            getWorld().removeObject(this);
        }
    }
    // I was looking up ways to sort and I found bubble sort.
    public void bubbleSort(int[] val) 
    {
        boolean swapMade = true;
        int passNumber = 1,temp = 0;
        while(swapMade && passNumber <= val.length-1){
            swapMade = false;
            for(int i=0; i < val.length - passNumber; i++)
                if(val[i] > val[i+1]){
                    temp = val[i];
                    val[i] = val[i+1];
                    val[i+1] = temp;
                    swapMade = true;
                }
            passNumber++;
        }
    }
}