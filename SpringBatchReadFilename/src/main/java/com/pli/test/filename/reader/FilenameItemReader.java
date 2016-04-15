package com.pli.test.filename.reader;

import com.pli.test.filename.entity.FilenameEntity;
import lombok.Data;
import org.springframework.batch.item.ItemCountAware;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.core.io.Resource;

/**
 * Created by pli on 3/11/2016.
 */
@Data
public class FilenameItemReader extends FlatFileItemReader<FilenameEntity> {

    private Resource myresource;

    @Override
    public void setResource(Resource var1) {
        super.setResource(var1);
        myresource = var1;
    }

    @Override
    protected FilenameEntity doRead() throws Exception {
        FilenameEntity filenameEntity = super.doRead();
        if (filenameEntity == null) {
            return null;
        }
        filenameEntity.setFileName(myresource.getFile().getName());
        return filenameEntity;
    }

}
