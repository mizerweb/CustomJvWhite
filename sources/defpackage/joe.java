package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class joe extends yq0 {
    public final long c;

    public joe(long j) {
        super(new yhh("error.user.restricted.send", null, null));
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joe) && this.c == ((joe) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    @Override // defpackage.yq0, defpackage.zq0
    public final String toString() {
        return nbh.s(this.c, "RestrictedSendMessageErrorEvent(chatId=", ")");
    }
}
