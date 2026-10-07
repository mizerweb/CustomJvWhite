package one.me.contactadddialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.bsb;
import defpackage.bv;
import defpackage.c23;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.dh4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eg4;
import defpackage.fh4;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.fze;
import defpackage.gm0;
import defpackage.h;
import defpackage.i19;
import defpackage.j8e;
import defpackage.jz;
import defpackage.ke3;
import defpackage.kwb;
import defpackage.lq4;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nl9;
import defpackage.noh;
import defpackage.np4;
import defpackage.nt4;
import defpackage.ny8;
import defpackage.p1c;
import defpackage.pe3;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.t8;
import defpackage.uf4;
import defpackage.vv;
import defpackage.wf4;
import defpackage.xbd;
import defpackage.yg4;
import defpackage.yl5;
import defpackage.ynh;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/contactadddialog/ContactAddBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "contact-add-dialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContactAddBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] x = {new dwd(ContactAddBottomSheet.class, "contactId", "getContactId()J", 0), zo5.f(zfe.a, ContactAddBottomSheet.class, "bottomMargin", "getBottomMargin()Ljava/lang/Integer;", 0), new dwd(ContactAddBottomSheet.class, "scrollView", "getScrollView()Landroid/widget/ScrollView;", 0), new dwd(ContactAddBottomSheet.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(ContactAddBottomSheet.class, "firstName", "getFirstName()Lone/me/sdk/uikit/common/views/OneMeEditText;", 0), new dwd(ContactAddBottomSheet.class, "firstNameError", "getFirstNameError()Landroid/widget/TextView;", 0), new dwd(ContactAddBottomSheet.class, "lastName", "getLastName()Lone/me/sdk/uikit/common/views/OneMeEditText;", 0), new dwd(ContactAddBottomSheet.class, "lastNameError", "getLastNameError()Landroid/widget/TextView;", 0)};
    public final h m;
    public final ny8 n;
    public final vv o;
    public final vv p;
    public final ny8 q;
    public final j8e r;
    public final j8e s;
    public final j8e t;
    public final j8e u;
    public final j8e v;
    public final j8e w;

    public ContactAddBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.m = hVar;
        this.n = hVar.getAccessor().d(245);
        this.o = new vv("contact_id", Long.class);
        this.p = new vv(Integer.class, null, "bottom_margin");
        this.q = createViewModelLazy(fh4.class, new fj3(9, new pe3(12, this)));
        this.r = viewBinding(R.id.oneme_contact_add_bottom_sheet_scroll_view);
        this.s = viewBinding(R.id.oneme_contact_add_bottom_sheet_avatar);
        this.t = viewBinding(R.id.oneme_contact_add_bottom_sheet_first_name);
        this.u = viewBinding(R.id.oneme_contact_add_bottom_sheet_first_name_error);
        this.v = viewBinding(R.id.oneme_contact_add_bottom_sheet_last_name);
        this.w = viewBinding(R.id.oneme_contact_add_bottom_sheet_last_name_error);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        ynh ynhVar;
        ynh ynhVar2;
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(15.0f * yl5.d().getDisplayMetrics().density));
        dh4 dh4Var = (dh4) E1().j.a.getValue();
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.oneme_contact_add_bottom_sheet_content);
        int iK2 = gm0.K(64.0f * yl5.d().getDisplayMetrics().density);
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setId(R.id.oneme_contact_add_bottom_sheet_title);
        textView.setGravity(17);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setText(R.string.contact_attach_new);
        q9i.a(q9i.d, textView);
        frameLayout2.addView(textView, -1, iK2);
        ScrollView scrollView = new ScrollView(frameLayout2.getContext());
        scrollView.setId(R.id.oneme_contact_add_bottom_sheet_scroll_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = iK2;
        scrollView.setLayoutParams(layoutParams);
        scrollView.setFillViewport(true);
        wf4 wf4Var = new wf4(scrollView.getContext());
        wf4Var.setLayoutParams(new uf4(-1, -1));
        scrollView.addView(wf4Var);
        kwb kwbVar = new kwb(scrollView.getContext());
        kwbVar.setId(R.id.oneme_contact_add_bottom_sheet_avatar);
        kwbVar.setAddBadgeVisibility(false);
        wf4Var.addView(kwbVar, gm0.K(yl5.d().getDisplayMetrics().density * 96.0f), gm0.K(yl5.d().getDisplayMetrics().density * 96.0f));
        p1c p1cVar = new p1c(scrollView.getContext(), 14);
        p1cVar.setId(R.id.oneme_contact_add_bottom_sheet_first_name);
        p1cVar.setSingleLine(true);
        p1cVar.setHint(p1cVar.getResources().getText(R.string.oneme_contact_first_name_placeholder));
        p1cVar.setClipToOutline(true);
        p1cVar.setOutlineProvider(new nt4(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f)));
        p1cVar.setInputType(p1cVar.getInputType() | 16384);
        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
        p1cVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        noh nohVar = q9i.e;
        q9i.a(nohVar, p1cVar);
        p1cVar.addTextChangedListener(new yg4(this, 0));
        wf4Var.addView(p1cVar, 0, -2);
        TextView textView2 = new TextView(scrollView.getContext());
        textView2.setId(R.id.oneme_contact_add_bottom_sheet_first_name_error);
        textView2.setText((dh4Var == null || (ynhVar2 = dh4Var.d) == null) ? null : ynhVar2.d(textView2));
        textView2.setVisibility((dh4Var != null ? dh4Var.d : null) != null ? 0 : 8);
        textView2.setTextColor(a8gVar.h(textView2).getText().j);
        noh nohVar2 = q9i.i;
        q9i.a(nohVar2, textView2);
        textView2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        wf4Var.addView(textView2, 0, -2);
        p1c p1cVar2 = new p1c(scrollView.getContext(), 14);
        p1cVar2.setId(R.id.oneme_contact_add_bottom_sheet_last_name);
        p1cVar2.setSingleLine(true);
        p1cVar2.setHint(p1cVar2.getResources().getText(R.string.oneme_contact_last_name_placeholder));
        p1cVar2.setClipToOutline(true);
        p1cVar2.setOutlineProvider(new nt4(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f)));
        p1cVar2.setInputType(p1cVar2.getInputType() | 16384);
        p1cVar2.setTextColor(a8gVar.h(p1cVar2).getText().b);
        p1cVar2.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
        q9i.a(nohVar, p1cVar2);
        p1cVar2.addTextChangedListener(new yg4(this, 1));
        wf4Var.addView(p1cVar2, 0, -2);
        TextView textView3 = new TextView(scrollView.getContext());
        textView3.setId(R.id.oneme_contact_add_bottom_sheet_last_name_error);
        textView3.setText((dh4Var == null || (ynhVar = dh4Var.f) == null) ? null : ynhVar.d(textView3));
        textView3.setVisibility((dh4Var != null ? dh4Var.f : null) != null ? 0 : 8);
        textView3.setTextColor(a8gVar.h(textView3).getText().j);
        q9i.a(nohVar2, textView3);
        textView3.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(textView3, 0, -2);
        cyb cybVar = new cyb(scrollView.getContext());
        cybVar.setId(R.id.oneme_contact_add_bottom_sheet_save);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.to_save));
        qe7.H(cybVar, 300L, new t8(20, this));
        wf4Var.addView(cybVar, 0, -2);
        n1g.N(new bv(this, textView, p1cVar, textView2, p1cVar2, textView3, cybVar, null), wf4Var);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = kwbVar.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = p1cVar.getId();
        eg4VarH.d(id2, 3, kwbVar.getId(), 4);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id2));
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        int id3 = textView2.getId();
        eg4VarH.d(id3, 3, p1cVar.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id3));
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        int id4 = p1cVar2.getId();
        eg4VarH.d(id4, 3, textView2.getId(), 4);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id4));
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 7, 0, 7);
        int id5 = textView3.getId();
        eg4VarH.d(id5, 3, p1cVar2.getId(), 4);
        qt4.w(4.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH, id5));
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        int id6 = cybVar.getId();
        eg4VarH.d(id6, 3, textView3.getId(), 4);
        new bsb(3, eg4VarH, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f) * 2);
        eg4VarH.d(id6, 6, 0, 6);
        eg4VarH.d(id6, 7, 0, 7);
        eg4VarH.d(id6, 4, 0, 4);
        eg4VarH.g(id6).d.x = 1.0f;
        eg4VarH.a(wf4Var);
        frameLayout2.addView(scrollView);
        frameLayout.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        mt5 mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
        mt5Var.setCustomTheme(null);
        frameLayout.addView(mt5Var);
    }

    public final long D1() {
        zv8 zv8Var = x[0];
        return ((Number) this.o.a(this)).longValue();
    }

    public final fh4 E1() {
        return (fh4) this.q.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout o1(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayoutO1 = super.o1(layoutInflater, bundle);
        frameLayoutO1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayoutO1;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jz jzVar = new jz(E1().j, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        int i = 3;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new ke3(9, lq4Var, this), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(E1().h, getViewLifecycleOwner().f(), n09Var), new fze(lq4Var, this, view, 22), i), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new c23(this, 2);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        View view = getView();
        if (view != null) {
            nl9.c(view);
        }
    }
}
