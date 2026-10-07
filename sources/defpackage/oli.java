package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class oli extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oli(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.h
            m3k r0 = (defpackage.m3k) r0
            java.lang.Object r1 = r6.g
            gu4 r1 = (defpackage.gu4) r1
            int r2 = r6.f
            r3 = 1
            if (r2 == 0) goto L1a
            if (r2 != r3) goto L13
            defpackage.ch3.d0(r7)
            goto L3a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            r6 = 0
            return r6
        L1a:
            defpackage.ch3.d0(r7)
        L1d:
            boolean r7 = defpackage.cqk.x(r1)
            if (r7 == 0) goto L4a
            ghb r7 = defpackage.ew5.b
            lw5 r7 = defpackage.lw5.SECONDS
            r2 = 30
            long r4 = defpackage.qe7.O(r2, r7)
            r6.g = r1
            r6.f = r3
            java.lang.Object r7 = defpackage.rx8.u(r4, r6)
            hu4 r2 = defpackage.hu4.a
            if (r7 != r2) goto L3a
            return r2
        L3a:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r0.g = r4
            long r4 = android.os.SystemClock.uptimeMillis()
            r0.h = r4
            r0.a()
            goto L1d
        L4a:
            sbi r6 = defpackage.sbi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oli.l(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new oli((cf7) this.g, (i64) obj2, lq4Var, 0);
            case 1:
                return new oli((nli) this.g, (ArrayList) obj2, lq4Var, 1);
            case 2:
                return new oli((gpi) this.g, (m8b) obj2, lq4Var, 2);
            case 3:
                return new oli((gpi) this.g, (String) obj2, lq4Var, 3);
            case 4:
                return new oli((gpi) this.g, (lsg) obj2, lq4Var, 4);
            case 5:
                return new oli((e3j) this.g, (d0j) obj2, lq4Var, 5);
            case 6:
                return new oli((hbc) this.g, (l1j) obj2, lq4Var, 6);
            case 7:
                return new oli((hbc) this.g, (sfa) obj2, lq4Var, 7);
            case 8:
                return new oli((g1j) this.g, (Bitmap) obj2, lq4Var, 8);
            case 9:
                return new oli((xx6) this.g, (iaj) obj2, lq4Var, 9);
            case 10:
                return new oli((rej) this.g, (cx0) obj2, lq4Var, 10);
            case 11:
                return new oli((rej) this.g, (mx0) obj2, lq4Var, 11);
            case 12:
                return new oli((rej) this.g, (String) obj2, lq4Var, 12);
            case 13:
                return new oli((phj) this.g, (shj) obj2, lq4Var, 13);
            case 14:
                return new oli((bij) this.g, (aij) obj2, lq4Var, 14);
            case 15:
                return new oli((hmj) this.g, (q6f) obj2, lq4Var, 15);
            case 16:
                return new oli((ioj) this.g, (es8) obj2, lq4Var, 16);
            case 17:
                return new oli((ioj) this.g, (String) obj2, lq4Var, 17);
            case 18:
                return new oli((ioj) this.g, (qpj) obj2, lq4Var, 18);
            case 19:
                oli oliVar = new oli((dtj) obj2, lq4Var, 19);
                oliVar.g = obj;
                return oliVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new oli((v9k) obj2, lq4Var, 20);
            case 21:
                oli oliVar2 = new oli((x9k) obj2, lq4Var, 21);
                oliVar2.g = obj;
                return oliVar2;
            case 22:
                oli oliVar3 = new oli((Context) obj2, lq4Var, 22);
                oliVar3.g = obj;
                return oliVar3;
            case 23:
                return new oli((js8) this.g, (String) obj2, lq4Var, 23);
            case 24:
                return new oli((xde) this.g, (String) obj2, lq4Var, 24);
            case 25:
                oli oliVar4 = new oli((xo9) obj2, lq4Var, 25);
                oliVar4.g = obj;
                return oliVar4;
            case 26:
                return new oli((efk) obj2, lq4Var, 26);
            case 27:
                oli oliVar5 = new oli((m3k) obj2, lq4Var, 27);
                oliVar5.g = obj;
                return oliVar5;
            default:
                return new oli((xo9) this.g, (ku0) obj2, lq4Var, 28);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        Object obj3 = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((oli) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((oli) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new oli((v9k) obj3, (lq4) obj2, 20).invokeSuspend(sbiVar);
            case 21:
                oli oliVar = new oli((x9k) obj3, (lq4) obj2, 21);
                oliVar.g = (gu4) obj;
                return oliVar.invokeSuspend(sbiVar);
            case 22:
                oli oliVar2 = new oli((Context) obj3, (lq4) obj2, 22);
                oliVar2.g = (njd) obj;
                return oliVar2.invokeSuspend(sbiVar);
            case 23:
                return new oli((js8) this.g, (String) obj3, (lq4) obj2, 23).invokeSuspend(sbiVar);
            case 24:
                return new oli((xde) this.g, (String) obj3, (lq4) obj2, 24).invokeSuspend(sbiVar);
            case 25:
                oli oliVar3 = new oli((xo9) obj3, (lq4) obj2, 25);
                oliVar3.g = (pv0) obj;
                return oliVar3.invokeSuspend(sbiVar);
            case 26:
                return new oli((efk) obj3, (lq4) obj2, 26).invokeSuspend(sbiVar);
            case 27:
                oli oliVar4 = new oli((m3k) obj3, (lq4) obj2, 27);
                oliVar4.g = (gu4) obj;
                return oliVar4.invokeSuspend(sbiVar);
            default:
                return new oli((xo9) this.g, (ku0) obj3, (lq4) obj2, 28).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x027a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[PHI: r7 r8
  0x0286: PHI (r7v9 java.lang.Object) = (r7v8 java.lang.Object), (r7v25 java.lang.Object) binds: [B:123:0x0282, B:107:0x0229] A[DONT_GENERATE, DONT_INLINE]
  0x0286: PHI (r8v23 gu4) = (r8v22 gu4), (r8v27 gu4) binds: [B:123:0x0282, B:107:0x0229] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x028e  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02c7 A[LOOP:3: B:134:0x02c1->B:136:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:180:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:189:0x0461  */
    /* JADX WARN: Code duplicated, block: B:190:0x0467  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd A[PHI: r3
  0x00dd: PHI (r3v108 com.vk.push.common.AppInfo) = (r3v107 com.vk.push.common.AppInfo), (r3v113 com.vk.push.common.AppInfo) binds: [B:39:0x00da, B:29:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:528:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e2, code lost:
    
        if (r2 == r13) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x033e, code lost:
    
        if (r12.e(r25) == r13) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r0.e(r25) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0493, code lost:
    
        if (r3.a(r2, r25) == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0524, code lost:
    
        if (r1 == r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0657, code lost:
    
        if (r4 == r0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x06bc, code lost:
    
        if (r3 == r0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0810, code lost:
    
        if (r0 == r13) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0856, code lost:
    
        if (defpackage.rej.a((defpackage.rej) r25.g, (defpackage.ix0) r1, r25) == r0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0883, code lost:
    
        if (defpackage.rej.c(r3, (defpackage.mx0) r1, r2, r25) == r0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0896, code lost:
    
        if (defpackage.rej.b(r3, (defpackage.jx0) r1, r2, r25) == r0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r4.a(r6, defpackage.gg5.q, r7, r25) == r1) goto L43;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:190:0x0467, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 2998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oli.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oli(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
