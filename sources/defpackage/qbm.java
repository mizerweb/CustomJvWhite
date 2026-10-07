package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class qbm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        sil silVar = null;
        sil silVar2 = null;
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
                    silVar = (sil) iol.c(parcel, i, sil.CREATOR);
                    break;
                case '\b':
                    silVar2 = (sil) iol.c(parcel, i, sil.CREATOR);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new zll(strD, strD2, strD3, strD4, strD5, silVar, silVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zll[i];
    }
}
