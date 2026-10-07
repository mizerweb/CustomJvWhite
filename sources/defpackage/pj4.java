package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class pj4 implements Serializable {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final List e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final zba n;
    public final int[] o;
    public final String p;
    public final List q;
    public final long r;
    public final ix2 s;

    public pj4(long j, long j2, String str, String str2, List list, long j3, long j4, int i, int i2, int i3, String str3, String str4, String str5, zba zbaVar, int[] iArr, String str6, List list2, long j5, ix2 ix2Var) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        arrayList.sort(Comparator.comparing(new ka4(3)));
        this.e = Collections.unmodifiableList(arrayList);
        this.f = j3;
        this.g = j4;
        this.h = i;
        this.i = i2;
        this.j = i3 == 0 ? 1 : i3;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = zbaVar;
        this.o = iArr;
        this.p = str6 == null ? "" : str6;
        this.q = list2;
        this.r = j5;
        this.s = ix2Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ac A[PHI: r39
  0x01ac: PHI (r39v6 int) = (r39v2 int), (r39v3 int), (r39v4 int), (r39v7 int) binds: [B:122:0x01d0, B:118:0x01c3, B:114:0x01b6, B:111:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x02a7  */
    public static pj4 e(fka fkaVar) {
        int i;
        int i2;
        int i3;
        byte b;
        int iU = ch3.U(fkaVar);
        if (iU == 0) {
            return null;
        }
        String strS0 = null;
        String strW = null;
        String strW2 = null;
        ArrayList arrayList = null;
        String strW3 = null;
        String strW4 = null;
        String strW5 = null;
        zba zbaVarB = null;
        int[] iArr = null;
        ArrayList arrayList2 = null;
        ix2 ix2Var = ix2.d;
        int i4 = 0;
        long jI0 = 0;
        long jI1 = 0;
        long jI2 = 0;
        long jI3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long jT = 0;
        while (true) {
            if (i4 >= iU) {
                return new pj4(jI0, jI1, strW, strW2, arrayList, jI2, jI3, i5, i6, i7, strW3, strW4, strW5, zbaVarB, iArr, strS0 != null ? strS0 : "", arrayList2, jT, ix2Var);
            }
            String strS1 = fkaVar.S0();
            strS1.getClass();
            switch (strS1) {
                case "profileOptions":
                    i = iU;
                    i2 = i4;
                    int iT0 = fkaVar.t0();
                    int[] iArr2 = new int[iT0];
                    for (int i8 = 0; i8 < iT0; i8++) {
                        int iR = ch3.R(fkaVar, -1);
                        if (iR != -1) {
                            iArr2[i8] = iR;
                        }
                    }
                    iArr = iArr2;
                    break;
                case "description":
                    i = iU;
                    i2 = i4;
                    strW3 = ch3.W(fkaVar);
                    break;
                case "gender":
                    i = iU;
                    i2 = i4;
                    int iD0 = fkaVar.D0();
                    if (iD0 == 1) {
                        i7 = 2;
                        break;
                    } else {
                        if (iD0 != 2) {
                            i7 = 1;
                        } else {
                            i7 = 3;
                        }
                        break;
                    }
                    break;
                case "menuButton":
                    i = iU;
                    i2 = i4;
                    zbaVarB = zba.b(fkaVar);
                    break;
                case "status":
                    i = iU;
                    i2 = i4;
                    q1 q1VarT0 = fkaVar.T0();
                    int iA = q1VarT0.a();
                    qt4.c(iA);
                    if (iA == 1) {
                        i5 = 0;
                        break;
                    } else {
                        if (q1VarT0.a() == 5) {
                            String strC = q1VarT0.o().C();
                            if (strC == null) {
                                ore.n("Name is null");
                            } else if (strC.equals("BLOCKED")) {
                                i5 = 1;
                            } else if (strC.equals("REMOVED")) {
                                i5 = 2;
                            } else {
                                ore.p("No enum constant ru.ok.tamtam.api.commands.base.ContactStatus.".concat(strC));
                            }
                            i5 = 0;
                            break;
                        }
                        break;
                    }
                    break;
                case "accountStatus":
                    i = iU;
                    i2 = i4;
                    int iR2 = ch3.R(fkaVar, 0);
                    if (iR2 != 0) {
                        if (iR2 == 1) {
                            i6 = 2;
                        } else if (iR2 != 2) {
                            i6 = 1;
                        } else {
                            i6 = 3;
                        }
                        break;
                    } else {
                        i6 = 1;
                        break;
                    }
                    break;
                case "baseRawUrl":
                    i = iU;
                    i2 = i4;
                    strW2 = ch3.W(fkaVar);
                    break;
                case "photoId":
                    i = iU;
                    i2 = i4;
                    jI2 = fkaVar.I0();
                    break;
                case "baseUrl":
                    i = iU;
                    i2 = i4;
                    strW = ch3.W(fkaVar);
                    break;
                case "updateTime":
                    i = iU;
                    i2 = i4;
                    jI1 = fkaVar.I0();
                    break;
                case "id":
                    i = iU;
                    i2 = i4;
                    jI0 = fkaVar.I0();
                    break;
                case "bday":
                    i = iU;
                    i2 = i4;
                    strW5 = ch3.W(fkaVar);
                    break;
                case "link":
                    i = iU;
                    i2 = i4;
                    strW4 = ch3.W(fkaVar);
                    break;
                case "registrationTime":
                    i = iU;
                    i2 = i4;
                    jT = ch3.T(fkaVar, 0L);
                    break;
                case "flags":
                    i = iU;
                    i2 = i4;
                    ix2Var = new ix2(ch3.R(fkaVar, 0), 1);
                    break;
                case "names":
                    int iJ = ch3.J(fkaVar);
                    arrayList = new ArrayList(iJ);
                    int i9 = 0;
                    while (i9 < iJ) {
                        int iP0 = fkaVar.P0();
                        int i10 = iU;
                        int i11 = iJ;
                        String strW6 = "";
                        String strW7 = null;
                        int i12 = 0;
                        kl4 kl4VarValueOf = null;
                        while (true) {
                            kl4 kl4Var = kl4.c;
                            if (i12 < iP0) {
                                int i13 = i4;
                                String strS2 = fkaVar.S0();
                                strS2.getClass();
                                switch (strS2.hashCode()) {
                                    case -1459599807:
                                        i3 = i9;
                                        if (strS2.equals("lastName")) {
                                            b = 0;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 3575610:
                                        i3 = i9;
                                        if (strS2.equals("type")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    case 132835675:
                                        i3 = i9;
                                        if (strS2.equals("firstName")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        break;
                                    default:
                                        i3 = i9;
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    case 0:
                                        strW6 = ch3.W(fkaVar);
                                        break;
                                    case 1:
                                        String strW8 = ch3.W(fkaVar);
                                        kl4VarValueOf = strW8 == null ? kl4Var : kl4.valueOf(strW8);
                                        break;
                                    case 2:
                                        strW7 = ch3.W(fkaVar);
                                        break;
                                    default:
                                        fkaVar.x();
                                        break;
                                }
                                i12++;
                                i4 = i13;
                                i9 = i3;
                            } else {
                                int i14 = i4;
                                int i15 = i9;
                                arrayList.add(new ll4(strW7, kl4VarValueOf == null ? kl4Var : kl4VarValueOf, strW6));
                                i9 = i15 + 1;
                                iJ = i11;
                                iU = i10;
                                i4 = i14;
                            }
                        }
                    }
                    i = iU;
                    i2 = i4;
                    break;
                case "phone":
                    jI3 = fkaVar.I0();
                    i = iU;
                    i2 = i4;
                    break;
                case "country":
                    strS0 = fkaVar.S0();
                    i = iU;
                    i2 = i4;
                    break;
                case "organizationIds":
                    int iT1 = fkaVar.t0();
                    if (iT1 <= 0) {
                        i = iU;
                        i2 = i4;
                    } else {
                        ArrayList arrayList3 = new ArrayList(iT1);
                        for (int i16 = 0; i16 < iT1; i16++) {
                            ArrayList arrayList4 = arrayList3;
                            long jT2 = ch3.T(fkaVar, -1L);
                            if (jT2 != -1) {
                                arrayList3 = arrayList4;
                                arrayList3.add(Long.valueOf(jT2));
                            } else {
                                arrayList3 = arrayList4;
                            }
                        }
                        i = iU;
                        i2 = i4;
                        arrayList2 = arrayList3;
                    }
                    break;
                default:
                    fkaVar.x();
                    i = iU;
                    i2 = i4;
                    break;
            }
            i4 = i2 + 1;
            iU = i;
        }
    }

    public final String a() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return ((ll4) list.get(0)).a();
    }

    public final String b() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return ((ll4) list.get(0)).a;
    }

    public final String c() {
        List list = this.e;
        if (list.isEmpty()) {
            return null;
        }
        return ((ll4) list.get(0)).c;
    }

    public final String d(us0 us0Var) {
        String str = this.c;
        if (ch3.r(str)) {
            return null;
        }
        return vs0.d(str, us0Var, rs0.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContactInfo{id=");
        sb.append(this.a);
        sb.append(",flags=");
        sb.append(this.s);
        sb.append(",status=");
        sb.append(qv1.z(this.h));
        sb.append(",accountStatus=");
        int i = this.i;
        if (i == 1) {
            str = "ACTIVE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "DELETED";
        } else {
            str = "BLOCKED";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
