package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class slk extends z3 {
    public static final Parcelable.Creator<slk> CREATOR = new pkk(7);
    public final int a;
    public final amk b;

    public slk(int i, amk amkVar) {
        this.a = i;
        this.b = amkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.n(parcel, 2, this.b, i);
        jol.u(iT, parcel);
    }
}
