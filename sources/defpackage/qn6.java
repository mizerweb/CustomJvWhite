package defpackage;

import java.util.List;
import one.me.chats.tab.ChatsTabWidget;
import one.me.main.MainScreen;
import one.me.transparent.AppInitProvider;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class qn6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn6(BacklogWorker backlogWorker, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 5;
        this.g = backlogWorker;
        this.f = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new qn6((un6) obj2, lq4Var, 0);
            case 1:
                return new qn6((i09) obj2, lq4Var, 1);
            case 2:
                return new qn6((AppInitProvider) obj2, lq4Var, 2);
            case 3:
                return new qn6((b00) obj2, lq4Var, 3);
            case 4:
                return new qn6((za0) obj2, lq4Var, 4);
            case 5:
                return new qn6((BacklogWorker) obj2, this.f, lq4Var);
            case 6:
                qn6 qn6Var = new qn6((eo0) obj2, lq4Var, 6);
                qn6Var.f = ((Number) obj).intValue();
                return qn6Var;
            case 7:
                return new qn6((m31) obj2, lq4Var, 7);
            case 8:
                return new qn6((nl1) obj2, lq4Var, 8);
            case 9:
                return new qn6((ea2) obj2, lq4Var, 9);
            case 10:
                return new qn6((tm3) obj2, lq4Var, 10);
            case 11:
                return new qn6((ChatsTabWidget) obj2, lq4Var, 11);
            case 12:
                return new qn6((ij4) obj2, lq4Var, 12);
            case 13:
                return new qn6((mm4) obj2, lq4Var, 13);
            case 14:
                return new qn6((un4) obj2, lq4Var, 14);
            case 15:
                qn6 qn6Var2 = new qn6((dd6) obj2, lq4Var, 15);
                qn6Var2.f = ((Number) obj).intValue();
                return qn6Var2;
            case 16:
                return new qn6((t25) obj2, lq4Var, 16);
            case 17:
                return new qn6((w17) obj2, lq4Var, 17);
            case 18:
                return new qn6((a27) obj2, lq4Var, 18);
            case 19:
                return new qn6((k37) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new qn6((bi8) obj2, lq4Var, 20);
            case 21:
                return new qn6((jl8) obj2, lq4Var, 21);
            case 22:
                return new qn6((fh9) obj2, lq4Var, 22);
            case 23:
                return new qn6((eh9) obj2, lq4Var, 23);
            case 24:
                return new qn6((MainScreen) obj2, lq4Var, 24);
            case 25:
                return new qn6((lba) obj2, lq4Var, 25);
            case 26:
                return new qn6((y6b) obj2, lq4Var, 26);
            case 27:
                return new qn6((yfd) obj2, lq4Var, 27);
            case 28:
                return new qn6((xte) obj2, lq4Var, 28);
            default:
                return new qn6((i64) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((qn6) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((qn6) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((qn6) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qn6) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                ((qn6) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((qn6) create((sbi) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qn6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0231, code lost:
    
        if (r1.invoke(r17) == r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
    
        if (defpackage.lba.b(r1, r17) == r4) goto L70;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn6(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
