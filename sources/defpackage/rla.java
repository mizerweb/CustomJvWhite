package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rla implements ama {
    public final Long a;

    public rla(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rla) && cqk.d(this.a, ((rla) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iic.m(this.a, "CloseEditMessage(editMessageId=", ")");
    }
}
