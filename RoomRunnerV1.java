
public class RoomRunnerV1 {

	
	public static void main(String [] args)
	{
		World world = setupWorld();

		NewHero hero = NewHero.choose();
		world.currentRoom = world.room2;

		while(world.currentRoom != null)
		{
			System.out.println(hero.name + " is in room " + world.currentRoom);
			Dfl.line("\nWhat would you like to do?\n>");
			String value = Keyboard.readString();
			
			if (value.split(" ")[0].equals("go"))
			{
				Direction direction = world.currentRoom.findDirection(value.split(" ")[1]);
			
				if(direction == null){
					System.out.println("INVALID DIRECTION!!");
					continue;
				}
			
				world.moveFromRoom(direction);
			}
			
			else
				Dfl.out("Invalid.")
		}
		
		System.out.println("Congratulations, you escaped the world! ");
	}

	private static World setupWorld() {
		World aWorld = new World();

		aWorld.room1.directions[0] = new Direction("door", "right");
		aWorld.room1.directions[1] = new Direction("stairs", "down");
		
		aWorld.room2.directions[0] = new Direction("door", "left");
		aWorld.room2.directions[1] = new Direction("trap door", "down");
		
		aWorld.room3.directions[0] = new Direction("stairs", "up");
		aWorld.room3.directions[1] = new Direction("door", "right");
		aWorld.room3.directions[2] = new Direction("window", "left");

		aWorld.room4.directions[1] = new Direction("door", "left");
		
		return aWorld;
	}
}
