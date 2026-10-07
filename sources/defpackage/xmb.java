package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xmb {
    public final ilb a;
    public final long b;

    public xmb(ilb ilbVar, long j) {
        this.a = ilbVar;
        this.b = j;
    }

    public final ilb a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmb)) {
            return false;
        }
        xmb xmbVar = (xmb) obj;
        return this.a.equals(xmbVar.a) && this.b == xmbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationReadMarkDb(chatRef=" + this.a + ", mark=" + this.b + ")";
    }
}
