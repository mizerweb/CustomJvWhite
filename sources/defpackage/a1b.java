package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a1b extends z3 {
    public static final Parcelable.Creator<a1b> CREATOR = new c5e(29);
    public final boolean a;
    public final int b;

    public a1b(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        jol.u(iT, parcel);
    }
}
