package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ktc {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final String h;
    public String i;

    public ktc(int i, String str, String str2, String str3, List list, List list2, String str4, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = str4;
        this.h = str5;
        this.i = m3c.b(str2, str3);
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ktc.class == obj.getClass()) {
            ktc ktcVar = (ktc) obj;
            if (this.a != ktcVar.a) {
                return false;
            }
            String str = ktcVar.b;
            String str2 = this.b;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            List list = ktcVar.e;
            List list2 = this.e;
            if (list2 == null ? list != null : !list2.equals(list)) {
                return false;
            }
            List list3 = ktcVar.f;
            List list4 = this.f;
            if (list4 == null ? list3 != null : !list4.equals(list3)) {
                return false;
            }
            String str3 = ktcVar.g;
            String str4 = this.g;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = ktcVar.h;
            String str6 = this.h;
            if (str6 != null) {
                return str6.equals(str5);
            }
            if (str5 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Phone{contactId=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', phones=");
        sb.append(this.e);
        sb.append(", serverPhones=");
        sb.append(this.f);
        sb.append(", avatarPath='");
        sb.append(this.g);
        sb.append("', email='");
        return zo5.w(sb, this.h, "'}");
    }
}
