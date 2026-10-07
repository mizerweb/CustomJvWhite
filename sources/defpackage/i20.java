package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class i20 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public long g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i20(rog rogVar, long j, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 28;
        this.h = rogVar;
        this.g = j;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new i20((p20) obj2, this.g, lq4Var, 0);
            case 1:
                i20 i20Var = new i20((dg0) obj2, lq4Var, 1);
                i20Var.g = ((Number) obj).longValue();
                return i20Var;
            case 2:
                return new i20((l01) obj2, this.g, lq4Var, 2);
            case 3:
                return new i20((pe1) obj2, this.g, lq4Var, 3);
            case 4:
                return new i20(this.g, (h22) obj2, lq4Var, 4);
            case 5:
                return new i20(this.g, (kb2) obj2, lq4Var, 5);
            case 6:
                return new i20((qw2) obj2, this.g, lq4Var, 6);
            case 7:
                return new i20((h03) obj2, this.g, lq4Var, 7);
            case 8:
                return new i20((xd3) obj2, this.g, lq4Var, 8);
            case 9:
                return new i20((os3) obj2, this.g, lq4Var, 9);
            case 10:
                return new i20((q04) obj2, this.g, lq4Var, 10);
            case 11:
                return new i20((qb4) obj2, lq4Var, 11);
            case 12:
                return new i20((tm4) obj2, this.g, lq4Var, 12);
            case 13:
                return new i20((DownloadAttachesWorker) obj2, this.g, lq4Var, 13);
            case 14:
                return new i20((kw5) obj2, lq4Var, 14);
            case 15:
                return new i20((i64) obj2, this.g, lq4Var, 15);
            case 16:
                return new i20((f37) obj2, this.g, lq4Var, 16);
            case 17:
                return new i20((c59) obj2, this.g, lq4Var, 17);
            case 18:
                return new i20((as9) obj2, this.g, lq4Var, 18);
            case 19:
                return new i20((fva) obj2, this.g, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new i20((gkb) obj2, this.g, lq4Var, 20);
            case 21:
                return new i20((vfd) obj2, this.g, lq4Var, 21);
            case 22:
                return new i20(this.g, (srd) obj2, lq4Var, 22);
            case 23:
                return new i20((o0e) obj2, lq4Var, 23);
            case 24:
                return new i20((jce) obj2, this.g, lq4Var, 24);
            case 25:
                return new i20((s4f) obj2, this.g, lq4Var, 25);
            case 26:
                return new i20((ilf) obj2, this.g, lq4Var, 26);
            case 27:
                return new i20((xhg) obj2, this.g, lq4Var, 27);
            case 28:
                return new i20((rog) obj2, this.g, this.f, lq4Var);
            default:
                return new i20((l95) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((i20) create(Long.valueOf(((Number) obj).longValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((i20) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4Var;
            case 15:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4Var;
            case 26:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((i20) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:318:0x06da  */
    /* JADX WARN: Code duplicated, block: B:320:0x06f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02ee -> B:127:0x02f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:17:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x06ef -> B:321:0x06f3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i20.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i20(long j, Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = j;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i20(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.g = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i20(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }
}
