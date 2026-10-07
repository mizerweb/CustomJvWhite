package defpackage;

import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vsc implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ af7 b;

    public /* synthetic */ vsc(int i, af7 af7Var) {
        this.a = i;
        this.b = af7Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        af7 af7Var = this.b;
        switch (i) {
            case 0:
                return (usc) af7Var.invoke();
            case 1:
                return af7Var.invoke();
            default:
                return Widget.binding$lambda$0(af7Var, obj);
        }
    }
}
