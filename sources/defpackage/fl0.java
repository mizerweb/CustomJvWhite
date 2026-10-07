package defpackage;

import android.net.Uri;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class fl0 {
    public final String a = fl0.class.getSimpleName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public fl0(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var3;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0203  */
    /* JADX WARN: Code duplicated, block: B:219:0x0311  */
    /* JADX WARN: Code duplicated, block: B:300:0x0405  */
    /* JADX WARN: Code duplicated, block: B:307:0x0426  */
    /* JADX WARN: Code duplicated, block: B:310:0x044d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Object a(o60 o60Var, nq4 nq4Var) {
        el0 el0Var;
        Object obj;
        long j;
        Object obj2;
        String strK;
        int length;
        String string;
        Object obj3;
        Object objK;
        String strK2;
        int length2;
        String string2;
        Object obj4;
        String strK3;
        int length3;
        String string3;
        ?? r1;
        long j2;
        String str;
        String str2;
        long j3;
        jg0 jg0Var;
        fg0 fg0Var;
        long j4;
        String strConcat;
        a4c a4cVar;
        String strConcat2;
        a4c a4cVar2;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof el0) {
            el0Var = (el0) nq4Var;
            int i = el0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                el0Var.h = i - Integer.MIN_VALUE;
            } else {
                el0Var = new el0(this, nq4Var);
            }
        } else {
            el0Var = new el0(this, nq4Var);
        }
        Object objC = el0Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = el0Var.h;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = el0Var.e;
                String str3 = el0Var.d;
                ch3.d0(objC);
                obj = sbiVar;
                str = str3;
            } else {
                if (i2 == 2) {
                    j3 = el0Var.e;
                    ch3.d0(objC);
                    obj = sbiVar;
                    if (((Uri) objC) != null) {
                        jg0Var = (jg0) this.b.getValue();
                        fg0Var = new fg0(j3, 1);
                        el0Var.d = null;
                        el0Var.e = j3;
                        el0Var.h = 3;
                        if (ch3.I(el0Var, jg0Var.a, false, true, new tc(jg0Var, 8, fg0Var)) != hu4Var) {
                            j4 = j3;
                        }
                        return hu4Var;
                    }
                    strConcat = "dg0".concat(":".concat(this.a));
                    a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, strConcat, nbh.s(j3, "awaitAndSavePhoto(", "): save to gallery returned null"), null);
                        return obj;
                    }
                    return obj;
                }
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = el0Var.e;
                ch3.d0(objC);
                obj = sbiVar;
            }
            strConcat2 = "dg0".concat(":".concat(this.a));
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, strConcat2, nbh.s(j4, "awaitAndSavePhoto(", "): saved entity"), null);
                return obj;
            }
            return obj;
        }
        ch3.d0(objC);
        long j5 = o60Var.i;
        String strB = o60Var.b(us0.e);
        if (strB != 0 && strB.length() != 0) {
            String strConcat3 = "dg0".concat(":".concat(this.a));
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, strConcat3, nbh.s(j5, "awaitAndSavePhoto(", "): waiting for disk cache"), null);
            }
            pl0 pl0Var = (pl0) this.c.getValue();
            el0Var.d = strB;
            el0Var.e = j5;
            el0Var.h = 1;
            pl0Var.getClass();
            if (strB.length() == 0) {
                String str4 = pl0Var.c;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, "Passed url is empty", null);
                }
                objK = sbiVar;
                obj = objK;
                j = j5;
                r1 = strB;
            } else {
                b78 b78VarA = vd7.A();
                ((v3f) pl0Var.a.getValue()).e().getClass();
                Uri uri = Uri.parse(sb8.L(strB));
                obj = sbiVar;
                j = j5;
                if (uri == null) {
                    String str5 = pl0Var.c;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                        if (gm0.c()) {
                            obj4 = strB;
                            obj4 = strB;
                            string3 = strB.toString();
                        } else {
                            if (strB instanceof Collection) {
                                Collection collection = (Collection) strB;
                                if (collection.isEmpty()) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = collection.size();
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof Map) {
                                Map map = (Map) strB;
                                if (map.isEmpty()) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "{}";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = c0a.k(map.size(), "{**", "**}");
                                }
                            } else if (strB instanceof Object[]) {
                                Object[] objArr = (Object[]) strB;
                                if (objArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = objArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof int[]) {
                                int[] iArr = (int[]) strB;
                                if (iArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = iArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof float[]) {
                                float[] fArr = (float[]) strB;
                                if (fArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = fArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof long[]) {
                                long[] jArr = (long[]) strB;
                                if (jArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = jArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof double[]) {
                                double[] dArr = (double[]) strB;
                                if (dArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = dArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof short[]) {
                                short[] sArr = (short[]) strB;
                                if (sArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = sArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof byte[]) {
                                byte[] bArr = (byte[]) strB;
                                if (bArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = bArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof char[]) {
                                char[] cArr = (char[]) strB;
                                if (cArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = cArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else if (strB instanceof boolean[]) {
                                boolean[] zArr = (boolean[]) strB;
                                if (zArr.length == 0) {
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK3 = "[]";
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    length3 = zArr.length;
                                    strK3 = c0a.k(length3, "[**", "**]");
                                }
                            } else {
                                obj4 = strB;
                                obj4 = strB;
                                strK3 = "***";
                            }
                            string3 = strK3;
                        }
                        a4cVar5.c(je9Var, str5, qv1.k("Uri for fresco is null for -> ", string3), null);
                        obj4 = strB;
                    }
                } else {
                    v78 v78VarA = v78.a(uri);
                    if (v78VarA == null) {
                        String str6 = pl0Var.c;
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                            if (gm0.c()) {
                                obj4 = strB;
                                obj4 = strB;
                                string2 = strB.toString();
                            } else {
                                if (strB instanceof Collection) {
                                    Collection collection2 = (Collection) strB;
                                    if (collection2.isEmpty()) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = collection2.size();
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof Map) {
                                    Map map2 = (Map) strB;
                                    if (map2.isEmpty()) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "{}";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = c0a.k(map2.size(), "{**", "**}");
                                    }
                                } else if (strB instanceof Object[]) {
                                    Object[] objArr2 = (Object[]) strB;
                                    if (objArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = objArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof int[]) {
                                    int[] iArr2 = (int[]) strB;
                                    if (iArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = iArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof float[]) {
                                    float[] fArr2 = (float[]) strB;
                                    if (fArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = fArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof long[]) {
                                    long[] jArr2 = (long[]) strB;
                                    if (jArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = jArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof double[]) {
                                    double[] dArr2 = (double[]) strB;
                                    if (dArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = dArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof short[]) {
                                    short[] sArr2 = (short[]) strB;
                                    if (sArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = sArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof byte[]) {
                                    byte[] bArr2 = (byte[]) strB;
                                    if (bArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = bArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof char[]) {
                                    char[] cArr2 = (char[]) strB;
                                    if (cArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = cArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (strB instanceof boolean[]) {
                                    boolean[] zArr2 = (boolean[]) strB;
                                    if (zArr2.length == 0) {
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        obj4 = strB;
                                        strK2 = "[]";
                                    } else {
                                        obj4 = strB;
                                        obj4 = strB;
                                        length2 = zArr2.length;
                                        strK2 = c0a.k(length2, "[**", "**]");
                                    }
                                } else {
                                    obj4 = strB;
                                    obj4 = strB;
                                    strK2 = "***";
                                }
                                string2 = strK2;
                            }
                            a4cVar6.c(je9Var, str6, qv1.k("ImageRequest is null for -> ", string2), null);
                            obj4 = strB;
                        }
                    } else {
                        j85 j85Var = b78VarA.h;
                        j85Var.getClass();
                        String str7 = j85Var.o(v78VarA.b).a;
                        if (str7 == null || str7.length() == 0) {
                            obj2 = strB;
                            String str8 = pl0Var.c;
                            a4c a4cVar7 = gm0.f;
                            obj4 = obj2;
                            if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                                if (gm0.c()) {
                                    obj4 = obj2;
                                    string = obj2.toString();
                                } else {
                                    if (obj2 instanceof Collection) {
                                        Collection collection3 = (Collection) obj2;
                                        if (collection3.isEmpty()) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = collection3.size();
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof Map) {
                                        Map map3 = (Map) obj2;
                                        if (map3.isEmpty()) {
                                            obj4 = obj2;
                                            strK = "{}";
                                        } else {
                                            obj4 = obj2;
                                            strK = c0a.k(map3.size(), "{**", "**}");
                                        }
                                    } else if (obj2 instanceof Object[]) {
                                        Object[] objArr3 = (Object[]) obj2;
                                        if (objArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = objArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof int[]) {
                                        int[] iArr3 = (int[]) obj2;
                                        if (iArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = iArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof float[]) {
                                        float[] fArr3 = (float[]) obj2;
                                        if (fArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = fArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof long[]) {
                                        long[] jArr3 = (long[]) obj2;
                                        if (jArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = jArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof double[]) {
                                        double[] dArr3 = (double[]) obj2;
                                        if (dArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = dArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof short[]) {
                                        short[] sArr3 = (short[]) obj2;
                                        if (sArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = sArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof byte[]) {
                                        byte[] bArr3 = (byte[]) obj2;
                                        if (bArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = bArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof char[]) {
                                        char[] cArr3 = (char[]) obj2;
                                        if (cArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = cArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof boolean[]) {
                                        boolean[] zArr3 = (boolean[]) obj2;
                                        if (zArr3.length == 0) {
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            obj4 = obj2;
                                            strK = "[]";
                                        } else {
                                            obj4 = obj2;
                                            length = zArr3.length;
                                            strK = c0a.k(length, "[**", "**]");
                                        }
                                    } else {
                                        obj4 = obj2;
                                        strK = "***";
                                    }
                                    string = strK;
                                }
                                a4cVar7.c(je9Var, str8, qv1.k("Cache key is null or empty for -> ", string), null);
                                obj4 = obj2;
                            }
                        } else {
                            objK = cqk.k(new hki(1, (lq4) null, uri, pl0Var, b78VarA, str7, strB), el0Var);
                            if (objK != hu4Var) {
                            }
                        }
                    }
                }
                obj4 = obj2;
                obj3 = strB;
                r1 = obj3;
                obj4 = obj3;
                obj4 = strB;
                obj4 = strB;
                obj4 = strB;
                obj4 = strB;
                obj4 = strB;
                obj4 = strB;
                objK = obj;
                r1 = obj4;
            }
            if (objK != hu4Var) {
                j2 = j;
                str = r1;
            }
            return hu4Var;
        }
        obj = sbiVar;
        String strConcat4 = "dg0".concat(":".concat(this.a));
        a4c a4cVar8 = gm0.f;
        if (a4cVar8 != null && a4cVar8.b(je9Var)) {
            a4cVar8.c(je9Var, strConcat4, nbh.s(j5, "awaitAndSavePhoto(", "): photo url is empty, cannot save photo!"), null);
        }
        return obj;
        String strConcat5 = "dg0".concat(":".concat(this.a));
        a4c a4cVar9 = gm0.f;
        if (a4cVar9 != null && a4cVar9.b(je9Var2)) {
            str2 = null;
            a4cVar9.c(je9Var2, strConcat5, nbh.s(j2, "awaitAndSavePhoto(", "): photo cached, saving to gallery"), null);
        } else {
            str2 = null;
        }
        vze vzeVar = (vze) this.d.getValue();
        el0Var.d = str2;
        el0Var.e = j2;
        el0Var.h = 2;
        objC = vze.c(vzeVar, str, false, el0Var);
        if (objC != hu4Var) {
            j3 = j2;
            if (((Uri) objC) != null) {
                strConcat = "dg0".concat(":".concat(this.a));
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4cVar.c(je9Var, strConcat, nbh.s(j3, "awaitAndSavePhoto(", "): save to gallery returned null"), null);
                    return obj;
                }
            } else {
                jg0Var = (jg0) this.b.getValue();
                fg0Var = new fg0(j3, 1);
                el0Var.d = null;
                el0Var.e = j3;
                el0Var.h = 3;
                if (ch3.I(el0Var, jg0Var.a, false, true, new tc(jg0Var, 8, fg0Var)) != hu4Var) {
                    j4 = j3;
                    strConcat2 = "dg0".concat(":".concat(this.a));
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var2, strConcat2, nbh.s(j4, "awaitAndSavePhoto(", "): saved entity"), null);
                        return obj;
                    }
                }
            }
            return obj;
        }
        return hu4Var;
    }
}
