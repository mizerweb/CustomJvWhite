package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c9c implements f9c {
    public static final c9c a = new c9c();
    public static final Parcelable.Creator<c9c> CREATOR = new p8c(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c9c);
    }

    public final int hashCode() {
        return 1634881352;
    }

    public final String toString() {
        return "Chevron";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
