package txtPakge.Demo4.test;

import java.util.Scanner;

public class getword {
    public static void main(String[] args) {
        /*给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度.
        单词是指仅由字母组成、不包含任何空格字符的最大子字符串.
        示例 1:输入:s="Hello World”  输出:5
        解释:最后一个单词是“World”，长度为5.
        示例 2:输入:s="fly me  输出:4tothe moon1.
        解释:最后一个单词是“moon”，长度为4.
        示例 3:输入:s="luffy is still joyboy.  输出:6
        解释:最后一个单词是长度为6的“joyboy”.
        */


        //设置字符串输入
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        System.out.println("请输入单词组,以空格隔开");
        //sc.nextline()会把空格也读取进去,所以用nextline()读取一行,再用sb.append()把读取的内容装入sb
        sb.append(sc.nextLine());
        System.out.println(sb);

        //把字符串切片装入数组
        //统计单词个数分配字符串长度
        int sum=0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)==' '){
                sum++;
                if(sb.charAt(i+1)==' '){
                    System.out.println("字符之间只能有一个空格,格式不正确请重新输入:");
                    //令i等于0,可以重新读取字符串
                    i=0;sum=0;
                    //同时把sb容器清空,重新读取字符串
                    sb.delete(0,sb.length());
                    sb.append(sc.nextLine());
                }
            }
        }
        System.out.println(sum);
        String[] words=new String[sum+1];
        //对单词切割分别装入字符串数组
        int number=0;
        for (int i = 0,j=0; i<sb.length();) {
            for(j=i;j<sb.length();j++){
                if(sb.charAt(j)==' '){
                    break;
                }
            }
            System.out.println("-----------------");
            System.out.println(i);
            System.out.println(j);
            if(j<sb.length()){
                if(sb.charAt(j+1)!=' '){
                    words[number]=sb.toString().substring(i,j);
                    System.out.println(words[number]);
                    number++;
                    i=j+1;
                }
            } else if (j==sb.length()) {
                words[number]=sb.toString().substring(i);
                System.out.println(words[number]);
                i=j;
            }
        }
        System.out.println("-----------------");
        System.out.println("所有单词是:");
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s  ",words[i]);
        }
        System.out.println();
        System.out.println("-----------------");
        System.out.println("组后一个单词是:");
        System.out.println(words[words.length-1]);

    }
}
