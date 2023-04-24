package org.example.composite;

/**
 * 组合实体
 */
public class CompositeEntity {

    /**
     * 粗粒度对象，用于持续生命周期。
     */
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
