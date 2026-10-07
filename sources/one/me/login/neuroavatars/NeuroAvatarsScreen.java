package one.me.login.neuroavatars;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.aac;
import defpackage.c1a;
import defpackage.ca2;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dq4;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et4;
import defpackage.fgd;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.g19;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.ieb;
import defpackage.ifh;
import defpackage.j1a;
import defpackage.j8e;
import defpackage.jeb;
import defpackage.keb;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.kwb;
import defpackage.leb;
import defpackage.lg9;
import defpackage.ll6;
import defpackage.lzf;
import defpackage.m34;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.neb;
import defpackage.ny8;
import defpackage.o65;
import defpackage.oeb;
import defpackage.oi8;
import defpackage.pdb;
import defpackage.peb;
import defpackage.qb3;
import defpackage.qdb;
import defpackage.qe7;
import defpackage.qq;
import defpackage.r8e;
import defpackage.rq;
import defpackage.s9a;
import defpackage.spc;
import defpackage.suc;
import defpackage.t3f;
import defpackage.tre;
import defpackage.uf3;
import defpackage.vv;
import defpackage.wsc;
import defpackage.xdb;
import defpackage.xeb;
import defpackage.xge;
import defpackage.xhh;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ypg;
import defpackage.yr8;
import defpackage.yw4;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0016B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lmc4;", "Lj1a;", "Lyw4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lxge;", "registrationData", "Lfgd;", "presetAvatars", "Lt3f;", "scopeId", "(Lxge;Lfgd;Lt3f;)V", "", "contactId", "Lha9;", "localAccountId", "(JLha9;)V", "dn2", "login"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NeuroAvatarsScreen extends Widget implements mc4, j1a, yw4 {
    public static final /* synthetic */ zv8[] B = {new dwd(NeuroAvatarsScreen.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), zo5.f(zfe.a, NeuroAvatarsScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(NeuroAvatarsScreen.class, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0), new dwd(NeuroAvatarsScreen.class, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new dwd(NeuroAvatarsScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(NeuroAvatarsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(NeuroAvatarsScreen.class, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(NeuroAvatarsScreen.class, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0), new dwd(NeuroAvatarsScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), new dwd(NeuroAvatarsScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0), new dwd(NeuroAvatarsScreen.class, "contactId", "getContactId()Ljava/lang/Long;", 0)};
    public final ifh A;
    public final /* synthetic */ ku6 a;
    public final ca2 b;
    public final oi8 c;
    public final ks6 d;
    public final ny8 e;
    public final j8e f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final ll6 n;
    public final ny8 o;
    public final ny8 p;
    public final xdb q;
    public final keb r;
    public final vv s;
    public final vv t;
    public final vv u;
    public final ny8 v;
    public final ExecutorService w;
    public final zsj x;
    public final peb y;
    public final yr8 z;

    /* JADX WARN: Type inference failed for: r0v27, types: [keb] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.a = new ku6(26);
        ca2 ca2Var = new ca2(m35getAccountScopeuqN4xOY());
        this.b = ca2Var;
        this.c = new oi8(0, 3, 0, null, 5);
        int i = 3;
        this.d = tre.E(this, new jeb(this, 2), new jeb(this, 3));
        this.e = ca2Var.a();
        this.f = viewBinding(R.id.oneme_login_neuro_avatars_tabs);
        this.g = viewBinding(R.id.oneme_login_neuro_avatars_avatar);
        this.h = viewBinding(R.id.oneme_login_neuro_avatars_collapsible);
        this.i = viewBinding(R.id.oneme_login_neuro_avatars_appbar);
        this.j = viewBinding(R.id.oneme_login_neuro_avatars_toolbar);
        this.k = viewBinding(R.id.oneme_login_neuro_avatars_recycler_view);
        this.l = viewBinding(R.id.oneme_login_neuro_avatars_continue_btn);
        this.m = viewBinding(R.id.oneme_login_neuro_avatars_tabs_shimmer);
        this.n = new ll6();
        this.o = ca2Var.getAccessor().d(34);
        this.p = ca2Var.getAccessor().d(231);
        this.q = new xdb(1, this);
        this.r = new qq() { // from class: keb
            @Override // defpackage.oq
            public final void R0(rq rqVar, int i2) {
                zv8[] zv8VarArr = NeuroAvatarsScreen.B;
                NeuroAvatarsScreen neuroAvatarsScreen = this.a;
                float interpolation = neuroAvatarsScreen.n.getInterpolation(Math.abs(i2) / neuroAvatarsScreen.o1().getTotalScrollRange());
                j8e j8eVar = neuroAvatarsScreen.h;
                zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                ((ViewGroup) j8eVar.m(neuroAvatarsScreen, zv8VarArr2[2])).setAlpha(1.0f - interpolation);
                ((rcc) neuroAvatarsScreen.j.m(neuroAvatarsScreen, zv8VarArr2[4])).setTitleAlpha(interpolation);
            }
        };
        this.s = new vv("registration_data_args", xge.class);
        this.t = new vv("avatars_args", fgd.class);
        this.u = new vv("contact_id_args", Long.class);
        this.v = createViewModelLazy(xeb.class, new hta(i, new jeb(this, 4)));
        ExecutorService executorServiceA = ((a2c) ca2Var.getAccessor().c(27)).a();
        this.w = executorServiceA;
        zsj zsjVar = new zsj(executorServiceA, new oeb(s1()), 8);
        this.x = zsjVar;
        this.y = new peb(zsjVar, new fz7(1, s1(), xeb.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 14));
        this.z = new yr8(i);
        this.A = new ifh(new jeb(this, 5));
        e9i.j0(new fz6(s1().o, new leb(this, null), i), getLifecycleScope());
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        xeb xebVarS1 = s1();
        RectF rectF = sucVar.a;
        Rect rect = sucVar.b;
        dq4 dq4Var = xebVarS1.b;
        qdb qdbVar = xebVarS1.c;
        yab.i0(dq4Var, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new uf3(4, null, qdbVar, rect, rectF, dq4Var), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_login_neuro_avatars_load_from_gallery_action) {
            o65.c(lg9.b.b(), ":media-picker/select/photo", null, null, 6);
        } else if (i == R.id.oneme_login_neuro_avatars_take_photo_action) {
            s1().J();
        } else if (i == R.id.oneme_login_neuro_avatars_remove_photo_action) {
            s1().B();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.d;
    }

    public final rq o1() {
        return (rq) this.i.m(this, B[3]);
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            s1().C(intent != null ? intent.getData() : null);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        n1g.N(new qb3(3, null, 7), frameLayout);
        ieb iebVar = new ieb(this, 2);
        et4 et4Var = Build.VERSION.SDK_INT >= 30 ? new et4(frameLayout.getContext()) : new neb(frameLayout.getContext());
        iebVar.invoke(et4Var);
        frameLayout.addView(et4Var);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        p1().setAdapter(null);
        p1().r0(this.y);
        r1().k(this.q);
        o1().f(this.r);
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.o.getValue()).c(strArr)) {
            s1().J();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        zv8[] zv8VarArr = B;
        final int i = 1;
        zv8 zv8Var = zv8VarArr[1];
        j8e j8eVar = this.g;
        kwb kwbVar = (kwb) j8eVar.m(this, zv8Var);
        g19 viewLifecycleOwner = getViewLifecycleOwner();
        r8e r8eVar = s1().l;
        Drawable drawable = (Drawable) this.A.getValue();
        s9a s9aVar = new s9a(16);
        s9a s9aVar2 = new s9a(17);
        i19 i19VarF = viewLifecycleOwner.f();
        n09 n09Var = n09.d;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new m34(2, null, kwbVar, drawable, s9aVar, s9aVar2), i2), tre.d0(viewLifecycleOwner));
        lzf lzfVar = s1().j;
        if (lzfVar != null) {
            e9i.j0(new fz6(n1g.v(lzfVar, getViewLifecycleOwner().f(), n09Var), new leb(null, this, 3), i2), getViewLifecycleScope());
        }
        e9i.j0(new fz6(n1g.v(s1().i, getViewLifecycleOwner().f(), n09Var), new leb(null, this, 4), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().n, getViewLifecycleOwner().f(), n09Var), new leb(null, this, 5), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().c.k, getViewLifecycleOwner().f(), n09Var), new leb(null, this, 2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().q, getViewLifecycleOwner().f(), n09Var), new leb(null, this, 1), i2), getViewLifecycleScope());
        final int i3 = 0;
        qe7.H((cyb) this.l.m(this, zv8VarArr[6]), 300L, new View.OnClickListener(this) { // from class: heb
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i3;
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                        cyb cybVar = (cyb) neuroAvatarsScreen.l.m(neuroAvatarsScreen, NeuroAvatarsScreen.B[6]);
                        cybVar.setLoading(true);
                        cybVar.setClickable(false);
                        neuroAvatarsScreen.s1().F();
                        break;
                    default:
                        zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                        if (neuroAvatarsScreen.q1() != null) {
                            ml9.b(neuroAvatarsScreen);
                            List listD = neuroAvatarsScreen.s1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr4 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(neuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(neuroAvatarsScreen);
                                    br4 parentController = neuroAvatarsScreen;
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
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        r1().a(this.q);
        o1().a(spc.d(this.r, o1(), getViewLifecycleOwner()));
        qe7.H((kwb) j8eVar.m(this, zv8VarArr[1]), 300L, new View.OnClickListener(this) { // from class: heb
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i;
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                        cyb cybVar = (cyb) neuroAvatarsScreen.l.m(neuroAvatarsScreen, NeuroAvatarsScreen.B[6]);
                        cybVar.setLoading(true);
                        cybVar.setClickable(false);
                        neuroAvatarsScreen.s1().F();
                        break;
                    default:
                        zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                        if (neuroAvatarsScreen.q1() != null) {
                            ml9.b(neuroAvatarsScreen);
                            List listD = neuroAvatarsScreen.s1().D();
                            jc4 jc4VarC = p.c(R.string.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((c79) listD).listIterator(0);
                            while (true) {
                                b79 b79Var = (b79) listIterator;
                                if (!b79Var.hasNext()) {
                                    zv8[] zv8VarArr4 = BottomSheetWidget.t;
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(neuroAvatarsScreen);
                                    confirmationBottomSheetF.setTargetController(neuroAvatarsScreen);
                                    br4 parentController = neuroAvatarsScreen;
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
                                } else {
                                    jc4VarC.a((kc4) b79Var.next());
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        zsj zsjVar = this.x;
        zsjVar.C(new ypg(this, i, zsjVar));
    }

    public final RecyclerView p1() {
        return (RecyclerView) this.k.m(this, B[5]);
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        xeb xebVarS1 = s1();
        dq4 dq4Var = xebVarS1.b;
        qdb qdbVar = xebVarS1.c;
        yab.i0(dq4Var, ((n0c) ((xhh) qdbVar.i.getValue())).b(), 0, new pdb(qdbVar, str, rect, rectF, 2, null), 2);
    }

    public final xge q1() {
        zv8 zv8Var = B[8];
        return (xge) this.s.a(this);
    }

    public final aac r1() {
        return (aac) this.f.m(this, B[0]);
    }

    public final xeb s1() {
        return (xeb) this.v.getValue();
    }

    public NeuroAvatarsScreen(xge xgeVar, fgd fgdVar, t3f t3fVar) {
        this(n1g.i(new ylc("registration_data_args", xgeVar), new ylc("avatars_args", fgdVar), new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }

    public NeuroAvatarsScreen(long j, ha9 ha9Var) {
        this(n1g.i(new ylc("contact_id_args", Long.valueOf(j)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
