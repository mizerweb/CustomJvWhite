package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ir7 implements Serializable {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final jr7 j;

    public ir7(long j, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, boolean z5, int i, jr7 jr7Var) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
        this.f = str2;
        this.g = z4;
        this.h = z5;
        this.i = i;
        this.j = jr7Var;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f6  */
    public static ir7 a(fka fkaVar) {
        int i;
        int i2;
        int iJ;
        int i3;
        int i4;
        String strW;
        int i5;
        String str;
        int iU = ch3.U(fkaVar);
        long j = 0;
        jr7 jr7Var = jr7.b;
        long jT = 0;
        jr7 jr7Var2 = jr7Var;
        int i6 = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        String strW2 = null;
        String strW3 = null;
        boolean zL4 = false;
        boolean zL5 = false;
        int i7 = 0;
        while (i6 < iU) {
            String strW4 = ch3.W(fkaVar);
            strW4.getClass();
            switch (strW4) {
                case "groupOptions":
                    i = iU;
                    String str2 = "ServerPayload/PayloadCatching";
                    try {
                        i2 = i6;
                        iJ = ch3.J(fkaVar);
                    } catch (Throwable th) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                        Iterator it = fjf.a.iterator();
                        while (it.hasNext()) {
                            AccountInitializer accountInitializer = ((n6) it.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th);
                                i3 = i6;
                                try {
                                    accountInitializer.d().i().g().a(null, th);
                                } catch (Throwable th2) {
                                    th = th2;
                                    gm0.V("Payload", "failed to collect exception", th);
                                    i6 = i3;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i3 = i6;
                            }
                            i6 = i3;
                        }
                        i2 = i6;
                        int iD = qt4.D(pye.a);
                        if (iD != 0) {
                            if (iD == 1) {
                                throw th;
                            }
                            ore.o();
                            return null;
                        }
                        iJ = 0;
                    }
                    if (iJ == 0) {
                        jr7Var2 = jr7Var;
                    } else {
                        boolean z = false;
                        int i8 = 0;
                        while (i8 < iJ) {
                            try {
                                strW = ch3.W(fkaVar);
                                i4 = i8;
                            } catch (Throwable th4) {
                                gm0.V(str2, "payloadCatching catch error", th4);
                                Iterator it2 = fjf.a.iterator();
                                while (it2.hasNext()) {
                                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                                    try {
                                        gm0.V("Payload", "error while parse payload", th4);
                                        i5 = i8;
                                        try {
                                            accountInitializer2.d().i().g().a(null, th4);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            gm0.V("Payload", "failed to collect exception", th);
                                            i8 = i5;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        i5 = i8;
                                    }
                                    i8 = i5;
                                }
                                i4 = i8;
                                int iD2 = qt4.D(pye.a);
                                if (iD2 != 0) {
                                    if (iD2 == 1) {
                                        throw th4;
                                    }
                                    ore.o();
                                    return null;
                                }
                                strW = null;
                            }
                            if (cqk.d(strW, "GroupPremium")) {
                                z = true;
                            } else {
                                try {
                                    fkaVar.x();
                                } catch (Throwable th7) {
                                    gm0.V(str2, "payloadCatching catch error", th7);
                                    Iterator it3 = fjf.a.iterator();
                                    while (it3.hasNext()) {
                                        AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                        try {
                                            gm0.V("Payload", "error while parse payload", th7);
                                            str = str2;
                                            try {
                                                accountInitializer3.d().i().g().a(null, th7);
                                            } catch (Throwable th8) {
                                                th = th8;
                                                gm0.V("Payload", "failed to collect exception", th);
                                                str2 = str;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            str = str2;
                                        }
                                        str2 = str;
                                    }
                                    str2 = str2;
                                    int iD3 = qt4.D(pye.a);
                                    if (iD3 != 0) {
                                        if (iD3 == 1) {
                                            throw th7;
                                        }
                                        ore.o();
                                        return null;
                                    }
                                }
                            }
                            i8 = i4 + 1;
                            iJ = iJ;
                            str2 = str2;
                        }
                        jr7Var2 = new jr7(z);
                    }
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "messaging":
                    String strW5 = ch3.W(fkaVar);
                    if (strW5 != null) {
                        int iHashCode = strW5.hashCode();
                        if (iHashCode != 64897) {
                            if (iHashCode == 1053567612) {
                                strW5.equals("DISABLED");
                            } else if (iHashCode == 1666864377 && strW5.equals("MEMBERS")) {
                                i7 = 2;
                            }
                            i7 = 1;
                        } else if (strW5.equals("ALL")) {
                            i7 = 3;
                        } else {
                            i7 = 1;
                        }
                    } else {
                        i7 = 1;
                    }
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "isAnswered":
                    zL = ch3.L(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "isModerator":
                    zL2 = ch3.L(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "isMember":
                    zL5 = ch3.L(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "baseIconUrl":
                    strW3 = ch3.W(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "name":
                    strW2 = ch3.W(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "groupId":
                    jT = ch3.T(fkaVar, j);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "isImportant":
                    zL3 = ch3.L(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                case "isCustomTitle":
                    zL4 = ch3.L(fkaVar);
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
                default:
                    fkaVar.x();
                    i = iU;
                    jr7Var = jr7Var;
                    i2 = i6;
                    i6 = i2 + 1;
                    iU = i;
                    jr7Var = jr7Var;
                    j = 0;
                    break;
            }
        }
        return new ir7(jT, zL, zL2, zL3, strW2, strW3, zL4, zL5, i7, jr7Var2);
    }

    public final String toString() {
        String str;
        int i = this.i;
        if (i == 1) {
            str = "DISABLED";
        } else if (i == 2) {
            str = "MEMBERS";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "ALL";
        }
        String string = this.j.toString();
        StringBuilder sbU = qt4.u(this.a, "{groupId=", ", isAnswered=", this.b);
        qv1.v(", isModerator=", ", isImportant=", sbU, this.c, this.d);
        nbh.G(sbU, ", name=", this.e, ", baseIconUrl=", this.f);
        qv1.v(", isCustomTitle=", ", isMember=", sbU, this.g, this.h);
        nbh.G(sbU, ", messagingPermissions=", str, ", groupOptions=", string);
        sbU.append("}");
        return sbU.toString();
    }
}
