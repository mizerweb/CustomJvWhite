package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ctd extends mdh implements qf7 {
    public /* synthetic */ Object e;
    public final /* synthetic */ ProfileReactionsSettingsScreen f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ wf4 h;
    public final /* synthetic */ TextView i;
    public final /* synthetic */ dc j;
    public final /* synthetic */ FrameLayout k;
    public final /* synthetic */ atf l;
    public final /* synthetic */ atf m;
    public final /* synthetic */ TextView n;
    public final /* synthetic */ wf4 o;
    public final /* synthetic */ e8c p;
    public final /* synthetic */ cyb q;
    public final /* synthetic */ ny8 r;
    public final /* synthetic */ ny8 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctd(lq4 lq4Var, ProfileReactionsSettingsScreen profileReactionsSettingsScreen, TextView textView, wf4 wf4Var, TextView textView2, dc dcVar, FrameLayout frameLayout, atf atfVar, atf atfVar2, TextView textView3, wf4 wf4Var2, e8c e8cVar, cyb cybVar, ny8 ny8Var, ny8 ny8Var2) {
        super(2, lq4Var);
        this.f = profileReactionsSettingsScreen;
        this.g = textView;
        this.h = wf4Var;
        this.i = textView2;
        this.j = dcVar;
        this.k = frameLayout;
        this.l = atfVar;
        this.m = atfVar2;
        this.n = textView3;
        this.o = wf4Var2;
        this.p = e8cVar;
        this.q = cybVar;
        this.r = ny8Var;
        this.s = ny8Var2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ctd ctdVar = new ctd(lq4Var, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        ctdVar.e = obj;
        return ctdVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        ctd ctdVar = (ctd) create(obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        ctdVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        View childAt;
        kz9 kz9Var;
        Object obj2 = this.e;
        ch3.d0(obj);
        oa3 oa3Var = (oa3) obj2;
        boolean z = oa3Var instanceof ma3;
        ProfileReactionsSettingsScreen profileReactionsSettingsScreen = this.f;
        View view = null;
        if (z) {
            zv8[] zv8VarArr = ProfileReactionsSettingsScreen.p;
            LinearLayout linearLayoutO1 = profileReactionsSettingsScreen.o1();
            int i = 0;
            while (true) {
                if (!(i < linearLayoutO1.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt2 = linearLayoutO1.getChildAt(i);
                if (childAt2 == null) {
                    ore.i();
                    return null;
                }
                if (childAt2.getId() == R.id.profile_edit_reactions_settings_error_view) {
                    view = childAt2;
                    break;
                }
                i = i2;
            }
            if (view != null) {
                profileReactionsSettingsScreen.o1().removeView(view);
            }
            ((ScrollView) profileReactionsSettingsScreen.l.m(profileReactionsSettingsScreen, ProfileReactionsSettingsScreen.p[3])).setVisibility(8);
            profileReactionsSettingsScreen.o1().addView((FrameLayout) this.r.getValue());
        } else if (oa3Var instanceof na3) {
            zv8[] zv8VarArr2 = ProfileReactionsSettingsScreen.p;
            LinearLayout linearLayoutO2 = profileReactionsSettingsScreen.o1();
            int i3 = 0;
            while (true) {
                if (!(i3 < linearLayoutO2.getChildCount())) {
                    break;
                }
                int i4 = i3 + 1;
                View childAt3 = linearLayoutO2.getChildAt(i3);
                if (childAt3 == null) {
                    ore.i();
                    return null;
                }
                if (childAt3.getId() == R.id.profile_edit_reactions_settings_loading_container) {
                    view = childAt3;
                    break;
                }
                i3 = i4;
            }
            if (view != null) {
                profileReactionsSettingsScreen.o1().removeView(view);
            }
            ((ScrollView) profileReactionsSettingsScreen.l.m(profileReactionsSettingsScreen, ProfileReactionsSettingsScreen.p[3])).setVisibility(8);
            profileReactionsSettingsScreen.o1().addView((r1c) this.s.getValue());
        } else {
            if (!(oa3Var instanceof la3)) {
                ore.o();
                return null;
            }
            zv8[] zv8VarArr3 = ProfileReactionsSettingsScreen.p;
            LinearLayout linearLayoutO3 = profileReactionsSettingsScreen.o1();
            int i5 = 0;
            while (true) {
                if (!(i5 < linearLayoutO3.getChildCount())) {
                    childAt = null;
                    break;
                }
                int i6 = i5 + 1;
                childAt = linearLayoutO3.getChildAt(i5);
                if (childAt == null) {
                    ore.i();
                    return null;
                }
                if (childAt.getId() == R.id.profile_edit_reactions_settings_error_view) {
                    break;
                }
                i5 = i6;
            }
            if (childAt != null) {
                profileReactionsSettingsScreen.o1().removeView(childAt);
            }
            LinearLayout linearLayoutO4 = profileReactionsSettingsScreen.o1();
            int i7 = 0;
            while (true) {
                if (!(i7 < linearLayoutO4.getChildCount())) {
                    break;
                }
                int i8 = i7 + 1;
                View childAt4 = linearLayoutO4.getChildAt(i7);
                if (childAt4 == null) {
                    ore.i();
                    return null;
                }
                if (childAt4.getId() == R.id.profile_edit_reactions_settings_loading_container) {
                    view = childAt4;
                    break;
                }
                i7 = i8;
            }
            if (view != null) {
                profileReactionsSettingsScreen.o1().removeView(view);
            }
            ((ScrollView) profileReactionsSettingsScreen.l.m(profileReactionsSettingsScreen, ProfileReactionsSettingsScreen.p[3])).setVisibility(0);
            la3 la3Var = (la3) oa3Var;
            int i9 = la3Var.b;
            boolean z2 = la3Var.h;
            boolean z3 = la3Var.g;
            boolean z4 = la3Var.a;
            this.g.setVisibility(z4 ? 0 : 8);
            this.h.setVisibility(z4 ? 0 : 8);
            this.i.setVisibility((z4 && z2) ? 0 : 8);
            this.j.setVisibility((z4 && !z3 && z2) ? 0 : 8);
            this.k.setVisibility(z3 ? 0 : 8);
            this.l.setVisibility((la3Var.e && z4 && !z3) ? 0 : 8);
            if (!z4) {
                profileReactionsSettingsScreen.q1();
            }
            this.m.setChecked(z4);
            this.n.setText(this.o.getResources().getQuantityString(R.plurals.profile_edit_reactions_settings_slider_current_value, i9, new Integer(i9)));
            this.p.setValue(i9);
            this.q.setVisibility((!la3Var.f || z3 || (kz9Var = profileReactionsSettingsScreen.j) == null || kz9Var.o) ? 8 : 0);
        }
        return sbi.a;
    }
}
