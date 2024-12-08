package ru.vsu.cs.iAffine;

import Matrixes.Matrix4f;
import Vectors.Vector4f;

public interface IAffine {

    // Метод, который преобразует переданный вектор
    default Vector4f transformation(Vector4f vec) {
        return getMatrix().multiplyByVector(vec);
    }

    // Метод, который возвращает матрицу, подействовав которой, можно преобразовать вектор
    Matrix4f getMatrix();
}
