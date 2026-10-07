package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hui extends kih {
    public final String c;
    public final String d;

    public hui(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hui)) {
            return false;
        }
        hui huiVar = (hui) obj;
        return cqk.d(this.c, huiVar.c) && cqk.d(this.d, huiVar.d);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return nbh.w("Response(conversationId=", this.c, ", internalParams=", this.d, ")");
    }
}
