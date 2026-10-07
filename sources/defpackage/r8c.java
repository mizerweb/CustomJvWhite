package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class r8c extends u8c {
    public static final Parcelable.Creator<r8c> CREATOR = new p8c(1);
    public final long b;

    public r8c(long j) {
        super(j);
        this.b = j;
    }

    @Override // defpackage.u8c
    public final long a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8c) && this.b == ((r8c) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "Limited(milliseconds=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }
}
