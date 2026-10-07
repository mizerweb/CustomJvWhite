package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w42 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g52 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ w42(g52 g52Var, Context context, int i) {
        this.a = i;
        this.b = g52Var;
        this.c = context;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Context context = this.c;
        g52 g52Var = this.b;
        switch (i) {
            case 0:
                return new qk0(g52Var.getContext().getDrawable(R.drawable.icon_call).mutate(), awb.a, this.c, new v42(g52Var, 4), new v42(g52Var, 5), 32);
            case 1:
                return new jy7(g52Var.M1, new ca0(context, 25));
            case 2:
                return g52.B(context, g52Var);
            case 3:
                cyb cybVar = new cyb(context);
                cybVar.setSize(ayb.g);
                cybVar.setAppearance(zxb.PRIMARY);
                cybVar.setCustomTheme(pq3.j.l(cybVar).b);
                cybVar.setLayoutParams(new uf4(-2, -2));
                qe7.H(cybVar, 300L, new a52(g52Var, 1));
                return cybVar;
            case 4:
                return g52.y(context, g52Var);
            case 5:
                return g52.F(context, g52Var);
            default:
                return g52.C(context, g52Var);
        }
    }

    public /* synthetic */ w42(Context context, g52 g52Var, int i) {
        this.a = i;
        this.c = context;
        this.b = g52Var;
    }
}
