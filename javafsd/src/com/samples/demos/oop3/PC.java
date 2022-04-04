package com.samples.demos.oop3;
// composition
public class PC {
      private BoxCase boxcase;
      private Monitor monitor;
      private Motherboard motherBoard;
	public PC(BoxCase boxcase, Monitor monitor, Motherboard motherBoard) {
		this.boxcase = boxcase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
      
	public void powerUp() {
		boxcase.pressPowerButton(); // boxcase has a power supply
		drawLogo();
		motherBoard.loadProgram("Window 10");
		
	}
	
	private void drawLogo() {
		monitor.drwPixelAt(1222,50, "yellow");
	}
      
}
