package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dkd extends zq0 {
    public final long b;
    public final long c;

    public dkd(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkd)) {
            return false;
        }
        dkd dkdVar = (dkd) obj;
        return this.b == dkdVar.b && this.c == dkdVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    @Override // defpackage.zq0
    public final String toString() {
        return c0a.m(this.c, ")", qt4.s(this.b, "ProfileAvatarUpdatedEvent(requestId=", ", photoId="));
    }
}
