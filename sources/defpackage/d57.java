package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d57 extends hih {
    public final long c;

    public d57(long j) {
        super(kfc.D3);
        this.c = j;
        f(j, "folderSync");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d57) && this.c == ((d57) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }
}
