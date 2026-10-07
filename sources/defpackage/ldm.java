package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ldm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strD = iol.d(i, parcel);
                    break;
                case 2:
                    strD2 = iol.d(i, parcel);
                    break;
                case 3:
                    strD3 = iol.d(i, parcel);
                    break;
                case 4:
                    strD4 = iol.d(i, parcel);
                    break;
                case 5:
                    strD5 = iol.d(i, parcel);
                    break;
                case 6:
                    strD6 = iol.d(i, parcel);
                    break;
                case 7:
                    strD7 = iol.d(i, parcel);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new qcm(strD, strD2, strD3, strD4, strD5, strD6, strD7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new qcm[i];
    }
}
