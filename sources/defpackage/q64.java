package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q64 {
    public final Object a;
    public final rj2 b;
    public final tf7 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ q64(Object obj, rj2 rj2Var, tf7 tf7Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : rj2Var, (i & 4) != 0 ? null : tf7Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static q64 a(q64 q64Var, rj2 rj2Var, Throwable th, int i) {
        Object obj = q64Var.a;
        if ((i & 2) != 0) {
            rj2Var = q64Var.b;
        }
        rj2 rj2Var2 = rj2Var;
        tf7 tf7Var = q64Var.c;
        Object obj2 = q64Var.d;
        if ((i & 16) != 0) {
            th = q64Var.e;
        }
        return new q64(obj, rj2Var2, tf7Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q64)) {
            return false;
        }
        q64 q64Var = (q64) obj;
        return cqk.d(this.a, q64Var.a) && cqk.d(this.b, q64Var.b) && cqk.d(this.c, q64Var.c) && cqk.d(this.d, q64Var.d) && cqk.d(this.e, q64Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        rj2 rj2Var = this.b;
        int iHashCode2 = (iHashCode + (rj2Var == null ? 0 : rj2Var.hashCode())) * 31;
        tf7 tf7Var = this.c;
        int iHashCode3 = (iHashCode2 + (tf7Var == null ? 0 : tf7Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public q64(Object obj, rj2 rj2Var, tf7 tf7Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = rj2Var;
        this.c = tf7Var;
        this.d = obj2;
        this.e = th;
    }
}
