package pers.niaonao.crudproject.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.niaonao.crudproject.test.beans.Count;
import pers.niaonao.crudproject.test.service.ResourceService;
public class ResourceController {
    @Autowired
    public ResourceService resourceService;

    @RequestMapping(value = "/me/count", method = RequestMethod.PUT)
    @ResponseBody
    public void initCount(@RequestBody Count count) {
        resourceService.initCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.POST)
    @ResponseBody
    public void modifyCount(@RequestBody Count count) {
        resourceService.addCount(count);
    }

    @RequestMapping(value = "/me/count", method = RequestMethod.GET)
    @ResponseBody
    public Count getCount() {
        return resourceService.getCount();
    }
}
