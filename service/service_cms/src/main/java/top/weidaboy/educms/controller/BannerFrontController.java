package top.weidaboy.educms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import top.weidaboy.common_utils.R;
import top.weidaboy.educms.entity.CrmBanner;
import top.weidaboy.educms.service.CrmBannerService;

import java.util.List;

/**
 * <p>
 * 前台bannber显示
 * </p>
 *
 * @author vinda
 * @since 2020-10-06
 */
@RestController
@RequestMapping("/educms/bannerfront")
@CrossOrigin
public class BannerFrontController {

    @Autowired
    private CrmBannerService bannerService;

    private int i;

    //查询所有banner
    @GetMapping("getAllBanner")
    public R getAllBanner(ModelAndView modelAndView) {
        List<CrmBanner> list = bannerService.selectAllBanner();
        modelAndView.addObject("admin","SB");
        return R.ok().data("list",list);
    }
}

