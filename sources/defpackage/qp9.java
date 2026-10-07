package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qp9 implements jwa {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public qp9(byte[] bArr, int i, int i2, String str) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                lvb.R(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                lvb.R(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                lvb.R(z);
                break;
            case "auxiliary.tracks.map":
                lvb.R(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        lvb.Z("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qp9.class == obj.getClass()) {
            qp9 qp9Var = (qp9) obj;
            if (this.a.equals(qp9Var.a) && Arrays.equals(this.b, qp9Var.b) && this.c == qp9Var.c && this.d == qp9Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + zo5.d(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[EDGE_INSN: B:65:0x0137->B:67:0x013d BREAK  A[LOOP:0: B:25:0x008f->B:66:0x0139]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0139 A[LOOP:0: B:25:0x008f->B:66:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x010c A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0089, please report this as an issue */
    public final String toString() {
        String string;
        vq0 vq0Var;
        xq0 vq0Var2;
        uq0 uq0Var;
        char[] cArr;
        int i;
        int length;
        int i2;
        boolean z;
        char[] cArr2;
        int i3;
        uq0 uq0Var2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i4;
        int i5;
        byte b;
        byte b2;
        boolean z2;
        char c;
        char c2;
        char c3;
        char c4;
        String str = this.a;
        byte[] bArr2 = this.b;
        int i6 = this.d;
        if (i6 != 0) {
            if (i6 == 1) {
                string = vqi.s(bArr2);
            } else if (i6 == 23) {
                string = String.valueOf(Float.intBitsToFloat(k4m.c(bArr2)));
            } else if (i6 == 67) {
                string = String.valueOf(k4m.c(bArr2));
            } else if (i6 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr2[0]));
            } else if (i6 != 78) {
                String str2 = vqi.a;
                vq0Var = xq0.d;
                vq0Var2 = vq0Var.c;
                if (vq0Var2 == null) {
                    uq0Var = vq0Var.a;
                    cArr = uq0Var.b;
                    for (char c5 : cArr) {
                        if (n1g.L(c5)) {
                            length = cArr.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    z = false;
                                    break;
                                }
                                c4 = cArr[i2];
                                if (c4 < 'a' && c4 <= 'z') {
                                    z = true;
                                    break;
                                }
                                i2++;
                            }
                            lvb.Z("Cannot call lowerCase() on a mixed-case alphabet", !z);
                            cArr2 = new char[cArr.length];
                            for (i3 = 0; i3 < cArr.length; i3++) {
                                c3 = cArr[i3];
                                if (n1g.L(c3)) {
                                    c3 = (char) (c3 ^ ' ');
                                }
                                cArr2[i3] = c3;
                            }
                            uq0Var2 = new uq0(zo5.w(new StringBuilder(), uq0Var.a, ".lowerCase()"), cArr2);
                            if (uq0Var.h) {
                                uq0Var = uq0Var2;
                                break;
                            }
                            bArr = uq0Var2.g;
                            if (uq0Var2.h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i4 = 65; i4 <= 90; i4++) {
                                    i5 = i4 | 32;
                                    b = bArr[i4];
                                    b2 = bArr[i5];
                                    if (b == -1) {
                                        bArrCopyOf[i4] = b2;
                                    } else {
                                        if (b2 == -1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        c = (char) i4;
                                        c2 = (char) i5;
                                        if (z2) {
                                            ore.k(qe7.z("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                            return null;
                                        }
                                        bArrCopyOf[i5] = b;
                                    }
                                }
                                uq0Var = new uq0(zo5.w(new StringBuilder(), uq0Var2.a, ".ignoreCase()"), uq0Var2.b, bArrCopyOf, true);
                                break;
                            }
                            uq0Var = uq0Var2;
                            break;
                        }
                    }
                    if (uq0Var == vq0Var.a) {
                        vq0Var2 = vq0Var;
                    } else {
                        Character ch = vq0Var.b;
                        vq0Var2 = new vq0(uq0Var);
                    }
                    vq0Var.c = vq0Var2;
                }
                int length2 = bArr2.length;
                lvb.Y(0, length2, bArr2.length);
                uq0 uq0Var3 = vq0Var2.a;
                int i7 = uq0Var3.e;
                int i8 = uq0Var3.f;
                RoundingMode roundingMode = RoundingMode.CEILING;
                StringBuilder sb = new StringBuilder(g4m.b(length2, i8) * i7);
                try {
                    vq0Var2.b(sb, bArr2, length2);
                    string = sb.toString();
                } catch (IOException e) {
                    c.e(e);
                    return null;
                }
            } else {
                string = String.valueOf(new nmc(bArr2).G());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbC = nbh.C("track types = ");
            new ste(String.valueOf(','), 1).a(sbC, arrayListD.iterator());
            string = sbC.toString();
        } else {
            String str3 = vqi.a;
            vq0Var = xq0.d;
            vq0Var2 = vq0Var.c;
            if (vq0Var2 == null) {
                uq0Var = vq0Var.a;
                cArr = uq0Var.b;
                while (i < r7) {
                    if (n1g.L(c5)) {
                        length = cArr.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            c4 = cArr[i2];
                            if (c4 < 'a') {
                            }
                            i2++;
                        }
                        lvb.Z("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        cArr2 = new char[cArr.length];
                        while (i3 < cArr.length) {
                            c3 = cArr[i3];
                            if (n1g.L(c3)) {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        uq0Var2 = new uq0(zo5.w(new StringBuilder(), uq0Var.a, ".lowerCase()"), cArr2);
                        if (uq0Var.h) {
                            uq0Var = uq0Var2;
                            break;
                        }
                        bArr = uq0Var2.g;
                        if (uq0Var2.h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i4 <= 90) {
                                i5 = i4 | 32;
                                b = bArr[i4];
                                b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    if (b2 == -1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c = (char) i4;
                                    c2 = (char) i5;
                                    if (z2) {
                                        ore.k(qe7.z("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                                        return null;
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                            }
                            uq0Var = new uq0(zo5.w(new StringBuilder(), uq0Var2.a, ".ignoreCase()"), uq0Var2.b, bArrCopyOf, true);
                            break;
                        }
                        uq0Var = uq0Var2;
                        break;
                    }
                }
                if (uq0Var == vq0Var.a) {
                    vq0Var2 = vq0Var;
                } else {
                    Character ch2 = vq0Var.b;
                    vq0Var2 = new vq0(uq0Var);
                }
                vq0Var.c = vq0Var2;
            }
            int length3 = bArr2.length;
            lvb.Y(0, length3, bArr2.length);
            uq0 uq0Var4 = vq0Var2.a;
            int i9 = uq0Var4.e;
            int i10 = uq0Var4.f;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            StringBuilder sb2 = new StringBuilder(g4m.b(length3, i10) * i9);
            vq0Var2.b(sb2, bArr2, length3);
            string = sb2.toString();
        }
        return qv1.l("mdta: key=", str, ", value=", string);
    }
}
