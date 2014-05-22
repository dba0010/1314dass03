package lanSimulation.internals;

import java.io.IOException;
import java.io.Writer;

import lanSimulation.Network;

/**
A <em>Node</em> represents a single Node in a Local Area Network (LAN).
Several types of Nodes exist.
 */
public class Printer extends Node
{

	public Printer(byte type, String name) 
	{
		super(type, name);
	}
	
	public Printer(byte type, String name, Node nextNode) 
	{
		super(type, name, nextNode);
	}

	@Override
	public boolean esPrinter(Network network) {
		return true;
	}
	
	@Override
	public void printSwitch(StringBuffer buf, Network network) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}
	
	@Override
	public void printSwitchXML(StringBuffer buf, Network network) {
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
}