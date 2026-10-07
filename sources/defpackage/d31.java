package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class d31 extends cs0 implements fy0 {
    public d31(uba ubaVar, cbd cbdVar, nhb nhbVar) {
        super(ubaVar, cbdVar, nhbVar);
        ubaVar.a(this);
        nhbVar.getClass();
    }

    @Override // defpackage.cs0
    public final Object f(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // defpackage.cs0
    public final void h(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // defpackage.cs0
    public final int j(int i) {
        return i;
    }

    @Override // defpackage.cs0
    public final int k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // defpackage.cs0
    public final int l(int i) {
        return i;
    }

    @Override // defpackage.cs0
    public final Object m(b31 b31Var) {
        Bitmap bitmap = (Bitmap) super.m(b31Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // defpackage.cs0
    public final boolean o(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
