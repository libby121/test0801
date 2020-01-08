package ExceptionTelevision;

import java.util.Scanner;

public class Tv {

	private String name;
	private int volume;
	private boolean silenceMode;

	public Tv(int volume, boolean silenceMode) {
		this.volume = volume;
		this.silenceMode = silenceMode;
	}

	public Tv(String name, int volume, boolean silenceMode) {//setvolume should appear here too
		super();
		this.name = name;
		if(volume<=100 && volume>0)this.volume=volume;//if(!volume<=100 &&volume>0)throw  new exception
		this.silenceMode = silenceMode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) throws Exception {
		if(volume<0||volume>100)
			throw new Exception("Invalid volume");
		
		
		
		//Scanner sc = new Scanner(System.in);
		//volume = sc.nextInt();

		this.volume = volume;
		System.out.println(volume);
		// sc.close(); //where should it be positioned
	}

	public boolean isSilenceMode() {

		return silenceMode;
	}

	public void setSilenceMode(boolean silenceMode) {// change to the opposite
		// mode
		if (silenceMode)
			this.silenceMode = false;

		else
			this.silenceMode = true;

	}
	public int changeVol(int vol) throws InvalidVolumeException {//should it return int
		if ((vol  >= 0) && (vol <= 10)) {
			volume = vol;
			System.out.println("New volume is: " + volume);
			return volume;
		} else {
			throw new InvalidVolumeException();
		}
	}

}
