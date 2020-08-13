package usantatecla.State.stateFine;

import usantatecla.Utils.utils.Printer;

public abstract class Mood {
	
	protected Printer printer = Printer.getInstance();
	
	protected Mood nextMood;
	
	protected abstract void eat();
	protected abstract void dance();
	protected abstract void work();

}
