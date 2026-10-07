package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class j39 implements l49 {
    public static final j39 a = new j39();
    public static final Parcelable.Creator<j39> CREATOR = new uu5(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j39);
    }

    public final int hashCode() {
        return -1344246616;
    }

    public final String toString() {
        return "ContentLevelError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
