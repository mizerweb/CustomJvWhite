package defpackage;

import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes4.dex */
public final class vt implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ vt(h5 h5Var, int i) {
        this.a = i;
        this.b = h5Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        h5 h5Var = this.b;
        switch (i) {
            case 0:
                ((iv4) h5Var.c(87)).a(null, (IssueKeyException) obj);
                break;
            case 1:
                ((iv4) h5Var.c(87)).a(null, (IssueKeyException) obj);
                break;
            default:
                ((iv4) h5Var.c(87)).a(null, (IssueKeyException) obj);
                break;
        }
        return sbiVar;
    }
}
