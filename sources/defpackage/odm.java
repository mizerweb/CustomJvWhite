package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class odm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String strD = null;
        String strD2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = iol.d(i, parcel);
            } else if (c != 2) {
                iol.t(i, parcel);
            } else {
                strD2 = iol.d(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new tcm(strD, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tcm[i];
    }
}
