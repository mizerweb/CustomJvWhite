package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class bch {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public bch(Surface surface, int i, int i2, int i3, boolean z) {
        lvb.O("orientationDegrees must be 0, 90, 180, or 270", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bch)) {
            return false;
        }
        bch bchVar = (bch) obj;
        return this.b == bchVar.b && this.c == bchVar.c && this.d == bchVar.d && this.e == bchVar.e && this.a.equals(bchVar.a);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
