package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class nze extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ File f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nze(File file, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = file;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new nze(this.f, lq4Var, 0);
            case 1:
                return new nze(this.f, lq4Var, 1);
            default:
                return new nze(this.f, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((nze) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        Object poeVar2;
        Object poeVar3;
        int i = this.e;
        File file = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                try {
                    poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Object obj2 = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj2;
                }
                return (Boolean) poeVar;
            case 1:
                ch3.d0(obj);
                try {
                    poeVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
                    break;
                } catch (Throwable th2) {
                    poeVar2 = new poe(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (poeVar2 instanceof poe) {
                    poeVar2 = obj3;
                }
                return (Boolean) poeVar2;
            default:
                ch3.d0(obj);
                try {
                    poeVar3 = Boolean.valueOf(file.exists() ? file.delete() : false);
                    break;
                } catch (Throwable th3) {
                    poeVar3 = new poe(th3);
                }
                Object obj4 = Boolean.FALSE;
                if (poeVar3 instanceof poe) {
                    poeVar3 = obj4;
                }
                return (Boolean) poeVar3;
        }
    }
}
