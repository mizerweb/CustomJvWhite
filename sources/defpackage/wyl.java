package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class wyl extends z3 {
    public static final Parcelable.Creator<wyl> CREATOR = new ank();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public wyl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
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
        jol.u(iT, parcel);
    }

    public wyl() {
    }
}
