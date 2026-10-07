package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kcm extends z3 {
    public static final Parcelable.Creator<kcm> CREATOR = new bdm();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private final String h;

    public kcm(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = z;
        this.h = str;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.a;
    }

    public final String h() {
        return this.h;
    }

    public final boolean j() {
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        jol.s(parcel, 4, 4);
        parcel.writeInt(i5);
        int i6 = this.e;
        jol.s(parcel, 5, 4);
        parcel.writeInt(i6);
        int i7 = this.f;
        jol.s(parcel, 6, 4);
        parcel.writeInt(i7);
        boolean z = this.g;
        jol.s(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        jol.o(parcel, 8, this.h);
        jol.u(iT, parcel);
    }
}
