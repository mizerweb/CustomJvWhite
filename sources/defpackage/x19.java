package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class x19 implements Parcelable {
    public static final Parcelable.Creator<x19> CREATOR = new uu5(16);
    public int a;
    public int b;
    public boolean c;

    public x19(x19 x19Var) {
        this.a = x19Var.a;
        this.b = x19Var.b;
        this.c = x19Var.c;
    }

    public final boolean a() {
        return this.a >= 0;
    }

    public final void b() {
        this.a = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public x19() {
    }
}
