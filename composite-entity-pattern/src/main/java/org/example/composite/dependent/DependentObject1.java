package org.example.composite.dependent;

/**
 * 依赖对象, 依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
 */
public class DependentObject1 {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
