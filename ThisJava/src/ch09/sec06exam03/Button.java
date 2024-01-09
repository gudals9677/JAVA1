package ch09.sec06exam03;

public class Button {
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
	public static interface ClickListener{
		public void onClick();
	}
}
