package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cq {
    public final String a;
    public final String b;

    public cq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return cqk.d(this.a, cqVar.a) && cqk.d(this.b, cqVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("Info(token=", this.a, ", apiEndpoint=", this.b, ")");
    }
}
