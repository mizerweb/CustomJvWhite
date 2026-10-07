package defpackage;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class qt5 {
    public boolean b;
    public ColorFilter c;
    public int a = -1;
    public int d = -1;
    public int e = -1;

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i = this.a;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.b) {
            drawable.setColorFilter(this.c);
        }
        int i2 = this.d;
        if (i2 != -1) {
            drawable.setDither(i2 != 0);
        }
        int i3 = this.e;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
