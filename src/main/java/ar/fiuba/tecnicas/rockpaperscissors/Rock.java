/*
 * Class Rock
 * Author: Ackermann Alfredo A.
 * Padrón: 90251
 */

package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {
	
	public Rock(){	
	}
	public Rock vs(Scissor scissors){
		return this;
	}
	public Paper vs(Paper paper){
		return paper;
	}
	public Rock vs(Rock rock){
		return this;
	}
}
