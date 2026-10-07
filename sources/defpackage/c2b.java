package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c2b {
    public final x52 a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public c2b(x52 x52Var, float f, boolean z, Long l, boolean z2) {
        this.a = x52Var;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2b)) {
            return false;
        }
        c2b c2bVar = (c2b) obj;
        return this.a.equals(c2bVar.a) && Float.compare(this.b, c2bVar.b) == 0 && this.c == c2bVar.c && cqk.d(this.d, c2bVar.d) && this.e == c2bVar.e;
    }

    public final int hashCode() {
        int iB = pwe.b(nbh.m(this.a.hashCode() * 31, this.b, 31), this.c);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((iB + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return qt4.r(sb, this.e, ")");
    }
}
