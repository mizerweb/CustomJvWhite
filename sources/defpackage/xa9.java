package defpackage;

import com.facebook.fresco.middleware.HasExtraData;

/* JADX INFO: loaded from: classes.dex */
public final class xa9 extends ujg {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ pjd g;
    public final /* synthetic */ es0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ mjd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa9(lq0 lq0Var, pjd pjdVar, es0 es0Var, lqh lqhVar) {
        super(lq0Var, pjdVar, es0Var, "BackgroundThreadHandoffProducer");
        this.i = lq0Var;
        this.g = pjdVar;
        this.h = es0Var;
        this.j = lqhVar;
    }

    private final void h(Object obj) {
    }

    @Override // defpackage.ujg
    public final void b(Object obj) {
        switch (this.f) {
            case 0:
                p76.g((p76) obj);
                break;
        }
    }

    @Override // defpackage.ujg
    public final Object d() throws Throwable {
        switch (this.f) {
            case 0:
                ya9 ya9Var = (ya9) this.j;
                p76 p76VarD = ya9Var.d((v78) this.i);
                pjd pjdVar = this.g;
                es0 es0Var = this.h;
                if (p76VarD == null) {
                    pjdVar.e(es0Var, ya9Var.e(), false);
                    es0Var.h("local", "fetch");
                    return null;
                }
                p76VarD.W();
                pjdVar.e(es0Var, ya9Var.e(), true);
                es0Var.h("local", "fetch");
                p76VarD.Y();
                es0Var.putExtra(HasExtraData.KEY_COLOR_SPACE, p76VarD.i);
                return p76VarD;
            default:
                return null;
        }
    }

    @Override // defpackage.ujg
    public void g(Object obj) {
        switch (this.f) {
            case 1:
                pjd pjdVar = this.g;
                es0 es0Var = this.h;
                pjdVar.d(es0Var, "BackgroundThreadHandoffProducer", null);
                ((lqh) this.j).b.b((lq0) this.i, es0Var);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa9(ya9 ya9Var, lq0 lq0Var, pjd pjdVar, es0 es0Var, String str, v78 v78Var, pjd pjdVar2, es0 es0Var2) {
        super(lq0Var, pjdVar, es0Var, str);
        this.j = ya9Var;
        this.i = v78Var;
        this.g = pjdVar2;
        this.h = es0Var2;
    }
}
