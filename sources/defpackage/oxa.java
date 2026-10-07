package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class oxa extends z3 {
    public static final Parcelable.Creator<oxa> CREATOR = new eu1(7);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public oxa(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = jol.b(parcel);
        jol.k(parcel, 1, this.a);
        jol.k(parcel, 2, this.b);
        jol.k(parcel, 3, this.c);
        jol.m(parcel, 4, this.d);
        jol.m(parcel, 5, this.e);
        jol.o(parcel, 6, this.f);
        jol.o(parcel, 7, this.g);
        jol.k(parcel, 8, this.h);
        jol.k(parcel, 9, this.i);
        jol.c(iB, parcel);
    }
}
