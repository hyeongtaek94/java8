package Day23;

import java.io.File;

public class FileDirOutput {
	static String dir;
	public static void main(String[] args) {
		if(args.length !=1) {	//main()메소드의 매개변수의 입력유무를 체크하는 if 문
			System.out.println("main() 매개변수를 입력하세요");
			System.exit(1);
		}
		dir="c:/java";	//경로는 /로 구분(리눅스), \로 구분(윈도우)
						//윈도우도 /로 구분 가능합니다.
						//윈도우에서 \는 특수문자 입력이므로 \\처럼 두 개를 입력해야 하나로 인식합니다
		File myFile = new File(dir);	//매개변수로 받은 디렉토리로 파일 객체를 생성. "File myFile = new File(".");"은 현재 디렉토리로 파일객체 생성
		String[]flist = myFile.list();	//디렉토리 파일 리스트를 구함
		System.out.println("검색 디렉토리 : " + dir);
		System.out.println("---------------------");
		for(int i=0; i<flist.length; i++) {				//
			File cfile = new File(dir+"/"+flist[i]);	//
			if(cfile.isDirectory()) {					//
				System.out.println("디레곹리 : " + flist[i]);
			}else {
				System.out.println("파일 : " + flist[i]);
			}
		}
	}
}
