package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rwg {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final float e;
    public final List f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public rwg(long j, long j2, int i, int i2, float f, List list, int i3, int i4, int i5, int i6) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = list;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
    }

    public final int a() {
        return this.j;
    }

    public final int b() {
        return this.g;
    }

    public final int c() {
        return this.i;
    }

    public final int d() {
        return this.h;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwg)) {
            return false;
        }
        rwg rwgVar = (rwg) obj;
        return this.a == rwgVar.a && this.b == rwgVar.b && this.c == rwgVar.c && this.d == rwgVar.d && Float.compare(this.e, rwgVar.e) == 0 && this.f.equals(rwgVar.f) && this.g == rwgVar.g && this.h == rwgVar.h && this.i == rwgVar.i && this.j == rwgVar.j;
    }

    public final long f() {
        return this.a;
    }

    public final long g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + zo5.c(this.i, zo5.c(this.h, zo5.c(this.g, qv1.c(nbh.m(zo5.c(this.d, zo5.c(this.c, qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31), 31), this.e, 31), 31, this.f), 31), 31), 31);
    }

    public final List i() {
        return this.f;
    }

    public final float j() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StoryDraftDrawingLayerEntity(draftId=", ", layerId=");
        c0a.w(sbS, this.b, ", position=", this.c);
        sbS.append(", color=");
        sbS.append(this.d);
        sbS.append(", width=");
        sbS.append(this.e);
        sbS.append(", primitives=");
        sbS.append(this.f);
        sbS.append(", boundsLeft=");
        sbS.append(this.g);
        zo5.C(this.h, this.i, ", boundsTop=", ", boundsRight=", sbS);
        return qv1.o(sbS, ", boundsBottom=", this.j, ")");
    }
}
