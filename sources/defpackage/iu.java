package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iu implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ek2 b;

    public /* synthetic */ iu(ek2 ek2Var, int i) {
        this.a = i;
        this.b = ek2Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ek2 ek2Var = this.b;
        switch (i) {
            case 0:
                ek2Var.resumeWith(Boolean.valueOf(((eu) obj).a == 2));
                break;
            default:
                ek2Var.resumeWith((List) obj);
                break;
        }
        return sbiVar;
    }
}
