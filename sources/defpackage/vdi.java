package defpackage;

import java.util.HashSet;
import java.util.Set;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class vdi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final l8b h = new l8b();
    public final l9b i = new l9b();
    public final String j = vdi.class.getName();

    public vdi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(vdi vdiVar, long j, Set set, nq4 nq4Var) {
        pdi pdiVar;
        l9b l9bVar;
        boolean zRemoveAll;
        l8b l8bVar = vdiVar.h;
        if (nq4Var instanceof pdi) {
            pdiVar = (pdi) nq4Var;
            int i = pdiVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdiVar.i = i - Integer.MIN_VALUE;
            } else {
                pdiVar = new pdi(vdiVar, nq4Var);
            }
        } else {
            pdiVar = new pdi(vdiVar, nq4Var);
        }
        Object obj = pdiVar.g;
        int i2 = pdiVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = vdiVar.i;
            pdiVar.e = set;
            pdiVar.f = l9bVar;
            pdiVar.d = j;
            pdiVar.i = 1;
            Object objB = l9bVar.b(pdiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = pdiVar.d;
            l9bVar = pdiVar.f;
            set = pdiVar.e;
            ch3.d0(obj);
        }
        try {
            HashSet hashSet = (HashSet) l8bVar.f(j);
            if (hashSet != null) {
                zRemoveAll = hashSet.removeAll(set);
                if (hashSet.isEmpty()) {
                    l8bVar.k(j);
                }
            } else {
                zRemoveAll = false;
            }
            return Boolean.valueOf(zRemoveAll);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, long j2, nq4 nq4Var) {
        odi odiVar;
        l9b l9bVar;
        if (nq4Var instanceof odi) {
            odiVar = (odi) nq4Var;
            int i = odiVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                odiVar.i = i - Integer.MIN_VALUE;
            } else {
                odiVar = new odi(this, nq4Var);
            }
        } else {
            odiVar = new odi(this, nq4Var);
        }
        Object obj = odiVar.g;
        int i2 = odiVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.i;
            odiVar.f = l9bVar2;
            odiVar.d = j;
            odiVar.e = j2;
            odiVar.i = 1;
            Object objB = l9bVar2.b(odiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = odiVar.e;
            j = odiVar.d;
            l9bVar = odiVar.f;
            ch3.d0(obj);
        }
        try {
            l8b l8bVar = this.h;
            Object objF = l8bVar.f(j);
            if (objF == null) {
                objF = new HashSet();
                l8bVar.l(j, objF);
            }
            return Boolean.valueOf(((HashSet) objF).add(new Long(j2)));
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(long j, long j2, nq4 nq4Var) {
        qdi qdiVar;
        l9b l9bVar;
        l8b l8bVar = this.h;
        if (nq4Var instanceof qdi) {
            qdiVar = (qdi) nq4Var;
            int i = qdiVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdiVar.i = i - Integer.MIN_VALUE;
            } else {
                qdiVar = new qdi(this, nq4Var);
            }
        } else {
            qdiVar = new qdi(this, nq4Var);
        }
        Object obj = qdiVar.g;
        int i2 = qdiVar.i;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = this.i;
            qdiVar.f = l9bVar;
            qdiVar.d = j;
            qdiVar.e = j2;
            qdiVar.i = 1;
            Object objB = l9bVar.b(qdiVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = qdiVar.e;
            j = qdiVar.d;
            l9bVar = qdiVar.f;
            ch3.d0(obj);
        }
        try {
            HashSet hashSet = (HashSet) l8bVar.f(j);
            if (hashSet != null && hashSet.remove(new Long(j2)) && hashSet.isEmpty()) {
                l8bVar.k(j);
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0171  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010b -> B:35:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x013b -> B:40:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01a1 -> B:53:0x01a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(long r20, defpackage.pw r22, defpackage.nq4 r23) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdi.d(long, pw, nq4):java.lang.Object");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:256:0x0965 -> B:257:0x0971). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x0a19 -> B:272:0x0a2c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:276:0x0a58 -> B:277:0x0a60). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x02ce -> B:38:0x02ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x039e -> B:54:0x03a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x041f -> B:67:0x042a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0461 -> B:80:0x0473). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 26881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object e(defpackage.m8b r54, defpackage.nq4 r55) {
        /*
            Method dump skipped, instruction units count: 2688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdi.e(m8b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(q3b q3bVar, nq4 nq4Var) {
        udi udiVar;
        if (nq4Var instanceof udi) {
            udiVar = (udi) nq4Var;
            int i = udiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                udiVar.g = i - Integer.MIN_VALUE;
            } else {
                udiVar = new udi(this, nq4Var);
            }
        } else {
            udiVar = new udi(this, nq4Var);
        }
        Object objI = udiVar.e;
        int i2 = udiVar.g;
        Object obj = null;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) this.a.getValue();
            long j = q3bVar.c;
            udiVar.d = q3bVar;
            udiVar.g = 1;
            objI = xn3Var.i(j, udiVar);
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q3bVar = udiVar.d;
            ch3.d0(objI);
        }
        rt2 rt2Var = (rt2) objI;
        sbi sbiVar = sbi.a;
        if (rt2Var != null) {
            for (Object obj2 : q3bVar.d) {
                if (((gda) obj2).a == rt2Var.c.a.b) {
                    obj = obj2;
                    break;
                }
            }
            if (obj != null) {
                sua suaVar = (sua) this.c.getValue();
                sfa sfaVarR = ((ose) suaVar.a).r(rt2Var.a, mg5.REGULAR);
                if (sfaVarR != null) {
                    b bVar = (b) this.g.getValue();
                    (rt2Var instanceof s04 ? bVar.h : bVar.g).remove(Long.valueOf(sfaVarR.a));
                    ((qw2) this.b.getValue()).g0(rt2Var.a, sfaVarR, true, null);
                }
            }
        }
        return sbiVar;
    }
}
