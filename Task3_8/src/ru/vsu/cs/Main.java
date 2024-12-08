package ru.vsu.cs;

import Vectors.Vector4f;
import ru.vsu.cs.affineTransormation.Rotate;
import ru.vsu.cs.iAffine.SubAffine;

public class Main {

//    public static Vec3f transform(Vec3f f, IAffine affine) {
//        Vec3f a = Multiply.multiply(f, affine.getMatrix());
//        return a;
//    }
    public static void main(String[] args) {

        Vector4f vec = new Vector4f(0, 0, 0, 1);

        SubAffine sub = new SubAffine();

        Rotate rotate = new Rotate(90, false, false, true, false);
    }
}