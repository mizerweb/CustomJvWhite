package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class yo7 extends z3 {
    public static final Parcelable.Creator<yo7> CREATOR = new c5e(28);
    public final int a;
    public final int b;
    public final Bundle c;

    public yo7(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        jol.h(parcel, 3, this.c);
        jol.u(iT, parcel);
    }
}
