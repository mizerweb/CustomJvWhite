package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class pkk implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pkk(int i) {
        this.a = i;
    }

    public static void a(km7 km7Var, Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = km7Var.a;
        jol.s(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = km7Var.b;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = km7Var.c;
        jol.s(parcel, 3, 4);
        parcel.writeInt(i4);
        jol.o(parcel, 4, km7Var.d);
        jol.j(parcel, 5, km7Var.e);
        jol.q(parcel, 6, km7Var.f, i);
        jol.h(parcel, 7, km7Var.g);
        jol.n(parcel, 8, km7Var.h, i);
        jol.q(parcel, 10, km7Var.i, i);
        jol.q(parcel, 11, km7Var.j, i);
        boolean z = km7Var.k;
        jol.s(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = km7Var.l;
        jol.s(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = km7Var.m;
        jol.s(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        jol.o(parcel, 15, km7Var.n);
        jol.u(iT, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        String strD = null;
        LatLng latLng = null;
        IBinder iBinderN = null;
        Bundle bundleA = null;
        String strD2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        xpk spkVar = null;
        byte[] bArrB = null;
        Intent intent = null;
        LatLng latLng2 = null;
        Account account = null;
        le4 le4Var = null;
        amk amkVar = null;
        ArrayList arrayListG = null;
        ArrayList arrayListG2 = null;
        Intent intent2 = null;
        switch (this.a) {
            case 0:
                int iU = iol.u(parcel);
                while (parcel.dataPosition() < iU) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        iol.t(i, parcel);
                    } else {
                        pendingIntent = (PendingIntent) iol.c(parcel, i, PendingIntent.CREATOR);
                    }
                }
                iol.h(iU, parcel);
                return new b1b(pendingIntent);
            case 1:
                int iO = 0;
                int iU2 = iol.u(parcel);
                int iO2 = 0;
                while (parcel.dataPosition() < iU2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iO2 = iol.o(i2, parcel);
                    } else if (c == 2) {
                        iO = iol.o(i2, parcel);
                    } else if (c != 3) {
                        iol.t(i2, parcel);
                    } else {
                        intent2 = (Intent) iol.c(parcel, i2, Intent.CREATOR);
                    }
                }
                iol.h(iU2, parcel);
                return new mkk(iO2, iO, intent2);
            case 2:
                int iU3 = iol.u(parcel);
                long jQ = 0;
                int iO3 = 0;
                String strD3 = null;
                String strD4 = null;
                String strD5 = null;
                String strD6 = null;
                Uri uri = null;
                String strD7 = null;
                String strD8 = null;
                ArrayList arrayListG3 = null;
                String strD9 = null;
                String strD10 = null;
                while (parcel.dataPosition() < iU3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iO3 = iol.o(i3, parcel);
                            break;
                        case 2:
                            strD3 = iol.d(i3, parcel);
                            break;
                        case 3:
                            strD4 = iol.d(i3, parcel);
                            break;
                        case 4:
                            strD5 = iol.d(i3, parcel);
                            break;
                        case 5:
                            strD6 = iol.d(i3, parcel);
                            break;
                        case 6:
                            uri = (Uri) iol.c(parcel, i3, Uri.CREATOR);
                            break;
                        case 7:
                            strD7 = iol.d(i3, parcel);
                            break;
                        case '\b':
                            jQ = iol.q(i3, parcel);
                            break;
                        case '\t':
                            strD8 = iol.d(i3, parcel);
                            break;
                        case '\n':
                            arrayListG3 = iol.g(parcel, i3, Scope.CREATOR);
                            break;
                        case 11:
                            strD9 = iol.d(i3, parcel);
                            break;
                        case '\f':
                            strD10 = iol.d(i3, parcel);
                            break;
                        default:
                            iol.t(i3, parcel);
                            break;
                    }
                }
                iol.h(iU3, parcel);
                return new GoogleSignInAccount(iO3, strD3, strD4, strD5, strD6, uri, strD7, jQ, strD8, arrayListG3, strD9, strD10);
            case 3:
                int iU4 = iol.u(parcel);
                boolean zJ = false;
                String strD11 = null;
                String strD12 = null;
                while (parcel.dataPosition() < iU4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        arrayListG2 = iol.g(parcel, i4, do6.CREATOR);
                    } else if (c2 == 2) {
                        zJ = iol.j(i4, parcel);
                    } else if (c2 == 3) {
                        strD11 = iol.d(i4, parcel);
                    } else if (c2 != 4) {
                        iol.t(i4, parcel);
                    } else {
                        strD12 = iol.d(i4, parcel);
                    }
                }
                iol.h(iU4, parcel);
                return new hp(arrayListG2, zJ, strD11, strD12);
            case 4:
                boolean zJ2 = false;
                int iU5 = iol.u(parcel);
                int iO4 = 0;
                while (parcel.dataPosition() < iU5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iO4 = iol.o(i5, parcel);
                    } else if (c3 != 2) {
                        iol.t(i5, parcel);
                    } else {
                        zJ2 = iol.j(i5, parcel);
                    }
                }
                iol.h(iU5, parcel);
                return new c1b(iO4, zJ2);
            case 5:
                int iU6 = iol.u(parcel);
                int iO5 = 0;
                boolean zJ3 = false;
                boolean zJ4 = false;
                boolean zJ5 = false;
                ArrayList arrayListG4 = null;
                Account account2 = null;
                String strD13 = null;
                String strD14 = null;
                String strD15 = null;
                while (parcel.dataPosition() < iU6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iO5 = iol.o(i6, parcel);
                            break;
                        case 2:
                            arrayListG4 = iol.g(parcel, i6, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) iol.c(parcel, i6, Account.CREATOR);
                            break;
                        case 4:
                            zJ3 = iol.j(i6, parcel);
                            break;
                        case 5:
                            zJ4 = iol.j(i6, parcel);
                            break;
                        case 6:
                            zJ5 = iol.j(i6, parcel);
                            break;
                        case 7:
                            strD13 = iol.d(i6, parcel);
                            break;
                        case '\b':
                            strD14 = iol.d(i6, parcel);
                            break;
                        case '\t':
                            arrayListG = iol.g(parcel, i6, yo7.CREATOR);
                            break;
                        case '\n':
                            strD15 = iol.d(i6, parcel);
                            break;
                        default:
                            iol.t(i6, parcel);
                            break;
                    }
                }
                iol.h(iU6, parcel);
                return new GoogleSignInOptions(iO5, arrayListG4, account2, zJ3, zJ4, zJ5, strD13, strD14, GoogleSignInOptions.c(arrayListG), strD15);
            case 6:
                int iU7 = iol.u(parcel);
                ArrayList<String> arrayList = null;
                String strD16 = null;
                while (parcel.dataPosition() < iU7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        int iR = iol.r(i7, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iR == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iR);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c4 != 2) {
                        iol.t(i7, parcel);
                    } else {
                        strD16 = iol.d(i7, parcel);
                    }
                }
                iol.h(iU7, parcel);
                return new nlk(strD16, arrayList);
            case 7:
                int iU8 = iol.u(parcel);
                int iO6 = 0;
                while (parcel.dataPosition() < iU8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iO6 = iol.o(i8, parcel);
                    } else if (c5 != 2) {
                        iol.t(i8, parcel);
                    } else {
                        amkVar = (amk) iol.c(parcel, i8, amk.CREATOR);
                    }
                }
                iol.h(iU8, parcel);
                return new slk(iO6, amkVar);
            case 8:
                int iU9 = iol.u(parcel);
                int iO7 = 0;
                cmk cmkVar = null;
                while (parcel.dataPosition() < iU9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iO7 = iol.o(i9, parcel);
                    } else if (c6 == 2) {
                        le4Var = (le4) iol.c(parcel, i9, le4.CREATOR);
                    } else if (c6 != 3) {
                        iol.t(i9, parcel);
                    } else {
                        cmkVar = (cmk) iol.c(parcel, i9, cmk.CREATOR);
                    }
                }
                iol.h(iU9, parcel);
                return new ulk(iO7, le4Var, cmkVar);
            case 9:
                int iO8 = 0;
                int iU10 = iol.u(parcel);
                int iO9 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iU10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iO9 = iol.o(i10, parcel);
                    } else if (c7 == 2) {
                        account = (Account) iol.c(parcel, i10, Account.CREATOR);
                    } else if (c7 == 3) {
                        iO8 = iol.o(i10, parcel);
                    } else if (c7 != 4) {
                        iol.t(i10, parcel);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) iol.c(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                iol.h(iU10, parcel);
                return new amk(iO9, account, iO8, googleSignInAccount2);
            case 10:
                int iU11 = iol.u(parcel);
                int iO10 = 0;
                boolean zJ6 = false;
                boolean zJ7 = false;
                IBinder iBinderN2 = null;
                le4 le4Var2 = null;
                while (parcel.dataPosition() < iU11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iO10 = iol.o(i11, parcel);
                    } else if (c8 == 2) {
                        iBinderN2 = iol.n(i11, parcel);
                    } else if (c8 == 3) {
                        le4Var2 = (le4) iol.c(parcel, i11, le4.CREATOR);
                    } else if (c8 == 4) {
                        zJ6 = iol.j(i11, parcel);
                    } else if (c8 != 5) {
                        iol.t(i11, parcel);
                    } else {
                        zJ7 = iol.j(i11, parcel);
                    }
                }
                iol.h(iU11, parcel);
                return new cmk(iO10, iBinderN2, le4Var2, zJ6, zJ7);
            case 11:
                float fL = 0.0f;
                int iU12 = iol.u(parcel);
                float fL2 = 0.0f;
                float fL3 = 0.0f;
                while (parcel.dataPosition() < iU12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        latLng2 = (LatLng) iol.c(parcel, i12, LatLng.CREATOR);
                    } else if (c9 == 3) {
                        fL3 = iol.l(i12, parcel);
                    } else if (c9 == 4) {
                        fL = iol.l(i12, parcel);
                    } else if (c9 != 5) {
                        iol.t(i12, parcel);
                    } else {
                        fL2 = iol.l(i12, parcel);
                    }
                }
                iol.h(iU12, parcel);
                return new CameraPosition(latLng2, fL3, fL, fL2);
            case 12:
                int iU13 = iol.u(parcel);
                while (parcel.dataPosition() < iU13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        iol.t(i13, parcel);
                    } else {
                        intent = (Intent) iol.c(parcel, i13, Intent.CREATOR);
                    }
                }
                iol.h(iU13, parcel);
                return new eu3(intent);
            case 13:
                int iU14 = iol.u(parcel);
                long jQ2 = Long.MAX_VALUE;
                int iO11 = 0;
                boolean zJ8 = false;
                s1l s1lVar = null;
                while (parcel.dataPosition() < iU14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        jQ2 = iol.q(i14, parcel);
                    } else if (c10 == 2) {
                        iO11 = iol.o(i14, parcel);
                    } else if (c10 == 3) {
                        zJ8 = iol.j(i14, parcel);
                    } else if (c10 != 5) {
                        iol.t(i14, parcel);
                    } else {
                        s1lVar = (s1l) iol.c(parcel, i14, s1l.CREATOR);
                    }
                }
                iol.h(iU14, parcel);
                return new xx8(jQ2, iO11, zJ8, s1lVar);
            case 14:
                int iO12 = 0;
                int iU15 = iol.u(parcel);
                int iO13 = 0;
                while (parcel.dataPosition() < iU15) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 2) {
                        iO13 = iol.o(i15, parcel);
                    } else if (c11 == 3) {
                        iO12 = iol.o(i15, parcel);
                    } else if (c11 != 4) {
                        iol.t(i15, parcel);
                    } else {
                        bArrB = iol.b(i15, parcel);
                    }
                }
                iol.h(iU15, parcel);
                return new trh(iO13, bArrB, iO12);
            case 15:
                int iU16 = iol.u(parcel);
                int iO14 = 0;
                int iO15 = 0;
                int iO16 = 0;
                boolean zJ9 = false;
                boolean zJ10 = false;
                while (parcel.dataPosition() < iU16) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 1) {
                        iO14 = iol.o(i16, parcel);
                    } else if (c12 == 2) {
                        zJ9 = iol.j(i16, parcel);
                    } else if (c12 == 3) {
                        zJ10 = iol.j(i16, parcel);
                    } else if (c12 == 4) {
                        iO15 = iol.o(i16, parcel);
                    } else if (c12 != 5) {
                        iol.t(i16, parcel);
                    } else {
                        iO16 = iol.o(i16, parcel);
                    }
                }
                iol.h(iU16, parcel);
                return new eue(iO14, iO15, iO16, zJ9, zJ10);
            case 16:
                int iU17 = iol.u(parcel);
                boolean zJ11 = false;
                boolean zJ12 = true;
                IBinder iBinderN3 = null;
                float fL4 = 0.0f;
                float fL5 = 0.0f;
                while (parcel.dataPosition() < iU17) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 2) {
                        iBinderN3 = iol.n(i17, parcel);
                    } else if (c13 == 3) {
                        zJ11 = iol.j(i17, parcel);
                    } else if (c13 == 4) {
                        fL4 = iol.l(i17, parcel);
                    } else if (c13 == 5) {
                        zJ12 = iol.j(i17, parcel);
                    } else if (c13 != 6) {
                        iol.t(i17, parcel);
                    } else {
                        fL5 = iol.l(i17, parcel);
                    }
                }
                iol.h(iU17, parcel);
                vrh vrhVar = new vrh();
                vrhVar.b = true;
                vrhVar.d = true;
                vrhVar.e = 0.0f;
                int i18 = bok.e;
                if (iBinderN3 != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderN3.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    spkVar = iInterfaceQueryLocalInterface instanceof xpk ? (xpk) iInterfaceQueryLocalInterface : new spk(iBinderN3, "com.google.android.gms.maps.model.internal.ITileProviderDelegate", 2);
                }
                vrhVar.a = spkVar;
                vrhVar.b = zJ11;
                vrhVar.c = fL4;
                vrhVar.d = zJ12;
                vrhVar.e = fL5;
                return vrhVar;
            case 17:
                int iU18 = iol.u(parcel);
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLng latLng5 = null;
                LatLng latLng6 = null;
                LatLngBounds latLngBounds = null;
                while (parcel.dataPosition() < iU18) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        latLng3 = (LatLng) iol.c(parcel, i19, LatLng.CREATOR);
                    } else if (c14 == 3) {
                        latLng4 = (LatLng) iol.c(parcel, i19, LatLng.CREATOR);
                    } else if (c14 == 4) {
                        latLng5 = (LatLng) iol.c(parcel, i19, LatLng.CREATOR);
                    } else if (c14 == 5) {
                        latLng6 = (LatLng) iol.c(parcel, i19, LatLng.CREATOR);
                    } else if (c14 != 6) {
                        iol.t(i19, parcel);
                    } else {
                        latLngBounds = (LatLngBounds) iol.c(parcel, i19, LatLngBounds.CREATOR);
                    }
                }
                iol.h(iU18, parcel);
                return new qaj(latLng3, latLng4, latLng5, latLng6, latLngBounds);
            case 18:
                return new hmk((PendingIntent) parcel.readParcelable(wpe.class.getClassLoader()), parcel.readInt() != 0);
            case 19:
                return new sxk(parcel.readStrongBinder());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                int iU19 = iol.u(parcel);
                String strD17 = "";
                String strD18 = "";
                while (parcel.dataPosition() < iU19) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 4) {
                        strD17 = iol.d(i20, parcel);
                    } else if (c15 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) iol.c(parcel, i20, GoogleSignInAccount.CREATOR);
                    } else if (c15 != '\b') {
                        iol.t(i20, parcel);
                    } else {
                        strD18 = iol.d(i20, parcel);
                    }
                }
                iol.h(iU19, parcel);
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.b = googleSignInAccount;
                yab.q(strD17, "8.3 and 8.4 SDKs require non-null email");
                signInAccount.a = strD17;
                yab.q(strD18, "8.3 and 8.4 SDKs require non-null userId");
                signInAccount.c = strD18;
                return signInAccount;
            case 21:
                int iU20 = iol.u(parcel);
                int iO17 = 0;
                while (parcel.dataPosition() < iU20) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 1) {
                        iO17 = iol.o(i21, parcel);
                    } else if (c16 != 2) {
                        iol.t(i21, parcel);
                    } else {
                        strD2 = iol.d(i21, parcel);
                    }
                }
                iol.h(iU20, parcel);
                return new Scope(iO17, strD2);
            case 22:
                int iU21 = iol.u(parcel);
                int iO18 = 0;
                String strD19 = null;
                String strD20 = null;
                String strD21 = null;
                ArrayList arrayListG5 = null;
                s1l s1lVar2 = null;
                while (parcel.dataPosition() < iU21) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 1) {
                        iO18 = iol.o(i22, parcel);
                    } else if (c17 == 3) {
                        strD19 = iol.d(i22, parcel);
                    } else if (c17 == 4) {
                        strD20 = iol.d(i22, parcel);
                    } else if (c17 == 6) {
                        strD21 = iol.d(i22, parcel);
                    } else if (c17 == 7) {
                        s1lVar2 = (s1l) iol.c(parcel, i22, s1l.CREATOR);
                    } else if (c17 != '\b') {
                        iol.t(i22, parcel);
                    } else {
                        arrayListG5 = iol.g(parcel, i22, do6.CREATOR);
                    }
                }
                iol.h(iU21, parcel);
                return new s1l(iO18, strD19, strD20, strD21, arrayListG5, s1lVar2);
            case 23:
                int iU22 = iol.u(parcel);
                int iO19 = 0;
                do6[] do6VarArr = null;
                te4 te4Var = null;
                while (parcel.dataPosition() < iU22) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 1) {
                        bundleA = iol.a(i23, parcel);
                    } else if (c18 == 2) {
                        do6VarArr = (do6[]) iol.f(parcel, i23, do6.CREATOR);
                    } else if (c18 == 3) {
                        iO19 = iol.o(i23, parcel);
                    } else if (c18 != 4) {
                        iol.t(i23, parcel);
                    } else {
                        te4Var = (te4) iol.c(parcel, i23, te4.CREATOR);
                    }
                }
                iol.h(iU22, parcel);
                qil qilVar = new qil();
                qilVar.a = bundleA;
                qilVar.b = do6VarArr;
                qilVar.c = iO19;
                qilVar.d = te4Var;
                return qilVar;
            case 24:
                int iU23 = iol.u(parcel);
                LatLng latLng7 = null;
                LatLngBounds latLngBounds2 = null;
                float fL6 = 0.0f;
                float fL7 = 0.0f;
                float fL8 = 0.0f;
                float fL9 = 0.0f;
                boolean zJ13 = false;
                float fL10 = 0.0f;
                float fL11 = 0.0f;
                float fL12 = 0.0f;
                boolean zJ14 = false;
                while (parcel.dataPosition() < iU23) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 2:
                            iBinderN = iol.n(i24, parcel);
                            break;
                        case 3:
                            latLng7 = (LatLng) iol.c(parcel, i24, LatLng.CREATOR);
                            break;
                        case 4:
                            fL6 = iol.l(i24, parcel);
                            break;
                        case 5:
                            fL7 = iol.l(i24, parcel);
                            break;
                        case 6:
                            latLngBounds2 = (LatLngBounds) iol.c(parcel, i24, LatLngBounds.CREATOR);
                            break;
                        case 7:
                            fL8 = iol.l(i24, parcel);
                            break;
                        case '\b':
                            fL9 = iol.l(i24, parcel);
                            break;
                        case '\t':
                            zJ13 = iol.j(i24, parcel);
                            break;
                        case '\n':
                            fL10 = iol.l(i24, parcel);
                            break;
                        case 11:
                            fL11 = iol.l(i24, parcel);
                            break;
                        case '\f':
                            fL12 = iol.l(i24, parcel);
                            break;
                        case '\r':
                            zJ14 = iol.j(i24, parcel);
                            break;
                        default:
                            iol.t(i24, parcel);
                            break;
                    }
                }
                iol.h(iU23, parcel);
                xq7 xq7Var = new xq7();
                xq7Var.h = true;
                xq7Var.i = 0.0f;
                xq7Var.j = 0.5f;
                xq7Var.k = 0.5f;
                xq7Var.l = false;
                xq7Var.a = new rj5(dqb.n0(iBinderN));
                xq7Var.b = latLng7;
                xq7Var.c = fL6;
                xq7Var.d = fL7;
                xq7Var.e = latLngBounds2;
                xq7Var.f = fL8;
                xq7Var.g = fL9;
                xq7Var.h = zJ13;
                xq7Var.i = fL10;
                xq7Var.j = fL11;
                xq7Var.k = fL12;
                xq7Var.l = zJ14;
                return xq7Var;
            case 25:
                int iU24 = iol.u(parcel);
                eue eueVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zJ15 = false;
                boolean zJ16 = false;
                int iO20 = 0;
                while (parcel.dataPosition() < iU24) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            eueVar = (eue) iol.c(parcel, i25, eue.CREATOR);
                            break;
                        case 2:
                            zJ15 = iol.j(i25, parcel);
                            break;
                        case 3:
                            zJ16 = iol.j(i25, parcel);
                            break;
                        case 4:
                            int iR2 = iol.r(i25, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iR2 != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iR2);
                                iArr = iArrCreateIntArray;
                            } else {
                                iArr = null;
                            }
                            break;
                        case 5:
                            iO20 = iol.o(i25, parcel);
                            break;
                        case 6:
                            int iR3 = iol.r(i25, parcel);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iR3 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iR3);
                                iArr2 = iArrCreateIntArray2;
                            } else {
                                iArr2 = null;
                            }
                            break;
                        default:
                            iol.t(i25, parcel);
                            break;
                    }
                }
                iol.h(iU24, parcel);
                return new te4(eueVar, zJ15, zJ16, iArr, iO20, iArr2);
            case 26:
                int iU25 = iol.u(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = km7.o;
                do6[] do6VarArr2 = km7.p;
                do6[] do6VarArr3 = do6VarArr2;
                String strD22 = null;
                IBinder iBinderN4 = null;
                Account account3 = null;
                String strD23 = null;
                int iO21 = 0;
                int iO22 = 0;
                int iO23 = 0;
                boolean zJ17 = false;
                int iO24 = 0;
                boolean zJ18 = false;
                while (parcel.dataPosition() < iU25) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iO21 = iol.o(i26, parcel);
                            break;
                        case 2:
                            iO22 = iol.o(i26, parcel);
                            break;
                        case 3:
                            iO23 = iol.o(i26, parcel);
                            break;
                        case 4:
                            strD22 = iol.d(i26, parcel);
                            break;
                        case 5:
                            iBinderN4 = iol.n(i26, parcel);
                            break;
                        case 6:
                            scopeArr = (Scope[]) iol.f(parcel, i26, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = iol.a(i26, parcel);
                            break;
                        case '\b':
                            account3 = (Account) iol.c(parcel, i26, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            iol.t(i26, parcel);
                            break;
                        case '\n':
                            do6VarArr2 = (do6[]) iol.f(parcel, i26, do6.CREATOR);
                            break;
                        case 11:
                            do6VarArr3 = (do6[]) iol.f(parcel, i26, do6.CREATOR);
                            break;
                        case '\f':
                            zJ17 = iol.j(i26, parcel);
                            break;
                        case '\r':
                            iO24 = iol.o(i26, parcel);
                            break;
                        case 14:
                            zJ18 = iol.j(i26, parcel);
                            break;
                        case 15:
                            strD23 = iol.d(i26, parcel);
                            break;
                    }
                }
                iol.h(iU25, parcel);
                return new km7(iO21, iO22, iO23, strD22, iBinderN4, scopeArr, bundle, account3, do6VarArr2, do6VarArr3, zJ17, iO24, zJ18, strD23);
            case 27:
                int iU26 = iol.u(parcel);
                LatLng latLng8 = null;
                while (parcel.dataPosition() < iU26) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 2) {
                        latLng = (LatLng) iol.c(parcel, i27, LatLng.CREATOR);
                    } else if (c19 != 3) {
                        iol.t(i27, parcel);
                    } else {
                        latLng8 = (LatLng) iol.c(parcel, i27, LatLng.CREATOR);
                    }
                }
                iol.h(iU26, parcel);
                return new LatLngBounds(latLng, latLng8);
            case 28:
                int iU27 = iol.u(parcel);
                double dK = 0.0d;
                double dK2 = 0.0d;
                while (parcel.dataPosition() < iU27) {
                    int i28 = parcel.readInt();
                    char c20 = (char) i28;
                    if (c20 == 2) {
                        dK = iol.k(i28, parcel);
                    } else if (c20 != 3) {
                        iol.t(i28, parcel);
                    } else {
                        dK2 = iol.k(i28, parcel);
                    }
                }
                iol.h(iU27, parcel);
                return new LatLng(dK, dK2);
            default:
                int iU28 = iol.u(parcel);
                while (parcel.dataPosition() < iU28) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 2) {
                        iol.t(i29, parcel);
                    } else {
                        strD = iol.d(i29, parcel);
                    }
                }
                iol.h(iU28, parcel);
                return new jm9(strD);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b1b[i];
            case 1:
                return new mkk[i];
            case 2:
                return new GoogleSignInAccount[i];
            case 3:
                return new hp[i];
            case 4:
                return new c1b[i];
            case 5:
                return new GoogleSignInOptions[i];
            case 6:
                return new nlk[i];
            case 7:
                return new slk[i];
            case 8:
                return new ulk[i];
            case 9:
                return new amk[i];
            case 10:
                return new cmk[i];
            case 11:
                return new CameraPosition[i];
            case 12:
                return new eu3[i];
            case 13:
                return new xx8[i];
            case 14:
                return new trh[i];
            case 15:
                return new eue[i];
            case 16:
                return new vrh[i];
            case 17:
                return new qaj[i];
            case 18:
                return new wpe[i];
            case 19:
                return new sxk[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new SignInAccount[i];
            case 21:
                return new Scope[i];
            case 22:
                return new s1l[i];
            case 23:
                return new qil[i];
            case 24:
                return new xq7[i];
            case 25:
                return new te4[i];
            case 26:
                return new km7[i];
            case 27:
                return new LatLngBounds[i];
            case 28:
                return new LatLng[i];
            default:
                return new jm9[i];
        }
    }
}
