package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kh0 {
    public final String a;
    public final Integer b;
    public final r76 c;
    public final long d;
    public final long e;
    public final Map f;

    public kh0(String str, Integer num, r76 r76Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = r76Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final js8 c() {
        js8 js8Var = new js8();
        String str = this.a;
        if (str == null) {
            ore.n("Null transportName");
            return null;
        }
        js8Var.a = str;
        js8Var.b = this.b;
        r76 r76Var = this.c;
        if (r76Var == null) {
            ore.n("Null encodedPayload");
            return null;
        }
        js8Var.c = r76Var;
        js8Var.d = Long.valueOf(this.d);
        js8Var.e = Long.valueOf(this.e);
        js8Var.f = new HashMap(this.f);
        return js8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kh0) {
            kh0 kh0Var = (kh0) obj;
            if (this.a.equals(kh0Var.a)) {
                Integer num = kh0Var.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(kh0Var.c) && this.d == kh0Var.d && this.e == kh0Var.e && this.f.equals(kh0Var.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
