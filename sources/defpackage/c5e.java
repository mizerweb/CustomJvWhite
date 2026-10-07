package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes2.dex */
public final class c5e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c5e(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = 3;
        Bundle bundleA = null;
        int i3 = 2;
        boolean zJ = false;
        int iO = 0;
        switch (this.a) {
            case 0:
                return new d5e(parcel.readInt(), parcel.readFloat());
            case 1:
                return new xge(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            case 2:
                int iU = iol.u(parcel);
                while (parcel.dataPosition() < iU) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        iol.t(i4, parcel);
                    } else {
                        bundleA = iol.a(i4, parcel);
                    }
                }
                iol.h(iU, parcel);
                return new eie(bundleA);
            case 3:
                return new tme(parcel.readInt());
            case 4:
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList5.add(Long.valueOf(parcel.readLong()));
                }
                int i7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList6.add(parcel.readBundle(jve.class.getClassLoader()));
                }
                int i9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList7.add(Long.valueOf(parcel.readLong()));
                }
                return new jve(arrayList5, arrayList6, arrayList7, parcel.readInt());
            case 5:
                return new k9f((ForegroundColorSpan) parcel.readParcelable(k9f.class.getClassLoader()), (BackgroundColorSpan) parcel.readParcelable(k9f.class.getClassLoader()));
            case 6:
                return new jef(kb9.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (Uri) parcel.readParcelable(jef.class.getClassLoader()), (Uri) parcel.readParcelable(jef.class.getClassLoader()), parcel.readString(), (RectF) parcel.readParcelable(jef.class.getClassLoader()), (Rect) parcel.readParcelable(jef.class.getClassLoader()), (Uri) parcel.readParcelable(jef.class.getClassLoader()));
            case 7:
                int i11 = parcel.readInt();
                ynh ynhVar = (ynh) parcel.readParcelable(iqf.class.getClassLoader());
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("LINK")) {
                        i3 = 1;
                    } else if (!string.equals("NEUTRAL")) {
                        ore.p("No enum constant one.me.settings.SettingsAvatarBottomSheet.Button.Type.".concat(string));
                    }
                    return new iqf(i11, i3, ynhVar);
                }
                ore.n("Name is null");
                i3 = 0;
                return new iqf(i11, i3, ynhVar);
            case 8:
                parcel.readInt();
                return fsf.a;
            case 9:
                return new gsf(parcel.readInt() != 0);
            case 10:
                return new hsf(parcel.readInt());
            case 11:
                return new isf((ynh) parcel.readParcelable(isf.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 12:
                return new jsf(parcel.readInt() != 0, parcel.readInt() != 0);
            case 13:
                return new ksf(parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                return new lsf((ynh) parcel.readParcelable(lsf.class.getClassLoader()));
            case 15:
                ArrayList arrayList8 = null;
                int i12 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList2 = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList2.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i17 = parcel.readInt();
                    arrayList3 = new ArrayList(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        arrayList3.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i19 = parcel.readInt();
                    arrayList4 = new ArrayList(i19);
                    for (int i20 = 0; i20 != i19; i20++) {
                        arrayList4.add(parcel.readParcelable(ShareData.class.getClassLoader()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i21 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(i21);
                    for (int i22 = 0; i22 != i21; i22++) {
                        arrayList9.add(Long.valueOf(parcel.readLong()));
                    }
                    arrayList8 = arrayList9;
                }
                return new ShareData(i12, arrayList, arrayList2, string2, arrayList3, arrayList4, arrayList8, parcel.readString());
            case 16:
                ngg nggVar = new ngg();
                nggVar.a = parcel.readInt();
                nggVar.b = parcel.readInt();
                nggVar.d = parcel.readInt() == 1;
                int i23 = parcel.readInt();
                if (i23 > 0) {
                    int[] iArr = new int[i23];
                    nggVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return nggVar;
            case 17:
                ogg oggVar = new ogg();
                oggVar.a = parcel.readInt();
                oggVar.b = parcel.readInt();
                int i24 = parcel.readInt();
                oggVar.c = i24;
                if (i24 > 0) {
                    int[] iArr2 = new int[i24];
                    oggVar.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i25 = parcel.readInt();
                oggVar.e = i25;
                if (i25 > 0) {
                    int[] iArr3 = new int[i25];
                    oggVar.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                oggVar.h = parcel.readInt() == 1;
                oggVar.i = parcel.readInt() == 1;
                oggVar.j = parcel.readInt() == 1;
                oggVar.g = parcel.readArrayList(ngg.class.getClassLoader());
                return oggVar;
            case 18:
                return jhg.valueOf(parcel.readString());
            case 19:
                return new qug(parcel.readLong(), avg.valueOf(parcel.readString()));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new rug(parcel.readLong(), avg.valueOf(parcel.readString()), parcel.readLong());
            case 21:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("USER")) {
                        i2 = 1;
                    } else if (string3.equals("CHAT")) {
                        i2 = 2;
                    } else if (!string3.equals("CHANNEL")) {
                        ore.p("No enum constant one.me.stories.viewer.viewer.model.StoryOwnerParcel.Type.".concat(string3));
                    }
                    return new czg(j, i2);
                }
                ore.n("Name is null");
                i2 = 0;
                return new czg(j, i2);
            case 22:
                return new k4h(parcel);
            case 23:
                SparseArray sparseArray = new SparseArray();
                int i26 = parcel.readInt();
                for (int i27 = 0; i27 < i26; i27++) {
                    sparseArray.put(parcel.readInt(), parcel.readString());
                }
                return new o5h(sparseArray);
            case 24:
                return new zrh(parcel.readInt());
            case 25:
                return new m6i(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 26:
                return new kbi((tx4) parcel.readParcelable(kbi.class.getClassLoader()), nx4.CREATOR.createFromParcel(parcel));
            case 27:
                String string4 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (string6.equals("LOADING")) {
                        i = 1;
                    } else if (string6.equals("WEB_VIEW")) {
                        i = 2;
                    } else if (string6.equals("ERROR")) {
                        i = 3;
                    } else {
                        ore.p("No enum constant one.me.webapp.rootscreen.LoadingStateParc.".concat(string6));
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return new qoj(string4, z4, string5, i, z, z2, z3);
                }
                ore.n("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new qoj(string4, z4, string5, i, z, z2, z3);
            case 28:
                int iU2 = iol.u(parcel);
                int iO2 = 0;
                while (parcel.dataPosition() < iU2) {
                    int i28 = parcel.readInt();
                    char c = (char) i28;
                    if (c == 1) {
                        iO = iol.o(i28, parcel);
                    } else if (c == 2) {
                        iO2 = iol.o(i28, parcel);
                    } else if (c != 3) {
                        iol.t(i28, parcel);
                    } else {
                        bundleA = iol.a(i28, parcel);
                    }
                }
                iol.h(iU2, parcel);
                return new yo7(iO, iO2, bundleA);
            default:
                int iU3 = iol.u(parcel);
                int iO3 = 0;
                while (parcel.dataPosition() < iU3) {
                    int i29 = parcel.readInt();
                    char c2 = (char) i29;
                    if (c2 == 1) {
                        zJ = iol.j(i29, parcel);
                    } else if (c2 != 2) {
                        iol.t(i29, parcel);
                    } else {
                        iO3 = iol.o(i29, parcel);
                    }
                }
                iol.h(iU3, parcel);
                return new a1b(zJ, iO3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d5e[i];
            case 1:
                return new xge[i];
            case 2:
                return new eie[i];
            case 3:
                return new tme[i];
            case 4:
                return new jve[i];
            case 5:
                return new k9f[i];
            case 6:
                return new jef[i];
            case 7:
                return new iqf[i];
            case 8:
                return new fsf[i];
            case 9:
                return new gsf[i];
            case 10:
                return new hsf[i];
            case 11:
                return new isf[i];
            case 12:
                return new jsf[i];
            case 13:
                return new ksf[i];
            case 14:
                return new lsf[i];
            case 15:
                return new ShareData[i];
            case 16:
                return new ngg[i];
            case 17:
                return new ogg[i];
            case 18:
                return new jhg[i];
            case 19:
                return new qug[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new rug[i];
            case 21:
                return new czg[i];
            case 22:
                return new k4h[i];
            case 23:
                return new o5h[i];
            case 24:
                return new zrh[i];
            case 25:
                return new m6i[i];
            case 26:
                return new kbi[i];
            case 27:
                return new qoj[i];
            case 28:
                return new yo7[i];
            default:
                return new a1b[i];
        }
    }
}
