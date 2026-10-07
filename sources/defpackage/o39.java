package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o39 implements l49 {
    public static final o39 a = new o39();
    public static final Parcelable.Creator<o39> CREATOR = new uu5(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o39);
    }

    public final int hashCode() {
        return 1619798497;
    }

    public final String toString() {
        return "ErrorPostNotFounded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
