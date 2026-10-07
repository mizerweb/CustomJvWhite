package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qcm extends z3 {
    public static final Parcelable.Creator<qcm> CREATOR = new ldm();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public qcm(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.g;
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
        jol.u(iT, parcel);
    }
}
