/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.choperzil.mathutil.test.core;

import com.choperzil.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Mr. Tuan
 */
public class MathUtilTest {
    //đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểm tra code chính - hàm tínhGiaiThừa() bên
    //class.core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp vs JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //có nhiều @Test ứng vs nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào, m phải chạy đúng
        long expected = 1; //hi vọng 0! = 1
        
        //long actual = ;//gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sáng expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        //gộp thêm vào case thành công/đưa đầu vào ngon!!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tui mún 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tui mún 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //tui mún 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //tui mún 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //tui mún 6! == 720
        
    }   //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko
        //nếu giống nhau -> thảy màu xanh đường - đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu KO GIỐNG NHAU -> thảy màu đỏ đèn đường
        //                     hàm ý expected và actual ko giống nhau
      
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng đc n! - done
    //2. đưa data vào cà chớn, âm, >20: THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện vs n cà chớn này
    
    //nếu hàm nhận vào n < 0 || n > 20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    //nếu hàm  nhận vào n < 0 || n > 20 mà hàm éo ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ
    
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường, ngoại lệm ngoài dự tính, dự liệu
    //là nhx thứ ko thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường - cách dùng có xuất hiện hay ko
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value!!!
    
    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //              NHƯNG KO PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //              KO PHẢI HÀM NÉM SAI 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                   //sẽ ném về ngoại lệ NumberFormat...
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                   //sẽ ném về ngoại lệ NumberFormat...
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    //Xài Lambda
    //Test case: hàm ném về ngoại lệ nếu nhận vào 21!
    
    @Test()
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        //Assert.assertThrows(tham số 1: loại ngoại lệ mún so sánh, 
        //                    tham số 2: đoạn code chạy văng ra ngoại lệ runnable);
        
        Assert.assertThrows(IllegalArgumentException.class, 
                           () -> MathUtil.getFactorial(-5));
        
        //MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                   //sẽ ném về ngoại lệ NumberFormat...
    }
    
    //Bắt ngoại lệ, xem hàm có ném ngoại lệ hay ko khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test()
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        
        //chủ động kiểm soát ngoại lệ!!!
        try {
            MathUtil.getFactorial(-5); 
        } catch (Exception e) {
            //bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần có xuất hay ko???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid arguement. N must be between 0..20", 
                                e.getMessage());
        }
        
      
        
    }
    
        
    
    
}
