package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q6m extends z3 {
    public static final Parcelable.Creator<q6m> CREATOR = new pnk();
    public String a;
    public String b;
    public int c;

    public q6m(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 2, this.a);
        jol.o(parcel, 3, this.b);
        int i2 = this.c;
        jol.s(parcel, 4, 4);
        parcel.writeInt(i2);
        jol.u(iT, parcel);
    }

    public q6m() {
    }
}
