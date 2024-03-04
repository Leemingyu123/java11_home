package sec2;
//RemoteControl 로 선언하여 Remotecontrol, Screen, Television, Audio로 형 변환하여 활용하기
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r; 
		r= new RemoteControl() {
			int volume;
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
		};
		Screen x;
		x = new Screen() {
			int zoom;
			int lightness;
			int volume;
			
			
			public void turnOff() {
				System.out.println("전원 OFF");
			}
		
			public void turnOn() {
				System.out.println("전원 ON");
			}

			public int light() {
				System.out.println();
				if(this.lightness <255 && this.lightness < 0) {
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				System.out.println();
				if(this.lightness <255 && this.lightness < 0) {
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				if(zoom>=-500 && zoom<=500) {
					zoom+=50;
				}
				return zoom;
			}

			public int zoomout() {
				if(zoom>=-500 && zoom<=500) {
					zoom-=50;
				}
				return zoom;
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
		};
	

		
	}
	
}
