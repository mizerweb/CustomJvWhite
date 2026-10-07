package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jyj {
    public final long a;
    public final long b;

    public jyj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jyj.class.equals(obj.getClass())) {
            jyj jyjVar = (jyj) obj;
            if (jyjVar.a == this.a && jyjVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb.append(this.a);
        sb.append(", flexIntervalMillis=");
        return zo5.u(sb, this.b, '}');
    }
}
