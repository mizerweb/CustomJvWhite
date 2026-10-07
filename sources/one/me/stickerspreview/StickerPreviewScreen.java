package one.me.stickerspreview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import defpackage.a8g;
import defpackage.a8j;
import defpackage.amg;
import defpackage.ang;
import defpackage.bc1;
import defpackage.bdj;
import defpackage.c0a;
import defpackage.cw0;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ej9;
import defpackage.f5d;
import defpackage.fz6;
import defpackage.g4b;
import defpackage.gcc;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.h4b;
import defpackage.ha9;
import defpackage.hde;
import defpackage.hpf;
import defpackage.hr4;
import defpackage.i19;
import defpackage.ic6;
import defpackage.it3;
import defpackage.j11;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.khb;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.ml9;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.nq4;
import defpackage.ny8;
import defpackage.ogf;
import defpackage.oi8;
import defpackage.omg;
import defpackage.p90;
import defpackage.p97;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q2f;
import defpackage.q3g;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.t2g;
import defpackage.t38;
import defpackage.t3f;
import defpackage.tnh;
import defpackage.tp2;
import defpackage.ubf;
import defpackage.uw8;
import defpackage.vlg;
import defpackage.vp4;
import defpackage.vv;
import defpackage.wlg;
import defpackage.wo6;
import defpackage.wtc;
import defpackage.xbc;
import defpackage.xme;
import defpackage.xx6;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.StickerPreviewScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.util.share.ShareData;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lubf;", "Lq2f;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", ApiProtocol.PARAM_CHAT_ID, "forwardId", "Lt3f;", "chatScopeId", "Lbdj;", "entryPoint", "Lha9;", "localAccountId", "(JJJLt3f;Lbdj;Lha9;)V", "stickers-preview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickerPreviewScreen extends Widget implements vp4, ubf, q2f, mc4 {
    public static final /* synthetic */ zv8[] v = {new dwd(StickerPreviewScreen.class, "stickerId", "getStickerId()J", 0), zo5.f(zfe.a, StickerPreviewScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), new dwd(StickerPreviewScreen.class, "chatScopeId", "getChatScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(StickerPreviewScreen.class, "forwardId", "getForwardId()J", 0), new dwd(StickerPreviewScreen.class, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;", 0), new dwd(StickerPreviewScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(StickerPreviewScreen.class, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0), new dwd(StickerPreviewScreen.class, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0), new dwd(StickerPreviewScreen.class, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0), new dwd(StickerPreviewScreen.class, "stickerSetSheetContainer", "getStickerSetSheetContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new dwd(StickerPreviewScreen.class, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0), new dwd(StickerPreviewScreen.class, "sendButton", "getSendButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0)};
    public final vv a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final oi8 e;
    public final t3f f;
    public final wtc g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final dj9 k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public final xme s;
    public final xme t;
    public final xme u;

    public StickerPreviewScreen(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Long.class, 0L, "arg_key_sticker_id");
        this.a = new vv(Long.class, 0L, "arg_key_chat_id");
        this.b = new vv(t3f.class, t3f.e, "arg_key_chat_scope_id");
        this.c = new vv(Long.class, 0L, "arg_key_forward_id");
        this.d = new vv(bdj.class, null, "arg_key_entry_point");
        this.e = new oi8(0, 3, 0, new j11(3, 1, false), 5);
        this.f = new t3f("StickerPreviewScreen", null, 2);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.g = wtcVar;
        this.h = createViewModelLazy(amg.class, new t2g(4, new vlg(this, 0)));
        this.i = wtcVar.getAccessor().d(18);
        this.j = wtcVar.getAccessor().d(365);
        this.k = new dj9();
        this.l = viewBinding(R.id.oneme_stickers_preview_toolbar);
        this.m = viewBinding(R.id.oneme_stickers_preview_content_container);
        this.n = viewBinding(R.id.oneme_stickers_preview_sticker_container);
        this.o = viewBinding(R.id.oneme_stickers_preview_action_favorite);
        this.p = viewBinding(R.id.oneme_stickers_preview_stickers_set_container);
        this.q = Widget.childRouter$default(this, R.id.oneme_stickers_preview_stickers_set_container, null, 2, null);
        this.r = viewBinding(R.id.oneme_stickers_preview_action_send);
        this.s = p90.M(new vlg(this, 1));
        this.t = p90.M(new vlg(this, 2));
        this.u = p90.M(new vlg(this, 3));
        amg amgVarS1 = s1();
        zv8 zv8Var = v[0];
        amgVarS1.G(((Number) vvVar.a(this)).longValue());
        amg amgVarS2 = s1();
        if (amgVarS2.c == 0) {
            return;
        }
        amgVarS2.C.B(amgVarS2, amg.G[1], yab.h0(amgVarS2.b, ((n0c) amgVarS2.e).b(), 2, new hpf(amgVarS2, null, 6)));
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        amg amgVarS1 = s1();
        ic6 ic6Var = amgVarS1.t;
        r8e r8eVar = amgVarS1.A;
        if (i == R.id.send_context_menu_action_scheduled_send) {
            amgVarS1.I();
            return;
        }
        if (i == R.id.oneme_stickers_preview_action_forward_set) {
            ShareData shareData = new ShareData(0, null, null, null, null, null, null, null, 255, null);
            shareData.type = 8;
            omg omgVar = (omg) r8eVar.a.getValue();
            shareData.text = omgVar != null ? omgVar.j : null;
            a8j.x(ic6Var, new p97(shareData));
            return;
        }
        if (i == R.id.oneme_stickers_preview_action_copy_link) {
            omg omgVar2 = (omg) r8eVar.a.getValue();
            String str = omgVar2 != null ? omgVar2.j : null;
            if (str == null || str.length() == 0) {
                return;
            }
            it3.a(amgVarS1.f, str);
            if (it3.b()) {
                a8j.x(ic6Var, new q3g(R.drawable.copy_outline_24, new tnh(R.string.share_copy_success)));
                return;
            }
            return;
        }
        if (i == R.id.oneme_stickers_preview_action_edit_set) {
            omg omgVar3 = (omg) r8eVar.a.getValue();
            if (omgVar3 == null) {
                gm0.Y(amg.class.getName(), "stickerSet id is null, can't edit");
                return;
            }
            long j = omgVar3.a;
            ic6 ic6Var2 = amgVarS1.s;
            ang angVar = ang.b;
            long jK = ((f5d) ((wo6) amgVarS1.m.getValue())).k();
            angVar.getClass();
            StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
            sb.append(jK);
            sb.append("&start_param=");
            bc1.q(c0a.m(j, "&entry_point=url", sb), ic6Var2);
        }
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        amg amgVarS1 = s1();
        if (i == R.id.oneme_stickers_confirm_send_message_positive) {
            a8j.x(amgVarS1.t, ogf.a);
        } else {
            amgVarS1.getClass();
        }
    }

    @Override // defpackage.q2f
    public final void g(long j, long j2) {
        g4b g4bVarJ = ((h4b) this.i.getValue()).J(7);
        amg amgVarS1 = s1();
        if (j == 100) {
            amgVarS1.E(g4bVarJ, Long.valueOf(j2));
        } else {
            amgVarS1.getClass();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.e;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScopeId, reason: from getter */
    public final t3f getD() {
        return this.f;
    }

    public final long o1() {
        zv8 zv8Var = v[1];
        return ((Number) this.a.a(this)).longValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
        q1().b = null;
        q1().a(this.k);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        if (isAttached()) {
            ej9 ej9VarQ1 = q1();
            dj9 dj9Var = this.k;
            if (dj9Var == null) {
                weakReference = null;
            } else {
                ej9VarQ1.getClass();
                weakReference = new WeakReference(dj9Var);
            }
            ej9VarQ1.b = weakReference;
            q1().b(dj9Var);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (currentFocus = window.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        int i = uw8.a;
        if (uw8.b(uw8.c)) {
            ml9.d(currentFocus);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        hr4 hr4Var2 = hr4.e;
        WeakReference weakReference = null;
        dj9 dj9Var = this.k;
        if (hr4Var != hr4Var2 && hr4Var != hr4.c) {
            if (hr4Var == hr4.d || hr4Var == hr4.f) {
                q1().b = null;
                q1().a(dj9Var);
                return;
            }
            return;
        }
        ej9 ej9VarQ1 = q1();
        if (dj9Var != null) {
            ej9VarQ1.getClass();
            weakReference = new WeakReference(dj9Var);
        }
        ej9VarQ1.b = weakReference;
        q1().b(dj9Var);
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
    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(Color.parseColor("#CC000000"));
        final int i = 0;
        qe7.H(frameLayout, 300L, new View.OnClickListener(this) { // from class: ulg
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = StickerPreviewScreen.v;
                        stickerPreviewScreen.getRouter().D();
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                        amg amgVarS1 = stickerPreviewScreen.s1();
                        tlg tlgVar = (tlg) amgVarS1.w.a.getValue();
                        if (tlgVar != null && !tlgVar.equals(tlg.n)) {
                            sgg sggVar = amgVarS1.E;
                            if (sggVar == null || !sggVar.isActive()) {
                                amgVarS1.E = a8j.t(amgVarS1, ((n0c) amgVarS1.e).b(), new wd9(tlgVar, amgVarS1, (lq4) null, 14), 2);
                            }
                            break;
                        }
                        break;
                    case 2:
                        zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                        stickerPreviewScreen.getRouter().D();
                        ang angVar = ang.b;
                        vv vvVar = stickerPreviewScreen.c;
                        zv8 zv8Var = StickerPreviewScreen.v[3];
                        o65.c(angVar.b(), zo5.j(((Number) vvVar.a(stickerPreviewScreen)).longValue(), ":chats/forward?messages_ids="), null, null, 6);
                        break;
                    default:
                        zv8[] zv8VarArr4 = StickerPreviewScreen.v;
                        g4b g4bVarJ = ((h4b) stickerPreviewScreen.i.getValue()).J(2);
                        amg amgVarS2 = stickerPreviewScreen.s1();
                        zv8[] zv8VarArr5 = amg.G;
                        amgVarS2.E(g4bVarJ, null);
                        break;
                }
            }
        });
        View tp2Var = new tp2(frameLayout.getContext());
        tp2Var.setId(R.id.oneme_stickers_preview_stickers_set_container);
        tp2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tp2Var.setAlpha(0.0f);
        frameLayout.addView(tp2Var);
        rcc rccVar = new rcc(frameLayout.getContext());
        rccVar.setId(R.id.oneme_stickers_preview_toolbar);
        int iK = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iK);
        layoutParams.gravity = 48;
        layoutParams.topMargin = iK;
        rccVar.setLayoutParams(layoutParams);
        a8g a8gVar = pq3.j;
        rccVar.setCustomTheme(a8gVar.l(rccVar).b);
        rccVar.setBackground(null);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new ptf(7, this)));
        frameLayout.addView(rccVar);
        int iK2 = gm0.K(160.0f * yl5.d().getDisplayMetrics().density);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(R.id.oneme_stickers_preview_content_container);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        View frameLayout3 = new FrameLayout(frameLayout2.getContext());
        frameLayout3.setId(R.id.oneme_stickers_preview_sticker_container);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, iK2));
        frameLayout2.addView(frameLayout3);
        final int i2 = 1;
        if (r1()) {
            t38 t38Var = new t38(frameLayout2.getContext());
            t38Var.setId(R.id.oneme_stickers_preview_action_send);
            int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 120.0f);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iK3, -2);
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = zo5.b(20.0f, yl5.d().getDisplayMetrics().density, iK2);
            if (!p1()) {
                iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 60.0f);
            }
            layoutParams3.leftMargin = iK3;
            t38Var.setLayoutParams(layoutParams3);
            t38Var.setIcon(R.drawable.icon_arrow_up);
            t38Var.setLabel(R.string.oneme_stickers_preview_action_send_title);
            t38Var.b.setAppearance(zxb.PRIMARY_CONTRAST);
            t38Var.setOnLongClickListener(new cw0(9, this));
            final int i3 = 3;
            qe7.H(t38Var, 300L, new View.OnClickListener(this) { // from class: ulg
                public final /* synthetic */ StickerPreviewScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    StickerPreviewScreen stickerPreviewScreen = this.b;
                    switch (i4) {
                        case 0:
                            zv8[] zv8VarArr = StickerPreviewScreen.v;
                            stickerPreviewScreen.getRouter().D();
                            break;
                        case 1:
                            zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                            amg amgVarS1 = stickerPreviewScreen.s1();
                            tlg tlgVar = (tlg) amgVarS1.w.a.getValue();
                            if (tlgVar != null && !tlgVar.equals(tlg.n)) {
                                sgg sggVar = amgVarS1.E;
                                if (sggVar == null || !sggVar.isActive()) {
                                    amgVarS1.E = a8j.t(amgVarS1, ((n0c) amgVarS1.e).b(), new wd9(tlgVar, amgVarS1, (lq4) null, 14), 2);
                                }
                                break;
                            }
                            break;
                        case 2:
                            zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                            stickerPreviewScreen.getRouter().D();
                            ang angVar = ang.b;
                            vv vvVar = stickerPreviewScreen.c;
                            zv8 zv8Var = StickerPreviewScreen.v[3];
                            o65.c(angVar.b(), zo5.j(((Number) vvVar.a(stickerPreviewScreen)).longValue(), ":chats/forward?messages_ids="), null, null, 6);
                            break;
                        default:
                            zv8[] zv8VarArr4 = StickerPreviewScreen.v;
                            g4b g4bVarJ = ((h4b) stickerPreviewScreen.i.getValue()).J(2);
                            amg amgVarS2 = stickerPreviewScreen.s1();
                            zv8[] zv8VarArr5 = amg.G;
                            amgVarS2.E(g4bVarJ, null);
                            break;
                    }
                }
            });
            frameLayout2.addView(t38Var);
        }
        t38 t38Var2 = new t38(frameLayout2.getContext());
        t38Var2.setId(R.id.oneme_stickers_preview_action_favorite);
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 120.0f);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = zo5.b(20.0f, yl5.d().getDisplayMetrics().density, iK2);
        layoutParams4.rightMargin = (p1() || !r1()) ? 0 : gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
        final int i4 = 2;
        if (!r1() && p1()) {
            i = iK4 / 2;
        }
        layoutParams4.leftMargin = i;
        t38Var2.setLayoutParams(layoutParams4);
        t38Var2.setIcon(R.drawable.icon_bookmark);
        t38Var2.setLabel(R.string.oneme_stickers_preview_action_favorite_title);
        t38Var2.b.setCustomTheme(a8gVar.l(t38Var2).b);
        qe7.H(t38Var2, 300L, new View.OnClickListener(this) { // from class: ulg
            public final /* synthetic */ StickerPreviewScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                StickerPreviewScreen stickerPreviewScreen = this.b;
                switch (i5) {
                    case 0:
                        zv8[] zv8VarArr = StickerPreviewScreen.v;
                        stickerPreviewScreen.getRouter().D();
                        break;
                    case 1:
                        zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                        amg amgVarS1 = stickerPreviewScreen.s1();
                        tlg tlgVar = (tlg) amgVarS1.w.a.getValue();
                        if (tlgVar != null && !tlgVar.equals(tlg.n)) {
                            sgg sggVar = amgVarS1.E;
                            if (sggVar == null || !sggVar.isActive()) {
                                amgVarS1.E = a8j.t(amgVarS1, ((n0c) amgVarS1.e).b(), new wd9(tlgVar, amgVarS1, (lq4) null, 14), 2);
                            }
                            break;
                        }
                        break;
                    case 2:
                        zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                        stickerPreviewScreen.getRouter().D();
                        ang angVar = ang.b;
                        vv vvVar = stickerPreviewScreen.c;
                        zv8 zv8Var = StickerPreviewScreen.v[3];
                        o65.c(angVar.b(), zo5.j(((Number) vvVar.a(stickerPreviewScreen)).longValue(), ":chats/forward?messages_ids="), null, null, 6);
                        break;
                    default:
                        zv8[] zv8VarArr4 = StickerPreviewScreen.v;
                        g4b g4bVarJ = ((h4b) stickerPreviewScreen.i.getValue()).J(2);
                        amg amgVarS2 = stickerPreviewScreen.s1();
                        zv8[] zv8VarArr5 = amg.G;
                        amgVarS2.E(g4bVarJ, null);
                        break;
                }
            }
        });
        frameLayout2.addView(t38Var2);
        if (p1()) {
            t38 t38Var3 = new t38(frameLayout2.getContext());
            t38Var3.setId(R.id.oneme_stickers_preview_action_forward);
            int iK5 = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iK5, -2);
            layoutParams5.gravity = 1;
            layoutParams5.topMargin = zo5.b(20.0f, yl5.d().getDisplayMetrics().density, iK2);
            if (!r1()) {
                iK5 /= 2;
            }
            layoutParams5.rightMargin = iK5;
            t38Var3.setLayoutParams(layoutParams5);
            t38Var3.setIcon(R.drawable.icon_forward);
            t38Var3.setLabel(R.string.oneme_stickers_preview_action_forward_title);
            t38Var3.b.setCustomTheme(a8gVar.l(t38Var3).b);
            qe7.H(t38Var3, 300L, new View.OnClickListener(this) { // from class: ulg
                public final /* synthetic */ StickerPreviewScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i4;
                    StickerPreviewScreen stickerPreviewScreen = this.b;
                    switch (i5) {
                        case 0:
                            zv8[] zv8VarArr = StickerPreviewScreen.v;
                            stickerPreviewScreen.getRouter().D();
                            break;
                        case 1:
                            zv8[] zv8VarArr2 = StickerPreviewScreen.v;
                            amg amgVarS1 = stickerPreviewScreen.s1();
                            tlg tlgVar = (tlg) amgVarS1.w.a.getValue();
                            if (tlgVar != null && !tlgVar.equals(tlg.n)) {
                                sgg sggVar = amgVarS1.E;
                                if (sggVar == null || !sggVar.isActive()) {
                                    amgVarS1.E = a8j.t(amgVarS1, ((n0c) amgVarS1.e).b(), new wd9(tlgVar, amgVarS1, (lq4) null, 14), 2);
                                }
                                break;
                            }
                            break;
                        case 2:
                            zv8[] zv8VarArr3 = StickerPreviewScreen.v;
                            stickerPreviewScreen.getRouter().D();
                            ang angVar = ang.b;
                            vv vvVar = stickerPreviewScreen.c;
                            zv8 zv8Var = StickerPreviewScreen.v[3];
                            o65.c(angVar.b(), zo5.j(((Number) vvVar.a(stickerPreviewScreen)).longValue(), ":chats/forward?messages_ids="), null, null, 6);
                            break;
                        default:
                            zv8[] zv8VarArr4 = StickerPreviewScreen.v;
                            g4b g4bVarJ = ((h4b) stickerPreviewScreen.i.getValue()).J(2);
                            amg amgVarS2 = stickerPreviewScreen.s1();
                            zv8[] zv8VarArr5 = amg.G;
                            amgVarS2.E(g4bVarJ, null);
                            break;
                    }
                }
            });
            frameLayout2.addView(t38Var3);
        }
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        q1().b = null;
        this.k.b();
        khb khbVar = khb.k;
        this.s.b = khbVar;
        this.t.b = khbVar;
        this.u.b = khbVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        xx6 xx6VarI = e9i.I(new hde(s1().A, 7));
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(xx6VarI, i19VarF, n09Var), new wlg(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().w, getViewLifecycleOwner().f(), n09Var), new wlg(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().y, getViewLifecycleOwner().f(), n09Var), new j8g((lq4) null, (rcc) this.l.m(this, v[5]), 7), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().s, getViewLifecycleOwner().f(), n09Var), new wlg(null, this, 2), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().t, getViewLifecycleOwner().f(), n09Var), new wlg(null, this, 3), 3), getViewLifecycleScope());
    }

    public final boolean p1() {
        zv8 zv8Var = v[3];
        return ((Number) this.c.a(this)).longValue() > 0;
    }

    public final ej9 q1() {
        return (ej9) this.j.getValue();
    }

    public final boolean r1() {
        return o1() > 0;
    }

    public final amg s1() {
        return (amg) this.h.getValue();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        amg amgVarS1 = s1();
        zv8 zv8Var = v[2];
        return amgVarS1.F((t3f) this.b.a(this), (nq4) lq4Var);
    }

    public StickerPreviewScreen(long j, long j2, long j3, t3f t3fVar, bdj bdjVar, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("arg_key_sticker_id", Long.valueOf(j)), new ylc("arg_key_chat_id", Long.valueOf(j2)), new ylc("arg_key_forward_id", Long.valueOf(j3)), new ylc("arg_key_chat_scope_id", t3fVar), new ylc("arg_key_entry_point", bdjVar)));
    }
}
