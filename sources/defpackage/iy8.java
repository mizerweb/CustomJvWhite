package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class iy8 {
    public final int a;
    public final hy8 b;
    public final int c;
    public final float d;
    public final ArrayList e;

    public iy8(int i, hy8 hy8Var, int i2, float f, ArrayList arrayList) {
        this.a = i;
        this.b = hy8Var;
        this.c = i2;
        this.d = f;
        this.e = arrayList;
    }

    public final int a() {
        return this.c;
    }

    public final List b() {
        return this.e;
    }

    public final float c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy8)) {
            return false;
        }
        iy8 iy8Var = (iy8) obj;
        return this.a == iy8Var.a && this.b == iy8Var.b && this.c == iy8Var.c && Float.compare(this.d, iy8Var.d) == 0 && this.e.equals(iy8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nbh.m(zo5.c(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), this.d, 31);
    }

    public final String toString() {
        return "LayerModel(id=" + this.a + ", type=" + this.b + ", color=" + this.c + ", width=" + this.d + ", drawingPrimitives=" + this.e + ")";
    }
}
