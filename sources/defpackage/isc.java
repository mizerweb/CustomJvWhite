package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isc implements lsc {
    public static final Parcelable.Creator<isc> CREATOR = new p8c(16);
    public final int a;
    public final List b;
    public final List c;
    public final long d;

    public isc(int i, List list, List list2, long j) {
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
        if (!(obj instanceof isc)) {
            return false;
        }
        isc iscVar = (isc) obj;
        return this.a == iscVar.a && cqk.d(this.b, iscVar.b) && cqk.d(this.c, iscVar.c) && this.d == iscVar.d;
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
