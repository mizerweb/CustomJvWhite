package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b9c implements f9c {
    public static final b9c a = new b9c();
    public static final Parcelable.Creator<b9c> CREATOR = new p8c(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b9c);
    }

    public final int hashCode() {
        return -1310310577;
    }

    public final String toString() {
        return "CancelBtn";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
