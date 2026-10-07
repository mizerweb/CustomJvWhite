package defpackage;

import android.graphics.drawable.Drawable;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ot1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ ot1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                return f55.o(callOpponentsListWidget.getContext());
            case 1:
                zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                Drawable drawable = callOpponentsListWidget.getContext().getDrawable(R.drawable.icon_cross);
                drawable.setTint(pq3.j.k(callOpponentsListWidget.getContext()).b.getText().d);
                return drawable;
            case 2:
                lt1 lt1Var = (lt1) callOpponentsListWidget.a.getAccessor().c(845);
                return new kt1(lt1Var.a, lt1Var.b, lt1Var.c, lt1Var.d, lt1Var.e, lt1Var.f, lt1Var.g, lt1Var.h, lt1Var.i, lt1Var.j);
            case 3:
                zv8[] zv8VarArr3 = CallOpponentsListWidget.v;
                return new acc(null, new jcc(R.drawable.icon_settings_fill, null, null, null, 0.0f, new mt1(callOpponentsListWidget, 1), 254), null);
            case 4:
                zv8[] zv8VarArr4 = CallOpponentsListWidget.v;
                return new et1(new ft0(callOpponentsListWidget), ((a2c) callOpponentsListWidget.a.getAccessor().d(27).getValue()).a());
            default:
                zv8[] zv8VarArr5 = CallOpponentsListWidget.v;
                return new wc(new rj5(7, callOpponentsListWidget), callOpponentsListWidget.a.b().a(), new tbj(callOpponentsListWidget.getContext()));
        }
    }
}
