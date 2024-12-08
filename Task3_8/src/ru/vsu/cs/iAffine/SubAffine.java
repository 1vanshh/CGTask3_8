package ru.vsu.cs.iAffine;

import Matrixes.Matrix4f;
import Vectors.Vector4f;

import java.util.ArrayList;
import java.util.List;

public class SubAffine implements IAffine{

    private List<IAffine> affines = new ArrayList<>();

    public SubAffine(List<IAffine> affines) {
        this.affines = affines;
    }

    public SubAffine() {

    }

    public void add(IAffine affine) {
        affines.add(affine);
    }

    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        if (affines.isEmpty()) return Matrix4f.setZero();

        Matrix4f current = affines.removeFirst().getMatrix();

        for (int i = 0; i < affines.size(); i++) {
            current = current.matrixProduct(affines.get(i).getMatrix());
        }

        return current;
    }
}
