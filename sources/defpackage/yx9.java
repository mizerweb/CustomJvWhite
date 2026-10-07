package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class yx9 {
    public final Context a;
    public final String b = yx9.class.getName();

    public yx9(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b A[PHI: r18
  0x004b: PHI (r18v5 je9) = 
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v0 je9)
  (r18v1 je9)
  (r18v7 je9)
 binds: [B:75:0x010e, B:69:0x00fd, B:63:0x00ec, B:57:0x00db, B:51:0x00ca, B:45:0x00b9, B:39:0x00a7, B:33:0x0095, B:27:0x0081, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:195:0x035a  */
    /* JADX WARN: Code duplicated, block: B:341:0x0608  */
    /* JADX WARN: Code duplicated, block: B:344:0x0611  */
    /* JADX WARN: Code duplicated, block: B:346:0x0619  */
    /* JADX WARN: Code duplicated, block: B:347:0x061f  */
    /* JADX WARN: Code duplicated, block: B:350:0x0625  */
    /* JADX WARN: Code duplicated, block: B:353:0x0630  */
    /* JADX WARN: Code duplicated, block: B:356:0x0635  */
    /* JADX WARN: Code duplicated, block: B:358:0x063d  */
    /* JADX WARN: Code duplicated, block: B:360:0x064c  */
    /* JADX WARN: Code duplicated, block: B:363:0x0654  */
    /* JADX WARN: Code duplicated, block: B:368:0x0671  */
    /* JADX WARN: Code duplicated, block: B:371:0x0676  */
    /* JADX WARN: Code duplicated, block: B:375:0x068a  */
    /* JADX WARN: Code duplicated, block: B:378:0x068f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [yx9] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xp9] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final xx9 a(Uri uri) {
        je9 je9Var;
        String strK;
        String strK2;
        long j;
        Object poeVar;
        ?? r1;
        Object obj;
        Throwable thA;
        je9 je9Var2;
        xx9 xx9Var;
        String str;
        je9 je9Var3;
        a4c a4cVar;
        xx9 xx9VarV;
        String str2;
        a4c a4cVar2;
        a4c a4cVar3;
        a4c a4cVar4;
        je9 je9Var4;
        String str3;
        a4c a4cVar5;
        long j2;
        String string;
        Throwable th;
        b87 b87Var;
        ?? r16;
        b87 b87Var2;
        ?? r11;
        boolean z;
        ?? r15;
        ?? ValueOf;
        Long lValueOf;
        ?? r2 = this;
        je9 je9Var5 = je9.f;
        je9 je9Var6 = je9.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str4 = r2.b;
        a4c a4cVar6 = gm0.f;
        String string2 = "***";
        if (a4cVar6 != null && a4cVar6.b(je9Var6)) {
            if (gm0.c()) {
                je9Var = je9Var5;
                strK = uri.toString();
            } else if (uri instanceof Collection) {
                Collection collection = (Collection) uri;
                if (collection.isEmpty()) {
                    je9Var = je9Var5;
                    strK = "[]";
                } else {
                    strK2 = c0a.k(collection.size(), "[**", "**]");
                    je9Var = je9Var5;
                    strK = strK2;
                }
            } else if (uri instanceof Map) {
                Map map = (Map) uri;
                if (map.isEmpty()) {
                    je9Var = je9Var5;
                    strK = "{}";
                } else {
                    strK2 = c0a.k(map.size(), "{**", "**}");
                    je9Var = je9Var5;
                    strK = strK2;
                }
            } else if (uri instanceof Object[]) {
                Object[] objArr = (Object[]) uri;
                je9Var = je9Var5;
                if (objArr.length == 0) {
                    strK = "[]";
                } else {
                    strK = c0a.k(objArr.length, "[**", "**]");
                }
            } else {
                je9Var = je9Var5;
                if (uri instanceof int[]) {
                    int[] iArr = (int[]) uri;
                    if (iArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(iArr.length, "[**", "**]");
                    }
                } else if (uri instanceof float[]) {
                    float[] fArr = (float[]) uri;
                    if (fArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(fArr.length, "[**", "**]");
                    }
                } else if (uri instanceof long[]) {
                    long[] jArr = (long[]) uri;
                    if (jArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(jArr.length, "[**", "**]");
                    }
                } else if (uri instanceof double[]) {
                    double[] dArr = (double[]) uri;
                    if (dArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(dArr.length, "[**", "**]");
                    }
                } else if (uri instanceof short[]) {
                    short[] sArr = (short[]) uri;
                    if (sArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(sArr.length, "[**", "**]");
                    }
                } else if (uri instanceof byte[]) {
                    byte[] bArr = (byte[]) uri;
                    if (bArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(bArr.length, "[**", "**]");
                    }
                } else if (uri instanceof char[]) {
                    char[] cArr = (char[]) uri;
                    if (cArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(cArr.length, "[**", "**]");
                    }
                } else if (uri instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) uri;
                    if (zArr.length == 0) {
                        strK = "[]";
                    } else {
                        strK = c0a.k(zArr.length, "[**", "**]");
                    }
                } else {
                    strK = "***";
                }
            }
            a4cVar6.c(je9Var6, str4, qv1.k("execute for->", strK), null);
        } else {
            je9Var = je9Var5;
        }
        xp9 xp9Var = new xp9(r2.a);
        try {
            String str5 = (String) xp9Var.c;
            a4c a4cVar7 = gm0.f;
            if (a4cVar7 != null && a4cVar7.b(je9Var6)) {
                try {
                    if (gm0.c()) {
                        string = uri.toString();
                        j2 = jElapsedRealtime;
                    } else {
                        j2 = jElapsedRealtime;
                        try {
                            if (uri instanceof Collection) {
                                if (((Collection) uri).isEmpty()) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((Collection) uri).size() + "**]";
                                }
                            } else if (uri instanceof Map) {
                                if (((Map) uri).isEmpty()) {
                                    string = "{}";
                                } else {
                                    string = "{**" + ((Map) uri).size() + "**}";
                                }
                            } else if (uri instanceof Object[]) {
                                if (((Object[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((Object[]) uri).length + "**]";
                                }
                            } else if (uri instanceof int[]) {
                                if (((int[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((int[]) uri).length + "**]";
                                }
                            } else if (uri instanceof float[]) {
                                if (((float[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((float[]) uri).length + "**]";
                                }
                            } else if (uri instanceof long[]) {
                                if (((long[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((long[]) uri).length + "**]";
                                }
                            } else if (uri instanceof double[]) {
                                if (((double[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((double[]) uri).length + "**]";
                                }
                            } else if (uri instanceof short[]) {
                                if (((short[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((short[]) uri).length + "**]";
                                }
                            } else if (uri instanceof byte[]) {
                                if (((byte[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((byte[]) uri).length + "**]";
                                }
                            } else if (uri instanceof char[]) {
                                if (((char[]) uri).length == 0) {
                                    string = "[]";
                                } else {
                                    string = "[**" + ((char[]) uri).length + "**]";
                                }
                            } else if (!(uri instanceof boolean[])) {
                                string = "***";
                            } else if (((boolean[]) uri).length == 0) {
                                string = "[]";
                            } else {
                                string = "[**" + ((boolean[]) uri).length + "**]";
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = xp9Var;
                            je9Var6 = je9Var6;
                            j = j2;
                            poeVar = new poe(th);
                            r1 = r2;
                            obj = poeVar;
                            thA = roe.a(obj);
                            if (thA != null) {
                                str3 = (String) r1.c;
                                a4cVar5 = gm0.f;
                                if (a4cVar5 == null) {
                                    je9Var2 = je9Var;
                                } else {
                                    je9Var2 = je9Var;
                                    if (a4cVar5.b(je9Var2)) {
                                        a4cVar5.c(je9Var2, str3, "Got error during extracting info from video", thA);
                                    }
                                }
                            } else {
                                je9Var2 = je9Var;
                            }
                            if (obj instanceof poe) {
                                obj = null;
                            }
                            xx9Var = (xx9) obj;
                            str = this.b;
                            if (xx9Var != null) {
                                a4cVar4 = gm0.f;
                                if (a4cVar4 != null) {
                                    je9Var4 = je9Var6;
                                    if (a4cVar4.b(je9Var4)) {
                                        a4cVar4.c(je9Var4, str, "execute: media info resolved with source=".concat(mw7.o(xx9Var.i)), null);
                                    }
                                }
                                return xx9Var;
                            }
                            je9Var3 = je9Var6;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var2, str, "execute: failed to resolve with Media3Retriever, fallback to AndroidMediaRetriever", null);
                            }
                            xx9VarV = new ih(this.a, 0).v(uri, j);
                            str2 = this.b;
                            if (xx9VarV != null) {
                                a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    a4cVar3.c(je9Var3, str2, "execute: media info resolved with source=".concat(mw7.o(xx9VarV.i)), null);
                                }
                                return xx9VarV;
                            }
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var2, str2, "execute: failed to resolve media info, fallback to unset", null);
                            }
                            return new xx9(uri, -9223372036854775807L, -1L, false, new b87[0], new b87[0], new b87[0], 0L, 1, null, null);
                        }
                    }
                    a4cVar7.c(je9Var6, str5, "execute for->" + string, null);
                } catch (Throwable th3) {
                    th = th3;
                    j2 = jElapsedRealtime;
                    r2 = xp9Var;
                    je9Var6 = je9Var6;
                    j = j2;
                    poeVar = new poe(th);
                    r1 = r2;
                    obj = poeVar;
                    thA = roe.a(obj);
                    if (thA != null) {
                        str3 = (String) r1.c;
                        a4cVar5 = gm0.f;
                        if (a4cVar5 == null) {
                            je9Var2 = je9Var;
                        } else {
                            je9Var2 = je9Var;
                            if (a4cVar5.b(je9Var2)) {
                                a4cVar5.c(je9Var2, str3, "Got error during extracting info from video", thA);
                            }
                        }
                    } else {
                        je9Var2 = je9Var;
                    }
                    if (obj instanceof poe) {
                        obj = null;
                    }
                    xx9Var = (xx9) obj;
                    str = this.b;
                    if (xx9Var != null) {
                        a4cVar4 = gm0.f;
                        if (a4cVar4 != null) {
                            je9Var4 = je9Var6;
                            if (a4cVar4.b(je9Var4)) {
                                a4cVar4.c(je9Var4, str, "execute: media info resolved with source=".concat(mw7.o(xx9Var.i)), null);
                            }
                        }
                        return xx9Var;
                    }
                    je9Var3 = je9Var6;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var2, str, "execute: failed to resolve with Media3Retriever, fallback to AndroidMediaRetriever", null);
                    }
                    xx9VarV = new ih(this.a, 0).v(uri, j);
                    str2 = this.b;
                    if (xx9VarV != null) {
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            a4cVar3.c(je9Var3, str2, "execute: media info resolved with source=".concat(mw7.o(xx9VarV.i)), null);
                        }
                        return xx9VarV;
                    }
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var2, str2, "execute: failed to resolve media info, fallback to unset", null);
                    }
                    return new xx9(uri, -9223372036854775807L, -1L, false, new b87[0], new b87[0], new b87[0], 0L, 1, null, null);
                }
            } else {
                j2 = jElapsedRealtime;
            }
            vp9 vp9VarM = xp9Var.M(uri);
            try {
                if (vp9VarM == null) {
                    if (gm0.c()) {
                        string2 = uri.toString();
                    } else if (uri instanceof Collection) {
                        if (((Collection) uri).isEmpty()) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((Collection) uri).size() + "**]";
                        }
                    } else if (uri instanceof Map) {
                        if (((Map) uri).isEmpty()) {
                            string2 = "{}";
                        } else {
                            string2 = "{**" + ((Map) uri).size() + "**}";
                        }
                    } else if (uri instanceof Object[]) {
                        if (((Object[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((Object[]) uri).length + "**]";
                        }
                    } else if (uri instanceof int[]) {
                        if (((int[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((int[]) uri).length + "**]";
                        }
                    } else if (uri instanceof float[]) {
                        if (((float[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((float[]) uri).length + "**]";
                        }
                    } else if (uri instanceof long[]) {
                        if (((long[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((long[]) uri).length + "**]";
                        }
                    } else if (uri instanceof double[]) {
                        if (((double[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((double[]) uri).length + "**]";
                        }
                    } else if (uri instanceof short[]) {
                        if (((short[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((short[]) uri).length + "**]";
                        }
                    } else if (uri instanceof byte[]) {
                        if (((byte[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((byte[]) uri).length + "**]";
                        }
                    } else if (uri instanceof char[]) {
                        if (((char[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((char[]) uri).length + "**]";
                        }
                    } else if (uri instanceof boolean[]) {
                        if (((boolean[]) uri).length == 0) {
                            string2 = "[]";
                        } else {
                            string2 = "[**" + ((boolean[]) uri).length + "**]";
                        }
                    }
                    throw new ji1("Failed to find a suitable extractor for " + string2, 5);
                }
                try {
                    String str6 = (String) xp9Var.c;
                    try {
                        a4c a4cVar8 = gm0.f;
                        if (a4cVar8 != null && a4cVar8.b(je9Var6)) {
                            b87Var = null;
                            a4cVar8.c(je9Var6, str6, "Opened extractor", null);
                        } else {
                            b87Var = null;
                        }
                        gg1 gg1Var = new gg1(vp9VarM);
                        ArrayList arrayList = (ArrayList) gg1Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b87 b87Var3 = ((wp9) it.next()).a;
                            if (b87Var3 != null) {
                                arrayList2.add(b87Var3);
                            }
                        }
                        b87[] b87VarArr = (b87[]) arrayList2.toArray(new b87[0]);
                        b87 b87Var4 = (b87) a.b1(b87VarArr);
                        if (b87Var4 != null) {
                            int i = b87Var4.p;
                            Integer numValueOf = Integer.valueOf(i);
                            if (i != -1) {
                                r16 = numValueOf;
                            } else {
                                r16 = b87Var;
                            }
                        } else {
                            r16 = b87Var;
                        }
                        int length = b87VarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                b87Var2 = b87Var;
                                break;
                            }
                            b87Var2 = b87VarArr[i2];
                            if (ex3.h(b87Var2.D)) {
                                break;
                            }
                            i2++;
                        }
                        long j3 = gg1Var.b;
                        try {
                            xbf xbfVar = (xbf) gg1Var.f;
                            if (xbfVar != null) {
                                lValueOf = Long.valueOf(xbfVar.h());
                            } else {
                                r11 = b87Var;
                            }
                            long jLongValue = r11 != 0 ? r11.longValue() : -9223372036854775807L;
                            if (b87Var2 != null) {
                                r11 = lValueOf;
                                r11 = lValueOf;
                                z = true;
                            } else {
                                r11 = lValueOf;
                                r11 = lValueOf;
                                z = false;
                            }
                            ArrayList arrayList3 = (ArrayList) gg1Var.d;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                b87 b87Var5 = ((wp9) it2.next()).a;
                                if (b87Var5 != null) {
                                    arrayList4.add(b87Var5);
                                }
                            }
                            b87[] b87VarArr2 = (b87[]) arrayList4.toArray(new b87[0]);
                            ArrayList arrayList5 = (ArrayList) gg1Var.e;
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it3 = arrayList5.iterator();
                            while (it3.hasNext()) {
                                b87 b87Var6 = ((wp9) it3.next()).a;
                                if (b87Var6 != null) {
                                    arrayList6.add(b87Var6);
                                }
                            }
                            b87[] b87VarArr3 = (b87[]) arrayList6.toArray(new b87[0]);
                            try {
                                Iterator it4 = ((ArrayList) gg1Var.c).iterator();
                                do {
                                    if (!it4.hasNext()) {
                                        r15 = b87Var;
                                        break;
                                    }
                                    r15 = (Float) ((wp9) it4.next()).c.c;
                                } while (r15 == 0);
                                if (r15 != 0) {
                                    b87VarArr3 = b87VarArr3;
                                    ValueOf = Float.valueOf((float) Math.ceil(r15.floatValue()));
                                } else {
                                    ValueOf = b87Var;
                                }
                                try {
                                    vp9VarM = vp9VarM;
                                    je9Var6 = je9Var6;
                                    r2 = xp9Var;
                                    j = j2;
                                    try {
                                        poeVar = new xx9(uri, jLongValue, j3, z, b87VarArr, b87VarArr2, b87VarArr3, SystemClock.elapsedRealtime() - j2, 2, ValueOf, r16);
                                        vp9VarM.close();
                                        r1 = r2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            rx8.n(vp9VarM, th);
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    r2 = xp9Var;
                                    j = j2;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r2 = xp9Var;
                                j = j2;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r2 = xp9Var;
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                th = th11;
                poeVar = new poe(th);
                r1 = r2;
            }
        } catch (Throwable th12) {
            th = th12;
            r2 = xp9Var;
            je9Var6 = je9Var6;
            j = jElapsedRealtime;
        }
        obj = poeVar;
        thA = roe.a(obj);
        if (thA != null) {
            str3 = (String) r1.c;
            a4cVar5 = gm0.f;
            if (a4cVar5 == null) {
                je9Var2 = je9Var;
            } else {
                je9Var2 = je9Var;
                if (a4cVar5.b(je9Var2)) {
                    a4cVar5.c(je9Var2, str3, "Got error during extracting info from video", thA);
                }
            }
        } else {
            je9Var2 = je9Var;
        }
        if (obj instanceof poe) {
            obj = null;
        }
        xx9Var = (xx9) obj;
        str = this.b;
        if (xx9Var != null) {
            a4cVar4 = gm0.f;
            if (a4cVar4 != null) {
                je9Var4 = je9Var6;
                if (a4cVar4.b(je9Var4)) {
                    a4cVar4.c(je9Var4, str, "execute: media info resolved with source=".concat(mw7.o(xx9Var.i)), null);
                }
            }
            return xx9Var;
        }
        je9Var3 = je9Var6;
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var2)) {
            a4cVar.c(je9Var2, str, "execute: failed to resolve with Media3Retriever, fallback to AndroidMediaRetriever", null);
        }
        xx9VarV = new ih(this.a, 0).v(uri, j);
        str2 = this.b;
        if (xx9VarV != null) {
            a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var3)) {
                a4cVar3.c(je9Var3, str2, "execute: media info resolved with source=".concat(mw7.o(xx9VarV.i)), null);
            }
            return xx9VarV;
        }
        a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, "execute: failed to resolve media info, fallback to unset", null);
        }
        return new xx9(uri, -9223372036854775807L, -1L, false, new b87[0], new b87[0], new b87[0], 0L, 1, null, null);
    }
}
