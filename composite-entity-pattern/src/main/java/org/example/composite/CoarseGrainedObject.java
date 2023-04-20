package org.example.composite;

import org.example.composite.dependent.DependentObject1;
import org.example.composite.dependent.DependentObject2;

/**
 * 粗粒度对象,该对象包含依赖对象;它有自己的生命周期，也能管理依赖对象的生命周期。
 */
public class CoarseGrainedObject {

    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData() {
        return new String[]{do1.getData(), do2.getData()};
    }
}
