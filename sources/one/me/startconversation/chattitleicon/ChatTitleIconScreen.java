package one.me.startconversation.chattitleicon;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import defpackage.a8j;
import defpackage.bc1;
import defpackage.bi5;
import defpackage.c1a;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f00;
import defpackage.fz6;
import defpackage.fze;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j1a;
import defpackage.jac;
import defpackage.jhg;
import defpackage.ks6;
import defpackage.kwb;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.mf3;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o65;
import defpackage.ohg;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.pf3;
import defpackage.qf3;
import defpackage.qq2;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.suc;
import defpackage.t20;
import defpackage.tre;
import defpackage.vv;
import defpackage.wf3;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.yab;
import defpackage.ylc;
import defpackage.yw4;
import defpackage.za2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Lj1a;", "Lyw4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Ljhg;", "createType", "Lha9;", "localAccountId", "([JLjhg;Lha9;)V", "start-conversation"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatTitleIconScreen extends Widget implements mc4, j1a, yw4 {
    public static final /* synthetic */ zv8[] q = {new dwd(ChatTitleIconScreen.class, "ids", "getIds()[J", 0), zo5.f(zfe.a, ChatTitleIconScreen.class, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), new dwd(ChatTitleIconScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ChatTitleIconScreen.class, "hint", "getHint()Landroid/widget/TextView;", 0), new dwd(ChatTitleIconScreen.class, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(ChatTitleIconScreen.class, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(ChatTitleIconScreen.class, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0), new dwd(ChatTitleIconScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final oi8 a;
    public final wtc b;
    public final ifh c;
    public final vv d;
    public final vv e;
    public final ks6 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ow0 j;
    public final ow0 k;
    public final ow0 l;
    public final ow0 m;
    public final ow0 n;
    public bi5 o;
    public final ow0 p;

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = new ifh(new mf3(this, 0));
        this.d = new vv(long[].class, new long[0], "ids");
        this.e = new vv("create_type", jhg.class);
        this.f = tre.G(this, new mf3(this, 2));
        this.g = createViewModelLazy(wf3.class, new qq2(27, new za2(this, 17, bundle)));
        this.h = wtcVar.getAccessor().d(34);
        this.i = wtcVar.getAccessor().d(231);
        this.j = binding(new mf3(this, 3));
        this.k = binding(new mf3(this, 4));
        this.l = binding(new mf3(this, 5));
        this.m = binding(new mf3(this, 6));
        this.n = binding(new mf3(this, 7));
        this.p = binding(new mf3(this, 8));
    }

    public static final kwb o1(ChatTitleIconScreen chatTitleIconScreen) {
        ow0 ow0Var = chatTitleIconScreen.l;
        zv8 zv8Var = q[4];
        return (kwb) ow0Var.getValue();
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        wf3 wf3VarS1 = s1();
        yab.i0(wf3VarS1.b, ((n0c) wf3VarS1.C()).b(), 0, new fze(wf3VarS1, sucVar.a, sucVar.b, null, 18), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        if (i == R.id.oneme_startconversation_chat_titleicon_avatars_load_from_gallery_action) {
            ohg ohgVar = ohg.b;
            ohgVar.getClass();
            o65.c(ohgVar.b(), ":media-picker/select/photo", null, null, 6);
        } else if (i == R.id.oneme_startconversation_chat_titleicon_avatars_take_photo_action) {
            s1().E();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getF() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.f;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            wf3 wf3VarS1 = s1();
            a8j.t(wf3VarS1, ((n0c) wf3VarS1.C()).b(), new t20(wf3VarS1, intent != null ? intent.getData() : null, (lq4) null, 10), 2);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        jac.o(p1());
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        zv8 zv8Var = q[2];
        linearLayoutJ.addView((rcc) this.j.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayoutJ.getContext());
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        nestedScrollView.setFillViewport(true);
        pf3 pf3Var = new pf3(this, 1);
        wf4 wf4Var = new wf4(nestedScrollView.getContext());
        wf4Var.setId(R.id.oneme_startconversation_chat_titleicon_constraint_layout);
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        pf3Var.invoke(wf4Var);
        nestedScrollView.addView(wf4Var);
        linearLayoutJ.addView(nestedScrollView);
        linearLayoutJ.addView(q1());
        return linearLayoutJ;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        bi5 bi5Var = this.o;
        if (bi5Var != null) {
            bi5Var.a();
        }
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((wsc) this.h.getValue()).c(strArr)) {
            s1().E();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = s1().q;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new qf3(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(s1().r, getViewLifecycleOwner().f(), n09Var), new qf3(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(s1().s, new qf3(this, null), 3), getLifecycleScope());
    }

    public final jac p1() {
        zv8 zv8Var = q[5];
        return (jac) this.m.getValue();
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        wf3 wf3VarS1 = s1();
        wf3VarS1.getClass();
        a8j.t(wf3VarS1, null, new f00(21, null, wf3VarS1, str, rect, rectF), 3);
    }

    public final cyb q1() {
        zv8 zv8Var = q[7];
        return (cyb) this.p.getValue();
    }

    public final jhg r1() {
        zv8 zv8Var = q[1];
        return (jhg) this.e.a(this);
    }

    public final wf3 s1() {
        return (wf3) this.g.getValue();
    }

    public ChatTitleIconScreen(long[] jArr, jhg jhgVar, ha9 ha9Var) {
        this(n1g.i(new ylc("ids", jArr), new ylc("create_type", jhgVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
