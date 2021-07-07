package com.study.design.bridge;

public class BridgeDesignApp {

	public static void main(String args[]) {
		// sony with old remote
		Fernsehen sonyOld=new SonyFernsehen(new alteFernbedienung());
		sonyOld.einschalten();
		sonyOld.ausschalten();
		System.out.println();
		
		//new sony tv call
		Fernsehen sonyNew= new SonyFernsehen(new NeueFernbedienung());
		sonyNew.einschalten();
		sonyNew.ausschalten();
		System.out.println();
		
		//Philips with ols remote
		Fernsehen philipsOld= new PhilipsFernsehen(new alteFernbedienung());
		philipsOld.einschalten();
		philipsOld.ausschalten();
		System.out.println();
		
		Fernsehen philipsNew=new PhilipsFernsehen(new NeueFernbedienung());
		philipsNew.einschalten();
		philipsNew.ausschalten();
		System.out.println();
	}
}

/**
 * @author 
 * TV
 *
 */
abstract class Fernsehen{
	Fernbedienung remote;
	/**
	 * @param remote
	 */
	Fernsehen(Fernbedienung remote){
		this.remote=remote;
	}
	/**
	 * switch on
	 */
	abstract void einschalten();
	
	/**
	 * switch off
	 */
	abstract void ausschalten();
}

/**
 * @author 
 * Sony TV implementation
 */
class SonyFernsehen extends Fernsehen{

	Fernbedienung remote;
	
	SonyFernsehen(Fernbedienung remote) {
		super(remote);
		this.remote=remote;
	}

	@Override
	void einschalten() {
		System.out.println("Sony Fernsehen-einschalten...");
		remote.einschalten();
		
	}

	@Override
	void ausschalten() {
		System.out.println("Sony Fernsehen-ausschalten...");
		remote.ausschalten();
		
	}
	
}

class PhilipsFernsehen extends Fernsehen{
	
	Fernbedienung remote;

	PhilipsFernsehen(Fernbedienung remote) {
		super(remote);
		this.remote=remote;
	}

	@Override
	void einschalten() {
		System.out.println("Philips Fernsehen-einschalten...");
		remote.einschalten();
		
	}

	@Override
	void ausschalten() {
		System.out.println("Philips Fernsehen-ausschalten...");
		remote.ausschalten();
		
	}
	
}

/**
 * @author 
 * Remote
 *
 */
interface Fernbedienung{
	/**
	 * switch on
	 */
	void einschalten();
	
	/**
	 * switch off
	 */
	void ausschalten();
}

/**
 * @author 
 * old remote
 *
 */
class alteFernbedienung implements Fernbedienung{

	@Override
	public void einschalten() {
		System.out.println("alte Fernbedienung-einschelten...");
		
	}

	@Override
	public void ausschalten() {
		System.out.println("alte Fernbedienung-ausschalten...");
		
	}
	
}

class NeueFernbedienung implements Fernbedienung{

	@Override
	public void einschalten() {
		System.out.println("neue Fernbedienung-einschelten...");
		
	}

	@Override
	public void ausschalten() {
		System.out.println("neue Fernbedienung-ausschalten...");
		
	}
	
}

