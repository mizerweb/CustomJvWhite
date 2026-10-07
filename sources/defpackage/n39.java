package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class n39 implements l49 {
    public static final n39 a = new n39();
    public static final Parcelable.Creator<n39> CREATOR = new uu5(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n39);
    }

    public final int hashCode() {
        return 2052274178;
    }

    public final String toString() {
        return "ErrorMessageNotFounded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
