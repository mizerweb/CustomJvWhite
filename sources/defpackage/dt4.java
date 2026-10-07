package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class dt4 extends e0 {
    public static final Parcelable.Creator<dt4> CREATOR = new d0(2);
    public SparseArray c;

    public dt4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // defpackage.e0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public dt4(Parcelable parcelable) {
        super(parcelable);
    }
}
