package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ycm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        String strD = null;
        String strD2 = null;
        byte[] bArrB = null;
        Point[] pointArr = null;
        ocm ocmVar = null;
        rcm rcmVar = null;
        scm scmVar = null;
        wcm wcmVar = null;
        tcm tcmVar = null;
        pcm pcmVar = null;
        lcm lcmVar = null;
        mcm mcmVar = null;
        ncm ncmVar = null;
        int iO = 0;
        int iO2 = 0;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iO = iol.o(i, parcel);
                    break;
                case 2:
                    strD = iol.d(i, parcel);
                    break;
                case 3:
                    strD2 = iol.d(i, parcel);
                    break;
                case 4:
                    bArrB = iol.b(i, parcel);
                    break;
                case 5:
                    pointArr = (Point[]) iol.f(parcel, i, Point.CREATOR);
                    break;
                case 6:
                    iO2 = iol.o(i, parcel);
                    break;
                case 7:
                    ocmVar = (ocm) iol.c(parcel, i, ocm.CREATOR);
                    break;
                case '\b':
                    rcmVar = (rcm) iol.c(parcel, i, rcm.CREATOR);
                    break;
                case '\t':
                    scmVar = (scm) iol.c(parcel, i, scm.CREATOR);
                    break;
                case '\n':
                    wcmVar = (wcm) iol.c(parcel, i, wcm.CREATOR);
                    break;
                case 11:
                    tcmVar = (tcm) iol.c(parcel, i, tcm.CREATOR);
                    break;
                case '\f':
                    pcmVar = (pcm) iol.c(parcel, i, pcm.CREATOR);
                    break;
                case '\r':
                    lcmVar = (lcm) iol.c(parcel, i, lcm.CREATOR);
                    break;
                case 14:
                    mcmVar = (mcm) iol.c(parcel, i, mcm.CREATOR);
                    break;
                case 15:
                    ncmVar = (ncm) iol.c(parcel, i, ncm.CREATOR);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new xcm(iO, strD, strD2, bArrB, pointArr, iO2, ocmVar, rcmVar, scmVar, wcmVar, tcmVar, pcmVar, lcmVar, mcmVar, ncmVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new xcm[i];
    }
}
