package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class kbi implements Parcelable {
    public static final Parcelable.Creator<kbi> CREATOR = new c5e(26);
    public final tx4 a;
    public final nx4 b;

    public kbi(tx4 tx4Var, nx4 nx4Var) {
        this.a = tx4Var;
        this.b = nx4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbi)) {
            return false;
        }
        kbi kbiVar = (kbi) obj;
        return cqk.d(this.a, kbiVar.a) && cqk.d(this.b, kbiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UndoStackEntry(viewState=" + this.a + ", transform=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
    }
}
