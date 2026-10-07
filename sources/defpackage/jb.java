package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class jb implements Parcelable {
    public static final Parcelable.Creator<jb> CREATOR = new s9(1);
    public final int a;
    public final int b;
    public final String c;

    public jb(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return this.a == jbVar.a && this.b == jbVar.b && cqk.d(this.c, jbVar.c);
    }

    public final int hashCode() {
        int iC = zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return zo5.w(qv1.p("AddLinkState(start=", this.a, ", end=", this.b, ", link="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
