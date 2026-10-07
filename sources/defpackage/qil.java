package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qil extends z3 {
    public static final Parcelable.Creator<qil> CREATOR = new pkk(23);
    public Bundle a;
    public do6[] b;
    public int c;
    public te4 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.h(parcel, 1, this.a);
        jol.q(parcel, 2, this.b, i);
        int i2 = this.c;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i2);
        jol.n(parcel, 4, this.d, i);
        jol.u(iT, parcel);
    }
}
