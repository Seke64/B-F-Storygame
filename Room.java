
public class Room {

	public int id;
	pubic final int UP = 0, DOWN = 1, NORTH = 2, EAST = 3, SOUTH = 4, WEST = 5;
	private int[] canMove;
	private String[] moveVia;
	
	public Direction [] directions = new Direction[4];
	
	public Room(int anId){
		id = anId;
	}
	
	public Room (int anId, int[] _canMove /*-1 if no move in that direction, or room number that connects from that direction*/, String[] _moveVia)
	{
		id = anId;
		canMove = _canMove;
		moveVia = _moveVia;
	}
	
	public int canGo(int direction)
	{
		if (direction >= 0 && direction <= 5)
			return canMove[direction];
		else
			return -2;
	}
	
	public String howGo(int direction)
	{
		if (direction >= 0 && direction <= 5)
			return moveVia[direction];
		else
			return null;
	}
	
	public Direction findDirection(String way){
		for(int i = 0 ; i < 4; i++){
			if(directions[i] != null && directions[i].way.equals(way)){
				return directions[i];
			}
		}
		return null;
	}
	
	
	public String toString(){
		String roomString = id + " and has the options of\n";
		
		for(int i = 0 ; i < 4; i++){
			if(directions[i] != null){
				roomString += directions[i].name + " going " + directions[i].way + "\n";
			}
		}
		
		return roomString;
		
	}
	
}
