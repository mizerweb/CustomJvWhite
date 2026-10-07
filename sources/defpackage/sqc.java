package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sqc implements tqc, xxj, vxj, wxj {
    public final String a;
    public final p1f b;
    public final long c;
    public final String d;

    public sqc(String str, p1f p1fVar, long j, String str2) {
        this.a = str;
        this.b = p1fVar;
        this.c = j;
        this.d = str2;
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
        if (!(obj instanceof sqc)) {
            return false;
        }
        sqc sqcVar = (sqc) obj;
        return this.a.equals(sqcVar.a) && this.b.equals(sqcVar.b) && this.c == sqcVar.c && cqk.d(this.d, sqcVar.d);
    }

    public final int hashCode() {
        int iG = qt4.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.c, "StartMetric(name=", this.d, ", sliceTime=");
        sbB.append(", props=");
        sbB.append(this.b);
        sbB.append(")");
        return sbB.toString();
    }
}
