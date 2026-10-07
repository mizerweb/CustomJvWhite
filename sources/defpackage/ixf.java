package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ixf {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public ixf() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        exf exfVar = new exf(f4, f5, f4, f5);
        exf.b(exfVar, this.d);
        exf.c(exfVar, f3);
        this.g.add(new cxf(exfVar));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gxf) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        fxf fxfVar = new fxf();
        fxfVar.b = f;
        fxfVar.c = f2;
        this.f.add(fxfVar);
        dxf dxfVar = new dxf(fxfVar, this.b, this.c);
        float fB = dxfVar.b() + 270.0f;
        float fB2 = dxfVar.b() + 270.0f;
        a(fB);
        this.g.add(dxfVar);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
