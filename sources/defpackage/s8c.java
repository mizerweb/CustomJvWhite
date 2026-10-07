package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class s8c extends u8c {
    public static final s8c b = new s8c(3500);
    public static final Parcelable.Creator<s8c> CREATOR = new p8c(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s8c);
    }

    public final int hashCode() {
        return -383399562;
    }

    public final String toString() {
        return "Standard";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
