package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l47 implements n47 {
    public final long a;
    public final String b;
    public final Long c;

    public l47(long j, String str, Long l) {
        this.a = j;
        this.b = str;
        this.c = l;
    }

    public final long a() {
        return this.a;
    }

    public final Long b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l47)) {
            return false;
        }
        l47 l47Var = (l47) obj;
        return this.a == l47Var.a && cqk.d(this.b, l47Var.b) && cqk.d(this.c, l47Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "OpenApp(appId=", ", startParam=", this.b);
        sbT.append(", folderId=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
