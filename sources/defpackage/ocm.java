package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ocm extends z3 {
    public static final Parcelable.Creator<ocm> CREATOR = new fdm();
    private final int a;
    private final String b;
    private final String c;
    private final String d;

    public ocm(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        jol.o(parcel, 2, this.b);
        jol.o(parcel, 3, this.c);
        jol.o(parcel, 4, this.d);
        jol.u(iT, parcel);
    }
}
