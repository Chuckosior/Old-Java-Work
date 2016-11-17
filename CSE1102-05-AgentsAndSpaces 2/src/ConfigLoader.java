
// Project 5: Agents and Spaces2
// CSE1102 Spring 2015
// Chris Kosior
// 3/29/2015
// TA: Yusuf Albayram
// Section: 12
// Instructor: Jeffrey A. Meunier
import jeff.ini.*;
import java.util.*;
import java.io.*;

public class ConfigLoader 
{
	private Ini _ini;
	private HashMap<String, Space> _spaces = new HashMap<String, Space>();
	private HashMap<String, Portal> _portals = new HashMap<String, Portal>();
	private HashMap<String, Agent> _agents = new HashMap<String, Agent>();

	public ConfigLoader(File iniFile)
	{
		_ini = new Ini(iniFile);
	}

	private void _buildSpaces()
	{

		for(String spaceName : _ini.keys("spaces"))
		{
			String spaceDescription = _ini.get("spaces",spaceName);
			String imageName = _ini.get("images",spaceName);
			Space spaceInstance = new Space(spaceName, spaceDescription, imageName, null);
			_spaces.put(spaceName,  spaceInstance);
		}
	}
	private void _buildPortals()
	{
		for(String portalName : _ini.keys("portals"))
		{
			String portalDescription = _ini.get("portals", portalName);
			Portal portalInstance = new Portal(portalName, portalDescription, null);
			_portals.put(portalName, portalInstance);
		}
	}
	private void _buildExits()
	{
		for(String exitName : _ini.keys("exits"))
		{
			Space exitSpace = _spaces.get(exitName);
			Portal exitPortal = _portals.get(_ini.get("exits", exitName));
			exitSpace.setPortal(exitPortal);
		}
	}
	private void _buildDestinations()
	{
		for(String portalName : _ini.keys("destinations"))
		{
			String location = _ini.get("destinations", portalName);
			Portal p1 = _portals.get(portalName);
			Space s1 = _spaces.get(location);

			p1.setDestination(s1);
			if(s1 == null)
			{
				System.out.print("error3: Space is null, terminating program");
				System.exit(1);
			}
		}
	}
	private void _buildAgents()
	{
		for(String agentName : _ini.keys("agents"))
		{
			Space realSpace = _spaces.get(_ini.get("agents", agentName));
			if(realSpace == null)
			{
				System.out.print("error2: Space is null still, terminating prog");
				System.exit(1);
			}
			
			Agent realAgent = new Agent(agentName, realSpace);
			_agents.put(agentName, realAgent);
		}
	}
	private Agent _selectStartAgent()
	{
		Agent startAgent = _agents.get(_ini.get("start","agent"));			
		if(startAgent == null)
		{
			System.out.println("error1: Agent is null, terminating program");
			System.exit(1);
			return null;
		}
		return startAgent;
	}
	public Agent buildAll()
	{
		_buildSpaces();
		_buildPortals();
		_buildExits();
		_buildDestinations();
		_buildAgents();
		return _selectStartAgent();
	}
}

