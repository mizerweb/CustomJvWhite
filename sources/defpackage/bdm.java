package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class bdm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String strD = null;
        int iO = 0;
        int iO2 = 0;
        int iO3 = 0;
        int iO4 = 0;
        int iO5 = 0;
        int iO6 = 0;
        boolean zJ = false;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = iol.o(i, parcel);
                    break;
                case 2:
                    iO2 = iol.o(i, parcel);
                    break;
                case 3:
                    iO3 = iol.o(i, parcel);
                    break;
                case 4:
                    iO4 = iol.o(i, parcel);
                    break;
                case 5:
                    iO5 = iol.o(i, parcel);
                    break;
                case 6:
                    iO6 = iol.o(i, parcel);
                    break;
                case 7:
                    zJ = iol.j(i, parcel);
                    break;
                case '\b':
                    strD = iol.d(i, parcel);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new kcm(iO, iO2, iO3, iO4, iO5, iO6, zJ, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kcm[i];
    }
}
