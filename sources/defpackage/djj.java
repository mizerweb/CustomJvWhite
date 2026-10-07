package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class djj {
    public static final cjj Companion = new cjj();
    public static final ny8[] d = {null, rx8.P(2, new o0j(12)), null};
    public final String a;
    public final aa8 b;
    public final boolean c;

    public /* synthetic */ djj(int i, String str, aa8 aa8Var, boolean z) {
        if (7 != (i & 7)) {
            shl.b(i, 7, bjj.a.d());
            throw null;
        }
        this.a = str;
        this.b = aa8Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djj)) {
            return false;
        }
        djj djjVar = (djj) obj;
        return cqk.d(this.a, djjVar.a) && this.b == djjVar.b && this.c == djjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppHapticFeedbackImpact(requestId=");
        sb.append(this.a);
        sb.append(", impactStyle=");
        sb.append(this.b);
        sb.append(", disableVibrationFallback=");
        return qt4.r(sb, this.c, ")");
    }
}
