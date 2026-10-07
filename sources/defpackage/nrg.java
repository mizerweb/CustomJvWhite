package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nrg extends kih {
    public final u8b c;

    public nrg(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrg) && cqk.d(this.c, ((nrg) obj).c);
    }

    public final u8b h() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(storyStats=" + this.c + ")";
    }
}
