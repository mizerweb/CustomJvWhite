package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class uo {
    public static final uo e = new uo(null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public uo(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final uo d(String str) {
        String str2 = this.c;
        if (str2 != null) {
            ore.k("Some session key");
            return null;
        }
        String str3 = this.b;
        if (str3 == null) {
            return str.equals(this.a) ? this : new uo(str, str3, str2, this.d);
        }
        ore.k("Some auth token");
        return null;
    }

    public final uo e(String str, String str2) {
        String str3 = this.a;
        if (str3 != null) {
            return (str.equals(this.c) && str2.equals(this.d)) ? this : new uo(str3, this.b, str, str2);
        }
        ore.k("No app key");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return cqk.d(this.d, uoVar.d) && cqk.d(this.c, uoVar.c) && cqk.d(this.b, uoVar.b) && cqk.d(this.a, uoVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 961;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.d;
        return nbh.y(qv1.q("ApiConfig{appKey='", this.a, "', userId='null', token='", this.b, "', sessionKey='"), this.c, "', sessionSecret='", String.format(locale, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(str != null ? str.hashCode() : 0)}, 1)), "'}");
    }
}
