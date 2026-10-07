package defpackage;

import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mcj {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;
    public final boolean f;

    public mcj(String str, long j, long j2, Thread thread, List list, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
        this.f = z;
    }

    public final long a(long j) {
        if (this.d != null) {
            return ew5.o(j, this.c);
        }
        ghb ghbVar = ew5.b;
        return 0L;
    }

    public final String b(long j) {
        StringBuilder sb = new StringBuilder("WatchdogTask(\n\tsubmitThread='");
        sb.append(this.a);
        sb.append("',\n\trunningThread='");
        Thread thread = this.d;
        String name = thread != null ? thread.getName() : null;
        if (name == null) {
            name = "";
        }
        sb.append(name);
        sb.append('\'');
        long jA = a(j);
        if (ew5.d(jA, 0L) > 0) {
            sb.append(",\n\texecutionTime=");
            sb.append(new ew5(jA));
        }
        long j2 = this.b;
        long jO = thread == null ? ew5.o(j, j2) : ew5.o(this.c, j2);
        if (ew5.d(jO, 0L) > 0) {
            sb.append(",\n\tqueueTime=");
            sb.append(new ew5(jO));
        }
        if (thread != null && thread != Thread.currentThread()) {
            sb.append(",\n\tstate=" + thread.getState());
            StackTraceElement[] stackTrace = thread.getStackTrace();
            List listW0 = this.f ? yhf.w0(yhf.u0(yhf.n0(a.K0(stackTrace), new u8h(27)), 3)) : a.n1(stackTrace);
            if (!listW0.isEmpty()) {
                sb.append(",\n\tlocked_stacktrace=\n\t\t");
                sb.append(ww3.z1(listW0, "\n\t\t\t", null, null, null, 62));
            }
        }
        List list = this.e;
        if (!list.isEmpty()) {
            sb.append("\n\tsubmit_stacktrace=\n\t");
            sb.append(ww3.z1(ww3.N1(list, 5), "\n\t\t", null, null, null, 62));
        }
        sb.append("\n)");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcj)) {
            return false;
        }
        mcj mcjVar = (mcj) obj;
        return this.a.equals(mcjVar.a) && ew5.f(this.b, mcjVar.b) && ew5.f(this.c, mcjVar.c) && cqk.d(this.d, mcjVar.d) && this.e.equals(mcjVar.e) && this.f == mcjVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ghb ghbVar = ew5.b;
        int iG = qt4.g(qt4.g(iHashCode, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return Boolean.hashCode(this.f) + qv1.c((iG + (thread == null ? 0 : thread.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        String strT = ew5.t(this.b);
        String strT2 = ew5.t(this.c);
        StringBuilder sbQ = qv1.q("WatchdogTask(submitThread=", this.a, ", submitTime=", strT, ", startTime=");
        sbQ.append(strT2);
        sbQ.append(", runningThread=");
        sbQ.append(this.d);
        sbQ.append(", stacktrace=");
        sbQ.append(this.e);
        sbQ.append(", useShortMeta=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}
