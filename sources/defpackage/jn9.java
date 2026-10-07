package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public class jn9 extends z3 {
    public static final Parcelable.Creator<jn9> CREATOR = new yyl(0);
    public LatLng a;
    public String b;
    public String c;
    public rj5 d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public View p;
    public int q;
    public String r;
    public float s;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.n(parcel, 2, this.a, i);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        rj5 rj5Var = this.d;
        jol.j(parcel, 5, rj5Var == null ? null : ((m38) rj5Var.b).asBinder());
        float f = this.e;
        jol.s(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f;
        jol.s(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.g;
        jol.s(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.h;
        jol.s(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.i;
        jol.s(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.j;
        jol.s(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.k;
        jol.s(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.l;
        jol.s(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.m;
        jol.s(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.n;
        jol.s(parcel, 15, 4);
        parcel.writeFloat(f7);
        int i2 = this.o;
        jol.s(parcel, 17, 4);
        parcel.writeInt(i2);
        jol.j(parcel, 18, new dqb(this.p));
        int i3 = this.q;
        jol.s(parcel, 19, 4);
        parcel.writeInt(i3);
        jol.o(parcel, 20, this.r);
        float f8 = this.s;
        jol.s(parcel, 21, 4);
        parcel.writeFloat(f8);
        jol.u(iT, parcel);
    }
}
