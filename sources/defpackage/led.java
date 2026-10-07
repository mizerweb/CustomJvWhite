package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class led extends mdh implements qf7 {
    public List e;
    public v56 f;
    public Context g;
    public Iterator h;
    public Map.Entry i;
    public int j;
    public int k;
    public final /* synthetic */ v56 l;
    public final /* synthetic */ Context m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public led(v56 v56Var, Context context, List list, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = v56Var;
        this.m = context;
        this.n = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new led(this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((led) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[LOOP:0: B:9:0x0046->B:26:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0088 -> B:18:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008e -> B:20:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:26:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.k
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L22
            if (r0 != r1) goto L1c
            int r0 = r11.j
            java.util.Map$Entry r4 = r11.i
            java.util.Iterator r5 = r11.h
            android.content.Context r6 = r11.g
            v56 r7 = r11.f
            java.util.List r8 = r11.e
            java.util.List r8 = (java.util.List) r8
            defpackage.ch3.d0(r12)
            goto L8b
        L1c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r3
        L22:
            defpackage.ch3.d0(r12)
            v56 r12 = r11.l
            java.lang.Object r0 = r12.b
            ny8 r0 = (defpackage.ny8) r0
            java.lang.Object r0 = r0.getValue()
            cm0 r0 = (defpackage.cm0) r0
            android.content.Context r4 = r11.m
            java.util.LinkedHashMap r0 = r0.c(r4, r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List r5 = r11.n
            r7 = r12
            r6 = r4
            r8 = r5
            r5 = r0
            r0 = r2
        L46:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto Laa
            java.lang.Object r12 = r5.next()
            r4 = r12
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r12 = r4.getKey()
            boolean r12 = r8.contains(r12)
            if (r12 == 0) goto L46
            java.lang.Object r12 = r4.getValue()
            tri r12 = (defpackage.tri) r12
            sri r12 = r12.a
            if (r12 == 0) goto L8e
            java.lang.Object r9 = r7.b
            ny8 r9 = (defpackage.ny8) r9
            java.lang.Object r9 = r9.getValue()
            cm0 r9 = (defpackage.cm0) r9
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r11.e = r10
            r11.f = r7
            r11.g = r6
            r11.h = r5
            r11.i = r4
            r11.j = r0
            r11.k = r1
            java.lang.Object r12 = r9.d(r6, r12, r11)
            hu4 r9 = defpackage.hu4.a
            if (r12 != r9) goto L8b
            return r9
        L8b:
            geh r12 = (defpackage.geh) r12
            goto L8f
        L8e:
            r12 = r3
        L8f:
            oph r9 = new oph
            java.lang.Object r10 = r4.getValue()
            tri r10 = (defpackage.tri) r10
            nph r12 = defpackage.sb8.q0(r10, r12)
            r9.<init>(r12, r2)
            android.util.LruCache r12 = defpackage.jph.a
            java.lang.Object r12 = r4.getKey()
            hm0 r12 = (defpackage.hm0) r12
            defpackage.jph.a(r12, r9)
            goto L46
        Laa:
            sbi r11 = defpackage.sbi.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.led.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
