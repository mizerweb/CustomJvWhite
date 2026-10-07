package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mqc implements tqc, xxj, vxj, wxj {
    public final String a;
    public final p1f b;
    public final String c;
    public final int d;
    public final long e;
    public final boolean f;
    public final wdg g;
    public final boolean h;

    public mqc(String str, p1f p1fVar, String str2, int i, long j, boolean z, wdg wdgVar) {
        this.a = str;
        this.b = p1fVar;
        this.c = str2;
        this.d = i;
        this.e = j;
        this.f = z;
        this.g = wdgVar;
        this.h = !z;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wxj
    public final boolean b() {
        return this.h;
    }

    @Override // defpackage.vxj
    public final p1f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqc)) {
            return false;
        }
        mqc mqcVar = (mqc) obj;
        return cqk.d(this.a, mqcVar.a) && this.b.equals(mqcVar.b) && this.c.equals(mqcVar.c) && this.d == mqcVar.d && this.e == mqcVar.e && this.f == mqcVar.f && this.g == mqcVar.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + nbh.n(qt4.g(zo5.c(this.d, zo5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.d, "AddSpan(name=", this.c, ", order=", ", sliceTime=");
        sbR.append(this.e);
        sbR.append(" isFinal=");
        sbR.append(this.f);
        sbR.append(", strategy=");
        sbR.append(this.g);
        sbR.append(", props=");
        sbR.append(this.b);
        sbR.append(")");
        return sbR.toString();
    }
}
