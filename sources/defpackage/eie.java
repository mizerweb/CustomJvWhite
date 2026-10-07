package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eie extends z3 {
    public static final Parcelable.Creator<eie> CREATOR = new c5e(2);
    public final Bundle a;
    public mw b;

    public eie(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.h(parcel, 2, this.a);
        jol.u(iT, parcel);
    }
}
