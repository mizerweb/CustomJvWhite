package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t8c extends u8c {
    public static final t8c b = new t8c(5000);
    public static final Parcelable.Creator<t8c> CREATOR = new p8c(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t8c);
    }

    public final int hashCode() {
        return -950206676;
    }

    public final String toString() {
        return "Timer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
