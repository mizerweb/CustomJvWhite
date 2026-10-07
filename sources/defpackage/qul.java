package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qul extends z3 {
    public static final Parcelable.Creator<qul> CREATOR = new vmk();
    public int a;
    public String b;
    public String c;
    public String d;

    public qul(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        jol.o(parcel, 5, this.d);
        jol.u(iT, parcel);
    }

    public qul() {
    }
}
