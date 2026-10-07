package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class h3m extends z3 {
    public static final Parcelable.Creator<h3m> CREATOR = new hnk();
    public String a;
    public String b;

    public h3m(String str, String str2) {
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

    public h3m() {
    }
}
