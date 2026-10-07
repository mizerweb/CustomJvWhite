package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class fu1 implements Parcelable {
    public static final Parcelable.Creator<fu1> CREATOR = new eu1(0);
    public static final fu1 c = new fu1(0, 0);
    public final long a;
    public final int b;

    public fu1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return this.a == fu1Var.a && this.b == fu1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
