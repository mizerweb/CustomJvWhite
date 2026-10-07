package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c9m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iU = iol.u(parcel);
        double dK = 0.0d;
        int iO = 0;
        int iO2 = 0;
        boolean zJ = false;
        String strD = null;
        String strD2 = null;
        Point[] pointArr = null;
        qul qulVar = null;
        f1m f1mVar = null;
        h3m h3mVar = null;
        q6m q6mVar = null;
        g5m g5mVar = null;
        rwl rwlVar = null;
        zll zllVar = null;
        zol zolVar = null;
        zrl zrlVar = null;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iU) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    iO = iol.o(i, parcel);
                    break;
                case 3:
                    strD = iol.d(i, parcel);
                    break;
                case 4:
                    strD2 = iol.d(i, parcel);
                    break;
                case 5:
                    iO2 = iol.o(i, parcel);
                    break;
                case 6:
                    pointArr = (Point[]) iol.f(parcel, i, Point.CREATOR);
                    break;
                case 7:
                    qulVar = (qul) iol.c(parcel, i, qul.CREATOR);
                    break;
                case '\b':
                    f1mVar = (f1m) iol.c(parcel, i, f1m.CREATOR);
                    break;
                case '\t':
                    h3mVar = (h3m) iol.c(parcel, i, h3m.CREATOR);
                    break;
                case '\n':
                    q6mVar = (q6m) iol.c(parcel, i, q6m.CREATOR);
                    break;
                case 11:
                    g5mVar = (g5m) iol.c(parcel, i, g5m.CREATOR);
                    break;
                case '\f':
                    rwlVar = (rwl) iol.c(parcel, i, rwl.CREATOR);
                    break;
                case '\r':
                    zllVar = (zll) iol.c(parcel, i, zll.CREATOR);
                    break;
                case 14:
                    zolVar = (zol) iol.c(parcel, i, zol.CREATOR);
                    break;
                case 15:
                    zrlVar = (zrl) iol.c(parcel, i, zrl.CREATOR);
                    break;
                case 16:
                    bArrB = iol.b(i, parcel);
                    break;
                case 17:
                    zJ = iol.j(i, parcel);
                    break;
                case 18:
                    dK = iol.k(i, parcel);
                    break;
                default:
                    iol.t(i, parcel);
                    break;
            }
        }
        iol.h(iU, parcel);
        return new x7m(iO, strD, strD2, iO2, pointArr, qulVar, f1mVar, h3mVar, q6mVar, g5mVar, rwlVar, zllVar, zolVar, zrlVar, bArrB, zJ, dK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new x7m[i];
    }
}
