package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public y7(e9j e9jVar, View view) {
        this.a = 9;
        this.b = e9jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 2:
                ((wd2) obj).c();
                break;
            case 7:
                ((y8j) obj).b();
                break;
            case 9:
                ((e9j) obj).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                sj sjVar = (sj) obj;
                ArrayList arrayList = new ArrayList(sjVar.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gi) arrayList.get(i2)).a(sjVar);
                }
                break;
            case 2:
                ((wd2) obj).c();
                break;
            case 3:
                js7 js7Var = (js7) obj;
                if (js7Var.s == animator && js7Var.t) {
                    js7Var.l();
                    break;
                }
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).h = null;
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                txb txbVar = (txb) obj;
                if (txbVar.g == animator) {
                    txbVar.g = null;
                }
                break;
            case 7:
                ((y8j) obj).b();
                break;
            case 8:
                ((r2i) obj).n();
                animator.removeListener(this);
                break;
            case 9:
                ((e9j) obj).c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 5:
                super.onAnimationRepeat(animator);
                q19 q19Var = (q19) this.b;
                q19Var.f = (q19Var.f + 1) % q19Var.e.c.length;
                q19Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                sj sjVar = (sj) obj;
                ArrayList arrayList = new ArrayList(sjVar.e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gi) arrayList.get(i2)).b(sjVar);
                }
                break;
            case 7:
                ((y8j) obj).a();
                break;
            case 9:
                ((e9j) obj).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ y7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
