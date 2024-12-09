package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector3f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Scale implements IAffine {

    private float x;
    private float y;
    private float z;

    // Конструктор с координатами для масштабирования
    public Scale(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор с 4-х мерным вектором, определяющим масштаб
    public Scale(Vector4f vec) {
        this.x = vec.getX();
        this.y = vec.getY();
        this.z = vec.getZ();
    }

    // Конструктор с 3-х мерным вектором, определяющим масштаб
    public Scale(Vector3f vec) {
        this.x = vec.getX();
        this.y = vec.getY();
        this.z = vec.getZ();
    }

    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        return new Matrix4f(
                x, 0, 0, 0,
                0, y, 0, 0,
                0, 0, z, 0,
                0, 0, 0, 1);
    }
}
