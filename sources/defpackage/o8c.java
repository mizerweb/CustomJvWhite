package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class o8c implements Parcelable {
    public static final Parcelable.Creator<o8c> CREATOR = new v39(28);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public /* synthetic */ o8c(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) == 0);
    }

    public static o8c a(o8c o8cVar, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = o8cVar.a;
        }
        if ((i4 & 2) != 0) {
            i2 = o8cVar.b;
        }
        if ((i4 & 4) != 0) {
            i3 = o8cVar.c;
        }
        boolean z = o8cVar.d;
        o8cVar.getClass();
        return new o8c(i, i2, i3, z);
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8c)) {
            return false;
        }
        o8c o8cVar = (o8c) obj;
        return this.a == o8cVar.a && this.b == o8cVar.b && this.c == o8cVar.c && this.d == o8cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = c0a.r(this.b, "ContainerParams(gravity=", c0a.k(this.a, "ContainerGravity(value=", ")"), ", topMargin=", ", bottomMargin=");
        sbR.append(this.c);
        sbR.append(", ignoreInsets=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public o8c(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
