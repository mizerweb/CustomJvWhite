package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ug0 {
    public final int a;
    public final long b;

    public ug0(int i, long j) {
        if (i == 0) {
            ore.n("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ug0)) {
            return false;
        }
        ug0 ug0Var = (ug0) obj;
        return qt4.e(this.a, ug0Var.a) && this.b == ug0Var.b;
    }

    public final int hashCode() {
        int iD = (qt4.D(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iD;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return c0a.m(this.b, "}", sb);
    }
}
