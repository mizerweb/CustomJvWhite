package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class te4 extends z3 {
    public static final Parcelable.Creator<te4> CREATOR = new pkk(25);
    public final eue a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public te4(eue eueVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = eueVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 1, this.a, i);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jol.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int[] iArr = this.d;
        if (iArr != null) {
            int iT2 = jol.t(4, parcel);
            parcel.writeIntArray(iArr);
            jol.u(iT2, parcel);
        }
        jol.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        int[] iArr2 = this.f;
        if (iArr2 != null) {
            int iT3 = jol.t(6, parcel);
            parcel.writeIntArray(iArr2);
            jol.u(iT3, parcel);
        }
        jol.u(iT, parcel);
    }
}
