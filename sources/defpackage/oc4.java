package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class oc4 implements pc4 {
    public static final Parcelable.Creator<oc4> CREATOR = new s9(17);
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;

    public oc4(int i, int i2, int i3, Integer num, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc4)) {
            return false;
        }
        oc4 oc4Var = (oc4) obj;
        return this.a == oc4Var.a && this.b == oc4Var.b && this.c == oc4Var.c && cqk.d(this.d, oc4Var.d) && cqk.d(this.e, oc4Var.e);
    }

    @Override // defpackage.pc4
    public final int getSize() {
        return this.b;
    }

    public final int hashCode() {
        int iF = c0a.f(this.c, c0a.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.pc4
    public final Integer q() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbY = zo5.y(this.a, "Drawable(iconRes=", ", size=");
        sbY.append(tt2.l(this.b));
        sbY.append(", appearance=");
        sbY.append(tt2.k(this.c));
        sbY.append(", customBackground=");
        sbY.append(this.d);
        sbY.append(", iconCustomTint=");
        sbY.append(this.e);
        sbY.append(")");
        return sbY.toString();
    }

    @Override // defpackage.pc4
    public final int w() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(tt2.i(this.b));
        parcel.writeString(tt2.h(this.c));
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // defpackage.pc4
    public final Integer z() {
        return this.e;
    }

    public /* synthetic */ oc4(int i, int i2, int i3) {
        this(i, i2, i3, null, null);
    }
}
