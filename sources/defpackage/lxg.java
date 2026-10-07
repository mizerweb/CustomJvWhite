package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lxg {
    public final long a;
    public final long b;
    public final boolean c;
    public final float d;
    public final float e;

    public lxg(long j, long j2, boolean z, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = f;
        this.e = f2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final float c() {
        return this.e;
    }

    public final float d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxg)) {
            return false;
        }
        lxg lxgVar = (lxg) obj;
        return this.a == lxgVar.a && this.b == lxgVar.b && this.c == lxgVar.c && Float.compare(this.d, lxgVar.d) == 0 && Float.compare(this.e, lxgVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + nbh.m(nbh.n(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StoryDraftVideoAttrsEntity(draftId=", ", durationMs=");
        sbS.append(this.b);
        sbS.append(", isMuted=");
        sbS.append(this.c);
        sbS.append(", trimStartFraction=");
        sbS.append(this.d);
        sbS.append(", trimEndFraction=");
        sbS.append(this.e);
        sbS.append(")");
        return sbS.toString();
    }
}
