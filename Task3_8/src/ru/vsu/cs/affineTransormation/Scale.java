package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector3f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Scale implements IAffine {
    private Matrix4f matrix;

    // Конструктор с координатами для масштабирования
    public Scale(float x, float y, float z) {
        matrix = new Matrix4f(
                x, 0, 0, 0,
                0, y, 0, 0,
                0, 0, z, 0,
                0, 0, 0, 1
        );
    }

    // Конструктор с 4-х мерным вектором, определяющим масштаб
    public Scale(Vector4f vec) {
        matrix = new Matrix4f(
                vec.getX(), 0, 0, 0,
                0, vec.getY(), 0, 0,
                0, 0, vec.getZ(), 0,
                0, 0, 0, 1
        );
    }

    // Конструктор с 3-х мерным вектором, определяющим масштаб
    public Scale(Vector3f vec) {
        matrix = new Matrix4f(
                vec.getX(), 0, 0, 0,
                0, vec.getY(), 0, 0,
                0, 0, vec.getZ(), 0,
                0, 0, 0, 1
        );
    }

    public Scale() {
        matrix = Matrix4f.setIdentity();
    }

    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        return matrix;
    }
}
