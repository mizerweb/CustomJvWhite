package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class icg {
    public final rre b;
    public final String a = getClass().getName();
    public final gp0 d = new gp0(24);
    public final nh3 c = new nh3(2, this);

    public icg(rre rreVar) {
        this.b = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(icg icgVar, jcg jcgVar, nq4 nq4Var) {
        gcg gcgVar;
        if (nq4Var instanceof gcg) {
            gcgVar = (gcg) nq4Var;
            int i = gcgVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gcgVar.i = i - Integer.MIN_VALUE;
            } else {
                gcgVar = new gcg(icgVar, nq4Var);
            }
        } else {
            gcgVar = new gcg(icgVar, nq4Var);
        }
        Object objA = gcgVar.g;
        int i2 = gcgVar.i;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            gcgVar.d = icgVar;
            gcgVar.e = jcgVar;
            gcgVar.i = 1;
            objA = icgVar.a(jcgVar, gcgVar);
            if (objA != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj = gcgVar.f;
            ch3.d0(objA);
            return obj;
        }
        jcgVar = gcgVar.e;
        icgVar = gcgVar.d;
        ch3.d0(objA);
        gcgVar.d = null;
        gcgVar.e = null;
        gcgVar.f = objA;
        gcgVar.i = 2;
        Object objI = ch3.I(gcgVar, icgVar.b, false, true, new ol(icgVar, 17, jcgVar));
        if (objI != hu4Var) {
            objI = sbi.a;
        }
        return objI == hu4Var ? hu4Var : objA;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0095 -> B:27:0x0099). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.jcg r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icg.a(jcg, nq4):java.lang.Object");
    }
}
