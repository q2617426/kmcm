package com.kmcm.calculator.service.impl;

import com.kmcm.calculator.service.KmWaterConsumptionCalculationService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class KmWaterConsumptionCalculationServiceImpl implements KmWaterConsumptionCalculationService {




    //用水量计算软件
    @Override
    public Double waterConsumptionCalculation(String qi ,String fi ,String ni ){

        BigDecimal q1 = new BigDecimal(qi);//q3i
        BigDecimal f1 = new BigDecimal(fi);//fi
        BigDecimal n1 = new BigDecimal(ni);//n3i


        Double amountMoney1  =   q1.multiply(f1).multiply(n1  ).doubleValue();

        BigDecimal b1 = new BigDecimal(Double.toString(amountMoney1));
        BigDecimal b2 = new BigDecimal(Double.toString(1000));

        Double amountMoney2  =    b1.divide(b2,2,BigDecimal.ROUND_HALF_UP).doubleValue();



        return amountMoney2;



    }






}
