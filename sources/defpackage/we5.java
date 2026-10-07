package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class we5 {
    public final int a;
    public final List b;

    public we5() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    public n5i a(int i, a9m a9mVar) {
        String str = (String) a9mVar.c;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new itc(new z2b(str, a9mVar.f(), "video/mp2t"));
            }
            if (i == 21) {
                return new itc(new uw5());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new itc(new zr7(new xtj(b(a9mVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new itc(new bs7(new xtj(b(a9mVar))));
            }
            if (i == 45) {
                return new itc(new b3b());
            }
            if (i == 89) {
                return new itc(new uw5((List) a9mVar.d));
            }
            if (i == 172) {
                return new itc(new g4(str, a9mVar.f(), 1, "video/mp2t"));
            }
            if (i == 257) {
                return new gbf(new r6a("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new itc(new wv5(str, a9mVar.f(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new itc(new me(str, a9mVar.f(), "video/mp2t", false));
                    case 16:
                        return new itc(new wr7(new dc9(b(a9mVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new itc(new ay8(str, a9mVar.f()));
                    default:
                        switch (i) {
                            case np0.m /* 128 */:
                                break;
                            case 129:
                                return new itc(new g4(str, a9mVar.f(), 0, "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new gbf(new r6a("application/x-scte35"));
                                    case 135:
                                        return new itc(new g4(str, a9mVar.f(), 0, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new itc(new wv5(str, a9mVar.f(), np0.r));
        }
        return new itc(new tr7(new dc9(b(a9mVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(a9m a9mVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.b;
        if (zC) {
            return list;
        }
        nmc nmcVar = new nmc((byte[]) a9mVar.e);
        ArrayList arrayList = list;
        while (nmcVar.a() > 0) {
            int iA = nmcVar.A();
            int iA2 = nmcVar.b + nmcVar.A();
            if (iA == 134) {
                arrayList = new ArrayList();
                int iA3 = nmcVar.A() & 31;
                for (int i2 = 0; i2 < iA3; i2++) {
                    String strY = nmcVar.y(3, StandardCharsets.UTF_8);
                    int iA4 = nmcVar.A();
                    boolean z = (iA4 & np0.m) != 0;
                    if (z) {
                        i = iA4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA = (byte) nmcVar.A();
                    nmcVar.O(1);
                    if (z) {
                        boolean z2 = (bA & 64) != 0;
                        byte[] bArr = qu3.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    a87 a87Var = new a87();
                    a87Var.m = uya.n(str);
                    a87Var.d = strY;
                    a87Var.J = i;
                    a87Var.p = listSingletonList;
                    arrayList.add(new b87(a87Var));
                }
            }
            nmcVar.N(iA2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i) {
        return (this.a & i) != 0;
    }

    public we5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public we5(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
