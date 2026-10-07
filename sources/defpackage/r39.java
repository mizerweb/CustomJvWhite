package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r39 implements l49 {
    public static final r39 a = new r39();
    public static final Parcelable.Creator<r39> CREATOR = new uu5(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r39);
    }

    public final int hashCode() {
        return 696488196;
    }

    public final String toString() {
        return "ErrorWebAppNotExist";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
