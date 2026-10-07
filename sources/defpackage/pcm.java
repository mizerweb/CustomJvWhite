package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pcm extends z3 {
    public static final Parcelable.Creator<pcm> CREATOR = new gdm();
    private final double a;
    private final double b;

    public pcm(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double b() {
        return this.a;
    }

    public final double c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        double d = this.a;
        jol.s(parcel, 1, 8);
        parcel.writeDouble(d);
        double d2 = this.b;
        jol.s(parcel, 2, 8);
        parcel.writeDouble(d2);
        jol.u(iT, parcel);
    }
}
