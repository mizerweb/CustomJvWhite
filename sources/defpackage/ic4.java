package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ic4 implements Parcelable {
    public static final Parcelable.Creator<ic4> CREATOR = new s9(13);
    public final String a;
    public final long b;
    public final String c;

    public ic4(long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic4)) {
            return false;
        }
        ic4 ic4Var = (ic4) obj;
        return cqk.d(this.a, ic4Var.a) && this.b == ic4Var.b && cqk.d(this.c, ic4Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + qt4.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.q(nbh.B(this.b, "Avatar(url=", this.a, ", sourceId="), ", abbreviation=", this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
    }
}
