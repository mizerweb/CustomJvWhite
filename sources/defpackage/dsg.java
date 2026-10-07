package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dsg extends kih {
    public final String c;
    public final u8b d;

    public dsg(u8b u8bVar, String str) {
        this.c = str;
        this.d = u8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsg)) {
            return false;
        }
        dsg dsgVar = (dsg) obj;
        return cqk.d(this.c, dsgVar.c) && cqk.d(this.d, dsgVar.d);
    }

    public final int hashCode() {
        String str = this.c;
        return this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(cursor=" + this.c + ", storiesPreviews=" + this.d + ")";
    }
}
