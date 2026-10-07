package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zw4 implements Parcelable {
    public static final Parcelable.Creator<zw4> CREATOR = new s9(18);
    public final tx4 a;
    public final nx4 b;
    public final List c;

    public zw4(tx4 tx4Var, nx4 nx4Var, List list) {
        this.a = tx4Var;
        this.b = nx4Var;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw4)) {
            return false;
        }
        zw4 zw4Var = (zw4) obj;
        return cqk.d(this.a, zw4Var.a) && cqk.d(this.b, zw4Var.b) && this.c.equals(zw4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropPhotoSavedState(viewState=");
        sb.append(this.a);
        sb.append(", currentTransform=");
        sb.append(this.b);
        sb.append(", undoStack=");
        return qv1.n(")", sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
        List list = this.c;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((kbi) it.next()).writeToParcel(parcel, i);
        }
    }
}
