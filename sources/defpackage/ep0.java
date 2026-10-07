package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ep0 extends hih {
    public final long c;

    public ep0(long j) {
        super(kfc.L3);
        this.c = j;
        f(j, "bannersSync");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep0) && this.c == ((ep0) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }
}
