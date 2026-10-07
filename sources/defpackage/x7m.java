package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class x7m extends z3 {
    public static final Parcelable.Creator<x7m> CREATOR = new c9m();
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public qul f;
    public f1m g;
    public h3m h;
    public q6m i;
    public g5m j;
    public rwl k;
    public zll l;
    public zol m;
    public zrl n;
    public byte[] o;
    public boolean p;
    public double q;

    public x7m(int i, String str, String str2, int i2, Point[] pointArr, qul qulVar, f1m f1mVar, h3m h3mVar, q6m q6mVar, g5m g5mVar, rwl rwlVar, zll zllVar, zol zolVar, zrl zrlVar, byte[] bArr, boolean z, double d) {
        this.a = i;
        this.b = str;
        this.o = bArr;
        this.c = str2;
        this.d = i2;
        this.e = pointArr;
        this.p = z;
        this.q = d;
        this.f = qulVar;
        this.g = f1mVar;
        this.h = h3mVar;
        this.i = q6mVar;
        this.j = g5mVar;
        this.k = rwlVar;
        this.l = zllVar;
        this.m = zolVar;
        this.n = zrlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        int i3 = this.d;
        jol.s(parcel, 5, 4);
        parcel.writeInt(i3);
        jol.q(parcel, 6, this.e, i);
        jol.n(parcel, 7, this.f, i);
        jol.n(parcel, 8, this.g, i);
        jol.n(parcel, 9, this.h, i);
        jol.n(parcel, 10, this.i, i);
        jol.n(parcel, 11, this.j, i);
        jol.n(parcel, 12, this.k, i);
        jol.n(parcel, 13, this.l, i);
        jol.n(parcel, 14, this.m, i);
        jol.n(parcel, 15, this.n, i);
        jol.i(parcel, 16, this.o);
        boolean z = this.p;
        jol.s(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.q;
        jol.s(parcel, 18, 8);
        parcel.writeDouble(d);
        jol.u(iT, parcel);
    }

    public x7m() {
    }
}
