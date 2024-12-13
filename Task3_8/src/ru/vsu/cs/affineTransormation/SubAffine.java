package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

import java.util.ArrayList;
import java.util.List;

public class SubAffine implements IAffine {

    private List<IAffine> affines = new ArrayList<>();

    public SubAffine(List<IAffine> affines) {
        if (affines != null) {
            List<IAffine> afi = new ArrayList<>(affines);
            this.affines = afi;
        }
    }

    public SubAffine() {
    }

    public void add(IAffine affine) {
        if (affine != null)
            affines.add(affine);
    }

    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        if (affines.isEmpty()) return Matrix4f.setZero();

        Matrix4f current = affines.get(0).getMatrix();

        for (int i = 1; i < affines.size(); i++) {
            current = current.matrixProduct(affines.get(i).getMatrix());
        }

        return current;
    }
}
