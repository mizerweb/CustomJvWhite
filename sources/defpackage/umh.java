package defpackage;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class umh {
    public final long a;
    public final ulh b;
    public final int c;
    public final int d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public float l;
    public float m;
    public final RectF n = new RectF();

    public umh(long j, ulh ulhVar, int i, int i2, CharSequence charSequence, int i3, int i4, float f, float f2, float f3, float f4) {
        this.a = j;
        this.b = ulhVar;
        this.c = i;
        this.d = i2;
        this.e = charSequence;
        this.f = i3;
        this.g = i4;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
    }

    public static umh a(umh umhVar, ulh ulhVar, int i, int i2, CharSequence charSequence, int i3, int i4, float f, float f2, float f3, float f4, int i5) {
        long j = umhVar.a;
        if ((i5 & 2) != 0) {
            ulhVar = umhVar.b;
        }
        ulh ulhVar2 = ulhVar;
        int i6 = (i5 & 4) != 0 ? umhVar.c : i;
        int i7 = (i5 & 8) != 0 ? umhVar.d : i2;
        CharSequence charSequence2 = (i5 & 16) != 0 ? umhVar.e : charSequence;
        int i8 = (i5 & 32) != 0 ? umhVar.f : i3;
        int i9 = (i5 & 64) != 0 ? umhVar.g : i4;
        float f5 = (i5 & np0.m) != 0 ? umhVar.h : f;
        float f6 = (i5 & np0.n) != 0 ? umhVar.i : f2;
        float f7 = (i5 & np0.o) != 0 ? umhVar.j : f3;
        float f8 = (i5 & 1024) != 0 ? umhVar.k : f4;
        umhVar.getClass();
        return new umh(j, ulhVar2, i6, i7, charSequence2, i8, i9, f5, f6, f7, f8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umh)) {
            return false;
        }
        umh umhVar = (umh) obj;
        return this.a == umhVar.a && this.b == umhVar.b && this.c == umhVar.c && this.d == umhVar.d && cqk.d(this.e, umhVar.e) && this.f == umhVar.f && this.g == umhVar.g && Float.compare(this.h, umhVar.h) == 0 && Float.compare(this.i, umhVar.i) == 0 && Float.compare(this.j, umhVar.j) == 0 && Float.compare(this.k, umhVar.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + nbh.m(nbh.m(nbh.m(zo5.c(this.g, c0a.f(this.f, mw7.f(zo5.c(this.d, zo5.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31), 31), this.h, 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayerState(id=");
        sb.append(this.a);
        sb.append(", alignMode=");
        sb.append(this.b);
        zo5.C(this.c, this.d, ", textColor=", ", textBackgroundColor=", sb);
        sb.append(", text=");
        sb.append((Object) this.e);
        sb.append(", textStyle=");
        sb.append(v0h.t(this.f));
        sb.append(", layoutWidth=");
        sb.append(this.g);
        sb.append(", translationX=");
        sb.append(this.h);
        sb.append(", translationY=");
        sb.append(this.i);
        sb.append(", scale=");
        sb.append(this.j);
        sb.append(", rotation=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
