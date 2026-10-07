package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class e55 {
    public final long a;
    public final ynh b;
    public final int c;
    public final ynh d;
    public final rql e;

    public /* synthetic */ e55(long j, ynh ynhVar, int i, ynh ynhVar2, rql rqlVar, int i2) {
        this(j, ynhVar, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : ynhVar2, (i2 & 16) != 0 ? b55.a : rqlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e55)) {
            return false;
        }
        e55 e55Var = (e55) obj;
        return ej5.a(this.a, e55Var.a) && cqk.d(this.b, e55Var.b) && this.c == e55Var.c && cqk.d(this.d, e55Var.d) && cqk.d(this.e, e55Var.e);
    }

    public final int hashCode() {
        AtomicLong atomicLong = ej5.b;
        int iC = zo5.c(this.c, bc1.h(Long.hashCode(this.a) * 31, 31, this.b), 31);
        ynh ynhVar = this.d;
        return this.e.hashCode() + ((iC + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    public final String toString() {
        AtomicLong atomicLong = ej5.b;
        return "DebugSettingItem(itemId=" + nbh.s(this.a, "DevButtonId(value=", ")") + ", titleRes=" + this.b + ", startIconRes=" + this.c + ", upperTextRes=" + this.d + ", action=" + this.e + ")";
    }

    public e55(long j, ynh ynhVar, int i, ynh ynhVar2, rql rqlVar) {
        this.a = j;
        this.b = ynhVar;
        this.c = i;
        this.d = ynhVar2;
        this.e = rqlVar;
    }
}
