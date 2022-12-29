package game;

import java.io.*;
import java.util.*;

public class outdoor {
	public int id;
	public String name;

	public void outDoor() {
		this.id = 0;
		this.name = "A.B.C.";
	}

	public void outDoor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name + " Outdoor Player.");
	}
}
