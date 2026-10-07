package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ao6 {
    public final ilb a;
    public final long b;

    public ao6(ilb ilbVar, long j) {
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
        if (!(obj instanceof ao6)) {
            return false;
        }
        ao6 ao6Var = (ao6) obj;
        return this.a.equals(ao6Var.a) && this.b == ao6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FcmNotificationHistoryDb(chatRef=" + this.a + ", lastNotifyMessageId=" + this.b + ")";
    }
}
