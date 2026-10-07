package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class tnh extends ynh {
    public static final snh CREATOR = new snh();
    public final int c;

    public tnh(int i) {
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tnh) && this.c == ((tnh) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return c0a.k(this.c, "Resource(resId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
    }
}
