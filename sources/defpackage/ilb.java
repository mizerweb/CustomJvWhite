package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ilb {
    public final long a;
    public final long b;

    public ilb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilb)) {
            return false;
        }
        ilb ilbVar = (ilb) obj;
        return this.a == ilbVar.a && this.b == ilbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "NotificationChatRef(chatServerId=", ", postId="));
    }

    public /* synthetic */ ilb(long j) {
        this(j, 0L);
    }
}
