package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qyi {
    public final long a;
    public final String b;
    public final boolean c;

    public qyi(long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyi)) {
            return false;
        }
        qyi qyiVar = (qyi) obj;
        return this.a == qyiVar.a && cqk.d(this.b, qyiVar.b) && this.c == qyiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nbh.z(qt4.t(this.a, "FetchedAttach(messageId=", ", attachLocalId=", this.b), ", isSuccessful=", this.c, ")");
    }
}
