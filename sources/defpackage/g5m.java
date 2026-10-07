package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class g5m extends z3 {
    public static final Parcelable.Creator<g5m> CREATOR = new knk();
    public String a;
    public String b;

    public g5m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.o(parcel, 2, this.a);
        jol.o(parcel, 3, this.b);
        jol.u(iT, parcel);
    }

    public g5m() {
    }
}
