package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hj0 {
    public final String a;
    public final long b;
    public final int c;

    public hj0(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static ed7 a() {
        ed7 ed7Var = new ed7(3, false);
        ed7Var.d = 0L;
        return ed7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hj0)) {
            return false;
        }
        hj0 hj0Var = (hj0) obj;
        String str = hj0Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != hj0Var.b) {
            return false;
        }
        int i = hj0Var.c;
        int i2 = this.c;
        if (i2 == 0) {
            return i == 0;
        }
        return qt4.e(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? qt4.D(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
