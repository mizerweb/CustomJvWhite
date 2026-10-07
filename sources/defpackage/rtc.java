package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rtc extends sq0 implements Comparable {
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public rtc(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        super(j);
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = iic.h(i2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return n().compareTo(((rtc) obj).n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rtc.class != obj.getClass()) {
            return false;
        }
        rtc rtcVar = (rtc) obj;
        if (this.c != rtcVar.c) {
            return false;
        }
        String str = rtcVar.d;
        String str2 = this.d;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = rtcVar.g;
        String str4 = this.g;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = rtcVar.h;
        String str6 = this.h;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = rtcVar.i;
        String str8 = this.i;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final String h() {
        return this.i;
    }

    public final int i() {
        return this.c;
    }

    public final String k() {
        return this.f;
    }

    public final String m() {
        return this.g;
    }

    public final String n() {
        String str = this.g;
        if (ch3.s(str)) {
            String str2 = this.h;
            if (ch3.s(str2)) {
                return str + " " + str2;
            }
        }
        return str;
    }

    public final String o() {
        return this.h;
    }

    public final String p() {
        return this.d;
    }

    public final long q() {
        return this.b;
    }

    public final long r() {
        return this.e;
    }

    public final int s() {
        return this.j;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "PhoneDb{phonebookId=" + this.b + ", contactId=" + this.c + ", phone='" + this.d + "', serverPhone=" + this.e + ", firstName='" + this.g + "', lastName='" + this.h + "', type=" + iic.v(this.j) + '}';
    }
}
