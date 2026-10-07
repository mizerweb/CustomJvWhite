package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class z8c implements a9c {
    public static final z8c a = new z8c();
    public static final Parcelable.Creator<z8c> CREATOR = new p8c(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z8c);
    }

    public final int hashCode() {
        return -2008676385;
    }

    public final String toString() {
        return "Timer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
