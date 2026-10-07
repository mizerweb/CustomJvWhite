package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lkl {
    public static void a(long j, nmc nmcVar, kyh[] kyhVarArr) {
        int i;
        int iA;
        while (true) {
            if (nmcVar.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (nmcVar.a() == 0) {
                    i = -1;
                    break;
                }
                int iA2 = nmcVar.A();
                i2 += iA2;
                if (iA2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (nmcVar.a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iA = nmcVar.A();
                    i3 += iA;
                }
            } while (iA == 255);
            int i4 = nmcVar.b + i3;
            if (i3 == -1 || i3 > nmcVar.a()) {
                lvb.G0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = nmcVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iA3 = nmcVar.A();
                int iH = nmcVar.H();
                int iM = iH == 49 ? nmcVar.m() : 0;
                int iA4 = nmcVar.A();
                if (iH == 47) {
                    nmcVar.O(1);
                }
                boolean z = iA3 == 181 && (iH == 49 || iH == 47) && iA4 == 3;
                if (iH == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    b(j, nmcVar, kyhVarArr);
                }
            }
            nmcVar.N(i4);
        }
    }

    public static void b(long j, nmc nmcVar, kyh[] kyhVarArr) {
        int iA = nmcVar.A();
        if ((iA & 64) != 0) {
            nmcVar.O(1);
            int i = (iA & 31) * 3;
            int i2 = nmcVar.b;
            for (kyh kyhVar : kyhVarArr) {
                nmcVar.N(i2);
                kyhVar.f(i, nmcVar);
                lvb.b0(j != -9223372036854775807L);
                kyhVar.a(j, 1, i, 0, null);
            }
        }
    }

    public static final x8b c(wdd... wddVarArr) {
        x8b x8bVar = new x8b(false);
        wdd[] wddVarArr2 = (wdd[]) Arrays.copyOf(wddVarArr, wddVarArr.length);
        if (x8bVar.b.get()) {
            ore.k("Do mutate preferences once returned to DataStore.");
            return null;
        }
        if (wddVarArr2.length <= 0) {
            return x8bVar;
        }
        wdd wddVar = wddVarArr2[0];
        throw null;
    }
}
