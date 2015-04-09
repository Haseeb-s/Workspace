
public class Room {
	public String wall_color;
	public String floor;
	public int windows;
	
public Room(){
	this.wall_color = "white";
	this.floor = "carpet";
	this.windows = 0;
}

public Room(String color, String floorstuff, int window){
	this.wall_color = color;
	this.floor = floorstuff;
	this.windows = window;
}


public String getWallColor(){
	return this.wall_color;
}

public String getFloor(){
	return this.floor;
}

public int getWindows(){ 
	return this.windows;
}
public void setWallColor(String color){
	this.wall_color = color;
}

public void setFloor(String floor){
	this.floor = floor;
}

public void setWindows(int window){ 
	this.windows = window;
}
public String toString(){
	return "Wall Color: " + this.wall_color + ", Floor: " + this.floor + ", # of windows: " + this.windows; 
}

}
