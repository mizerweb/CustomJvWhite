package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c1b extends z3 {
    public static final Parcelable.Creator<c1b> CREATOR = new pkk(4);
    public final int a;
    public final boolean b;

    public c1b(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jol.u(iT, parcel);
    }
}
