package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l9j extends fg7 implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9j(baj bajVar, View view, ViewTreeObserver viewTreeObserver) {
        super(0, 0, wk8.class, viewTreeObserver, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V");
        this.c = bajVar;
        this.b = view;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n9j.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, (ViewTreeObserver) obj2, (View) obj);
                break;
            case 1:
                v30.b((baj) obj2, (View) obj, (ViewTreeObserver) this.receiver);
                break;
            default:
                ((vx9) obj2).invoke();
                ((qeh) obj).onDismiss();
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9j(vx9 vx9Var, qeh qehVar) {
        super(0, wk8.class, "dismiss", "hide$dismiss(Lkotlin/jvm/functions/Function0;Lone/me/sdk/snackbar/SwipeToDismissContainer$SwipeListener;)V", 0);
        this.c = vx9Var;
        this.b = qehVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9j(ViewTreeObserver viewTreeObserver, View view, m9j m9jVar) {
        super(0, 0, wk8.class, m9jVar, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V");
        this.c = viewTreeObserver;
        this.b = view;
    }
}
