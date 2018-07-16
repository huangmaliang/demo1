package cn.com.gogen.springcloud.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long deptno;
    private String dname;
    private String dbsource;

}
