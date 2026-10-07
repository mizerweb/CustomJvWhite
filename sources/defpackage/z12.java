package defpackage;

import ru.ok.tamtam.android.util.share.ShareData;

/* JADX INFO: loaded from: classes4.dex */
public final class z12 extends mdh implements qf7 {
    public f9b e;
    public a22 f;
    public ShareData g;
    public x12 h;
    public Object i;
    public y12 j;
    public int k;
    public int l;
    public final /* synthetic */ a22 m;
    public final /* synthetic */ ShareData n;
    public final /* synthetic */ x12 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(a22 a22Var, ShareData shareData, x12 x12Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.m = a22Var;
        this.n = shareData;
        this.o = x12Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new z12(this.m, this.n, this.o, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((z12) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0099 -> B:31:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0084
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.l
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 != r3) goto L1c
            int r0 = r13.k
            y12 r4 = r13.j
            java.lang.Object r5 = r13.i
            x12 r6 = r13.h
            ru.ok.tamtam.android.util.share.ShareData r7 = r13.g
            a22 r8 = r13.f
            f9b r9 = r13.e
            defpackage.ch3.d0(r14)
            goto L9c
        L1c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r1
        L22:
            defpackage.ch3.d0(r14)
            a22 r14 = r13.m
            mjg r0 = r14.g
            ru.ok.tamtam.android.util.share.ShareData r4 = r13.n
            x12 r5 = r13.o
            r8 = r14
            r9 = r0
            r0 = r2
            r7 = r4
            r6 = r5
        L32:
            java.lang.Object r5 = r9.getValue()
            r4 = r5
            y12 r4 = (defpackage.y12) r4
            l12 r14 = r8.b
            r13.e = r9
            r13.f = r8
            r13.g = r7
            r13.h = r6
            r13.i = r5
            r13.j = r4
            r13.k = r0
            r13.l = r3
            r14.getClass()
            if (r7 != 0) goto L5d
            java.lang.Class<l12> r14 = defpackage.l12.class
            java.lang.String r14 = r14.getName()
            java.lang.String r10 = "Early return in getQuoteData cuz of shareData == null"
            defpackage.gm0.Y(r14, r10)
            r14 = r1
            goto L97
        L5d:
            java.lang.String r14 = r7.text
            if (r14 == 0) goto L6a
            boolean r14 = defpackage.r5h.X0(r14)
            if (r14 == 0) goto L68
            goto L6a
        L68:
            r14 = r2
            goto L6b
        L6a:
            r14 = r3
        L6b:
            tnh r10 = new tnh
            r11 = 2131824275(0x7f110e93, float:1.9281373E38)
            r10.<init>(r11)
            if (r14 != 0) goto L8a
            k12 r14 = new k12
            java.lang.String r11 = r7.text
            if (r11 == 0) goto L84
            xnh r12 = new xnh
            r12.<init>(r11)
            r14.<init>(r12)
            goto L8f
        L84:
            java.lang.String r13 = "Required value was null."
            defpackage.ore.p(r13)
            return r1
        L8a:
            k12 r14 = new k12
            r14.<init>(r1)
        L8f:
            t12 r11 = new t12
            ynh r14 = r14.a
            r11.<init>(r10, r14)
            r14 = r11
        L97:
            hu4 r10 = defpackage.hu4.a
            if (r14 != r10) goto L9c
            return r10
        L9c:
            t12 r14 = (defpackage.t12) r14
            y12 r14 = defpackage.y12.a(r4, r1, r14, r6, r3)
            boolean r14 = r9.h(r5, r14)
            if (r14 == 0) goto L32
            sbi r13 = defpackage.sbi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z12.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
