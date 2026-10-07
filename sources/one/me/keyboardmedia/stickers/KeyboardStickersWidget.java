package one.me.keyboardmedia.stickers;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.c4g;
import defpackage.ch8;
import defpackage.d4g;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.e9i;
import defpackage.eo2;
import defpackage.eog;
import defpackage.eph;
import defpackage.ez9;
import defpackage.fz1;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.gm0;
import defpackage.h;
import defpackage.i22;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.k96;
import defpackage.kbc;
import defpackage.kog;
import defpackage.ldh;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nj1;
import defpackage.nv4;
import defpackage.nw8;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.q0d;
import defpackage.q35;
import defpackage.qpg;
import defpackage.r07;
import defpackage.t3f;
import defpackage.tm6;
import defpackage.tpg;
import defpackage.um6;
import defpackage.v22;
import defpackage.vdh;
import defpackage.wae;
import defpackage.xw8;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw8;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zw8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Leph;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lt3f;", "scopeId", "(JLt3f;)V", "keyboard-media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class KeyboardStickersWidget extends Widget implements mc4, eph {
    public static final /* synthetic */ zv8[] l = {new dwd(KeyboardStickersWidget.class, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zo5.f(zfe.a, KeyboardStickersWidget.class, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final h a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public dj9 e;
    public kbc f;
    public final j8e g;
    public final j8e h;
    public final kog i;
    public final nj1 j;
    public final eo2 k;

    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = hVar.getAccessor().d(18);
        int i = 25;
        this.c = createViewModelLazy(tpg.class, new ch8(7, new dx4(bundle, i, this)));
        lq4 lq4Var = null;
        this.d = getSharedViewModel(getB(), ez9.class, null);
        this.g = viewBinding(R.id.oneme_media_keyboard_stickers_list);
        this.h = viewBinding(R.id.oneme_media_keyboard_stickers_tabs);
        this.i = new kog(((a2c) hVar.getAccessor().c(27)).a(), new nv4(23, this), (byte) 0);
        nj1 nj1Var = new nj1(((a2c) hVar.getAccessor().c(27)).a(), new zw8(this, bundle));
        this.j = nj1Var;
        tpg tpgVarQ1 = q1();
        tpgVarQ1.getClass();
        gm0.n(tpg.class.getName(), "loadStickers");
        vdh vdhVar = (vdh) tpgVarQ1.d.getValue();
        q0d q0dVar = new q0d(((wae) vdhVar.g.getValue()).h(), vdhVar, i);
        tm6 tm6Var = ((um6) tpgVarQ1.f.getValue()).k;
        mjg mjgVar = ((ldh) tpgVarQ1.g.getValue()).i;
        d4g d4gVar = (d4g) tpgVarQ1.h.getValue();
        r07 r07Var = new r07(new q0d(((vdh) d4gVar.a.getValue()).m, d4gVar, 19), ((eog) d4gVar.b.getValue()).e, c4g.h, 0);
        int i2 = 3;
        e9i.j0(e9i.T(new fz6(e9i.B(q0dVar, tm6Var, mjgVar, r07Var, new fz1(5, lq4Var, i2)), new j8g(tpgVarQ1, lq4Var, 11), i2), ((n0c) tpgVarQ1.c).b()), tpgVarQ1.b);
        e9i.j0(new fz6(q1().l, new xw8(this, null, 0), i2), getLifecycleScope());
        this.k = new eo2(nj1Var, new fz7(1, q1(), tpg.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 3));
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_media_keyboard_recent_clear_confirmation_action) {
            tpg tpgVarQ1 = q1();
            tpgVarQ1.r.B(tpgVarQ1, tpg.u[2], yab.h0(tpgVarQ1.b, ((n0c) tpgVarQ1.c).b(), 2, new qpg(tpgVarQ1, null, 0)));
        }
    }

    public final k96 o1() {
        return (k96) this.g.m(this, l[0]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_media_keyboard_stickers_container);
        int iK = gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext());
        recyclerView.setId(R.id.oneme_media_keyboard_stickers_tabs);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iK));
        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        recyclerView.setPadding(iK3, iK2, iK3, iK2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        frameLayout.addView(recyclerView);
        k96 k96Var = new k96(frameLayout.getContext());
        k96Var.setId(R.id.oneme_media_keyboard_stickers_list);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iK;
        k96Var.setLayoutParams(layoutParams);
        k96Var.setClipToPadding(false);
        k96Var.setClipChildren(false);
        int iK4 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        k96Var.setPadding(iK4, k96Var.getPaddingTop(), iK4, gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        frameLayout.addView(k96Var);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        o1().setAdapter(null);
        o1().r0(this.k);
        p1().setAdapter(null);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.f;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        RecyclerView recyclerViewP1 = p1();
        recyclerViewP1.setBackgroundColor(kbcVar.k().b);
        Context context = recyclerViewP1.getContext();
        a8g a8gVar = pq3.j;
        a8gVar.e(context).getClass();
        pq3.f(recyclerViewP1, kbcVar);
        k96 k96VarO1 = o1();
        k96VarO1.setBackgroundColor(kbcVar.p().c);
        a8gVar.e(k96VarO1.getContext()).getClass();
        pq3.f(k96VarO1, kbcVar);
        k96VarO1.X();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        p1().setAdapter(this.i);
        p1().h(new q35(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), 1), -1);
        k96 k96VarO1 = o1();
        dj9 dj9Var = this.e;
        nj1 nj1Var = this.j;
        nj1Var.i = dj9Var;
        int iK = (k96VarO1.getContext().getResources().getDisplayMetrics().widthPixels - (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) * 2)) / (gm0.K(81.0f * yl5.d().getDisplayMetrics().density) + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        int i = iK >= 1 ? iK : 1;
        k96VarO1.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
        gridLayoutManager.K = new nw8(gridLayoutManager, nj1Var);
        k96VarO1.setLayoutManager(gridLayoutManager);
        k96VarO1.h(new i22(i, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)), -1);
        k96VarO1.k(this.k);
        k96VarO1.k(new v22(4, this));
        k96VarO1.i(new yw8(0, this));
        k96VarO1.setAdapter(nj1Var);
        int i2 = 3;
        e9i.j0(new fz6(q1().o, new xw8(this, null, 2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().t, getViewLifecycleOwner().f(), n09.d), new xw8(null, this), i2), getViewLifecycleScope());
    }

    public final RecyclerView p1() {
        return (RecyclerView) this.h.m(this, l[1]);
    }

    public final tpg q1() {
        return (tpg) this.c.getValue();
    }

    public KeyboardStickersWidget(long j, t3f t3fVar) {
        this(n1g.i(new ylc("arg_key_chat_id", Long.valueOf(j)), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
