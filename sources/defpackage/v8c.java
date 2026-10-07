package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v8c implements a9c {
    public static final Parcelable.Creator<v8c> CREATOR = new p8c(4);
    public final int a;
    public final int b;

    public v8c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c)) {
            return false;
        }
        v8c v8cVar = (v8c) obj;
        return this.a == v8cVar.a && this.b == v8cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("ColoredIcon(iconRes=", this.a, ", tintColor=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
