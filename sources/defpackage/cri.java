package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cri implements aw8 {
    public static final cri a = new cri();
    public static final thd b = new thd("kotlin.uuid.Uuid", phd.h);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        u76Var.C(((bri) obj).toString());
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        String strY = r55Var.y();
        int length = strY.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strY.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = av7.c[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                t2m.d(i, strY, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strY.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = av7.c[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                t2m.d(i2, strY, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new bri(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strY.length() <= 64 ? strY : strY.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strY.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strY.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = av7.c[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                t2m.d(i, strY, "a hexadecimal digit");
                throw null;
            }
            if (strY.charAt(8) != '-') {
                t2m.d(8, strY, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strY.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = av7.c[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                t2m.d(i3, strY, "a hexadecimal digit");
                throw null;
            }
            if (strY.charAt(13) != '-') {
                t2m.d(13, strY, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strY.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = av7.c[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                t2m.d(i4, strY, "a hexadecimal digit");
                throw null;
            }
            if (strY.charAt(18) != '-') {
                t2m.d(18, strY, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strY.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = av7.c[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                t2m.d(i5, strY, "a hexadecimal digit");
                throw null;
            }
            if (strY.charAt(23) != '-') {
                t2m.d(23, strY, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strY.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = av7.c[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                t2m.d(i6, strY, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new bri(j22, j23);
            }
        }
        return bri.c;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
