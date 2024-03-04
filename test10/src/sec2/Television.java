package sec2;

public class Television implements Screen {
	
	private static final int MAX = 0;
	int volume;
	int lightness;
	int darkness;
	int zoom;
	
	
	

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX) {
			this.volume = RemoteControl.MAX;
		} else if(volume<MIN) {
			this.volume = RemoteControl.MIN;
		} else {
			this.volume = volume;
		}
		
	}

	@Override
	public int light() {
		System.out.println();
		if(this.lightness <255 && this.lightness < 0) {
			this.lightness++;
		}
		return this.lightness;
	}

	@Override
	public int dark() {
		System.out.println();
		if(this.lightness <255 && this.lightness < 0) {
			this.lightness--;
		}
		return this.lightness;
		
	}

	@Override
	public int zoomin() {
		if(zoom>=-500 && zoom<=500) {
			zoom+=50;
		}
		return zoom;
	}

	@Override
	public int zoomout() {
		if(zoom>=-500 && zoom<=500) {
			zoom-=50;
		}
		return zoom;
	}
	
	
	

}
