package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class k39 implements l49 {
    public static final k39 a = new k39();
    public static final Parcelable.Creator<k39> CREATOR = new uu5(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k39);
    }

    public final int hashCode() {
        return 308928755;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
