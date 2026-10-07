package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e0j {
    public final String a;
    public final String b;
    public final String c;

    public e0j(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0j)) {
            return false;
        }
        e0j e0jVar = (e0j) obj;
        return cqk.d(this.a, e0jVar.a) && cqk.d(this.b, e0jVar.b) && cqk.d(this.c, e0jVar.c);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return zo5.w(qv1.q("PreparationFinished(attachResultPath=", this.a, ", attachLocalId=", this.b, ", unrecoverableExceptionName="), this.c, ")");
    }
}
