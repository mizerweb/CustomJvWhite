package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpd {
    public final long a;
    public final long b;
    public final f68 c;

    public cpd(long j, long j2, f68 f68Var) {
        this.a = j;
        this.b = j2;
        this.c = f68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cpd) {
            cpd cpdVar = (cpd) obj;
            return this.a == cpdVar.a && this.b == cpdVar.b && this.c == cpdVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ProfileEntity(id=", ", serverId=");
        sbS.append(this.b);
        sbS.append(", profileData=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
