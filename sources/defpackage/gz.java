package defpackage;

import android.view.View;
import java.util.List;
import java.util.Set;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class gz extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(Object obj, lq4 lq4Var, b00 b00Var, dj4 dj4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.g = obj;
        this.h = b00Var;
        this.i = dj4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                gz gzVar = new gz((ny8) this.i, (b00) obj2, lq4Var, 0);
                gzVar.g = obj;
                return gzVar;
            case 1:
                return new gz(this.g, lq4Var, (b00) obj2, (dj4) this.i);
            case 2:
                gz gzVar2 = new gz((yx6) this.i, (mr2) obj2, lq4Var, 2);
                gzVar2.g = obj;
                return gzVar2;
            case 3:
                return new gz((xx6) this.g, (mhf) this.i, (fgf) obj2, lq4Var, 3);
            case 4:
                gz gzVar3 = new gz((rl3) obj2, lq4Var, 4);
                gzVar3.g = obj;
                return gzVar3;
            case 5:
                gz gzVar4 = new gz((pq3) this.i, (s6) obj2, lq4Var, 5);
                gzVar4.g = obj;
                return gzVar4;
            case 6:
                return new gz((List) this.i, (mm4) obj2, lq4Var, 6);
            case 7:
                gz gzVar5 = new gz((tf7) this.i, (yx6) obj2, lq4Var, 7);
                gzVar5.g = obj;
                return gzVar5;
            case 8:
                gz gzVar6 = new gz((xx6) this.i, (wo8) obj2, lq4Var, 8);
                gzVar6.g = obj;
                return gzVar6;
            case 9:
                gz gzVar7 = new gz((x67) obj2, lq4Var, 9);
                gzVar7.g = obj;
                return gzVar7;
            case 10:
                gz gzVar8 = new gz((qf7) this.i, (r72) obj2, lq4Var, 10);
                gzVar8.g = obj;
                return gzVar8;
            case 11:
                gz gzVar9 = new gz((ika) obj2, lq4Var, 11);
                gzVar9.g = obj;
                return gzVar9;
            case 12:
                return new gz(12, lq4Var, (ny8) this.i, (hua) this.g, (ny8) obj2, false);
            case 13:
                return new gz(13, lq4Var, (wed) this.i, this.g, (List) obj2, false);
            case 14:
                gz gzVar10 = new gz((pfh) this.i, (yfd) obj2, lq4Var, 14);
                gzVar10.g = obj;
                return gzVar10;
            case 15:
                return new gz((dme) this.g, (aq) this.i, (qih) obj2, lq4Var, 15);
            case 16:
                gz gzVar11 = new gz((i64) this.i, (qf7) obj2, lq4Var, 16);
                gzVar11.g = obj;
                return gzVar11;
            case 17:
                gz gzVar12 = new gz((nub) obj2, lq4Var, 17);
                gzVar12.g = obj;
                return gzVar12;
            case 18:
                gz gzVar13 = new gz((tci) obj2, lq4Var, 18);
                gzVar13.g = obj;
                return gzVar13;
            case 19:
                return new gz((tf7) this.g, (View) this.i, (View) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                gz gzVar14 = new gz((tf7) this.i, (View) obj2, lq4Var, 20);
                gzVar14.g = obj;
                return gzVar14;
            default:
                return new gz((h0k) this.g, (m89) this.i, (hyj) obj2, lq4Var, 21);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((gz) create((Set) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((gz) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((gz) create((njd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((gz) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((gz) create((pzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((gz) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((gz) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((gz) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((gz) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:469:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:471:0x08e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x03ac -> B:208:0x03b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:470:0x08e1 -> B:472:0x08e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, boolean z) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.g = obj2;
        this.h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.i = obj2;
        this.h = obj3;
    }
}
