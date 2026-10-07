package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ook extends z3 {
    public static final Parcelable.Creator<ook> CREATOR = new qok();
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public ook(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
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
        long j = this.d;
        jol.s(parcel, 5, 8);
        parcel.writeLong(j);
        int i5 = this.e;
        jol.s(parcel, 6, 4);
        parcel.writeInt(i5);
        jol.u(iT, parcel);
    }

    public ook() {
    }
}
