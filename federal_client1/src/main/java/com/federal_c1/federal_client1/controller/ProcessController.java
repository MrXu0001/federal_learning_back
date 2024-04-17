package com.federal_c1.federal_client1.controller;

import com.federal_c1.federal_client1.FederalClient;
import com.federal_c1.federal_client1.model.Train;
import com.federal_c1.federal_client1.service.FileService;
import com.federal_c1.federal_client1.service.TrainService;
import com.federal_c1.federal_client1.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/process")
@CrossOrigin
public class ProcessController {
    @Autowired
    private FederalClient client;

    @Autowired
    private TrainService trainService;

    @Autowired
    private FileService fileService;

    @GetMapping("/train")
    public R preprocess(@RequestParam("trainId") String trainId, @RequestParam("idString") String idString) {
        // 根据trainId查出本次上传的数据的url
//        Train train = trainService.getById(trainId);
//        String dataUrl = train.getDataUrl();
//        String retInfo = client.localTrain(idString, dataUrl);
//        String url = fileService.uploadSimple(retInfo);
//        train.setMethod(idString); // 保存此次训练的方法
//        train.setPreprocessData(url);
//        trainService.updateById(train);
        String url = "";
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return R.ok().put("retInfo", url);  // 返回了预处理完后的数据集的url
    }
}
