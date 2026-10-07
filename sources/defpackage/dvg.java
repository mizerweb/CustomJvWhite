package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.List;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dvg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StoriesViewerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dvg(lq4 lq4Var, StoriesViewerScreen storiesViewerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = storiesViewerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StoriesViewerScreen storiesViewerScreen = this.g;
        switch (i) {
            case 0:
                dvg dvgVar = new dvg(lq4Var, storiesViewerScreen, 0);
                dvgVar.f = obj;
                return dvgVar;
            case 1:
                dvg dvgVar2 = new dvg(lq4Var, storiesViewerScreen, 1);
                dvgVar2.f = obj;
                return dvgVar2;
            case 2:
                dvg dvgVar3 = new dvg(lq4Var, storiesViewerScreen, 2);
                dvgVar3.f = obj;
                return dvgVar3;
            default:
                dvg dvgVar4 = new dvg(lq4Var, storiesViewerScreen, 3);
                dvgVar4.f = obj;
                return dvgVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((dvg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((dvg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((dvg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((dvg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i = this.e;
        Integer num = null;
        sbi sbiVar = sbi.a;
        StoriesViewerScreen storiesViewerScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                List list = (List) obj2;
                zv8[] zv8VarArr = StoriesViewerScreen.t;
                jvg jvgVarE1 = storiesViewerScreen.E1();
                long jLongValue = ((Number) jvgVarE1.i.getValue()).longValue();
                if (jLongValue != -1) {
                    int iD = jvg.D(jLongValue, list);
                    Integer numValueOf = Integer.valueOf(iD);
                    if (iD >= 0) {
                        num = numValueOf;
                    }
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = ((Number) jvgVarE1.k.getValue()).intValue();
                    int iO0 = xw3.O0(list);
                    int i2 = iO0 >= 0 ? iO0 : 0;
                    if (iIntValue > i2) {
                        iIntValue = i2;
                    }
                }
                storiesViewerScreen.n.m.b(list, new f4g(5, new e53(storiesViewerScreen, iIntValue, list, 1)));
                break;
            case 1:
                ch3.d0(obj);
                int iIntValue2 = ((Number) obj2).intValue();
                y8j y8jVarD1 = StoriesViewerScreen.D1(storiesViewerScreen);
                if (y8jVarD1.getCurrentItem() != iIntValue2) {
                    ValueAnimator valueAnimator = storiesViewerScreen.o;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    storiesViewerScreen.o = null;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (iIntValue2 - y8jVarD1.getCurrentItem()) * y8jVarD1.getWidth());
                    storiesViewerScreen.o = valueAnimatorOfFloat;
                    tfe tfeVar = new tfe();
                    if (valueAnimatorOfFloat != null) {
                        valueAnimatorOfFloat.addUpdateListener(new uy7(tfeVar, y8jVarD1, 3));
                    }
                    ValueAnimator valueAnimator2 = storiesViewerScreen.o;
                    if (valueAnimator2 != null) {
                        valueAnimator2.addListener(new y7(7, y8jVarD1));
                    }
                    ValueAnimator valueAnimator3 = storiesViewerScreen.o;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
                    }
                    ValueAnimator valueAnimator4 = storiesViewerScreen.o;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setDuration(200L);
                    }
                    ValueAnimator valueAnimator5 = storiesViewerScreen.o;
                    if (valueAnimator5 != null) {
                        valueAnimator5.start();
                    }
                }
                break;
            case 2:
                ch3.d0(obj);
                StoriesViewerScreen.D1(storiesViewerScreen).setUserInputEnabled(((Boolean) obj2).booleanValue());
                break;
            default:
                ch3.d0(obj);
                g8c g8cVar = storiesViewerScreen.q;
                if (g8cVar != null) {
                    g8cVar.a();
                }
                h8c h8cVar = new h8c(storiesViewerScreen);
                h8cVar.m(new tnh(R.string.oneme_stories_publish_max_count));
                h8cVar.h(new w8c(R.drawable.icon_info_fill));
                storiesViewerScreen.q = h8cVar.p();
                break;
        }
        return sbiVar;
    }
}
