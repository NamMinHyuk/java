package com.test06;

public class MyProfile extends Profile implements Display, Job {
	
	private String loc;
	
	// 기본 생성자 안되는 이유가 뭘까? -> 부모클래스에 기본생성자가 없기 때문
	public MyProfile(String name, String phone) { 
		super(name, phone); // 부모클래스 파라미터 2개 짜리 생성자에 name과 phone 
	}

	// 사실 setter의 기능을 하고 있다.
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public void display() {
		super.printProfile();
		System.out.println("회사 주소 : " + loc);
		//JOB_ID = "Singer"; (X)
		System.out.println("직무 : " + JOB_ID);
		// super.JOB_ID -> super는 부모 "객체" / JOB_ID는 인터페이스꺼라서 super 사용 못함
		// Job.JOB_ID로 사용해야됨! (Job.은 생략한거)
	}
	
}
