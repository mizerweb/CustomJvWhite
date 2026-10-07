package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x8c implements a9c {
    public static final x8c a = new x8c();
    public static final Parcelable.Creator<x8c> CREATOR = new p8c(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x8c);
    }

    public final int hashCode() {
        return -2022406681;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
