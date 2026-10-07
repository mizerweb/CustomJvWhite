package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pkb extends kih {
    public final ujd c;

    public pkb(ujd ujdVar) {
        this.c = ujdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pkb) && this.c.equals(((pkb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(profile=" + this.c + ")";
    }
}
