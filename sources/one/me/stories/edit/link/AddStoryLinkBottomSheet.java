package one.me.stories.edit.link;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.cf7;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.i19;
import defpackage.it3;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jac;
import defpackage.kbc;
import defpackage.mjg;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.noh;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.p26;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qb;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.r;
import defpackage.r8e;
import defpackage.t3f;
import defpackage.t8;
import defpackage.ub;
import defpackage.vv;
import defpackage.w59;
import defpackage.wb;
import defpackage.wtc;
import defpackage.y59;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stories.edit.link.AddStoryLinkBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/stories/edit/link/AddStoryLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lha9;", "localAccountId", "(Lt3f;Lha9;)V", "stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddStoryLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] s = {new dwd(AddStoryLinkBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, AddStoryLinkBottomSheet.class, "urlInput", "getUrlInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(AddStoryLinkBottomSheet.class, "titleInput", "getTitleInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0)};
    public final wtc m;
    public final ny8 n;
    public final ny8 o;
    public final j8e p;
    public final j8e q;
    public final oi8 r;

    public AddStoryLinkBottomSheet(Bundle bundle) {
        super(bundle);
        this.m = new wtc(m35getAccountScopeuqN4xOY());
        vv vvVar = new vv("arg_story_editor_parent_scope_id", t3f.class);
        zv8 zv8Var = s[0];
        this.n = getSharedViewModel((t3f) vvVar.a(this), p26.class, null);
        this.o = createViewModelLazy(wb.class, new r(6, new qo7(9, this)));
        this.p = viewBinding(R.id.oneme_stories_add_link_bottom_sheet_url_input);
        this.q = viewBinding(R.id.oneme_stories_add_link_bottom_sheet_title_input);
        int i = 0;
        this.r = new oi8(i, 0, 0, new j11(3, 3, false), 7);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        final int i = 0;
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        final int i2 = 1;
        linearLayout.setOrientation(1);
        mt5 mt5Var = new mt5(linearLayout.getContext());
        mt5Var.setCustomTheme(t1());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        mt5Var.setLayoutParams(layoutParams);
        linearLayout.addView(mt5Var);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setPaddingRelative(textView.getPaddingStart(), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), textView.getPaddingEnd(), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        q9i.a(q9i.d, textView);
        textView.setText(R.string.oneme_stories_add_link_title);
        textView.setTextColor(t1().getText().b);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
        textView2.setLayoutParams(layoutParams3);
        noh nohVar = q9i.B;
        q9i.a(nohVar, textView2);
        textView2.setTextColor(t1().getText().d);
        textView2.setText(R.string.markdown_add_link);
        textView2.setAllCaps(true);
        linearLayout.addView(textView2);
        jac jacVar = new jac(linearLayout.getContext());
        jacVar.setId(R.id.oneme_stories_add_link_bottom_sheet_url_input);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        jacVar.setLayoutParams(layoutParams4);
        jacVar.setCustomTheme(t1());
        jacVar.setHint(np4.q(getContext(), R.string.oneme_stories_add_link_url_hint));
        jacVar.setInputType(17);
        jacVar.setImeOptions(5);
        jacVar.setOnEditorActionListener(new cf7(this) { // from class: pb
            public final /* synthetic */ AddStoryLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                int i3 = i;
                boolean z = false;
                sbi sbiVar = sbi.a;
                AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        zv8[] zv8VarArr = AddStoryLinkBottomSheet.s;
                        return Boolean.valueOf(iIntValue == 5 ? ((jac) addStoryLinkBottomSheet.q.m(addStoryLinkBottomSheet, AddStoryLinkBottomSheet.s[2])).b.requestFocus() : false);
                    case 1:
                        zv8[] zv8VarArr2 = AddStoryLinkBottomSheet.s;
                        wb wbVarE1 = addStoryLinkBottomSheet.E1();
                        String string = ((CharSequence) obj).toString();
                        mjg mjgVar = wbVarE1.d;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, ub.a((ub) value, string, null, ynh.b, 2)));
                        return sbiVar;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zv8[] zv8VarArr3 = AddStoryLinkBottomSheet.s;
                        if (iIntValue2 == 6) {
                            addStoryLinkBottomSheet.E1().B();
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        zv8[] zv8VarArr4 = AddStoryLinkBottomSheet.s;
                        wb wbVarE2 = addStoryLinkBottomSheet.E1();
                        String string2 = ((CharSequence) obj).toString();
                        mjg mjgVar2 = wbVarE2.d;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, ub.a((ub) value2, null, string2, null, 5)));
                        return sbiVar;
                }
            }
        });
        Integer numValueOf = Integer.valueOf(R.attr.background_tertiary);
        jacVar.setBackgroundColorAttr(numValueOf);
        jacVar.k(new cf7(this) { // from class: pb
            public final /* synthetic */ AddStoryLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                int i3 = i2;
                boolean z = false;
                sbi sbiVar = sbi.a;
                AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        zv8[] zv8VarArr = AddStoryLinkBottomSheet.s;
                        return Boolean.valueOf(iIntValue == 5 ? ((jac) addStoryLinkBottomSheet.q.m(addStoryLinkBottomSheet, AddStoryLinkBottomSheet.s[2])).b.requestFocus() : false);
                    case 1:
                        zv8[] zv8VarArr2 = AddStoryLinkBottomSheet.s;
                        wb wbVarE1 = addStoryLinkBottomSheet.E1();
                        String string = ((CharSequence) obj).toString();
                        mjg mjgVar = wbVarE1.d;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, ub.a((ub) value, string, null, ynh.b, 2)));
                        return sbiVar;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zv8[] zv8VarArr3 = AddStoryLinkBottomSheet.s;
                        if (iIntValue2 == 6) {
                            addStoryLinkBottomSheet.E1().B();
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        zv8[] zv8VarArr4 = AddStoryLinkBottomSheet.s;
                        wb wbVarE2 = addStoryLinkBottomSheet.E1();
                        String string2 = ((CharSequence) obj).toString();
                        mjg mjgVar2 = wbVarE2.d;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, ub.a((ub) value2, null, string2, null, 5)));
                        return sbiVar;
                }
            }
        });
        linearLayout.addView(jacVar);
        TextView textView3 = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView3.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(6.0f * yl5.d().getDisplayMetrics().density));
        textView3.setLayoutParams(layoutParams5);
        q9i.a(nohVar, textView3);
        textView3.setTextColor(t1().getText().d);
        textView3.setText(R.string.oneme_stories_add_link_title_label);
        textView3.setAllCaps(true);
        linearLayout.addView(textView3);
        jac jacVar2 = new jac(linearLayout.getContext());
        jacVar2.setId(R.id.oneme_stories_add_link_bottom_sheet_title_input);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.bottomMargin = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        jacVar2.setLayoutParams(layoutParams6);
        jacVar2.setCustomTheme(t1());
        jacVar2.setHint(np4.q(getContext(), R.string.oneme_stories_add_link_title_hint));
        jacVar2.setImeOptions(6);
        final int i3 = 2;
        jacVar2.setOnEditorActionListener(new cf7(this) { // from class: pb
            public final /* synthetic */ AddStoryLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                int i4 = i3;
                boolean z = false;
                sbi sbiVar = sbi.a;
                AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        zv8[] zv8VarArr = AddStoryLinkBottomSheet.s;
                        return Boolean.valueOf(iIntValue == 5 ? ((jac) addStoryLinkBottomSheet.q.m(addStoryLinkBottomSheet, AddStoryLinkBottomSheet.s[2])).b.requestFocus() : false);
                    case 1:
                        zv8[] zv8VarArr2 = AddStoryLinkBottomSheet.s;
                        wb wbVarE1 = addStoryLinkBottomSheet.E1();
                        String string = ((CharSequence) obj).toString();
                        mjg mjgVar = wbVarE1.d;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, ub.a((ub) value, string, null, ynh.b, 2)));
                        return sbiVar;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zv8[] zv8VarArr3 = AddStoryLinkBottomSheet.s;
                        if (iIntValue2 == 6) {
                            addStoryLinkBottomSheet.E1().B();
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        zv8[] zv8VarArr4 = AddStoryLinkBottomSheet.s;
                        wb wbVarE2 = addStoryLinkBottomSheet.E1();
                        String string2 = ((CharSequence) obj).toString();
                        mjg mjgVar2 = wbVarE2.d;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, ub.a((ub) value2, null, string2, null, 5)));
                        return sbiVar;
                }
            }
        });
        jacVar2.setBackgroundColorAttr(numValueOf);
        final int i4 = 3;
        jacVar2.k(new cf7(this) { // from class: pb
            public final /* synthetic */ AddStoryLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                int i5 = i4;
                boolean z = false;
                sbi sbiVar = sbi.a;
                AddStoryLinkBottomSheet addStoryLinkBottomSheet = this.b;
                switch (i5) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        zv8[] zv8VarArr = AddStoryLinkBottomSheet.s;
                        return Boolean.valueOf(iIntValue == 5 ? ((jac) addStoryLinkBottomSheet.q.m(addStoryLinkBottomSheet, AddStoryLinkBottomSheet.s[2])).b.requestFocus() : false);
                    case 1:
                        zv8[] zv8VarArr2 = AddStoryLinkBottomSheet.s;
                        wb wbVarE1 = addStoryLinkBottomSheet.E1();
                        String string = ((CharSequence) obj).toString();
                        mjg mjgVar = wbVarE1.d;
                        do {
                            value = mjgVar.getValue();
                        } while (!mjgVar.h(value, ub.a((ub) value, string, null, ynh.b, 2)));
                        return sbiVar;
                    case 2:
                        int iIntValue2 = ((Integer) obj).intValue();
                        zv8[] zv8VarArr3 = AddStoryLinkBottomSheet.s;
                        if (iIntValue2 == 6) {
                            addStoryLinkBottomSheet.E1().B();
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        zv8[] zv8VarArr4 = AddStoryLinkBottomSheet.s;
                        wb wbVarE2 = addStoryLinkBottomSheet.E1();
                        String string2 = ((CharSequence) obj).toString();
                        mjg mjgVar2 = wbVarE2.d;
                        do {
                            value2 = mjgVar2.getValue();
                        } while (!mjgVar2.h(value2, ub.a((ub) value2, null, string2, null, 5)));
                        return sbiVar;
                }
            }
        });
        linearLayout.addView(jacVar2);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setCustomTheme(t1());
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.common_done));
        qe7.H(cybVar, 300L, new t8(3, this));
        linearLayout.addView(cybVar);
        frameLayout.addView(linearLayout, -1, -2);
    }

    public final jac D1() {
        return (jac) this.p.m(this, s[1]);
    }

    public final wb E1() {
        return (wb) this.o.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        Object value;
        wb wbVarE1 = E1();
        CharSequence charSequenceC = it3.c(getContext());
        wbVarE1.getClass();
        String string = charSequenceC != null ? charSequenceC.toString() : null;
        if (string == null) {
            string = "";
        }
        if (((y59) wbVarE1.c.getValue()).a(string, false).equals(w59.a)) {
            mjg mjgVar = wbVarE1.d;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, ub.a((ub) value, string, null, ynh.b, 2)));
            D1().setText(((ub) E1().e.a.getValue()).a);
            D1().setSelection(D1().getText().length());
            jac.o((jac) this.q.m(this, s[2]));
        } else {
            jac.o(D1());
        }
        r8e r8eVar = E1().e;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new qb(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().f, getViewLifecycleOwner().f(), n09Var), new qb(null, this, 1), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1, reason: from getter */
    public final oi8 getR() {
        return this.r;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        if (getView() != null) {
            nl9.c(getView());
        }
    }

    public AddStoryLinkBottomSheet(t3f t3fVar, ha9 ha9Var) {
        this(n1g.i(new ylc("arg_story_editor_parent_scope_id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
