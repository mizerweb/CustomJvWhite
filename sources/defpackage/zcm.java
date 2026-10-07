package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class zcm extends z3 {
    public static final Parcelable.Creator<zcm> CREATOR = new adm();
    private final int a;
    private final boolean b;

    public zcm(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        jol.s(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        jol.u(iT, parcel);
    }
}
