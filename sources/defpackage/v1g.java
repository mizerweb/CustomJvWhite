package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v1g implements vpa {
    public final long a;
    public final boolean b;
    public final boolean c;

    public v1g(long j, boolean z, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1g)) {
            return false;
        }
        v1g v1gVar = (v1g) obj;
        return this.a == v1gVar.a && this.b == v1gVar.b && this.c == v1gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nbh.z(qt4.u(this.a, "ShowCommentAdminDeleteSnackbar(operationId=", ", deleteAllUserComments=", this.b), ", blockUser=", this.c, ")");
    }
}
