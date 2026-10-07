package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n8c implements Parcelable {
    public static final Parcelable.Creator<n8c> CREATOR = new v39(27);
    public final int a;

    public /* synthetic */ n8c(int i) {
        this.a = i;
    }

    public static final boolean a(int i) {
        return i == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n8c) {
            return this.a == ((n8c) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "ContainerGravity(value=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
