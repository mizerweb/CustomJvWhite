package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class k49 implements l49 {
    public static final k49 a = new k49();
    public static final Parcelable.Creator<k49> CREATOR = new v39(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k49);
    }

    public final int hashCode() {
        return -939562363;
    }

    public final String toString() {
        return "UnknownFolderError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
