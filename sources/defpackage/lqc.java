package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lqc implements tqc, xxj, vxj, wxj {
    public final String a;
    public final b9b b;
    public final long c;

    public lqc(String str, b9b b9bVar, long j) {
        this.a = str;
        this.b = b9bVar;
        this.c = j;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wxj
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vxj
    public final p1f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqc)) {
            return false;
        }
        lqc lqcVar = (lqc) obj;
        return cqk.d(this.a, lqcVar.a) && this.b.equals(lqcVar.b) && this.c == lqcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddRetryBoundary(sliceTime=" + this.c + ", props=" + this.b + ")";
    }
}
