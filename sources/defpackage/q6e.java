package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q6e {
    public final s5e a;
    public final long b;
    public final String c;

    public q6e(long j, s5e s5eVar, String str) {
        this.a = s5eVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6e)) {
            return false;
        }
        q6e q6eVar = (q6e) obj;
        return cqk.d(this.a, q6eVar.a) && this.b == q6eVar.b && this.c.equals(q6eVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + zo5.d(qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, 0L), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReaction(selfReaction=");
        sb.append((Object) this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        return qt4.q(sb, ", msgTime=0, effectLottieUrl=", this.c, ", checkIsVisibleInWindow=false)");
    }
}
