package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tdb {
    public final long a;
    public final String b;
    public final Boolean c;

    public tdb(long j, String str, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdb)) {
            return false;
        }
        tdb tdbVar = (tdb) obj;
        return this.a == tdbVar.a && cqk.d(this.b, tdbVar.b) && this.c.equals(tdbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "NeuroAvatarInfo(id=", ", url=", this.b);
        sbT.append(", default=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
