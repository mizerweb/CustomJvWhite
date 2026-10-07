package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eu3 extends z3 {
    public static final Parcelable.Creator<eu3> CREATOR = new pkk(12);
    public final Intent a;

    public eu3(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 1, this.a, i);
        jol.u(iT, parcel);
    }
}
