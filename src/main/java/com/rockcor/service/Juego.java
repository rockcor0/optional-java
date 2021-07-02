/**
 * 
 */
package com.rockcor.service;

/**
 * @author ricardodelgadocarreno
 *
 */
public class Juego {

	private String name;
	private String console;
	private boolean isGood;

	/**
	 * 
	 */
	public Juego() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param console
	 * @param isGood
	 */
	public Juego(String name, String console, boolean isGood) {
		super();
		this.name = name;
		this.console = console;
		this.isGood = isGood;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the console
	 */
	public String getConsole() {
		return console;
	}

	/**
	 * @param console the console to set
	 */
	public void setConsole(String console) {
		this.console = console;
	}

	/**
	 * @return the isGood
	 */
	public boolean isGood() {
		return isGood;
	}

	/**
	 * @param isGood the isGood to set
	 */
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}

}
