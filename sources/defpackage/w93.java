package defpackage;

import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

/* JADX INFO: loaded from: classes4.dex */
public final class w93 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w93(int i, int i2, p26 p26Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.f = i;
        this.g = i2;
        this.h = p26Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        int i2 = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return new w93(i2, (z93) obj2, lq4Var);
            case 1:
                return new w93((xd3) obj2, i2, lq4Var, 1);
            case 2:
                return new w93((f64) obj2, i2, lq4Var, 2);
            case 3:
                return new w93((y85) obj2, i2, lq4Var, 3);
            case 4:
                return new w93((yf5) obj2, i2, lq4Var, 4);
            case 5:
                return new w93((fg5) obj2, lq4Var, i2);
            case 6:
                return new w93(this.f, i2, (p26) obj2, lq4Var);
            case 7:
                return new w93((lba) obj2, i2, lq4Var, 7);
            case 8:
                return new w93((jsa) obj2, i2, lq4Var, 8);
            case 9:
                return new w93((dvd) obj2, i2, lq4Var, 9);
            case 10:
                return new w93((SdkCoroutineWorker) obj2, i2, lq4Var, 10);
            case 11:
                return new w93((ipf) obj2, i2, lq4Var, 11);
            case 12:
                return new w93((xqf) obj2, i2, lq4Var, 12);
            case 13:
                return new w93((gfi) obj2, i2, lq4Var, 13);
            default:
                return new w93((mfi) obj2, i2, lq4Var, 14);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return ((w93) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0239, code lost:
    
        if (defpackage.jsa.G(r5, r6, r3, r19) == r2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04a0, code lost:
    
        if (r5 == ru.oneme.app.R.id.oneme_notifications_confirmation_sheet_forever) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04bc, code lost:
    
        if (defpackage.yab.K0(r2, r12, r19) == r4) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x055d, code lost:
    
        if (defpackage.z93.B(r5, r19) == r14) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x056b, code lost:
    
        if (defpackage.z93.D(r5, r19) == r14) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:?, code lost:
    
        return r14;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w93.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w93(int i, z93 z93Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = i;
        this.h = z93Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w93(fg5 fg5Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = 5;
        this.h = fg5Var;
        this.g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w93(Object obj, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.h = obj;
        this.g = i;
    }
}
