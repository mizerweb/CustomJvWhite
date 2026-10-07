package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqk {
    public static t3a a;
    public static final ste b = new ste("CORE", 2);
    public static volatile em9 c = new khb(19);
    public static final Object d = new Object();
    public static abb e;
    public static long f;
    public static Method g;
    public static Method h;
    public static Method i;
    public static Method j;

    public static boolean A(e70 e70Var) {
        j60 j60Var;
        e70 e70Var2;
        return (e70Var == null || e70Var.a != y60.j || (j60Var = e70Var.j) == null || (e70Var2 = j60Var.d) == null || !e70Var2.h()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public static boolean B(e70 e70Var, fda fdaVar) {
        if (e70Var == null) {
            e70Var = null;
        } else {
            j60 j60Var = e70Var.j;
            if (!e70Var.e() && (e70Var.a != y60.j || j60Var == null || (e70Var = j60Var.d) == null || !e70Var.e())) {
                e70Var = null;
            }
        }
        return (e70Var == null || !e70Var.e() || !e70Var.B || e70Var.A || fdaVar.b.f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0068 A[EDGE_INSN: B:109:0x0068->B:22:0x0068 BREAK  A[LOOP:2: B:16:0x004a->B:20:0x005b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b A[LOOP:2: B:16:0x004a->B:20:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x019a  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    public static h71 C(hu7 hu7Var) {
        int i2;
        int length;
        boolean z;
        int length2;
        int i3;
        String string;
        String string2;
        hu7 hu7Var2 = hu7Var;
        int size = hu7Var2.size();
        boolean z2 = true;
        boolean z3 = true;
        int i4 = 0;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        int iY = -1;
        int iY2 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int iY3 = -1;
        int iY4 = -1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i4 < size) {
            String strB = hu7Var2.b(i4);
            String strF = hu7Var2.f(i4);
            if (z5h.G0(strB, "Cache-Control", z2)) {
                if (str == null) {
                    str = strF;
                }
                i2 = 0;
                while (i2 < strF.length()) {
                    length = strF.length();
                    z = z2;
                    length2 = i2;
                    while (true) {
                        if (length2 < length) {
                            i3 = size;
                            length2 = strF.length();
                            break;
                        }
                        i3 = size;
                        if (r5h.M0("=,;", strF.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i3;
                    }
                    string = r5h.y1(strF.substring(i2, length2)).toString();
                    if (length2 != strF.length() || strF.charAt(length2) == ',' || strF.charAt(length2) == ';') {
                        i2 = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = uqi.a;
                        int length4 = strF.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strF.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strF.length();
                                break;
                            }
                        }
                        if (length3 >= strF.length() || strF.charAt(length3) != '\"') {
                            int length5 = strF.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strF.length();
                                    break;
                                }
                                int i5 = length5;
                                if (r5h.M0(",;", strF.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i5;
                            }
                            int i6 = length6;
                            string2 = r5h.y1(strF.substring(length3, length6)).toString();
                            i2 = i6;
                        } else {
                            int i7 = length3 + 1;
                            int iU0 = r5h.U0(strF, '\"', i7, 4);
                            string2 = strF.substring(i7, iU0);
                            i2 = iU0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = z;
                        z4 = z2;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z2 = z;
                        z5 = z2;
                    } else {
                        if (ClientCookie.MAX_AGE_ATTR.equalsIgnoreCase(string)) {
                            iY = uqi.y(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iY2 = uqi.y(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z2 = z;
                            z6 = z2;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z2 = z;
                            z7 = z2;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z2 = z;
                            z8 = z2;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iY3 = uqi.y(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iY4 = uqi.y(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z2 = z;
                            z9 = z2;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z2 = z;
                            z10 = z2;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z2 = z;
                            z11 = z2;
                        }
                        z2 = z;
                    }
                    size = i3;
                }
                i4++;
                hu7Var2 = hu7Var;
                z2 = z2;
                size = size;
            } else {
                if (z5h.G0(strB, "Pragma", z2)) {
                }
                i4++;
                hu7Var2 = hu7Var;
                z2 = z2;
                size = size;
            }
            z3 = false;
            i2 = 0;
            while (i2 < strF.length()) {
                length = strF.length();
                z = z2;
                length2 = i2;
                while (true) {
                    if (length2 < length) {
                        i3 = size;
                        length2 = strF.length();
                        break;
                    }
                    i3 = size;
                    if (r5h.M0("=,;", strF.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i3;
                }
                string = r5h.y1(strF.substring(i2, length2)).toString();
                if (length2 != strF.length()) {
                    i2 = length2 + 1;
                    string2 = null;
                } else {
                    i2 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = z;
                    z4 = z2;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z2 = z;
                    z5 = z2;
                } else {
                    if (ClientCookie.MAX_AGE_ATTR.equalsIgnoreCase(string)) {
                        iY = uqi.y(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iY2 = uqi.y(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z2 = z;
                        z6 = z2;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z2 = z;
                        z7 = z2;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z2 = z;
                        z8 = z2;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iY3 = uqi.y(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iY4 = uqi.y(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z2 = z;
                        z9 = z2;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z2 = z;
                        z10 = z2;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z2 = z;
                        z11 = z2;
                    }
                    z2 = z;
                }
                size = i3;
            }
            i4++;
            hu7Var2 = hu7Var;
            z2 = z2;
            size = size;
        }
        return new h71(z4, z5, iY, iY2, z6, z7, z8, iY3, iY4, z9, z10, z11, !z3 ? null : str);
    }

    public static final dq4 D(gu4 gu4Var, vt4 vt4Var) {
        return new dq4(gu4Var.k().u0(vt4Var));
    }

    public static final Object E(Object obj) {
        return obj instanceof s64 ? new poe(((s64) obj).a) : obj;
    }

    public static void F() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:56|23|67|24|(7:27|28|29|30|52|(0)|(1:58)(2:59|60))|49) */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0143  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x018c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x018d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        r18 = r5;
        r5 = r1;
        r1 = r12;
        r12 = r14;
        r14 = r18;
        r15 = r3;
        r3 = r15;
        r18 = r13;
        r13 = r8;
        r8 = r11;
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        r7 = (defpackage.rnf) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (defpackage.onf.a(r7.q) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        defpackage.gm0.n(r14, "retry api request: no connection, await for connection available");
        r6 = new defpackage.fz6(new defpackage.hde(r7.s, r6), new defpackage.c37(r14, null, 28), 3);
        r1.d = r5;
        r1.e = r15;
        r1.f = r14;
        r1.g = r13;
        r1.h = r12;
        r1.i = r11;
        r1.j = r9;
        r1.k = r8;
        r1.l = r3;
        r4 = 2;
        r1.n = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
    
        if (defpackage.e9i.N(r6, r1) != r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        r18 = r15;
        r15 = r5;
        r5 = r8;
        r8 = r9;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0162, code lost:
    
        if (defpackage.rx8.u(r9, r1) == r2) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c8 -> B:30:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0162 -> B:50:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object G(defpackage.pvb r20, defpackage.hih r21, java.lang.String r22, defpackage.ed6 r23, long r24, int r26, defpackage.nq4 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqk.G(pvb, hih, java.lang.String, ed6, long, int, nq4):java.lang.Object");
    }

    public static /* synthetic */ Object H(pvb pvbVar, hih hihVar, String str, ed6 ed6Var, nq4 nq4Var) {
        ghb ghbVar = ew5.b;
        return G(pvbVar, hihVar, str, ed6Var, qe7.O(1, lw5.SECONDS), 3, nq4Var);
    }

    public static final void I(ek2 ek2Var, lq4 lq4Var, boolean z) {
        Object objT = ek2Var.t();
        Throwable thD = ek2Var.d(objT);
        Object poeVar = thD != null ? new poe(thD) : ek2Var.f(objT);
        if (!z) {
            lq4Var.resumeWith(poeVar);
            return;
        }
        sn5 sn5Var = (sn5) lq4Var;
        nq4 nq4Var = sn5Var.e;
        Object obj = sn5Var.g;
        vt4 context = nq4Var.getContext();
        Object objI = np4.I(context, obj);
        zai zaiVarF0 = objI != np4.d ? n1g.f0(nq4Var, context, objI) : null;
        try {
            sn5Var.e.resumeWith(poeVar);
        } finally {
            if (zaiVarF0 == null || zaiVarF0.p0()) {
                np4.A(context, objI);
            }
        }
    }

    public static void J(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static int K(int i2) {
        for (int i3 : qt4.H(3)) {
            if (c0a.a(i3) == i2) {
                return i3;
            }
        }
        Locale locale = Locale.ENGLISH;
        ore.p(c0a.k(i2, "No such value ", " for StickerAuthorType"));
        return 0;
    }

    public static int L(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 10) {
            return 2;
        }
        if (i2 == 20) {
            return 3;
        }
        if (i2 == 40) {
            return 4;
        }
        ore.p(c0a.k(i2, "No such value ", " for StickerType"));
        return 0;
    }

    public static String M(Object obj, String str) {
        return str + obj;
    }

    public static String N(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final void O(gdi gdiVar) {
        gdiVar.b(3, new lu2(4));
        gdiVar.d(944, new lu2(6));
        gdiVar.d(926, new t62(21));
        gdiVar.b(3, new lu2(5));
        gdiVar.d(945, new t62(22));
        gdiVar.d(946, new t62(23));
        gdiVar.d(947, new mu2(2));
    }

    public static final void P(gdi gdiVar) {
        gdiVar.d(159, new m3d(15));
        gdiVar.d(160, new m3d(16));
        gdiVar.d(161, new m3d(17));
        gdiVar.d(97, new m3d(18));
        gdiVar.d(54, new m3d(19));
        gdiVar.d(162, new m3d(20));
        gdiVar.d(163, new m3d(21));
        gdiVar.d(85, new m3d(22));
        gdiVar.d(164, new m3d(23));
        gdiVar.d(165, new m3d(10));
        gdiVar.d(92, new m3d(11));
        gdiVar.d(166, new m3d(12));
        gdiVar.d(101, new m3d(13));
        gdiVar.d(26, new m3d(14));
    }

    public static final void Q(gdi gdiVar) {
        gdiVar.d(29, new r1i(28));
        gdiVar.b(3, new m3i(10));
        gdiVar.d(1031, new m3i(19));
        gdiVar.d(1032, new r1i(29));
        gdiVar.d(1033, new eaf(29));
        gdiVar.d(1034, new kdj(0));
        gdiVar.d(1035, new ldj(0));
        gdiVar.d(1036, new ldj(1));
        gdiVar.d(1037, new ldj(2));
        gdiVar.d(1038, new ldj(3));
        gdiVar.d(1039, new kdj(1));
        gdiVar.b(4, new m3i(11));
        gdiVar.b(9, new m3i(12));
        gdiVar.b(9, new m3i(13));
        gdiVar.b(9, new m3i(14));
        gdiVar.b(9, new m3i(15));
        gdiVar.b(9, new m3i(16));
        gdiVar.b(9, new m3i(17));
        gdiVar.d(1040, new m3i(20));
        gdiVar.b(9, new m3i(18));
        gdiVar.b(9, new m3i(3));
        gdiVar.b(9, new m3i(4));
        gdiVar.b(9, new m3i(5));
        gdiVar.b(9, new m3i(6));
        gdiVar.b(9, new m3i(7));
        gdiVar.d(1041, new kdj(2));
        gdiVar.d(211, new ldj(4));
        gdiVar.d(1042, new kdj(3));
        gdiVar.d(1043, new kdj(4));
        gdiVar.d(1044, new ldj(5));
        gdiVar.d(1045, new ldj(6));
        gdiVar.b(9, new m3i(8));
        gdiVar.b(9, new m3i(9));
    }

    public static void R(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                ore.n(zo5.h(i3, "at index "));
                return;
            }
        }
    }

    public static final dq4 a(vt4 vt4Var) {
        if (vt4Var.x0(nhb.h) == null) {
            vt4Var = vt4Var.u0(vd7.a());
        }
        return new dq4(vt4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(jrh jrhVar, tf7 tf7Var, Throwable th, nq4 nq4Var) throws IllegalAccessException, InvocationTargetException {
        bz6 bz6Var;
        if (nq4Var instanceof bz6) {
            bz6Var = (bz6) nq4Var;
            int i2 = bz6Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bz6Var.f = i2 - Integer.MIN_VALUE;
            } else {
                bz6Var = new bz6(nq4Var);
            }
        } else {
            bz6Var = new bz6(nq4Var);
        }
        Object obj = bz6Var.e;
        int i3 = bz6Var.f;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                bz6Var.d = th;
                bz6Var.f = 1;
                Object objI = tf7Var.i(jrhVar, th, bz6Var);
                Object obj2 = hu4.a;
                if (objI == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = bz6Var.d;
                ch3.d0(obj);
            }
            return sbi.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                gm0.b(th2, th);
            }
            throw th2;
        }
    }

    public static boolean c(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Object e(u72 u72Var, nq4 nq4Var) throws Throwable {
        t72 t72Var = u72Var.b;
        try {
            if (t72Var.isDone()) {
                return vd7.C(u72Var);
            }
            ek2 ek2Var = new ek2(1, p90.B(nq4Var));
            ek2Var.u();
            t72Var.b(new p0((Object) u72Var, 8, (Runnable) ek2Var), im5.a);
            ek2Var.w(new kl3(5, u72Var));
            return ek2Var.s();
        } catch (ExecutionException e2) {
            throw e2.getCause();
        }
    }

    public static final void f(String str) {
        Trace.beginSection(N(str));
    }

    public static void g(gu4 gu4Var) {
        vo8 vo8Var = (vo8) gu4Var.k().x0(nhb.h);
        if (vo8Var != null) {
            vo8Var.b(null);
        } else {
            qr7.v(gu4Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static int h(int i2, Context context, String str) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static int i(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int j(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final Object k(qf7 qf7Var, lq4 lq4Var) {
        s3f s3fVar = new s3f(lq4Var, lq4Var.getContext());
        return f55.x(s3fVar, true, s3fVar, qf7Var);
    }

    public static void l(y28 y28Var) {
        if (y28Var != null) {
            try {
                y28Var.onDisconnected();
            } catch (RemoteException unused) {
            }
        }
    }

    public static final void m(gu4 gu4Var) {
        vd7.q(gu4Var.k());
    }

    public static final ma6 n(Enum[] enumArr) {
        return new ma6(enumArr);
    }

    public static final boolean o(hw7 hw7Var, hw7 hw7Var2, qg7 qg7Var) {
        if (hw7Var.d() == hw7Var2.d() && hw7Var.k() == hw7Var2.k() && hw7Var.l().size() == hw7Var2.l().size()) {
            try {
                int size = hw7Var.l().size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (qe7.s((tq3) hw7Var.l().get(i2), (tq3) hw7Var2.l().get(i2))) {
                    }
                }
                return true;
            } catch (IndexOutOfBoundsException e2) {
                String str = (String) qg7Var.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, s5h.y0("equalsBounds: exception while iterate chunks: \n                |" + e2 + "\n                |"), null);
                    }
                }
            }
        }
        return false;
    }

    public static boolean p(String str, String str2) {
        return (ch3.r(str) || ch3.r(str2) || !ch3.a(str, str2)) ? false : true;
    }

    public static e70 q(sfa sfaVar, String str) {
        if (sfaVar == null) {
            return null;
        }
        c46 c46Var = sfaVar.n;
        if (!sfaVar.C()) {
            return null;
        }
        for (int i2 = 0; i2 < c46Var.i(); i2++) {
            e70 e70VarH = c46Var.h(i2);
            if (ch3.a(e70VarH.t, str)) {
                return e70VarH;
            }
        }
        return null;
    }

    public static ColorStateList r(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListL;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListL = np4.l(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListL;
    }

    public static int s(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable t(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableO;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableO = wk8.o(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableO;
    }

    public static String u(j60 j60Var) {
        int iLastIndexOf;
        if (j60Var == null) {
            return null;
        }
        String str = j60Var.c;
        if (ch3.r(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1 || iLastIndexOf >= str.length()) {
            return null;
        }
        return str.substring(iLastIndexOf + 1);
    }

    public static void w(Exception exc, String str) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            qr7.o(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean x(gu4 gu4Var) {
        vo8 vo8Var = (vo8) gu4Var.k().x0(nhb.h);
        if (vo8Var != null) {
            return vo8Var.isActive();
        }
        return true;
    }

    public static final boolean y() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return li8.d();
        }
        try {
            if (g == null) {
                f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = g;
            if (method != null) {
                return ((Boolean) method.invoke(null, Long.valueOf(f))).booleanValue();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Exception e2) {
            w(e2, "isTagEnabled");
            return false;
        }
    }

    public static boolean z(e70 e70Var) {
        e70 e70Var2;
        if (e70Var != null) {
            j60 j60Var = e70Var.j;
            if (e70Var.a == y60.j && j60Var != null && (e70Var2 = j60Var.d) != null && e70Var2.e() && !j60Var.d.b.e) {
                return true;
            }
        }
        return false;
    }

    public abstract void v(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5);
}
