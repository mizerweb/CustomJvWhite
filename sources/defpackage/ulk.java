package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ulk extends z3 {
    public static final Parcelable.Creator<ulk> CREATOR = new pkk(8);
    public final int a;
    public final le4 b;
    public final cmk c;

    public ulk(int i, le4 le4Var, cmk cmkVar) {
        this.a = i;
        this.b = le4Var;
        this.c = cmkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.n(parcel, 2, this.b, i);
        jol.n(parcel, 3, this.c, i);
        jol.u(iT, parcel);
    }
}
