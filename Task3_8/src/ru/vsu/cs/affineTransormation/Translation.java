package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector3f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Translation implements IAffine {

    private float x;
    private float y;
    private float z;

    // Конструктор с координатами для трансляции
    public Translation(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор с 3-х мерным вектором, определяющим сдвиг
    public Translation(Vector3f vec) {
        this.x = vec.getX();
        this.y = vec.getY();
        this.z = vec.getZ();
    }

    // Конструктор с 4-х мерным вектором, определяющим сдвиг
    public Translation(Vector4f vec) {
        this.x = vec.getX();
        this.y = vec.getY();
        this.z = vec.getZ();
    }

    @Override
    public Matrix4f getMatrix() {
        return new Matrix4f (
                1, 0, 0, x,
                0, 1, 0, y,
                0, 0, 1, z,
                0, 0, 0, 1
        );
    }
}
