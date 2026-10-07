package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class xmk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        double dK = 0.0d;
        double dK2 = 0.0d;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                dK = iol.k(i, parcel);
            } else if (c != 3) {
                iol.t(i, parcel);
            } else {
                dK2 = iol.k(i, parcel);
            }
        }
        iol.h(iU, parcel);
        return new rwl(dK, dK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwl[i];
    }
}
