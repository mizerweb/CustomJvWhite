package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d49 implements l49, j49 {
    public static final Parcelable.Creator<d49> CREATOR = new v39(7);
    public final q24 a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final String f;

    public d49(q24 q24Var, long j, long j2, long j3, boolean z, String str) {
        this.a = q24Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l49, defpackage.j49
    public final String i() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }
}
