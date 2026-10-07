package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xcm extends z3 {
    public static final Parcelable.Creator<xcm> CREATOR = new ycm();
    private final int a;
    private final String b;
    private final String c;
    private final byte[] d;
    private final Point[] e;
    private final int f;
    private final ocm g;
    private final rcm h;
    private final scm i;
    private final wcm j;
    private final tcm k;
    private final pcm l;
    private final lcm m;
    private final mcm n;
    private final ncm o;

    public xcm(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, ocm ocmVar, rcm rcmVar, scm scmVar, wcm wcmVar, tcm tcmVar, pcm pcmVar, lcm lcmVar, mcm mcmVar, ncm ncmVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = pointArr;
        this.f = i2;
        this.g = ocmVar;
        this.h = rcmVar;
        this.i = scmVar;
        this.j = wcmVar;
        this.k = tcmVar;
        this.l = pcmVar;
        this.m = lcmVar;
        this.n = mcmVar;
        this.o = ncmVar;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.f;
    }

    public final lcm d() {
        return this.m;
    }

    public final mcm e() {
        return this.n;
    }

    public final ncm f() {
        return this.o;
    }

    public final ocm g() {
        return this.g;
    }

    public final pcm h() {
        return this.l;
    }

    public final rcm j() {
        return this.h;
    }

    public final scm k() {
        return this.i;
    }

    public final tcm l() {
        return this.k;
    }

    public final wcm m() {
        return this.j;
    }

    public final String n() {
        return this.b;
    }

    public final String p() {
        return this.c;
    }

    public final byte[] s() {
        return this.d;
    }

    public final Point[] t() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 2, this.b);
        jol.o(parcel, 3, this.c);
        jol.i(parcel, 4, this.d);
        jol.q(parcel, 5, this.e, i);
        int i3 = this.f;
        jol.s(parcel, 6, 4);
        parcel.writeInt(i3);
        jol.n(parcel, 7, this.g, i);
        jol.n(parcel, 8, this.h, i);
        jol.n(parcel, 9, this.i, i);
        jol.n(parcel, 10, this.j, i);
        jol.n(parcel, 11, this.k, i);
        jol.n(parcel, 12, this.l, i);
        jol.n(parcel, 13, this.m, i);
        jol.n(parcel, 14, this.n, i);
        jol.n(parcel, 15, this.o, i);
        jol.u(iT, parcel);
    }
}
