package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fsf extends msf {
    public static final fsf a = new fsf();
    public static final Parcelable.Creator<fsf> CREATOR = new c5e(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fsf);
    }

    public final int hashCode() {
        return 1237842843;
    }

    public final String toString() {
        return "Arrow";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
