package ru.vsu.cs.iAffine;

import ru.vsu.cs.simpleMath.Multiply;
import ru.vsu.cs.simpleMath.Vec3f;

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
    public Vec3f transformation(Vec3f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public float[][] getMatrix() {
        float[][] answer = new float[4][4];

        for (int i = 1; i < affines.size(); i++) {
            float[][] temp;
            temp = Multiply.mult(affines.get(i - 1).getMatrix(), affines.get(i).getMatrix());
            if (i > 2) temp = Multiply.mult(temp, affines.get(i).getMatrix());


            answer = temp;
        }

        return answer;
    }
}
