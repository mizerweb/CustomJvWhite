package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kj3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ kj3(fk3 fk3Var, long j, int i) {
        this.a = i;
        this.b = fk3Var;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        sbi sbiVar = sbi.a;
        long j = this.c;
        fk3 fk3Var = this.b;
        j8c j8cVar = (j8c) obj;
        switch (i) {
            case 0:
                int iOrdinal = j8cVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    fk3Var.L(j);
                    ((sie) fk3Var.h.getValue()).a(j, true, true);
                    return sbiVar;
                }
                if (iOrdinal == 2) {
                    return sbiVar;
                }
                if (iOrdinal == 3) {
                    a8j.x(fk3Var.K, new r1g(new tnh(R.string.chat_deleted_and_bot_suspended_snackbar), new kj3(fk3Var, j, i2)));
                    return sbiVar;
                }
                if (iOrdinal == 4) {
                    return sbiVar;
                }
                ore.o();
                return null;
            case 1:
                int iOrdinal2 = j8cVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    fk3Var.L(j);
                } else if (iOrdinal2 == 3) {
                    a8j.x(fk3Var.K, new r1g(new tnh(R.string.suspend_bot_snackbar_title), new kj3(fk3Var, j, i3)));
                }
                return sbiVar;
            default:
                if (j8cVar != j8c.e) {
                    zv8[] zv8VarArr = fk3.y1;
                    ((wzj) fk3Var.v.getValue()).c(new xjf(j, false));
                }
                return sbiVar;
        }
    }
}
