package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class l39 implements l49 {
    public static final l39 a = new l39();
    public static final Parcelable.Creator<l39> CREATOR = new uu5(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l39);
    }

    public final int hashCode() {
        return 796463810;
    }

    public final String toString() {
        return "ErrorBrokenLink";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
