package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class ww extends k2d {
    public final fy0 a;
    public final w4 b;

    public ww(fy0 fy0Var, w4 w4Var) {
        this.a = fy0Var;
        this.b = w4Var;
    }

    @Override // defpackage.k2d
    public final au3 c(int i, int i2, Bitmap.Config config) {
        int iC = oy0.c(i, i2, config);
        fy0 fy0Var = this.a;
        Bitmap bitmap = (Bitmap) fy0Var.get(iC);
        if (bitmap.getAllocationByteCount() >= oy0.b(config) * i * i2) {
            bitmap.reconfigure(i, i2, config);
            return this.b.j(bitmap, fy0Var);
        }
        ore.k("Check failed.");
        return null;
    }
}
