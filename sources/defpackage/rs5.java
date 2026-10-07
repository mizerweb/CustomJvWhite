package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class rs5 implements Parcelable {
    public static final Parcelable.Creator<rs5> CREATOR = new s9(27);
    public final long a;
    public final long b;

    public rs5(long j, long j2) {
        lvb.R(j2 >= 0 || j2 == -9223372036854775807L);
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rs5)) {
            return false;
        }
        rs5 rs5Var = (rs5) obj;
        return this.a == rs5Var.a && this.b == rs5Var.b;
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
