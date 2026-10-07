package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class vrh extends z3 {
    public static final Parcelable.Creator<vrh> CREATOR = new pkk(16);
    public xpk a;
    public float c;
    public boolean b = true;
    public boolean d = true;
    public float e = 0.0f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        xpk xpkVar = this.a;
        jol.j(parcel, 2, xpkVar == null ? null : xpkVar.asBinder());
        boolean z = this.b;
        jol.s(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        float f = this.c;
        jol.s(parcel, 4, 4);
        parcel.writeFloat(f);
        boolean z2 = this.d;
        jol.s(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f2 = this.e;
        jol.s(parcel, 6, 4);
        parcel.writeFloat(f2);
        jol.u(iT, parcel);
    }
}
