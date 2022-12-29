package game;

import java.io.*;
import java.util.*;

public class indoor {
	public int id;
	public String name;

	public void inDoor() {
		this.id = 0;
		this.name = "X.Y.Z.";
	}

	public void inDoor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name + " Indoor Player.");
	}
}