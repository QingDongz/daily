package cn.summerwaves.regex;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Filtrate {

    private static final String fileName = "E:\\GitHub\\daily\\src\\main\\resources\\Test.txt";

    public static  List<String> getMatch() {
        List<String> matchList = new ArrayList<String>();
        List<String> removeList = new ArrayList<String>();
        try {
            Pattern regex = Pattern.compile("(?<=[\u4e00-\u9fa5]\\s)[\u4e00-\u9fa5]*(?=h)");
            Matcher regexMatcher = regex.matcher(txt2String());
            //员工
            removeList.add("毛雨星");
            removeList.add("冯馨雨");
            removeList.add("贾阳倩");
            removeList.add("张建礼");
            removeList.add("翟金超");
            removeList.add("杨泽平");
            removeList.add("张帆");
            removeList.add("汪瑶");
            removeList.add("施星");
            removeList.add("高高");
            removeList.add("李绍博");
            removeList.add("僵尸集中营");
            removeList.add("王相博");
            removeList.add("童志荣");
            //已工作
            removeList.add("杨纲");
            while (regexMatcher.find()) {
                matchList.add(regexMatcher.group());
            }

            matchList.removeAll(removeList);

        } catch (PatternSyntaxException ex) {
            // Syntax error in the regular expression
        }
        return new ArrayList<String>(new TreeSet<String>(matchList));
    }

    public static String txt2String() {
        //读取文件
        StringBuilder fileContent = new StringBuilder();
        try {
            File f = new File(fileName);
            if (f.isFile() && f.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(f), "UTF-8");
                BufferedReader reader = new BufferedReader(read);
                String line;
                while ((line = reader.readLine()) != null) {
                    fileContent.append(line);
                }
                read.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent.toString();
    }
}

