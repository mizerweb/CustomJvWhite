package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class gfj {
    public static final ffj Companion = new ffj();
    public static final ny8[] h = {null, null, rx8.P(2, new o0j(9)), null, null, null, null};
    public final String a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public /* synthetic */ gfj(int i, String str, boolean z, List list, boolean z2, boolean z3, boolean z4, String str2) {
        if (127 != (i & 127)) {
            shl.b(i, 127, efj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfj)) {
            return false;
        }
        gfj gfjVar = (gfj) obj;
        return cqk.d(this.a, gfjVar.a) && this.b == gfjVar.b && cqk.d(this.c, gfjVar.c) && this.d == gfjVar.d && this.e == gfjVar.e && this.f == gfjVar.f && cqk.d(this.g, gfjVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + nbh.n(nbh.n(nbh.n(qv1.c(nbh.n(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("WebAppBiometryInfoResponse(requestId=", this.a, ", available=", ", type=", this.b);
        sbA.append(this.c);
        sbA.append(", accessRequested=");
        sbA.append(this.d);
        sbA.append(", accessGranted=");
        qt4.B(", tokenSaved=", ", deviceId=", sbA, this.e, this.f);
        return zo5.w(sbA, this.g, ")");
    }

    public gfj(String str, List list, boolean z, boolean z2, boolean z3, String str2) {
        this.a = str;
        this.b = true;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
    }
}
