package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class esd extends mk0 {
    public final long b;

    public esd(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esd) && this.b == ((esd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "InviteByLink(chatId=", ")");
    }
}
