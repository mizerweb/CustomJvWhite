package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gyg {
    public final long a;
    public final long b;
    public final wyg c;
    public final int d;
    public final long e;
    public final int f;
    public final l40 g;
    public final long h;
    public final cmf i;
    public final int j;
    public final u8b k;

    public gyg(long j, long j2, wyg wygVar, int i, long j3, int i2, l40 l40Var, long j4, cmf cmfVar, int i3, u8b u8bVar) {
        this.a = j;
        this.b = j2;
        this.c = wygVar;
        this.d = i;
        this.e = j3;
        this.f = i2;
        this.g = l40Var;
        this.h = j4;
        this.i = cmfVar;
        this.j = i3;
        this.k = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg)) {
            return false;
        }
        gyg gygVar = (gyg) obj;
        return this.a == gygVar.a && this.b == gygVar.b && this.c.equals(gygVar.c) && this.d == gygVar.d && this.e == gygVar.e && this.f == gygVar.f && cqk.d(this.g, gygVar.g) && this.h == gygVar.h && cqk.d(this.i, gygVar.i) && this.j == gygVar.j && cqk.d(this.k, gygVar.k);
    }

    public final int hashCode() {
        int iC = zo5.c(this.f, qt4.g(zo5.c(this.d, (this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31), 31, this.e), 31);
        l40 l40Var = this.g;
        int iG = qt4.g((iC + (l40Var == null ? 0 : l40Var.hashCode())) * 31, 31, this.h);
        cmf cmfVar = this.i;
        return this.k.hashCode() + zo5.c(this.j, (iG + (cmfVar != null ? cmfVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "StoryItemApi(id=", ", updateTime=");
        sbS.append(this.b);
        sbS.append(", owner=");
        sbS.append(this.c);
        sbS.append(", settings=");
        sbS.append(this.d);
        sbS.append(", time=");
        c0a.w(sbS, this.e, ", expiration=", this.f);
        sbS.append(", media=");
        sbS.append(this.g);
        sbS.append(", cid=");
        sbS.append(this.h);
        sbS.append(", reaction=");
        sbS.append(this.i);
        sbS.append(", version=");
        sbS.append(this.j);
        sbS.append(", layers=");
        sbS.append(this.k);
        sbS.append(")");
        return sbS.toString();
    }
}
