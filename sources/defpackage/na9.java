package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class na9 extends f83 {
    public final Context c;
    public final zed d;
    public final xhh e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;

    public na9(Context context, zed zedVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        super(ny8Var7);
        this.c = context;
        this.d = zedVar;
        this.e = xhhVar;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:104:0x0302  */
    /* JADX WARN: Code duplicated, block: B:106:0x0306  */
    /* JADX WARN: Code duplicated, block: B:107:0x030d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0310  */
    /* JADX WARN: Code duplicated, block: B:111:0x0318  */
    /* JADX WARN: Code duplicated, block: B:121:0x0354  */
    /* JADX WARN: Code duplicated, block: B:123:0x035d  */
    /* JADX WARN: Code duplicated, block: B:124:0x036b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0371  */
    /* JADX WARN: Code duplicated, block: B:128:0x0377  */
    /* JADX WARN: Code duplicated, block: B:129:0x0385  */
    /* JADX WARN: Code duplicated, block: B:131:0x038b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0391  */
    /* JADX WARN: Code duplicated, block: B:135:0x0394  */
    /* JADX WARN: Code duplicated, block: B:137:0x039a  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:145:0x03af  */
    /* JADX WARN: Code duplicated, block: B:147:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c1 A[PHI: r6
  0x03c1: PHI (r6v24 java.lang.String) = (r6v23 java.lang.String), (r6v27 java.lang.String), (r6v28 java.lang.String) binds: [B:134:0x0392, B:140:0x03a1, B:148:0x03c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0402  */
    /* JADX WARN: Code duplicated, block: B:167:0x0405  */
    /* JADX WARN: Code duplicated, block: B:169:0x040d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0410  */
    /* JADX WARN: Code duplicated, block: B:173:0x0413  */
    /* JADX WARN: Code duplicated, block: B:175:0x0416  */
    /* JADX WARN: Code duplicated, block: B:178:0x041c  */
    /* JADX WARN: Code duplicated, block: B:179:0x041f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0422  */
    /* JADX WARN: Code duplicated, block: B:182:0x042a  */
    /* JADX WARN: Code duplicated, block: B:184:0x042d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0430  */
    /* JADX WARN: Code duplicated, block: B:188:0x0433  */
    /* JADX WARN: Code duplicated, block: B:189:0x0436  */
    /* JADX WARN: Code duplicated, block: B:190:0x0439  */
    /* JADX WARN: Code duplicated, block: B:191:0x043c  */
    /* JADX WARN: Code duplicated, block: B:192:0x043f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0442  */
    /* JADX WARN: Code duplicated, block: B:195:0x047d  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:27:0x0105  */
    /* JADX WARN: Code duplicated, block: B:29:0x010b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x0120  */
    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:46:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0177  */
    /* JADX WARN: Code duplicated, block: B:52:0x017f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b A[PHI: r44
  0x019b: PHI (r44v1 ja9) = (r44v3 ja9), (r44v3 ja9), (r44v4 ja9) binds: [B:53:0x0183, B:55:0x0199, B:47:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01de  */
    /* JADX WARN: Code duplicated, block: B:68:0x0225  */
    /* JADX WARN: Code duplicated, block: B:70:0x0230  */
    /* JADX WARN: Code duplicated, block: B:76:0x0248  */
    /* JADX WARN: Code duplicated, block: B:78:0x0254  */
    /* JADX WARN: Code duplicated, block: B:79:0x025d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0264  */
    /* JADX WARN: Code duplicated, block: B:83:0x026a  */
    /* JADX WARN: Code duplicated, block: B:84:0x026f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0293  */
    /* JADX WARN: Code duplicated, block: B:87:0x029c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0123 -> B:37:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(defpackage.rt2 r59, java.util.List r60, java.util.List r61, int r62, boolean r63, defpackage.nq4 r64) {
        /*
            Method dump skipped, instruction units count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na9.o(rt2, java.util.List, java.util.List, int, boolean, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01a9 -> B:68:0x01ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(defpackage.m8b r18, defpackage.nq4 r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na9.p(m8b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(List list, nq4 nq4Var) {
        la9 la9Var;
        if (nq4Var instanceof la9) {
            la9Var = (la9) nq4Var;
            int i = la9Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                la9Var.f = i - Integer.MIN_VALUE;
            } else {
                la9Var = new la9(this, nq4Var);
            }
        } else {
            la9Var = new la9(this, nq4Var);
        }
        Object objA = la9Var.d;
        int i2 = la9Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objA);
                tnb tnbVar = (tnb) this.k.getValue();
                List list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Long(((rt2) it.next()).b.a));
                }
                la9Var.f = 1;
                objA = tnbVar.a(arrayList, la9Var);
                Object obj = hu4.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objA);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V("na9", "getSystemReadMarks: failed", th);
            objA = r66.a;
        }
        List<xmb> list3 = (List) objA;
        if (list3.isEmpty()) {
            return gi9.a;
        }
        k8b k8bVar = new k8b(list3.size());
        for (xmb xmbVar : list3) {
            k8bVar.g(xmbVar.a().a, xmbVar.b());
        }
        return k8bVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:108:0x030b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0344  */
    /* JADX WARN: Code duplicated, block: B:122:0x0393  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:26:0x010a  */
    /* JADX WARN: Code duplicated, block: B:28:0x010d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:35:0x017f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0182  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0202  */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:56:0x0215  */
    /* JADX WARN: Code duplicated, block: B:66:0x0228  */
    /* JADX WARN: Code duplicated, block: B:68:0x023a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0247 A[PHI: r32 r33 r34
  0x0247: PHI (r32v5 k8b) = (r32v3 k8b), (r32v3 k8b), (r32v3 k8b), (r32v6 k8b) binds: [B:50:0x01ff, B:69:0x0244, B:64:0x0225, B:46:0x01e2] A[DONT_GENERATE, DONT_INLINE]
  0x0247: PHI (r33v4 hu4) = (r33v2 hu4), (r33v2 hu4), (r33v2 hu4), (r33v5 hu4) binds: [B:50:0x01ff, B:69:0x0244, B:64:0x0225, B:46:0x01e2] A[DONT_GENERATE, DONT_INLINE]
  0x0247: PHI (r34v3 int) = (r34v1 int), (r34v1 int), (r34v1 int), (r34v4 int) binds: [B:50:0x01ff, B:69:0x0244, B:64:0x0225, B:46:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0264  */
    /* JADX WARN: Code duplicated, block: B:76:0x0270  */
    /* JADX WARN: Code duplicated, block: B:77:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0275  */
    /* JADX WARN: Code duplicated, block: B:79:0x0283  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0288  */
    /* JADX WARN: Code duplicated, block: B:83:0x028c  */
    /* JADX WARN: Code duplicated, block: B:90:0x029d  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x02b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x032c -> B:22:0x00f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0393 -> B:123:0x039c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x03b0 -> B:124:0x03ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:90:0x029d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable r(java.util.ArrayList r39, defpackage.nq4 r40) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na9.r(java.util.ArrayList, nq4):java.io.Serializable");
    }
}
