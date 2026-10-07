package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oqc implements tqc, xxj, vxj, wxj {
    public final String a;
    public final p1f b;
    public final long c;
    public final lrc d;
    public final String e;

    public oqc(String str, p1f p1fVar, long j, lrc lrcVar, String str2) {
        this.a = str;
        this.b = p1fVar;
        this.c = j;
        this.d = lrcVar;
        this.e = str2;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wxj
    public final boolean b() {
        return false;
    }

    @Override // defpackage.vxj
    public final p1f c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqc)) {
            return false;
        }
        oqc oqcVar = (oqc) obj;
        return cqk.d(this.a, oqcVar.a) && cqk.d(this.b, oqcVar.b) && this.c == oqcVar.c && cqk.d(this.d, oqcVar.d) && cqk.d(this.e, oqcVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + qt4.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FailMetric(type=" + this.d + ", desc=" + this.e + ", sliceTime=" + this.c + ", props=" + this.b + ")";
    }
}
