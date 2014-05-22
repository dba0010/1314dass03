package lanSimulation.internals;

import java.io.IOException;
import java.io.Writer;

import lanSimulation.Network;

/**
A <em>Node</em> represents a single Node in a Local Area Network (LAN).
Several types of Nodes exist.
 */
public class WorkStation extends Node
{

	public WorkStation(byte type, String name) 
	{
		super(type, name);
	}
	
	public WorkStation(byte type, String name, Node nextNode) 
	{
		super(type, name, nextNode);
	}

	@Override
	public boolean esWorkStation(Network network) {
		return true;
	}

	@Override
	public boolean noWorkStation(Network network) {
		return false;
	}

	@Override
	public void printSwitch(StringBuffer buf, Network network) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}
	
	@Override
	public void printSwitchXML(StringBuffer buf, Network network) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}

}