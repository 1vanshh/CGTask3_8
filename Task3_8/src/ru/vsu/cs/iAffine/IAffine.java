package ru.vsu.cs.iAffine;

import ru.vsu.cs.simpleMath.Vec3f;

public interface IAffine {

    /*
    * Первый параметр - вектор, который хотим изменить
    * Второй параметр - вектор, которым действуем.
    * */
    float[][] transformation(Vec3f conversionVector);
}
