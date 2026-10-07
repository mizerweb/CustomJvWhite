package defpackage;

import android.graphics.Matrix;
import org.webrtc.SurfaceTextureHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class jtc implements dxi {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public Object h;
    public final Object i;

    public jtc(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.i = new Matrix();
    }

    @Override // defpackage.dxi
    public SurfaceTextureHelper.FrameGeometry a(Matrix matrix, int i, int i2) {
        Matrix matrix2;
        int i3 = this.c;
        int i4 = this.a;
        int i5 = this.b;
        int i6 = this.d;
        SurfaceTextureHelper.FrameGeometry frameGeometry = (SurfaceTextureHelper.FrameGeometry) this.h;
        Matrix matrix3 = (Matrix) this.i;
        if (frameGeometry != null && frameGeometry.width == i && frameGeometry.height == i2 && cqk.d(matrix3, matrix)) {
            return frameGeometry;
        }
        if (this.g) {
            Matrix matrix4 = new Matrix(matrix);
            float f = i;
            float f2 = i2;
            matrix4.postTranslate(i4 / f, (i2 - (i5 + i6)) / f2);
            matrix4.postScale(i3 / f, i6 / f2);
            matrix2 = matrix4;
        } else {
            Matrix matrix5 = new Matrix();
            float f3 = i;
            float f4 = i2;
            matrix5.preTranslate(i4 / f3, (i2 - (i5 + i6)) / f4);
            matrix5.preScale(i3 / f3, i6 / f4);
            Matrix matrix6 = new Matrix(matrix);
            matrix6.preConcat(matrix5);
            matrix2 = matrix6;
        }
        SurfaceTextureHelper.FrameGeometry frameGeometry2 = new SurfaceTextureHelper.FrameGeometry(i, i2, this.e, this.f, matrix2);
        matrix3.set(matrix);
        this.h = frameGeometry2;
        return frameGeometry2;
    }

    public jtc() {
        this.h = new nmc();
        this.i = new int[np0.n];
    }
}
