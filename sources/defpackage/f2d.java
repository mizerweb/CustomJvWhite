package defpackage;

import android.opengl.Matrix;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class f2d {
    public Size a;
    public Size b;
    public final float[] c = new float[16];
    public final float[] d;
    public final pgg e;
    public u6g f;

    public f2d() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.d = fArr;
        this.e = new pgg(1);
    }
}
