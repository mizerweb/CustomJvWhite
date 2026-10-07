package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qdm extends z3 {
    public static final Parcelable.Creator<qdm> CREATOR = new rdm();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;

    public qdm(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iT = jol.t(20293, parcel);
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
        long j = this.e;
        jol.s(parcel, 5, 8);
        parcel.writeLong(j);
        jol.u(iT, parcel);
    }
}
