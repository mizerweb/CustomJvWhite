package one.me.chatscreen.mediabar;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a4c;
import defpackage.as9;
import defpackage.br4;
import defpackage.bs0;
import defpackage.ch3;
import defpackage.col;
import defpackage.cu2;
import defpackage.d97;
import defpackage.dwd;
import defpackage.dz9;
import defpackage.e30;
import defpackage.e9i;
import defpackage.ek7;
import defpackage.ez9;
import defpackage.f1j;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gce;
import defpackage.gi7;
import defpackage.gk7;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.h;
import defpackage.hb9;
import defpackage.hff;
import defpackage.hve;
import defpackage.ib9;
import defpackage.j8e;
import defpackage.j95;
import defpackage.je9;
import defpackage.jff;
import defpackage.jha;
import defpackage.jy5;
import defpackage.jz;
import defpackage.kbc;
import defpackage.kz9;
import defpackage.lff;
import defpackage.lq4;
import defpackage.lve;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nef;
import defpackage.nff;
import defpackage.ny8;
import defpackage.oef;
import defpackage.oi8;
import defpackage.p7d;
import defpackage.pq3;
import defpackage.q2f;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.ra1;
import defpackage.rb5;
import defpackage.rt1;
import defpackage.rx8;
import defpackage.s81;
import defpackage.see;
import defpackage.sol;
import defpackage.sr9;
import defpackage.sw8;
import defpackage.t3f;
import defpackage.tha;
import defpackage.tp2;
import defpackage.v09;
import defpackage.vp4;
import defpackage.vqa;
import defpackage.vv;
import defpackage.ww3;
import defpackage.x9h;
import defpackage.xzl;
import defpackage.yab;
import defpackage.yka;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zka;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/chatscreen/mediabar/SelectedMediaBottomBarWidget;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lq2f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "hierarchyScopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "needSyncMediaBar", "parentScopeId", "(Lt3f;JZLt3f;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectedMediaBottomBarWidget extends Widget implements vp4, q2f {
    public static final /* synthetic */ zv8[] C = {new dwd(SelectedMediaBottomBarWidget.class, "hierarchyScopeId", "getHierarchyScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, SelectedMediaBottomBarWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(SelectedMediaBottomBarWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new dwd(SelectedMediaBottomBarWidget.class, "needSyncMediaBar", "getNeedSyncMediaBar()Z", 0), new dwd(SelectedMediaBottomBarWidget.class, "selectedMediaRecycler", "getSelectedMediaRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(SelectedMediaBottomBarWidget.class, "selectedMediaContent", "getSelectedMediaContent()Landroid/view/ViewGroup;", 0), new dwd(SelectedMediaBottomBarWidget.class, "messageContent", "getMessageContent()Lone/me/sdk/uikit/common/chat/MessageInputView;", 0), new dwd(SelectedMediaBottomBarWidget.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0)};
    public oef A;
    public kbc B;
    public final t3f a;
    public final oi8 b;
    public final String c;
    public final vv d;
    public final vv e;
    public final vv f;
    public final h g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final j8e r;
    public final j8e s;
    public final j8e t;
    public final j8e u;
    public g8c v;
    public kz9 w;
    public tp2 x;
    public hve y;
    public final jy5 z;

    public SelectedMediaBottomBarWidget(Bundle bundle) {
        super(bundle);
        this.a = new t3f("SelectedMediaBottomBar", super.getB().b());
        this.b = oi8.e;
        this.c = SelectedMediaBottomBarWidget.class.getName();
        vv vvVar = new vv("scope_id", t3f.class);
        this.d = vvVar;
        vv vvVar2 = new vv("parent_scope_id", t3f.class);
        this.e = new vv("id", Long.class);
        this.f = new vv("need_sync", Boolean.class);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.g = hVar;
        this.h = hVar.getAccessor().d(783);
        this.i = hVar.getAccessor().d(26);
        this.j = createViewModelLazy(gi7.class, new ztd(12, new jff(this, 9)));
        zv8[] zv8VarArr = C;
        zv8 zv8Var = zv8VarArr[0];
        this.k = getSharedViewModel((t3f) vvVar.a(this), as9.class, null);
        this.l = createViewModelLazy(hff.class, new ztd(13, new jff(this, 10)));
        this.m = createViewModelLazy(ez9.class, new ztd(14, new jff(this, 11)));
        zv8 zv8Var2 = zv8VarArr[1];
        this.n = getSharedViewModel((t3f) vvVar2.a(this), x9h.class, null);
        this.o = rx8.P(3, new jff(this, 0));
        this.p = rx8.P(3, new jff(this, 1));
        this.q = rx8.P(3, new jff(this, 2));
        this.r = viewBinding(R.id.selected_media__recycler);
        this.s = viewBinding(R.id.selected_media__recycler_container);
        this.t = viewBinding(R.id.selected_media__message_input);
        this.u = viewBinding(R.id.selected_media__content_container);
        this.z = new jy5(this, 3);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        if (r1()) {
            as9 as9VarP1 = p1();
            if (i == R.id.send_context_menu_action_scheduled_send) {
                yab.i0(as9VarP1.b, null, 0, new sr9(as9VarP1, null, 0), 3);
                return;
            } else {
                as9VarP1.getClass();
                return;
            }
        }
        hff hffVarT1 = t1();
        if (i == R.id.send_context_menu_action_scheduled_send) {
            hffVarT1.I();
        } else {
            hffVarT1.getClass();
        }
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        oef oefVar = this.A;
        hb9 hb9VarX0 = oefVar != null ? oefVar.X0() : null;
        hff hffVarT1 = t1();
        CharSequence text = q1().getText();
        if (j == 1) {
            Long l = (Long) hffVarT1.d.e.invoke();
            if (l != null) {
                hffVarT1.D(text, l.longValue());
            } else {
                hffVarT1.r.B(hffVarT1, hff.C[0], yab.h0(hffVarT1.b, ((n0c) hffVarT1.E()).a(), 2, new f1j(hffVarT1, text, hb9VarX0, j2, (lq4) null)));
            }
        } else {
            hffVarT1.getClass();
        }
        oef oefVar2 = this.A;
        if (oefVar2 != null) {
            oefVar2.O0();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getB() {
        return this.a;
    }

    public final kbc o1() {
        kbc kbcVar = this.B;
        return kbcVar == null ? pq3.j.e(getContext()).m() : kbcVar;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.selected_media__main_container);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        n1g.N(new nff(this, (lq4) null, 0), linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setId(R.id.selected_media__content_container);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(linearLayout2.getContext());
        linearLayout3.setId(R.id.selected_media__recycler_container);
        linearLayout3.setVerticalGravity(16);
        ImageView imageView = new ImageView(linearLayout3.getContext());
        imageView.setId(R.id.selected_media__delete_choice);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.icon_delete).mutate());
        int i = ((bs0) o1().u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        imageView.setBackground(col.b(i, null, shapeDrawable));
        n1g.N(new vqa(this, (lq4) null, 29), imageView);
        qe7.H(imageView, 300L, new gwc(20, this));
        linearLayout3.addView(imageView);
        RecyclerView recyclerView = new RecyclerView(linearLayout3.getContext());
        recyclerView.setId(R.id.selected_media__recycler);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        recyclerView.setLayoutParams(layoutParams2);
        see itemAnimator = recyclerView.getItemAnimator();
        rb5 rb5Var = itemAnimator instanceof rb5 ? (rb5) itemAnimator : null;
        if (rb5Var != null) {
            rb5Var.g = false;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 12.0f);
        recyclerView.setBackground(gradientDrawable);
        recyclerView.setClipToOutline(true);
        ((nef) this.q.getValue()).f = new s81(recyclerView, 16, this);
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.q1(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayout3.addView(recyclerView);
        linearLayout2.addView(linearLayout3);
        tha thaVar = new tha(linearLayout2.getContext());
        thaVar.setId(R.id.selected_media__message_input);
        zv8 zv8Var = C[0];
        thaVar.setSendIconResId(sol.e((t3f) this.d.a(this)) ? R.drawable.icon_clock : R.drawable.icon_arrow_up);
        thaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        thaVar.setVisibility(8);
        thaVar.setRightOuterIconActionState(jha.a);
        thaVar.setInputHint(R.string.media_type_picker__input_hint);
        thaVar.setText(((ib9) this.h.getValue()).a.i);
        thaVar.f.addTextChangedListener(new rt1(new p7d(24, this), 5, thaVar));
        thaVar.setRightOuterIconTouchListener(new ek7(new GestureDetector(thaVar.getContext(), new gk7(new jff(this, 4), 0, new jff(this, 5))), 0));
        thaVar.setLeftInnerIconTouchListener(xzl.a(thaVar.getContext(), new jff(this, 6)));
        linearLayout2.addView(thaVar);
        linearLayout.addView(linearLayout2);
        tp2 tp2Var = new tp2(linearLayout.getContext());
        tp2Var.setId(R.id.selected_media__media_keyboard_container);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 80;
        tp2Var.setLayoutParams(layoutParams3);
        this.x = tp2Var;
        this.y = getChildRouter(tp2Var);
        linearLayout.addView(tp2Var);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        g8c g8cVar = this.v;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.A = null;
        this.x = null;
        this.y = null;
        kz9 kz9Var = this.w;
        if (kz9Var != null) {
            kz9Var.c();
        }
        this.w = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q1().setText(((ib9) this.h.getValue()).a.i);
        cu2 cu2Var = new cu2(new jz(p1().c, 13), 9);
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(cu2Var, getViewLifecycleOwner().f(), n09Var), new gce(null, this), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().getMessageState(), getViewLifecycleOwner().f(), n09Var), new lff(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().getMessagePosition(), getViewLifecycleOwner().f(), n09Var), new lff(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(s1().v, 13), getViewLifecycleOwner().f(), n09Var), new lff(null, this, 3), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(s1().z, 13), getViewLifecycleOwner().f(), n09Var), new lff(null, this, 4), 3), getViewLifecycleScope());
        CharSequence charSequence = ((ib9) this.h.getValue()).a.i;
        if (charSequence != null) {
            s1().F(charSequence);
        }
        e9i.j0(new fz6(n1g.v(t1().w, getViewLifecycleOwner().f(), n09Var), new lff(null, this, 5), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().A, getViewLifecycleOwner().f(), n09Var), new lff(null, this, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().y, getViewLifecycleOwner().f(), n09Var), new lff(null, this, 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().z, getViewLifecycleOwner().f(), n09Var), new lff(null, this, 8), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new ra1(18, e9i.q0(p1().s)), getViewLifecycleOwner().f(), n09Var), new lff(null, this, 9), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().x, getViewLifecycleOwner().f(), n09Var), new lff(null, this, 10), 3), getViewLifecycleScope());
        ViewGroup viewGroup = (ViewGroup) this.u.m(this, C[7]);
        String name = SelectedMediaBottomBarWidget.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "initKeyboard media editor", null);
            }
        }
        hve hveVar = this.y;
        tp2 tp2Var = this.x;
        if (hveVar == null || tp2Var == null) {
            return;
        }
        jff jffVar = new jff(this, 7);
        boolean zA = ch3.o(getContext()).a();
        v09 viewLifecycleScope = getViewLifecycleScope();
        zka zkaVar = (zka) t1().B.b.a.getValue();
        this.w = new kz9(hveVar, tp2Var, viewGroup, jffVar, zA, viewLifecycleScope, (zkaVar != null ? zkaVar.a : null) == yka.b, null, null, new jff(this, 8), 1664);
        new dz9((ez9) this.m.getValue(), q1()).a(getViewLifecycleScope());
        e9i.j0(new fz6(new jz(t1().B.b, 13), new lff(null, this), 3), getViewLifecycleScope());
        r8e r8eVar = ((ez9) this.m.getValue()).h;
        e9i.j0(new e30(new fz6(new jz(r8eVar, 13), new d97(r8eVar, (lq4) null, this, 28), 3), 7), getViewLifecycleScope());
    }

    public final as9 p1() {
        return (as9) this.k.getValue();
    }

    public final tha q1() {
        return (tha) this.t.m(this, C[6]);
    }

    public final boolean r1() {
        zv8 zv8Var = C[3];
        return ((Boolean) this.f.a(this)).booleanValue();
    }

    public final x9h s1() {
        return (x9h) this.n.getValue();
    }

    public final hff t1() {
        return (hff) this.l.getValue();
    }

    public final void u1(kbc kbcVar) {
        lve lveVar;
        this.B = kbcVar;
        hve hveVar = this.y;
        MediaKeyboardWidget mediaKeyboardWidget = null;
        if (hveVar != null && hveVar.o()) {
            hve hveVar2 = this.y;
            br4 br4Var = (hveVar2 == null || (lveVar = (lve) ww3.u1(0, hveVar2.e())) == null) ? null : lveVar.a;
            if (br4Var instanceof MediaKeyboardWidget) {
                mediaKeyboardWidget = (MediaKeyboardWidget) br4Var;
            }
        }
        if (mediaKeyboardWidget != null) {
            mediaKeyboardWidget.p = kbcVar;
            sw8 sw8Var = mediaKeyboardWidget.o;
            if (sw8Var != null) {
                sw8Var.L(kbcVar);
            }
        }
        if (getView() != null) {
            q1().setCustomTheme(kbcVar);
        }
    }

    public SelectedMediaBottomBarWidget(t3f t3fVar, long j, boolean z, t3f t3fVar2) {
        this(n1g.i(new ylc("parent_scope_id", t3fVar2), new ylc("scope_id", t3fVar), new ylc("id", Long.valueOf(j)), new ylc("need_sync", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(t3fVar2.b().a))));
    }

    public /* synthetic */ SelectedMediaBottomBarWidget(t3f t3fVar, long j, boolean z, t3f t3fVar2, int i, j95 j95Var) {
        this(t3fVar, j, z, (i & 8) != 0 ? t3fVar : t3fVar2);
    }
}
