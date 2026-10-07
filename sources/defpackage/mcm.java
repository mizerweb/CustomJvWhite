package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mcm extends z3 {
    public static final Parcelable.Creator<mcm> CREATOR = new ddm();
    private final qcm a;
    private final String b;
    private final String c;
    private final rcm[] d;
    private final ocm[] e;
    private final String[] f;
    private final jcm[] g;

    public mcm(qcm qcmVar, String str, String str2, rcm[] rcmVarArr, ocm[] ocmVarArr, String[] strArr, jcm[] jcmVarArr) {
        this.a = qcmVar;
        this.b = str;
        this.c = str2;
        this.d = rcmVarArr;
        this.e = ocmVarArr;
        this.f = strArr;
        this.g = jcmVarArr;
    }

    public final qcm b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final jcm[] e() {
        return this.g;
    }

    public final ocm[] f() {
        return this.e;
    }

    public final rcm[] g() {
        return this.d;
    }

    public final String[] h() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 1, this.a, i);
        jol.o(parcel, 2, this.b);
        jol.o(parcel, 3, this.c);
        jol.q(parcel, 4, this.d, i);
        jol.q(parcel, 5, this.e, i);
        jol.p(parcel, 6, this.f);
        jol.q(parcel, 7, this.g, i);
        jol.u(iT, parcel);
    }
}
