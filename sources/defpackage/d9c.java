package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class d9c implements f9c {
    public static final d9c a = new d9c();
    public static final Parcelable.Creator<d9c> CREATOR = new p8c(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d9c);
    }

    public final int hashCode() {
        return -1194056294;
    }

    public final String toString() {
        return "Empty";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
