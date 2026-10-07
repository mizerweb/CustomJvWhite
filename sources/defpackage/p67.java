package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p67 extends kih {
    public final vy2 c;
    public final long d;
    public final u8b e;

    public p67(vy2 vy2Var, long j, u8b u8bVar) {
        this.c = vy2Var;
        this.d = j;
        this.e = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p67)) {
            return false;
        }
        p67 p67Var = (p67) obj;
        return this.c.equals(p67Var.c) && this.d == p67Var.d && cqk.d(this.e, p67Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qt4.g(this.c.hashCode() * 31, 31, this.d);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(folder=" + this.c + ", folderSync=" + this.d + ", foldersOrder=" + this.e + ")";
    }
}
