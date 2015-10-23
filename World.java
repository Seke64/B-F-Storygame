
public class World 
{//Don't need

	Room[] rooms = new Room();

	Room room1 = new Room(1);
	Room room2 = new Room(2);
	Room room3 = new Room(3);
	Room room4 = new Room(4);
	
	Room currentRoom;
	
	public void moveFromRoom(Direction direction)
	{
		if(currentRoom == null)
		{
			return;
		}
		
		if(currentRoom.id == 1)
		{
			if(direction.way.equals("right"))
			{
				currentRoom = room2;
			}
			if(direction.way.equals("down"))
			{
				currentRoom = room3;
			}
		}
		
		else if(currentRoom.id == 2)
		{
			if(direction.way.equals("left"))
			{
				currentRoom = room1;
			}
			if(direction.way.equals("down"))
			{
				currentRoom = room4;
			}
		}

		else if(currentRoom.id == 3)
		{
			if(direction.way.equals("up"))
			{
				currentRoom = room1;
			}
			if(direction.way.equals("right"))
			{
				currentRoom = room4;
			}
			if(direction.way.equals("left"))
			{
				currentRoom = null;
			}
		}

		else if(currentRoom.id == 4)
		{
			if(direction.way.equals("left"))
			{
				currentRoom = room3;
			}
		}
	}
	
}
