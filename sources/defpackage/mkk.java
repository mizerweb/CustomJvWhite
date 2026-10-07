package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class mkk extends z3 implements voe {
    public static final Parcelable.Creator<mkk> CREATOR = new pkk(1);
    public final int a;
    public final int b;
    public final Intent c;

    public mkk(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.voe
    public final Status a() {
        return this.b == 0 ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        jol.n(parcel, 3, this.c, i);
        jol.u(iT, parcel);
    }
}
