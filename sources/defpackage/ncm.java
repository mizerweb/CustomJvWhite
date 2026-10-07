package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ncm extends z3 {
    public static final Parcelable.Creator<ncm> CREATOR = new edm();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;

    public ncm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.i;
    }

    public final String f() {
        return this.m;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.l;
    }

    public final String j() {
        return this.b;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.k;
    }

    public final String m() {
        return this.n;
    }

    public final String n() {
        return this.d;
    }

    public final String p() {
        return this.j;
    }

    public final String s() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 1, str);
        jol.o(parcel, 2, this.b);
        jol.o(parcel, 3, this.c);
        jol.o(parcel, 4, this.d);
        jol.o(parcel, 5, this.e);
        jol.o(parcel, 6, this.f);
        jol.o(parcel, 7, this.g);
        jol.o(parcel, 8, this.h);
        jol.o(parcel, 9, this.i);
        jol.o(parcel, 10, this.j);
        jol.o(parcel, 11, this.k);
        jol.o(parcel, 12, this.l);
        jol.o(parcel, 13, this.m);
        jol.o(parcel, 14, this.n);
        jol.u(iT, parcel);
    }
}
