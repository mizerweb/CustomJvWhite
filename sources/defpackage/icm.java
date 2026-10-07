package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class icm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String[] strArrE = null;
        int iO = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = iol.o(i, parcel);
            } else if (c != 2) {
                iol.t(i, parcel);
            } else {
                strArrE = iol.e(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new jcm(iO, strArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jcm[i];
    }
}
