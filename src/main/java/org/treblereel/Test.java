package org.treblereel;

import java.util.List;

import org.dominokit.jacksonapt.annotation.JSONMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 10/8/20
 */
@JSONMapper
public class Test {

    private List<Data> ioSpecification;

    public List<Data> getIoSpecification() {
        return ioSpecification;
    }

    public void setIoSpecification(List<Data> ioSpecification) {
        this.ioSpecification = ioSpecification;
    }
}
