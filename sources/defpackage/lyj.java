package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class lyj {
    public final UUID a;
    public final kyj b;
    public final HashSet c;
    public final d25 d;
    public final d25 e;
    public final int f;
    public final int g;
    public final kg4 h;
    public final long i;
    public final jyj j;
    public final long k;
    public final int l;

    public lyj(UUID uuid, kyj kyjVar, HashSet hashSet, d25 d25Var, d25 d25Var2, int i, int i2, kg4 kg4Var, long j, jyj jyjVar, long j2, int i3) {
        this.a = uuid;
        this.b = kyjVar;
        this.c = hashSet;
        this.d = d25Var;
        this.e = d25Var2;
        this.f = i;
        this.g = i2;
        this.h = kg4Var;
        this.i = j;
        this.j = jyjVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !lyj.class.equals(obj.getClass())) {
            return false;
        }
        lyj lyjVar = (lyj) obj;
        if (this.f == lyjVar.f && this.g == lyjVar.g && this.a.equals(lyjVar.a) && this.b == lyjVar.b && cqk.d(this.d, lyjVar.d) && this.h.equals(lyjVar.h) && this.i == lyjVar.i && cqk.d(this.j, lyjVar.j) && this.k == lyjVar.k && this.l == lyjVar.l && this.c.equals(lyjVar.c)) {
            return cqk.d(this.e, lyjVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int iG = qt4.g((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        jyj jyjVar = this.j;
        return Integer.hashCode(this.l) + qt4.g((iG + (jyjVar != null ? jyjVar.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
