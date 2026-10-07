package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class isf extends msf {
    public static final Parcelable.Creator<isf> CREATOR = new c5e(11);
    public final ynh a;
    public final Integer b;

    public isf(ynh ynhVar, Integer num) {
        this.a = ynhVar;
        this.b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isf)) {
            return false;
        }
        isf isfVar = (isf) obj;
        return cqk.d(this.a, isfVar.a) && cqk.d(this.b, isfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Property(text=" + this.a + ", icon=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }
}
