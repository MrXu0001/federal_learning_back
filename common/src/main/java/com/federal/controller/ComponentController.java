package com.federal.controller;

import com.federal.model.Component;
import com.federal.service.ComponentService;
import com.federal.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/component")
@CrossOrigin
public class ComponentController {
    @Autowired
    private ComponentService componentService;

    @GetMapping("getMethodName/{methodId}")
    public R getMethodName(@PathVariable String methodId) {
        Component component = componentService.getById(methodId);
        return R.ok().put("methodName", component.getName());
    }

}
