package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class or3 implements Parcelable {
    public static final Parcelable.Creator<or3> CREATOR = new s9(9);
    public final int a;
    public final int b;
    public final float c;

    public or3(int i, float f, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or3)) {
            return false;
        }
        or3 or3Var = (or3) obj;
        return this.a == or3Var.a && this.b == or3Var.b && Float.compare(this.c, or3Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("CircularRevealParams(centerX=", this.a, ", centerY=", this.b, ", startRadius=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
    }
}
