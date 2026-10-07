package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import java.util.List;
import one.me.main.MainScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class cl9 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ Object f;
    public final /* synthetic */ ufe g;
    public final /* synthetic */ MainScreen h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl9(lq4 lq4Var, ufe ufeVar, MainScreen mainScreen) {
        super(2, lq4Var);
        this.g = ufeVar;
        this.h = mainScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MainScreen mainScreen = this.h;
        ufe ufeVar = this.g;
        switch (i) {
            case 0:
                cl9 cl9Var = new cl9(lq4Var, mainScreen, ufeVar);
                cl9Var.f = obj;
                return cl9Var;
            default:
                cl9 cl9Var2 = new cl9(lq4Var, ufeVar, mainScreen);
                cl9Var2.f = obj;
                return cl9Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((cl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((cl9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MainScreen mainScreen = this.h;
        ufe ufeVar = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                MainScreen.p1(mainScreen).removeAllViews();
                for (rxb rxbVar : (List) obj2) {
                    txb txbVarP1 = MainScreen.p1(mainScreen);
                    boolean zD = cqk.d(rxbVar, mainScreen.y1().i.a.getValue());
                    xk9 xk9Var = new xk9(mainScreen, rxbVar);
                    cf3 cf3Var = new cf3(mainScreen, 2, rxbVar);
                    h11 h11Var = new h11(txbVarP1.getContext());
                    int i2 = rxbVar.e;
                    qxb qxbVar = rxbVar.b;
                    h11Var.setId(i2);
                    tre.E0(R.id.tag_tab_item, h11Var, rxbVar);
                    Integer num = rxbVar.a;
                    if (num != null) {
                        h11Var.setText(num.intValue());
                        h11Var.setContentDescription(np4.q(h11Var.getContext(), num.intValue()));
                    }
                    boolean z = qxbVar instanceof oxb;
                    cs csVar = h11Var.t;
                    if (z) {
                        oxb oxbVar = (oxb) qxbVar;
                        Drawable drawable = (Drawable) oxbVar.a.invoke(h11Var.getContext());
                        tf7 tf7Var = oxbVar.b;
                        csVar.setImageDrawable(drawable);
                        h11Var.y = tf7Var;
                        h11Var.u();
                    } else {
                        if (!(qxbVar instanceof pxb)) {
                            ore.o();
                            return null;
                        }
                        csVar.setImageDrawable(wk8.o(h11Var.getContext(), ((pxb) qxbVar).a));
                        h11Var.y = h11Var.x;
                        h11Var.u();
                    }
                    h11Var.setSelected(zD);
                    qe7.H(h11Var, 300L, cf3Var);
                    h11Var.setOnLongClickListener(xk9Var);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = 1.0f;
                    txbVarP1.addView(h11Var, layoutParams);
                    txbVarP1.f();
                }
                MainScreen.p1(mainScreen).h(new nxb(ufeVar.a));
                MainScreen.p1(mainScreen).i(((Boolean) mainScreen.y1().l.a.getValue()).booleanValue());
                MainScreen.p1(mainScreen).g((rxb) mainScreen.y1().i.a.getValue());
                return sbiVar;
            default:
                ch3.d0(obj);
                ou4 ou4Var = (ou4) obj2;
                ufeVar.a = ou4Var.a;
                MainScreen.p1(mainScreen).h(new nxb(ou4Var.a));
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl9(lq4 lq4Var, MainScreen mainScreen, ufe ufeVar) {
        super(2, lq4Var);
        this.h = mainScreen;
        this.g = ufeVar;
    }
}
