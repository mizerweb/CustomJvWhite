package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public abstract class qe7 {
    public static pe7 a;
    public static final Object[] b = new Object[0];
    public static final long[] c = {1, 2, 5, 10, 16};
    public static final int[][] d = {new int[]{-46922, -30155}, new int[]{-14019, -31958}, new int[]{-15408683, -16529630}, new int[]{-16197645, -11298561}, new int[]{-4220929, -11374849}};
    public static final int[] e = {R.attr.stateListAnimator};
    public static boolean f;

    /* JADX WARN: Code duplicated, block: B:103:0x017a A[LOOP:5: B:102:0x0178->B:103:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7 A[LOOP:7: B:113:0x01b5->B:114:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:144:0x0241  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245  */
    /* JADX WARN: Code duplicated, block: B:148:0x0249  */
    /* JADX WARN: Code duplicated, block: B:150:0x024d  */
    /* JADX WARN: Code duplicated, block: B:151:0x024f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0252  */
    /* JADX WARN: Code duplicated, block: B:153:0x0255  */
    /* JADX WARN: Code duplicated, block: B:155:0x0258  */
    /* JADX WARN: Code duplicated, block: B:156:0x025a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x026b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0277 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0279  */
    /* JADX WARN: Code duplicated, block: B:169:0x028c  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0233 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0173 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x014b  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0163  */
    public static long C(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        long j2;
        char cCharAt;
        lw5 lw5Var;
        char cCharAt2;
        lw5 lw5Var2;
        long jH;
        int i9;
        int iMin;
        int i10;
        int i11;
        int i12;
        int iMin2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        double d2;
        long jL;
        char cCharAt3;
        int i18;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        li9 li9Var;
        int i19;
        char cCharAt7;
        int i20;
        if (str.length() == 0) {
            ore.p("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i21 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            ore.p("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            ore.p("");
            return 0L;
        }
        int i22 = i2 + 1;
        if (i22 == str.length()) {
            ore.p("");
            return 0L;
        }
        int i23 = 0;
        lw5 lw5Var3 = null;
        long jL2 = 0;
        long j3 = 0;
        while (i22 < str.length()) {
            char cCharAt9 = str.charAt(i22);
            if (cCharAt9 != 'T') {
                li9 li9Var2 = li9.d;
                cpk.a();
                li9 li9Var3 = li9.d;
                if (li9Var3.a) {
                    i3 = i21;
                    char cCharAt10 = str.charAt(i22);
                    if (cCharAt10 == c3) {
                        i4 = i22 + 1;
                        i5 = i3;
                    } else if (cCharAt10 == c2) {
                        i4 = i22 + 1;
                        i5 = -1;
                    }
                    while (i4 < str.length() && str.charAt(i4) == '0') {
                        i4++;
                    }
                    j = 0;
                    while (true) {
                        if (i4 < str.length()) {
                            cCharAt6 = str.charAt(i4);
                            li9Var = li9Var3;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i19 = cCharAt6 - '0';
                                if (j <= li9Var.b) {
                                    if (j == li9Var.b) {
                                        i20 = i;
                                        if (i19 > li9Var.c) {
                                            i7 = i20;
                                        }
                                    } else {
                                        i20 = i;
                                    }
                                    int i24 = i20;
                                    j = (j << 3) + (j << i3) + ((long) i19);
                                    i4++;
                                    li9Var3 = li9Var;
                                    i22 = i22;
                                    i = i24;
                                } else {
                                    i7 = i;
                                }
                                int i25 = i22;
                                while (i4 < str.length() && '0' <= (cCharAt7 = str.charAt(i4)) && cCharAt7 < ':') {
                                    i4++;
                                }
                                if (i4 != str.length()) {
                                    if (i4 != i25 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i3 : 0)) {
                                        li9 li9Var4 = li9.d;
                                        j = 4611686018427387903L;
                                    }
                                }
                                ore.p("");
                                return 0L;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i4);
                            lw5Var = lw5.SECONDS;
                            if (cCharAt == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                for (i10 = i9; i10 < iMin; i10++) {
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i12 = 0; i12 < 6 - (i10 - i9); i12++) {
                                            i11 = (i11 << 1) + (i11 << 3);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i13 = i10;
                                        i14 = 0;
                                        while (true) {
                                            if (i13 < iMin2) {
                                                i18 = iMin2;
                                                cCharAt4 = str.charAt(i13);
                                                i15 = i13;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                                    i13 = i15 + 1;
                                                    iMin2 = i18;
                                                }
                                            } else {
                                                i15 = i13;
                                            }
                                        }
                                        for (i16 = 0; i16 < 9 - (i15 - i10); i16++) {
                                            i14 = (i14 << 1) + (i14 << 3);
                                        }
                                        i17 = i15;
                                        while (i17 < str.length() && '0' <= (cCharAt3 = str.charAt(i17)) && cCharAt3 < ':') {
                                            i17++;
                                        }
                                        if (i17 != i9 || i17 == str.length() || str.charAt(i17) != 'S') {
                                            ore.p("");
                                            return 0L;
                                        }
                                        int i26 = i17;
                                        long j4 = (((long) i11) * 1000000000) + ((long) i14);
                                        long j5 = i5;
                                        double d3 = j4;
                                        switch (lw5Var.ordinal()) {
                                            case 0:
                                                d2 = 1.0E-15d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 1:
                                                d2 = 1.0E-12d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 2:
                                                d2 = 1.0E-9d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 3:
                                                d2 = 1.0E-6d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 4:
                                                d2 = 6.0E-5d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 5:
                                                d2 = 0.0036d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            case 6:
                                                d2 = 0.0864d;
                                                jL = gm0.L(d3 * d2);
                                                break;
                                            default:
                                                qr7.v(lw5Var, "Unknown unit: ");
                                                jL = 0;
                                                break;
                                        }
                                        j3 = jL * j5;
                                        i4 = i26;
                                    } else {
                                        i11 = (cCharAt5 - '0') + (i11 << 3) + (i11 << 1);
                                    }
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i18 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i18;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i17 = i15;
                                while (i17 < str.length()) {
                                    i17++;
                                }
                                if (i17 != i9) {
                                }
                                ore.p("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i4);
                            lw5Var2 = lw5.DAYS;
                            if (cCharAt2 == 'D') {
                                lw5Var = lw5Var2;
                            } else if (cCharAt2 == 'H') {
                                lw5Var = lw5.HOURS;
                            } else if (cCharAt2 == 'M') {
                                lw5Var = lw5.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                lw5Var = null;
                            }
                            if (lw5Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (lw5Var3 == null && lw5Var3.compareTo(lw5Var) <= 0) {
                                ore.p("Unexpected order of duration components");
                                return 0L;
                            }
                            if (lw5Var == lw5Var2) {
                                if (i23 != 0) {
                                    ore.p("");
                                    return 0L;
                                }
                                jL2 = sb8.l(j2, lw5Var) * ((long) i5);
                            } else {
                                if (i23 == 0) {
                                    ore.p("");
                                    return 0L;
                                }
                                jH = h(jL2, sb8.l(j2, lw5Var) * ((long) i5));
                                if (jH == 9223372036854759646L) {
                                    ore.p("");
                                    return 0L;
                                }
                                jL2 = jH;
                            }
                            i22 = i4 + 1;
                            lw5Var3 = lw5Var;
                            i21 = i3;
                            i = i7;
                            c2 = '-';
                            c3 = '+';
                        }
                        i6 = i22;
                        i7 = i;
                        if (i4 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i8 = i3;
                            } else {
                                i8 = 0;
                            }
                            if (i4 == i6 + i8) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i4);
                            lw5Var = lw5.SECONDS;
                            if (cCharAt == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 1) + (i11 << 3);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i13 = i10;
                                    i14 = 0;
                                    while (true) {
                                        if (i13 < iMin2) {
                                            i18 = iMin2;
                                            cCharAt4 = str.charAt(i13);
                                            i15 = i13;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i15 = i13;
                                        }
                                        i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                        i13 = i15 + 1;
                                        iMin2 = i18;
                                    }
                                    while (i16 < 9 - (i15 - i10)) {
                                        i14 = (i14 << 1) + (i14 << 3);
                                    }
                                    i17 = i15;
                                    while (i17 < str.length()) {
                                        i17++;
                                    }
                                    if (i17 != i9) {
                                    }
                                    ore.p("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i18 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i18;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i17 = i15;
                                while (i17 < str.length()) {
                                    i17++;
                                }
                                if (i17 != i9) {
                                }
                                ore.p("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i4);
                            lw5Var2 = lw5.DAYS;
                            if (cCharAt2 == 'D') {
                                lw5Var = lw5Var2;
                            } else if (cCharAt2 == 'H') {
                                lw5Var = lw5.HOURS;
                            } else if (cCharAt2 == 'M') {
                                lw5Var = lw5.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                lw5Var = null;
                            }
                            if (lw5Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (lw5Var3 == null) {
                            }
                            if (lw5Var == lw5Var2) {
                                if (i23 != 0) {
                                    ore.p("");
                                    return 0L;
                                }
                                jL2 = sb8.l(j2, lw5Var) * ((long) i5);
                            } else {
                                if (i23 == 0) {
                                    ore.p("");
                                    return 0L;
                                }
                                jH = h(jL2, sb8.l(j2, lw5Var) * ((long) i5));
                                if (jH == 9223372036854759646L) {
                                    ore.p("");
                                    return 0L;
                                }
                                jL2 = jH;
                            }
                            i22 = i4 + 1;
                            lw5Var3 = lw5Var;
                            i21 = i3;
                            i = i7;
                            c2 = '-';
                            c3 = '+';
                        }
                        ore.p("");
                        return 0L;
                    }
                }
                i3 = i21;
                i4 = i22;
                i5 = i3;
                while (i4 < str.length()) {
                    i4++;
                }
                j = 0;
                while (true) {
                    if (i4 < str.length()) {
                        cCharAt6 = str.charAt(i4);
                        li9Var = li9Var3;
                        if ('0' > cCharAt6) {
                        }
                    }
                    i6 = i22;
                    i7 = i;
                    if (i4 == str.length()) {
                        if (cCharAt9 != '+') {
                            i8 = i3;
                        } else {
                            i8 = i3;
                        }
                        if (i4 == i6 + i8) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i4);
                        lw5Var = lw5.SECONDS;
                        if (cCharAt == '.') {
                            i9 = i4 + 1;
                            iMin = Math.min(i4 + 7, str.length());
                            i11 = 0;
                            while (i10 < iMin) {
                                cCharAt5 = str.charAt(i10);
                                if ('0' <= cCharAt5) {
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i13 = i10;
                                i14 = 0;
                                while (true) {
                                    if (i13 < iMin2) {
                                        i18 = iMin2;
                                        cCharAt4 = str.charAt(i13);
                                        i15 = i13;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i15 = i13;
                                    }
                                    i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                    i13 = i15 + 1;
                                    iMin2 = i18;
                                }
                                while (i16 < 9 - (i15 - i10)) {
                                    i14 = (i14 << 1) + (i14 << 3);
                                }
                                i17 = i15;
                                while (i17 < str.length()) {
                                    i17++;
                                }
                                if (i17 != i9) {
                                }
                                ore.p("");
                                return 0L;
                            }
                            while (i12 < 6 - (i10 - i9)) {
                                i11 = (i11 << 1) + (i11 << 3);
                            }
                            iMin2 = Math.min(i10 + 9, str.length());
                            i13 = i10;
                            i14 = 0;
                            while (true) {
                                if (i13 < iMin2) {
                                    i18 = iMin2;
                                    cCharAt4 = str.charAt(i13);
                                    i15 = i13;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i15 = i13;
                                }
                                i14 = (cCharAt4 - '0') + (i14 << 3) + (i14 << 1);
                                i13 = i15 + 1;
                                iMin2 = i18;
                            }
                            while (i16 < 9 - (i15 - i10)) {
                                i14 = (i14 << 1) + (i14 << 3);
                            }
                            i17 = i15;
                            while (i17 < str.length()) {
                                i17++;
                            }
                            if (i17 != i9) {
                            }
                            ore.p("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i4);
                        lw5Var2 = lw5.DAYS;
                        if (cCharAt2 == 'D') {
                            lw5Var = lw5Var2;
                        } else if (cCharAt2 == 'H') {
                            lw5Var = lw5.HOURS;
                        } else if (cCharAt2 == 'M') {
                            lw5Var = lw5.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            lw5Var = null;
                        }
                        if (lw5Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                        }
                        if (lw5Var3 == null) {
                        }
                        if (lw5Var == lw5Var2) {
                            if (i23 != 0) {
                                ore.p("");
                                return 0L;
                            }
                            jL2 = sb8.l(j2, lw5Var) * ((long) i5);
                        } else {
                            if (i23 == 0) {
                                ore.p("");
                                return 0L;
                            }
                            jH = h(jL2, sb8.l(j2, lw5Var) * ((long) i5));
                            if (jH == 9223372036854759646L) {
                                ore.p("");
                                return 0L;
                            }
                            jL2 = jH;
                        }
                        i22 = i4 + 1;
                        lw5Var3 = lw5Var;
                        i21 = i3;
                        i = i7;
                        c2 = '-';
                        c3 = '+';
                    }
                    ore.p("");
                    return 0L;
                    int i27 = i20;
                    j = (j << 3) + (j << i3) + ((long) i19);
                    i4++;
                    li9Var3 = li9Var;
                    i22 = i22;
                    i = i27;
                }
            } else {
                if (i23 != 0 || (i22 = i22 + 1) == str.length()) {
                    ore.p("");
                    return 0L;
                }
                i23 = i21;
            }
        }
        int i28 = i;
        long jP = ew5.p(P(jL2, lw5.MILLISECONDS), P(j3, lw5.NANOSECONDS));
        return (i28 == 0 || ew5.f(jP, ew5.e)) ? jP : ew5.v(jP);
    }

    public static final Map D(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || r5h.X0(encodedQuery)) {
            return s66.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        int i = 0;
        do {
            int iU0 = r5h.U0(encodedQuery, '&', i, 4);
            if (iU0 == -1) {
                iU0 = encodedQuery.length();
            }
            int iU1 = r5h.U0(encodedQuery, '=', i, 4);
            if (iU1 > iU0 || iU1 == -1) {
                iU1 = iU0;
            }
            String strSubstring = encodedQuery.substring(i, iU1);
            int i2 = iU1 + 1;
            if (i2 > iU0) {
                i2 = iU0;
            }
            linkedHashMap.put(Uri.decode(strSubstring), Uri.decode(encodedQuery.substring(i2, iU0)));
            i = iU0 + 1;
        } while (i < encodedQuery.length());
        return linkedHashMap;
    }

    public static Object E(pvb pvbVar, hih hihVar, String str, long j, int i, onf onfVar, nv4 nv4Var, nq4 nq4Var, int i2) {
        long jO;
        if ((i2 & 4) != 0) {
            ghb ghbVar = ew5.b;
            jO = O(1, lw5.SECONDS);
        } else {
            jO = j;
        }
        return F(hihVar, new qob(pvbVar, (lq4) null, 3), str, (i2 & 8) != 0 ? 2 : i, jO, (i2 & 16) == 0, (i2 & 32) != 0 ? null : onfVar, new bp(2, (i2 & 64) != 0 ? null : nv4Var, wk8.class, "suspendConversion0", "requestWithRetry_SBKQj6I$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), nq4Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:67|27|81|28|(6:31|32|33|62|(0)|68)|73) */
    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:48:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0224  */
    /* JADX WARN: Code duplicated, block: B:71:0x0228  */
    /* JADX WARN: Code duplicated, block: B:75:0x024a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0120, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0121, code lost:
    
        r19 = r1;
        r1 = r0;
        r0 = r5;
        r5 = r4;
        r4 = r11;
        r11 = r14;
        r14 = r3;
        r3 = r15;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        r8 = (defpackage.rnf) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if (defpackage.onf.a(r8.q) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        r1 = r8.s;
        r8 = defpackage.dp.h;
        r13.d = r15;
        r13.e = r14;
        r13.f = r5;
        r13.g = r4;
        r13.h = r12;
        r13.i = r11;
        r13.j = null;
        r13.k = r0;
        r13.m = r6;
        r13.n = r10;
        r13.l = r3;
        r13.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0161, code lost:
    
        if (defpackage.e9i.O(r1, r8, r13) != r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0165, code lost:
    
        r1 = r12;
        r12 = r4;
        r4 = r10;
        r10 = r11;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016e, code lost:
    
        r0 = r12;
        r8 = r15;
        r15 = r1;
        r11 = r6;
        r5 = r5;
        r13 = r13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x010d -> B:62:0x0209). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ef -> B:60:0x01f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(defpackage.hih r21, defpackage.qf7 r22, java.lang.String r23, int r24, long r25, boolean r27, defpackage.onf r28, defpackage.bp r29, defpackage.nq4 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe7.F(hih, qf7, java.lang.String, int, long, boolean, onf, bp, nq4):java.lang.Object");
    }

    public static /* synthetic */ Object G(hih hihVar, qf7 qf7Var, String str, long j, onf onfVar, nq4 nq4Var, int i) {
        long jO;
        if ((i & 16) != 0) {
            ghb ghbVar = ew5.b;
            jO = O(1, lw5.SECONDS);
        } else {
            jO = j;
        }
        return F(hihVar, qf7Var, str, 10, jO, true, onfVar, null, nq4Var);
    }

    public static final void H(View view, long j, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new q45(j, onClickListener));
        } else {
            view.setOnClickListener(null);
        }
    }

    public static /* synthetic */ void I(View view, View.OnClickListener onClickListener) {
        H(view, 300L, onClickListener);
    }

    public static void J(rq rqVar, float f2) {
        int integer = rqVar.getResources().getInteger(ru.oneme.app.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ru.oneme.app.R.attr.state_liftable, -ru.oneme.app.R.attr.state_lifted}, ObjectAnimator.ofFloat(rqVar, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(rqVar, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(rqVar, "elevation", 0.0f).setDuration(0L));
        rqVar.setStateListAnimator(stateListAnimator);
    }

    public static final void K(int i, Drawable drawable) {
        if (drawable != null) {
            drawable.setTint(i);
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
        }
    }

    public static final Object[] L(Collection collection) {
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final Object[] M(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final long N(double d2, lw5 lw5Var) {
        double dK = sb8.k(d2, lw5Var, lw5.NANOSECONDS);
        if (Double.isNaN(dK)) {
            ore.p("Duration value cannot be NaN.");
            return 0L;
        }
        long jL = gm0.L(dK);
        return (-4611686018426999999L > jL || jL >= 4611686018427000000L) ? q(gm0.L(sb8.k(d2, lw5Var, lw5.MILLISECONDS))) : r(jL);
    }

    public static final long O(int i, lw5 lw5Var) {
        if (lw5Var.compareTo(lw5.SECONDS) > 0) {
            return P(i, lw5Var);
        }
        return r(TimeUnit.NANOSECONDS.convert(i, lw5Var.a));
    }

    public static final long P(long j, lw5 lw5Var) {
        TimeUnit timeUnit = lw5Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return r(timeUnit2.convert(j, timeUnit));
        }
        if (lw5Var.compareTo(lw5.MILLISECONDS) < 0) {
            return p(oc9.x(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return p(sb8.l(Math.abs(j), lw5Var) * jSignum);
    }

    public static final void Q(gdi gdiVar) {
        gdiVar.d(931, new mh(29));
        gdiVar.d(932, new cp0(0));
        gdiVar.d(933, new cp0(1));
        gdiVar.d(934, new cp0(2));
        gdiVar.d(935, new dp0(0));
        gdiVar.d(936, new dp0(1));
    }

    public static final void R(gdi gdiVar) {
        gdiVar.d(140, new cp0(24));
        gdiVar.d(141, new t62(4));
        gdiVar.d(142, new cp0(25));
        gdiVar.d(143, new f(25));
        gdiVar.b(2, new f(24));
    }

    public static final void S(gdi gdiVar) {
        gdiVar.d(148, new lf9(2));
        gdiVar.d(149, new lf9(3));
        gdiVar.d(150, new lf9(4));
        gdiVar.d(151, new lf9(5));
        gdiVar.d(152, new zc9(10));
        gdiVar.d(153, new zc9(11));
    }

    public static final void T(gdi gdiVar) {
        gdiVar.d(828, new jld(7));
        gdiVar.d(826, new jld(8));
        gdiVar.d(818, new t62(11));
        gdiVar.d(820, new ci3(23));
        gdiVar.d(819, new t62(19));
        gdiVar.d(829, new ci3(24));
        gdiVar.d(830, new t62(20));
        gdiVar.b(3, new pwb(15));
        gdiVar.d(822, new rwb(24));
        gdiVar.d(836, new pwb(16));
        gdiVar.d(837, new rwb(25));
        gdiVar.d(823, new rwb(26));
        gdiVar.d(831, new rwb(27));
        gdiVar.d(833, new rwb(28));
        gdiVar.d(835, new rwb(29));
        gdiVar.d(821, new jnd(0));
        gdiVar.d(824, new jnd(1));
        gdiVar.d(825, new jnd(2));
        gdiVar.d(832, new rwb(22));
        gdiVar.d(834, new rwb(23));
    }

    public static final void U(gdi gdiVar) {
        gdiVar.d(689, new qqg(29));
        gdiVar.d(690, new r1i(0));
        gdiVar.d(691, new r1i(1));
        gdiVar.d(692, new r1i(2));
        gdiVar.d(289, new r1i(3));
        gdiVar.d(693, new r1i(4));
        gdiVar.d(694, new r1i(5));
        gdiVar.d(695, new r1i(6));
        gdiVar.d(696, new r1i(7));
        gdiVar.d(317, new qqg(24));
        gdiVar.d(697, new qqg(25));
        gdiVar.d(698, new qqg(26));
        gdiVar.d(699, new qqg(27));
        gdiVar.d(700, new qqg(28));
        gdiVar.d(HttpStatus.SC_UNAUTHORIZED, new h35(8));
        gdiVar.d(HttpStatus.SC_PAYMENT_REQUIRED, new mu2(12));
        gdiVar.d(HttpStatus.SC_FORBIDDEN, new mu2(13));
        gdiVar.d(HttpStatus.SC_NOT_FOUND, new h35(19));
        gdiVar.d(HttpStatus.SC_METHOD_NOT_ALLOWED, new i35(0));
        gdiVar.d(374, new i35(11));
        gdiVar.d(HttpStatus.SC_SEE_OTHER, new i35(22));
        gdiVar.d(311, new i35(24));
        gdiVar.d(HttpStatus.SC_NOT_ACCEPTABLE, new i35(25));
        gdiVar.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED, new i35(26));
        gdiVar.d(HttpStatus.SC_REQUEST_TIMEOUT, new i35(27));
        gdiVar.d(HttpStatus.SC_CONFLICT, new ci3(28));
        gdiVar.d(HttpStatus.SC_GONE, new mu2(14));
        gdiVar.d(HttpStatus.SC_LENGTH_REQUIRED, new ci3(29));
        gdiVar.d(HttpStatus.SC_PRECONDITION_FAILED, new h35(0));
        gdiVar.d(HttpStatus.SC_REQUEST_TOO_LONG, new h35(1));
        gdiVar.d(HttpStatus.SC_REQUEST_URI_TOO_LONG, new h35(2));
        gdiVar.d(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, new h35(3));
        gdiVar.d(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, new h35(4));
        gdiVar.d(HttpStatus.SC_EXPECTATION_FAILED, new h35(5));
        gdiVar.d(418, new h35(6));
        gdiVar.d(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, new h35(7));
        gdiVar.d(HttpStatus.SC_METHOD_FAILURE, new h35(9));
        gdiVar.d(421, new h35(10));
        gdiVar.d(HttpStatus.SC_UNPROCESSABLE_ENTITY, new h35(11));
        gdiVar.d(HttpStatus.SC_LOCKED, new h35(12));
        gdiVar.d(HttpStatus.SC_FAILED_DEPENDENCY, new h35(13));
        gdiVar.d(425, new h35(14));
        gdiVar.d(426, new h35(15));
        gdiVar.d(427, new h35(16));
        gdiVar.d(428, new h35(17));
        gdiVar.d(429, new h35(18));
        gdiVar.d(430, new h35(20));
        gdiVar.d(431, new h35(21));
        gdiVar.d(432, new h35(22));
        gdiVar.d(433, new h35(23));
        gdiVar.d(434, new h35(24));
        gdiVar.d(435, new h35(25));
        gdiVar.d(436, new h35(26));
        gdiVar.d(437, new h35(27));
        gdiVar.d(438, new h35(28));
        gdiVar.d(439, new h35(29));
        gdiVar.d(137, new i35(1));
        gdiVar.d(260, new i35(2));
        gdiVar.d(284, new i35(3));
        gdiVar.d(285, new i35(4));
        gdiVar.d(440, new i35(5));
        gdiVar.d(441, new i35(6));
        gdiVar.d(442, new i35(7));
        gdiVar.d(443, new i35(8));
        gdiVar.d(444, new i35(9));
        gdiVar.d(312, new i35(10));
        gdiVar.d(168, new i35(12));
        gdiVar.d(12, new i35(13));
        gdiVar.d(49, new i35(14));
        gdiVar.d(47, new i35(15));
        gdiVar.d(445, new i35(16));
        gdiVar.d(446, new i35(17));
        gdiVar.d(447, new i35(18));
        gdiVar.d(448, new i35(19));
        gdiVar.d(449, new i35(20));
        gdiVar.d(450, new i35(21));
        gdiVar.d(451, new i35(23));
        gdiVar.d(454, new jnd(17));
        gdiVar.d(455, new d7f(10));
        gdiVar.d(456, new jnd(28));
        gdiVar.d(HttpStatus.SC_NOT_MODIFIED, new z6f(9));
        gdiVar.d(86, new d7f(28));
        gdiVar.d(146, new e7f(9));
        gdiVar.d(457, new e7f(20));
        gdiVar.d(292, new f7f(1));
        gdiVar.d(458, new f7f(12));
        gdiVar.d(459, new f7f(23));
        gdiVar.d(460, new g7f(4));
        gdiVar.d(155, new g7f(15));
        gdiVar.d(154, new a7f(0));
        gdiVar.d(341, new a7f(11));
        gdiVar.b(2, new pwb(18));
        gdiVar.d(461, new a7f(22));
        gdiVar.d(462, new b7f(3));
        gdiVar.d(325, new b7f(14));
        gdiVar.d(463, new b7f(25));
        gdiVar.d(326, new c7f(6));
        gdiVar.d(464, new c7f(17));
        gdiVar.d(465, new c7f(28));
        gdiVar.d(324, new d7f(9));
        gdiVar.d(466, new d7f(18));
        gdiVar.d(114, new d7f(19));
        gdiVar.d(116, new d7f(20));
        gdiVar.d(467, new d7f(21));
        gdiVar.d(290, new d7f(22));
        gdiVar.d(468, new d7f(23));
        gdiVar.d(469, new d7f(24));
        gdiVar.d(470, new d7f(25));
        gdiVar.d(300, new d7f(26));
        gdiVar.d(252, new d7f(27));
        gdiVar.d(157, new d7f(29));
        gdiVar.d(99, new e7f(0));
        gdiVar.d(471, new y6f(7));
        gdiVar.d(472, new y6f(13));
        gdiVar.d(473, new y6f(14));
        gdiVar.d(474, new y6f(15));
        gdiVar.d(475, new y6f(16));
        gdiVar.d(476, new e7f(1));
        gdiVar.d(477, new e7f(2));
        gdiVar.d(132, new e7f(3));
        gdiVar.d(287, new e7f(4));
        gdiVar.d(478, new e7f(5));
        gdiVar.d(479, new z6f(20));
        gdiVar.d(480, new e7f(6));
        gdiVar.d(219, new e7f(7));
        gdiVar.d(481, new e7f(8));
        gdiVar.d(482, new e7f(10));
        gdiVar.d(483, new e7f(11));
        gdiVar.d(484, new e7f(12));
        gdiVar.d(485, new e7f(13));
        gdiVar.d(486, new e7f(14));
        gdiVar.d(136, new e7f(15));
        gdiVar.d(487, new z6f(23));
        gdiVar.d(488, new z6f(24));
        gdiVar.d(489, new z6f(25));
        gdiVar.d(490, new z6f(26));
        gdiVar.d(491, new z6f(27));
        gdiVar.d(492, new jnd(7));
        gdiVar.d(493, new jnd(8));
        gdiVar.d(494, new e7f(16));
        gdiVar.d(228, new e7f(17));
        gdiVar.d(495, new e7f(18));
        gdiVar.d(221, new e7f(19));
        gdiVar.d(496, new e7f(21));
        gdiVar.d(115, new e7f(22));
        gdiVar.d(222, new e7f(23));
        gdiVar.d(261, new e7f(24));
        gdiVar.d(131, new e7f(25));
        gdiVar.d(497, new e7f(26));
        gdiVar.d(144, new e7f(27));
        gdiVar.d(498, new e7f(28));
        gdiVar.b(2, new pwb(19));
        gdiVar.d(499, new jnd(9));
        gdiVar.d(500, new jnd(10));
        gdiVar.d(HttpStatus.SC_NOT_IMPLEMENTED, new jnd(11));
        gdiVar.d(HttpStatus.SC_BAD_GATEWAY, new jnd(12));
        gdiVar.d(HttpStatus.SC_SERVICE_UNAVAILABLE, new jnd(13));
        gdiVar.d(HttpStatus.SC_GATEWAY_TIMEOUT, new jnd(14));
        gdiVar.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, new e7f(29));
        gdiVar.d(506, new f7f(0));
        gdiVar.d(HttpStatus.SC_INSUFFICIENT_STORAGE, new f7f(2));
        gdiVar.d(508, new f7f(3));
        gdiVar.d(509, new f7f(4));
        gdiVar.d(227, new f7f(5));
        gdiVar.b(2, new pwb(20));
        gdiVar.d(510, new f7f(6));
        gdiVar.d(511, new f7f(7));
        gdiVar.d(138, new f7f(8));
        gdiVar.d(np0.o, new f7f(9));
        gdiVar.d(355, new f7f(10));
        gdiVar.d(363, new f7f(11));
        gdiVar.d(513, new f7f(13));
        gdiVar.d(514, new f7f(14));
        gdiVar.d(515, new f7f(15));
        gdiVar.d(139, new f7f(16));
        gdiVar.d(356, new f7f(17));
        gdiVar.d(516, new f7f(18));
        gdiVar.d(517, new f7f(19));
        gdiVar.d(362, new f7f(20));
        gdiVar.d(357, new f7f(21));
        gdiVar.d(358, new f7f(22));
        gdiVar.d(518, new f7f(24));
        gdiVar.d(226, new f7f(25));
        gdiVar.b(2, new pwb(21));
        gdiVar.d(519, new f7f(26));
        gdiVar.d(520, new f7f(27));
        gdiVar.d(294, new f7f(28));
        gdiVar.d(521, new f7f(29));
        gdiVar.d(522, new g7f(0));
        gdiVar.d(523, new g7f(1));
        gdiVar.d(122, new g7f(2));
        gdiVar.d(156, new g7f(3));
        gdiVar.d(524, new g7f(5));
        gdiVar.d(525, new g7f(6));
        gdiVar.d(526, new g7f(7));
        gdiVar.d(527, new g7f(8));
        gdiVar.d(528, new g7f(9));
        gdiVar.d(529, new g7f(10));
        gdiVar.d(530, new g7f(11));
        gdiVar.d(531, new g7f(12));
        gdiVar.d(532, new g7f(13));
        gdiVar.d(533, new g7f(14));
        gdiVar.d(534, new jld(20));
        gdiVar.d(535, new jld(21));
        gdiVar.d(536, new jld(22));
        gdiVar.d(309, new jld(23));
        gdiVar.d(537, new jld(24));
        gdiVar.d(538, new jld(25));
        gdiVar.d(539, new jld(26));
        gdiVar.d(540, new jld(27));
        gdiVar.d(541, new jld(28));
        gdiVar.d(542, new jnd(15));
        gdiVar.d(543, new jnd(16));
        gdiVar.d(544, new jld(29));
        gdiVar.d(545, new a7f(1));
        gdiVar.d(546, new a7f(2));
        gdiVar.b(2, new pwb(22));
        gdiVar.d(547, new a7f(3));
        gdiVar.d(548, new a7f(4));
        gdiVar.d(549, new a7f(5));
        gdiVar.d(550, new a7f(6));
        gdiVar.d(551, new a7f(7));
        gdiVar.d(552, new a7f(8));
        gdiVar.d(553, new a7f(9));
        gdiVar.d(554, new a7f(10));
        gdiVar.d(555, new a7f(12));
        gdiVar.d(556, new a7f(13));
        gdiVar.d(557, new a7f(14));
        gdiVar.d(558, new a7f(15));
        gdiVar.d(313, new a7f(16));
        gdiVar.d(559, new a7f(17));
        gdiVar.d(560, new a7f(18));
        gdiVar.d(561, new a7f(19));
        gdiVar.d(562, new a7f(20));
        gdiVar.d(133, new a7f(21));
        gdiVar.d(563, new a7f(23));
        gdiVar.d(564, new a7f(24));
        gdiVar.b(2, new pwb(23));
        gdiVar.d(565, new a7f(25));
        gdiVar.d(566, new a7f(26));
        gdiVar.b(7, new pwb(24));
        gdiVar.d(567, new a7f(27));
        gdiVar.d(568, new a7f(28));
        gdiVar.d(315, new a7f(29));
        gdiVar.d(569, new b7f(0));
        gdiVar.d(570, new b7f(1));
        gdiVar.d(134, new b7f(2));
        gdiVar.d(377, new b7f(4));
        gdiVar.d(571, new b7f(5));
        gdiVar.d(572, new b7f(6));
        gdiVar.d(573, new b7f(7));
        gdiVar.d(376, new b7f(8));
        gdiVar.d(306, new b7f(9));
        gdiVar.d(574, new b7f(10));
        gdiVar.d(575, new b7f(11));
        gdiVar.d(576, new b7f(12));
        gdiVar.d(577, new b7f(13));
        gdiVar.d(578, new b7f(15));
        gdiVar.d(579, new b7f(16));
        gdiVar.d(580, new b7f(17));
        gdiVar.d(581, new b7f(18));
        gdiVar.d(582, new b7f(19));
        gdiVar.d(583, new b7f(20));
        gdiVar.d(584, new b7f(21));
        gdiVar.d(585, new b7f(22));
        gdiVar.d(586, new b7f(23));
        gdiVar.d(587, new b7f(24));
        gdiVar.d(588, new b7f(26));
        gdiVar.d(589, new b7f(27));
        gdiVar.d(590, new b7f(28));
        gdiVar.d(591, new b7f(29));
        gdiVar.d(592, new c7f(0));
        gdiVar.d(593, new c7f(1));
        gdiVar.d(594, new c7f(2));
        gdiVar.d(595, new c7f(3));
        gdiVar.d(596, new c7f(4));
        gdiVar.d(597, new c7f(5));
        gdiVar.d(598, new c7f(7));
        gdiVar.d(599, new c7f(8));
        gdiVar.d(600, new c7f(9));
        gdiVar.d(601, new c7f(10));
        gdiVar.b(2, new pwb(25));
        gdiVar.d(602, new c7f(11));
        gdiVar.d(603, new c7f(12));
        gdiVar.d(604, new c7f(13));
        gdiVar.d(605, new c7f(14));
        gdiVar.d(606, new c7f(15));
        gdiVar.d(607, new c7f(16));
        gdiVar.d(608, new c7f(18));
        gdiVar.d(609, new c7f(19));
        gdiVar.d(610, new c7f(20));
        gdiVar.d(223, new c7f(21));
        gdiVar.d(224, new c7f(22));
        gdiVar.d(178, new c7f(23));
        gdiVar.d(611, new jnd(18));
        gdiVar.d(612, new jnd(19));
        gdiVar.d(613, new jnd(20));
        gdiVar.d(614, new jnd(21));
        gdiVar.d(615, new jnd(22));
        gdiVar.d(616, new jnd(23));
        gdiVar.d(296, new jnd(24));
        gdiVar.d(617, new jnd(25));
        gdiVar.d(618, new jnd(26));
        gdiVar.d(619, new c7f(24));
        gdiVar.d(342, new c7f(25));
        gdiVar.d(169, new c7f(26));
        gdiVar.d(286, new jnd(27));
        gdiVar.d(620, new y6f(17));
        gdiVar.d(218, new c7f(27));
        gdiVar.d(621, new jnd(29));
        gdiVar.d(622, new z6f(0));
        gdiVar.d(295, new c7f(29));
        gdiVar.d(623, new z6f(1));
        gdiVar.d(369, new z6f(2));
        gdiVar.d(370, new y6f(18));
        gdiVar.d(371, new y6f(19));
        gdiVar.d(388, new y6f(20));
        gdiVar.d(372, new pwb(27));
        gdiVar.d(373, new pwb(28));
        gdiVar.d(389, new z6f(3));
        gdiVar.d(390, new z6f(4));
        gdiVar.d(624, new d7f(0));
        gdiVar.d(625, new z6f(5));
        gdiVar.d(229, new z6f(6));
        gdiVar.d(177, new z6f(7));
        gdiVar.d(102, new d7f(1));
        gdiVar.d(626, new d7f(2));
        gdiVar.d(627, new z6f(8));
        gdiVar.d(628, new z6f(10));
        gdiVar.d(629, new d7f(3));
        gdiVar.b(2, new pwb(26));
        gdiVar.d(630, new d7f(4));
        gdiVar.d(631, new z6f(11));
        gdiVar.d(632, new pwb(29));
        gdiVar.d(633, new y6f(0));
        gdiVar.d(634, new d7f(5));
        gdiVar.d(635, new d7f(6));
        gdiVar.d(636, new z6f(12));
        gdiVar.d(637, new z6f(13));
        gdiVar.d(638, new z6f(14));
        gdiVar.d(639, new z6f(15));
        gdiVar.d(640, new z6f(16));
        gdiVar.d(641, new z6f(17));
        gdiVar.d(642, new z6f(18));
        gdiVar.d(145, new d7f(7));
        gdiVar.d(643, new z6f(19));
        gdiVar.d(644, new z6f(21));
        gdiVar.d(645, new z6f(22));
        gdiVar.d(646, new d7f(8));
        gdiVar.d(647, new d7f(11));
        gdiVar.d(350, new d7f(12));
        gdiVar.d(648, new y6f(1));
        gdiVar.d(649, new y6f(2));
        gdiVar.d(650, new y6f(3));
        gdiVar.d(651, new y6f(4));
        gdiVar.d(652, new y6f(5));
        gdiVar.d(653, new y6f(6));
        gdiVar.d(654, new y6f(8));
        gdiVar.d(655, new y6f(9));
        gdiVar.d(656, new d7f(13));
        gdiVar.d(135, new y6f(10));
        gdiVar.d(657, new y6f(11));
        gdiVar.d(658, new y6f(12));
        gdiVar.d(659, new d7f(14));
        gdiVar.d(660, new d7f(15));
        gdiVar.d(661, new d7f(16));
        gdiVar.d(170, new d7f(17));
    }

    public static final void V(gdi gdiVar) {
        gdiVar.d(176, new bwf(29));
        gdiVar.d(186, new eaf(25));
        gdiVar.d(187, new eaf(26));
        gdiVar.d(188, new eaf(27));
        gdiVar.d(189, new qqg(22));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b A[EDGE_INSN: B:21:0x004b->B:22:0x0050 BREAK  A[LOOP:0: B:15:0x0027->B:40:?]] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:15:0x0027->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final boolean W(boolean z, ds6 ds6Var, af7 af7Var) {
        long j;
        int i;
        File file;
        String str;
        File file2 = (File) af7Var.invoke();
        if (file2 == null) {
            if (file2 != null || !file2.exists()) {
                j = 0;
                i = -1;
                while (true) {
                    if (file2 == null && file2.exists()) {
                        break;
                    }
                    i++;
                    long j2 = c[Math.min(i, 4)];
                    SystemClock.sleep(j2);
                    file2 = (File) af7Var.invoke();
                    j += j2;
                    if (j > 200) {
                        if (ds6Var == null) {
                            break;
                        }
                        ds6Var.log("checkFilesDirAvailable: waiting max time! break");
                        break;
                    }
                }
            }
            file = (File) af7Var.invoke();
            if (file != null || !file.exists()) {
                str = "checkFilesDirAvailable: filesDir returns " + file + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154";
                if (ds6Var != null) {
                    return false;
                }
                ds6Var.error(str, new IllegalStateException(str));
                return false;
            }
            if (ds6Var != null) {
                ds6Var.log("checkFilesDirAvailable: dir is created!");
            }
        } else {
            if (!file2.exists()) {
                try {
                    file2.mkdirs();
                } catch (SecurityException unused) {
                }
                if (file2 != null) {
                    j = 0;
                    i = -1;
                    while (true) {
                        if (file2 == null) {
                            i++;
                            long j3 = c[Math.min(i, 4)];
                            SystemClock.sleep(j3);
                            file2 = (File) af7Var.invoke();
                            j += j3;
                            if (j > 200) {
                                if (ds6Var == null) {
                                    break;
                                }
                                ds6Var.log("checkFilesDirAvailable: waiting max time! break");
                                break;
                            }
                        } else {
                            i++;
                            long j4 = c[Math.min(i, 4)];
                            SystemClock.sleep(j4);
                            file2 = (File) af7Var.invoke();
                            j += j4;
                            if (j > 200) {
                                if (ds6Var == null) {
                                    break;
                                }
                                ds6Var.log("checkFilesDirAvailable: waiting max time! break");
                                break;
                            }
                        }
                    }
                } else {
                    j = 0;
                    i = -1;
                    while (true) {
                        if (file2 == null) {
                            i++;
                            long j5 = c[Math.min(i, 4)];
                            SystemClock.sleep(j5);
                            file2 = (File) af7Var.invoke();
                            j += j5;
                            if (j > 200) {
                                if (ds6Var == null) {
                                    break;
                                }
                                ds6Var.log("checkFilesDirAvailable: waiting max time! break");
                                break;
                            }
                        } else {
                            i++;
                            long j6 = c[Math.min(i, 4)];
                            SystemClock.sleep(j6);
                            file2 = (File) af7Var.invoke();
                            j += j6;
                            if (j > 200) {
                                if (ds6Var == null) {
                                    break;
                                }
                                ds6Var.log("checkFilesDirAvailable: waiting max time! break");
                                break;
                            }
                        }
                    }
                }
                file = (File) af7Var.invoke();
                if (file != null) {
                }
                str = "checkFilesDirAvailable: filesDir returns " + file + " which is not an existing directory. See https://issuetracker.google.com/issues/36918154";
                if (ds6Var != null) {
                    return false;
                }
                ds6Var.error(str, new IllegalStateException(str));
                return false;
            }
            if (z && ds6Var != null) {
                ds6Var.log("checkFilesDirAvailable: filesDir exists");
                return true;
            }
        }
        return true;
    }

    public static void X(File file, vs6 vs6Var) {
        vs6Var.f(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    X(file2, vs6Var);
                } else {
                    vs6Var.e(file2);
                }
            }
        }
        vs6Var.d(file);
    }

    public static final /* synthetic */ boolean e() {
        return f;
    }

    public static final void g(u76 u76Var) {
        if ((u76Var instanceof ot8 ? (ot8) u76Var : null) != null) {
            return;
        }
        qr7.x(zfe.a(u76Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final long h(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : oc9.x(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final gt8 i(r55 r55Var) {
        gt8 gt8Var = r55Var instanceof gt8 ? (gt8) r55Var : null;
        if (gt8Var != null) {
            return gt8Var;
        }
        qr7.x(zfe.a(r55Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final byte[] j(String str) {
        try {
            return str.getBytes(Charset.forName(HTTP.ASCII));
        } catch (UnsupportedEncodingException e2) {
            ore.h("ASCII not found!", e2);
            return null;
        }
    }

    public static final void k(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            c.o(i != i2 ? nbh.u("Both size ", i, " and step ", i2, " must be greater than zero.") : c0a.k(i, "size ", " must be greater than zero."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    public static final aw8 l(rv8 rv8Var, aw8... aw8VarArr) {
        Object obj;
        aw8 aw8Var;
        Class<?> cls;
        Object obj2;
        aw8 aw8VarY;
        Field field;
        mif mifVar;
        Class clsD = ((qr3) rv8Var).d();
        aw8[] aw8VarArr2 = (aw8[]) Arrays.copyOf(aw8VarArr, aw8VarArr.length);
        if (clsD.isEnum() && clsD.getAnnotation(mif.class) == null && clsD.getAnnotation(qad.class) == null) {
            return new na6(clsD.getCanonicalName(), (Enum[]) clsD.getEnumConstants());
        }
        aw8[] aw8VarArr3 = (aw8[]) Arrays.copyOf(aw8VarArr2, aw8VarArr2.length);
        uad uadVar = null;
        try {
            Field declaredField = clsD.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        aw8 aw8VarY2 = obj == null ? null : y(obj, (aw8[]) Arrays.copyOf(aw8VarArr3, aw8VarArr3.length));
        if (aw8VarY2 != null) {
            return aw8VarY2;
        }
        String canonicalName = clsD.getCanonicalName();
        if (canonicalName == null || z5h.K0(canonicalName, "java.", false) || z5h.K0(canonicalName, "kotlin.", false)) {
            aw8Var = null;
        } else {
            Field[] declaredFields = clsD.getDeclaredFields();
            int length = declaredFields.length;
            Field field2 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i];
                if (cqk.d(field3.getName(), "INSTANCE") && cqk.d(field3.getType(), clsD) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z) {
                        z = true;
                        field2 = field3;
                    }
                }
                i++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                aw8Var = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsD.getMethods();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (cqk.d(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && cqk.d(method2.getReturnType(), aw8.class)) {
                        if (!z2) {
                            z2 = true;
                            method = method2;
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    aw8Var = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof aw8) {
                        aw8Var = (aw8) objInvoke;
                    } else {
                        aw8Var = null;
                    }
                }
            }
        }
        if (aw8Var != null) {
            return aw8Var;
        }
        aw8[] aw8VarArr4 = (aw8[]) Arrays.copyOf(aw8VarArr2, aw8VarArr2.length);
        Class<?>[] declaredClasses = clsD.getDeclaredClasses();
        int length3 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i3];
            if (cls.getAnnotation(pab.class) != null) {
                break;
            }
            i3++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsD.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (aw8VarY = y(obj2, (aw8[]) Arrays.copyOf(aw8VarArr4, aw8VarArr4.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsD.getDeclaredClasses();
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses2[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                aw8VarY = obj4 instanceof aw8 ? (aw8) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (aw8VarY != null) {
            return aw8VarY;
        }
        if (clsD.getAnnotation(qad.class) != null || ((mifVar = (mif) clsD.getAnnotation(mif.class)) != null && zfe.a(mifVar.with()).equals(zfe.a(uad.class)))) {
            uadVar = new uad(zfe.a(clsD));
        }
        return uadVar;
    }

    public static final boolean m(long j, List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((tq3) it.next()).b(j)) {
                return true;
            }
        }
        return false;
    }

    public static tse n(fbc fbcVar) {
        tse tseVar;
        String str = (String) fbcVar.b;
        Object[] objArr = (Object[]) fbcVar.c;
        int length = objArr != null ? objArr.length : 0;
        TreeMap treeMap = tse.h;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                tseVar = (tse) entryCeilingEntry.getValue();
                tseVar.a = str;
                tseVar.g = length;
            } else {
                tseVar = new tse(length);
                tseVar.a = str;
                tseVar.g = length;
            }
        }
        fbcVar.y(new nd7(tseVar, 1));
        return tseVar;
    }

    public static boolean o(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                o(file2);
            }
        }
        return file.delete();
    }

    public static final long p(long j) {
        long j2 = (j << 1) + 1;
        ew5.b.getClass();
        ThreadLocal[] threadLocalArr = gw5.a;
        return j2;
    }

    public static final long q(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? p(oc9.x(j, -4611686018427387903L, 4611686018427387903L)) : r(j * 1000000);
    }

    public static final long r(long j) {
        ghb ghbVar = ew5.b;
        long j2 = j << 1;
        ThreadLocal[] threadLocalArr = gw5.a;
        return j2;
    }

    public static final boolean s(tq3 tq3Var, tq3 tq3Var2) {
        return tq3Var.a() == tq3Var2.a() && tq3Var.c() == tq3Var2.c();
    }

    public static final tq3 t(long j, List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((tq3) next).b(j)) {
                return (tq3) next;
            }
        }
        next = null;
        return (tq3) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(oyj oyjVar, Set set, nq4 nq4Var) throws Throwable {
        ryj ryjVar;
        boolean z;
        if (nq4Var instanceof ryj) {
            ryjVar = (ryj) nq4Var;
            int i = ryjVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryjVar.f = i - Integer.MIN_VALUE;
            } else {
                ryjVar = new ryj(nq4Var);
            }
        } else {
            ryjVar = new ryj(nq4Var);
        }
        Object objE = ryjVar.e;
        int i2 = ryjVar.f;
        kyj kyjVar = kyj.b;
        if (i2 == 0) {
            ch3.d0(objE);
            List listN1 = a.n1(new kyj[]{kyj.a, kyjVar});
            gvb gvbVar = new gvb();
            r66 r66Var = r66.a;
            gvbVar.b = r66Var;
            gvbVar.c = r66Var;
            gvbVar.d = r66Var;
            gvbVar.a = listN1;
            u72 u72VarM = f55.m(new f89(oyjVar.d.a, "loadStatusFuture", new yjg(new yre(6, gvbVar), 1, oyjVar.c)));
            ryjVar.d = set;
            ryjVar.f = 1;
            objE = cqk.e(u72VarM, ryjVar);
            hu4 hu4Var = hu4.a;
            if (objE == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = ryjVar.d;
            ch3.d0(objE);
        }
        List<lyj> list = (List) objE;
        int i3 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            int i4 = 0;
            for (lyj lyjVar : list) {
                vd7.q(ryjVar.getContext());
                HashSet hashSet = lyjVar.c;
                if (hashSet.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String str = (String) it.next();
                    if (set == null || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (z5h.K0(str, (String) it2.next(), false)) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                boolean z2 = lyjVar.b == kyjVar || lyjVar.j == null || lyjVar.k <= System.currentTimeMillis();
                if (z && z2 && (i4 = i4 + 1) < 0) {
                    xw3.U0();
                    throw null;
                }
            }
            i3 = i4;
        }
        return new Integer(i3);
    }

    public static pe7 v() {
        khb khbVar;
        pe7 pe7Var = a;
        if (pe7Var != null) {
            return pe7Var;
        }
        synchronized (qe7.class) {
            khbVar = new khb(16);
            a = khbVar;
        }
        return khbVar;
    }

    public static final String w(int i, Context context, List list) {
        Context contextM = np4.m(context);
        Object[] array = list.toArray(new Object[0]);
        return contextM.getString(i, Arrays.copyOf(array, array.length));
    }

    public static final boolean x(byte[] bArr, byte[] bArr2, int i) {
        int iNextInt;
        if (bArr2.length + i <= bArr.length) {
            Iterable hj8Var = new hj8(0, bArr2.length - 1, 1);
            if (!(hj8Var instanceof Collection) || !((Collection) hj8Var).isEmpty()) {
                Iterator it = hj8Var.iterator();
                do {
                    gj8 gj8Var = (gj8) it;
                    if (gj8Var.c) {
                        iNextInt = gj8Var.nextInt();
                    }
                } while (bArr[i + iNextInt] == bArr2[iNextInt]);
            }
            return true;
        }
        return false;
    }

    public static final aw8 y(Object obj, aw8... aw8VarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (aw8VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aw8VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = aw8.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aw8VarArr, aw8VarArr.length));
            if (objInvoke instanceof aw8) {
                return (aw8) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static String z(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e2);
                    StringBuilder sbV = qt4.v("<", str2, " threw ");
                    sbV.append(e2.getClass().getName());
                    sbV.append(">");
                    string = sbV.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public abstract View A(int i);

    public abstract boolean B();
}
