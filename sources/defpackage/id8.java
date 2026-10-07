package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class id8 implements ld8 {
    public static final Parcelable.Creator<id8> CREATOR = new uu5(9);
    public final int a;
    public final List b;
    public final List c;
    public final long d;

    public id8(int i, List list, List list2, long j) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id8)) {
            return false;
        }
        id8 id8Var = (id8) obj;
        return this.a == id8Var.a && cqk.d(this.b, id8Var.b) && cqk.d(this.c, id8Var.c) && this.d == id8Var.d;
    }

    public final int hashCode() {
        int iC = qv1.c(Integer.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        return Long.hashCode(this.d) + ((iC + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "AnimatedVectorDrawable(animatedVectorDrawableResId=" + this.a + ", backgroundColorPaths=" + this.b + ", foregroundColorPaths=" + this.c + ", delayBeforeAnimation=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeLong(this.d);
    }
}
