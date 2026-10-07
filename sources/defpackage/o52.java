package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o52 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s52 c;

    public /* synthetic */ o52(s52 s52Var, Context context) {
        this.a = 0;
        this.c = s52Var;
        this.b = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        s52 s52Var = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                return new jy7(s52Var.q1, new n52(context, 0));
            case 1:
                return s52.x(s52Var, context);
            case 2:
                return s52.y(s52Var, context);
            default:
                return s52.u(s52Var, context);
        }
    }

    public /* synthetic */ o52(Context context, s52 s52Var, int i) {
        this.a = i;
        this.b = context;
        this.c = s52Var;
    }
}
