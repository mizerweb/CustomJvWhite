package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f49 implements l49, j49 {
    public static final Parcelable.Creator<f49> CREATOR = new v39(9);
    public final long a;
    public final String b;
    public final String c;

    public f49(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l49, defpackage.j49
    public final String i() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
