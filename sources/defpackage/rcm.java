package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rcm extends z3 {
    public static final Parcelable.Creator<rcm> CREATOR = new mdm();
    private final int a;
    private final String b;

    public rcm(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 2, this.b);
        jol.u(iT, parcel);
    }
}
