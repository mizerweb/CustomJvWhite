package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y26 implements Parcelable {
    public static final Parcelable.Creator<y26> CREATOR = new uu5(1);
    public final ArrayList a;
    public final ArrayList b;
    public final Rect c;
    public final boolean d;

    public y26(Parcel parcel) {
        this.a = parcel.createTypedArrayList(jy8.CREATOR);
        this.b = parcel.createTypedArrayList(cy3.CREATOR);
        this.c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.d = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y26.class != obj.getClass()) {
            return false;
        }
        y26 y26Var = (y26) obj;
        ArrayList arrayList = y26Var.a;
        ArrayList arrayList2 = this.a;
        if (arrayList2 != null) {
            if (!arrayList2.equals(arrayList)) {
                return false;
            }
        } else if (arrayList != null) {
            return false;
        }
        ArrayList arrayList3 = y26Var.b;
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null) {
            if (!arrayList4.equals(arrayList3)) {
                return false;
            }
        } else if (arrayList3 != null) {
            return false;
        }
        if (this.d != y26Var.d) {
            return false;
        }
        Rect rect = y26Var.c;
        Rect rect2 = this.c;
        if (rect2 != null) {
            return rect2.equals(rect);
        }
        return rect == null;
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList arrayList2 = this.b;
        int iHashCode2 = (iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        Rect rect = this.c;
        return Boolean.valueOf(this.d).hashCode() + ((iHashCode2 + (rect != null ? rect.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditorState{layers=");
        sb.append(this.a);
        sb.append(", commands=");
        sb.append(this.b);
        sb.append(", bounds=");
        sb.append(this.c);
        sb.append(", drawStickerEnabled=");
        return c0a.p(sb, this.d, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public y26(ArrayList arrayList, ArrayList arrayList2, Rect rect, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = rect;
        this.d = z;
    }
}
