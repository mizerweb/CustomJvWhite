package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rnh extends ynh {
    public static final qnh CREATOR = new qnh();
    public final int c;
    public final int d;
    public final List e;

    public rnh(int i, int i2, List list) {
        this.c = i;
        this.d = i2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnh)) {
            return false;
        }
        rnh rnhVar = (rnh) obj;
        return this.c == rnhVar.c && this.d == rnhVar.d && cqk.d(this.e, rnhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.c(this.d, Integer.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        return qv1.n(")", qv1.p("PluralsParams(resId=", this.c, ", quantity=", this.d, ", args="), this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeList(this.e);
    }
}
