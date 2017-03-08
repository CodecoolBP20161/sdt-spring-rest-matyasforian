package com.codecool.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

// spring data jdba starter

@RestController
public class MyController {


    @Autowired
    public CCRepository myRepo;

    @RequestMapping(path="json/{name}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Model jsonEndpoint(@PathVariable String name)
    {
        Model m = new Model();
        m.setValue("Hello " + name);
        return m;
    }

    @RequestMapping(path="xml/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public Model xmlEndpoint(@PathVariable String name)
    {

        Student adasd = new Student();
        adasd.name = "sdf";
        adasd.studentClass = "dddd";

        myRepo.save(adasd);

        Model m = new Model();
        m.setValue("Hello " + name);
        return m;

    }


}
