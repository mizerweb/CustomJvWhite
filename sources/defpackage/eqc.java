package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eqc implements Parcelable {
    public static final Parcelable.Creator<eqc> CREATOR = new p8c(15);
    public final String a;
    public final String[] b;
    public final int c;

    public eqc(String str, String[] strArr, int i) {
        this.a = str;
        this.b = strArr;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final String[] b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeInt(this.c);
    }
}
