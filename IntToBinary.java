public class IntToBinary {
      public static void main(String args[]){
        int num=10;
        String result=integerToBinaryConvertFun(num);
        System.out.println(result);
    }

    public static String integerToBinaryConvertFun(int num){
        StringBuilder sb =new StringBuilder();
        while(num>0){
            sb.append(num%2);
            num/=2;
        }
        return sb.reverse().toString();
    }
}
