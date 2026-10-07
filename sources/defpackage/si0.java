package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class si0 {
    public final pt3 a;
    public final HashMap b;

    public si0(pt3 pt3Var, HashMap map) {
        this.a = pt3Var;
        this.b = map;
    }

    public final long a(vhd vhdVar, long j, int i) {
        long jI = j - this.a.i();
        ti0 ti0Var = (ti0) this.b.get(vhdVar);
        long j2 = ti0Var.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), jI), ti0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj;
        return this.a.equals(si0Var.a) && this.b.equals(si0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
