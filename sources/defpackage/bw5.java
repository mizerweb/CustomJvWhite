package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class bw5 implements fy0 {
    @Override // defpackage.xad, defpackage.ine
    public final void d(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.sba
    public final void e(qba qbaVar) {
    }

    @Override // defpackage.xad
    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
