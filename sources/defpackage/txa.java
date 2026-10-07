package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class txa {
    public final String a;
    public final String b;
    public final long c;
    public final ekg d;
    public final long e;
    public final boolean f;

    public txa(String str, String str2, long j, ekg ekgVar, long j2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = ekgVar;
        this.e = j2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof txa) {
            txa txaVar = (txa) obj;
            if (cqk.d(this.a, txaVar.a) && cqk.d(this.b, txaVar.b) && this.c == txaVar.c && this.d == txaVar.d && this.e == txaVar.e && this.f == txaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qt4.g((this.d.hashCode() + qt4.g(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("MetricEntity(traceId=", this.a, ", metricName=", this.b, ", lastUpdatedTime=");
        sbQ.append(this.c);
        sbQ.append(", spanAndPropertiesDump=");
        sbQ.append(this.d);
        qt4.z(this.e, ", attempt=", ", isMarkedAsFailed=", sbQ);
        return qt4.r(sbQ, this.f, ")");
    }
}
