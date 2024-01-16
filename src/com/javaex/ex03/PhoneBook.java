package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBook {

	public static void main(String[] args) throws IOException{

		//READAR 준비
		//리더+버퍼 -->빨대 PhoneDB.txt STF-8

		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while(true) {
			//파일을 1줄씩 읽는다.
			String str = br.readLine();

			String[] personinfo = str.split(",");
			//[이효리] [010-2222-3333] [031-2323-4441]

			//String name = personinfo[0];

			/*
			System.out.println(personinfo[0]);
			System.out.println(personinfo[1]);
			System.out.println(personinfo[2]);
			 */

			String name = personinfo[0];
			String hp = personinfo[1];
			String company = personinfo[2];

			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println(" ");
			
			br.close();

		}

		

		//null이면 반복문을 나간다(글자가 없으면)
		//if(str==null) {
		//	break;
		//}
		//출력한다
		//System.out.println(str);


		//반복
		//파일을 I를 읽는다
		//String str = br.readLine();
		//System.out.println(str);
		//,로 분리한다
		//name = 정우성
		//hp = 010-0220-2222
		//company = 02-222-2222

		//출력한다
		//null 이면 반복종료

		//종료


	}
}



