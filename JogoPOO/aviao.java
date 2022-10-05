import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aviao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aviao extends Actor
{
    /**
     * Act - do whatever the aviao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act()
    {
        w = getWorld();
        // Add your action code here.
        mover();
        tiro();
    }
    
    public void mover(){
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY()-10);
        }
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY()+10);
        }
        
    }
    
    public void tiro(){
        World w = getWorld();
        if(Greenfoot.isKeyDown("space"))
        {   
            
            w.addObject(new disparo(), getX()+50, getY());
        }
        
    }
}
