package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q39 implements l49 {
    public static final q39 a = new q39();
    public static final Parcelable.Creator<q39> CREATOR = new uu5(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q39);
    }

    public final int hashCode() {
        return 422605960;
    }

    public final String toString() {
        return "ErrorPrivateChat";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
