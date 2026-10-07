package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xya {
    public final String a;
    public final String b;
    public final String c;

    public xya(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xya)) {
            return false;
        }
        xya xyaVar = (xya) obj;
        return cqk.d(this.a, xyaVar.a) && cqk.d(this.b, xyaVar.b) && cqk.d(this.c, xyaVar.c);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return zo5.w(qv1.q("MiniAppData(title=", this.a, ", url=", this.b, ", queryId="), this.c, ")");
    }
}
