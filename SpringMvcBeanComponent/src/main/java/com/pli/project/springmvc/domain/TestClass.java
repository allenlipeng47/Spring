package com.pli.project.springmvc.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by lipeng on 2016/4/7.
 */
@Data
@Component
public class TestClass {
    private String msg = "bean by component";
}
