package org.treblereel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.dominokit.jacksonapt.annotation.JSONMapper;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 9/25/20
 */
@JSONMapper
public class Test {

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, visible = true)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = DataInput.class, name = "dataInput"),
            @JsonSubTypes.Type(value = DataOutput.class, name = "dataOutput"),
    })
    private List<Data> ioSpecification;

    public List<Data> getIoSpecification() {
        return ioSpecification;
    }

    public void setIoSpecification(List<Data> ioSpecification) {
        this.ioSpecification = ioSpecification;
    }
}
