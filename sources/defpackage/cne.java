package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class cne extends ds0 {
    public final int c;
    public final int d;

    public cne(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ds0, defpackage.qcd
    public final au3 a(Bitmap bitmap, k2d k2dVar) {
        int i;
        int i2 = this.c;
        if (i2 <= 0 || (i = this.d) <= 0 || (i2 == bitmap.getWidth() && i == bitmap.getHeight())) {
            return super.a(bitmap, k2dVar);
        }
        au3 au3VarD = k2dVar.d(bitmap, i2, i, true);
        try {
            Bitmap bitmap2 = (Bitmap) au3VarD.K();
            d(bitmap2, bitmap2);
            return au3VarD.l();
        } finally {
            au3VarD.close();
        }
    }

    @Override // defpackage.ds0, defpackage.qcd
    public v71 b() {
        return new l6g(qt4.l("resize:", this.c, this.d, ","));
    }

    @Override // defpackage.ds0, defpackage.qcd
    public String getName() {
        return "ResizePostprocessor";
    }
}
