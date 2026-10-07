package one.me.settings;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.ae9;
import defpackage.apf;
import defpackage.b2f;
import defpackage.bc1;
import defpackage.bpf;
import defpackage.c1a;
import defpackage.ctf;
import defpackage.dq4;
import defpackage.dtd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.et4;
import defpackage.f5d;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gtf;
import defpackage.ha9;
import defpackage.hve;
import defpackage.i19;
import defpackage.i65;
import defpackage.ic6;
import defpackage.ifh;
import defpackage.j1a;
import defpackage.j6b;
import defpackage.j8e;
import defpackage.je9;
import defpackage.jtf;
import defpackage.k6b;
import defpackage.ktf;
import defpackage.kuf;
import defpackage.lfe;
import defpackage.lk9;
import defpackage.lq4;
import defpackage.ltf;
import defpackage.lvb;
import defpackage.lve;
import defpackage.mc4;
import defpackage.mtf;
import defpackage.mwf;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nm0;
import defpackage.nuf;
import defpackage.ny8;
import defpackage.o65;
import defpackage.occ;
import defpackage.oi8;
import defpackage.ouk;
import defpackage.p;
import defpackage.p3c;
import defpackage.p6f;
import defpackage.pof;
import defpackage.psf;
import defpackage.qh1;
import defpackage.qq;
import defpackage.qsf;
import defpackage.r7;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rsf;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.sm8;
import defpackage.sof;
import defpackage.spc;
import defpackage.suc;
import defpackage.tld;
import defpackage.tvf;
import defpackage.ul9;
import defpackage.vo8;
import defpackage.voc;
import defpackage.wo6;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.xt4;
import defpackage.y6b;
import defpackage.yab;
import defpackage.ylc;
import defpackage.ypl;
import defpackage.yt4;
import defpackage.yw4;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zv8;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.sections.SectionRecyclerWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lqsf;", "Lqq;", "Lmc4;", "Lj1a;", "Lyw4;", "Lp6f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsListScreen extends SectionRecyclerWidget implements qsf, qq, mc4, j1a, yw4, p6f {
    public static final /* synthetic */ zv8[] r = {new dwd(SettingsListScreen.class, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), zo5.f(zfe.a, SettingsListScreen.class, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final wtc d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ExecutorService h;
    public final ny8 i;
    public final oi8 j;
    public final ifh k;
    public final j8e l;
    public final j8e m;
    public final ny8 n;
    public rq o;
    public final rsf p;
    public final qh1 q;

    public SettingsListScreen(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.d = wtcVar;
        this.e = wtcVar.getAccessor().d(769);
        this.f = wtcVar.getAccessor().d(34);
        this.g = wtcVar.getAccessor().d(231);
        ExecutorService executorServiceA = ((a2c) wtcVar.getAccessor().c(27)).a();
        this.h = executorServiceA;
        this.i = createViewModelLazy(bpf.class, new ztd(23, new ktf(this, 0)));
        this.j = oi8.f;
        this.k = new ifh(new ktf(this, 1));
        this.l = viewBinding(R.id.oneme_settings_topbar);
        this.m = viewBinding(R.id.oneme_settings_toolbar);
        int i = 3;
        this.n = rx8.P(3, new ktf(this, 2));
        this.p = new rsf(this, executorServiceA);
        this.q = new qh1(executorServiceA, 4);
        r8e r8eVar = t1().C;
        i19 i19VarF = this.lifecycleOwner.f();
        n09 n09Var = n09.d;
        lq4 lq4Var = null;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new mtf(this, lq4Var, 0), i), getLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().E, this.lifecycleOwner.f(), n09Var), new mtf(this, lq4Var, 1), i), getLifecycleScope());
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        bpf bpfVarT1 = t1();
        RectF rectF = sucVar.a;
        dq4 dq4Var = bpfVarT1.b;
        xt4 xt4VarB = ((n0c) bpfVarT1.D()).b();
        yt4 yt4VarC = bpfVarT1.C();
        xt4VarB.getClass();
        yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarC), 0, new dtd(bpfVarT1, rectF, null, 19), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.oq
    public final void R0(rq rqVar, int i) {
        float fAbs = Math.abs(i) / rqVar.getTotalScrollRange();
        ((rcc) this.m.m(this, r[1])).setTitleAlpha(fAbs);
        s1().setAlpha(1.0f - fAbs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [br4] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // defpackage.qsf
    public final boolean U(long j) {
        Object next;
        View view;
        ha9 ha9VarA = ypl.a(j);
        if (ha9VarA != null) {
            rsf rsfVar = this.p;
            Iterator it = rsfVar.d.f.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((psf) next).getItemId() != j);
            ctf ctfVar = next instanceof ctf ? (ctf) next : null;
            if (ctfVar != null) {
                RecyclerView recyclerViewP1 = p1();
                Iterator it2 = rsfVar.d.f.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((psf) it2.next()).getItemId() == j) {
                        break;
                    }
                    i++;
                }
                lfe lfeVarK = recyclerViewP1.K(i);
                if (lfeVarK == null || (view = lfeVarK.a) == null) {
                    view = null;
                } else {
                    view.setId(Long.hashCode(j));
                }
                zv8[] zv8VarArr = BottomSheetWidget.t;
                CharSequence charSequenceB = ctfVar.c.b(getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                AccountActionsBottomSheet accountActionsBottomSheet = new AccountActionsBottomSheet(ha9VarA, charSequenceB, view);
                accountActionsBottomSheet.setTargetController(this);
                ?? parentController = this;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hve hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 != null) {
                    lve lveVar = new lve(accountActionsBottomSheet, null, null, null, false, -1);
                    p.k(false, lveVar, true, "account_actions");
                    hveVarU1.I(lveVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p6f
    public final void U0() {
        a8j.x(t1().A, gtf.a);
    }

    @Override // defpackage.qsf
    public final void c(long j) {
        Object i65Var;
        Object i65Var2;
        bpf bpfVarT1 = t1();
        ha9 ha9VarA = ypl.a(j);
        lq4 lq4Var = null;
        if (ha9VarA != null) {
            if (ha9VarA.equals(bpfVarT1.c)) {
                gm0.Y(bpf.class.getName(), "switch to self account");
                return;
            }
            r7 r7Var = r7.a;
            if (!r7.c().containsKey(ha9VarA)) {
                gm0.Y(bpf.class.getName(), "account not found");
                return;
            }
            ((k6b) bpfVarT1.x.getValue()).a(2, 2, Long.valueOf(((s7f) new j6b(r7.d(ha9VarA)).a()).t()));
            o65.c(jtf.b.b(), ":chat-list", null, ha9VarA, 2);
            return;
        }
        bpfVarT1.getClass();
        if (j == pof.FOLDERS.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/folder-list");
        } else if (j == pof.APPEARANCE.a) {
            ((nm0) bpfVarT1.t.getValue()).b();
            jtf.b.getClass();
            i65Var2 = new i65(":settings/appearance");
        } else if (j == pof.LANGUAGE.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/locale");
        } else if (j == pof.NOTIFICATIONS.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/notifications");
        } else if (j == pof.PRIVACY.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/privacy");
        } else if (j == pof.DEVICES.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/devices");
        } else if (j == pof.MESSAGES.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/messages");
        } else if (j == pof.SUPPORT.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":webview/faq");
        } else if (j == pof.BATTERY.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/battery");
        } else if (j == pof.MEDIA.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/media");
        } else if (j == pof.ABOUT.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":settings/aboutapp");
        } else if (j == pof.CONTACT_LIST.a) {
            jtf.b.getClass();
            i65Var2 = new i65(":contact-list");
        } else {
            if (j == pof.INVITE_FRIENDS.a) {
                p3c p3cVar = bpfVarT1.H;
                zv8[] zv8VarArr = bpf.Y;
                vo8 vo8Var = (vo8) p3cVar.m(bpfVarT1, zv8VarArr[0]);
                if (vo8Var == null || !vo8Var.isActive()) {
                    ((sm8) bpfVarT1.o.getValue()).b();
                    lk9 lk9VarC = ((n0c) bpfVarT1.D()).c();
                    yt4 yt4VarC = bpfVarT1.C();
                    lk9VarC.getClass();
                    bpfVarT1.H.B(bpfVarT1, zv8VarArr[0], a8j.t(bpfVarT1, lvb.x0(lk9VarC, yt4VarC), new voc(bpfVarT1, lq4Var, 28), 2));
                    return;
                }
                return;
            }
            int i = 4;
            if (j == pof.SAVED_MESSAGES.a) {
                xt4 xt4VarA = ((n0c) bpfVarT1.D()).a();
                yt4 yt4VarC2 = bpfVarT1.C();
                xt4VarA.getClass();
                a8j.t(bpfVarT1, lvb.x0(xt4VarA, yt4VarC2), new apf(bpfVarT1, lq4Var, i), 2);
                return;
            }
            if (j == pof.MAX_BUSINESS.a) {
                if (((f5d) ((wo6) bpfVarT1.q.getValue())).f().length() == 0) {
                    String name = bpf.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null) {
                        return;
                    }
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Link for opening business page in browser is empty", null);
                        return;
                    }
                    return;
                }
                Uri uri = Uri.parse(((f5d) ((wo6) bpfVarT1.q.getValue())).f());
                tvf tvfVar = (tvf) bpfVarT1.u.getValue();
                tvfVar.getClass();
                ul9 ul9Var = new ul9();
                ul9Var.put("buttonName", "max_for_business");
                ae9.k((ae9) tvfVar.a.getValue(), "CLICK", "profile_button_click", ouk.a(new ylc("source_meta", ul9Var.b())), 8);
                i65Var = new kuf(uri);
            } else {
                if (j == pof.ADD_PROFILE.a) {
                    ((k6b) bpfVarT1.x.getValue()).a(1, 2, null);
                    jtf.b.b().b(":login", n1g.i(new ylc("force_push", "true")), ((y6b) bpfVarT1.w.getValue()).f());
                    return;
                }
                sof sofVar = (sof) bpfVarT1.J.f(j);
                if (sofVar == null) {
                    return;
                }
                Long l = sofVar.c;
                String str = sofVar.d;
                if (l == null) {
                    if (str != null) {
                        o65.c(jtf.b.b(), ":link-intercept", n1g.i(new ylc("link", Uri.parse(str))), null, 4);
                        return;
                    }
                    return;
                }
                jtf jtfVar = jtf.b;
                long jLongValue = l.longValue();
                String str2 = sofVar.e;
                jtfVar.getClass();
                StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
                sb.append(jLongValue);
                sb.append("&entry_point=settings");
                if (str2 != null && str2.length() != 0) {
                    sb.append("&start_param=");
                    sb.append(str2);
                }
                i65Var = new i65(sb.toString());
            }
            i65Var2 = i65Var;
        }
        a8j.x(bpfVarT1.z, i65Var2);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        bpf bpfVarT1 = t1();
        ic6 ic6Var = bpfVarT1.z;
        if (i != R.id.oneme_settings_change_avatar_upload_from_neuroavatars) {
            if (i == R.id.oneme_settings_change_avatar_upload_from_gallery) {
                a8j.x(ic6Var, nuf.b);
                return;
            } else {
                if (i == R.id.oneme_settings_change_avatar_upload_from_camera) {
                    bpfVarT1.G();
                    return;
                }
                return;
            }
        }
        Long lE = bpfVarT1.E();
        if (lE != null) {
            long jLongValue = lE.longValue();
            jtf.b.getClass();
            bc1.q(":neuro-avatars?id=" + jLongValue, ic6Var);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getJ() {
        return this.j;
    }

    @Override // defpackage.qsf
    public final void l(long j, boolean z) {
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: o1, reason: from getter */
    public final qh1 getQ() {
        return this.q;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            bpf bpfVarT1 = t1();
            lq4 lq4Var = null;
            Uri data = intent != null ? intent.getData() : null;
            dq4 dq4Var = bpfVarT1.b;
            xt4 xt4VarB = ((n0c) bpfVarT1.D()).b();
            yt4 yt4VarC = bpfVarT1.C();
            xt4VarB.getClass();
            yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarC), 0, new b2f(bpfVarT1, data, lq4Var, 1), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        if (getView() != null) {
            bpf bpfVarT1 = t1();
            ((wsc) bpfVarT1.k.getValue()).d();
            bpfVarT1.B();
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        bpf bpfVarT1 = t1();
        ((wsc) bpfVarT1.k.getValue()).d();
        bpfVarT1.B();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ltf ltfVar = new ltf(this, 0);
        et4 et4Var = new et4(getContext());
        et4Var.setId(R.id.oneme_settings_container);
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new tld(3, null, 1), et4Var);
        ltfVar.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.f.getValue()).c(strArr)) {
            t1().G();
        }
        bpf bpfVarT1 = t1();
        ((wsc) bpfVarT1.k.getValue()).d();
        bpfVarT1.B();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        rq rqVar = this.o;
        if (rqVar != null) {
            rqVar.a(spc.d(this, rqVar, getViewLifecycleOwner()));
        }
        int i = 0;
        int i2 = 0;
        s1().setAvatarClickedListener(new occ(i2, t1(), bpf.class, "openUserAvatars", "openUserAvatars()V", i, 3));
        s1().setNicknameClickListener(new occ(i2, t1(), bpf.class, "copyProfileLink", "copyProfileLink()V", i, 4));
        s1().setUserPhoneClickListener(new occ(i2, t1(), bpf.class, "copyUserPhone", "copyUserPhone()V", i, 5));
        int i3 = 3;
        e9i.j0(new fz6(n1g.v(t1().z, this.lifecycleOwner.f(), n09.e), new mtf(this, null, i3), i3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(t1().A, getViewLifecycleOwner().f(), n09.d), new mtf(null, this), i3), getViewLifecycleScope());
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        t1().F(str, rectF);
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final rsf getP() {
        return this.p;
    }

    public final mwf s1() {
        return (mwf) this.l.m(this, r[0]);
    }

    public final bpf t1() {
        return (bpf) this.i.getValue();
    }

    public SettingsListScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
