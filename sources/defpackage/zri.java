package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zri extends yri {
    public qoc[] a;
    public String b;
    public int c;

    public zri(zri zriVar) {
        this.a = null;
        this.c = 0;
        this.b = zriVar.b;
        this.a = qyj.v(zriVar.a);
    }

    public boolean c() {
        return this instanceof vri;
    }

    public final void d(Path path) {
        path.reset();
        qoc[] qocVarArr = this.a;
        if (qocVarArr != null) {
            qyj.N(qocVarArr, path);
        }
    }

    public qoc[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(qoc[] qocVarArr) {
        if (!qyj.d(this.a, qocVarArr)) {
            this.a = qyj.v(qocVarArr);
            return;
        }
        qoc[] qocVarArr2 = this.a;
        for (int i = 0; i < qocVarArr.length; i++) {
            qocVarArr2[i].a = qocVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = qocVarArr[i].b;
                if (i2 < fArr.length) {
                    qocVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public zri() {
        this.a = null;
        this.c = 0;
    }
}
