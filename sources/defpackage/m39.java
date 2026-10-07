package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m39 implements l49 {
    public static final m39 a = new m39();
    public static final Parcelable.Creator<m39> CREATOR = new uu5(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m39);
    }

    public final int hashCode() {
        return 45102270;
    }

    public final String toString() {
        return "ErrorCommon";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
