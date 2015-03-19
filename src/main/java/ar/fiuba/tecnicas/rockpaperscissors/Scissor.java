/*
 * Class Scissor
 * Author: Ackermann Alfredo A.
 * Padrón: 90251
 */

package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissor {
	public Scissor(){
		
	}
	public Scissor vs(Paper paper){
		return this;
	}
	public Rock vs(Rock rock){
		return rock;
	}
	public Scissor vs(Scissor scissor){
		return this;
	}
}
