package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r21 {
    public static final byte[] a;

    static {
        String str = vqi.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(nmc nmcVar) {
        int i = nmcVar.b;
        nmcVar.O(4);
        if (nmcVar.m() != 1751411826) {
            i += 4;
        }
        nmcVar.N(i);
    }

    /* JADX WARN: Code duplicated, block: B:201:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:270:0x0586  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:288:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:362:0x06be  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:92:0x016a  */
    public static void b(nmc nmcVar, int i, int i2, int i3, int i4, String str, boolean z, wu5 wu5Var, p21 p21Var, int i5) throws ParserException {
        int iH;
        int i6;
        int iH2;
        int iM;
        int i7;
        int i8;
        int i9;
        wu5 wu5VarA;
        String str2;
        int iH3;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean zH;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z2;
        boolean zH2;
        int i24;
        int i25;
        String str4;
        nmc nmcVar2 = nmcVar;
        int iIntValue = i;
        int i26 = i3;
        nmcVar2.N(i2 + 16);
        if (z) {
            iH = nmcVar2.H();
            nmcVar2.O(6);
        } else {
            nmcVar2.O(8);
            iH = 0;
        }
        int i27 = 32;
        if (iH == 0 || iH == 1) {
            i6 = 2;
            iH2 = nmcVar2.H();
            nmcVar2.O(6);
            int iB = nmcVar2.B();
            nmcVar2.N(nmcVar2.b - 4);
            iM = nmcVar2.m();
            if (iH == 1) {
                nmcVar2.O(16);
            }
            i7 = iB;
            i8 = -1;
        } else {
            if (iH != 2) {
                return;
            }
            nmcVar2.O(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(nmcVar2.u()));
            int iE = nmcVar2.E();
            nmcVar2.O(4);
            i6 = 2;
            int iE2 = nmcVar2.E();
            int iE3 = nmcVar2.E();
            boolean z3 = (iE3 & 1) != 0;
            boolean z4 = (iE3 & 2) != 0;
            if (z3) {
                if (iE2 == 32) {
                    i8 = 4;
                } else {
                    i8 = -1;
                }
            } else if (iE2 == 8) {
                i8 = 3;
            } else if (iE2 == 16) {
                i8 = z4 ? 268435456 : 2;
            } else if (iE2 == 24) {
                i8 = z4 ? 1342177280 : 21;
            } else if (iE2 == 32) {
                i8 = z4 ? 1610612736 : 22;
            } else {
                i8 = -1;
            }
            nmcVar2.O(8);
            i7 = iRound;
            iH2 = iE;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iH2 = -1;
            i7 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i9 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i7 = i9;
            iH2 = 1;
        }
        int i28 = nmcVar2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(nmcVar2, i2, i26);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                wu5VarA = wu5Var == null ? null : wu5Var.a(((fyh) pairH.second).b);
                ((fyh[]) p21Var.c)[i5] = (fyh) pairH.second;
            } else {
                wu5VarA = wu5Var;
            }
            nmcVar2.N(i28);
        } else {
            wu5VarA = wu5Var;
        }
        String str5 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            iH3 = i8;
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            iH3 = i8;
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            iH3 = i8;
            str2 = "audio/ac4";
        } else {
            if (iIntValue == 1685353315) {
                str2 = "audio/vnd.dts";
            } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
                str2 = "audio/vnd.dts.hd";
            } else if (iIntValue == 1685353317) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (iIntValue == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (iIntValue == 1935764850) {
                str2 = "audio/3gpp";
            } else if (iIntValue == 1935767394) {
                str2 = "audio/amr-wb";
            } else if (iIntValue == 1936684916) {
                iH3 = i6;
                str2 = "audio/raw";
            } else if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                iH3 = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i8 == -1) {
                    iH3 = i6;
                } else {
                    iH3 = i8;
                }
                str2 = "audio/raw";
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else if (iIntValue == 1767992678) {
                str2 = "audio/iamf";
            } else {
                iH3 = i8;
                str2 = null;
            }
            iH3 = i8;
        }
        n21 n21Var = null;
        String strP = null;
        List listR = null;
        uw uwVar = null;
        while (i28 - i2 < i26) {
            nmcVar2.N(i28);
            int iM2 = nmcVar2.m();
            iH3 = iH3;
            gxl.a("childAtomSize must be positive", iM2 > 0);
            int iM3 = nmcVar2.m();
            strP = strP;
            if (iM3 == 1835557187) {
                nmcVar2.N(i28 + 8);
                nmcVar2.O(1);
                int iA = nmcVar2.A();
                nmcVar2.O(1);
                strP = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(iA)) : String.format("mha1.%02X", Integer.valueOf(iA));
                int iH4 = nmcVar2.H();
                byte[] bArr = new byte[iH4];
                str3 = str2;
                nmcVar2.k(0, bArr, iH4);
                listR = listR == null ? c98.r(bArr) : c98.s(bArr, (byte[]) listR.get(0));
            } else {
                str3 = str2;
                if (iM3 == 1835557200) {
                    nmcVar2.N(i28 + 8);
                    int iA2 = nmcVar2.A();
                    if (iA2 > 0) {
                        byte[] bArr2 = new byte[iA2];
                        nmcVar2.k(0, bArr2, iA2);
                        listR = listR == null ? c98.r(bArr2) : c98.s((byte[]) listR.get(0), bArr2);
                    }
                } else {
                    if (iM3 == 1702061171 || (z && iM3 == 2002876005)) {
                        int i29 = iM2;
                        int i30 = i28;
                        int i31 = iH2;
                        str5 = str5;
                        listR = listR;
                        i10 = iIntValue;
                        if (iM3 == 1702061171) {
                            iM2 = i29;
                            i11 = i30;
                            i28 = i11;
                        } else {
                            i11 = nmcVar2.b;
                            i28 = i30;
                            gxl.a(null, i11 >= i28);
                            while (true) {
                                iM2 = i29;
                                if (i11 - i28 < iM2) {
                                    nmcVar2.N(i11);
                                    int iM4 = nmcVar2.m();
                                    gxl.a("childAtomSize must be positive", iM4 > 0);
                                    if (nmcVar2.m() != 1702061171) {
                                        i11 += iM4;
                                        i29 = iM2;
                                    }
                                } else {
                                    i11 = -1;
                                }
                            }
                        }
                        if (i11 != -1) {
                            n21 n21VarC = c(i11, nmcVar2);
                            str3 = (String) n21VarC.c;
                            byte[] bArr3 = (byte[]) n21VarC.d;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str3)) {
                                    nmc nmcVar3 = new nmc(bArr3);
                                    nmcVar3.O(1);
                                    int i32 = 0;
                                    while (nmcVar3.a() > 0 && nmcVar3.j() == 255) {
                                        i32 += 255;
                                        nmcVar3.O(1);
                                    }
                                    int iA3 = nmcVar3.A() + i32;
                                    int i33 = 0;
                                    while (true) {
                                        if (nmcVar3.a() > 0) {
                                            n21Var = n21VarC;
                                            if (nmcVar3.j() == 255) {
                                                i33 += 255;
                                                nmcVar3.O(1);
                                                n21VarC = n21Var;
                                            }
                                        } else {
                                            n21Var = n21VarC;
                                        }
                                    }
                                    int iA4 = nmcVar3.A() + i33;
                                    byte[] bArr4 = new byte[iA3];
                                    int i34 = nmcVar3.b;
                                    System.arraycopy(bArr3, i34, bArr4, 0, iA3);
                                    int i35 = i34 + iA3 + iA4;
                                    int length = bArr3.length - i35;
                                    byte[] bArr5 = new byte[length];
                                    System.arraycopy(bArr3, i35, bArr5, 0, length);
                                    listR = c98.s(bArr4, bArr5);
                                } else {
                                    if ("audio/mp4a-latm".equals(str3)) {
                                        d dVarD = ax.d(new mo2(bArr3.length, bArr3), false);
                                        i7 = dVarD.b;
                                        i12 = dVarD.c;
                                        strP = dVarD.a;
                                    } else {
                                        i12 = i31;
                                        strP = strP;
                                    }
                                    n21Var = n21VarC;
                                    listR = c98.r(bArr3);
                                }
                                iH2 = i12;
                                iH3 = iH3;
                            } else {
                                n21Var = n21VarC;
                            }
                        } else {
                            str3 = str3;
                        }
                        i12 = i31;
                        strP = strP;
                        n21Var = n21Var;
                        iH2 = i12;
                        iH3 = iH3;
                    } else if (iM3 == 1651798644) {
                        nmcVar2.N(i28 + 8);
                        nmcVar2.O(4);
                        uwVar = new uw(2, nmcVar2.C(), nmcVar2.C());
                    } else {
                        int[] iArr = t01.d;
                        int[] iArr2 = t01.b;
                        if (iM3 == 1684103987) {
                            nmcVar2.N(i28 + 8);
                            String string = Integer.toString(i4);
                            mo2 mo2Var = new mo2();
                            mo2Var.p(nmcVar2);
                            int i36 = iArr2[mo2Var.i(i6)];
                            str5 = str5;
                            mo2Var.t(8);
                            int i37 = iArr[mo2Var.i(3)];
                            if (mo2Var.i(1) != 0) {
                                i37++;
                            }
                            int i38 = t01.e[mo2Var.i(5)] * 1000;
                            mo2Var.c();
                            nmcVar2.N(mo2Var.f());
                            a87 a87Var = new a87();
                            a87Var.a = string;
                            a87Var.m = uya.n("audio/ac3");
                            a87Var.E = i37;
                            a87Var.F = i36;
                            a87Var.q = wu5VarA;
                            a87Var.d = str;
                            a87Var.h = i38;
                            a87Var.i = i38;
                            p21Var.d = new b87(a87Var);
                        } else {
                            str5 = str5;
                            if (iM3 == 1684366131) {
                                nmcVar2.N(i28 + 8);
                                String string2 = Integer.toString(i4);
                                mo2 mo2Var2 = new mo2();
                                mo2Var2.p(nmcVar2);
                                int i39 = mo2Var2.i(13) * 1000;
                                mo2Var2.t(3);
                                int i40 = iArr2[mo2Var2.i(2)];
                                mo2Var2.t(10);
                                int i41 = iArr[mo2Var2.i(3)];
                                if (mo2Var2.i(1) != 0) {
                                    i41++;
                                }
                                int i42 = i41;
                                mo2Var2.t(3);
                                int i43 = mo2Var2.i(4);
                                mo2Var2.t(1);
                                if (i43 > 0) {
                                    mo2Var2.t(6);
                                    if (mo2Var2.i(1) != 0) {
                                        i42 += 2;
                                    }
                                    mo2Var2.t(1);
                                }
                                int i44 = i42;
                                if (mo2Var2.b() > 7) {
                                    mo2Var2.t(7);
                                    if (mo2Var2.i(1) != 0) {
                                        str4 = "audio/eac3-joc";
                                    } else {
                                        str4 = "audio/eac3";
                                    }
                                } else {
                                    str4 = "audio/eac3";
                                }
                                mo2Var2.c();
                                nmcVar2.N(mo2Var2.f());
                                a87 a87Var2 = new a87();
                                a87Var2.a = string2;
                                a87Var2.m = uya.n(str4);
                                a87Var2.E = i44;
                                a87Var2.F = i40;
                                a87Var2.q = wu5VarA;
                                a87Var2.d = str;
                                a87Var2.i = i39;
                                p21Var.d = new b87(a87Var2);
                            } else {
                                iM2 = iM2;
                                listR = listR;
                                if (iM3 == 1684103988) {
                                    nmcVar2.N(i28 + 8);
                                    String string3 = Integer.toString(i4);
                                    mo2 mo2Var3 = new mo2();
                                    mo2Var3.p(nmcVar2);
                                    int iB2 = mo2Var3.b();
                                    int i45 = mo2Var3.i(3);
                                    if (i45 > 1) {
                                        throw ParserException.c("Unsupported AC-4 DSI version: " + i45);
                                    }
                                    int i46 = mo2Var3.i(7);
                                    int i47 = mo2Var3.h() ? 48000 : 44100;
                                    mo2Var3.t(4);
                                    int i48 = mo2Var3.i(9);
                                    if (i46 > 1) {
                                        if (i45 == 0) {
                                            throw ParserException.c("Invalid AC-4 DSI version: " + i45);
                                        }
                                        if (mo2Var3.h()) {
                                            mo2Var3.t(16);
                                            if (mo2Var3.h()) {
                                                mo2Var3.t(np0.m);
                                            }
                                        }
                                    }
                                    if (i45 == 1) {
                                        if (mo2Var3.b() < 66) {
                                            throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                        }
                                        mo2Var3.t(66);
                                        mo2Var3.c();
                                    }
                                    i4 i4Var = new i4();
                                    i4Var.a = true;
                                    i4Var.b = -1;
                                    i4Var.c = -1;
                                    i4Var.d = true;
                                    i28 = i28;
                                    i4Var.e = 2;
                                    i4Var.f = 1;
                                    i4Var.g = 0;
                                    int i49 = 0;
                                    while (true) {
                                        if (i49 < i48) {
                                            if (i45 == 0) {
                                                i15 = i7;
                                                zH = mo2Var3.h();
                                                i20 = mo2Var3.i(5);
                                                i21 = mo2Var3.i(5);
                                                i22 = 0;
                                                i23 = 0;
                                                z2 = false;
                                            } else {
                                                int i50 = i48;
                                                int i51 = mo2Var3.i(8);
                                                i15 = i7;
                                                int i52 = mo2Var3.i(8);
                                                if (i52 == 255) {
                                                    i52 = mo2Var3.i(16) + i52;
                                                }
                                                if (i51 > 2) {
                                                    mo2Var3.t(i52 * 8);
                                                    i49++;
                                                    i48 = i50;
                                                    i7 = i15;
                                                } else {
                                                    int iB3 = (iB2 - mo2Var3.b()) / 8;
                                                    int i53 = i52;
                                                    int i54 = mo2Var3.i(5);
                                                    z2 = i54 == 31;
                                                    i20 = i54;
                                                    i23 = iB3;
                                                    i22 = i53;
                                                    i21 = i51;
                                                    zH = false;
                                                }
                                            }
                                            i4Var.f = i21;
                                            i14 = iH2;
                                            if (zH || z2 || i20 != 6) {
                                                i4Var.g = mo2Var3.i(3);
                                                if (mo2Var3.h()) {
                                                    mo2Var3.t(5);
                                                }
                                                mo2Var3.t(2);
                                                int i55 = 1;
                                                if (i45 == 1 && (i21 == 1 || i21 == 2)) {
                                                    mo2Var3.t(2);
                                                }
                                                mo2Var3.t(5);
                                                mo2Var3.t(10);
                                                if (i45 == 1) {
                                                    if (i21 > 0) {
                                                        i4Var.a = mo2Var3.h();
                                                    }
                                                    if (i4Var.a) {
                                                        if (i21 != 1) {
                                                            i24 = 2;
                                                            if (i21 == 2) {
                                                                i25 = mo2Var3.i(5);
                                                                if (i25 >= 0 && i25 <= 15) {
                                                                    i4Var.b = i25;
                                                                }
                                                                if (i25 >= 11 || i25 > 14) {
                                                                    i24 = 2;
                                                                } else {
                                                                    i4Var.d = mo2Var3.h();
                                                                    i24 = 2;
                                                                    i4Var.e = mo2Var3.i(2);
                                                                }
                                                            }
                                                        } else {
                                                            i25 = mo2Var3.i(5);
                                                            if (i25 >= 0) {
                                                                i4Var.b = i25;
                                                            }
                                                            if (i25 >= 11) {
                                                                i24 = 2;
                                                            } else {
                                                                i24 = 2;
                                                            }
                                                        }
                                                        mo2Var3.t(24);
                                                        i55 = 1;
                                                    } else {
                                                        i24 = 2;
                                                    }
                                                    if (i21 == i55 || i21 == i24) {
                                                        if (mo2Var3.h() && mo2Var3.h()) {
                                                            mo2Var3.t(i24);
                                                        }
                                                        if (mo2Var3.h()) {
                                                            mo2Var3.s();
                                                            int i56 = 8;
                                                            int i57 = mo2Var3.i(8);
                                                            int i58 = 0;
                                                            while (i58 < i57) {
                                                                mo2Var3.t(i56);
                                                                i58++;
                                                                i56 = 8;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!zH && !z2) {
                                                    mo2Var3.s();
                                                    if (i20 == 0 || i20 == 1 || i20 == 2) {
                                                        if (i21 == 0) {
                                                            for (int i59 = 0; i59 < 2; i59++) {
                                                                h21.h(mo2Var3, i4Var);
                                                            }
                                                        } else {
                                                            for (int i60 = 0; i60 < 2; i60++) {
                                                                h21.i(mo2Var3, i4Var);
                                                            }
                                                        }
                                                    } else if (i20 == 3 || i20 == 4) {
                                                        if (i21 == 0) {
                                                            for (int i61 = 0; i61 < 3; i61++) {
                                                                h21.h(mo2Var3, i4Var);
                                                            }
                                                        } else {
                                                            for (int i62 = 0; i62 < 3; i62++) {
                                                                h21.i(mo2Var3, i4Var);
                                                            }
                                                        }
                                                    } else if (i20 != 5) {
                                                        int i63 = mo2Var3.i(7);
                                                        for (int i64 = 0; i64 < i63; i64++) {
                                                            mo2Var3.t(8);
                                                        }
                                                    } else if (i21 == 0) {
                                                        h21.h(mo2Var3, i4Var);
                                                    } else {
                                                        int i65 = mo2Var3.i(3);
                                                        for (int i66 = 0; i66 < i65 + 2; i66++) {
                                                            h21.i(mo2Var3, i4Var);
                                                        }
                                                    }
                                                } else if (i21 == 0) {
                                                    h21.h(mo2Var3, i4Var);
                                                } else {
                                                    h21.i(mo2Var3, i4Var);
                                                }
                                                mo2Var3.s();
                                                zH2 = mo2Var3.h();
                                            } else {
                                                i21 = i21;
                                                zH2 = true;
                                            }
                                            if (zH2) {
                                                int i67 = mo2Var3.i(7);
                                                for (int i68 = 0; i68 < i67; i68++) {
                                                    mo2Var3.t(15);
                                                }
                                            }
                                            if (i21 <= 0) {
                                                i16 = 8;
                                            } else {
                                                if (mo2Var3.h()) {
                                                    if (mo2Var3.b() < 66) {
                                                        throw ParserException.c("Can't parse bitrate DSI.");
                                                    }
                                                    mo2Var3.t(66);
                                                }
                                                if (mo2Var3.h()) {
                                                    mo2Var3.c();
                                                    mo2Var3.u(mo2Var3.i(16));
                                                    int i69 = mo2Var3.i(5);
                                                    for (int i70 = 0; i70 < i69; i70++) {
                                                        mo2Var3.t(3);
                                                        mo2Var3.t(8);
                                                    }
                                                    i16 = 8;
                                                } else {
                                                    i16 = 8;
                                                }
                                            }
                                            mo2Var3.c();
                                            if (i45 == 1) {
                                                int iB4 = ((iB2 - mo2Var3.b()) / i16) - i23;
                                                if (i22 < iB4) {
                                                    throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                                }
                                                mo2Var3.u(i22 - iB4);
                                            }
                                            if (i4Var.a && i4Var.b == -1) {
                                                throw ParserException.c("Can't determine channel mode of presentation " + i49);
                                            }
                                        } else {
                                            iIntValue = iIntValue;
                                            i14 = iH2;
                                            i15 = i7;
                                            i16 = 8;
                                        }
                                        if (i4Var.a) {
                                            int i71 = i4Var.b;
                                            boolean z5 = i4Var.d;
                                            int i72 = i4Var.e;
                                            switch (i71) {
                                                case 0:
                                                    i18 = 11;
                                                    i19 = 1;
                                                    break;
                                                case 1:
                                                    i18 = 11;
                                                    i19 = 2;
                                                    break;
                                                case 2:
                                                    i18 = 11;
                                                    i19 = 3;
                                                    break;
                                                case 3:
                                                    i18 = 11;
                                                    i19 = 5;
                                                    break;
                                                case 4:
                                                    i18 = 11;
                                                    i19 = 6;
                                                    break;
                                                case 5:
                                                case 7:
                                                case 9:
                                                    i18 = 11;
                                                    i19 = 7;
                                                    break;
                                                case 6:
                                                case 8:
                                                case 10:
                                                    i19 = i16;
                                                    i18 = 11;
                                                    break;
                                                case 11:
                                                    i18 = 11;
                                                    i19 = 11;
                                                    break;
                                                case 12:
                                                    i19 = 12;
                                                    i18 = 11;
                                                    break;
                                                case 13:
                                                    i18 = 11;
                                                    i19 = 13;
                                                    break;
                                                case 14:
                                                    i18 = 11;
                                                    i19 = 14;
                                                    break;
                                                case 15:
                                                    i18 = 11;
                                                    i19 = 24;
                                                    break;
                                                default:
                                                    i18 = 11;
                                                    i19 = -1;
                                                    break;
                                            }
                                            if (i71 == i18 || i71 == 12 || i71 == 13 || i71 == 14) {
                                                if (!z5) {
                                                    i19 -= 2;
                                                }
                                                if (i72 == 0) {
                                                    i19 -= 4;
                                                } else if (i72 == 1) {
                                                    i19 -= 2;
                                                }
                                            }
                                            i17 = i19;
                                        } else {
                                            int i73 = i4Var.c;
                                            int i74 = i4Var.g;
                                            if (i73 > 0) {
                                                i17 = i73 + 1;
                                                if (i74 == 4 && i17 == 17) {
                                                    i17 = 21;
                                                }
                                            } else if (i74 == 0) {
                                                i17 = 2;
                                            } else if (i74 == 1) {
                                                i17 = 6;
                                            } else if (i74 == 2) {
                                                i17 = i16;
                                            } else if (i74 == 3) {
                                                i17 = 10;
                                            } else if (i74 != 4) {
                                                lvb.G0("Ac4Util", "AC-4 level " + i4Var.g + " has not been defined.");
                                                i17 = 2;
                                            } else {
                                                i17 = 12;
                                            }
                                        }
                                        if (i17 <= 0) {
                                            throw ParserException.c("Cannot determine channel count of presentation.");
                                        }
                                        Object[] objArr = {Integer.valueOf(i46), Integer.valueOf(i4Var.f), Integer.valueOf(i4Var.g)};
                                        String str6 = vqi.a;
                                        String str7 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                        a87 a87Var3 = new a87();
                                        a87Var3.a = string3;
                                        a87Var3.m = uya.n("audio/ac4");
                                        a87Var3.E = i17;
                                        a87Var3.F = i47;
                                        a87Var3.q = wu5VarA;
                                        a87Var3.d = str;
                                        a87Var3.j = str7;
                                        p21Var.d = new b87(a87Var3);
                                        i7 = i15;
                                        iH2 = i14;
                                        i10 = iIntValue;
                                    }
                                } else {
                                    int i75 = iIntValue;
                                    i28 = i28;
                                    iH2 = iH2;
                                    i7 = i7;
                                    if (iM3 == 1684892784) {
                                        if (iM <= 0) {
                                            throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                        }
                                        n21Var = n21Var;
                                        str3 = str3;
                                        i7 = iM;
                                        iH3 = iH3;
                                        strP = strP;
                                        iM2 = iM2;
                                        i28 = i28;
                                        i10 = i75;
                                        iH2 = 2;
                                    } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                        i10 = i75;
                                        a87 a87Var4 = new a87();
                                        a87Var4.a = Integer.toString(i4);
                                        a87Var4.m = uya.n(str3);
                                        iH2 = iH2;
                                        a87Var4.E = iH2;
                                        i7 = i7;
                                        a87Var4.F = i7;
                                        a87Var4.q = wu5VarA;
                                        a87Var4.d = str;
                                        p21Var.d = new b87(a87Var4);
                                    } else if (iM3 == 1682927731) {
                                        int i76 = iM2 - 8;
                                        byte[] bArr6 = a;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i76);
                                        nmcVar2.N(i28 + 8);
                                        nmcVar2.k(bArr6.length, bArrCopyOf, i76);
                                        n21Var = n21Var;
                                        str3 = str3;
                                        listR = uel.a(bArrCopyOf);
                                        iH3 = iH3;
                                        strP = strP;
                                        iM2 = iM2;
                                        i28 = i28;
                                        i7 = i7;
                                        i10 = i75;
                                    } else {
                                        if (iM3 == 1684425825) {
                                            byte[] bArr7 = new byte[iM2 - 8];
                                            bArr7[0] = 102;
                                            bArr7[1] = 76;
                                            bArr7[2] = 97;
                                            bArr7[3] = 67;
                                            nmcVar2.N(i28 + 12);
                                            nmcVar2.k(4, bArr7, iM2 - 12);
                                            listR = c98.r(bArr7);
                                            strP = strP;
                                        } else if (iM3 == 1634492771) {
                                            int i77 = iM2 - 12;
                                            byte[] bArr8 = new byte[i77];
                                            nmcVar2.N(i28 + 12);
                                            nmcVar2.k(0, bArr8, i77);
                                            byte[] bArr9 = qu3.a;
                                            nmc nmcVar4 = new nmc(bArr8);
                                            nmcVar4.N(5);
                                            int iA5 = nmcVar4.A();
                                            nmcVar4.N(9);
                                            int iA6 = nmcVar4.A();
                                            nmcVar4.N(20);
                                            int[] iArr3 = {nmcVar4.E(), iA6, iA5};
                                            int i78 = iArr3[0];
                                            int i79 = iArr3[1];
                                            int i80 = iArr3[2];
                                            String str8 = vqi.a;
                                            str3 = str3;
                                            iH3 = vqi.H(i80, ByteOrder.LITTLE_ENDIAN);
                                            iH2 = i79;
                                            listR = c98.r(bArr8);
                                            strP = strP;
                                            iM2 = iM2;
                                            i28 = i28;
                                            n21Var = n21Var;
                                            i7 = i78;
                                            i10 = i75;
                                        } else if (iM3 == 1767990114) {
                                            nmcVar2.N(i28 + 9);
                                            int iF = nmcVar2.F();
                                            byte[] bArr10 = new byte[iF];
                                            nmcVar2.k(0, bArr10, iF);
                                            byte[] bArr11 = qu3.a;
                                            nmc nmcVar5 = new nmc(bArr10);
                                            String str9 = null;
                                            String strY = null;
                                            while (nmcVar5.a() > 0 && (str9 == null || strY == null)) {
                                                int iA7 = nmcVar5.A();
                                                int i81 = iA7 >> 3;
                                                boolean z6 = (iA7 & 2) != 0;
                                                boolean z7 = (iA7 & 1) != 0;
                                                int iF2 = nmcVar5.F();
                                                if (i81 > 4 && i81 < 24 && z6) {
                                                    do {
                                                    } while ((nmcVar5.A() & np0.m) != 0);
                                                    for (i13 = np0.m; (nmcVar5.A() & i13) != 0; i13 = np0.m) {
                                                    }
                                                }
                                                if (z7) {
                                                    nmcVar5.O(nmcVar5.F());
                                                }
                                                int i82 = nmcVar5.b + iF2;
                                                if (i81 == 31) {
                                                    nmcVar5.O(4);
                                                    Object[] objArr2 = {Integer.valueOf(nmcVar5.A()), Integer.valueOf(nmcVar5.A())};
                                                    String str10 = vqi.a;
                                                    str9 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else {
                                                    if (i81 == 0) {
                                                        while ((nmcVar5.A() & np0.m) != 0) {
                                                        }
                                                        strY = nmcVar5.y(4, StandardCharsets.UTF_8);
                                                        if (strY.equals("mp4a")) {
                                                            while ((nmcVar5.A() & np0.m) != 0) {
                                                            }
                                                            nmcVar5.O(2);
                                                            mo2 mo2Var4 = new mo2();
                                                            mo2Var4.p(nmcVar5);
                                                            int i83 = mo2Var4.i(5);
                                                            if (i83 == 31) {
                                                                i83 = mo2Var4.i(6) + 32;
                                                            }
                                                            strY = qt4.j(i83, strY, ".40.");
                                                        }
                                                    }
                                                    nmcVar5.N(i82);
                                                }
                                                nmcVar5.N(i82);
                                            }
                                            strP = (str9 == null || strY == null) ? null : zo5.p(str9, ".", strY);
                                            listR = c98.r(bArr10);
                                        } else if (iM3 == 1885564227) {
                                            nmcVar2.N(i28 + 12);
                                            ByteOrder byteOrder = (nmcVar2.A() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iA8 = nmcVar2.A();
                                            i10 = i75;
                                            iH3 = i10 == 1768973165 ? vqi.H(iA8, byteOrder) : (i10 == 1718641517 && iA8 == i27 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : iH3;
                                            n21Var = n21Var;
                                            str3 = iH3 != -1 ? "audio/raw" : str3;
                                        } else {
                                            i10 = i75;
                                            i7 = i7;
                                            iH2 = iH2;
                                        }
                                        i10 = i75;
                                    }
                                }
                                str3 = str3;
                                iH2 = iH2;
                                iH3 = iH3;
                                strP = strP;
                                iM2 = iM2;
                                i28 = i28;
                                n21Var = n21Var;
                            }
                        }
                        i10 = iIntValue;
                        str3 = str3;
                        iH2 = iH2;
                        iH3 = iH3;
                        strP = strP;
                        iM2 = iM2;
                        i28 = i28;
                        n21Var = n21Var;
                    }
                    int i84 = i28 + iM2;
                    i6 = 2;
                    i27 = 32;
                    i26 = i3;
                    n21Var = n21Var;
                    iIntValue = i10;
                    str2 = str3;
                    str5 = str5;
                    listR = listR;
                    iH2 = iH2;
                    i28 = i84;
                    nmcVar2 = nmcVar;
                }
                listR = listR;
                strP = strP;
            }
            n21Var = n21Var;
            str3 = str3;
            i10 = iIntValue;
            int i85 = i28 + iM2;
            i6 = 2;
            i27 = 32;
            i26 = i3;
            n21Var = n21Var;
            iIntValue = i10;
            str2 = str3;
            str5 = str5;
            listR = listR;
            iH2 = iH2;
            i28 = i85;
            nmcVar2 = nmcVar;
        }
        String str11 = str2;
        int i86 = iH2;
        int i87 = iH3;
        String str12 = strP;
        List list = listR;
        if (((b87) p21Var.d) != null || str11 == null) {
            return;
        }
        a87 a87Var5 = new a87();
        a87Var5.a = Integer.toString(i4);
        a87Var5.m = uya.n(str11);
        a87Var5.j = str12;
        a87Var5.E = i86;
        a87Var5.F = i7;
        a87Var5.G = i87;
        a87Var5.p = list;
        a87Var5.q = wu5VarA;
        a87Var5.d = str;
        if (n21Var != null) {
            n21 n21Var2 = n21Var;
            a87Var5.h = k4m.g(n21Var2.a);
            a87Var5.i = k4m.g(n21Var2.b);
        } else {
            uw uwVar2 = uwVar;
            if (uwVar2 != null) {
                a87Var5.h = k4m.g(uwVar2.b);
                a87Var5.i = k4m.g(uwVar2.c);
            }
        }
        p21Var.d = new b87(a87Var5);
    }

    public static n21 c(int i, nmc nmcVar) {
        nmcVar.N(i + 12);
        nmcVar.O(1);
        d(nmcVar);
        nmcVar.O(2);
        int iA = nmcVar.A();
        if ((iA & np0.m) != 0) {
            nmcVar.O(2);
        }
        if ((iA & 64) != 0) {
            nmcVar.O(nmcVar.A());
        }
        if ((iA & 32) != 0) {
            nmcVar.O(2);
        }
        nmcVar.O(1);
        d(nmcVar);
        String strE = uya.e(nmcVar.A());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new n21(strE, null, -1L, -1L);
        }
        nmcVar.O(4);
        long jC = nmcVar.C();
        long jC2 = nmcVar.C();
        nmcVar.O(1);
        int iD = d(nmcVar);
        long j = jC2;
        byte[] bArr = new byte[iD];
        nmcVar.k(0, bArr, iD);
        if (j <= 0) {
            j = -1;
        }
        return new n21(strE, bArr, j, jC > 0 ? jC : -1L);
    }

    public static int d(nmc nmcVar) {
        int iA = nmcVar.A();
        int i = iA & 127;
        while ((iA & np0.m) == 128) {
            iA = nmcVar.A();
            i = (i << 7) | (iA & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static lwa f(m2b m2bVar) {
        qp9 qp9Var;
        n2b n2bVarH = m2bVar.h(1751411826);
        n2b n2bVarH2 = m2bVar.h(1801812339);
        n2b n2bVarH3 = m2bVar.h(1768715124);
        if (n2bVarH != null && n2bVarH2 != null && n2bVarH3 != null) {
            nmc nmcVar = n2bVarH.c;
            nmcVar.N(16);
            if (nmcVar.m() == 1835299937) {
                nmc nmcVar2 = n2bVarH2.c;
                nmcVar2.N(12);
                int iM = nmcVar2.m();
                String[] strArr = new String[iM];
                for (int i = 0; i < iM; i++) {
                    int iM2 = nmcVar2.m();
                    nmcVar2.O(4);
                    strArr[i] = nmcVar2.y(iM2 - 8, StandardCharsets.UTF_8);
                }
                nmc nmcVar3 = n2bVarH3.c;
                nmcVar3.N(8);
                ArrayList arrayList = new ArrayList();
                while (nmcVar3.a() > 8) {
                    int i2 = nmcVar3.b;
                    int iM3 = nmcVar3.m();
                    int iM4 = nmcVar3.m() - 1;
                    if (iM4 < 0 || iM4 >= iM) {
                        qt4.y(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iM4];
                        int i3 = i2 + iM3;
                        while (true) {
                            int i4 = nmcVar3.b;
                            if (i4 >= i3) {
                                qp9Var = null;
                                break;
                            }
                            int iM5 = nmcVar3.m();
                            if (nmcVar3.m() == 1684108385) {
                                int iM6 = nmcVar3.m();
                                int iM7 = nmcVar3.m();
                                int i5 = iM5 - 16;
                                byte[] bArr = new byte[i5];
                                nmcVar3.k(0, bArr, i5);
                                qp9Var = new qp9(bArr, iM7, iM6, str);
                                break;
                            }
                            nmcVar3.N(i4 + iM5);
                        }
                        if (qp9Var != null) {
                            arrayList.add(qp9Var);
                        }
                    }
                    nmcVar3.N(i2 + iM3);
                }
                if (!arrayList.isEmpty()) {
                    return new lwa(arrayList);
                }
            }
        }
        return null;
    }

    public static u2b g(nmc nmcVar) {
        long jU;
        long jU2;
        nmcVar.N(8);
        if (e(nmcVar.m()) == 0) {
            jU = nmcVar.C();
            jU2 = nmcVar.C();
        } else {
            jU = nmcVar.u();
            jU2 = nmcVar.u();
        }
        return new u2b(jU, jU2, nmcVar.C());
    }

    public static Pair h(nmc nmcVar, int i, int i2) throws ParserException {
        fyh fyhVar;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = nmcVar.b;
        while (i5 - i < i2) {
            nmcVar.N(i5);
            int iM = nmcVar.m();
            gxl.a("childAtomSize must be positive", iM > 0);
            if (nmcVar.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i6 - i5 < iM) {
                    nmcVar.N(i6);
                    int iM2 = nmcVar.m();
                    int iM3 = nmcVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(nmcVar.m());
                    } else if (iM3 == 1935894637) {
                        nmcVar.O(4);
                        strY = nmcVar.y(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    gxl.a("frma atom is mandatory", numValueOf != null);
                    gxl.a("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            fyhVar = null;
                            break;
                        }
                        nmcVar.N(i9);
                        int iM4 = nmcVar.m();
                        if (nmcVar.m() == 1952804451) {
                            int iE = e(nmcVar.m());
                            nmcVar.O(1);
                            if (iE == 0) {
                                nmcVar.O(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iA = nmcVar.A();
                                i3 = iA & 15;
                                i4 = (iA & 240) >> 4;
                            }
                            boolean z = nmcVar.A() == 1;
                            int iA2 = nmcVar.A();
                            byte[] bArr2 = new byte[16];
                            nmcVar.k(0, bArr2, 16);
                            if (z && iA2 == 0) {
                                int iA3 = nmcVar.A();
                                byte[] bArr3 = new byte[iA3];
                                nmcVar.k(0, bArr3, iA3);
                                bArr = bArr3;
                            }
                            fyhVar = new fyh(z, strY, iA2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM4;
                    }
                    gxl.a("tenc atom is mandatory", fyhVar != null);
                    String str = vqi.a;
                    pairCreate = Pair.create(numValueOf, fyhVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:371:0x0807  */
    /* JADX WARN: Code duplicated, block: B:373:0x0827  */
    /* JADX WARN: Code duplicated, block: B:375:0x082d  */
    /* JADX WARN: Code duplicated, block: B:376:0x083c  */
    /* JADX WARN: Code duplicated, block: B:381:0x085e  */
    /* JADX WARN: Code duplicated, block: B:383:0x086c  */
    /* JADX WARN: Code duplicated, block: B:384:0x087b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0881  */
    /* JADX WARN: Code duplicated, block: B:387:0x0890  */
    /* JADX WARN: Code duplicated, block: B:389:0x0896  */
    /* JADX WARN: Code duplicated, block: B:390:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:392:0x08af  */
    /* JADX WARN: Code duplicated, block: B:394:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:398:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:399:0x08e7  */
    /* JADX WARN: Code duplicated, block: B:402:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:405:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:408:0x0905  */
    /* JADX WARN: Code duplicated, block: B:413:0x0911  */
    /* JADX WARN: Code duplicated, block: B:416:0x091e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x0926  */
    /* JADX WARN: Code duplicated, block: B:423:0x092e  */
    /* JADX WARN: Code duplicated, block: B:426:0x0935  */
    /* JADX WARN: Code duplicated, block: B:428:0x0946 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:432:0x094e  */
    /* JADX WARN: Code duplicated, block: B:435:0x095a  */
    /* JADX WARN: Code duplicated, block: B:436:0x095d  */
    /* JADX WARN: Code duplicated, block: B:438:0x096c  */
    /* JADX WARN: Code duplicated, block: B:602:0x08bf A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:371:0x0807, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static p21 i(nmc nmcVar, q21 q21Var, String str, wu5 wu5Var, boolean z) throws ParserException {
        int i;
        wu5 wu5Var2;
        String str2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        char c;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        byte[] bArrCopyOfRange;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean zH;
        int i12;
        int i13;
        int i14;
        int i15;
        char c2;
        int i16;
        boolean zH2;
        int i17;
        int i18;
        boolean z3;
        int i19;
        int iJ;
        ex3 ex3Var;
        int i20;
        int i21;
        ex3 ex3Var2;
        int i22;
        int i23;
        xva xvaVar;
        wu5 wu5VarA;
        int i24;
        String str4;
        ghe gheVarR;
        long j;
        nmc nmcVar2 = nmcVar;
        q21 q21Var2 = q21Var;
        String str5 = str;
        int i25 = q21Var2.a;
        nmcVar2.N(12);
        int iM = nmcVar2.m();
        p21 p21Var = new p21();
        p21Var.c = new fyh[iM];
        boolean z4 = false;
        p21Var.b = 0;
        int i26 = 0;
        while (i26 < iM) {
            int i27 = nmcVar2.b;
            int iM2 = nmcVar2.m();
            String str6 = "childAtomSize must be positive";
            gxl.a("childAtomSize must be positive", iM2 > 0 ? true : z4);
            int iM3 = nmcVar2.m();
            int i28 = 3;
            int i29 = 8;
            byte[] bArr2 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241) {
                int i30 = q21Var2.c;
                nmcVar2.N(i27 + 16);
                nmcVar2.O(16);
                int iH = nmcVar2.H();
                int iH2 = nmcVar2.H();
                nmcVar2.O(50);
                int i31 = nmcVar2.b;
                i = i26;
                if (iM3 == 1701733238) {
                    Pair pairH = h(nmcVar2, i27, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        wu5VarA = wu5Var == null ? null : wu5Var.a(((fyh) pairH.second).b);
                        ((fyh[]) p21Var.c)[i] = (fyh) pairH.second;
                    } else {
                        i27 = i27;
                        wu5VarA = wu5Var;
                    }
                    nmcVar2.N(i31);
                    wu5Var2 = wu5VarA;
                } else {
                    i27 = i27;
                    wu5Var2 = wu5Var;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                wu5 wu5Var3 = wu5Var2;
                i2 = i25;
                i3 = iM;
                int i32 = 8;
                int i33 = 8;
                List listR = null;
                ljf ljfVar = null;
                ByteBuffer byteBuffer = null;
                String string = null;
                byte[] bArr3 = null;
                zo7 zo7VarL = null;
                uw uwVar = null;
                n21 n21Var = null;
                String str7 = str2;
                float fE = 1.0f;
                int i34 = -1;
                int i35 = -1;
                int i36 = -1;
                boolean z5 = false;
                int i37 = -1;
                int i38 = -1;
                int i39 = -1;
                int i40 = -1;
                int i41 = i31;
                int iJ2 = -1;
                while (i41 - i27 < iM2) {
                    nmcVar2.N(i41);
                    int i42 = nmcVar2.b;
                    int i43 = i41;
                    int iM4 = nmcVar2.m();
                    if (iM4 == 0 && nmcVar2.b - i27 == iM2) {
                        break;
                    }
                    gxl.a(str6, iM4 > 0);
                    int iM5 = nmcVar2.m();
                    int i44 = iM2;
                    if (iM5 == 1635148611) {
                        gxl.a(bArr2, str7 == null);
                        nmcVar2.N(i42 + 8);
                        tk0 tk0VarA = tk0.a(nmcVar2);
                        listR = tk0VarA.a;
                        p21Var.a = tk0VarA.b;
                        float f = !z5 ? tk0VarA.k : fE;
                        String str8 = tk0VarA.l;
                        int i45 = tk0VarA.j;
                        i36 = tk0VarA.g;
                        int i46 = tk0VarA.h;
                        iJ2 = tk0VarA.i;
                        int i47 = tk0VarA.e;
                        i32 = tk0VarA.f;
                        i38 = i45;
                        i5 = iM3;
                        i7 = i34;
                        fE = f;
                        i6 = i47;
                        ljfVar = ljfVar;
                        str7 = "video/avc";
                        string = str8;
                        i35 = i46;
                    } else {
                        i5 = iM3;
                        if (iM5 == 1752589123) {
                            gxl.a(null, str7 == null);
                            nmcVar2.N(i42 + 8);
                            yu7 yu7VarA = yu7.a(nmcVar2, false, null);
                            listR = yu7VarA.a;
                            p21Var.a = yu7VarA.b;
                            float f2 = !z5 ? yu7VarA.l : fE;
                            int i48 = yu7VarA.m;
                            int i49 = yu7VarA.c;
                            String str9 = yu7VarA.n;
                            int i50 = yu7VarA.k;
                            if (i50 != -1) {
                                i34 = i50;
                            }
                            int i51 = yu7VarA.d;
                            int i52 = yu7VarA.e;
                            i36 = yu7VarA.h;
                            int i53 = yu7VarA.i;
                            int i54 = yu7VarA.j;
                            int i55 = yu7VarA.f;
                            int i56 = yu7VarA.g;
                            ljfVar = yu7VarA.o;
                            i32 = i56;
                            str7 = "video/hevc";
                            fE = f2;
                            i40 = i51;
                            i39 = i52;
                            i35 = i53;
                            iJ2 = i54;
                            i6 = i55;
                            i37 = i49;
                            i7 = i34;
                            i38 = i48;
                            string = str9;
                        } else {
                            int i57 = i34;
                            if (iM5 == 1818785347) {
                                gxl.a("lhvC must follow hvcC atom", "video/hevc".equals(str7));
                                gxl.a("must have at least two layers", ljfVar != null && ((c98) ljfVar.b).size() >= 2);
                                nmcVar2.N(i42 + 8);
                                ljfVar.getClass();
                                yu7 yu7VarA2 = yu7.a(nmcVar2, true, ljfVar);
                                gxl.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", p21Var.a == yu7VarA2.b);
                                int i58 = yu7VarA2.h;
                                if (i58 != -1) {
                                    gxl.a("colorSpace must be the same for both views", i36 == i58);
                                }
                                int i59 = yu7VarA2.i;
                                if (i59 != -1) {
                                    gxl.a("colorRange must be the same for both views", i35 == i59);
                                }
                                int i60 = yu7VarA2.j;
                                if (i60 != -1) {
                                    gxl.a("colorTransfer must be the same for both views", iJ2 == i60);
                                }
                                gxl.a("bitdepthLuma must be the same for both views", i33 == yu7VarA2.f);
                                gxl.a("bitdepthChroma must be the same for both views", i32 == yu7VarA2.g);
                                if (listR != null) {
                                    z88 z88VarL = c98.l();
                                    z88VarL.f(listR);
                                    z88VarL.f(yu7VarA2.a);
                                    listR = z88VarL.h();
                                } else {
                                    gxl.a("initializationData must be already set from hvcC atom", false);
                                }
                                i6 = i33;
                                string = yu7VarA2.n;
                                str7 = "video/mv-hevc";
                                p21Var = p21Var;
                                ljfVar = ljfVar;
                                i29 = i29;
                                i7 = i57;
                                bArr = null;
                                str6 = str6;
                            } else {
                                if (iM5 == 1986361461) {
                                    nmcVar2.N(i42 + 8);
                                    int i61 = nmcVar2.b;
                                    xva xvaVar2 = null;
                                    while (i61 - i42 < iM4) {
                                        nmcVar2.N(i61);
                                        int iM6 = nmcVar2.m();
                                        gxl.a(str6, iM6 > 0);
                                        int i62 = i32;
                                        if (nmcVar2.m() == 1702454643) {
                                            nmcVar2.N(i61 + 8);
                                            int i63 = nmcVar2.b;
                                            while (true) {
                                                if (i63 - i61 >= iM6) {
                                                    xvaVar = null;
                                                    break;
                                                }
                                                nmcVar2.N(i63);
                                                int iM7 = nmcVar2.m();
                                                gxl.a(str6, iM7 > 0);
                                                int i64 = i63;
                                                if (nmcVar2.m() == 1937011305) {
                                                    nmcVar2.O(4);
                                                    int iA = nmcVar2.A();
                                                    boolean z6 = (iA & 1) == 1;
                                                    boolean z7 = (iA & 2) == 2;
                                                    boolean z8 = (iA & 8) == i29;
                                                    na0 na0Var = new na0();
                                                    na0Var.a = z6;
                                                    na0Var.b = z7;
                                                    na0Var.c = z8;
                                                    xvaVar = new xva(i28, na0Var);
                                                    break;
                                                }
                                                i63 = i64 + iM7;
                                                i28 = 3;
                                                i29 = 8;
                                            }
                                            xvaVar2 = xvaVar;
                                        } else {
                                            i33 = i33;
                                            i61 = i61;
                                            iM6 = iM6;
                                        }
                                        i61 += iM6;
                                        i32 = i62;
                                        i33 = i33;
                                        i28 = 3;
                                        i29 = 8;
                                    }
                                    int i65 = i32;
                                    i6 = i33;
                                    b1k b1kVar = xvaVar2 == null ? null : new b1k(4, xvaVar2);
                                    if (b1kVar != null) {
                                        na0 na0Var2 = (na0) ((xva) b1kVar.b).b;
                                        boolean z9 = na0Var2.c;
                                        if (ljfVar == null || ((c98) ljfVar.b).size() < 2) {
                                            i22 = i57;
                                            if (i22 == -1) {
                                                i23 = z9 ? 5 : 4;
                                            } else {
                                                i23 = i22;
                                            }
                                        } else {
                                            gxl.a("both eye views must be marked as available", na0Var2.a && na0Var2.b);
                                            gxl.a("for MV-HEVC, eye_views_reversed must be set to false", !z9);
                                            i22 = i57;
                                            i23 = i22;
                                        }
                                    } else {
                                        i22 = i57;
                                        i23 = i22;
                                    }
                                    i7 = i23;
                                    str7 = str7;
                                    i32 = i65;
                                } else {
                                    i32 = i32;
                                    i6 = i33;
                                    i7 = i57;
                                    if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                        str6 = str6;
                                        str7 = str7;
                                        p21Var = p21Var;
                                        i35 = i35;
                                        ljfVar = ljfVar;
                                        bArr = null;
                                        i29 = 8;
                                        zo7VarL = zo7.l(nmcVar2);
                                    } else {
                                        int i66 = 6;
                                        if (iM5 == 1987076931) {
                                            gxl.a(null, str7 == null);
                                            String str10 = i5 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            nmcVar2.N(i42 + 12);
                                            byte bA = (byte) nmcVar2.A();
                                            byte bA2 = (byte) nmcVar2.A();
                                            int iA2 = nmcVar2.A();
                                            int i67 = iA2 >> 4;
                                            byte b = (byte) ((iA2 >> 1) & 7);
                                            if (str10.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr4 = qu3.a;
                                                listR = c98.r(new byte[]{1, 1, bA, 2, 1, bA2, 3, 1, (byte) i67, 4, 1, b});
                                            }
                                            boolean z10 = (iA2 & 1) != 0;
                                            int iA3 = nmcVar2.A();
                                            int iA4 = nmcVar2.A();
                                            i36 = ex3.i(iA3);
                                            int i68 = z10 ? 1 : 2;
                                            iJ2 = ex3.j(iA4);
                                            i7 = i7;
                                            i5 = i5;
                                            i32 = i67;
                                            i6 = i32;
                                            str7 = str10;
                                            i35 = i68;
                                        } else {
                                            int i69 = 7;
                                            int i70 = 11;
                                            if (iM5 == 1635135811) {
                                                int i71 = iM4 - 8;
                                                byte[] bArr5 = new byte[i71];
                                                nmcVar2.k(0, bArr5, i71);
                                                listR = c98.r(bArr5);
                                                nmcVar2.N(i42 + 8);
                                                byte[] bArr6 = nmcVar2.a;
                                                mo2 mo2Var = new mo2(bArr6.length, bArr6);
                                                mo2Var.q(nmcVar2.b * 8);
                                                mo2Var.u(1);
                                                int i72 = mo2Var.i(3);
                                                mo2Var.t(6);
                                                boolean zH3 = mo2Var.h();
                                                boolean zH4 = mo2Var.h();
                                                int i73 = -1;
                                                if (i72 == 2 && zH3) {
                                                    int i74 = zH4 ? 12 : 10;
                                                    i10 = zH4 ? 12 : 10;
                                                    i8 = i74;
                                                } else {
                                                    if (i72 <= 2) {
                                                        int i75 = zH3 ? 10 : 8;
                                                        i10 = zH3 ? 10 : 8;
                                                        i8 = i75;
                                                    } else {
                                                        i8 = -1;
                                                        i9 = -1;
                                                    }
                                                    mo2Var.t(13);
                                                    mo2Var.s();
                                                    i11 = mo2Var.i(4);
                                                    if (i11 != 1) {
                                                        lvb.r0("BoxParsers", "Unsupported obu_type: " + i11);
                                                        ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                    } else if (mo2Var.h()) {
                                                        lvb.r0("BoxParsers", "Unsupported obu_extension_flag");
                                                        ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                    } else {
                                                        zH = mo2Var.h();
                                                        mo2Var.s();
                                                        if (zH || mo2Var.i(8) <= 127) {
                                                            i12 = mo2Var.i(3);
                                                            mo2Var.s();
                                                            if (mo2Var.h()) {
                                                                lvb.r0("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                            } else if (mo2Var.h()) {
                                                                lvb.r0("BoxParsers", "Unsupported timing_info_present_flag");
                                                                ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                            } else {
                                                                if (mo2Var.h()) {
                                                                    lvb.r0("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                                } else {
                                                                    i13 = 5;
                                                                    i14 = mo2Var.i(5);
                                                                    i15 = 0;
                                                                    while (i15 <= i14) {
                                                                        mo2Var.t(12);
                                                                        if (mo2Var.i(i13) > i69) {
                                                                            mo2Var.s();
                                                                        }
                                                                        i15++;
                                                                        i13 = 5;
                                                                        i69 = 7;
                                                                    }
                                                                    c2 = '\f';
                                                                    int i76 = mo2Var.i(4);
                                                                    int i77 = mo2Var.i(4);
                                                                    mo2Var.t(i76 + 1);
                                                                    mo2Var.t(i77 + 1);
                                                                    if (mo2Var.h()) {
                                                                        i16 = 7;
                                                                        mo2Var.t(7);
                                                                    } else {
                                                                        i16 = 7;
                                                                    }
                                                                    mo2Var.t(i16);
                                                                    zH2 = mo2Var.h();
                                                                    if (zH2) {
                                                                        mo2Var.t(2);
                                                                    }
                                                                    if (mo2Var.h()) {
                                                                        i17 = 1;
                                                                        i18 = 2;
                                                                    } else {
                                                                        i17 = 1;
                                                                        i18 = mo2Var.i(1);
                                                                    }
                                                                    if (i18 > 0 && !mo2Var.h()) {
                                                                        mo2Var.t(i17);
                                                                    }
                                                                    if (zH2) {
                                                                        mo2Var.t(3);
                                                                    }
                                                                    mo2Var.t(3);
                                                                    boolean zH5 = mo2Var.h();
                                                                    if (i12 == 2 && zH5) {
                                                                        mo2Var.s();
                                                                    }
                                                                    if (i12 == 1 && mo2Var.h()) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    if (mo2Var.h()) {
                                                                        int i78 = mo2Var.i(8);
                                                                        int i79 = mo2Var.i(8);
                                                                        int i80 = mo2Var.i(8);
                                                                        if (z3 && i78 == 1 && i79 == 13 && i80 == 0) {
                                                                            i20 = 1;
                                                                        } else {
                                                                            i20 = mo2Var.i(1);
                                                                        }
                                                                        int i81 = ex3.i(i78);
                                                                        if (i20 == 1) {
                                                                            i21 = 1;
                                                                        } else {
                                                                            i21 = 2;
                                                                        }
                                                                        i19 = i81;
                                                                        iJ = ex3.j(i79);
                                                                        i73 = i21;
                                                                    } else {
                                                                        i19 = -1;
                                                                        iJ = -1;
                                                                    }
                                                                    ex3Var = new ex3(i19, i73, iJ, null, i8, i9);
                                                                }
                                                                int i82 = ex3Var.e;
                                                                int i83 = ex3Var.f;
                                                                i36 = ex3Var.a;
                                                                i35 = ex3Var.b;
                                                                iJ2 = ex3Var.c;
                                                                str7 = "video/av01";
                                                                i6 = i82;
                                                                str6 = str6;
                                                                p21Var = p21Var;
                                                                ljfVar = ljfVar;
                                                                bArr = null;
                                                                i29 = 8;
                                                                i7 = i7;
                                                                i32 = i83;
                                                            }
                                                        } else {
                                                            lvb.r0("BoxParsers", "Excessive obu_size");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        }
                                                    }
                                                    ex3Var = ex3Var2;
                                                    c2 = '\f';
                                                    int i84 = ex3Var.e;
                                                    int i85 = ex3Var.f;
                                                    i36 = ex3Var.a;
                                                    i35 = ex3Var.b;
                                                    iJ2 = ex3Var.c;
                                                    str7 = "video/av01";
                                                    i6 = i84;
                                                    str6 = str6;
                                                    p21Var = p21Var;
                                                    ljfVar = ljfVar;
                                                    bArr = null;
                                                    i29 = 8;
                                                    i7 = i7;
                                                    i32 = i85;
                                                }
                                                i9 = i10;
                                                mo2Var.t(13);
                                                mo2Var.s();
                                                i11 = mo2Var.i(4);
                                                if (i11 != 1) {
                                                    lvb.r0("BoxParsers", "Unsupported obu_type: " + i11);
                                                    ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                } else if (mo2Var.h()) {
                                                    lvb.r0("BoxParsers", "Unsupported obu_extension_flag");
                                                    ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                } else {
                                                    zH = mo2Var.h();
                                                    mo2Var.s();
                                                    if (zH) {
                                                        i12 = mo2Var.i(3);
                                                        mo2Var.s();
                                                        if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported timing_info_present_flag");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else {
                                                            i13 = 5;
                                                            i14 = mo2Var.i(5);
                                                            i15 = 0;
                                                            while (i15 <= i14) {
                                                                mo2Var.t(12);
                                                                if (mo2Var.i(i13) > i69) {
                                                                    mo2Var.s();
                                                                }
                                                                i15++;
                                                                i13 = 5;
                                                                i69 = 7;
                                                            }
                                                            c2 = '\f';
                                                            int i710 = mo2Var.i(4);
                                                            int i711 = mo2Var.i(4);
                                                            mo2Var.t(i710 + 1);
                                                            mo2Var.t(i711 + 1);
                                                            if (mo2Var.h()) {
                                                                i16 = 7;
                                                                mo2Var.t(7);
                                                            } else {
                                                                i16 = 7;
                                                            }
                                                            mo2Var.t(i16);
                                                            zH2 = mo2Var.h();
                                                            if (zH2) {
                                                                mo2Var.t(2);
                                                            }
                                                            if (mo2Var.h()) {
                                                                i17 = 1;
                                                                i18 = 2;
                                                            } else {
                                                                i17 = 1;
                                                                i18 = mo2Var.i(1);
                                                            }
                                                            if (i18 > 0) {
                                                                mo2Var.t(i17);
                                                            }
                                                            if (zH2) {
                                                                mo2Var.t(3);
                                                            }
                                                            mo2Var.t(3);
                                                            boolean zH6 = mo2Var.h();
                                                            if (i12 == 2) {
                                                                mo2Var.s();
                                                            }
                                                            if (i12 == 1) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (mo2Var.h()) {
                                                                int i712 = mo2Var.i(8);
                                                                int i713 = mo2Var.i(8);
                                                                int i86 = mo2Var.i(8);
                                                                if (z3) {
                                                                    i20 = mo2Var.i(1);
                                                                } else {
                                                                    i20 = mo2Var.i(1);
                                                                }
                                                                int i87 = ex3.i(i712);
                                                                if (i20 == 1) {
                                                                    i21 = 1;
                                                                } else {
                                                                    i21 = 2;
                                                                }
                                                                i19 = i87;
                                                                iJ = ex3.j(i713);
                                                                i73 = i21;
                                                            } else {
                                                                i19 = -1;
                                                                iJ = -1;
                                                            }
                                                            ex3Var = new ex3(i19, i73, iJ, null, i8, i9);
                                                        }
                                                    } else {
                                                        i12 = mo2Var.i(3);
                                                        mo2Var.s();
                                                        if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported timing_info_present_flag");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else if (mo2Var.h()) {
                                                            lvb.r0("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            ex3Var2 = new ex3(-1, -1, -1, null, i8, i9);
                                                        } else {
                                                            i13 = 5;
                                                            i14 = mo2Var.i(5);
                                                            i15 = 0;
                                                            while (i15 <= i14) {
                                                                mo2Var.t(12);
                                                                if (mo2Var.i(i13) > i69) {
                                                                    mo2Var.s();
                                                                }
                                                                i15++;
                                                                i13 = 5;
                                                                i69 = 7;
                                                            }
                                                            c2 = '\f';
                                                            int i714 = mo2Var.i(4);
                                                            int i715 = mo2Var.i(4);
                                                            mo2Var.t(i714 + 1);
                                                            mo2Var.t(i715 + 1);
                                                            if (mo2Var.h()) {
                                                                i16 = 7;
                                                                mo2Var.t(7);
                                                            } else {
                                                                i16 = 7;
                                                            }
                                                            mo2Var.t(i16);
                                                            zH2 = mo2Var.h();
                                                            if (zH2) {
                                                                mo2Var.t(2);
                                                            }
                                                            if (mo2Var.h()) {
                                                                i17 = 1;
                                                                i18 = 2;
                                                            } else {
                                                                i17 = 1;
                                                                i18 = mo2Var.i(1);
                                                            }
                                                            if (i18 > 0) {
                                                                mo2Var.t(i17);
                                                            }
                                                            if (zH2) {
                                                                mo2Var.t(3);
                                                            }
                                                            mo2Var.t(3);
                                                            boolean zH7 = mo2Var.h();
                                                            if (i12 == 2) {
                                                                mo2Var.s();
                                                            }
                                                            if (i12 == 1) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (mo2Var.h()) {
                                                                int i716 = mo2Var.i(8);
                                                                int i717 = mo2Var.i(8);
                                                                int i88 = mo2Var.i(8);
                                                                if (z3) {
                                                                    i20 = mo2Var.i(1);
                                                                } else {
                                                                    i20 = mo2Var.i(1);
                                                                }
                                                                int i89 = ex3.i(i716);
                                                                if (i20 == 1) {
                                                                    i21 = 1;
                                                                } else {
                                                                    i21 = 2;
                                                                }
                                                                i19 = i89;
                                                                iJ = ex3.j(i717);
                                                                i73 = i21;
                                                            } else {
                                                                i19 = -1;
                                                                iJ = -1;
                                                            }
                                                            ex3Var = new ex3(i19, i73, iJ, null, i8, i9);
                                                        }
                                                    }
                                                    int i810 = ex3Var.e;
                                                    int i811 = ex3Var.f;
                                                    i36 = ex3Var.a;
                                                    i35 = ex3Var.b;
                                                    iJ2 = ex3Var.c;
                                                    str7 = "video/av01";
                                                    i6 = i810;
                                                    str6 = str6;
                                                    p21Var = p21Var;
                                                    ljfVar = ljfVar;
                                                    bArr = null;
                                                    i29 = 8;
                                                    i7 = i7;
                                                    i32 = i811;
                                                }
                                                ex3Var = ex3Var2;
                                                c2 = '\f';
                                                int i812 = ex3Var.e;
                                                int i813 = ex3Var.f;
                                                i36 = ex3Var.a;
                                                i35 = ex3Var.b;
                                                iJ2 = ex3Var.c;
                                                str7 = "video/av01";
                                                i6 = i812;
                                                str6 = str6;
                                                p21Var = p21Var;
                                                ljfVar = ljfVar;
                                                bArr = null;
                                                i29 = 8;
                                                i7 = i7;
                                                i32 = i813;
                                            } else {
                                                if (iM5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(nmcVar2.x());
                                                    byteBufferOrder.putShort(nmcVar2.x());
                                                    byteBuffer = byteBufferOrder;
                                                } else if (iM5 == 1835295606) {
                                                    ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short sX = nmcVar2.x();
                                                    short sX2 = nmcVar2.x();
                                                    short sX3 = nmcVar2.x();
                                                    short sX4 = nmcVar2.x();
                                                    short sX5 = nmcVar2.x();
                                                    short sX6 = nmcVar2.x();
                                                    int i90 = i35;
                                                    short sX7 = nmcVar2.x();
                                                    short sX8 = nmcVar2.x();
                                                    long jC = nmcVar2.C();
                                                    long jC2 = nmcVar2.C();
                                                    byteBufferOrder2.position(1);
                                                    byteBufferOrder2.putShort(sX5);
                                                    byteBufferOrder2.putShort(sX6);
                                                    byteBufferOrder2.putShort(sX);
                                                    byteBufferOrder2.putShort(sX2);
                                                    byteBufferOrder2.putShort(sX3);
                                                    byteBufferOrder2.putShort(sX4);
                                                    byteBufferOrder2.putShort(sX7);
                                                    byteBufferOrder2.putShort(sX8);
                                                    byteBufferOrder2.putShort((short) (jC / 10000));
                                                    byteBufferOrder2.putShort((short) (jC2 / 10000));
                                                    byteBuffer = byteBufferOrder2;
                                                    i35 = i90;
                                                } else {
                                                    str6 = str6;
                                                    str7 = str7;
                                                    p21Var = p21Var;
                                                    i35 = i35;
                                                    ljfVar = ljfVar;
                                                    if (iM5 == 1681012275) {
                                                        bArr = null;
                                                        gxl.a(null, str7 == null);
                                                        i7 = i7;
                                                        str7 = "video/3gpp";
                                                        i32 = i32;
                                                        i35 = i35;
                                                    } else {
                                                        bArr = null;
                                                        if (iM5 == 1702061171) {
                                                            gxl.a(null, str7 == null);
                                                            n21 n21VarC = c(i42, nmcVar2);
                                                            String str11 = (String) n21VarC.c;
                                                            byte[] bArr7 = (byte[]) n21VarC.d;
                                                            if (bArr7 != null) {
                                                                listR = c98.r(bArr7);
                                                            }
                                                            n21Var = n21VarC;
                                                            str7 = str11;
                                                            i35 = i35;
                                                            i29 = 8;
                                                        } else if (iM5 == 1651798644) {
                                                            nmcVar2.N(i42 + 8);
                                                            nmcVar2.O(4);
                                                            i7 = i7;
                                                            uwVar = new uw(2, nmcVar2.C(), nmcVar2.C());
                                                        } else if (iM5 == 1885434736) {
                                                            nmcVar2.N(i42 + 8);
                                                            i7 = i7;
                                                            fE = nmcVar2.E() / nmcVar2.E();
                                                            i32 = i32;
                                                            i35 = i35;
                                                            i29 = 8;
                                                            z5 = true;
                                                        } else if (iM5 == 1937126244) {
                                                            int i91 = i42 + 8;
                                                            while (true) {
                                                                if (i91 - i42 >= iM4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                nmcVar2.N(i91);
                                                                int iM8 = nmcVar2.m();
                                                                if (nmcVar2.m() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(nmcVar2.a, i91, iM8 + i91);
                                                                    break;
                                                                }
                                                                i91 += iM8;
                                                            }
                                                            i7 = i7;
                                                            bArr3 = bArrCopyOfRange;
                                                        } else if (iM5 == 1936995172) {
                                                            int iA5 = nmcVar2.A();
                                                            nmcVar2.O(3);
                                                            if (iA5 == 0) {
                                                                int iA6 = nmcVar2.A();
                                                                if (iA6 == 0) {
                                                                    i7 = 0;
                                                                } else if (iA6 == 1) {
                                                                    i7 = 1;
                                                                } else if (iA6 == 2) {
                                                                    i7 = 2;
                                                                } else if (iA6 == 3) {
                                                                    i7 = 3;
                                                                }
                                                            }
                                                            i7 = i7;
                                                        } else if (iM5 == 1634760259) {
                                                            int i92 = iM4 - 12;
                                                            byte[] bArr8 = new byte[i92];
                                                            nmcVar2.N(i42 + 12);
                                                            nmcVar2.k(0, bArr8, i92);
                                                            byte[] bArr9 = qu3.a;
                                                            lvb.Q("Invalid APV CSD length: %s", i92, i92 >= 17);
                                                            byte b2 = bArr8[0];
                                                            lvb.Q("Invalid APV CSD version: %s", b2, b2 == 1);
                                                            byte b3 = bArr8[5];
                                                            byte b4 = bArr8[6];
                                                            byte b5 = bArr8[7];
                                                            String str12 = vqi.a;
                                                            Locale locale = Locale.US;
                                                            StringBuilder sbP = qv1.p("apv1.apvf", b3, ".apvl", b4, ".apvb");
                                                            sbP.append((int) b5);
                                                            string = sbP.toString();
                                                            listR = c98.r(bArr8);
                                                            nmc nmcVar3 = new nmc(bArr8);
                                                            mo2 mo2Var2 = new mo2(i92, bArr8);
                                                            i29 = 8;
                                                            mo2Var2.q(nmcVar3.b * 8);
                                                            mo2Var2.u(1);
                                                            int i93 = mo2Var2.i(8);
                                                            int i94 = 0;
                                                            int i95 = -1;
                                                            int i96 = -1;
                                                            int i97 = -1;
                                                            int i98 = -1;
                                                            int i99 = -1;
                                                            while (i94 < i93) {
                                                                mo2Var2.u(1);
                                                                int i100 = mo2Var2.i(8);
                                                                int iJ3 = i99;
                                                                int i101 = i98;
                                                                int i102 = i97;
                                                                int i103 = i96;
                                                                int i104 = i95;
                                                                int i105 = 0;
                                                                while (i105 < i100) {
                                                                    mo2Var2.t(i66);
                                                                    boolean zH8 = mo2Var2.h();
                                                                    mo2Var2.s();
                                                                    mo2Var2.u(i70);
                                                                    mo2Var2.t(4);
                                                                    i103 = mo2Var2.i(4) + 8;
                                                                    mo2Var2.u(1);
                                                                    if (zH8) {
                                                                        int i106 = mo2Var2.i(8);
                                                                        int i107 = mo2Var2.i(8);
                                                                        mo2Var2.u(1);
                                                                        boolean zH9 = mo2Var2.h();
                                                                        int i108 = ex3.i(i106);
                                                                        int i109 = zH9 ? 1 : 2;
                                                                        iJ3 = ex3.j(i107);
                                                                        i102 = i109;
                                                                        i101 = i108;
                                                                    }
                                                                    i105++;
                                                                    i104 = i103;
                                                                    i66 = 6;
                                                                    i70 = 11;
                                                                }
                                                                i94++;
                                                                i95 = i104;
                                                                i96 = i103;
                                                                i97 = i102;
                                                                i98 = i101;
                                                                i99 = iJ3;
                                                                i66 = 6;
                                                                i70 = 11;
                                                            }
                                                            str7 = "video/apv";
                                                            i6 = i96;
                                                            i35 = i97;
                                                            i36 = i98;
                                                            iJ2 = i99;
                                                            i7 = i7;
                                                            i32 = i95;
                                                        } else {
                                                            i29 = 8;
                                                            if (iM5 == 1668246642 && i36 == -1 && iJ2 == -1) {
                                                                int iM9 = nmcVar2.m();
                                                                if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                    int iH3 = nmcVar2.H();
                                                                    int iH4 = nmcVar2.H();
                                                                    nmcVar2.O(2);
                                                                    boolean z11 = iM4 == 19 && (nmcVar2.A() & np0.m) != 0;
                                                                    int i110 = ex3.i(iH3);
                                                                    int i111 = z11 ? 1 : 2;
                                                                    iJ2 = ex3.j(iH4);
                                                                    i36 = i110;
                                                                    i35 = i111;
                                                                } else {
                                                                    lvb.G0("BoxParsers", "Unsupported color type: ".concat(gn2.a(iM9)));
                                                                }
                                                            }
                                                        }
                                                        i7 = i7;
                                                        i32 = i32;
                                                    }
                                                    i29 = 8;
                                                }
                                                bArr = null;
                                                i29 = 8;
                                            }
                                        }
                                    }
                                    i32 = i32;
                                    i35 = i35;
                                }
                                bArr = null;
                                i29 = 8;
                            }
                        }
                        i41 = i43 + iM4;
                        i34 = i7;
                        bArr2 = bArr;
                        i29 = i29;
                        iM2 = i44;
                        iM3 = i5;
                        str6 = str6;
                        i33 = i6;
                        str7 = str7;
                        ljfVar = ljfVar;
                        p21Var = p21Var;
                        i28 = 3;
                    }
                    bArr = null;
                    i41 = i43 + iM4;
                    i34 = i7;
                    bArr2 = bArr;
                    i29 = i29;
                    iM2 = i44;
                    iM3 = i5;
                    str6 = str6;
                    i33 = i6;
                    str7 = str7;
                    ljfVar = ljfVar;
                    p21Var = p21Var;
                    i28 = 3;
                }
                int i112 = i32;
                int i113 = i33;
                i4 = iM2;
                int i114 = i34;
                String str13 = str7;
                p21 p21Var2 = p21Var;
                int i115 = i35;
                byte[] bArr10 = bArr2;
                z2 = false;
                c = '\f';
                if (zo7VarL != null) {
                    string = (String) zo7VarL.b;
                    str3 = "video/dolby-vision";
                } else {
                    str3 = str13;
                }
                String str14 = string;
                if (str3 == null) {
                    str5 = str;
                    p21Var = p21Var2;
                } else {
                    a87 a87Var = new a87();
                    a87Var.a = Integer.toString(i2);
                    a87Var.m = uya.n(str3);
                    a87Var.j = str14;
                    a87Var.t = iH;
                    a87Var.u = iH2;
                    a87Var.v = i40;
                    a87Var.w = i39;
                    a87Var.z = fE;
                    a87Var.y = i30;
                    a87Var.A = bArr3;
                    a87Var.B = i114;
                    a87Var.p = listR;
                    a87Var.o = i38;
                    a87Var.D = i37;
                    a87Var.q = wu5Var3;
                    str5 = str;
                    a87Var.d = str5;
                    a87Var.C = new ex3(i36, i115, iJ2, byteBuffer != null ? byteBuffer.array() : bArr10, i113, i112);
                    uw uwVar2 = uwVar;
                    if (uwVar2 != null) {
                        a87Var.h = k4m.g(uwVar2.b);
                        a87Var.i = k4m.g(uwVar2.c);
                    } else {
                        n21 n21Var2 = n21Var;
                        if (n21Var2 != null) {
                            a87Var.h = k4m.g(n21Var2.a);
                            a87Var.i = k4m.g(n21Var2.b);
                        }
                    }
                    p21Var = p21Var2;
                    p21Var.d = new b87(a87Var);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    nmcVar2 = nmcVar;
                    i27 = i27;
                    b(nmcVar2, iM3, i27, iM2, q21Var2.a, str5, z, wu5Var, p21Var, i26);
                    str5 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    nmcVar2.N(i27 + 16);
                    String str15 = "application/ttml+xml";
                    long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i116 = iM2 - 16;
                            byte[] bArr11 = new byte[i116];
                            nmcVar2.k(0, bArr11, i116);
                            gheVarR = c98.r(bArr11);
                            str15 = "application/x-quicktime-tx3g";
                            i24 = i27;
                        } else {
                            if (iM3 == 2004251764) {
                                str15 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j2 = 0;
                            } else if (iM3 == 1664495672) {
                                p21Var.b = 1;
                                str15 = "application/x-mp4-cea-608";
                            } else {
                                if (iM3 != 1836070003) {
                                    c.t();
                                    return null;
                                }
                                int i117 = nmcVar2.b;
                                nmcVar2.O(4);
                                if (nmcVar2.m() == 1702061171) {
                                    byte[] bArr12 = (byte[]) c(i117, nmcVar2).d;
                                    if (bArr12 == null || bArr12.length != 64) {
                                        i24 = i27;
                                    } else {
                                        int i118 = q21Var2.d;
                                        int i119 = q21Var2.e;
                                        lvb.b0(bArr12.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i120 = 0;
                                        while (i120 < bArr12.length - 3) {
                                            byte[] bArr13 = bArr12;
                                            int iD = k4m.d(bArr12[i120], bArr12[i120 + 1], bArr12[i120 + 2], bArr13[i120 + 3]);
                                            int i121 = (iD >> 16) & 255;
                                            int i122 = ((iD >> 8) & 255) - 128;
                                            int i123 = (iD & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(vqi.j(((i123 * 17790) / 10000) + i121, 0, 255) | (vqi.j((i121 - ((i123 * 3455) / 10000)) - ((i122 * 7169) / 10000), 0, 255) << 8) | (vqi.j(((i122 * 14075) / 10000) + i121, 0, 255) << 16))));
                                            i120 += 4;
                                            bArr12 = bArr13;
                                            i27 = i27;
                                        }
                                        i24 = i27;
                                        StringBuilder sbP2 = qv1.p("size: ", i118, "x", i119, "\npalette: ");
                                        ste steVar = new ste(", ", 1);
                                        Iterator it = arrayList.iterator();
                                        StringBuilder sb = new StringBuilder();
                                        steVar.a(sb, it);
                                        sbP2.append(sb.toString());
                                        sbP2.append("\n");
                                        String string2 = sbP2.toString();
                                        String str16 = vqi.a;
                                        gheVarR = c98.r(string2.getBytes(StandardCharsets.UTF_8));
                                        str4 = "application/vobsub";
                                    }
                                } else {
                                    i24 = i27;
                                    str4 = null;
                                    gheVarR = null;
                                }
                                str15 = str4;
                            }
                            i24 = i27;
                            gheVarR = null;
                        }
                        j = j2;
                        if (str15 != null) {
                            a87 a87Var2 = new a87();
                            a87Var2.a = Integer.toString(i25);
                            a87Var2.m = uya.n(str15);
                            a87Var2.d = str5;
                            a87Var2.r = j;
                            a87Var2.p = gheVarR;
                            p21Var.d = new b87(a87Var2);
                        }
                    } else {
                        i24 = i27;
                        gheVarR = null;
                        j = j2;
                        if (str15 != null) {
                            a87 a87Var3 = new a87();
                            a87Var3.a = Integer.toString(i25);
                            a87Var3.m = uya.n(str15);
                            a87Var3.d = str5;
                            a87Var3.r = j;
                            a87Var3.p = gheVarR;
                            p21Var.d = new b87(a87Var3);
                        }
                    }
                    z2 = false;
                    c = '\f';
                    nmcVar2 = nmcVar;
                    i4 = iM2;
                    i = i26;
                    i2 = i25;
                    i3 = iM;
                    i27 = i24;
                } else if (iM3 == 1835365492) {
                    nmcVar2.N(i27 + 16);
                    if (iM3 == 1835365492) {
                        nmcVar2.v();
                        String strV = nmcVar2.v();
                        if (strV != null) {
                            a87 a87Var4 = new a87();
                            a87Var4.a = Integer.toString(i25);
                            a87Var4.m = uya.n(strV);
                            p21Var.d = new b87(a87Var4);
                        }
                    }
                } else if (iM3 == 1667329389) {
                    a87 a87Var5 = new a87();
                    a87Var5.a = Integer.toString(i25);
                    a87Var5.m = uya.n("application/x-camera-motion");
                    p21Var.d = new b87(a87Var5);
                }
                i27 = i27;
                i4 = iM2;
                i = i26;
                i2 = i25;
                i3 = iM;
                z2 = false;
                c = '\f';
            }
            nmcVar2.N(i27 + i4);
            i26 = i + 1;
            q21Var2 = q21Var;
            z4 = z2;
            i25 = i2;
            iM = i3;
        }
        return p21Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[EDGE_INSN: B:106:0x01f7->B:105:0x01f4 BREAK  A[LOOP:18: B:96:0x01d7->B:107:0x0203]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0203 A[LOOP:18: B:96:0x01d7->B:107:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0230  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0303  */
    /* JADX WARN: Code duplicated, block: B:157:0x030d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:218:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:220:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:223:0x04cb A[LOOP:1: B:221:0x04c5->B:223:0x04cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:226:0x04de A[LOOP:2: B:225:0x04dc->B:226:0x04de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:229:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:231:0x0513 A[LOOP:4: B:230:0x0511->B:231:0x0513, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x0556  */
    /* JADX WARN: Code duplicated, block: B:237:0x055a  */
    /* JADX WARN: Code duplicated, block: B:239:0x055e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0562  */
    /* JADX WARN: Code duplicated, block: B:244:0x0573  */
    /* JADX WARN: Code duplicated, block: B:246:0x0576  */
    /* JADX WARN: Code duplicated, block: B:247:0x0579  */
    /* JADX WARN: Code duplicated, block: B:250:0x057f  */
    /* JADX WARN: Code duplicated, block: B:251:0x0582  */
    /* JADX WARN: Code duplicated, block: B:254:0x0588  */
    /* JADX WARN: Code duplicated, block: B:255:0x058b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0591  */
    /* JADX WARN: Code duplicated, block: B:259:0x0594  */
    /* JADX WARN: Code duplicated, block: B:262:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:266:0x05bf A[LOOP:14: B:263:0x05b7->B:266:0x05bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x05dd A[EDGE_INSN: B:271:0x05dd->B:303:0x0694 BREAK  A[LOOP:13: B:261:0x05b3->B:301:0x0675]] */
    /* JADX WARN: Code duplicated, block: B:272:0x05f7 A[EDGE_INSN: B:272:0x05f7->B:303:0x0694 BREAK  A[LOOP:13: B:261:0x05b3->B:301:0x0675]] */
    /* JADX WARN: Code duplicated, block: B:273:0x0601  */
    /* JADX WARN: Code duplicated, block: B:275:0x0605 A[ADDED_TO_REGION, LOOP:15: B:275:0x0605->B:277:0x0609, LOOP_START, PHI: r3 r23 r24
  0x0605: PHI (r3v13 int) = (r3v11 int), (r3v14 int) binds: [B:274:0x0603, B:277:0x0609] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r23v11 int) = (r23v8 int), (r23v13 int) binds: [B:274:0x0603, B:277:0x0609] A[DONT_GENERATE, DONT_INLINE]
  0x0605: PHI (r24v8 int) = (r24v4 int), (r24v9 int) binds: [B:274:0x0603, B:277:0x0609] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x0623  */
    /* JADX WARN: Code duplicated, block: B:283:0x0626  */
    /* JADX WARN: Code duplicated, block: B:285:0x0634  */
    /* JADX WARN: Code duplicated, block: B:286:0x0636  */
    /* JADX WARN: Code duplicated, block: B:289:0x063b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0647  */
    /* JADX WARN: Code duplicated, block: B:295:0x0652  */
    /* JADX WARN: Code duplicated, block: B:296:0x065e  */
    /* JADX WARN: Code duplicated, block: B:305:0x0699 A[DONT_INVERT, LOOP:16: B:305:0x0699->B:309:0x06a3, LOOP_START, PHI: r24
  0x0699: PHI (r24v5 int) = (r24v4 int), (r24v6 int) binds: [B:304:0x0697, B:309:0x06a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x069b  */
    /* JADX WARN: Code duplicated, block: B:309:0x06a3 A[LOOP:16: B:305:0x0699->B:309:0x06a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x06a9 A[EDGE_INSN: B:310:0x06a9->B:311:0x06aa BREAK  A[LOOP:16: B:305:0x0699->B:309:0x06a3]] */
    /* JADX WARN: Code duplicated, block: B:319:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:321:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:322:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:327:0x070e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0750 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:335:0x0752  */
    /* JADX WARN: Code duplicated, block: B:338:0x0764  */
    /* JADX WARN: Code duplicated, block: B:340:0x076a  */
    /* JADX WARN: Code duplicated, block: B:346:0x078b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0792  */
    /* JADX WARN: Code duplicated, block: B:351:0x0798  */
    /* JADX WARN: Code duplicated, block: B:355:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:380:0x086f  */
    /* JADX WARN: Code duplicated, block: B:384:0x087b  */
    /* JADX WARN: Code duplicated, block: B:393:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:394:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:398:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:400:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:403:0x0911  */
    /* JADX WARN: Code duplicated, block: B:405:0x0917  */
    /* JADX WARN: Code duplicated, block: B:406:0x0919  */
    /* JADX WARN: Code duplicated, block: B:413:0x092d  */
    /* JADX WARN: Code duplicated, block: B:419:0x0940  */
    /* JADX WARN: Code duplicated, block: B:424:0x094e  */
    /* JADX WARN: Code duplicated, block: B:429:0x0964  */
    /* JADX WARN: Code duplicated, block: B:430:0x0966  */
    /* JADX WARN: Code duplicated, block: B:432:0x096e  */
    /* JADX WARN: Code duplicated, block: B:436:0x098c  */
    /* JADX WARN: Code duplicated, block: B:437:0x098e  */
    /* JADX WARN: Code duplicated, block: B:440:0x0994  */
    /* JADX WARN: Code duplicated, block: B:441:0x0997  */
    /* JADX WARN: Code duplicated, block: B:443:0x099a  */
    /* JADX WARN: Code duplicated, block: B:444:0x099d  */
    /* JADX WARN: Code duplicated, block: B:446:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:448:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:449:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:451:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:452:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:456:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:458:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:461:0x09da  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a13 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:478:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:498:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0923 A[EDGE_INSN: B:504:0x0923->B:410:0x0923 BREAK  A[LOOP:8: B:401:0x090e->B:409:0x0920], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0920 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x093a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x095b A[ADDED_TO_REGION, EDGE_INSN: B:509:0x095b->B:427:0x095b BREAK  A[LOOP:10: B:422:0x0948->B:426:0x0954], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0a24 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x05d0 A[EDGE_INSN: B:523:0x05d0->B:267:0x05d0 BREAK  A[LOOP:14: B:263:0x05b7->B:266:0x05bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x06a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x06a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    public static ArrayList j(m2b m2bVar, jj7 jj7Var, long j, wu5 wu5Var, boolean z, boolean z2, mf7 mf7Var, boolean z3) throws ParserException {
        int i;
        int i2;
        long j2;
        long jI0;
        long jC;
        ArrayList arrayList;
        int i3;
        q21 q21Var;
        long j3;
        long j4;
        long j5;
        long jI1;
        nmc nmcVar;
        int iE;
        int i4;
        long jC2;
        int i5;
        int i6;
        int i7;
        long j6;
        char[] cArr;
        int i8;
        String str;
        n2b n2bVarH;
        p21 p21VarI;
        long[] jArr;
        long[] jArr2;
        b87 b87Var;
        int i9;
        b87 b87Var2;
        cyh cyhVar;
        l2b l2bVar;
        lwa lwaVar;
        lwa lwaVar2;
        m2b m2bVarG;
        Pair pairCreate;
        char c;
        long jG;
        long j7;
        o21 jrcVar;
        boolean z4;
        int iE2;
        int iE3;
        int iE4;
        int iC;
        nmc nmcVar2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArrCopyOf;
        int[] iArr;
        o21 o21Var;
        long[] jArr3;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        long j8;
        long j9;
        long j10;
        int i13;
        int iM;
        int i14;
        int iE5;
        int iM2;
        int iE6;
        int iE7;
        nmc nmcVar3;
        int i15;
        int i16;
        long[] jArr4;
        int[] iArrCopyOf;
        int[] iArr3;
        int i17;
        int i18;
        long j11;
        boolean z7;
        boolean z8;
        String str2;
        int i19;
        int i20;
        long[] jArr5;
        long j12;
        boolean zA;
        int i21;
        int iA;
        int[] iArr4;
        int i22;
        long[] jArr6;
        int i23;
        int i24;
        int[] iArr5;
        long[] jArr7;
        int[] iArr6;
        long j13;
        int i25;
        long j14;
        b87 b87Var3;
        long[] jArr8;
        long[] jArr9;
        long jI2;
        int[] iArrH;
        long[] jArr10;
        ArrayList arrayList3;
        long j15;
        long[] jArr11;
        int i26;
        boolean z9;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList4;
        int i27;
        int i28;
        int i29;
        boolean z10;
        int[] iArr9;
        long[] jArr12;
        boolean z11;
        boolean z12;
        long[] jArr13;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList5;
        long[] jArr14;
        int i30;
        boolean z13;
        int i31;
        long j16;
        b87 b87Var4;
        lyh lyhVar;
        long j17;
        int i32;
        boolean z14;
        int i33;
        int i34;
        int i35;
        long jI3;
        int[] iArr12;
        int i36;
        long j18;
        int[] iArr13;
        long jI4;
        int iB;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean z15;
        int i42;
        lyh lyhVar2;
        long j19;
        int i43;
        long jI5;
        long jI6;
        int i44;
        long[] jArr15;
        int[] iArr14;
        long j20;
        int i45;
        int i46;
        int iG;
        long[] jArr16;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        long j21;
        int iMax;
        int i52;
        int i53;
        m2b m2bVar2 = m2bVar;
        ArrayList arrayList6 = new ArrayList();
        int i54 = 0;
        for (ArrayList arrayList7 = m2bVar2.e; i54 < arrayList7.size(); arrayList7 = arrayList) {
            m2b m2bVar3 = (m2b) arrayList7.get(i54);
            if (m2bVar3.b != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList6;
                i2 = i54;
            } else {
                n2b n2bVarH2 = m2bVar2.h(1836476516);
                n2bVarH2.getClass();
                m2b m2bVarG2 = m2bVar3.g(1835297121);
                m2bVarG2.getClass();
                n2b n2bVarH3 = m2bVarG2.h(1751411826);
                n2bVarH3.getClass();
                nmc nmcVar4 = n2bVarH3.c;
                nmcVar4.N(16);
                int iM3 = nmcVar4.m();
                if (iM3 == 1936684398) {
                    i = 1;
                } else if (iM3 == 1986618469) {
                    i = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i = 3;
                } else {
                    i = iM3 == 1835365473 ? 5 : -1;
                }
                int i55 = 1;
                i2 = i54;
                if (i == -1) {
                    arrayList = arrayList7;
                    cyhVar = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    n2b n2bVarH4 = m2bVar3.h(1953196132);
                    n2bVarH4.getClass();
                    nmc nmcVar5 = n2bVarH4.c;
                    nmcVar5.N(8);
                    int iE8 = e(nmcVar5.m());
                    nmcVar5.O(iE8 != 0 ? 16 : 8);
                    int iM4 = nmcVar5.m();
                    nmcVar5.O(4);
                    int i56 = nmcVar5.b;
                    int i57 = iE8 == 0 ? 4 : 8;
                    int i58 = 0;
                    while (true) {
                        jI0 = -9223372036854775807L;
                        if (i58 >= i57) {
                            nmcVar5.O(i57);
                        } else {
                            if (nmcVar5.a[i56 + i58] != -1) {
                                jC = iE8 == 0 ? nmcVar5.C() : nmcVar5.G();
                                if (jC != 0) {
                                    break;
                                }
                                break;
                            }
                            i58++;
                        }
                        jC = -9223372036854775807L;
                        break;
                    }
                    nmcVar5.O(10);
                    int iH = nmcVar5.H();
                    nmcVar5.O(4);
                    int iM5 = nmcVar5.m();
                    int iM6 = nmcVar5.m();
                    nmcVar5.O(4);
                    int iM7 = nmcVar5.m();
                    int iM8 = nmcVar5.m();
                    if (iM5 == 0 && iM6 == 65536) {
                        arrayList = arrayList7;
                        if ((iM7 == -65536 || iM7 == 65536) && iM8 == 0) {
                            i3 = 90;
                        }
                        nmcVar5.O(16);
                        short sX = nmcVar5.x();
                        nmcVar5.O(2);
                        short sX2 = nmcVar5.x();
                        q21Var = new q21();
                        q21Var.a = iM4;
                        q21Var.b = iH;
                        q21Var.c = i3;
                        q21Var.d = sX;
                        q21Var.e = sX2;
                        if (j == -9223372036854775807L) {
                            j3 = jC;
                        } else {
                            j3 = j;
                        }
                        j4 = g(n2bVarH2.c).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jI1 = -9223372036854775807L;
                        } else {
                            String str3 = vqi.a;
                            j5 = j4;
                            jI1 = vqi.i0(j3, 1000000L, j5, RoundingMode.DOWN);
                        }
                        m2b m2bVarG3 = m2bVarG2.g(1835626086);
                        m2bVarG3.getClass();
                        m2b m2bVarG4 = m2bVarG3.g(1937007212);
                        m2bVarG4.getClass();
                        n2b n2bVarH5 = m2bVarG2.h(1835296868);
                        n2bVarH5.getClass();
                        nmcVar = n2bVarH5.c;
                        nmcVar.N(8);
                        iE = e(nmcVar.m());
                        if (iE == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        nmcVar.O(i4);
                        jC2 = nmcVar.C();
                        i5 = nmcVar.b;
                        if (iE == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                nmcVar.O(i6);
                                break;
                            }
                            if (nmcVar.a[i5 + i7] != -1) {
                                if (iE == 0) {
                                    jG = nmcVar.C();
                                } else {
                                    jG = nmcVar.G();
                                }
                                j7 = jG;
                                if (j7 != 0) {
                                    break;
                                }
                                String str4 = vqi.a;
                                jI0 = vqi.i0(j7, 1000000L, jC2, RoundingMode.DOWN);
                                break;
                            }
                            i7++;
                        }
                        j6 = jI0;
                        int iH2 = nmcVar.H();
                        cArr = new char[]{(char) (((iH2 >> 10) & 31) + 96), (char) (((iH2 >> 5) & 31) + 96), (char) ((iH2 & 31) + 96)};
                        i8 = 0;
                        while (true) {
                            if (i8 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i8];
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i8++;
                        }
                        n2bVarH = m2bVarG4.h(1937011556);
                        if (n2bVarH == null) {
                            lvb.G0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            p21VarI = i(n2bVarH.c, q21Var, str, wu5Var, z2);
                            if (!z || (m2bVarG = m2bVar3.g(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                n2b n2bVarH6 = m2bVarG.h(1701606260);
                                if (n2bVarH6 == null) {
                                    pairCreate = null;
                                } else {
                                    nmc nmcVar6 = n2bVarH6.c;
                                    nmcVar6.N(8);
                                    int iE9 = e(nmcVar6.m());
                                    int iE10 = nmcVar6.E();
                                    long[] jArr17 = new long[iE10];
                                    long[] jArr18 = new long[iE10];
                                    int i59 = 0;
                                    while (i59 < iE10) {
                                        int i60 = i55;
                                        jArr17[i59] = iE9 == i60 ? nmcVar6.G() : nmcVar6.C();
                                        jArr18[i59] = iE9 == i60 ? nmcVar6.u() : nmcVar6.m();
                                        if (nmcVar6.x() != 1) {
                                            ore.p("Unsupported media rate.");
                                            return null;
                                        }
                                        nmcVar6.O(2);
                                        i59++;
                                        i55 = 1;
                                    }
                                    pairCreate = Pair.create(jArr17, jArr18);
                                }
                                if (pairCreate != null) {
                                    long[] jArr19 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr19;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            b87Var = (b87) p21VarI.d;
                            if (b87Var == null) {
                                i9 = q21Var.b;
                                if (i9 != 0) {
                                    l2bVar = new l2b(i9);
                                    a87 a87VarA = b87Var.a();
                                    lwaVar = ((b87) p21VarI.d).l;
                                    if (lwaVar != null) {
                                        lwaVar2 = lwaVar.a(l2bVar);
                                    } else {
                                        lwaVar2 = new lwa(l2bVar);
                                    }
                                    a87VarA.k = lwaVar2;
                                    b87Var2 = new b87(a87VarA);
                                } else {
                                    b87Var2 = b87Var;
                                }
                                cyhVar = new cyh(q21Var.a, i, jC2, j5, jI1, j6, b87Var2, p21VarI.b, (fyh[]) p21VarI.c, p21VarI.a, jArr, jArr2);
                            }
                        }
                        cyhVar = null;
                    } else {
                        arrayList = arrayList7;
                    }
                    i3 = (iM5 == 0 && iM6 == -65536 && (iM7 == 65536 || iM7 == -65536) && iM8 == 0) ? 270 : ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) ? 180 : 0;
                    nmcVar5.O(16);
                    short sX3 = nmcVar5.x();
                    nmcVar5.O(2);
                    short sX4 = nmcVar5.x();
                    q21Var = new q21();
                    q21Var.a = iM4;
                    q21Var.b = iH;
                    q21Var.c = i3;
                    q21Var.d = sX3;
                    q21Var.e = sX4;
                    if (j == -9223372036854775807L) {
                        j3 = jC;
                    } else {
                        j3 = j;
                    }
                    j4 = g(n2bVarH2.c).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jI1 = -9223372036854775807L;
                    } else {
                        String str5 = vqi.a;
                        j5 = j4;
                        jI1 = vqi.i0(j3, 1000000L, j5, RoundingMode.DOWN);
                    }
                    m2b m2bVarG5 = m2bVarG2.g(1835626086);
                    m2bVarG5.getClass();
                    m2b m2bVarG6 = m2bVarG5.g(1937007212);
                    m2bVarG6.getClass();
                    n2b n2bVarH7 = m2bVarG2.h(1835296868);
                    n2bVarH7.getClass();
                    nmcVar = n2bVarH7.c;
                    nmcVar.N(8);
                    iE = e(nmcVar.m());
                    if (iE == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    nmcVar.O(i4);
                    jC2 = nmcVar.C();
                    i5 = nmcVar.b;
                    if (iE == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            nmcVar.O(i6);
                            break;
                        }
                        if (nmcVar.a[i5 + i7] != -1) {
                            if (iE == 0) {
                                jG = nmcVar.C();
                            } else {
                                jG = nmcVar.G();
                            }
                            j7 = jG;
                            if (j7 != 0) {
                                break;
                            }
                            String str6 = vqi.a;
                            jI0 = vqi.i0(j7, 1000000L, jC2, RoundingMode.DOWN);
                            break;
                        }
                        i7++;
                    }
                    j6 = jI0;
                    int iH3 = nmcVar.H();
                    cArr = new char[]{(char) (((iH3 >> 10) & 31) + 96), (char) (((iH3 >> 5) & 31) + 96), (char) ((iH3 & 31) + 96)};
                    i8 = 0;
                    while (true) {
                        if (i8 < 3) {
                            c = cArr[i8];
                            if (c >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i8++;
                    }
                    n2bVarH = m2bVarG6.h(1937011556);
                    if (n2bVarH == null) {
                        lvb.G0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        p21VarI = i(n2bVarH.c, q21Var, str, wu5Var, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        b87Var = (b87) p21VarI.d;
                        if (b87Var == null) {
                            i9 = q21Var.b;
                            if (i9 != 0) {
                                l2bVar = new l2b(i9);
                                a87 a87VarA2 = b87Var.a();
                                lwaVar = ((b87) p21VarI.d).l;
                                if (lwaVar != null) {
                                    lwaVar2 = lwaVar.a(l2bVar);
                                } else {
                                    lwaVar2 = new lwa(l2bVar);
                                }
                                a87VarA2.k = lwaVar2;
                                b87Var2 = new b87(a87VarA2);
                            } else {
                                b87Var2 = b87Var;
                            }
                            cyhVar = new cyh(q21Var.a, i, jC2, j5, jI1, j6, b87Var2, p21VarI.b, (fyh[]) p21VarI.c, p21VarI.a, jArr, jArr2);
                        }
                    }
                    cyhVar = null;
                }
                cyh cyhVarA = (cyh) mf7Var.mo41apply(cyhVar);
                if (cyhVarA == null) {
                    arrayList6 = arrayList6;
                } else {
                    b87 b87Var5 = cyhVarA.g;
                    m2b m2bVarG7 = m2bVar3.g(1835297121);
                    m2bVarG7.getClass();
                    m2b m2bVarG8 = m2bVarG7.g(1835626086);
                    m2bVarG8.getClass();
                    m2b m2bVarG9 = m2bVarG8.g(1937007212);
                    m2bVarG9.getClass();
                    n2b n2bVarH8 = m2bVarG9.h(1937011578);
                    if (n2bVarH8 != null) {
                        jrcVar = new jrc(n2bVarH8, b87Var5);
                    } else {
                        n2b n2bVarH9 = m2bVarG9.h(1937013298);
                        if (n2bVarH9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        c70 c70Var = new c70();
                        nmc nmcVar7 = n2bVarH9.c;
                        c70Var.e = nmcVar7;
                        nmcVar7.N(12);
                        c70Var.b = nmcVar7.E() & 255;
                        c70Var.a = nmcVar7.E();
                        jrcVar = c70Var;
                    }
                    int iD = jrcVar.d();
                    if (iD == 0) {
                        lyhVar = new lyh(cyhVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (cyhVarA.b == 2) {
                            long j22 = cyhVarA.f;
                            if (j22 > j2) {
                                a87 a87VarA3 = b87Var5.a();
                                a87VarA3.x = iD / (j22 / 1000000.0f);
                                cyhVarA = cyhVarA.a(new b87(a87VarA3));
                            }
                        }
                        b87 b87Var6 = cyhVarA.g;
                        n2b n2bVarH10 = m2bVarG9.h(1937007471);
                        if (n2bVarH10 == null) {
                            n2bVarH10 = m2bVarG9.h(1668232756);
                            n2bVarH10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        nmc nmcVar8 = n2bVarH10.c;
                        n2b n2bVarH11 = m2bVarG9.h(1937011555);
                        n2bVarH11.getClass();
                        nmc nmcVar9 = n2bVarH11.c;
                        n2b n2bVarH12 = m2bVarG9.h(1937011827);
                        n2bVarH12.getClass();
                        nmc nmcVar10 = n2bVarH12.c;
                        n2b n2bVarH13 = m2bVarG9.h(1937011571);
                        nmc nmcVar11 = n2bVarH13 != null ? n2bVarH13.c : null;
                        n2b n2bVarH14 = m2bVarG9.h(1668576371);
                        nmc nmcVar12 = n2bVarH14 != null ? n2bVarH14.c : null;
                        m21 m21Var = new m21(nmcVar9, nmcVar8, z4);
                        nmcVar10.N(12);
                        int iE11 = nmcVar10.E() - 1;
                        int iE12 = nmcVar10.E();
                        int iE13 = nmcVar10.E();
                        if (nmcVar12 != null) {
                            nmcVar12.N(12);
                            iE2 = nmcVar12.E();
                        } else {
                            iE2 = 0;
                        }
                        if (nmcVar11 != null) {
                            nmcVar11.N(12);
                            iE3 = nmcVar11.E();
                            if (iE3 > 0) {
                                iE4 = nmcVar11.E() - 1;
                            } else {
                                nmcVar11 = null;
                            }
                            iC = jrcVar.c();
                            nmcVar2 = nmcVar12;
                            String str7 = b87Var6.n;
                            if (iC == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iE11 == 0 && iE2 == 0 && iE3 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (nmcVar11 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i44 = m21Var.a;
                                jArr15 = new long[i44];
                                iArr14 = new int[i44];
                                while (m21Var.a()) {
                                    int i61 = m21Var.b;
                                    jArr15[i61] = m21Var.d;
                                    iArr14[i61] = m21Var.c;
                                }
                                j20 = iE13;
                                i45 = 8192 / iC;
                                iG = 0;
                                for (i46 = 0; i46 < i44; i46++) {
                                    iG += vqi.g(iArr14[i46], i45);
                                }
                                jArr16 = new long[iG];
                                iArr3 = new int[iG];
                                jArr4 = new long[iG];
                                iArrCopyOf = new int[iG];
                                i47 = 0;
                                i48 = 0;
                                i49 = 0;
                                i50 = 0;
                                i51 = 0;
                                while (i47 < i44) {
                                    int i62 = iArr14[i47];
                                    j21 = jArr15[i47];
                                    int i63 = i51;
                                    int i64 = i47;
                                    iMax = i50;
                                    i52 = i63;
                                    int i65 = i44;
                                    i53 = i62;
                                    while (i53 > 0) {
                                        int iMin = Math.min(i45, i53);
                                        jArr16[i52] = j21;
                                        int i66 = i53;
                                        int i67 = iC * iMin;
                                        iArr3[i52] = i67;
                                        iMax = Math.max(iMax, i67);
                                        long j23 = j20;
                                        jArr4[i52] = j23 * ((long) i48);
                                        iArrCopyOf[i52] = 1;
                                        j21 += (long) iArr3[i52];
                                        i48 += iMin;
                                        i52++;
                                        i49 += i67;
                                        i53 = i66 - iMin;
                                        j20 = j23;
                                    }
                                    int i68 = i64 + 1;
                                    i51 = i52;
                                    i50 = iMax;
                                    i47 = i68;
                                    i44 = i65;
                                }
                                j11 = ((long) i48) * j20;
                                j12 = i49;
                                if (z3) {
                                    jArr16 = new long[0];
                                }
                                if (z3) {
                                    iArr3 = new int[0];
                                }
                                if (z3) {
                                    jArr4 = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                }
                                jArr5 = jArr16;
                                i19 = iG;
                                i20 = i50;
                            } else {
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                } else {
                                    jArrCopyOf = new long[iD];
                                }
                                int i69 = iE3;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iD];
                                }
                                o21Var = jrcVar;
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iD];
                                }
                                if (z3) {
                                    iArr2 = new int[0];
                                } else {
                                    iArr2 = new int[iD];
                                }
                                i10 = iE2;
                                i11 = i69;
                                i12 = iE11;
                                j8 = j2;
                                j9 = j8;
                                j10 = j9;
                                i13 = 0;
                                iM = 0;
                                i14 = 0;
                                iE5 = 0;
                                iM2 = iE13;
                                iE6 = iE12;
                                iE7 = iE4;
                                nmcVar3 = nmcVar11;
                                i15 = 0;
                                while (true) {
                                    if (i15 < iD) {
                                        i16 = i11;
                                        jArr4 = jArr3;
                                        iArrCopyOf = iArr2;
                                        iArr3 = iArr;
                                        i17 = iM;
                                        i18 = i14;
                                        break;
                                    }
                                    zA = true;
                                    while (i14 == 0) {
                                        zA = m21Var.a();
                                        if (zA) {
                                            break;
                                        }
                                        j10 = m21Var.d;
                                        i14 = m21Var.c;
                                        i11 = i11;
                                        iM = iM;
                                    }
                                    i21 = iM;
                                    i16 = i11;
                                    if (!zA) {
                                        lvb.G0("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i15);
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i15);
                                            iArr3 = iArrCopyOf2;
                                            iArrCopyOf = Arrays.copyOf(iArr2, i15);
                                            iD = i15;
                                            i18 = i14;
                                            jArr4 = jArrCopyOf2;
                                            i17 = i21;
                                            break;
                                        }
                                        iArr3 = iArr;
                                        iArrCopyOf = iArr2;
                                        iD = i15;
                                        i18 = i14;
                                        i17 = i21;
                                        jArr4 = jArr3;
                                        break;
                                    }
                                    iM = i21;
                                    if (nmcVar2 != null) {
                                        while (iE5 == 0 && i10 > 0) {
                                            iE5 = nmcVar2.E();
                                            iM = nmcVar2.m();
                                            i10--;
                                        }
                                        iE5--;
                                    }
                                    iA = o21Var.a();
                                    int i70 = iD;
                                    iArr4 = iArr;
                                    long j24 = iA;
                                    j9 += j24;
                                    if (iA > i13) {
                                        i13 = iA;
                                    }
                                    if (z3) {
                                        i22 = i13;
                                        jArr6 = jArrCopyOf;
                                    } else {
                                        jArrCopyOf[i15] = j10;
                                        iArr4[i15] = iA;
                                        i22 = i13;
                                        jArr6 = jArrCopyOf;
                                        jArr3[i15] = j8 + ((long) iM);
                                        if (nmcVar3 == null) {
                                            i24 = 1;
                                        } else {
                                            i24 = 0;
                                        }
                                        iArr2[i15] = i24;
                                        if (i15 == iE7) {
                                            iArr2[i15] = 1;
                                            arrayList2.add(Integer.valueOf(i15));
                                        }
                                    }
                                    if (nmcVar3 != null && i15 == iE7) {
                                        i23 = i16 - 1;
                                        if (i23 > 0) {
                                            i16 = i23;
                                            iE7 = nmcVar3.E() - 1;
                                        } else {
                                            i16 = i23;
                                        }
                                    }
                                    j8 += (long) iM2;
                                    iE6--;
                                    if (iE6 != 0 && i12 > 0) {
                                        i12--;
                                        iE6 = nmcVar10.E();
                                        iM2 = nmcVar10.m();
                                    }
                                    j10 += j24;
                                    i14--;
                                    i15++;
                                    jArrCopyOf = jArr6;
                                    iD = i70;
                                    i11 = i16;
                                    i13 = i22;
                                    iArr = iArr4;
                                }
                                j11 = j8 + ((long) i17);
                                if (nmcVar2 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i10 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (nmcVar2.E() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    nmcVar2.m();
                                    i10--;
                                }
                                if (i16 == 0 || iE6 != 0 || i18 != 0 || i12 != 0 || iE5 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    z8 = z7;
                                    qt4.x(cyhVarA.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                    qt4.x(iE6, i18, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                    sb.append(i12);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iE5);
                                    if (z8) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    lvb.G0("BoxParsers", sb.toString());
                                }
                                i19 = iD;
                                i20 = i13;
                                jArr5 = jArrCopyOf;
                                j12 = j9;
                            }
                            iArr5 = iArr3;
                            jArr7 = jArr4;
                            iArr6 = iArrCopyOf;
                            j13 = cyhVarA.f;
                            if (j13 > j2) {
                                jI6 = vqi.i0(j12 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                                if (jI6 > j2 && jI6 < 2147483647L) {
                                    a87 a87VarA4 = b87Var6.a();
                                    a87VarA4.h = (int) jI6;
                                    cyhVarA = cyhVarA.a(new b87(a87VarA4));
                                }
                            }
                            i25 = cyhVarA.b;
                            j14 = cyhVarA.c;
                            b87Var3 = cyhVarA.g;
                            jArr8 = cyhVarA.j;
                            jArr9 = cyhVarA.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jI2 = vqi.i0(j11, 1000000L, j14, roundingMode);
                            iArrH = k4m.h(arrayList2);
                            if (jArr9 == null) {
                                if (!z3) {
                                    vqi.h0(j14, jArr7);
                                }
                                lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, jI2, i19);
                            } else if (z3) {
                                jArr8.getClass();
                                if (jArr9.length == 1 || jArr9[0] != j2) {
                                    j19 = j2;
                                    for (i43 = 0; i43 < jArr9.length; i43++) {
                                        if (jArr8[i43] != -1) {
                                            j19 += jArr9[i43];
                                        }
                                    }
                                    jI5 = vqi.i0(j19, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                                } else {
                                    jI5 = vqi.i0(j11 - jArr8[0], 1000000L, cyhVarA.c, roundingMode);
                                }
                                lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, jI5, i19);
                            } else {
                                jArr10 = jArr8;
                                if (jArr9.length == 1 || i25 != 1 || jArr7.length < 2) {
                                    arrayList3 = arrayList2;
                                    j15 = -1;
                                } else {
                                    jArr10.getClass();
                                    long j25 = jArr10[0];
                                    j15 = -1;
                                    arrayList3 = arrayList2;
                                    long jI7 = j25 + vqi.i0(jArr9[0], cyhVarA.c, cyhVarA.d, roundingMode);
                                    int length = jArr7.length - 1;
                                    int iJ = vqi.j(4, 0, length);
                                    int iJ2 = vqi.j(jArr7.length - 4, 0, length);
                                    if (jArr7[0] <= j25 && j25 < jArr7[iJ] && jArr7[iJ2] < jI7 && jI7 <= 2 + j11) {
                                        long jMax = Math.max(j2, j11 - jI7);
                                        long jI8 = vqi.i0(j25 - jArr7[0], b87Var3.G, cyhVarA.c, roundingMode);
                                        j11 = j11;
                                        long jI9 = vqi.i0(jMax, b87Var3.G, cyhVarA.c, roundingMode);
                                        if (!(jI8 == j2 && jI9 == j2) && jI8 <= 2147483647L && jI9 <= 2147483647L) {
                                            jj7Var.a = (int) jI8;
                                            jj7Var.b = (int) jI9;
                                            vqi.h0(j14, jArr7);
                                            lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, vqi.i0(jArr9[0], 1000000L, cyhVarA.d, roundingMode), i19);
                                        } else {
                                            if (jArr9.length == 1 || jArr9[0] != 0) {
                                                jArr11 = jArr5;
                                                i26 = i19;
                                                if (i25 == 1) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                iArr7 = new int[jArr9.length];
                                                iArr8 = new int[jArr9.length];
                                                jArr10.getClass();
                                                arrayList4 = arrayList3;
                                                i27 = 0;
                                                i28 = 0;
                                                i29 = 0;
                                                z10 = false;
                                                while (i29 < jArr9.length) {
                                                    iArr12 = iArr8;
                                                    i36 = i29;
                                                    j18 = jArr10[i36];
                                                    if (j18 != j15) {
                                                        boolean z16 = z10;
                                                        jI4 = vqi.i0(jArr9[i36], cyhVarA.c, cyhVarA.d, RoundingMode.DOWN) + j18;
                                                        iArr13 = iArr12;
                                                        iArr7[i36] = vqi.f(jArr7, j18, true);
                                                        iB = vqi.b(jArr7, jI4, z9) - 1;
                                                        i38 = 0;
                                                        for (i37 = r5; i37 < jArr7.length; i37++) {
                                                            if (jArr7[i37] < jI4) {
                                                                i38++;
                                                                if (i38 > b87Var3.p) {
                                                                    break;
                                                                }
                                                            } else {
                                                                iB = i37;
                                                            }
                                                        }
                                                        iArr13[i36] = iB + 1;
                                                        i39 = iArr7[i36];
                                                        while (true) {
                                                            i40 = iArr7[i36];
                                                            if (i40 > 0 || (iArr6[i40] & 1) != 0) {
                                                                break;
                                                                break;
                                                            }
                                                            iArr7[i36] = i40 - 1;
                                                        }
                                                        if (i40 == 0 && (iArr6[0] & 1) == 0) {
                                                            iArr7[i36] = i39;
                                                            while (true) {
                                                                i42 = iArr7[i36];
                                                                if (i42 >= iArr13[i36] || (iArr6[i42] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr7[i36] = i42 + 1;
                                                            }
                                                        }
                                                        int i71 = iArr13[i36];
                                                        i41 = iArr7[i36];
                                                        int i72 = (i71 - i41) + i27;
                                                        if (i28 != i41) {
                                                            z15 = true;
                                                        } else {
                                                            z15 = false;
                                                        }
                                                        z10 = z16 | z15;
                                                        i28 = i71;
                                                        i27 = i72;
                                                    } else {
                                                        iArr13 = iArr12;
                                                    }
                                                    i29 = i36 + 1;
                                                    jArr10 = jArr10;
                                                    iArr8 = iArr13;
                                                    z9 = z9;
                                                }
                                                iArr9 = iArr8;
                                                jArr12 = jArr10;
                                                boolean z17 = z10;
                                                if (i27 != i26) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                z12 = z17 | z11;
                                                if (z12) {
                                                    jArr13 = new long[i27];
                                                } else {
                                                    jArr13 = jArr11;
                                                }
                                                if (z12) {
                                                    iArr10 = new int[i27];
                                                } else {
                                                    iArr10 = iArr5;
                                                }
                                                if (z12) {
                                                    i20 = 0;
                                                }
                                                if (z12) {
                                                    iArr11 = new int[i27];
                                                } else {
                                                    iArr11 = iArr6;
                                                }
                                                if (z12) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList4;
                                                }
                                                jArr14 = new long[i27];
                                                i30 = 0;
                                                z13 = false;
                                                i31 = 0;
                                                j16 = 0;
                                                while (i30 < jArr9.length) {
                                                    j17 = jArr12[i30];
                                                    i32 = iArr7[i30];
                                                    z14 = z12;
                                                    i33 = iArr9[i30];
                                                    b87 b87Var7 = b87Var3;
                                                    if (z14) {
                                                        int i73 = i33 - i32;
                                                        System.arraycopy(jArr11, i32, jArr13, i31, i73);
                                                        System.arraycopy(iArr5, i32, iArr10, i31, i73);
                                                        System.arraycopy(iArr6, i32, iArr11, i31, i73);
                                                    }
                                                    i34 = i20;
                                                    while (i32 < i33) {
                                                        i35 = i32;
                                                        int i74 = i33;
                                                        long j26 = cyhVarA.d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long jI10 = vqi.i0(j16, 1000000L, j26, roundingMode2);
                                                        jI3 = vqi.i0(jArr7[i35] - j17, 1000000L, cyhVarA.c, roundingMode2);
                                                        if (jI3 < 0) {
                                                            z13 = true;
                                                        }
                                                        jArr14[i31] = jI10 + jI3;
                                                        if (z14 && iArr10[i31] > i34) {
                                                            i34 = iArr5[i35];
                                                        }
                                                        if (!z14 && !z6 && (iArr11[i31] & 1) != 0) {
                                                            arrayList5.add(Integer.valueOf(i31));
                                                        }
                                                        i31++;
                                                        i32 = i35 + 1;
                                                        i33 = i74;
                                                    }
                                                    j16 += jArr9[i30];
                                                    i30++;
                                                    i20 = i34;
                                                    z12 = z14;
                                                    b87Var3 = b87Var7;
                                                }
                                                b87Var4 = b87Var3;
                                                long jI11 = vqi.i0(j16, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                                                if (z13) {
                                                    a87 a87VarA5 = b87Var4.a();
                                                    a87VarA5.s = true;
                                                    cyhVarA = cyhVarA.a(new b87(a87VarA5));
                                                }
                                                lyhVar = new lyh(cyhVarA, jArr13, iArr10, i20, jArr14, iArr11, k4m.h(arrayList5), z6, jI11, jArr13.length);
                                                arrayList6 = arrayList6;
                                            } else {
                                                jArr10.getClass();
                                                long j27 = jArr10[0];
                                                for (int i75 = 0; i75 < jArr7.length; i75++) {
                                                    jArr7[i75] = vqi.i0(jArr7[i75] - j27, 1000000L, cyhVarA.c, RoundingMode.DOWN);
                                                }
                                                lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, vqi.i0(j11 - j27, 1000000L, cyhVarA.c, RoundingMode.DOWN), i19);
                                            }
                                            arrayList6.add(lyhVar);
                                        }
                                    }
                                }
                                if (jArr9.length == 1) {
                                }
                                jArr11 = jArr5;
                                i26 = i19;
                                if (i25 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr7 = new int[jArr9.length];
                                iArr8 = new int[jArr9.length];
                                jArr10.getClass();
                                arrayList4 = arrayList3;
                                i27 = 0;
                                i28 = 0;
                                i29 = 0;
                                z10 = false;
                                while (i29 < jArr9.length) {
                                    iArr12 = iArr8;
                                    i36 = i29;
                                    j18 = jArr10[i36];
                                    if (j18 != j15) {
                                        boolean z18 = z10;
                                        jI4 = vqi.i0(jArr9[i36], cyhVarA.c, cyhVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i36] = vqi.f(jArr7, j18, true);
                                        iB = vqi.b(jArr7, jI4, z9) - 1;
                                        i38 = 0;
                                        while (i37 < jArr7.length) {
                                            if (jArr7[i37] < jI4) {
                                                i38++;
                                                if (i38 > b87Var3.p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i37;
                                            }
                                        }
                                        iArr13[i36] = iB + 1;
                                        i39 = iArr7[i36];
                                        while (true) {
                                            i40 = iArr7[i36];
                                            if (i40 > 0) {
                                                break;
                                            }
                                            iArr7[i36] = i40 - 1;
                                        }
                                        if (i40 == 0) {
                                            iArr7[i36] = i39;
                                            while (true) {
                                                i42 = iArr7[i36];
                                                if (i42 >= iArr13[i36]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i36] = i42 + 1;
                                            }
                                        }
                                        int i76 = iArr13[i36];
                                        i41 = iArr7[i36];
                                        int i77 = (i76 - i41) + i27;
                                        if (i28 != i41) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        z10 = z18 | z15;
                                        i28 = i76;
                                        i27 = i77;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i29 = i36 + 1;
                                    jArr10 = jArr10;
                                    iArr8 = iArr13;
                                    z9 = z9;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr10;
                                boolean z19 = z10;
                                if (i27 != i26) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z19 | z11;
                                if (z12) {
                                    jArr13 = new long[i27];
                                } else {
                                    jArr13 = jArr11;
                                }
                                if (z12) {
                                    iArr10 = new int[i27];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z12) {
                                    i20 = 0;
                                }
                                if (z12) {
                                    iArr11 = new int[i27];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z12) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i27];
                                i30 = 0;
                                z13 = false;
                                i31 = 0;
                                j16 = 0;
                                while (i30 < jArr9.length) {
                                    j17 = jArr12[i30];
                                    i32 = iArr7[i30];
                                    z14 = z12;
                                    i33 = iArr9[i30];
                                    b87 b87Var8 = b87Var3;
                                    if (z14) {
                                        int i78 = i33 - i32;
                                        System.arraycopy(jArr11, i32, jArr13, i31, i78);
                                        System.arraycopy(iArr5, i32, iArr10, i31, i78);
                                        System.arraycopy(iArr6, i32, iArr11, i31, i78);
                                    }
                                    i34 = i20;
                                    while (i32 < i33) {
                                        i35 = i32;
                                        int i79 = i33;
                                        long j28 = cyhVarA.d;
                                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                                        long jI12 = vqi.i0(j16, 1000000L, j28, roundingMode3);
                                        jI3 = vqi.i0(jArr7[i35] - j17, 1000000L, cyhVarA.c, roundingMode3);
                                        if (jI3 < 0) {
                                            z13 = true;
                                        }
                                        jArr14[i31] = jI12 + jI3;
                                        if (z14) {
                                            i34 = iArr5[i35];
                                        }
                                        if (!z14) {
                                        }
                                        i31++;
                                        i32 = i35 + 1;
                                        i33 = i79;
                                    }
                                    j16 += jArr9[i30];
                                    i30++;
                                    i20 = i34;
                                    z12 = z14;
                                    b87Var3 = b87Var8;
                                }
                                b87Var4 = b87Var3;
                                long jI13 = vqi.i0(j16, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                                if (z13) {
                                    a87 a87VarA6 = b87Var4.a();
                                    a87VarA6.s = true;
                                    cyhVarA = cyhVarA.a(new b87(a87VarA6));
                                }
                                lyhVar = new lyh(cyhVarA, jArr13, iArr10, i20, jArr14, iArr11, k4m.h(arrayList5), z6, jI13, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(lyhVar);
                            }
                            lyhVar = lyhVar2;
                        } else {
                            iE3 = 0;
                        }
                        iE4 = -1;
                        iC = jrcVar.c();
                        nmcVar2 = nmcVar12;
                        String str8 = b87Var6.n;
                        if (iC == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (nmcVar11 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i44 = m21Var.a;
                            jArr15 = new long[i44];
                            iArr14 = new int[i44];
                            while (m21Var.a()) {
                                int i610 = m21Var.b;
                                jArr15[i610] = m21Var.d;
                                iArr14[i610] = m21Var.c;
                            }
                            j20 = iE13;
                            i45 = 8192 / iC;
                            iG = 0;
                            while (i46 < i44) {
                                iG += vqi.g(iArr14[i46], i45);
                            }
                            jArr16 = new long[iG];
                            iArr3 = new int[iG];
                            jArr4 = new long[iG];
                            iArrCopyOf = new int[iG];
                            i47 = 0;
                            i48 = 0;
                            i49 = 0;
                            i50 = 0;
                            i51 = 0;
                            while (i47 < i44) {
                                int i611 = iArr14[i47];
                                j21 = jArr15[i47];
                                int i612 = i51;
                                int i613 = i47;
                                iMax = i50;
                                i52 = i612;
                                int i614 = i44;
                                i53 = i611;
                                while (i53 > 0) {
                                    int iMin2 = Math.min(i45, i53);
                                    jArr16[i52] = j21;
                                    int i615 = i53;
                                    int i616 = iC * iMin2;
                                    iArr3[i52] = i616;
                                    iMax = Math.max(iMax, i616);
                                    long j29 = j20;
                                    jArr4[i52] = j29 * ((long) i48);
                                    iArrCopyOf[i52] = 1;
                                    j21 += (long) iArr3[i52];
                                    i48 += iMin2;
                                    i52++;
                                    i49 += i616;
                                    i53 = i615 - iMin2;
                                    j20 = j29;
                                }
                                int i617 = i613 + 1;
                                i51 = i52;
                                i50 = iMax;
                                i47 = i617;
                                i44 = i614;
                            }
                            j11 = ((long) i48) * j20;
                            j12 = i49;
                            if (z3) {
                                jArr16 = new long[0];
                            }
                            if (z3) {
                                iArr3 = new int[0];
                            }
                            if (z3) {
                                jArr4 = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf = new int[0];
                            }
                            jArr5 = jArr16;
                            i19 = iG;
                            i20 = i50;
                        } else {
                            if (z3) {
                                jArrCopyOf = new long[0];
                            } else {
                                jArrCopyOf = new long[iD];
                            }
                            int i618 = iE3;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iD];
                            }
                            o21Var = jrcVar;
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iD];
                            }
                            if (z3) {
                                iArr2 = new int[0];
                            } else {
                                iArr2 = new int[iD];
                            }
                            i10 = iE2;
                            i11 = i618;
                            i12 = iE11;
                            j8 = j2;
                            j9 = j8;
                            j10 = j9;
                            i13 = 0;
                            iM = 0;
                            i14 = 0;
                            iE5 = 0;
                            iM2 = iE13;
                            iE6 = iE12;
                            iE7 = iE4;
                            nmcVar3 = nmcVar11;
                            i15 = 0;
                            while (true) {
                                if (i15 < iD) {
                                    i16 = i11;
                                    jArr4 = jArr3;
                                    iArrCopyOf = iArr2;
                                    iArr3 = iArr;
                                    i17 = iM;
                                    i18 = i14;
                                    break;
                                }
                                zA = true;
                                while (i14 == 0) {
                                    zA = m21Var.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j10 = m21Var.d;
                                    i14 = m21Var.c;
                                    i11 = i11;
                                    iM = iM;
                                }
                                i21 = iM;
                                i16 = i11;
                                if (!zA) {
                                    lvb.G0("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        iArr3 = iArr;
                                        iArrCopyOf = iArr2;
                                        iD = i15;
                                        i18 = i14;
                                        i17 = i21;
                                        jArr4 = jArr3;
                                        break;
                                    }
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i15);
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i15);
                                    iArr3 = iArrCopyOf3;
                                    iArrCopyOf = Arrays.copyOf(iArr2, i15);
                                    iD = i15;
                                    i18 = i14;
                                    jArr4 = jArrCopyOf3;
                                    i17 = i21;
                                    break;
                                }
                                iM = i21;
                                if (nmcVar2 != null) {
                                    while (iE5 == 0) {
                                        iE5 = nmcVar2.E();
                                        iM = nmcVar2.m();
                                        i10--;
                                    }
                                    iE5--;
                                }
                                iA = o21Var.a();
                                int i710 = iD;
                                iArr4 = iArr;
                                long j210 = iA;
                                j9 += j210;
                                if (iA > i13) {
                                    i13 = iA;
                                }
                                if (z3) {
                                    jArrCopyOf[i15] = j10;
                                    iArr4[i15] = iA;
                                    i22 = i13;
                                    jArr6 = jArrCopyOf;
                                    jArr3[i15] = j8 + ((long) iM);
                                    if (nmcVar3 == null) {
                                        i24 = 1;
                                    } else {
                                        i24 = 0;
                                    }
                                    iArr2[i15] = i24;
                                    if (i15 == iE7) {
                                        iArr2[i15] = 1;
                                        arrayList2.add(Integer.valueOf(i15));
                                    }
                                } else {
                                    i22 = i13;
                                    jArr6 = jArrCopyOf;
                                }
                                if (nmcVar3 != null) {
                                    i23 = i16 - 1;
                                    if (i23 > 0) {
                                        i16 = i23;
                                        iE7 = nmcVar3.E() - 1;
                                    } else {
                                        i16 = i23;
                                    }
                                }
                                j8 += (long) iM2;
                                iE6--;
                                if (iE6 != 0) {
                                }
                                j10 += j210;
                                i14--;
                                i15++;
                                jArrCopyOf = jArr6;
                                iD = i710;
                                i11 = i16;
                                i13 = i22;
                                iArr = iArr4;
                            }
                            j11 = j8 + ((long) i17);
                            if (nmcVar2 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i10 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (nmcVar2.E() != 0) {
                                    z7 = false;
                                    break;
                                }
                                nmcVar2.m();
                                i10--;
                            }
                            if (i16 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                z8 = z7;
                                qt4.x(cyhVarA.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                                qt4.x(iE6, i18, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                                sb2.append(i12);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iE5);
                                if (z8) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                lvb.G0("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                z8 = z7;
                                qt4.x(cyhVarA.a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                qt4.x(iE6, i18, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i12);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iE5);
                                if (z8) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                lvb.G0("BoxParsers", sb3.toString());
                            }
                            i19 = iD;
                            i20 = i13;
                            jArr5 = jArrCopyOf;
                            j12 = j9;
                        }
                        iArr5 = iArr3;
                        jArr7 = jArr4;
                        iArr6 = iArrCopyOf;
                        j13 = cyhVarA.f;
                        if (j13 > j2) {
                            jI6 = vqi.i0(j12 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                            if (jI6 > j2) {
                                a87 a87VarA7 = b87Var6.a();
                                a87VarA7.h = (int) jI6;
                                cyhVarA = cyhVarA.a(new b87(a87VarA7));
                            }
                        }
                        i25 = cyhVarA.b;
                        j14 = cyhVarA.c;
                        b87Var3 = cyhVarA.g;
                        jArr8 = cyhVarA.j;
                        jArr9 = cyhVarA.i;
                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                        jI2 = vqi.i0(j11, 1000000L, j14, roundingMode4);
                        iArrH = k4m.h(arrayList2);
                        if (jArr9 == null) {
                            if (!z3) {
                                vqi.h0(j14, jArr7);
                            }
                            lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, jI2, i19);
                        } else if (z3) {
                            jArr8.getClass();
                            if (jArr9.length == 1) {
                                j19 = j2;
                                while (i43 < jArr9.length) {
                                    if (jArr8[i43] != -1) {
                                        j19 += jArr9[i43];
                                    }
                                }
                                jI5 = vqi.i0(j19, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                            } else {
                                j19 = j2;
                                while (i43 < jArr9.length) {
                                    if (jArr8[i43] != -1) {
                                        j19 += jArr9[i43];
                                    }
                                }
                                jI5 = vqi.i0(j19, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                            }
                            lyhVar2 = new lyh(cyhVarA, jArr5, iArr5, i20, jArr7, iArr6, iArrH, z6, jI5, i19);
                        } else {
                            jArr10 = jArr8;
                            if (jArr9.length == 1) {
                                arrayList3 = arrayList2;
                                j15 = -1;
                                if (jArr9.length == 1) {
                                }
                                jArr11 = jArr5;
                                i26 = i19;
                                if (i25 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr7 = new int[jArr9.length];
                                iArr8 = new int[jArr9.length];
                                jArr10.getClass();
                                arrayList4 = arrayList3;
                                i27 = 0;
                                i28 = 0;
                                i29 = 0;
                                z10 = false;
                                while (i29 < jArr9.length) {
                                    iArr12 = iArr8;
                                    i36 = i29;
                                    j18 = jArr10[i36];
                                    if (j18 != j15) {
                                        boolean z110 = z10;
                                        jI4 = vqi.i0(jArr9[i36], cyhVarA.c, cyhVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i36] = vqi.f(jArr7, j18, true);
                                        iB = vqi.b(jArr7, jI4, z9) - 1;
                                        i38 = 0;
                                        while (i37 < jArr7.length) {
                                            if (jArr7[i37] < jI4) {
                                                i38++;
                                                if (i38 > b87Var3.p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i37;
                                            }
                                        }
                                        iArr13[i36] = iB + 1;
                                        i39 = iArr7[i36];
                                        while (true) {
                                            i40 = iArr7[i36];
                                            if (i40 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i36] = i40 - 1;
                                        }
                                        if (i40 == 0) {
                                            iArr7[i36] = i39;
                                            while (true) {
                                                i42 = iArr7[i36];
                                                if (i42 >= iArr13[i36]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i36] = i42 + 1;
                                            }
                                        }
                                        int i711 = iArr13[i36];
                                        i41 = iArr7[i36];
                                        int i712 = (i711 - i41) + i27;
                                        if (i28 != i41) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        z10 = z110 | z15;
                                        i28 = i711;
                                        i27 = i712;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i29 = i36 + 1;
                                    jArr10 = jArr10;
                                    iArr8 = iArr13;
                                    z9 = z9;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr10;
                                boolean z111 = z10;
                                if (i27 != i26) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z111 | z11;
                                if (z12) {
                                    jArr13 = new long[i27];
                                } else {
                                    jArr13 = jArr11;
                                }
                                if (z12) {
                                    iArr10 = new int[i27];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z12) {
                                    i20 = 0;
                                }
                                if (z12) {
                                    iArr11 = new int[i27];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z12) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i27];
                                i30 = 0;
                                z13 = false;
                                i31 = 0;
                                j16 = 0;
                                while (i30 < jArr9.length) {
                                    j17 = jArr12[i30];
                                    i32 = iArr7[i30];
                                    z14 = z12;
                                    i33 = iArr9[i30];
                                    b87 b87Var9 = b87Var3;
                                    if (z14) {
                                        int i713 = i33 - i32;
                                        System.arraycopy(jArr11, i32, jArr13, i31, i713);
                                        System.arraycopy(iArr5, i32, iArr10, i31, i713);
                                        System.arraycopy(iArr6, i32, iArr11, i31, i713);
                                    }
                                    i34 = i20;
                                    while (i32 < i33) {
                                        i35 = i32;
                                        int i714 = i33;
                                        long j211 = cyhVarA.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jI14 = vqi.i0(j16, 1000000L, j211, roundingMode5);
                                        jI3 = vqi.i0(jArr7[i35] - j17, 1000000L, cyhVarA.c, roundingMode5);
                                        if (jI3 < 0) {
                                            z13 = true;
                                        }
                                        jArr14[i31] = jI14 + jI3;
                                        if (z14) {
                                            i34 = iArr5[i35];
                                        }
                                        if (!z14) {
                                        }
                                        i31++;
                                        i32 = i35 + 1;
                                        i33 = i714;
                                    }
                                    j16 += jArr9[i30];
                                    i30++;
                                    i20 = i34;
                                    z12 = z14;
                                    b87Var3 = b87Var9;
                                }
                                b87Var4 = b87Var3;
                                long jI15 = vqi.i0(j16, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                                if (z13) {
                                    a87 a87VarA8 = b87Var4.a();
                                    a87VarA8.s = true;
                                    cyhVarA = cyhVarA.a(new b87(a87VarA8));
                                }
                                lyhVar = new lyh(cyhVarA, jArr13, iArr10, i20, jArr14, iArr11, k4m.h(arrayList5), z6, jI15, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(lyhVar);
                            } else {
                                arrayList3 = arrayList2;
                                j15 = -1;
                                if (jArr9.length == 1) {
                                }
                                jArr11 = jArr5;
                                i26 = i19;
                                if (i25 == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                iArr7 = new int[jArr9.length];
                                iArr8 = new int[jArr9.length];
                                jArr10.getClass();
                                arrayList4 = arrayList3;
                                i27 = 0;
                                i28 = 0;
                                i29 = 0;
                                z10 = false;
                                while (i29 < jArr9.length) {
                                    iArr12 = iArr8;
                                    i36 = i29;
                                    j18 = jArr10[i36];
                                    if (j18 != j15) {
                                        boolean z112 = z10;
                                        jI4 = vqi.i0(jArr9[i36], cyhVarA.c, cyhVarA.d, RoundingMode.DOWN) + j18;
                                        iArr13 = iArr12;
                                        iArr7[i36] = vqi.f(jArr7, j18, true);
                                        iB = vqi.b(jArr7, jI4, z9) - 1;
                                        i38 = 0;
                                        while (i37 < jArr7.length) {
                                            if (jArr7[i37] < jI4) {
                                                i38++;
                                                if (i38 > b87Var3.p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i37;
                                            }
                                        }
                                        iArr13[i36] = iB + 1;
                                        i39 = iArr7[i36];
                                        while (true) {
                                            i40 = iArr7[i36];
                                            if (i40 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i36] = i40 - 1;
                                        }
                                        if (i40 == 0) {
                                            iArr7[i36] = i39;
                                            while (true) {
                                                i42 = iArr7[i36];
                                                if (i42 >= iArr13[i36]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i36] = i42 + 1;
                                            }
                                        }
                                        int i715 = iArr13[i36];
                                        i41 = iArr7[i36];
                                        int i716 = (i715 - i41) + i27;
                                        if (i28 != i41) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        z10 = z112 | z15;
                                        i28 = i715;
                                        i27 = i716;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i29 = i36 + 1;
                                    jArr10 = jArr10;
                                    iArr8 = iArr13;
                                    z9 = z9;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr10;
                                boolean z113 = z10;
                                if (i27 != i26) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z113 | z11;
                                if (z12) {
                                    jArr13 = new long[i27];
                                } else {
                                    jArr13 = jArr11;
                                }
                                if (z12) {
                                    iArr10 = new int[i27];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z12) {
                                    i20 = 0;
                                }
                                if (z12) {
                                    iArr11 = new int[i27];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z12) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i27];
                                i30 = 0;
                                z13 = false;
                                i31 = 0;
                                j16 = 0;
                                while (i30 < jArr9.length) {
                                    j17 = jArr12[i30];
                                    i32 = iArr7[i30];
                                    z14 = z12;
                                    i33 = iArr9[i30];
                                    b87 b87Var10 = b87Var3;
                                    if (z14) {
                                        int i717 = i33 - i32;
                                        System.arraycopy(jArr11, i32, jArr13, i31, i717);
                                        System.arraycopy(iArr5, i32, iArr10, i31, i717);
                                        System.arraycopy(iArr6, i32, iArr11, i31, i717);
                                    }
                                    i34 = i20;
                                    while (i32 < i33) {
                                        i35 = i32;
                                        int i718 = i33;
                                        long j212 = cyhVarA.d;
                                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                                        long jI16 = vqi.i0(j16, 1000000L, j212, roundingMode6);
                                        jI3 = vqi.i0(jArr7[i35] - j17, 1000000L, cyhVarA.c, roundingMode6);
                                        if (jI3 < 0) {
                                            z13 = true;
                                        }
                                        jArr14[i31] = jI16 + jI3;
                                        if (z14) {
                                            i34 = iArr5[i35];
                                        }
                                        if (!z14) {
                                        }
                                        i31++;
                                        i32 = i35 + 1;
                                        i33 = i718;
                                    }
                                    j16 += jArr9[i30];
                                    i30++;
                                    i20 = i34;
                                    z12 = z14;
                                    b87Var3 = b87Var10;
                                }
                                b87Var4 = b87Var3;
                                long jI17 = vqi.i0(j16, 1000000L, cyhVarA.d, RoundingMode.DOWN);
                                if (z13) {
                                    a87 a87VarA9 = b87Var4.a();
                                    a87VarA9.s = true;
                                    cyhVarA = cyhVarA.a(new b87(a87VarA9));
                                }
                                lyhVar = new lyh(cyhVarA, jArr13, iArr10, i20, jArr14, iArr11, k4m.h(arrayList5), z6, jI17, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(lyhVar);
                            }
                        }
                        lyhVar = lyhVar2;
                    }
                    arrayList6.add(lyhVar);
                }
            }
            i54 = i2 + 1;
            m2bVar2 = m2bVar;
            arrayList6 = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    public static lwa k(n2b n2bVar) {
        int i;
        boolean z;
        lwa lwaVar;
        lwa lwaVar2;
        int iB;
        lwa lwaVar3;
        Object objF;
        nmc nmcVar = n2bVar.c;
        int i2 = 8;
        nmcVar.N(8);
        boolean z2 = false;
        lwa lwaVar4 = new lwa(new jwa[0]);
        while (nmcVar.a() >= i2) {
            int i3 = nmcVar.b;
            int iM = nmcVar.m();
            int iM2 = nmcVar.m();
            String str = null;
            if (iM2 == 1835365473) {
                nmcVar.N(i3);
                int i4 = i3 + iM;
                nmcVar.O(i2);
                a(nmcVar);
                while (true) {
                    int i5 = nmcVar.b;
                    if (i5 < i4) {
                        int iM3 = nmcVar.m();
                        if (nmcVar.m() == 1768715124) {
                            nmcVar.N(i5);
                            int i6 = i5 + iM3;
                            nmcVar.O(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = nmcVar.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM4 = nmcVar.m() + i7;
                                int iM5 = nmcVar.m();
                                int i8 = (iM5 >> 24) & 255;
                                if (i8 == 169 || i8 == 253) {
                                    int i9 = 16777215 & iM5;
                                    if (i9 == 6516084) {
                                        int iM6 = nmcVar.m();
                                        if (nmcVar.m() == 1684108385) {
                                            nmcVar.O(8);
                                            String strW = nmcVar.w(iM6 - 16);
                                            objF = new cz3("und", strW, strW);
                                        } else {
                                            lvb.G0("MetadataUtil", "Failed to parse comment attribute: ".concat(gn2.a(iM5)));
                                            objF = null;
                                        }
                                    } else if (i9 == 7233901 || i9 == 7631467) {
                                        objF = xuk.f(iM5, nmcVar, "TIT2");
                                    } else if (i9 == 6516589 || i9 == 7828084) {
                                        objF = xuk.f(iM5, nmcVar, "TCOM");
                                    } else if (i9 == 6578553) {
                                        objF = xuk.f(iM5, nmcVar, "TDRC");
                                    } else if (i9 == 4280916) {
                                        objF = xuk.f(iM5, nmcVar, "TPE1");
                                    } else if (i9 == 7630703) {
                                        objF = xuk.f(iM5, nmcVar, "TSSE");
                                    } else if (i9 == 6384738) {
                                        objF = xuk.f(iM5, nmcVar, "TALB");
                                    } else if (i9 == 7108978) {
                                        objF = xuk.f(iM5, nmcVar, "USLT");
                                    } else if (i9 == 6776174) {
                                        objF = xuk.f(iM5, nmcVar, "TCON");
                                    } else if (i9 == 6779504) {
                                        objF = xuk.f(iM5, nmcVar, "TIT1");
                                    } else if (i9 == 7173742) {
                                        objF = xuk.f(iM5, nmcVar, "MVNM");
                                    } else if (i9 == 7173737) {
                                        Object objE = xuk.e(iM5, "MVIN", nmcVar, true, false);
                                        nmcVar.N(iM4);
                                        objF = objE;
                                    } else {
                                        lvb.g0("MetadataUtil", "Skipped unknown metadata entry: ".concat(gn2.a(iM5)));
                                        nmcVar.N(iM4);
                                        objF = null;
                                    }
                                    nmcVar.N(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = f48.a(xuk.d(nmcVar) - 1);
                                            if (strA != null) {
                                                objF = new smh("TCON", str, c98.r(strA));
                                            } else {
                                                lvb.G0("MetadataUtil", "Failed to parse standard genre code");
                                                objF = str;
                                            }
                                        } catch (Throwable th) {
                                            nmcVar.N(iM4);
                                            throw th;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objF = xuk.c(iM5, nmcVar, "TPOS");
                                    } else if (iM5 == 1953655662) {
                                        objF = xuk.c(iM5, nmcVar, "TRCK");
                                    } else if (iM5 == 1953329263) {
                                        objF = xuk.e(iM5, "TBPM", nmcVar, true, z2);
                                    } else if (iM5 == 1668311404) {
                                        objF = xuk.e(iM5, "TCMP", nmcVar, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objF = xuk.b(nmcVar);
                                    } else if (iM5 == 1631670868) {
                                        objF = xuk.f(iM5, nmcVar, "TPE2");
                                    } else if (iM5 == 1936682605) {
                                        objF = xuk.f(iM5, nmcVar, "TSOT");
                                    } else if (iM5 == 1936679276) {
                                        objF = xuk.f(iM5, nmcVar, "TSOA");
                                    } else if (iM5 == 1936679282) {
                                        objF = xuk.f(iM5, nmcVar, "TSOP");
                                    } else if (iM5 == 1936679265) {
                                        objF = xuk.f(iM5, nmcVar, "TSO2");
                                    } else if (iM5 == 1936679791) {
                                        objF = xuk.f(iM5, nmcVar, "TSOC");
                                    } else if (iM5 == 1920233063) {
                                        objF = xuk.e(iM5, "ITUNESADVISORY", nmcVar, z2, z2);
                                    } else if (iM5 == 1885823344) {
                                        objF = xuk.e(iM5, "ITUNESGAPLESS", nmcVar, z2, true);
                                    } else if (iM5 == 1936683886) {
                                        objF = xuk.f(iM5, nmcVar, "TVSHOWSORT");
                                    } else if (iM5 == 1953919848) {
                                        objF = xuk.f(iM5, nmcVar, "TVSHOW");
                                    } else if (iM5 == 757935405) {
                                        String strW2 = str;
                                        String strW3 = strW2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = nmcVar.b;
                                            if (i12 >= iM4) {
                                                break;
                                            }
                                            int iM7 = nmcVar.m();
                                            int iM8 = nmcVar.m();
                                            nmcVar.O(4);
                                            if (iM8 == 1835360622) {
                                                strW2 = nmcVar.w(iM7 - 12);
                                            } else if (iM8 == 1851878757) {
                                                strW3 = nmcVar.w(iM7 - 12);
                                            } else {
                                                if (iM8 == 1684108385) {
                                                    i10 = i12;
                                                    i11 = iM7;
                                                }
                                                nmcVar.O(iM7 - 12);
                                            }
                                        }
                                        if (strW2 == null || strW3 == null || i10 == -1) {
                                            objF = null;
                                        } else {
                                            nmcVar.N(i10);
                                            nmcVar.O(16);
                                            objF = new yj8(strW2, strW3, nmcVar.w(i11 - 16));
                                        }
                                        nmcVar.N(iM4);
                                    } else {
                                        lvb.g0("MetadataUtil", "Skipped unknown metadata entry: ".concat(gn2.a(iM5)));
                                        nmcVar.N(iM4);
                                        objF = null;
                                    }
                                    nmcVar.N(iM4);
                                }
                                if (objF != null) {
                                    arrayList.add(objF);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                lwaVar3 = new lwa(arrayList);
                                break;
                            }
                            break;
                        }
                        nmcVar.N(i5 + iM3);
                        i2 = 8;
                        z2 = false;
                        str = null;
                    }
                    lwaVar3 = null;
                    break;
                }
                lwaVar4 = lwaVar4.b(lwaVar3);
                i = 8;
            } else if (iM2 == 1936553057) {
                nmcVar.N(i3);
                int i13 = i3 + iM;
                nmcVar.O(12);
                while (true) {
                    int i14 = nmcVar.b;
                    if (i14 < i13) {
                        int iM9 = nmcVar.m();
                        if (nmcVar.m() == 1935766900) {
                            if (iM9 >= 16) {
                                nmcVar.O(4);
                                int i15 = -1;
                                int i16 = 0;
                                for (int i17 = 0; i17 < 2; i17++) {
                                    int iA = nmcVar.A();
                                    int iA2 = nmcVar.A();
                                    if (iA == 0) {
                                        i15 = iA2;
                                    } else if (iA == 1) {
                                        i16 = iA2;
                                    }
                                }
                                if (i15 != 12) {
                                    if (i15 != 13) {
                                        if (i15 != 21) {
                                            iB = -2147483647;
                                        } else {
                                            i = 8;
                                            if (nmcVar.a() < 8 || nmcVar.b + 8 > i13) {
                                                iB = -2147483647;
                                            } else {
                                                int iM10 = nmcVar.m();
                                                int iM11 = nmcVar.m();
                                                if (iM10 < 12 || iM11 != 1936877170) {
                                                    iB = -2147483647;
                                                } else {
                                                    iB = nmcVar.B();
                                                }
                                            }
                                        }
                                        if (iB == -2147483647) {
                                            lwaVar2 = new lwa(new xbg(i16, iB));
                                            break;
                                        }
                                        break;
                                    }
                                    iB = 120;
                                } else {
                                    iB = 240;
                                }
                                i = 8;
                                if (iB == -2147483647) {
                                    lwaVar2 = new lwa(new xbg(i16, iB));
                                    break;
                                }
                                break;
                            }
                            lwaVar2 = null;
                            i = 8;
                            break;
                        }
                        nmcVar.N(i14 + iM9);
                    } else {
                        i = 8;
                    }
                    lwaVar2 = null;
                    break;
                }
                lwaVar4 = lwaVar4.b(lwaVar2);
            } else {
                i = 8;
                if (iM2 == -1451722374) {
                    short sX = nmcVar.x();
                    nmcVar.O(2);
                    String strY = nmcVar.y(sX, StandardCharsets.UTF_8);
                    int iMax = Math.max(strY.lastIndexOf(43), strY.lastIndexOf(45));
                    try {
                        try {
                            r2b r2bVar = new r2b(Float.parseFloat(strY.substring(0, iMax)), Float.parseFloat(strY.substring(iMax, strY.length() - 1)));
                            jwa[] jwaVarArr = new jwa[1];
                            z = false;
                            try {
                                jwaVarArr[0] = r2bVar;
                                lwaVar = new lwa(jwaVarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                lwaVar = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    lwaVar4 = lwaVar4.b(lwaVar);
                }
                nmcVar.N(i3 + iM);
                i2 = i;
                z2 = z;
            }
            z = false;
            nmcVar.N(i3 + iM);
            i2 = i;
            z2 = z;
        }
        return lwaVar4;
    }
}
