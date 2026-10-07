package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class csg extends kih {
    public final u8b c;

    public csg(u8b u8bVar) {
        this.c = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csg) && cqk.d(this.c, ((csg) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(storiesPreviews=" + this.c + ")";
    }
}
