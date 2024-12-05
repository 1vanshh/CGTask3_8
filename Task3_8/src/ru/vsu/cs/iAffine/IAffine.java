package ru.vsu.cs.iAffine;

import ru.vsu.cs.simpleMath.Vec3f;

import static ru.vsu.cs.simpleMath.Multiply.multiply;

public interface IAffine {

    // Метод, который преобразует переданный вектор
    default Vec3f transformation(Vec3f vec) {
        return multiply(vec, getMatrix());
    }

    // Метод, который возвращает матрицу, подействовав который, можно преобразовать вектор
    float[][] getMatrix();
}
