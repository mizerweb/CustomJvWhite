package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class p39 implements l49 {
    public static final p39 a = new p39();
    public static final Parcelable.Creator<p39> CREATOR = new uu5(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p39);
    }

    public final int hashCode() {
        return 1304939987;
    }

    public final String toString() {
        return "ErrorPrivateChannel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
