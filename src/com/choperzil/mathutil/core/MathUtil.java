/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.choperzil.mathutil.core;

/**
 *
 * @author Mr. Tuan
 */
public class MathUtil {

    //trong class này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó mà ko cần lưu lại các trạng thái/giá trị
    //chọn thiết kế là hàm static
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4... n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid arguement. N must be between 0..20");
//        
//        if (n == 0 | n == 1)
//            return 1; //kết thúc cuộc chơi sớm nếu nhận nhx đầu vào đặc biệt
//        
//        long product = 1; // tích phân dồn, thuật toán heo đất, ốc bu nhồi thịt
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    //học lại đệ quy trong vòng 30 giây = RECURSION
    //Hiện tượng gọi lại chính mình trong quy mô khác
    //Ví dụ: con búp bê Nga, giống nhau và lông nhau
    //búp bê to, nhỏ hơn, nhỏ hơn nx, nhỏ hơn nx... đến điểm dừng
    //tính giùm tui 6!
    //n! = 1.2.3.4.5.6... .n
    //6! = 6 * 5!
    //5! = 5 * 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //1! = 1
    //quy ước 1! = 0! = 1;
    //chốt hạ: n! = n * (n - 1)!
    public static long getFactorial(int n) {

        if (n < 0 || n >20)
            throw new IllegalArgumentException("n must be 0..20. Plz!");
        
        if (n == 0 | n == 1) 
            return 1; //kết thúc cuộc chơi sớm nếu nhận nhx đầu vào đặc biệt
         
        return n * getFactorial(n - 1);
        
    }

}
