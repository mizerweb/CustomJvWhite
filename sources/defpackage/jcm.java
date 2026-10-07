package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jcm extends z3 {
    public static final Parcelable.Creator<jcm> CREATOR = new icm();
    private final int a;
    private final String[] b;

    public jcm(int i, String[] strArr) {
        this.a = i;
        this.b = strArr;
    }

    public final int b() {
        return this.a;
    }

    public final String[] c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        jol.p(parcel, 2, this.b);
        jol.u(iT, parcel);
    }
}
