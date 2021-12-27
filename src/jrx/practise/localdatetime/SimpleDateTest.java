package jrx.practise.localdatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest {

	public static void main(String[] args) {

		String strDate1 = "2008-10-19 10:11:30.345" ;
        String strDate2 = "2008��10��19�� 10ʱ11��30��345����" ;
        // ׼����һ��ģ�壬���ַ�������ȡ����������  
        String pat1 = "yyyy-MM-dd HH:mm:ss.SSS" ;  
        // ׼���ڶ���ģ�壬����ȡ����������ֱ�Ϊָ���ĸ�ʽ  
        String pat2 = "yyyy��MM��dd�� HHʱmm��ss��SSS����" ;  
        SimpleDateFormat sdf1 = new SimpleDateFormat(pat1) ;        // ʵ����ģ�����  
        SimpleDateFormat sdf2 = new SimpleDateFormat(pat2) ;        // ʵ����ģ�����  
        Date d = null ;  
        try{  
            d = sdf2.parse(strDate2) ;   // ���������ַ����е�������ȡ����
        }catch(Exception e){            // ����ṩ���ַ�����ʽ�д���������쳣����  
            e.printStackTrace() ;       // ��ӡ�쳣��Ϣ  
        }  
        System.out.println(sdf1.format(d)) ;    // �����ڱ�Ϊ�µĸ�ʽ

	}

}
