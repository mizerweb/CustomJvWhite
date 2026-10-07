package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj2 implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oyj b;
    public final /* synthetic */ String c;

    public /* synthetic */ yj2(oyj oyjVar, String str) {
        this.b = oyjVar;
        this.c = str;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        String str = this.c;
        oyj oyjVar = this.b;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = oyjVar.c;
                workDatabase.n(new x1c(new xj2(workDatabase, str, oyjVar, 0), 1));
                j3f.b(oyjVar.b, workDatabase, oyjVar.e);
                break;
            default:
                WorkDatabase workDatabase2 = oyjVar.c;
                workDatabase2.n(new x1c(new xj2(workDatabase2, str, oyjVar, 1), 1));
                j3f.b(oyjVar.b, workDatabase2, oyjVar.e);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ yj2(String str, oyj oyjVar) {
        this.c = str;
        this.b = oyjVar;
    }
}
