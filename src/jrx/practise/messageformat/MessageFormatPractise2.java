package jrx.practise.messageformat;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class MessageFormatPractise2 {
    public static void main(String[] args) {
        choiceFormat();
    }

    private static void choiceFormat() {
        MessageFormat form = new MessageFormat("{0} say: The disk \"{1}\" contains {2}.");
        double[] filelimits = {0,1,2};  //区间 [0,1) [1,2) [2,+)
        String[] filepart = {"no files","one file","{2,number} files"};//使用
        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
        form.setFormatByArgumentIndex(1, fileform);//参数设置在模板form的{2}

        int fileCount = 1273;
        String diskName = "MyDisk";
        Object[] testArgs = {"I", diskName,new Long(fileCount)};


        System.out.println(form.format(testArgs));//I say: The disk "MyDisk" contains 1,273 files.
    }
}
