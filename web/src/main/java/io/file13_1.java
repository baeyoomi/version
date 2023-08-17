package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class file13_1 {

	public static void main(String[] args) {
		try {
			data11_1 dt = new data11_1();
			dt.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류");
		}

	}

}

class data11_1{
	public void abc() throws Exception {
        InputStream is = new FileInputStream("E:\\gumi\\0817\\cat.jpg");
        byte[] file = new byte[is.available()];
		int b = is.read(file);
        OutputStream os = new FileOutputStream("E:\\gumi\\0817\\cat2.jpg");
        os.write(file);

        int check = 0;
        for (int i = 0; i < file.length; i++) {
            os.write(file,0,i);
            check++;
            if (check % 100 == 0) {
                System.out.println(check + "%");
            }
           
        }
		os.flush();
		os.close();
		is.close();

	}
}