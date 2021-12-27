package jrx.practise.messageformat;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class MessageFormatPractise {
    public static void main(String[] args) {

        String msg = "{0}{1}{2}{3}{4}{5}{6}{7}{8}";
        Object [] array = new Object[]{"A","B","C","D","E","F","G","H","I",};
        String value = MessageFormat.format(msg, array);
        System.out.println(value);

        String value1 = MessageFormat.format("oh, {0} is ''a'' pig", "lisi");
        System.out.println(value1);  // 输出：oh, ZhangSan is 'a' pig

        String msg1 = "oh, {0} is \"a\" pig";
        System.out.println(MessageFormat.format(msg1, "zhangsan"));

        System.out.println(MessageFormat.format("{0}{1}", 1, 2)); // 结果12
        System.out.println(MessageFormat.format("'{0}{1}", 1, 2)); // 结果{0}{1}
        System.out.println(MessageFormat.format("'{0}'-{1}", 1, 2)); // 结果{0}-2

        String value2 = MessageFormat.format("oh, {0,number,#.#} is good num", Double.valueOf("3.1415"));
        System.out.println(value2);  // 输出：oh, 3.1 is good num

        String value3 = MessageFormat.format("oh, } is good num", Double.valueOf("3.1415"));
        System.out.println(value3);  // 输出：oh, } is good num

//        String value4 = MessageFormat.format("oh, { is good num", Double.valueOf("3.1415"));
//        System.out.println(value4);  // java.lang.IllegalArgumentException: Unmatched braces in the pattern.

        System.out.println(MessageFormat.format("'{'{0}}", "X-rapido")); // {X-rapido}

        String value5 = MessageFormat.format("oh, {<!-- -->{ is good num", "d");
        System.out.println(value5);  // oh,

        String value6 = MessageFormat.format("oh, }} is good num", "d");
        System.out.println(value6);  // oh, }} is good num

        String message = "oh, {0} is a pig";
        MessageFormat messageFormat = new MessageFormat(message);
        Object[] array2 = new Object[]{"ZhangSan"};
        String value7 = messageFormat.format(array2);

        System.out.println(value7);

    }

    private static void choiceFormat() {
        MessageFormat form = new MessageFormat("{0} say: The disk \"{1}\" contains {2}.");
        double[] filelimits = {0,1,2};  //区间 [0,1) [1,2) [2,+)
        String[] filepart = {"no files","one file","{2,number} files"};//使用
        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
        form.setFormatByArgumentIndex(2, fileform);//参数设置在模板form的{2}

        int fileCount = 1273;
        String diskName = "MyDisk";
        Object[] testArgs = {"I", diskName,new Long(fileCount)};


        System.out.println(form.format(testArgs));//I say: The disk "MyDisk" contains 1,273 files.
    }
}
