package com.pli.test.filename;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pli on 3/17/2015.
 */
public class App {

    public static void main(String[] args) throws Exception{
        String[] config = {
                "read-filename-config.xml"
        };

        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        Job job = (Job) ctx.getBean("filenameJob");
        JobLauncher jobLauncher = (JobLauncher) ctx.getBean("jobLauncher");
        JobParametersBuilder jobParameters = new JobParametersBuilder();
        jobParameters.addDate("time", new Date());
        jobLauncher.run(job, jobParameters.toJobParameters());

    }

}