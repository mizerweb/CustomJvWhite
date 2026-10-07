package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zrl extends z3 {
    public static final Parcelable.Creator<zrl> CREATOR = new sdm();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;

    public zrl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 2, this.a);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        jol.o(parcel, 5, this.d);
        jol.o(parcel, 6, this.e);
        jol.o(parcel, 7, this.f);
        jol.o(parcel, 8, this.g);
        jol.o(parcel, 9, this.h);
        jol.o(parcel, 10, this.i);
        jol.o(parcel, 11, this.j);
        jol.o(parcel, 12, this.k);
        jol.o(parcel, 13, this.l);
        jol.o(parcel, 14, this.m);
        jol.o(parcel, 15, this.n);
        jol.u(iT, parcel);
    }

    public zrl() {
    }
}
