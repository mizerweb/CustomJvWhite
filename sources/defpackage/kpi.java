package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kpi extends mpi {
    public final pui a;
    public final boolean b;
    public final long c;
    public final u8b d;

    public kpi(pui puiVar, boolean z, long j, u8b u8bVar) {
        this.a = puiVar;
        this.b = z;
        this.c = j;
        this.d = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpi)) {
            return false;
        }
        kpi kpiVar = (kpi) obj;
        return this.a.equals(kpiVar.a) && this.b == kpiVar.b && this.c == kpiVar.c && cqk.d(this.d, kpiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qt4.g(nbh.n(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ShowVideo(config=" + this.a + ", useFallbackBlur=" + this.b + ", startPosMillis=" + this.c + ", layers=" + this.d + ")";
    }
}
