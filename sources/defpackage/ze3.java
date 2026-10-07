package defpackage;

import android.view.View;
import one.me.chats.list.ChatsListWidget;
import one.me.login.inputphone.InputPhoneScreen;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ze3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p0m.a(view, lt7.CONFIRM);
                ((cf3) obj).onClick(view);
                break;
            case 1:
                zv8[] zv8VarArr = ChatsListWidget.X;
                zm3.b.q(((ChatsListWidget) obj).e);
                break;
            case 2:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj;
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                bi8 bi8VarS1 = inputPhoneScreen.s1();
                sgg sggVar = (sgg) bi8VarS1.c.a(bi8VarS1.b, ((n0c) ((xhh) bi8VarS1.f.getValue())).b(), 2, new t20(inputPhoneScreen.r1().getCode(), inputPhoneScreen.r1().getPhoneWithoutCode(), bi8VarS1, null, 19));
                p3c p3cVar = bi8VarS1.o;
                zv8[] zv8VarArr3 = bi8.u;
                boolean z = false;
                p3cVar.B(bi8VarS1, zv8VarArr3[0], sggVar);
                bi8 bi8VarS2 = inputPhoneScreen.s1();
                vo8 vo8Var = (vo8) bi8VarS2.o.m(bi8VarS2, zv8VarArr3[0]);
                if (vo8Var != null && vo8Var.isActive()) {
                    z = true;
                }
                cyb cybVarP1 = inputPhoneScreen.p1();
                cybVarP1.setLoading(z);
                cybVarP1.setClickable(!z);
                break;
            case 3:
                ((t7c) obj).d();
                break;
            case 4:
                z9c z9cVar = (z9c) obj;
                cf7 cf7Var = z9cVar.j;
                if (cf7Var != null) {
                    cf7Var.invoke(z9cVar.getTabItem());
                }
                break;
            case 5:
                af7 af7Var = ((org) obj).k;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                break;
            default:
                ((jcc) obj).h.invoke(view);
                break;
        }
    }
}
