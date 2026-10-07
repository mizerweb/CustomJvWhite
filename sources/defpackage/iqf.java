package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class iqf implements Parcelable {
    public static final Parcelable.Creator<iqf> CREATOR = new c5e(7);
    public final int a;
    public final ynh b;
    public final int c;

    public iqf(int i, int i2, ynh ynhVar) {
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqf)) {
            return false;
        }
        iqf iqfVar = (iqf) obj;
        return this.a == iqfVar.a && cqk.d(this.b, iqfVar.b) && this.c == iqfVar.c;
    }

    public final int hashCode() {
        return qt4.D(this.c) + bc1.h(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", caption=");
        sb.append(this.b);
        sb.append(", type=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "NEUTRAL";
        } else {
            str = "LINK";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        int i2 = this.c;
        if (i2 == 1) {
            str = "LINK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "NEUTRAL";
        }
        parcel.writeString(str);
    }
}
