package com.shruti.learning;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


@RestController("/blog")
public class BlogResource{

    private static final Logger log = LoggerFactory.getLogger(BlogResource.class);

}