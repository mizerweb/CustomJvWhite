package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rwl extends z3 {
    public static final Parcelable.Creator<rwl> CREATOR = new xmk();
    public double a;
    public double b;

    public rwl(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        double d = this.a;
        jol.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        jol.s(parcel, 3, 8);
        parcel.writeDouble(d2);
        jol.u(iT, parcel);
    }

    public rwl() {
    }
}
