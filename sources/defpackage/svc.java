package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class svc extends ds0 {
    public final int c;

    public svc(int i) {
        this.c = i;
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) {
        Matrix matrix = new Matrix();
        int i = this.c;
        if (i > 0) {
            matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
        return au3.k0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), new ahc(3), au3.f);
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final v71 b() {
        return new l6g(String.valueOf(this.c));
    }
}
