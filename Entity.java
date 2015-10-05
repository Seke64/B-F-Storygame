public class Entity
{
  protected String name;
  
  public Entity()
  {
    name = "DEFAULT";
  }
  
  public Entity(String _name)
  {
    name = _name;
  }
  
  public String toString()
  {
    return "A " + this.getClass().getName() + " with a name of " + name + ".";
  }
}
