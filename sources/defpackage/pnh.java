package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class pnh extends ynh {
    public static final onh CREATOR = new onh();
    public final int c;
    public final int d;

    public pnh(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnh)) {
            return false;
        }
        pnh pnhVar = (pnh) obj;
        return this.c == pnhVar.c && this.d == pnhVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return nbh.u("Plurals(resId=", this.c, ", quantity=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
