package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class mfl extends z3 {
    public static final Parcelable.Creator<mfl> CREATOR = new dcl();
    public int a;
    public String[] b;

    public mfl(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        jol.p(parcel, 3, this.b);
        jol.u(iT, parcel);
    }

    public mfl() {
    }
}
