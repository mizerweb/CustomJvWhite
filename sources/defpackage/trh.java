package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class trh extends z3 {
    public static final Parcelable.Creator<trh> CREATOR = new pkk(14);
    public final int a;
    public final int b;
    public final byte[] c;

    public trh(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        jol.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        jol.i(parcel, 4, this.c);
        jol.u(iT, parcel);
    }
}
