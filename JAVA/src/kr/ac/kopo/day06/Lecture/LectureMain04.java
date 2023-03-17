package kr.ac.kopo.day06.Lecture;

public class LectureMain04 {
	
	public static void main(String[] args) {
		
		int high = 0, time = 1;
		while(high <= 100){
			if(high < 50) {
				high += 4;
			} else {
				high += 3;
			}
			System.out.println("[" + time + "]" + "시간후 달팽이가 올라간 총 높이 : " + high + "M");
			time++;
			
			
			
		}
		
	}

}
