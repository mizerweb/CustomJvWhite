package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class pnk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        int iO = 0;
        String strD = null;
        String strD2 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strD = iol.d(i, parcel);
            } else if (c == 3) {
                strD2 = iol.d(i, parcel);
            } else if (c != 4) {
                iol.t(i, parcel);
            } else {
                iO = iol.o(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new q6m(strD, strD2, iO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new q6m[i];
    }
}
