package com.federal_c1.federal_client1.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.federal.utils.R;
import com.federal_c1.federal_client1.FederalClient;
import com.federal_c1.federal_client1.model.Train;
import com.federal_c1.federal_client1.model.VisualParams;
import com.federal_c1.federal_client1.service.FileService;
import com.federal_c1.federal_client1.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileController {

    @Autowired
    private FileService fileService;

    @Autowired
    private FederalClient client;

    @Autowired
    private TrainService trainService;

    @PostMapping("upload")
    public R uploadFile(@RequestParam("user_id") String user_id,
                        @RequestParam("data_name") String data_name,
                        @RequestBody MultipartFile file) {
        String url = fileService.upload(file);
        Train train = new Train();
        train.setUserId(user_id);
        train.setDataUrl(url);
        train.setDataName(data_name);
        trainService.save(train);
        return R.ok("文件上传成功").put("url", url).put("trainId", train.getId());
    }

    @GetMapping("/showDetail1")
    public R showDetail1(@RequestParam("url") String url, @RequestParam("type") String type) {
        VisualParams visualParams = client.dataInfo(url, type);
        LambdaQueryWrapper<Train> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Train::getDataUrl, url);
        Train one = trainService.getOne(wrapper);
        one.setDataAnalysis(visualParams.getAnalysis());
        trainService.updateById(one);
//        System.out.println(reply);
        return R.ok().put("reply", visualParams.getAnalysis()).put("n", visualParams.getN()).
                put("n2", visualParams.getN2()).put("n3", visualParams.getN3()).put("x1", visualParams.getX1()).
                put("y1", visualParams.getY1()).put("r1", visualParams.getR1()).put("r2", visualParams.getR2()).
                put("r3", visualParams.getR3()).put("r21", visualParams.getR21()).put("r22", visualParams.getR22()).
                put("c1", visualParams.getC1()).put("c2", visualParams.getC2()).put("columns", visualParams.getColumns()).
                put("arr", visualParams.getArr());
    }

    @GetMapping("/showDetail2")
    public R showDetail2(@RequestParam("url") String url, @RequestParam("type") String type) {
        VisualParams visualParams = client.dataInfo(url, type);
        return R.ok().put("reply", visualParams.getAnalysis()).put("n", visualParams.getN()).
                put("n2", visualParams.getN2()).put("n3", visualParams.getN3()).put("x1", visualParams.getX1()).
                put("y1", visualParams.getY1()).put("r1", visualParams.getR1()).put("r2", visualParams.getR2()).
                put("r3", visualParams.getR3()).put("r21", visualParams.getR21()).put("r22", visualParams.getR22()).
                put("c1", visualParams.getC1()).put("c2", visualParams.getC2()).put("columns", visualParams.getColumns()).
                put("arr", visualParams.getArr());
    }

    @GetMapping("/getModelUrlByTrainId")
    public R getModelUrlByTrainId(@RequestParam("trainId") String trainId) {
        Train train = trainService.getById(trainId);
        return R.ok().put("preprocessDataUrl", train.getPreprocessData());
    }

}
