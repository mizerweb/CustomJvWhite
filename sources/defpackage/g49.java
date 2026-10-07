package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class g49 implements l49 {
    public static final g49 a = new g49();
    public static final Parcelable.Creator<g49> CREATOR = new v39(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g49);
    }

    public final int hashCode() {
        return 1867749234;
    }

    public final String toString() {
        return "ShowContactRemoved";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
