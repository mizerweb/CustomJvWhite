package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ddm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        qcm qcmVar = null;
        String strD = null;
        String strD2 = null;
        rcm[] rcmVarArr = null;
        ocm[] ocmVarArr = null;
        String[] strArrE = null;
        jcm[] jcmVarArr = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    qcmVar = (qcm) iol.c(parcel, i, qcm.CREATOR);
                    break;
                case 2:
                    strD = iol.d(i, parcel);
                    break;
                case 3:
                    strD2 = iol.d(i, parcel);
                    break;
                case 4:
                    rcmVarArr = (rcm[]) iol.f(parcel, i, rcm.CREATOR);
                    break;
                case 5:
                    ocmVarArr = (ocm[]) iol.f(parcel, i, ocm.CREATOR);
                    break;
                case 6:
                    strArrE = iol.e(i, parcel);
                    break;
                case 7:
                    jcmVarArr = (jcm[]) iol.f(parcel, i, jcm.CREATOR);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new mcm(qcmVar, strD, strD2, rcmVarArr, ocmVarArr, strArrE, jcmVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mcm[i];
    }
}
