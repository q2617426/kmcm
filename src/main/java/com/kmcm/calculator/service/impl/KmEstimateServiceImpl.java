package com.kmcm.calculator.service.impl;

import com.kmcm.calculator.common.util.ex.AccessDeniedException;
import com.kmcm.calculator.common.util.ex.LowerThanExceedException;
import com.kmcm.calculator.service.KmEstimateService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;

@Service
public class KmEstimateServiceImpl implements KmEstimateService {




    //给水估算表
    @Override
    public String estimate(String estimateValueDh){


       String  estimateValue = new DecimalFormat("#,##0.00").format(new Double(estimateValueDh));


        Double estimateValue1 = Double.valueOf( estimateValue );


        if (estimateValue1 < 0.20 ){
            throw new LowerThanExceedException("输入得h0数据小于0.20");
        }

        if (estimateValue1 > 8.50){
            throw new LowerThanExceedException("输入得h0数据大于8.50");
        }


        System.out.println( "是否输入正确数值" + estimateValue1 );
        String estimateValue12 = null; //返回数据

        //切割，活动小数点后面的数据
        String[] idArray = estimateValue.split( "\\." );

        if (estimateValue1 == 0.2 ){

            estimateValue12 = "5";
        }


        if (estimateValue1 >= 0.21 && estimateValue1 <= 0.24){

            String  typePurchase =   idArray[1] ;

            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(20));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.2 * b3;

            Double b5 = b4 + 5;

            estimateValue12 = String.valueOf( b5 );
        }



        if (estimateValue1 == 0.25 ){

            estimateValue12 = "6";
        }


        if (estimateValue1 >= 0.25 && estimateValue1 <= 0.45){

            String  typePurchase =   idArray[1] ;

            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(25));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.1 * b3;

            Double b5 = b4 + 6;

            estimateValue12 = String.valueOf( b5 );
        }


        if (estimateValue1 >= 0.46 && estimateValue1 <= 0.50){

            String  typePurchase =   idArray[1] ;

            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(45));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.2 * b3;

            Double b5 = b4 + 8;

            estimateValue12 = String.valueOf( b5 );
        }


        if (estimateValue1 >= 0.51 && estimateValue1 <= 0.60){

            String  typePurchase =   idArray[1] ;

            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(50));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.1 * b3;

            Double b5 = b4 + 9;

            estimateValue12 = String.valueOf( b5 );
        }


        if (estimateValue1 >= 0.61 && estimateValue1 <= 0.89){

            String  typePurchase =   idArray[1] ;

            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(60));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.134 * b3;

            Double b5 = b4 + 10;

            estimateValue12 = String.valueOf( b5 );
        }

        if (estimateValue1 == 0.75 ){

            estimateValue12 = "12";
        }

        if (estimateValue1 == 0.9 ){

            estimateValue12 = "14";
        }

        if (estimateValue1 >= 0.91 && estimateValue1 <= 0.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(90));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.08 * b3;

            Double b5 = b4 + 14;

            estimateValue12 = String.valueOf( b5 );


        }

        if (estimateValue1 == 1 ){

            estimateValue12 = "14.80";
        }


        if (estimateValue1 >= 1.01 && estimateValue1 <= 1.15){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.08 * b3;

            Double b5 = b4 + 14.80;

            estimateValue12 = String.valueOf( b5 );


        }


        if (estimateValue1 >= 1.16 && estimateValue1 <= 1.29){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(15));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.133 * b3;

            Double b5 = b4 + 16;

            estimateValue12 = String.valueOf( b5 );


        }

        if (estimateValue1 == 1.30 ){

            estimateValue12 = "18";
        }


        if (estimateValue1 >= 1.31 && estimateValue1 <= 1.40){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(30));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.2 * b3;

            Double b5 = b4 + 18;

            estimateValue12 = String.valueOf( b5 );


        }


        if (estimateValue1 >= 1.41 && estimateValue1 <= 2.00){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(40));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 20;

            estimateValue12 = String.valueOf( b5 );


        }


        if (estimateValue1 >= 1.81 && estimateValue1 <= 1.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(40));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 20;

            estimateValue12 = String.valueOf( b5 );


        }

        if (estimateValue1 == 2.00 ){

            estimateValue12 = "27.5";
        }



        if (estimateValue1 >= 2.01 && estimateValue1 <= 2.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 27.5;

            estimateValue12 = String.valueOf( b5 );

        }



        if (estimateValue1 == 3.00 ){

            estimateValue12 = "40";
        }


        if (estimateValue1 >= 3.01 && estimateValue1 <= 3.40){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 40;

            estimateValue12 = String.valueOf( b5 );

        }

        if (estimateValue1 >= 3.41 && estimateValue1 <= 3.70){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(40));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.166 * b3;

            Double b5 = b4 + 45;

            estimateValue12 = String.valueOf( b5 );

        }

        if (estimateValue1 == 3.7 ){

            estimateValue12 = "50";
        }


        if (estimateValue1 >= 3.71 && estimateValue1 <= 3.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(70));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 50;

            estimateValue12 = String.valueOf( b5 );

        }

        if (estimateValue1 == 4.00 ){

            estimateValue12 = "53.75";
        }

        if (estimateValue1 >= 4.01 && estimateValue1 <= 4.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 53.75;

            estimateValue12 = String.valueOf( b5 );

        }

        if (estimateValue1 == 5.00 ){

            estimateValue12 = "66.25";
        }


        if (estimateValue1 >= 5.01 && estimateValue1 <= 5.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 66.25;

            estimateValue12 = String.valueOf( b5 );

        }


        if (estimateValue1 == 6.00 ){

            estimateValue12 = "78.75";
        }


        if (estimateValue1 >= 6.01 && estimateValue1 <= 6.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 78.75;

            estimateValue12 = String.valueOf( b5 );

        }


        if (estimateValue1 == 7.00 ){

            estimateValue12 = "91.25";
        }


        if (estimateValue1 >= 7.01 && estimateValue1 <= 7.99){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 91.25;

            estimateValue12 = String.valueOf( b5 );

        }



        if (estimateValue1 == 8.00 ){

            estimateValue12 = "103.75";
        }


        if (estimateValue1 >= 8.01 && estimateValue1 <= 8.50){


            String  typePurchase =   idArray[1] ;


            //获取准确的小数点
            BigDecimal b1 = new BigDecimal(typePurchase);
            BigDecimal b2 = new BigDecimal(Double.toString(0));

            Double b3 = b1.subtract(b2).doubleValue() ;

            Double b4 =  0.125 * b3;

            Double b5 = b4 + 103.75;

            estimateValue12 = String.valueOf( b5 );

        }








        return estimateValue12;
    }




}
