package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jol {
    public static int b(Parcel parcel) {
        return t(20293, parcel);
    }

    public static void c(int i, Parcel parcel) {
        u(i, parcel);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: switch over string: strings are not added: [[6M]] */
    public static final lni d(fka fkaVar) {
        int iU;
        String strX;
        String string;
        String string2;
        String string3;
        ini iniVar = new ini();
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    String str = strX + "=";
                    switch (strX.hashCode()) {
                        case -2099474505:
                            if (strX.equals("DIALOGS_LED")) {
                                int iD0 = fkaVar.D0();
                                Integer numValueOf = Integer.valueOf(iD0);
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) str);
                                sb.append(iD0);
                                string = sb.toString();
                                iniVar.j = numValueOf;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -1972016425:
                            if (strX.equals("INCOMING_CALL")) {
                                String strS0 = fkaVar.S0();
                                string2 = ((Object) str) + strS0;
                                iniVar.p = nbh.c(strS0);
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -1965172674:
                            if (strX.equals("DIALOGS_PUSH_SOUND")) {
                                String strS1 = fkaVar.S0();
                                string2 = ((Object) str) + strS1;
                                iniVar.f = strS1;
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -1917056995:
                            if (strX.equals("SEARCH_BY_PHONE")) {
                                String strW = ch3.W(fkaVar);
                                string2 = ((Object) str) + strW;
                                iniVar.y = nbh.c(strW);
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -1840968095:
                            if (strX.equals("SAFE_MODE_NO_PIN")) {
                                boolean zL = ch3.L(fkaVar);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((Object) str);
                                sb2.append(zL);
                                string2 = sb2.toString();
                                iniVar.x = Boolean.valueOf(zL);
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -1674384187:
                            if (strX.equals("CONTENT_LEVEL_ACCESS")) {
                                boolean zL2 = ch3.L(fkaVar);
                                Boolean boolValueOf = Boolean.valueOf(zL2);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append((Object) str);
                                sb3.append(zL2);
                                string = sb3.toString();
                                iniVar.A = boolValueOf;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -952000630:
                            if (strX.equals("PUSH_SOUND")) {
                                String strS2 = fkaVar.S0();
                                string2 = ((Object) str) + strS2;
                                iniVar.e = strS2;
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -747186863:
                            if (strX.equals("SUGGEST_STICKERS")) {
                                String strW2 = ch3.W(fkaVar);
                                string2 = ((Object) str) + strW2;
                                iniVar.u = nbh.d(strW2);
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -694542025:
                            if (strX.equals("PUSH_NEW_CONTACTS")) {
                                boolean zV0 = fkaVar.v0();
                                Boolean boolValueOf2 = Boolean.valueOf(zV0);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append((Object) str);
                                sb4.append(zV0);
                                string = sb4.toString();
                                iniVar.a = boolValueOf2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -658898441:
                            if (strX.equals("DIALOGS_VIBR")) {
                                boolean zV1 = fkaVar.v0();
                                Boolean boolValueOf3 = Boolean.valueOf(zV1);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append((Object) str);
                                sb5.append(zV1);
                                string = sb5.toString();
                                iniVar.m = boolValueOf3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -393482200:
                            if (strX.equals("DOUBLE_TAP_REACTION_DISABLED")) {
                                boolean zL3 = ch3.L(fkaVar);
                                Boolean boolValueOf4 = Boolean.valueOf(zL3);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append((Object) str);
                                sb6.append(zL3);
                                string = sb6.toString();
                                iniVar.C = boolValueOf4;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -389923664:
                            if (strX.equals("DONT_DISTURB_UNTIL")) {
                                long jI0 = fkaVar.I0();
                                Long lValueOf = Long.valueOf(jI0);
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append((Object) str);
                                sb7.append(jI0);
                                string2 = sb7.toString();
                                iniVar.b = lValueOf;
                                string = string2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case -248197113:
                            if (strX.equals("CHATS_VIBR")) {
                                boolean zV2 = fkaVar.v0();
                                Boolean boolValueOf5 = Boolean.valueOf(zV2);
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append((Object) str);
                                sb8.append(zV2);
                                string = sb8.toString();
                                iniVar.n = boolValueOf5;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 75243:
                            if (strX.equals("LED")) {
                                int iD1 = fkaVar.D0();
                                Integer numValueOf2 = Integer.valueOf(iD1);
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append((Object) str);
                                sb9.append(iD1);
                                string = sb9.toString();
                                iniVar.i = numValueOf2;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 2634307:
                            if (strX.equals("VIBR")) {
                                boolean zV3 = fkaVar.v0();
                                Boolean boolValueOf6 = Boolean.valueOf(zV3);
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append((Object) str);
                                sb10.append(zV3);
                                string = sb10.toString();
                                iniVar.l = boolValueOf6;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 130531239:
                            if (strX.equals("CHATS_LED")) {
                                int iD3 = fkaVar.D0();
                                Integer numValueOf3 = Integer.valueOf(iD3);
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append((Object) str);
                                sb11.append(iD3);
                                string = sb11.toString();
                                iniVar.k = numValueOf3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 136965804:
                            if (strX.equals("CHATS_PUSH_NOTIFICATION")) {
                                String strS3 = fkaVar.S0();
                                string3 = ((Object) str) + strS3;
                                iniVar.d = strS3;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 294498405:
                            if (strX.equals("COMMENTS_PUSH_NOTIFICATION")) {
                                String strW3 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW3;
                                iniVar.t = nbh.a(strW3);
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 345218686:
                            if (strX.equals("UNSAFE_FILES")) {
                                boolean zL4 = ch3.L(fkaVar);
                                Boolean boolValueOf7 = Boolean.valueOf(zL4);
                                StringBuilder sb12 = new StringBuilder();
                                sb12.append((Object) str);
                                sb12.append(zL4);
                                string = sb12.toString();
                                iniVar.z = boolValueOf7;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 640193528:
                            if (strX.equals("INACTIVE_TTL")) {
                                String strW4 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW4;
                                kni kniVar = kni.TTL_6M;
                                if (strW4 != null) {
                                    switch (strW4) {
                                        case "1M":
                                            kniVar = kni.TTL_1M;
                                            break;
                                        case "3M":
                                            kniVar = kni.TTL_3M;
                                            break;
                                    }
                                }
                                iniVar.r = kniVar;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 836229259:
                            if (strX.equals("AUDIO_TRANSCRIPTION_ENABLED")) {
                                boolean zL5 = ch3.L(fkaVar);
                                Boolean boolValueOf8 = Boolean.valueOf(zL5);
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append((Object) str);
                                sb13.append(zL5);
                                string = sb13.toString();
                                iniVar.v = boolValueOf8;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 951928468:
                            if (strX.equals("FAMILY_PROTECTION")) {
                                String strW5 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW5;
                                jni jniVar = jni.OFF;
                                if (strW5 != null) {
                                    if (strW5.equals("MANAGEABLE")) {
                                        jniVar = jni.MANAGEABLE;
                                    } else if (strW5.equals("ADMIN")) {
                                        jniVar = jni.ADMIN;
                                    }
                                }
                                iniVar.B = jniVar;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1288630147:
                            if (strX.equals("PHONE_NUMBER_PRIVACY")) {
                                String strW6 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW6;
                                iniVar.q = nbh.c(strW6);
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1393333029:
                            if (strX.equals("DOUBLE_TAP_REACTION_VALUE")) {
                                String strW7 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW7;
                                iniVar.D = strW7;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1633771469:
                            if (strX.equals("CHATS_INVITE")) {
                                String strS4 = fkaVar.S0();
                                string3 = ((Object) str) + strS4;
                                iniVar.o = nbh.c(strS4);
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1684923157:
                            if (strX.equals("SAFE_MODE")) {
                                boolean zL6 = ch3.L(fkaVar);
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append((Object) str);
                                sb14.append(zL6);
                                string3 = sb14.toString();
                                iniVar.w = Boolean.valueOf(zL6);
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1911151182:
                            if (strX.equals("CHATS_PUSH_SOUND")) {
                                String strS5 = fkaVar.S0();
                                string3 = ((Object) str) + strS5;
                                iniVar.g = strS5;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1950966460:
                            if (strX.equals("DIALOGS_PUSH_NOTIFICATION")) {
                                String strS6 = fkaVar.S0();
                                string3 = ((Object) str) + strS6;
                                iniVar.c = strS6;
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 1958389377:
                            if (strX.equals("M_CALL_PUSH_NOTIFICATION")) {
                                String strW8 = ch3.W(fkaVar);
                                string3 = ((Object) str) + strW8;
                                iniVar.s = nbh.b(strW8);
                                string = string3;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        case 2130809258:
                            if (strX.equals("HIDDEN")) {
                                boolean zV4 = fkaVar.v0();
                                Boolean boolValueOf9 = Boolean.valueOf(zV4);
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append((Object) str);
                                sb15.append(zV4);
                                string = sb15.toString();
                                iniVar.h = boolValueOf9;
                            } else {
                                fkaVar.x();
                                string = ((Object) str) + "skip!";
                            }
                            break;
                        default:
                            fkaVar.x();
                            string = ((Object) str) + "skip!";
                            break;
                    }
                    gm0.n("ConfigurationUserSettingsParsing", string);
                } catch (Throwable th5) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it3 = fjf.a.iterator();
                        while (it3.hasNext()) {
                            AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th5);
                                accountInitializer3.d().i().g().a(null, th5);
                            } catch (Throwable th6) {
                                gm0.V("Payload", "failed to collect exception", th6);
                            }
                        }
                        int iD4 = qt4.D(pye.a);
                        if (iD4 != 0) {
                            if (iD4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it4 = fjf.a.iterator();
                        while (it4.hasNext()) {
                            AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th7);
                                accountInitializer4.d().i().g().a(null, th7);
                            } catch (Throwable th8) {
                                gm0.V("Payload", "failed to collect exception", th8);
                            }
                        }
                        int iD5 = qt4.D(pye.a);
                        if (iD5 != 0) {
                            if (iD5 == 1) {
                                throw th7;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new lni(iniVar);
    }

    public static final Map e(fka fkaVar) {
        int iA = fkaVar.y().a();
        s66 s66Var = s66.a;
        if (iA != 8) {
            fkaVar.x();
            return s66Var;
        }
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return s66Var;
        }
        mw mwVar = new mw(iU);
        for (int i = 0; i < iU; i++) {
            String strW = ch3.W(fkaVar);
            if (strW != null) {
                mwVar.put(strW, f(fkaVar));
            } else {
                fkaVar.x();
            }
        }
        return mwVar;
    }

    public static final Object f(fka fkaVar) {
        int iA = fkaVar.y().a();
        ArrayList arrayList = null;
        switch (iA == 0 ? -1 : qa4.$EnumSwitchMapping$0[qt4.D(iA)]) {
            case 1:
                byte b = fkaVar.readByte();
                if (b == -64) {
                    return sbi.a;
                }
                throw fka.r0(b, "Nil");
            case 2:
                return Boolean.valueOf(ch3.L(fkaVar));
            case 3:
                return ch3.M(fkaVar);
            case 4:
                if (fkaVar.y().a() == 4) {
                    return Float.valueOf(fkaVar.z0());
                }
                fkaVar.x();
                return null;
            case 5:
                return ch3.W(fkaVar);
            case 6:
                if (fkaVar.y().a() == 7) {
                    arrayList = new ArrayList();
                    int iT0 = fkaVar.t0();
                    for (int i = 0; i < iT0; i++) {
                        arrayList.add(f(fkaVar));
                    }
                } else {
                    fkaVar.x();
                }
                return arrayList;
            case 7:
                return e(fkaVar);
            default:
                fkaVar.x();
                return null;
        }
    }

    public static void g(Parcel parcel, boolean z) {
        s(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void h(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeBundle(bundle);
        u(iT, parcel);
    }

    public static void i(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeByteArray(bArr);
        u(iT, parcel);
    }

    public static void j(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeStrongBinder(iBinder);
        u(iT, parcel);
    }

    public static void k(Parcel parcel, int i, int i2) {
        s(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void l(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        s(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void m(Parcel parcel, int i, long j) {
        s(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void n(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iT = t(i, parcel);
        parcelable.writeToParcel(parcel, i2);
        u(iT, parcel);
    }

    public static void o(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeString(str);
        u(iT, parcel);
    }

    public static void p(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeStringArray(strArr);
        u(iT, parcel);
    }

    public static void q(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iT = t(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        u(iT, parcel);
    }

    public static void r(Parcel parcel, List list, int i) {
        if (list == null) {
            return;
        }
        int iT = t(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        u(iT, parcel);
    }

    public static void s(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int t(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void u(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
