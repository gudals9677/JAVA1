package ch09.sec07exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//Button 객체 생성
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		//Button 객체에 Click Event 처리 객체 설정
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼이 클릭되었습니다.");
			}
		});

		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼이 클릭되었습니다.");
			}
		});
		
		btnOk.click();
		btnCancel.click();

}
}
