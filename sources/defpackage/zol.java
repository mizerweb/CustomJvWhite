package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zol extends z3 {
    public static final Parcelable.Creator<zol> CREATOR = new ucm();
    public wyl a;
    public String b;
    public String c;
    public f1m[] d;
    public qul[] e;
    public String[] f;
    public mfl[] g;

    public zol(wyl wylVar, String str, String str2, f1m[] f1mVarArr, qul[] qulVarArr, String[] strArr, mfl[] mflVarArr) {
        this.a = wylVar;
        this.b = str;
        this.c = str2;
        this.d = f1mVarArr;
        this.e = qulVarArr;
        this.f = strArr;
        this.g = mflVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 2, this.a, i);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        jol.q(parcel, 5, this.d, i);
        jol.q(parcel, 6, this.e, i);
        jol.p(parcel, 7, this.f);
        jol.q(parcel, 8, this.g, i);
        jol.u(iT, parcel);
    }

    public zol() {
    }
}
