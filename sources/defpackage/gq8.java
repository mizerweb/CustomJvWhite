package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gq8 implements hq8 {
    public final String a;
    public final String b;

    public gq8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq8)) {
            return false;
        }
        gq8 gq8Var = (gq8) obj;
        return cqk.d(this.a, gq8Var.a) && cqk.d(this.b, gq8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.w("Success(conversationId=", this.a, ", internalParams=", this.b, ")");
    }
}
