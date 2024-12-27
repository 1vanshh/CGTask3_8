package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector3f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Translation implements IAffine {

    private Matrix4f matrix;

    // Конструктор с координатами для трансляции
    public Translation(float x, float y, float z) {
        matrix = new Matrix4f (
                1, 0, 0, x,
                0, 1, 0, y,
                0, 0, 1, z,
                0, 0, 0, 1
        );
    }

    // Конструктор с 3-х мерным вектором, определяющим сдвиг
    public Translation(Vector3f vec) {
        matrix = new Matrix4f (
                1, 0, 0, vec.getX(),
                0, 1, 0, vec.getY(),
                0, 0, 1, vec.getZ(),
                0, 0, 0, 1
        );
    }

    // Конструктор с 4-х мерным вектором, определяющим сдвиг
    public Translation(Vector4f vec) {
        matrix = new Matrix4f (
                1, 0, 0, vec.getX(),
                0, 1, 0, vec.getY(),
                0, 0, 1, vec.getZ(),
                0, 0, 0, 1
        );
    }

    public void setX(float x) throws Exception{
        this.matrix.changeRow(1,
                new float[] {1, 0, 0, x});
    }

    public void setY(float y) throws Exception{
        this.matrix.changeRow(2,
                new float[] {0, 1, 0, y});
    }

    public void setZ(float z) throws Exception{
        this.matrix.changeRow(3,
                new float[] {0, 0, 1, z});
    }

    public Translation() {
        matrix = Matrix4f.setIdentity();
    }

    @Override
    public Matrix4f getMatrix() {
        return matrix;
    }
}
