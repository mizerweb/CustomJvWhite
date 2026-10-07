package one.me.profileedit;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8d;
import defpackage.a8j;
import defpackage.apd;
import defpackage.bc1;
import defpackage.br4;
import defpackage.c06;
import defpackage.c1a;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.eod;
import defpackage.et4;
import defpackage.fz6;
import defpackage.god;
import defpackage.ha9;
import defpackage.hta;
import defpackage.hve;
import defpackage.ic6;
import defpackage.j1a;
import defpackage.j8e;
import defpackage.jc4;
import defpackage.jz;
import defpackage.k9d;
import defpackage.kbc;
import defpackage.kc4;
import defpackage.ks6;
import defpackage.ll6;
import defpackage.lp0;
import defpackage.lq4;
import defpackage.lve;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nnd;
import defpackage.nod;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oq1;
import defpackage.p;
import defpackage.pod;
import defpackage.qz9;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rt3;
import defpackage.spc;
import defpackage.suc;
import defpackage.t20;
import defpackage.tnh;
import defpackage.tod;
import defpackage.tre;
import defpackage.ubf;
import defpackage.voc;
import defpackage.vp4;
import defpackage.vzc;
import defpackage.wnd;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.xhh;
import defpackage.xw3;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ynh;
import defpackage.yw4;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zz5;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lj1a;", "Lyw4;", "Lubf;", "Lvp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lnnd;", "type", "Lha9;", "localAccountId", "(JLnnd;Lha9;)V", "profile-edit"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileEditScreen extends Widget implements mc4, j1a, yw4, ubf, vp4 {
    public static final /* synthetic */ zv8[] p = {new dwd(ProfileEditScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), zo5.f(zfe.a, ProfileEditScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(ProfileEditScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ProfileEditScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), new dwd(ProfileEditScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(ProfileEditScreen.class, "confirmationButton", "getConfirmationButton()Landroid/widget/FrameLayout;", 0)};
    public final long a;
    public final wtc b;
    public final ny8 c;
    public final ks6 d;
    public final oi8 e;
    public final ny8 f;
    public final lp0 g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final ny8 n;
    public final ny8 o;

    public ProfileEditScreen(Bundle bundle) {
        super(bundle);
        this.a = bundle.getLong("profile:id");
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = wtcVar.getAccessor().d(85);
        this.d = tre.G(this, new a8d(14, this));
        this.e = oi8.f;
        this.f = createViewModelLazy(apd.class, new hta(24, new k9d(this, 7, bundle)));
        this.g = new lp0(((a2c) wtcVar.getAccessor().c(27)).a(), this);
        this.h = viewBinding(R.id.profile_edit_appbar_layout);
        this.i = viewBinding(R.id.profile_edit_recycler_view);
        this.j = viewBinding(R.id.profile_edit_oneme_toolbar);
        this.k = viewBinding(R.id.profile_edit_collapsible_container_layout);
        this.l = viewBinding(R.id.profile_edit_avatar);
        this.m = viewBinding(R.id.profile_edit_confirm_save_button);
        this.n = wtcVar.getAccessor().d(34);
        this.o = wtcVar.getAccessor().d(231);
        e9i.j0(new fz6(new jz(s1().k, 13), new pod(this, null, 0), 3), getLifecycleScope());
        e9i.j0(n1g.v(new fz6(new jz(s1().n, 13), new pod(this, null, 1), 3), this.lifecycleOwner.f(), n09.e), getLifecycleScope());
        e9i.j0(new fz6(s1().o, new pod(this, null, 2), 3), getLifecycleScope());
    }

    public static final RecyclerView o1(ProfileEditScreen profileEditScreen) {
        return (RecyclerView) profileEditScreen.i.m(profileEditScreen, p[1]);
    }

    public static final void p1(ProfileEditScreen profileEditScreen, kbc kbcVar) {
        ((ShapeDrawable) profileEditScreen.q1().getBackground()).getPaint().setShader(new LinearGradient(profileEditScreen.q1().getMeasuredWidth() / 2.0f, 0.0f, profileEditScreen.q1().getMeasuredWidth() / 2.0f, profileEditScreen.q1().getMeasuredHeight(), new int[]{tre.I0(kbcVar.b().b, 0.0f), tre.I0(kbcVar.b().b, 0.72f), kbcVar.b().b}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        apd apdVarS1 = s1();
        yab.i0(apdVarS1.b, ((n0c) ((xhh) apdVarS1.d.getValue())).b(), 0, new qz9(apdVarS1, sucVar.a, null, 28), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        ProfileEditScreen profileEditScreen = this;
        if (i == R.id.profile_edit_delete_profile_button) {
            ml9.b(profileEditScreen);
            zv8[] zv8VarArr = BottomSheetWidget.t;
            jc4 jc4VarC = p.c(R.string.oneme_profile_edit_delete_profile_header, null, null, 6);
            jc4VarC.g(new tnh(R.string.oneme_profile_edit_delete_profile_description));
            jc4VarC.a(new kc4(R.id.profile_edit_delete_profile_cancel_button, new tnh(R.string.oneme_profile_edit_delete_profile_cancel_action), 2, true, 3, 2));
            jc4VarC.a(new kc4(R.id.profile_edit_delete_profile_button, new tnh(R.string.oneme_profile_edit_delete_profile_delete_action), 3, true, 3, 1));
            ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(profileEditScreen);
            confirmationBottomSheetF.setTargetController(profileEditScreen);
            br4 parentController = profileEditScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
            }
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        apd apdVarS1 = s1();
        zz5 zz5Var = apdVarS1.c;
        ic6 ic6Var = apdVarS1.n;
        if (i == R.id.profile_edit_confirm_save_button) {
            a8j.x(ic6Var, eod.b);
            return;
        }
        if (i == R.id.profile_edit_confirm_exit_button) {
            a8j.x(ic6Var, rt3.b);
            return;
        }
        if (i == R.id.profile_edit_change_avatar_upload_from_gallery) {
            a8j.x(ic6Var, god.b);
            return;
        }
        if (i == R.id.profile_edit_change_avatar_select_neuro_avatar) {
            wnd wndVar = wnd.b;
            long jE = zz5Var.e();
            wndVar.getClass();
            bc1.q(":neuro-avatars?id=" + jE, ic6Var);
            return;
        }
        if (i == R.id.profile_edit_change_avatar_upload_from_camera) {
            apdVarS1.C();
            return;
        }
        if (i == R.id.profile_edit_change_avatar_remove_current) {
            zz5Var.k();
        } else {
            if (i == R.id.profile_confirmation_sheet_cancel || i == R.id.profile_edit_delete_profile_cancel_button || i == R.id.profile_edit_change_avatar_cancel) {
                return;
            }
            zz5Var.g(i);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getA() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.d;
    }

    @Override // defpackage.br4
    public final boolean handleBack() {
        ml9.b(this);
        apd apdVarS1 = s1();
        zz5 zz5Var = apdVarS1.c;
        c06 c06Var = (c06) zz5Var.k.getValue();
        Boolean bool = null;
        if (c06Var != null && c06Var.b((c06) zz5Var.l.getValue())) {
            a8j.x(apdVarS1.o, new tod(new tnh(R.string.oneme_profile_edit_confirm_leave_title), (ynh) null, xw3.P0(new kc4(R.id.profile_edit_confirm_save_button, new tnh(R.string.oneme_profile_edit_confirm_save_action), 3, true, 3, 4), new kc4(R.id.profile_edit_confirm_exit_button, new tnh(R.string.oneme_profile_edit_confirm_exit_action), 2, true, 3, 2)), 10));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : super.handleBack();
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            apd apdVarS1 = s1();
            yab.i0(apdVarS1.b, ((n0c) ((xhh) apdVarS1.d.getValue())).b(), 0, new t20(apdVarS1, intent != null ? intent.getData() : null, (lq4) null, 27), 2);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        nod nodVar = new nod(this, 0);
        et4 et4Var = new et4(getContext());
        et4Var.setId(R.id.profile_avatar_select_screen);
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new vzc(this, (lq4) null, 3), et4Var);
        nodVar.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.n.getValue()).c(strArr)) {
            s1().C();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ll6 ll6Var = new ll6();
        zv8[] zv8VarArr = p;
        zv8 zv8Var = zv8VarArr[0];
        j8e j8eVar = this.h;
        ((rq) j8eVar.m(this, zv8Var)).a(spc.d(new oq1(ll6Var, this, 2), (rq) j8eVar.m(this, zv8VarArr[0]), getViewLifecycleOwner()));
        e9i.j0(new fz6(new jz(s1().m, 13), new pod(this, null, 3), 3), getViewLifecycleScope());
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        apd apdVarS1 = s1();
        yab.i0(apdVarS1.b, ((n0c) ((xhh) apdVarS1.d.getValue())).b(), 0, new voc(apdVarS1, str, rectF, null, 10), 2);
    }

    public final FrameLayout q1() {
        return (FrameLayout) this.m.m(this, p[5]);
    }

    public final rcc r1() {
        return (rcc) this.j.m(this, p[2]);
    }

    public final apd s1() {
        return (apd) this.f.getValue();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return s1().B(lq4Var);
    }

    public ProfileEditScreen(long j, nnd nndVar, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:id", Long.valueOf(j)), new ylc("profile:type", nndVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
