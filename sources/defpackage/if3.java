package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class if3 extends mk0 {
    public final long b;

    public if3(long j) {
        super(4);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if3) && this.b == ((if3) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenChangeChannelTypeAndUpdateBackstack(chatId=", ")");
    }
}
