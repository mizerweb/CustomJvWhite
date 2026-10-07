package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zll extends z3 {
    public static final Parcelable.Creator<zll> CREATOR = new qbm();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public sil f;
    public sil g;

    public zll(String str, String str2, String str3, String str4, String str5, sil silVar, sil silVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = silVar;
        this.g = silVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 2, this.a);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        jol.o(parcel, 5, this.d);
        jol.o(parcel, 6, this.e);
        jol.n(parcel, 7, this.f, i);
        jol.n(parcel, 8, this.g, i);
        jol.u(iT, parcel);
    }

    public zll() {
    }
}
