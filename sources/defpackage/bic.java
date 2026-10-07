package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bic extends kih {
    public final u8b c;

    public bic(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bic) && this.c.equals(((bic) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(organizations=" + this.c + ")";
    }
}
