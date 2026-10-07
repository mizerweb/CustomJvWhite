package defpackage;

import android.view.Window;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l83 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l83(t83 t83Var, g83 g83Var, xf5 xf5Var, g83 g83Var2, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = t83Var;
        this.h = g83Var;
        this.j = xf5Var;
        this.i = g83Var2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                return new l83((t83) this.g, (g83) this.h, (xf5) obj2, (g83) obj3, lq4Var);
            case 1:
                l83 l83Var = new l83((ny8) obj3, (rl3) obj2, lq4Var, 1);
                l83Var.h = obj;
                return l83Var;
            case 2:
                l83 l83Var2 = new l83(lq4Var, (cf7) obj2, (rre) obj3);
                l83Var2.h = obj;
                return l83Var2;
            case 3:
                l83 l83Var3 = new l83((i19) this.h, (n09) obj3, (xx6) obj2, lq4Var, 3);
                l83Var3.g = obj;
                return l83Var3;
            case 4:
                l83 l83Var4 = new l83((wfe) obj3, (yx6) obj2, lq4Var, 4);
                l83Var4.h = obj;
                return l83Var4;
            case 5:
                l83 l83Var5 = new l83((xx6) this.h, (d9b) obj3, this.j, lq4Var, 5);
                l83Var5.g = obj;
                return l83Var5;
            case 6:
                return new l83(6, lq4Var, (k0g) this.g, (xx6) this.h, (d9b) obj3, this.j);
            case 7:
                l83 l83Var6 = new l83((x67) obj3, (vfe) obj2, lq4Var, 7);
                l83Var6.h = obj;
                return l83Var6;
            case 8:
                return new l83((yob) obj3, (ArrayList) obj2, lq4Var, 8);
            case 9:
                l83 l83Var7 = new l83((yfd) this.h, (ny8) obj3, (ny8) obj2, lq4Var, 9);
                l83Var7.g = obj;
                return l83Var7;
            case 10:
                return new l83((l9b) obj3, (qf7) obj2, lq4Var, 10);
            case 11:
                l83 l83Var8 = new l83((i19) this.h, (n09) obj3, (qf7) obj2, lq4Var, 11);
                l83Var8.g = obj;
                return l83Var8;
            case 12:
                return new l83(12, lq4Var, (dme) this.g, (qih) this.h, (aq) obj3, (yhh) obj2);
            case 13:
                l83 l83Var9 = new l83((rre) this.h, (ek2) obj3, (o05) obj2, lq4Var, 13);
                l83Var9.g = obj;
                return l83Var9;
            case 14:
                l83 l83Var10 = new l83((vbf) this.h, (br4) obj3, (Window) obj2, lq4Var, 14);
                l83Var10.g = obj;
                return l83Var10;
            case 15:
                l83 l83Var11 = new l83((nub) this.h, (int[]) obj3, (String[]) obj2, lq4Var, 15);
                l83Var11.g = obj;
                return l83Var11;
            default:
                l83 l83Var12 = new l83((xyj) obj3, (oyj) obj2, lq4Var, 16);
                l83Var12.h = obj;
                return l83Var12;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((l83) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((l83) create((pzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((l83) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((l83) create(new ds2(((ds2) obj).a), (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((l83) create((h0g) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((l83) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((l83) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                ((l83) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            default:
                return ((l83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d A[PHI: r3 r4
  0x004d: PHI (r3v89 xyj) = (r3v88 xyj), (r3v104 xyj) binds: [B:15:0x004a, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r4v50 java.lang.Object) = (r4v49 java.lang.Object), (r4v61 java.lang.Object) binds: [B:15:0x004a, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:367:0x077f A[PHI: r5 r6
  0x077f: PHI (r5v6 ozh) = (r5v5 ozh), (r5v5 ozh), (r5v10 ozh) binds: [B:360:0x076a, B:365:0x077c, B:353:0x072f] A[DONT_GENERATE, DONT_INLINE]
  0x077f: PHI (r6v4 pzh) = (r6v3 pzh), (r6v3 pzh), (r6v9 pzh) binds: [B:360:0x076a, B:365:0x077c, B:353:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:370:0x0793 A[PHI: r0 r6
  0x0793: PHI (r0v17 java.lang.Object) = (r0v15 java.lang.Object), (r0v21 java.lang.Object) binds: [B:368:0x0790, B:352:0x0724] A[DONT_GENERATE, DONT_INLINE]
  0x0793: PHI (r6v5 pzh) = (r6v4 pzh), (r6v10 pzh) binds: [B:368:0x0790, B:352:0x0724] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l83.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l83(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l83(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        super(2, lq4Var);
        this.e = 2;
        this.i = rreVar;
        this.j = cf7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l83(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l83(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }
}
