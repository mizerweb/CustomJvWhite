package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class vk8 {
    public final me2 a;

    public vk8(me2 me2Var) {
        this.a = me2Var;
    }

    public static int a(float f, float f2) {
        qyj.h("Focal length should be positive.", f > 0.0f);
        qyj.h("Sensor length should be positive.", f2 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
        qyj.j(degrees, "The provided focal length and sensor length result in an invalid view angle degrees.", 0, 360);
        return degrees;
    }

    public static float c(bg2 bg2Var) {
        Object objC = ((qb2) bg2Var).c(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        qyj.k(objC, "The focal lengths can not be empty.");
        float[] fArr = (float[]) objC;
        qyj.l("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float d(bg2 bg2Var) {
        qb2 qb2Var = (qb2) bg2Var;
        Object objC = qb2Var.c(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        qyj.k(objC, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) objC;
        Object objC2 = qb2Var.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        qyj.k(objC2, "The sensor orientation can't be null.");
        Object objC3 = qb2Var.c(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        qyj.k(objC3, "The active array size can't be null.");
        Size size = (Size) objC3;
        Object objC4 = qb2Var.c(CameraCharacteristics.SENSOR_ORIENTATION);
        qyj.k(objC4, "The pixel array size can't be null.");
        int iIntValue = ((Number) objC4).intValue();
        Size sizeF2 = y1i.f((Rect) objC2);
        if (y1i.c(iIntValue)) {
            SizeF sizeF3 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeF2.getHeight(), sizeF2.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeF2 = size2;
            sizeF = sizeF3;
        }
        return (sizeF.getWidth() * sizeF2.getWidth()) / size.getWidth();
    }

    public final int b(bg2 bg2Var) {
        me2 me2Var = this.a;
        try {
            ArrayList arrayListA = me2.a(me2Var);
            qyj.k(arrayListA, "Failed to get available camera IDs");
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((ef2) it.next()).a;
                bg2 bg2VarD = me2Var.c().c.d(str);
                ef2.b(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                Object objC = ((qb2) bg2VarD).c(key);
                qyj.k(objC, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) ef2.b(str)));
                int iIntValue = ((Number) objC).intValue();
                qb2 qb2Var = (qb2) bg2Var;
                Object objC2 = qb2Var.c(key);
                qyj.k(objC2, "Failed to get the required LENS_FACING for " + ((Object) ef2.b(qb2Var.a)));
                if (iIntValue == ((Number) objC2).intValue()) {
                    return a(c(bg2VarD), d(bg2VarD));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) ef2.b(((qb2) bg2Var).a)));
        } catch (Exception e) {
            ore.l("Failed to get a valid view angle", e);
            return 0;
        }
    }
}
