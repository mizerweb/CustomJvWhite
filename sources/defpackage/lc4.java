package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lc4 implements Parcelable {
    public static final Parcelable.Creator<lc4> CREATOR = new s9(15);
    public final ynh a;
    public final boolean b;

    public lc4(ynh ynhVar, boolean z) {
        this.a = ynhVar;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc4)) {
            return false;
        }
        lc4 lc4Var = (lc4) obj;
        return cqk.d(this.a, lc4Var.a) && this.b == lc4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckBoxRow(text=" + this.a + ", initialChecked=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
