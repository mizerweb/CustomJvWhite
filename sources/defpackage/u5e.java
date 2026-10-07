package defpackage;

import android.animation.Animator;
import android.graphics.Path;
import android.graphics.RectF;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class u5e implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5e(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                izi iziVar = (izi) this.c;
                Path backgroundPath = iziVar.getBackgroundPath();
                backgroundPath.reset();
                RectF backgroundRect = iziVar.getBackgroundRect();
                Integer num = iziVar.u1;
                float fIntValue = num != null ? num.intValue() : 0.0f;
                Integer num2 = iziVar.t1;
                backgroundRect.set(0.0f, 0.0f, fIntValue, num2 != null ? num2.intValue() : 0.0f);
                RectF backgroundRect2 = iziVar.getBackgroundRect();
                float f = this.b;
                backgroundPath.addRoundRect(backgroundRect2, f, f, Path.Direction.CW);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) obj;
                if (recordControlsWidget.getView() != null) {
                    zv8[] zv8VarArr = RecordControlsWidget.x1;
                    recordControlsWidget.A1().setTranslationY(f);
                }
                break;
            default:
                izi iziVar = (izi) obj;
                Path backgroundPath = iziVar.getBackgroundPath();
                backgroundPath.reset();
                RectF backgroundRect = iziVar.getBackgroundRect();
                Integer num = iziVar.u1;
                float fIntValue = num != null ? num.intValue() : 0.0f;
                Integer num2 = iziVar.t1;
                backgroundRect.set(0.0f, 0.0f, fIntValue, num2 != null ? num2.intValue() : 0.0f);
                backgroundPath.addRoundRect(iziVar.getBackgroundRect(), f, f, Path.Direction.CW);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                w5e w5eVar = (w5e) this.c;
                w5eVar.a = true;
                w5eVar.d = this.b;
                break;
        }
    }
}
