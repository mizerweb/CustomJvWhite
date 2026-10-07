package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class eu1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ eu1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = 0;
        String strD = null;
        ArrayList arrayListG = null;
        switch (this.a) {
            case 0:
                return new fu1(parcel.readLong(), parcel.readInt());
            case 1:
                return new v65((Uri) parcel.readParcelable(v65.class.getClassLoader()));
            case 2:
                return new ah7(parcel.readInt());
            case 3:
                return new x0c(parcel.readString(), parcel.readInt(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ynh) parcel.readParcelable(x0c.class.getClassLoader()));
            case 4:
                return new t3f(parcel.readString(), parcel.readInt());
            case 5:
                return new pug(parcel.readLong(), avg.valueOf(parcel.readString()));
            case 6:
                int iU = iol.u(parcel);
                while (parcel.dataPosition() < iU) {
                    int iM = iol.m(parcel);
                    int i = iol.i(iM);
                    if (i == 1) {
                        iO = iol.o(iM, parcel);
                    } else if (i != 2) {
                        iol.t(iM, parcel);
                    } else {
                        arrayListG = iol.g(parcel, iM, oxa.CREATOR);
                    }
                }
                iol.h(iU, parcel);
                return new mlh(iO, arrayListG);
            case 7:
                int iU2 = iol.u(parcel);
                int iO2 = -1;
                long jQ = 0;
                long jQ2 = 0;
                int iO3 = 0;
                int iO4 = 0;
                int iO5 = 0;
                int iO6 = 0;
                String strD2 = null;
                String strD3 = null;
                while (parcel.dataPosition() < iU2) {
                    int iM2 = iol.m(parcel);
                    switch (iol.i(iM2)) {
                        case 1:
                            iO3 = iol.o(iM2, parcel);
                            break;
                        case 2:
                            iO4 = iol.o(iM2, parcel);
                            break;
                        case 3:
                            iO5 = iol.o(iM2, parcel);
                            break;
                        case 4:
                            jQ = iol.q(iM2, parcel);
                            break;
                        case 5:
                            jQ2 = iol.q(iM2, parcel);
                            break;
                        case 6:
                            strD2 = iol.d(iM2, parcel);
                            break;
                        case 7:
                            strD3 = iol.d(iM2, parcel);
                            break;
                        case 8:
                            iO6 = iol.o(iM2, parcel);
                            break;
                        case 9:
                            iO2 = iol.o(iM2, parcel);
                            break;
                        default:
                            iol.t(iM2, parcel);
                            break;
                    }
                }
                iol.h(iU2, parcel);
                return new oxa(iO3, iO4, iO5, jQ, jQ2, strD2, strD3, iO6, iO2);
            case 8:
                int iU3 = iol.u(parcel);
                int iO7 = 0;
                int iO8 = 0;
                PendingIntent pendingIntent = null;
                String strD4 = null;
                Integer numP = null;
                while (parcel.dataPosition() < iU3) {
                    int iM3 = iol.m(parcel);
                    int i2 = iol.i(iM3);
                    if (i2 == 1) {
                        iO7 = iol.o(iM3, parcel);
                    } else if (i2 == 2) {
                        iO8 = iol.o(iM3, parcel);
                    } else if (i2 == 3) {
                        pendingIntent = (PendingIntent) iol.c(parcel, iM3, PendingIntent.CREATOR);
                    } else if (i2 == 4) {
                        strD4 = iol.d(iM3, parcel);
                    } else if (i2 != 5) {
                        iol.t(iM3, parcel);
                    } else {
                        numP = iol.p(iM3, parcel);
                    }
                }
                iol.h(iU3, parcel);
                return new le4(iO7, iO8, pendingIntent, strD4, numP);
            case 9:
                int iU4 = iol.u(parcel);
                int iO9 = 0;
                boolean zJ = false;
                String strD5 = null;
                long jQ3 = -1;
                while (parcel.dataPosition() < iU4) {
                    int iM4 = iol.m(parcel);
                    int i3 = iol.i(iM4);
                    if (i3 == 1) {
                        strD5 = iol.d(iM4, parcel);
                    } else if (i3 == 2) {
                        iO9 = iol.o(iM4, parcel);
                    } else if (i3 == 3) {
                        jQ3 = iol.q(iM4, parcel);
                    } else if (i3 != 4) {
                        iol.t(iM4, parcel);
                    } else {
                        zJ = iol.j(iM4, parcel);
                    }
                }
                iol.h(iU4, parcel);
                return new do6(iO9, jQ3, strD5, zJ);
            default:
                int iU5 = iol.u(parcel);
                PendingIntent pendingIntent2 = null;
                le4 le4Var = null;
                while (parcel.dataPosition() < iU5) {
                    int iM5 = iol.m(parcel);
                    int i4 = iol.i(iM5);
                    if (i4 == 1) {
                        iO = iol.o(iM5, parcel);
                    } else if (i4 == 2) {
                        strD = iol.d(iM5, parcel);
                    } else if (i4 == 3) {
                        pendingIntent2 = (PendingIntent) iol.c(parcel, iM5, PendingIntent.CREATOR);
                    } else if (i4 != 4) {
                        iol.t(iM5, parcel);
                    } else {
                        le4Var = (le4) iol.c(parcel, iM5, le4.CREATOR);
                    }
                }
                iol.h(iU5, parcel);
                return new Status(iO, strD, pendingIntent2, le4Var);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fu1[i];
            case 1:
                return new v65[i];
            case 2:
                return new ah7[i];
            case 3:
                return new x0c[i];
            case 4:
                return new t3f[i];
            case 5:
                return new pug[i];
            case 6:
                return new mlh[i];
            case 7:
                return new oxa[i];
            case 8:
                return new le4[i];
            case 9:
                return new do6[i];
            default:
                return new Status[i];
        }
    }
}
