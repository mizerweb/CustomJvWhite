package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n96 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final List f;
    public final String g;
    public final Long h;
    public final String i;
    public final int j;
    public final String k;
    public final Integer l;
    public final String m;
    public final String n;
    public final String o;
    public final Locale p;
    public final String q;
    public final long r;

    public n96(String str, String str2, String str3, int i, String str4, List list, String str5, Long l, String str6, int i2, String str7, Integer num, String str8, String str9, String str10, Locale locale, String str11, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = l;
        this.i = str6;
        this.j = i2;
        this.k = str7;
        this.l = num;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        this.p = locale;
        this.q = str11;
        this.r = j;
    }

    public static n96 a(n96 n96Var, String str, Long l) {
        String str2 = n96Var.b;
        String str3 = n96Var.c;
        int i = n96Var.d;
        String str4 = n96Var.e;
        List list = n96Var.f;
        String str5 = n96Var.g;
        String str6 = n96Var.i;
        n96Var.getClass();
        int i2 = n96Var.j;
        String str7 = n96Var.k;
        Integer num = n96Var.l;
        String str8 = n96Var.m;
        String str9 = n96Var.n;
        String str10 = n96Var.o;
        Locale locale = n96Var.p;
        String str11 = n96Var.q;
        long j = n96Var.r;
        n96Var.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        return new n96(str, str2, str3, i, str4, list, str5, l, str6, i2, str7, num, str8, str9, str10, locale, str11, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n96)) {
            return false;
        }
        n96 n96Var = (n96) obj;
        return cqk.d(this.a, n96Var.a) && cqk.d(this.b, n96Var.b) && cqk.d(this.c, n96Var.c) && this.d == n96Var.d && cqk.d(this.e, n96Var.e) && cqk.d(this.f, n96Var.f) && cqk.d(this.g, n96Var.g) && cqk.d(this.h, n96Var.h) && cqk.d(this.i, n96Var.i) && this.j == n96Var.j && cqk.d(this.k, n96Var.k) && cqk.d(this.l, n96Var.l) && cqk.d(this.m, n96Var.m) && cqk.d(this.n, n96Var.n) && cqk.d(this.o, n96Var.o) && cqk.d(this.p, n96Var.p) && cqk.d(this.q, n96Var.q) && this.r == n96Var.r;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = zo5.d(spc.a(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31), 31, this.e);
        List list = this.f;
        int iD2 = zo5.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        Long l = this.h;
        int iD3 = zo5.d(spc.a(this.j, zo5.d((iD2 + (l == null ? 0 : l.hashCode())) * 31, 961, this.i)), 31, this.k);
        Integer num = this.l;
        int iHashCode3 = (iD3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Locale locale = this.p;
        int iHashCode7 = (iHashCode6 + (locale == null ? 0 : locale.hashCode())) * 31;
        String str6 = this.q;
        return Long.hashCode(this.r) + ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("EndpointParameters(conversationId=", this.a, ", token=", this.b, ", userId=");
        sbQ.append(this.c);
        sbQ.append(", deviceIndex=");
        sbQ.append(this.d);
        sbQ.append(", endpointBaseUrl=");
        sbQ.append(this.e);
        sbQ.append(", endpointIPs=");
        sbQ.append(this.f);
        sbQ.append(", appVersion=");
        sbQ.append(this.g);
        sbQ.append(", peerId=");
        sbQ.append(this.h);
        sbQ.append(", clientType=");
        sbQ.append(this.i);
        sbQ.append(", startUrlType=null, protocolVersion=");
        sbQ.append(this.j);
        sbQ.append(", capabilities=");
        sbQ.append(this.k);
        sbQ.append(", ispAsNo=");
        sbQ.append(this.l);
        sbQ.append(", ispAsOrg=");
        nbh.G(sbQ, this.m, ", locCc=", this.n, ", locReg=");
        sbQ.append(this.o);
        sbQ.append(", locale=");
        sbQ.append(this.p);
        sbQ.append(", compression=");
        sbQ.append(this.q);
        sbQ.append(", recoverTs=");
        sbQ.append(this.r);
        sbQ.append(")");
        return sbQ.toString();
    }
}
