package com.ai.dmp.ci.identify.adapter.output;

import com.ai.dmp.ci.identify.core.Result;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;

/**
 * Created by yulei on 2015/10/30.
 */
public abstract class AbstractMapOutput {

    /**
     * map阶段输出
     *
     * @param result
     * @param multipleOutputs
     * @param context
     * @throws Exception
     */
    public abstract void output(Result result, MultipleOutputs<Text, Text> multipleOutputs, Mapper.Context context) throws Exception;

}
