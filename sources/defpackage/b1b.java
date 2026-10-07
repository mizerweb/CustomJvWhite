package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b1b extends z3 {
    public static final Parcelable.Creator<b1b> CREATOR = new pkk(0);
    public final PendingIntent a;

    public b1b(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 1, this.a, i);
        jol.u(iT, parcel);
    }
}
