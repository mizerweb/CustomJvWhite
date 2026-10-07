package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class sdm implements Parcelable.Creator {
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
        String strD8 = null;
        String strD9 = null;
        String strD10 = null;
        String strD11 = null;
        String strD12 = null;
        String strD13 = null;
        String strD14 = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD = iol.d(i, parcel);
                    break;
                case 3:
                    strD2 = iol.d(i, parcel);
                    break;
                case 4:
                    strD3 = iol.d(i, parcel);
                    break;
                case 5:
                    strD4 = iol.d(i, parcel);
                    break;
                case 6:
                    strD5 = iol.d(i, parcel);
                    break;
                case 7:
                    strD6 = iol.d(i, parcel);
                    break;
                case '\b':
                    strD7 = iol.d(i, parcel);
                    break;
                case '\t':
                    strD8 = iol.d(i, parcel);
                    break;
                case '\n':
                    strD9 = iol.d(i, parcel);
                    break;
                case 11:
                    strD10 = iol.d(i, parcel);
                    break;
                case '\f':
                    strD11 = iol.d(i, parcel);
                    break;
                case '\r':
                    strD12 = iol.d(i, parcel);
                    break;
                case 14:
                    strD13 = iol.d(i, parcel);
                    break;
                case 15:
                    strD14 = iol.d(i, parcel);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new zrl(strD, strD2, strD3, strD4, strD5, strD6, strD7, strD8, strD9, strD10, strD11, strD12, strD13, strD14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zrl[i];
    }
}
