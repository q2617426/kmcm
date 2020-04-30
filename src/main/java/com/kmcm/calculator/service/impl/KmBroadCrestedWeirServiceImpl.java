package com.kmcm.calculator.service.impl;

import com.kmcm.calculator.service.KmBroadCrestedWeirService;
import com.kmcm.calculator.service.KmEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;


@Service
public class KmBroadCrestedWeirServiceImpl implements KmBroadCrestedWeirService {



    @Autowired
    private KmEstimateService kmEstimateService;


    //用宽顶堰公式计算
    @Override
    public String broadCrestedWeir(String ho){

        String hd =    kmEstimateService.estimate( ho );//h0转换大H

        BigDecimal c1 = new BigDecimal("3.6");//常数1
        BigDecimal c2 = new BigDecimal("1643");//常数2

        Double cz  =   c1.multiply(c2).doubleValue();//常数总

        BigDecimal q1 = new BigDecimal(cz);//常数总
        BigDecimal q2 = new BigDecimal(hd);//大H
        BigDecimal b2 = new BigDecimal(Double.toString(1000));
        //大H除1000
        Double amountMoney2  =    q2.divide(b2).doubleValue();

        DecimalFormat df   = new DecimalFormat("######0.00");

        //1.5次方
        BigDecimal qda = new BigDecimal(Math.pow(amountMoney2,1.5));



        String q3  = String.valueOf( df.format(qda.multiply(q1).doubleValue()) );//计算出结果








        return q3;



    }




}
