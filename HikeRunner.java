/*
 * Activity 2.5.6
 */
public class HikeRunner
{
  public static void main(String[] args)
  {
    Hike hike1 = new Hike("Cliff Ridge", 3.6);
    Hike hike2 = new Hike("Apple Orchard", 4);
    Hike hike4 = new Hike();
    Hike hike5 = new Hike("");

    hike1.setFavorite(hike2);
    
    Hike hike3 = new Hike("Chesnut Knob", 2.6);
    hike2.setFavorite(hike3);

    hike1.setFavorite(hike3);

    System.out.println(hike4);

  }
}