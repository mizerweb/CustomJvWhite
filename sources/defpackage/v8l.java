package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class v8l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        long jQ = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iO = iol.o(i, parcel);
            } else if (c == 2) {
                iO2 = iol.o(i, parcel);
            } else if (c == 3) {
                iO3 = iol.o(i, parcel);
            } else if (c == 4) {
                jQ = iol.q(i, parcel);
            } else if (c != 5) {
                iol.t(i, parcel);
            } else {
                iO4 = iol.o(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new raj(iO, iO2, iO3, jQ, iO4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new raj[i];
    }
}
