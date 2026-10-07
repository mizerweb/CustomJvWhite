package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hx2 {
    public final String a;
    public final long b;
    public final long c;

    public hx2(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hx2.class == obj.getClass()) {
            hx2 hx2Var = (hx2) obj;
            if (this.b != hx2Var.b || this.c != hx2Var.c) {
                return false;
            }
            String str = hx2Var.a;
            String str2 = this.a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage{text='");
        sb.append(gxl.c(this.a));
        sb.append("', time=");
        sb.append(this.b);
        sb.append(", id=");
        return zo5.u(sb, this.c, '}');
    }
}
