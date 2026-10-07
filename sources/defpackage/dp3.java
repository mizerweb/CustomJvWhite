package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class dp3 {
    public final String a = dp3.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public dp3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01af A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:116:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0146 A[EDGE_INSN: B:63:0x0146->B:64:0x0147 BREAK  A[LOOP:0: B:54:0x0105->B:96:0x0196, LOOP_LABEL: LOOP:0: B:54:0x0105->B:96:0x0196]] */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0166 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0171 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x017c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0184 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, LOOP:1: B:57:0x011f->B:90:0x0184, LOOP_END, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0190  */
    /* JADX WARN: Code duplicated, block: B:94:0x0191  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, LOOP:0: B:54:0x0105->B:96:0x0196, LOOP_END, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4 A[Catch: CancellationException -> 0x01ba, InterruptedException -> 0x01bc, Exception -> 0x01be, TryCatch #2 {InterruptedException -> 0x01bc, CancellationException -> 0x01ba, Exception -> 0x01be, blocks: (B:14:0x0036, B:64:0x0147, B:65:0x014a, B:67:0x0150, B:69:0x0156, B:74:0x0162, B:76:0x0166, B:81:0x0171, B:83:0x0175, B:88:0x017e, B:19:0x004a, B:38:0x00d3, B:40:0x00d7, B:43:0x00dd, B:46:0x00e5, B:51:0x00fb, B:54:0x0105, B:56:0x0115, B:58:0x0121, B:60:0x012b, B:90:0x0184, B:96:0x0196, B:97:0x019c, B:98:0x01a3, B:99:0x01a4, B:101:0x01ab, B:103:0x01af, B:105:0x01b6, B:22:0x005b, B:28:0x0075, B:30:0x007a, B:32:0x0080, B:35:0x008d, B:25:0x0062), top: B:115:0x002e }] */
    public final Object a(long j, nq4 nq4Var) throws InterruptedException {
        cp3 cp3Var;
        rt2 rt2Var;
        int i;
        hu4 hu4Var;
        Object objE;
        kx2 kx2Var;
        nz2 nz2Var;
        List list;
        boolean zW0;
        m8b m8bVarC0;
        long[] jArr;
        long[] jArr2;
        int length;
        int i2;
        long j2;
        int i3;
        int i4;
        Object objV;
        boolean z;
        boolean z2;
        nx2 nx2Var;
        kx2 kx2Var2;
        kx2 kx2Var3;
        long j3 = j;
        if (nq4Var instanceof cp3) {
            cp3Var = (cp3) nq4Var;
            int i5 = cp3Var.h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cp3Var.h = i5 - Integer.MIN_VALUE;
            } else {
                cp3Var = new cp3(this, nq4Var);
            }
        } else {
            cp3Var = new cp3(this, nq4Var);
        }
        cp3 cp3Var2 = cp3Var;
        Object objI = cp3Var2.f;
        int i6 = cp3Var2.h;
        ny8 ny8Var = this.d;
        kx2 kx2Var4 = kx2.d;
        boolean z3 = true;
        hu4 hu4Var2 = hu4.a;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    j3 = cp3Var2.d;
                    ch3.d0(objI);
                } else {
                    if (i6 == 2) {
                        j3 = cp3Var2.d;
                        rt2Var = cp3Var2.e;
                        ch3.d0(objI);
                        i = 3;
                        objE = objI;
                        hu4Var = hu4Var2;
                        nz2Var = (nz2) objE;
                        if (nz2Var != null) {
                            list = nz2Var.c;
                        } else {
                            list = null;
                        }
                        if (list != null && !list.isEmpty()) {
                            m8bVarC0 = ((qw2) this.c.getValue()).c0(list);
                            if (m8bVarC0.j()) {
                                m8bVarC0 = null;
                            }
                            if (m8bVarC0 != null) {
                                return new bp3(false);
                            }
                            jArr = m8bVarC0.b;
                            jArr2 = m8bVarC0.a;
                            length = jArr2.length - 2;
                            if (length >= 0) {
                                i2 = 0;
                                loop0: while (true) {
                                    j2 = jArr2[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (i4 = 0; i4 < i3; i4++) {
                                            if ((j2 & 255) < 128) {
                                                long j4 = jArr[(i2 << 3) + i4];
                                                xn3 xn3Var = (xn3) ny8Var.getValue();
                                                kx2Var = null;
                                                cp3Var2.e = null;
                                                cp3Var2.d = j3;
                                                cp3Var2.h = i;
                                                objV = xn3Var.v(j4, cp3Var2);
                                                if (objV == hu4Var) {
                                                    objI = objV;
                                                    break loop0;
                                                }
                                                return hu4Var;
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 == 8) {
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                        i = i;
                                    }
                                }
                            }
                            throw new NoSuchElementException("The LongSet is empty");
                        }
                        if (rt2Var != null) {
                            zW0 = rt2Var.w0();
                        } else {
                            zW0 = z3;
                        }
                        return new bp3(zW0);
                    }
                    if (i6 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(objI);
                    kx2Var4 = kx2Var4;
                    z3 = true;
                    kx2Var = null;
                }
                rt2Var = (rt2) objI;
                if (rt2Var.d0() || !rt2Var.w0() || rt2Var.C0()) {
                    z = false;
                } else {
                    z = z3;
                }
                if (z) {
                    z2 = z3;
                } else {
                    nx2Var = rt2Var.b;
                    if (nx2Var != null) {
                        kx2Var2 = nx2Var.c;
                    } else {
                        kx2Var2 = kx2Var;
                    }
                    if (kx2Var2 == kx2Var4) {
                        z2 = z3;
                    } else {
                        if (nx2Var != null) {
                            kx2Var3 = nx2Var.c;
                        } else {
                            kx2Var3 = kx2Var;
                        }
                        if (kx2Var3 == kx2.f) {
                            z2 = z3;
                        } else {
                            z2 = false;
                        }
                    }
                }
                return new bp3(z2, z, rt2Var);
            }
            ch3.d0(objI);
            xn3 xn3Var2 = (xn3) ny8Var.getValue();
            cp3Var2.d = j3;
            cp3Var2.h = 1;
            objI = xn3Var2.i(j3, cp3Var2);
            if (objI == hu4Var2) {
                return hu4Var2;
            }
            rt2Var = (rt2) objI;
            if (rt2Var == null || rt2Var.b.c == kx2Var4 || !rt2Var.A0()) {
                pvb pvbVar = (pvb) this.b.getValue();
                ky kyVar = new ky(Collections.singletonList(new Long(j3)));
                String str = this.a;
                onf onfVar = (onf) this.e.getValue();
                cp3Var2.e = rt2Var;
                cp3Var2.d = j3;
                cp3Var2.h = 2;
                i = 3;
                hu4Var = hu4Var2;
                objE = qe7.E(pvbVar, kyVar, str, 0L, 0, onfVar, null, cp3Var2, 92);
                if (objE == hu4Var) {
                    return hu4Var;
                }
                nz2Var = (nz2) objE;
                if (nz2Var != null) {
                    list = nz2Var.c;
                } else {
                    list = null;
                }
                if (list != null) {
                    m8bVarC0 = ((qw2) this.c.getValue()).c0(list);
                    if (m8bVarC0.j()) {
                        m8bVarC0 = null;
                    }
                    if (m8bVarC0 != null) {
                        return new bp3(false);
                    }
                    jArr = m8bVarC0.b;
                    jArr2 = m8bVarC0.a;
                    length = jArr2.length - 2;
                    if (length >= 0) {
                        i2 = 0;
                        loop0: while (true) {
                            j2 = jArr2[i2];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                i3 = 8 - ((~(i2 - length)) >>> 31);
                                while (i4 < i3) {
                                    if ((j2 & 255) < 128) {
                                        long j5 = jArr[(i2 << 3) + i4];
                                        xn3 xn3Var3 = (xn3) ny8Var.getValue();
                                        kx2Var = null;
                                        cp3Var2.e = null;
                                        cp3Var2.d = j3;
                                        cp3Var2.h = i;
                                        objV = xn3Var3.v(j5, cp3Var2);
                                        if (objV == hu4Var) {
                                            objI = objV;
                                            break loop0;
                                        }
                                        return hu4Var;
                                    }
                                    j2 >>= 8;
                                }
                                if (i3 == 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                                i = i;
                            }
                        }
                        rt2Var = (rt2) objI;
                    }
                    throw new NoSuchElementException("The LongSet is empty");
                }
                if (rt2Var != null) {
                    zW0 = rt2Var.w0();
                } else {
                    zW0 = z3;
                }
                return new bp3(zW0);
            }
            kx2Var4 = kx2Var4;
            z3 = true;
            kx2Var = null;
            if (rt2Var.d0()) {
                z = false;
            } else {
                z = false;
            }
            if (z) {
                z2 = z3;
            } else {
                nx2Var = rt2Var.b;
                if (nx2Var != null) {
                    kx2Var2 = nx2Var.c;
                } else {
                    kx2Var2 = kx2Var;
                }
                if (kx2Var2 == kx2Var4) {
                    z2 = z3;
                } else {
                    if (nx2Var != null) {
                        kx2Var3 = nx2Var.c;
                    } else {
                        kx2Var3 = kx2Var;
                    }
                    if (kx2Var3 == kx2.f) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                }
            }
            return new bp3(z2, z, rt2Var);
        } catch (InterruptedException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception unused) {
            return new bp3(false);
        }
    }
}
