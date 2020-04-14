package Day23;

import java.io.File;

public class FileDirOutput {
	static String dir;
	public static void main(String[] args) {
		if(args.length !=1) {	//main()�޼ҵ��� �Ű������� �Է������� üũ�ϴ� if ��
			System.out.println("main() �Ű������� �Է��ϼ���");
			System.exit(1);
		}
		dir="c:/java";	//��δ� /�� ����(������), \�� ����(������)
						//�����쵵 /�� ���� �����մϴ�.
						//�����쿡�� \�� Ư������ �Է��̹Ƿ� \\ó�� �� ���� �Է��ؾ� �ϳ��� �ν��մϴ�
		File myFile = new File(dir);	//�Ű������� ���� ���丮�� ���� ��ü�� ����. "File myFile = new File(".");"�� ���� ���丮�� ���ϰ�ü ����
		String[]flist = myFile.list();	//���丮 ���� ����Ʈ�� ����
		System.out.println("�˻� ���丮 : " + dir);
		System.out.println("---------------------");
		for(int i=0; i<flist.length; i++) {				//
			File cfile = new File(dir+"/"+flist[i]);	//
			if(cfile.isDirectory()) {					//
				System.out.println("�𷹁� : " + flist[i]);
			}else {
				System.out.println("���� : " + flist[i]);
			}
		}
	}
}
