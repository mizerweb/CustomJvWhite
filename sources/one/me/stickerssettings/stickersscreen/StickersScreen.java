package one.me.stickerssettings.stickersscreen;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.bdc;
import defpackage.c6b;
import defpackage.cyb;
import defpackage.dj9;
import defpackage.dq4;
import defpackage.due;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ej9;
import defpackage.f5d;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gnd;
import defpackage.gr4;
import defpackage.h99;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.i19;
import defpackage.i22;
import defpackage.ic6;
import defpackage.it3;
import defpackage.j8e;
import defpackage.j95;
import defpackage.jng;
import defpackage.jyf;
import defpackage.jz;
import defpackage.kc4;
import defpackage.kng;
import defpackage.kpg;
import defpackage.lng;
import defpackage.log;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mjg;
import defpackage.mpg;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.occ;
import defpackage.og7;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ow0;
import defpackage.p3c;
import defpackage.ptf;
import defpackage.q5b;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.ryf;
import defpackage.spg;
import defpackage.t2g;
import defpackage.tnh;
import defpackage.urf;
import defpackage.vp4;
import defpackage.vv;
import defpackage.w5b;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wo6;
import defpackage.wrf;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.xw3;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw8;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Iterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lkng;", "mode", "", "setId", "", "fromSettings", "Lha9;", "localAccountId", "(Lkng;JZLha9;)V", "stickers-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickersScreen extends Widget implements vp4, mc4 {
    public static final /* synthetic */ zv8[] m = {new dwd(StickersScreen.class, "stickersSetId", "getStickersSetId()J", 0), zo5.f(zfe.a, StickersScreen.class, "fromSettings", "getFromSettings()Z", 0), new dwd(StickersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(StickersScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(StickersScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final kng a;
    public final vv b;
    public final vv c;
    public final wtc d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final ow0 h;
    public final j8e i;
    public final ny8 j;
    public final dj9 k;
    public final zsj l;

    public StickersScreen(Bundle bundle) {
        Object next;
        super(bundle);
        String string = bundle.getString("mode");
        if (string == null) {
            ore.p("Required value was null.");
            throw null;
        }
        Iterator it = kng.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((kng) next).a.equals(string));
        if (next == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.a = (kng) next;
        this.b = new vv(Long.class, -1L, "set_id");
        this.c = new vv(Boolean.class, Boolean.FALSE, "from_settings");
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = createViewModelLazy(spg.class, new t2g(5, new jng(this, 0)));
        this.f = viewBinding(R.id.oneme_stickers_settings_toolbar);
        this.g = viewBinding(R.id.oneme_stickers_settings_content_recycler);
        this.h = binding(new jng(this, 1));
        this.i = viewBinding(R.id.oneme_stickers_settings_content_button);
        this.j = wtcVar.getAccessor().d(365);
        this.k = new dj9();
        this.l = new zsj(((a2c) wtcVar.getAccessor().c(27)).a(), new due(this), (occ) null);
    }

    public static final cyb o1(StickersScreen stickersScreen) {
        return (cyb) stickersScreen.i.m(stickersScreen, m[4]);
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        spg spgVarR1 = r1();
        ic6 ic6Var = spgVarR1.v;
        if (i == R.id.oneme_stickers_settings_stickers_menu_change) {
            mjg mjgVar = spgVarR1.E().d;
            q5b q5bVar = new q5b(6);
            mjgVar.getClass();
            mjgVar.j(null, q5bVar);
            return;
        }
        if (i == R.id.oneme_stickers_settings_stickers_recent_menu_clear) {
            a8j.x(ic6Var, new urf(new tnh(R.string.oneme_stickers_settings_stickers_recent_confirm_clear_title), new tnh(R.string.oneme_stickers_settings_stickers_recent_confirm_clear_subtitle), xw3.P0(new kc4(R.id.oneme_stickers_settings_confirm_recent_clear_action, new tnh(R.string.oneme_stickers_settings_stickers_recent_menu_clear_title), 1, 56), new kc4(R.id.oneme_stickers_settings_confirm_cancel, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_cancel), 2, 56))));
            return;
        }
        if (i == R.id.oneme_stickers_settings_stickers_favorite_menu_clear) {
            a8j.x(ic6Var, new urf(new tnh(R.string.oneme_stickers_settings_stickers_favorite_confirm_clear_title), new tnh(R.string.oneme_stickers_settings_stickers_favorite_confirm_clear_subtitle), xw3.P0(new kc4(R.id.oneme_stickers_settings_confirm_favorite_clear_action, new tnh(R.string.oneme_stickers_settings_stickers_recent_menu_clear_title), 1, 56), new kc4(R.id.oneme_stickers_settings_confirm_cancel, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_cancel), 2, 56))));
            return;
        }
        if (i != R.id.oneme_stickers_settings_menu_copy_link) {
            if (i == R.id.oneme_stickers_settings_menu_forward) {
                spgVarR1.C();
                return;
            } else if (i == R.id.oneme_stickers_settings_menu_delete_set) {
                a8j.x(ic6Var, new urf(new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_title), new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_subtitle), xw3.P0(new kc4(R.id.oneme_stickers_settings_confirm_delete_set_action, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_action), 1, 56), new kc4(R.id.oneme_stickers_settings_confirm_cancel, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_cancel), 2, 56))));
                return;
            } else {
                if (i == R.id.oneme_stickers_settings_menu_edit_set) {
                    a8j.x(spgVarR1.w, log.b.j(((f5d) ((wo6) spgVarR1.k.getValue())).k(), spgVarR1.d));
                    return;
                }
                return;
            }
        }
        kpg kpgVar = (kpg) spgVarR1.t.a.getValue();
        String str = kpgVar != null ? kpgVar.c : null;
        if (str == null || str.length() == 0) {
            gm0.Y(spg.class.getName(), "Early return in copyLinkSet cuz of link.isNullOrEmpty()");
            return;
        }
        it3.a(spgVarR1.f, str);
        wrf wrfVar = it3.b() ? new wrf(R.drawable.copy_outline_24, new tnh(R.string.oneme_stickers_settings_menu_copy_set_link_snackbar_title)) : null;
        if (wrfVar != null) {
            a8j.x(ic6Var, wrfVar);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        spg spgVarR1 = r1();
        zv8[] zv8VarArr = spg.y;
        dq4 dq4Var = spgVarR1.b;
        p3c p3cVar = spgVarR1.m;
        xhh xhhVar = spgVarR1.g;
        if (i == R.id.oneme_stickers_settings_confirm_recent_clear_action) {
            p3cVar.B(spgVarR1, zv8VarArr[0], yab.h0(dq4Var, ((n0c) xhhVar).b(), 2, new mpg(spgVarR1, null, 1)));
            return;
        }
        if (i == R.id.oneme_stickers_settings_confirm_favorite_clear_action) {
            p3cVar.B(spgVarR1, zv8VarArr[0], yab.h0(dq4Var, ((n0c) xhhVar).b(), 2, new mpg(spgVarR1, null, 0)));
            return;
        }
        if (i == R.id.oneme_stickers_settings_confirm_delete_stickers_action) {
            spgVarR1.n.B(spgVarR1, zv8VarArr[1], yab.h0(dq4Var, ((n0c) xhhVar).b(), 2, new ryf(spgVarR1, ((q5b) spgVarR1.E().e.a.getValue()).b, null, 8)));
            spgVarR1.E().a();
            return;
        }
        if (i == R.id.oneme_stickers_settings_confirm_delete_set_action) {
            spgVarR1.o.B(spgVarR1, zv8VarArr[2], yab.h0(dq4Var, ((n0c) xhhVar).b(), 2, new h99(spgVarR1, spgVarR1.d, (lq4) null, 11)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig */
    public final oi8 getC() {
        oi8 oi8Var = oi8.e;
        return oi8.f;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        ((ej9) this.j.getValue()).a(this.k);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        ((ej9) this.j.getValue()).b(this.k);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        hr4 hr4Var2 = hr4.e;
        ny8 ny8Var = this.j;
        dj9 dj9Var = this.k;
        if (hr4Var == hr4Var2 || hr4Var == hr4.c) {
            ((ej9) ny8Var.getValue()).b(dj9Var);
        } else if (hr4Var == hr4.d) {
            ((ej9) ny8Var.getValue()).a(dj9Var);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext());
        recyclerView.setId(R.id.oneme_stickers_settings_content_recycler);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.l);
        int iK = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - (gm0.K(yl5.d().getDisplayMetrics().density * 12.0f) * 2)) / (gm0.K(81.0f * yl5.d().getDisplayMetrics().density) + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        if (iK < 1) {
            iK = 1;
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iK));
        recyclerView.h(new i22(iK, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)), -1);
        recyclerView.i(new yw8(3, this));
        frameLayout.addView(recyclerView);
        cyb cybVar = new cyb(frameLayout.getContext());
        cybVar.setId(R.id.oneme_stickers_settings_content_button);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = iK2;
        layoutParams2.rightMargin = iK2;
        layoutParams2.topMargin = iK2;
        layoutParams2.bottomMargin = iK2;
        cybVar.setLayoutParams(layoutParams2);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.SECONDARY);
        cybVar.setText(np4.q(getContext(), R.string.oneme_stickers_settings_menu_forward_title));
        cybVar.setVisibility(8);
        frameLayout.addView(cybVar);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_stickers_settings_toolbar);
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new ptf(8, this)));
        n1g.N(new gnd(3, null, 1), rccVar);
        frameLayout.addView(rccVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.k.b();
        p1().setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        rcc rccVarQ1 = q1();
        bdc.a(rccVarQ1, new og7(rccVarQ1, 26, this));
        r8e r8eVar = r1().s;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new jyf((lq4) null, this, view, 6), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new jz(r1().t, 13), getViewLifecycleOwner().f(), n09Var), new lng(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().u, getViewLifecycleOwner().f(), n09Var), new lng(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().v, getViewLifecycleOwner().f(), n09Var), new lng(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(r1().w, getViewLifecycleOwner().f(), n09Var), new lng(null, this, 3), 3), getViewLifecycleScope());
        RecyclerView recyclerViewP1 = p1();
        w5b w5bVarE = r1().E();
        c6b c6bVar = new c6b(recyclerViewP1, this.l, w5bVarE, q1());
        e9i.j0(new fz6(w5bVarE.e, new w8(2, c6bVar, c6b.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 21), 3), getViewLifecycleScope());
    }

    public final RecyclerView p1() {
        return (RecyclerView) this.g.m(this, m[3]);
    }

    public final rcc q1() {
        return (rcc) this.f.m(this, m[2]);
    }

    public final spg r1() {
        return (spg) this.e.getValue();
    }

    public StickersScreen(kng kngVar, long j, boolean z, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("mode", kngVar.a), new ylc("set_id", Long.valueOf(j)), new ylc("from_settings", Boolean.valueOf(z))));
    }

    public /* synthetic */ StickersScreen(kng kngVar, long j, boolean z, ha9 ha9Var, int i, j95 j95Var) {
        this(kngVar, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? false : z, ha9Var);
    }
}
