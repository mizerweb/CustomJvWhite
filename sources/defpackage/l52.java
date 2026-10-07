package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l52 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s52 b;

    public /* synthetic */ l52(s52 s52Var, int i) {
        this.a = i;
        this.b = s52Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        s52 s52Var = this.b;
        switch (i) {
            case 0:
                return s52.z(s52Var);
            case 1:
                af7 af7Var = s52Var.C;
                if (af7Var != null) {
                    return (lxi) af7Var.invoke();
                }
                return null;
            case 2:
                return s52.v(s52Var);
            case 3:
                return s52Var.getContext().getDrawable(R.drawable.icon_pin_fill).mutate();
            case 4:
                return s52Var.getContext().getDrawable(R.drawable.ic_rotation_view_16).mutate();
            default:
                return s52Var.getContext().getDrawable(R.drawable.icon_dots_vertical).mutate();
        }
    }
}
