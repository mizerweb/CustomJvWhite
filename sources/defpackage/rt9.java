package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rt9 implements tt9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ b87 c;

    public /* synthetic */ rt9(Context context, b87 b87Var, int i) {
        this.a = i;
        this.b = context;
        this.c = b87Var;
    }

    @Override // defpackage.tt9
    public final int b(Object obj) {
        int i = this.a;
        b87 b87Var = this.c;
        Context context = this.b;
        nt9 nt9Var = (nt9) obj;
        switch (i) {
            case 0:
                String str = nt9Var.b;
                return ((str.equals(b87Var.n) || str.equals(ut9.c(b87Var))) && nt9Var.c(context, b87Var, false) && nt9Var.d(b87Var)) ? 1 : 0;
            default:
                return nt9Var.e(context, b87Var) ? 1 : 0;
        }
    }
}
