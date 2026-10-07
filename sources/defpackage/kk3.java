package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kk3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ kk3(rl3 rl3Var, long j, int i) {
        this.a = i;
        this.b = rl3Var;
        this.c = j;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        j8c j8cVar = j8c.e;
        long j = this.c;
        rl3 rl3Var = this.b;
        int i2 = 0;
        sbi sbiVar = sbi.a;
        int i3 = 1;
        switch (i) {
            case 0:
                int iOrdinal = ((j8c) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    rl3Var.R(j);
                } else if (iOrdinal == 3) {
                    a8j.x(rl3Var.L1, new r1g(new tnh(R.string.suspend_bot_snackbar_title), new kk3(rl3Var, j, i2)));
                }
                return sbiVar;
            case 1:
                int iOrdinal2 = ((j8c) obj).ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    rl3Var.R(j);
                    ((sie) rl3Var.j.getValue()).a(j, true, true);
                    return sbiVar;
                }
                if (iOrdinal2 == 2) {
                    return sbiVar;
                }
                if (iOrdinal2 == 3) {
                    a8j.x(rl3Var.L1, new r1g(new tnh(R.string.chat_deleted_and_bot_suspended_snackbar), new kk3(rl3Var, j, i3)));
                    return sbiVar;
                }
                if (iOrdinal2 == 4) {
                    return sbiVar;
                }
                ore.o();
                return null;
            case 2:
                if (((j8c) obj) != j8cVar) {
                    zv8[] zv8VarArr = rl3.Z1;
                    ((wzj) rl3Var.y.getValue()).c(new xjf(j, false));
                }
                return sbiVar;
            case 3:
                if (((j8c) obj) != j8cVar) {
                    zv8[] zv8VarArr2 = rl3.Z1;
                    ((sie) rl3Var.j.getValue()).a(j, true, true);
                }
                return sbiVar;
            case 4:
                if (wk3.$EnumSwitchMapping$0[((j8c) obj).ordinal()] != 1) {
                    rl3 rl3Var2 = this.b;
                    yab.i0((wmi) rl3Var2.t1.getValue(), ((n0c) rl3Var2.h).b(), 0, new vk3(rl3Var2, this.c, null, 0), 2);
                }
                return sbiVar;
            default:
                if (wk3.$EnumSwitchMapping$0[((j8c) obj).ordinal()] != 1) {
                    rl3 rl3Var3 = this.b;
                    yab.i0((wmi) rl3Var3.t1.getValue(), null, 0, new vk3(rl3Var3, this.c, null, 1), 3);
                }
                return sbiVar;
        }
    }
}
