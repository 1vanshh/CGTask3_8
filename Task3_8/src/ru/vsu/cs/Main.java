package ru.vsu.cs;

import Vectors.Vector4f;
import ru.vsu.cs.affineTransormation.Rotate;
import ru.vsu.cs.affineTransormation.Scale;
import ru.vsu.cs.affineTransormation.SubAffine;
import ru.vsu.cs.affineTransormation.Translation;

public class Main {

//    public static Vec3f transform(Vec3f f, IAffine affine) {
//        Vec3f a = Multiply.multiply(f, affine.getMatrix());
//        return a;
//    }
    public static void main(String[] args) {

        Scale scale = new Scale(2, 2, 2);
        Rotate rotate = new Rotate(90, false, false, true, false);
        Translation translation = new Translation(0, 0, 1);

        SubAffine subAffine = new SubAffine();
        subAffine.add(scale);
        subAffine.add(rotate);
        subAffine.add(translation);

        System.out.println(subAffine.getMatrix().toString());
    }
}