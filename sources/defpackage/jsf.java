package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jsf extends msf {
    public static final Parcelable.Creator<jsf> CREATOR = new c5e(12);
    public final boolean a;
    public final boolean b;

    public jsf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsf)) {
            return false;
        }
        jsf jsfVar = (jsf) obj;
        return this.a == jsfVar.a && this.b == jsfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return qt4.o("Radio(isChecked=", this.a, ", isEnabled=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
