package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ayl {
    public static boolean a(nmc nmcVar, bx6 bx6Var, int i, s8 s8Var) {
        long jC = nmcVar.C();
        long j = jC >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jC >> 12) & 15);
        int i3 = (int) ((jC >> 8) & 15);
        int i4 = (int) ((jC >> 4) & 15);
        int i5 = (int) ((jC >> 1) & 7);
        boolean z2 = (jC & 1) == 1;
        if (i4 <= 7) {
            if (i4 != bx6Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || bx6Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == bx6Var.i) || z2) {
            return false;
        }
        try {
            long jI = nmcVar.I();
            if (!z) {
                jI *= (long) bx6Var.b;
            }
            long j2 = bx6Var.j;
            if (j2 != 0 && jI > j2) {
                return false;
            }
            s8Var.a = jI;
            int iD = d(i2, nmcVar);
            long j3 = bx6Var.j;
            boolean z3 = j3 == 0 || jI + ((long) iD) >= j3;
            if (iD == -1) {
                return false;
            }
            if ((!z3 && iD < bx6Var.a) || iD > bx6Var.b) {
                return false;
            }
            int i6 = bx6Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != bx6Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iH = nmcVar.H();
                    if (i3 == 14) {
                        iH *= 10;
                    }
                    if (iH != i6) {
                        return false;
                    }
                } else if (nmcVar.A() * 1000 != i6) {
                    return false;
                }
            }
            int iA = nmcVar.A();
            int i7 = nmcVar.b;
            byte[] bArr = nmcVar.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = nmcVar.b; i10 < i8; i10++) {
                i9 = vqi.m[i9 ^ (bArr[i10] & 255)];
            }
            String str = vqi.a;
            if (iA != i9) {
                return false;
            }
            if (nmcVar.a() != 0) {
                int iJ = nmcVar.j();
                if ((iJ & np0.m) != 0) {
                    return false;
                }
                int i11 = (iJ & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    lvb.r0("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void b(Throwable th) throws Throwable {
        c(th);
        throw new RuntimeException(th);
    }

    public static void c(Throwable th) throws Throwable {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (RuntimeException.class.isInstance(th)) {
            throw ((Throwable) RuntimeException.class.cast(th));
        }
    }

    public static int d(int i, nmc nmcVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return nmcVar.A() + 1;
            case 7:
                return nmcVar.H() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return np0.n << (i - 8);
            default:
                return -1;
        }
    }
}
