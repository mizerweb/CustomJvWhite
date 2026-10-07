package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class btd extends mdh implements tf7 {
    public /* synthetic */ LinearLayout e;
    public /* synthetic */ kbc f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ TextView h;
    public final /* synthetic */ TextView i;
    public final /* synthetic */ TextView j;
    public final /* synthetic */ TextView k;
    public final /* synthetic */ ShapeDrawable l;
    public final /* synthetic */ ShapeDrawable m;
    public final /* synthetic */ ShapeDrawable n;
    public final /* synthetic */ ShapeDrawable o;
    public final /* synthetic */ ShapeDrawable p;
    public final /* synthetic */ RippleDrawable q;
    public final /* synthetic */ ProfileReactionsSettingsScreen r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btd(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ShapeDrawable shapeDrawable, ShapeDrawable shapeDrawable2, ShapeDrawable shapeDrawable3, ShapeDrawable shapeDrawable4, ShapeDrawable shapeDrawable5, RippleDrawable rippleDrawable, ProfileReactionsSettingsScreen profileReactionsSettingsScreen, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.l = shapeDrawable;
        this.m = shapeDrawable2;
        this.n = shapeDrawable3;
        this.o = shapeDrawable4;
        this.p = shapeDrawable5;
        this.q = rippleDrawable;
        this.r = profileReactionsSettingsScreen;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        RippleDrawable rippleDrawable = this.q;
        ProfileReactionsSettingsScreen profileReactionsSettingsScreen = this.r;
        btd btdVar = new btd(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, rippleDrawable, profileReactionsSettingsScreen, (lq4) obj3);
        btdVar.e = (LinearLayout) obj;
        btdVar.f = (kbc) obj2;
        sbi sbiVar = sbi.a;
        btdVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        LinearLayout linearLayout = this.e;
        kbc kbcVar = this.f;
        ch3.d0(obj);
        linearLayout.setBackgroundColor(kbcVar.b().b);
        this.g.setTextColor(kbcVar.getText().d);
        this.h.setTextColor(kbcVar.getText().e);
        this.i.setTextColor(kbcVar.getText().b);
        this.j.setTextColor(kbcVar.getText().e);
        this.k.setTextColor(kbcVar.getText().d);
        sb8.m0(kbcVar.b().f, this.l);
        sb8.m0(kbcVar.b().f, this.m);
        sb8.m0(kbcVar.b().f, this.n);
        sb8.m0(kbcVar.b().f, this.o);
        sb8.m0(kbcVar.b().f, this.p);
        this.q.setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
        ProfileReactionsSettingsScreen profileReactionsSettingsScreen = this.r;
        kz9 kz9Var = profileReactionsSettingsScreen.j;
        boolean z = false;
        if (kz9Var != null && kz9Var.o) {
            z = true;
        }
        profileReactionsSettingsScreen.r1(z);
        return sbi.a;
    }
}
