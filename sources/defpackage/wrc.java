package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wrc {
    public final String a;
    public final rwh b;
    public final String c;
    public final int d;
    public final List e;
    public final Map f;
    public final long g;

    public wrc(String str, rwh rwhVar, String str2, int i, List list, ul9 ul9Var, long j) {
        this.a = str;
        this.b = rwhVar;
        this.c = str2;
        this.d = i;
        this.e = list;
        this.f = ul9Var;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrc)) {
            return false;
        }
        wrc wrcVar = (wrc) obj;
        return cqk.d(this.a, wrcVar.a) && this.b.equals(wrcVar.b) && cqk.d(this.c, wrcVar.c) && this.d == wrcVar.d && this.e.equals(wrcVar.e) && cqk.d(this.f, wrcVar.f) && this.g == wrcVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + v0h.c(this.f, qv1.c(c0a.f(this.d, zo5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DumpEntry(metricName=");
        sb.append(this.a);
        sb.append(", traceTrack=");
        sb.append(this.b);
        sb.append(", traceId=");
        sb.append(this.c);
        sb.append(", finalState=");
        sb.append(iic.s(this.d));
        sb.append(", builtSpans=");
        sb.append(this.e);
        sb.append(", localProperties=");
        sb.append(this.f);
        sb.append(", completedAtMs=");
        return c0a.m(this.g, ")", sb);
    }
}
