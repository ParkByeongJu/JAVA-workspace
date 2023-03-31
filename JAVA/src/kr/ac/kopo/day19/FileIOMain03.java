package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {
	
	//Koala.jpg -> Koala3.jpg 복사
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("iotest/Koala.jpg");// 파일은 대소문자를 구분하지 않는다.
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos);

			long start = System.currentTimeMillis();

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();

			long end = System.currentTimeMillis();
			System.out.println("Koala3.jpg에 복사완료...");
			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
//			FileClose.close(bis);
//			FileClose.close(fis);
//			FileClose.close(bos);
//			FileClose.close(bis);
			
			/*
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			 */
		}
	}

}
