package com.controller;

import com.dto.DataResult;
import com.model.Seckill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/seckill")
public class RestURLTestController {
    private static final Logger logger = LoggerFactory.getLogger(RestURLTestController.class);

    @RequestMapping(name = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("list", null);
        return "list";// 页面：/WEB-INF/jsp/list.jsp
    }

    @RequestMapping(name = "/{seckillId}/list", method = RequestMethod.GET)
    public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
        if (seckillId == null) {
            return "redirect: /seckill/list";
        }
        Seckill seckill = null;
        if (seckill == null) {
            return "forword: /seckill/list";
        }

        model.addAttribute("seckill", seckill);
        return "detail"; // 页面：/WEB-INF/jsp/detail.jsp
    }


    @RequestMapping(name = "/{seckillId}/exposer", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public DataResult<Seckill> exposer(@PathVariable("seckillId") Long seckillId) {
        DataResult<Seckill> dataResult = new DataResult<>();
        //其他逻辑
        return dataResult;
    }

    /**
     * 在返回页面时，需要catch 异常处理，未知异常需要打印日志
     * @param seckillId
     * @param md5
     * @param phone
     * @return
     */
    @RequestMapping(name = "/{seckillId}/{md5}/execution", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public DataResult<Seckill> execution(@PathVariable("seckillId") Long seckillId,
                                         @PathVariable("seckillId")String md5,
                                         @CookieValue(value = "killPhone", required = false) String phone) {
        DataResult<Seckill> dataResult = new DataResult<>();
        try {

        }catch (Exception e) {
            logger.error("");
        }
        //其他逻辑
        return dataResult;
    }




}
