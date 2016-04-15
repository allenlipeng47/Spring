package com.pli.test.filename.entity;

import lombok.Data;

/**
 * Created by pli on 2/5/2016.
 */
@Data
public class FilenameEntity implements Cloneable {
    private int id;
    private String value;
    private String fileName;
}
