package divya;

public class trafficlight {
	
		private String color;
		private int duration;
		
		public trafficlight(String light,int duration) {
			this.color= color;
			this.duration=duration;
		}
		public void changeColor(String newColor) {
			color = newColor;
		}
		public boolean isRed() {
			return color.equals("red");
			
		}
		public boolean isgreen()
		{
			return color.equals("green");
			
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration=duration;
		}

		public class Main{
			   public static void main(String[] args) {
			     trafficlight light = new trafficlight("red", 30);

			     System.out.println("The light is red: " + light.isRed());
			     System.out.println("The light is green: " + light.isgreen());

			     light.changeColor("green");

			     System.out.println("The light is now green: " + light.isgreen());
			     System.out.println("The light duration is: " + light.getDuration());
			     light.setDuration(20);
			     System.out.println("The light duration is now: " + light.getDuration());
			   }
			 }
		}

