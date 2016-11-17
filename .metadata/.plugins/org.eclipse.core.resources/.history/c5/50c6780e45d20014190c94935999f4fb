//Agents and Spaces
//CSE1102 Project 04, Spring Semester 2015
//Chris Kosior
//2/22/15
//Yusuf Albayram
//Section 12
public class Main {
	public static void main(String[] args) {
		{
			Space dungeon = new Space();
			dungeon.setName("in a dungeon");
			dungeon.setDescription("and see a field to the north...sweet freedom from this dungeon...");
			Space north = new Space();
			north.setName("north");
			north.setDescription("norther...maybe there's some candy that way");
			Space norther = new Space();
			norther.setName("norther");
			norther.setDescription("over the edge of a cliff, signifying your journey is over");
			Portal gate = new Portal();
			gate.setName("gate");
			gate.setDirection("a gate used to go north");
			gate.setDestination(north);
			dungeon.setPortal(gate);
			Portal bridge = new Portal();
			bridge.setName("bridge");
			bridge.setDirection("a bridge used to reach the northest of north");
			bridge.setDestination(norther);
			north.setPortal(bridge);
			Agent dungeonMan = new Agent();
			dungeonMan.setName("North Quest: The northening");
			dungeonMan.setLocation(dungeon);
			CommandInterpreter.run(dungeonMan);
		}
	}
}


