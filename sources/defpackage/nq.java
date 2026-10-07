package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class nq extends e0 {
    public static final Parcelable.Creator<nq> CREATOR = new d0(1);
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public boolean g;

    public nq(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readByte() != 0;
    }

    @Override // defpackage.e0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public nq(Parcelable parcelable) {
        super(parcelable);
    }
}
