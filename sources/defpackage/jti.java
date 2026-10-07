package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jti implements kti {
    public final long a;
    public final oxi b;

    public jti(long j, oxi oxiVar) {
        this.a = j;
        this.b = oxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jti)) {
            return false;
        }
        jti jtiVar = (jti) obj;
        return this.a == jtiVar.a && cqk.d(this.b, jtiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StartVideoMessage(msgId=" + this.a + ", attachModel=" + this.b + ")";
    }
}
