package com.mojang.ld22.item;

import com.mojang.ld22.gfx.Color;

public class ToolType {
	public static ToolType shovel = new ToolType("Shvl", 0); //creates the shovel tool type, the number next to the name deals with the sprite location.
	public static ToolType hoe = new ToolType("Hoe", 1); //creates the hoe tool type, the number next to the name deals with the sprite location.
	public static ToolType sword = new ToolType("Swrd", 2); //creates the sword tool type, the number next to the name deals with the sprite location.
	public static ToolType pickaxe = new ToolType("Pick", 3); //creates the pick tool type, the number next to the name deals with the sprite location.
	public static ToolType axe = new ToolType("Axe", 4); //creates the axe tool type, the number next to the name deals with the sprite location.
	public static ToolType anime = new ToolType("Anime", 5, "FireHands", Color.get(-1, 255, 200, 200)); //creates the axe tool type, the number next to the name deals with the sprite location.

	public final String name;// name of the type
	public final String nameOverride;
	public final int sprite; // sprite location on the spritesheet
	public final int colorOveride;

	private ToolType(String name, int sprite) {
		this.name = name; // adds the name
		this.sprite = sprite; //adds the sprite location number
		this.nameOverride = "";
		this.colorOveride = -1;
	}
	private ToolType(String name, int sprite, String realName) {
		this.name = name; // adds the name
		this.sprite = sprite; //adds the sprite location number
		this.nameOverride = realName;
		this.colorOveride = -1;
	}
	private ToolType(String name, int sprite, String realName, int color) {
		this.name = name; // adds the name
		this.sprite = sprite; //adds the sprite location number
		this.nameOverride = realName;
		this.colorOveride = color;
	}
}
