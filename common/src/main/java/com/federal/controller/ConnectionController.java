package com.federal.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.federal.VO.ClientVO;
import com.federal.VO.ConfirmVO;
import com.federal.VO.ConnectionVO;
import com.federal.model.Connection;
import com.federal.service.ConnectionService;
import com.federal.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/connect")
@CrossOrigin
public class ConnectionController {
    @Autowired
    private ConnectionService connectionService;

    @PostMapping("/getConnection")
    public R connect(@RequestBody ConnectionVO connectionVO) {
        Connection connection = new Connection();
        connection.setUserId(connectionVO.getUserId());
        connection.setIp(connectionVO.getIp());
        connection.setClientName(connectionVO.getClientName());
        connection.setDepartment(connectionVO.getDepartment());
        connection.setConfirm("0");
        connectionService.save(connection);
        return R.ok("连接请求发送成功");
    }

    @PostMapping("/deleteConnection")
    public R deleteConnection(@RequestBody String userId) {
        LambdaQueryWrapper<Connection> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Connection::getUserId, userId);
        connectionService.remove(queryWrapper);
        return R.ok("删除请求成功");
    }


    @GetMapping("/getConnectionMessage")
    public R getMessage() {
        LambdaQueryWrapper<Connection> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Connection::getConfirm, "0");
        List<Connection> list = connectionService.list(wrapper);
        return R.ok().put("message", list);
    }

    @GetMapping("/getIp")
    public R getClientIP(HttpServletRequest request) {
        String clientIP = request.getRemoteAddr();
        return R.ok().put("clientIP", clientIP);
    }

    @PostMapping("/confirmConnection")
    public R confirm(@RequestBody ConfirmVO confirmVO) {
        LambdaQueryWrapper<Connection> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Connection::getUserId, confirmVO.getUserId());
        wrapper.eq(Connection::getConfirm, "0");
        Connection one = connectionService.getOne(wrapper);
        one.setConfirm(confirmVO.getConfirm());
        one.setServerId(confirmVO.getServerId());
        connectionService.updateById(one);
        return R.ok();
    }
    @GetMapping("/getConfirm")
    public R getConfirm(String userId) {
        LambdaQueryWrapper<Connection> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Connection::getUserId, userId);
        Connection one = connectionService.getOne(wrapper);
        return R.ok().put("confirm", one.getConfirm());
    }

    @GetMapping("/getClient/{serverId}")
    public R getClient(@PathVariable String serverId) {
        LambdaQueryWrapper<Connection> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Connection::getServerId, serverId).eq(Connection::getConfirm, "1");
        List<Connection> list = connectionService.list(wrapper);
        List<ClientVO> collect = list.stream().map(item -> new ClientVO(item.getClientName(), item.getUserId(), item.getIp(), item.getDepartment())).collect(Collectors.toList());
        return R.ok().put("data", collect);
    }
}
