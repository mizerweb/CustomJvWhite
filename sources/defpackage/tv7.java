package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tv7 {
    public static final Rect b = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final v30 a;

    public tv7(v30 v30Var) {
        this.a = v30Var;
    }

    public final void a(View view, Rect rect, Float f, Integer num) {
        Path path = new Path();
        Path path2 = new Path();
        Rect rect2 = new Rect();
        RectF rectF = new RectF();
        Rect rect3 = new Rect();
        RectF rectF2 = new RectF();
        sfe sfeVar = new sfe();
        if (rect == null) {
            return;
        }
        view.setBackground(new rv7(sfeVar, path2, pq3.j.h(view).b().g));
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        float[] fArr3 = new float[8];
        if (f != null) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = f.floatValue();
                if (i < 4) {
                    fArr2[i] = f.floatValue();
                } else {
                    fArr3[i] = f.floatValue();
                }
            }
        }
        ((ArrayList) this.a.f).add(new sv7(sfeVar, path2, path, rect2, rect, num, rect3, rectF, f, fArr, rectF2, view));
    }
}
