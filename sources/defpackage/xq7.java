package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes4.dex */
public final class xq7 extends z3 {
    public static final Parcelable.Creator<xq7> CREATOR = new pkk(24);
    public rj5 a;
    public LatLng b;
    public float c;
    public float d;
    public LatLngBounds e;
    public float f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.j(parcel, 2, ((m38) this.a.b).asBinder());
        jol.n(parcel, 3, this.b, i);
        float f = this.c;
        jol.s(parcel, 4, 4);
        parcel.writeFloat(f);
        float f2 = this.d;
        jol.s(parcel, 5, 4);
        parcel.writeFloat(f2);
        jol.n(parcel, 6, this.e, i);
        float f3 = this.f;
        jol.s(parcel, 7, 4);
        parcel.writeFloat(f3);
        float f4 = this.g;
        jol.s(parcel, 8, 4);
        parcel.writeFloat(f4);
        boolean z = this.h;
        jol.s(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        float f5 = this.i;
        jol.s(parcel, 10, 4);
        parcel.writeFloat(f5);
        float f6 = this.j;
        jol.s(parcel, 11, 4);
        parcel.writeFloat(f6);
        float f7 = this.k;
        jol.s(parcel, 12, 4);
        parcel.writeFloat(f7);
        boolean z2 = this.l;
        jol.s(parcel, 13, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jol.u(iT, parcel);
    }
}
