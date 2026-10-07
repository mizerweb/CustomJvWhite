package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pqc implements tqc, xxj, vxj, wxj {
    public final String a;
    public final p1f b;
    public final u8b c;
    public final boolean d = true;

    public pqc(String str, p1f p1fVar, u8b u8bVar) {
        this.a = str;
        this.b = p1fVar;
        this.c = u8bVar;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wxj
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.vxj
    public final p1f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqc)) {
            return false;
        }
        pqc pqcVar = (pqc) obj;
        return this.a.equals(pqcVar.a) && this.b.equals(pqcVar.b) && this.c.equals(pqcVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.c.hashCode() + zo5.c(1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PrecomputedSpans(traceId=" + owh.a(this.a) + ", localProperties=" + this.b + ", orderOfFirstSpan=1, spans=" + this.c + ", isLastSpanFinal=false)";
    }
}
