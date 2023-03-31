package kr.ac.kopo.day19.homeworkReview;

/*
	//alt + shift + s 누른후 c선택 : 디폴트 생성자 생성
	 					   o선택 : 매개변수 가진 생성자 생성
	 					   r선택 : getter/setter 메소드 생성
	 					   s선택 : toString() 오버라이드
	 					   v선택 : 오버라이드 생성
 */
public class Member {
	
	private String id;
	private String password;
	
	public Member() {
		super();
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	public Member(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + "]";
	}

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
