package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b49 implements l49 {
    public static final b49 a = new b49();
    public static final Parcelable.Creator<b49> CREATOR = new v39(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b49);
    }

    public final int hashCode() {
        return 1079494498;
    }

    public final String toString() {
        return "Progress";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
