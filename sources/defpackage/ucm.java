package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ucm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        wyl wylVar = null;
        String strD = null;
        String strD2 = null;
        f1m[] f1mVarArr = null;
        qul[] qulVarArr = null;
        String[] strArrE = null;
        mfl[] mflVarArr = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    wylVar = (wyl) iol.c(parcel, i, wyl.CREATOR);
                    break;
                case 3:
                    strD = iol.d(i, parcel);
                    break;
                case 4:
                    strD2 = iol.d(i, parcel);
                    break;
                case 5:
                    f1mVarArr = (f1m[]) iol.f(parcel, i, f1m.CREATOR);
                    break;
                case 6:
                    qulVarArr = (qul[]) iol.f(parcel, i, qul.CREATOR);
                    break;
                case 7:
                    strArrE = iol.e(i, parcel);
                    break;
                case '\b':
                    mflVarArr = (mfl[]) iol.f(parcel, i, mfl.CREATOR);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new zol(wylVar, strD, strD2, f1mVarArr, qulVarArr, strArrE, mflVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zol[i];
    }
}
