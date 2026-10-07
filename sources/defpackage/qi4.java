package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import one.me.contactlist.ContactListWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class qi4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public boolean f;
    public int g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi4(xqf xqfVar, lq4 lq4Var, xqf xqfVar2, boolean z) {
        super(2, lq4Var);
        this.e = 9;
        this.h = xqfVar;
        this.i = xqfVar2;
        this.f = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                qi4 qi4Var = new qi4((vi4) obj2, this.f, lq4Var, 0);
                qi4Var.h = obj;
                return qi4Var;
            case 1:
                qi4 qi4Var2 = new qi4((nm0) obj2, lq4Var);
                qi4Var2.h = obj;
                return qi4Var2;
            case 2:
                return new qi4((zo0) this.h, (ny8) obj2, this.f, lq4Var, 2);
            case 3:
                return new qi4((List) this.h, lq4Var, this.f, (pm2) obj2, 3);
            case 4:
                return new qi4((ContactListWidget) this.h, (qn7) obj2, this.f, lq4Var, 4);
            case 5:
                return new qi4((fg5) this.h, lq4Var, this.f, (LinkedHashSet) obj2, 5);
            case 6:
                return new qi4((qaa) obj2, this.f, lq4Var, 6);
            case 7:
                return new qi4((jsa) this.h, (List) obj2, this.f, lq4Var, 7);
            case 8:
                return new qi4((vze) this.h, (String) obj2, this.f, lq4Var, 8);
            case 9:
                return new qi4((xqf) this.h, lq4Var, (xqf) obj2, this.f);
            case 10:
                qi4 qi4Var3 = new qi4((spg) obj2, this.f, lq4Var, 10);
                qi4Var3.h = obj;
                return qi4Var3;
            default:
                qi4 qi4Var4 = new qi4((afi) obj2, this.f, lq4Var, 11);
                qi4Var4.h = obj;
                return qi4Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((qi4) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qi4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02d8, code lost:
    
        if (defpackage.pm2.e((defpackage.pm2) r7, 1000000000, r14) == r6) goto L154;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi4(nm0 nm0Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.i = nm0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi4(Object obj, lq4 lq4Var, boolean z, Object obj2, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.f = z;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi4(Object obj, Object obj2, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi4(Object obj, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
        this.f = z;
    }
}
