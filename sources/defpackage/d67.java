package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class d67 extends a8j {
    public final long[] c;
    public final xhh d;
    public final ffi e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final mjg j;
    public final r8e k;
    public final pzf l;
    public final q8e m;
    public final AtomicReference n;
    public final mjg o;
    public final r8e p;

    public d67(long[] jArr, sy4 sy4Var, xhh xhhVar, ffi ffiVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = jArr;
        this.d = xhhVar;
        this.e = ffiVar;
        this.f = ny8Var2;
        this.g = ny8Var;
        mjg mjgVarA = p90.a(null);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(Boolean.FALSE);
        this.j = mjgVarA2;
        this.k = new r8e(mjgVarA2);
        pzf pzfVarB = e9i.b(0, 1, 5);
        this.l = pzfVarB;
        this.m = new q8e(pzfVarB);
        this.n = new AtomicReference(null);
        mjg mjgVarA3 = p90.a(c76.a);
        this.o = mjgVarA3;
        this.p = new r8e(mjgVarA3);
        e9i.j0(e9i.T(new fz6(sy4Var.n, new vk4((Object) this, (lq4) null, false, (Object) ny8Var3, 19), 3), ((n0c) xhhVar).a()), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007c -> B:22:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Enum B(defpackage.d67 r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d67.B(d67, nq4):java.lang.Enum");
    }

    public static boolean C(r17 r17Var, long[] jArr) {
        for (long j : jArr) {
            if (r17Var.e.contains(Long.valueOf(j))) {
            }
        }
        return jArr.length != 0;
    }
}
