package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rqc implements tqc, xxj {
    public final String a;

    public rqc(String str) {
        this.a = str;
    }

    @Override // defpackage.xxj
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqc) && cqk.d(this.a, ((rqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("SaveMetricOnDisk(traceId=", owh.a(this.a), ")");
    }
}
