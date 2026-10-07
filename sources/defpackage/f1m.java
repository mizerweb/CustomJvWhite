package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f1m extends z3 {
    public static final Parcelable.Creator<f1m> CREATOR = new cnk();
    public int a;
    public String b;

    public f1m(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 3, this.b);
        jol.u(iT, parcel);
    }

    public f1m() {
    }
}
