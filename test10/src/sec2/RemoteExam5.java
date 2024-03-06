package sec2;
//RemoteControl 로 선언하여 Remotecontrol, Screen, Television, Audio로 형 변환하여 활용하기
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r; 	//RemoteControl 객체 선언
		r= new RemoteControl() {	//RemoteControl로 형 변환
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
		
		r = new Screen() {	//Screen으로 형 변환
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
				System.out.println("밝게");
				if(this.lightness <255 && this.lightness < 0) {
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				System.out.println("어둡게");
				if(this.lightness <255 && this.lightness < 0) {
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				System.out.println("50% 확대");
				if(zoom>=-500 && zoom<=500) {
					zoom+=50;
				}
				return zoom;
			}

			public int zoomout() {
				System.out.println("50% 축소");
				if(zoom>=-500 && zoom<=500) {
					zoom-=50;
				}
				return zoom;
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		r= new Television();
		r= new Audio();
	

		
	}
	
}
