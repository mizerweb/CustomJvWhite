package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.contactadddialog.ContactAddBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class bv extends mdh implements tf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ kbc f;
    public final /* synthetic */ TextView g;
    public final /* synthetic */ TextView h;
    public final /* synthetic */ TextView i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ ViewGroup m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(ContactAddBottomSheet contactAddBottomSheet, TextView textView, p1c p1cVar, TextView textView2, p1c p1cVar2, TextView textView3, cyb cybVar, lq4 lq4Var) {
        super(3, lq4Var);
        this.j = contactAddBottomSheet;
        this.g = textView;
        this.k = p1cVar;
        this.h = textView2;
        this.l = p1cVar2;
        this.i = textView3;
        this.m = cybVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                TextView textView = this.g;
                TextView textView2 = this.h;
                TextView textView3 = this.i;
                bv bvVar = new bv(textView, (AppearanceSettingsMultiThemeScreen) obj5, textView2, textView3, (ShapeDrawable) obj4, (u93) viewGroup, (lq4) obj3);
                bvVar.j = (LinearLayout) obj;
                bvVar.f = (kbc) obj2;
                bvVar.invokeSuspend(sbiVar);
                break;
            default:
                TextView textView4 = this.g;
                TextView textView5 = this.h;
                bv bvVar2 = new bv((ContactAddBottomSheet) this.j, textView4, (p1c) obj5, textView5, (p1c) obj4, this.i, (cyb) viewGroup, (lq4) obj3);
                bvVar2.f = (kbc) obj2;
                bvVar2.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ViewGroup viewGroup = this.m;
        TextView textView = this.i;
        Object obj2 = this.l;
        TextView textView2 = this.h;
        Object obj3 = this.k;
        TextView textView3 = this.g;
        switch (i) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) this.j;
                kbc kbcVar = this.f;
                ch3.d0(obj);
                linearLayout.setBackgroundColor(kbcVar.b().b);
                textView3.setTextColor(kbcVar.getText().d);
                AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = (AppearanceSettingsMultiThemeScreen) obj3;
                ((TextView) appearanceSettingsMultiThemeScreen.e.m(appearanceSettingsMultiThemeScreen, AppearanceSettingsMultiThemeScreen.i[1])).setTextColor(kbcVar.getText().b);
                textView2.setTextColor(kbcVar.getText().d);
                textView.setTextColor(kbcVar.getText().d);
                yab.i0(appearanceSettingsMultiThemeScreen.getViewLifecycleScope(), null, 0, new av((u93) viewGroup, appearanceSettingsMultiThemeScreen, null, 0), 3);
                sb8.m0(kbcVar.b().f, (ShapeDrawable) obj2);
                lv lvVarO1 = appearanceSettingsMultiThemeScreen.o1();
                a8j.t(lvVarO1, ((n0c) lvVarO1.H()).a(), new gv(1, lvVarO1, null), 2);
                break;
            default:
                kbc kbcVar2 = this.f;
                ch3.d0(obj);
                ContactAddBottomSheet contactAddBottomSheet = (ContactAddBottomSheet) this.j;
                zv8[] zv8VarArr = ContactAddBottomSheet.x;
                Drawable background = contactAddBottomSheet.s1().getBackground();
                ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
                if (colorDrawable != null) {
                    colorDrawable.setColor(kbcVar2.b().b);
                }
                textView3.setTextColor(kbcVar2.getText().b);
                p1c p1cVar = (p1c) obj3;
                f55.f(p1cVar, kbcVar2);
                p1cVar.setTextColor(kbcVar2.getText().b);
                p1cVar.setHintTextColor(kbcVar2.getText().e);
                p1cVar.setBackgroundColor(kbcVar2.b().f);
                textView2.setTextColor(kbcVar2.getText().j);
                p1c p1cVar2 = (p1c) obj2;
                f55.f(p1cVar2, kbcVar2);
                p1cVar2.setTextColor(kbcVar2.getText().b);
                p1cVar2.setHintTextColor(kbcVar2.getText().e);
                p1cVar2.setBackgroundColor(kbcVar2.b().f);
                textView.setTextColor(kbcVar2.getText().j);
                ((cyb) viewGroup).e();
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(TextView textView, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, TextView textView2, TextView textView3, ShapeDrawable shapeDrawable, u93 u93Var, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = textView;
        this.k = appearanceSettingsMultiThemeScreen;
        this.h = textView2;
        this.i = textView3;
        this.l = shapeDrawable;
        this.m = u93Var;
    }
}
