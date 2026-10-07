package defpackage;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public final class yye extends jj0 {
    public final float[] k = tab.j();

    @Override // defpackage.jj0
    public final float[] f(lag lagVar, ikc ikcVar) {
        float[] fArrF = super.f(lagVar, ikcVar);
        float[] fArr = this.k;
        Matrix.invertM(fArr, 0, fArrF, 0);
        return fArr;
    }
}
