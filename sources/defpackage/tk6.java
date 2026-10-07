package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.location.map.pick.PickLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class tk6 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ wf4 f;
    public /* synthetic */ kbc g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ View i;
    public final /* synthetic */ View j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk6(Object obj, View view, View view2, Object obj2, ViewGroup viewGroup, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = view;
        this.j = view2;
        this.k = obj2;
        this.l = viewGroup;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.l;
        Object obj4 = this.k;
        View view = this.j;
        View view2 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                tk6 tk6Var = new tk6((FakeInAppReviewBottomSheet) obj5, (AppCompatTextView) view2, (AppCompatTextView) view, (AppCompatTextView) obj4, (b5e) viewGroup, (lq4) obj3, 0);
                tk6Var.f = (wf4) obj;
                tk6Var.g = (kbc) obj2;
                tk6Var.invokeSuspend(sbiVar);
                break;
            default:
                tk6 tk6Var2 = new tk6((rcc) obj5, (d4c) view2, (t6g) view, (PickLocationScreen) obj4, (FrameLayout) viewGroup, (lq4) obj3, 1);
                tk6Var2.f = (wf4) obj;
                tk6Var2.g = (kbc) obj2;
                tk6Var2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.l;
        Object obj2 = this.k;
        View view = this.j;
        View view2 = this.i;
        a8g a8gVar = pq3.j;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                wf4 wf4Var = this.f;
                kbc kbcVar = this.g;
                ch3.d0(obj);
                boolean zN = a8gVar.e(wf4Var.getContext()).n();
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj3;
                fakeInAppReviewBottomSheet.y.getPaint().setColor(kbcVar.B().b);
                fakeInAppReviewBottomSheet.A.getPaint().setColor(zN ? -14860999 : -1969940);
                ((AppCompatTextView) view2).setTextColor(kbcVar.getText().b);
                ((AppCompatTextView) view).setTextColor(kbcVar.getText().e);
                ((AppCompatTextView) obj2).setTextColor(((b5e) viewGroup).getSelected() != 0 ? -1 : a8gVar.h(wf4Var).getText().e);
                wf4Var.invalidate();
                break;
            default:
                wf4 wf4Var2 = this.f;
                kbc kbcVar2 = this.g;
                ch3.d0(obj);
                ((rcc) obj3).setBackgroundColor(a8gVar.h(wf4Var2).k().b);
                ((d4c) view2).f(a8gVar.h(wf4Var2));
                Context context = wf4Var2.getContext();
                PickLocationScreen pickLocationScreen = (PickLocationScreen) obj2;
                zv8[] zv8VarArr = PickLocationScreen.p;
                xm9.b((t6g) view, context, ((g5d) ((gjf) pickLocationScreen.n.getValue())).c());
                Drawable background = ((FrameLayout) viewGroup).getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    pickLocationScreen.r1(gradientDrawable);
                }
                po7 po7Var = pickLocationScreen.l;
                if (po7Var != null) {
                    pickLocationScreen.s1(a8gVar.h(wf4Var2), po7Var);
                }
                a8gVar.e(wf4Var2.getContext()).getClass();
                pq3.f(wf4Var2, kbcVar2);
                break;
        }
        return sbiVar;
    }
}
