package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class sil extends z3 {
    public static final Parcelable.Creator<sil> CREATOR = new iam();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;

    public sil(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        jol.s(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        jol.s(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.e;
        jol.s(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.f;
        jol.s(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.g;
        jol.s(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        jol.o(parcel, 9, this.h);
        jol.u(iT, parcel);
    }

    public sil() {
    }
}
