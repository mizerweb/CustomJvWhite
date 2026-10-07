package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eue extends z3 {
    public static final Parcelable.Creator<eue> CREATOR = new pkk(15);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public eue(int i, int i2, int i3, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jol.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jol.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        jol.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        jol.u(iT, parcel);
    }
}
