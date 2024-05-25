package txtPakge.Demo4.test;

public class StringConnect {
    public static void main(String[] args) {
        //定义一个方法,把Int数组中的数据按照指定格式拼接成一个字符串返回,调用该方法,并在控制台输出结果

        //定义数组
        int[] arr={1,3,45,6,7,2,4};
        String result="";
        //字符拼接
        if(arr==null){
        } else if (arr.length == 0) {
            result="[]";
        }else {
            result="[";
            for (int i = 0; i <=arr.length-1; i++) {
                //注意先后顺序,拼接方向不同
                if(i!=arr.length-1){
                    result=result+arr[i]+',';
                }else {
                    result=result+arr[i];
                }
            }
            result=result+"]";
        }
        //打印结果
        System.out.printf("拼接结果是:%s",result);
    }
}
