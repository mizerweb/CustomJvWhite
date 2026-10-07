package defpackage;

import android.content.Context;
import android.view.View;
import java.util.WeakHashMap;
import one.me.main.MainScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class zk9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zk9(Widget widget, Object obj, int i) {
        this.a = i;
        this.b = widget;
        this.c = obj;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                MainScreen mainScreen = (MainScreen) this.b;
                a8g a8gVar = MainScreen.u;
                if (((f5d) mainScreen.x1()).t()) {
                    n7j.c((View) obj, 300L, new yk9(mainScreen, 1));
                }
                break;
            case 1:
                WeakHashMap weakHashMap = i7j.a;
                w6j.c(view);
                vjg vjgVar = (vjg) obj;
                pi8.a.a(vjgVar);
                Context context = vjgVar.a.getContext();
                ufe ufeVar = new ufe();
                ufeVar.a = context.getResources().getConfiguration().orientation;
                na4 na4Var = new na4(ufeVar, 1, view);
                context.registerComponentCallbacks(na4Var);
                w6j.c(view);
                this.b = na4Var;
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ul5 ul5Var;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                MainScreen mainScreen = (MainScreen) this.b;
                if (mainScreen.getView() != null && (ul5Var = mainScreen.p) != null) {
                    ul5Var.b(false);
                    break;
                }
                break;
            case 1:
                vjg vjgVar = (vjg) obj;
                pi8.a.g(vjgVar);
                na4 na4Var = (na4) this.b;
                if (na4Var != null) {
                    vjgVar.a.getContext().unregisterComponentCallbacks(na4Var);
                }
                break;
            default:
                gm0.n(np4.t((Widget) this.b), "lifecycle: postCreateView invoke onViewDetachedFromWindow");
                view.removeOnAttachStateChangeListener(this);
                ((pvj) obj).a = true;
                break;
        }
    }

    public zk9(vjg vjgVar) {
        this.a = 1;
        this.c = vjgVar;
    }
}
