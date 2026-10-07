package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class fxf extends gxf {
    public float b;
    public float c;

    @Override // defpackage.gxf
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
