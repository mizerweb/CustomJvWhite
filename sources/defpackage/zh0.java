package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zh0 extends le9 {
    public final long a;
    public final long b;
    public final ah0 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public zh0(long j, long j2, ah0 ah0Var, Integer num, String str, ArrayList arrayList) {
        rzd rzdVar = rzd.a;
        this.a = j;
        this.b = j2;
        this.c = ah0Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le9)) {
            return false;
        }
        zh0 zh0Var = (zh0) ((le9) obj);
        if (this.a != zh0Var.a || this.b != zh0Var.b || !this.c.equals(zh0Var.c)) {
            return false;
        }
        Integer num = zh0Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = zh0Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(zh0Var.f)) {
            return false;
        }
        Object obj2 = rzd.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((this.f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ rzd.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + rzd.a + "}";
    }
}
