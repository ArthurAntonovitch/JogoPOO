import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inimigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inimigo extends Actor
{
    /**
     * Act - do whatever the inimigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        World a = getWorld();
        move(-5);
        if(isAtEdge()){
            //a.removeObject(this);
            setLocation(1500, getY());
        }
        
    }
}
