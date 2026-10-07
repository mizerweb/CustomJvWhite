package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class z39 implements l49 {
    public static final z39 a = new z39();
    public static final Parcelable.Creator<z39> CREATOR = new v39(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z39);
    }

    public final int hashCode() {
        return -1797309930;
    }

    public final String toString() {
        return "OpenExternalSharingToInvite";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
