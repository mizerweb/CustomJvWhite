package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class qs5 implements Parcelable {
    public static final Parcelable.Creator<qs5> CREATOR = new s9(26);
    public final long a;
    public final long b;

    public qs5(long j, long j2) {
        lvb.R(j >= 0);
        lvb.R(j2 >= 0 || j2 == -1);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs5)) {
            return false;
        }
        qs5 qs5Var = (qs5) obj;
        return this.a == qs5Var.a && this.b == qs5Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 961) + ((int) this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
