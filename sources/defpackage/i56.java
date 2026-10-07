package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class i56 implements rba {
    public final Bitmap[] a;
    public final yx0 b;
    public final mj9 c;

    public i56(pk5 pk5Var) {
        int i;
        Bitmap[] bitmapArr = new Bitmap[26];
        int i2 = 0;
        for (int i3 = 0; i3 < 26; i3++) {
            bitmapArr[i3] = null;
        }
        this.a = bitmapArr;
        int iOrdinal = pk5Var.ordinal();
        if (iOrdinal == 0) {
            i = 25;
        } else if (iOrdinal == 1) {
            i = 40;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                throw null;
            }
            i = 50;
        }
        this.b = new yx0(gm0.J(Integer.valueOf(i).doubleValue() * 1048576.0d), i2);
        this.c = new mj9(100);
    }

    @Override // defpackage.rba
    public final void a(int i) {
        this.b.i(-1);
    }
}
