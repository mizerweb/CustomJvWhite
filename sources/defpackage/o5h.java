package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class o5h implements Parcelable {
    public static final Parcelable.Creator<o5h> CREATOR = new c5e(23);
    public final SparseArray a;

    public o5h(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    public final SparseArray a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            parcel.writeInt(iKeyAt);
            parcel.writeString((String) sparseArray.get(iKeyAt));
        }
    }
}
