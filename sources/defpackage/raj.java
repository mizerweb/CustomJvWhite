package defpackage;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class raj extends z3 {
    public static final Parcelable.Creator<raj> CREATOR = new v8l();
    public final int a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;

    public raj(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.e = i3;
        this.c = j;
        this.d = i4;
    }

    public Matrix b() {
        return z78.b().e(this.a, this.b, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.e;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i4);
        long j = this.c;
        jol.s(parcel, 4, 8);
        parcel.writeLong(j);
        int i5 = this.d;
        jol.s(parcel, 5, 4);
        parcel.writeInt(i5);
        jol.u(iT, parcel);
    }
}
