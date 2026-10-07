package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class lcm extends z3 {
    public static final Parcelable.Creator<lcm> CREATOR = new cdm();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final kcm f;
    private final kcm g;

    public lcm(String str, String str2, String str3, String str4, String str5, kcm kcmVar, kcm kcmVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = kcmVar;
        this.g = kcmVar2;
    }

    public final kcm b() {
        return this.g;
    }

    public final kcm c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.a;
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
        jol.n(parcel, 6, this.f, i);
        jol.n(parcel, 7, this.g, i);
        jol.u(iT, parcel);
    }
}
