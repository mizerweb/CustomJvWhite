package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nc4 implements pc4 {
    public static final Parcelable.Creator<nc4> CREATOR = new s9(16);
    public final int a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final Integer f;
    public final List g;
    public final long h;
    public final Integer i;
    public final Integer j;

    public nc4(int i, List list, int i2, int i3, int i4, Integer num, List list2, long j, Integer num2, Integer num3) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = num;
        this.g = list2;
        this.h = j;
        this.i = num2;
        this.j = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc4)) {
            return false;
        }
        nc4 nc4Var = (nc4) obj;
        return this.a == nc4Var.a && cqk.d(this.b, nc4Var.b) && this.c == nc4Var.c && this.d == nc4Var.d && this.e == nc4Var.e && cqk.d(this.f, nc4Var.f) && cqk.d(this.g, nc4Var.g) && this.h == nc4Var.h && cqk.d(this.i, nc4Var.i) && cqk.d(this.j, nc4Var.j);
    }

    @Override // defpackage.pc4
    public final int getSize() {
        return this.d;
    }

    public final int hashCode() {
        int iC = zo5.c(this.e, c0a.f(this.d, c0a.f(this.c, qv1.c(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31);
        Integer num = this.f;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        int iG = qt4.g((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
        Integer num2 = this.i;
        int iHashCode2 = (iG + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.pc4
    public final Integer q() {
        return this.i;
    }

    public final String toString() {
        return "AnimatedVectorDrawable(drawableResId=" + this.a + ", backgroundColorPaths=" + this.b + ", appearance=" + tt2.k(this.c) + ", size=" + tt2.l(this.d) + ", backgroundPathsColor=" + this.e + ", foregroundPathsColor=" + this.f + ", foregroundColorPaths=" + this.g + ", delayBeforeAnimation=" + this.h + ", customBackground=" + this.i + ", iconCustomTint=" + this.j + ")";
    }

    @Override // defpackage.pc4
    public final int w() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(tt2.h(this.c));
        parcel.writeString(tt2.i(this.d));
        parcel.writeInt(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.g);
        parcel.writeLong(this.h);
        Integer num2 = this.i;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.j;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    @Override // defpackage.pc4
    public final Integer z() {
        return this.j;
    }
}
