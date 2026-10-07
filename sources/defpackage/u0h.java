package defpackage;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import one.me.stories.viewer.viewer.widgets.publish.StoryPublishProgressWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class u0h extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StoryPublishProgressWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0h(lq4 lq4Var, StoryPublishProgressWidget storyPublishProgressWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = storyPublishProgressWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StoryPublishProgressWidget storyPublishProgressWidget = this.g;
        switch (i) {
            case 0:
                u0h u0hVar = new u0h(lq4Var, storyPublishProgressWidget, 0);
                u0hVar.f = obj;
                return u0hVar;
            default:
                u0h u0hVar2 = new u0h(lq4Var, storyPublishProgressWidget, 1);
                u0hVar2.f = obj;
                return u0hVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((u0h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((u0h) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ValueAnimator valueAnimator;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                lsg lsgVar = (lsg) obj2;
                StoryPublishProgressWidget storyPublishProgressWidget = this.g;
                zv8[] zv8VarArr = StoryPublishProgressWidget.h;
                ((p0h) storyPublishProgressWidget.c.getValue()).f.setValue(lsgVar != null ? lsgVar.g() : null);
                StoryPublishProgressWidget storyPublishProgressWidget2 = this.g;
                int iA = lsgVar != null ? lsgVar.a() : 0;
                String name = StoryPublishProgressWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Render publish status = ".concat(pye.n(iA)), null);
                    }
                }
                int i = iA == 0 ? -1 : t0h.$EnumSwitchMapping$0[qt4.D(iA)];
                if (i == -1) {
                    j8e j8eVar = storyPublishProgressWidget2.f;
                    zv8[] zv8VarArr2 = StoryPublishProgressWidget.h;
                    ((ImageView) j8eVar.m(storyPublishProgressWidget2, zv8VarArr2[0])).setVisibility(8);
                    ((cyb) storyPublishProgressWidget2.g.m(storyPublishProgressWidget2, zv8VarArr2[1])).setVisibility(8);
                    c0h c0hVar = (c0h) storyPublishProgressWidget2.e.getValue();
                    valueAnimator = c0hVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c0hVar.f = null;
                } else if (i == 1 || i == 2) {
                    j8e j8eVar2 = storyPublishProgressWidget2.f;
                    zv8[] zv8VarArr3 = StoryPublishProgressWidget.h;
                    ((ImageView) j8eVar2.m(storyPublishProgressWidget2, zv8VarArr3[0])).setVisibility(0);
                    ((cyb) storyPublishProgressWidget2.g.m(storyPublishProgressWidget2, zv8VarArr3[1])).setVisibility(8);
                } else if (i != 3) {
                    if (i != 4) {
                        ore.o();
                        return null;
                    }
                    j8e j8eVar3 = storyPublishProgressWidget2.f;
                    zv8[] zv8VarArr4 = StoryPublishProgressWidget.h;
                    ((ImageView) j8eVar3.m(storyPublishProgressWidget2, zv8VarArr4[0])).setVisibility(8);
                    ((cyb) storyPublishProgressWidget2.g.m(storyPublishProgressWidget2, zv8VarArr4[1])).setVisibility(8);
                    c0h c0hVar2 = (c0h) storyPublishProgressWidget2.e.getValue();
                    valueAnimator = c0hVar2.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    c0hVar2.f = null;
                } else {
                    j8e j8eVar4 = storyPublishProgressWidget2.f;
                    zv8[] zv8VarArr5 = StoryPublishProgressWidget.h;
                    ((ImageView) j8eVar4.m(storyPublishProgressWidget2, zv8VarArr5[0])).setVisibility(8);
                    ((cyb) storyPublishProgressWidget2.g.m(storyPublishProgressWidget2, zv8VarArr5[1])).setVisibility(0);
                    c0h c0hVar3 = (c0h) storyPublishProgressWidget2.e.getValue();
                    ValueAnimator valueAnimator2 = c0hVar3.f;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    c0hVar3.f = null;
                }
                return sbi.a;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                float fFloatValue = ((Number) obj3).floatValue();
                StoryPublishProgressWidget storyPublishProgressWidget3 = this.g;
                zv8[] zv8VarArr6 = StoryPublishProgressWidget.h;
                c0h c0hVar4 = (c0h) storyPublishProgressWidget3.e.getValue();
                c0hVar4.getClass();
                float fU = oc9.u(fFloatValue, 0.0f, 1.0f) * 360.0f;
                ValueAnimator valueAnimator3 = c0hVar4.f;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                float f = c0hVar4.e;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fU >= f ? f : 0.0f, fU);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new xcf(4, c0hVar4));
                valueAnimatorOfFloat.start();
                c0hVar4.f = valueAnimatorOfFloat;
                return sbi.a;
        }
    }
}
