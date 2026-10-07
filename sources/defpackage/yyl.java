package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.maps.model.LatLng;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class yyl implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        switch (this.a) {
            case 0:
                int iU = iol.u(parcel);
                boolean zJ = false;
                boolean zJ2 = false;
                boolean zJ3 = false;
                int iO = 0;
                int iO2 = 0;
                float fL = 1.0f;
                float fL2 = 0.5f;
                LatLng latLng = null;
                String strD = null;
                String strD2 = null;
                IBinder iBinderN = null;
                float fL3 = 0.0f;
                float fL4 = 0.0f;
                float fL5 = 0.0f;
                float fL6 = 0.0f;
                float fL7 = 0.0f;
                IBinder iBinderN2 = null;
                String strD3 = null;
                float fL8 = 0.0f;
                while (parcel.dataPosition() < iU) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            latLng = (LatLng) iol.c(parcel, i, LatLng.CREATOR);
                            break;
                        case 3:
                            strD = iol.d(i, parcel);
                            break;
                        case 4:
                            strD2 = iol.d(i, parcel);
                            break;
                        case 5:
                            iBinderN = iol.n(i, parcel);
                            break;
                        case 6:
                            fL3 = iol.l(i, parcel);
                            break;
                        case 7:
                            fL4 = iol.l(i, parcel);
                            break;
                        case '\b':
                            zJ = iol.j(i, parcel);
                            break;
                        case '\t':
                            zJ2 = iol.j(i, parcel);
                            break;
                        case '\n':
                            zJ3 = iol.j(i, parcel);
                            break;
                        case 11:
                            fL5 = iol.l(i, parcel);
                            break;
                        case '\f':
                            fL2 = iol.l(i, parcel);
                            break;
                        case '\r':
                            fL6 = iol.l(i, parcel);
                            break;
                        case 14:
                            fL = iol.l(i, parcel);
                            break;
                        case 15:
                            fL7 = iol.l(i, parcel);
                            break;
                        case 16:
                        default:
                            iol.t(i, parcel);
                            break;
                        case 17:
                            iO = iol.o(i, parcel);
                            break;
                        case 18:
                            iBinderN2 = iol.n(i, parcel);
                            break;
                        case 19:
                            iO2 = iol.o(i, parcel);
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                            strD3 = iol.d(i, parcel);
                            break;
                        case 21:
                            fL8 = iol.l(i, parcel);
                            break;
                    }
                }
                iol.h(iU, parcel);
                jn9 jn9Var = new jn9();
                jn9Var.e = 0.5f;
                jn9Var.f = 1.0f;
                jn9Var.h = true;
                jn9Var.i = false;
                jn9Var.j = 0.0f;
                jn9Var.k = 0.5f;
                jn9Var.l = 0.0f;
                jn9Var.m = 1.0f;
                jn9Var.o = 0;
                jn9Var.a = latLng;
                jn9Var.b = strD;
                jn9Var.c = strD2;
                if (iBinderN == null) {
                    view = null;
                    jn9Var.d = null;
                } else {
                    view = null;
                    jn9Var.d = new rj5(dqb.n0(iBinderN));
                }
                jn9Var.e = fL3;
                jn9Var.f = fL4;
                jn9Var.g = zJ;
                jn9Var.h = zJ2;
                jn9Var.i = zJ3;
                jn9Var.j = fL5;
                jn9Var.k = fL2;
                jn9Var.l = fL6;
                jn9Var.m = fL;
                jn9Var.n = fL7;
                jn9Var.q = iO2;
                jn9Var.o = iO;
                m38 m38VarN0 = dqb.n0(iBinderN2);
                jn9Var.p = m38VarN0 == null ? view : (View) dqb.o0(m38VarN0);
                jn9Var.r = strD3;
                jn9Var.s = fL8;
                return jn9Var;
            default:
                int iU2 = iol.u(parcel);
                String strD4 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iU2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 2) {
                        strD4 = iol.d(i2, parcel);
                    } else if (c != 5) {
                        iol.t(i2, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) iol.c(parcel, i2, GoogleSignInOptions.CREATOR);
                    }
                }
                iol.h(iU2, parcel);
                return new SignInConfiguration(strD4, googleSignInOptions);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new jn9[i];
            default:
                return new SignInConfiguration[i];
        }
    }
}
