package com.kmcm.calculator.controller;


import com.kmcm.calculator.common.util.JsonResult;
import com.kmcm.calculator.common.util.ex.controller.BaseController;
import com.kmcm.calculator.service.KmBroadCrestedWeirService;
import com.kmcm.calculator.service.KmEstimateService;
import com.kmcm.calculator.service.KmWaterConsumptionCalculationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@Api(value = "用水量计算软件", tags = {"用水量计算软件的controller"})
@RequestMapping("kmcm/WaterConsumptionCalculation")
public class KmWaterConsumptionCalculationController extends BaseController {




    @Autowired
    private KmWaterConsumptionCalculationService kmWaterConsumptionCalculationService;


    @Autowired
    private KmBroadCrestedWeirService kmBroadCrestedWeirService;





    @ApiOperation(value = "用水量计算软件", notes = "用水量计算软件的接口")
    @RequestMapping(value = "/waterConsumptionCalculation", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "qi", value = "q3i（输入数值参考路面用水标准表）",  required = true),
            @ApiImplicitParam(name = "fi", value = "fi", dataType = "int", required = true),
            @ApiImplicitParam(name = "ni", value = "n3i 值默认为2 （可选值1）", required = true),
    })
    public JsonResult<Double> findAll(String qi, String fi, String ni) {

        // 执行查询，获取结果
        Double data =  kmWaterConsumptionCalculationService.waterConsumptionCalculation(   qi,  fi,   ni);
        // 响应成功，及查询结果
        return new JsonResult<>(SUCCESS, data);
    }


    @ApiOperation(value = "用宽顶堰公式计算", notes = "用宽顶堰公式计算的接口")
    @RequestMapping(value = "/estimate", method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "h0", value = "请参照数据转换表输入H0得准确认数值",  required = true)
    })
    public JsonResult<String> findAll(String h0) {

        // 执行查询，获取结果
        String data =  kmBroadCrestedWeirService.broadCrestedWeir(   h0);
        // 响应成功，及查询结果
        return new JsonResult<>(SUCCESS, data);
    }








}
