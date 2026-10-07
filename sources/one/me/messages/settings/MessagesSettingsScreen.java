package one.me.messages.settings;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8g;
import defpackage.bwa;
import defpackage.c7k;
import defpackage.cka;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e6e;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.h;
import defpackage.h7e;
import defpackage.ha9;
import defpackage.hta;
import defpackage.iua;
import defpackage.j8e;
import defpackage.k36;
import defpackage.ks6;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oo6;
import defpackage.ova;
import defpackage.pq3;
import defpackage.qb3;
import defpackage.qz9;
import defpackage.rcc;
import defpackage.rva;
import defpackage.s9a;
import defpackage.sbf;
import defpackage.tre;
import defpackage.vqa;
import defpackage.w8;
import defpackage.wbc;
import defpackage.wv7;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/settings/MessagesSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "message-settings"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MessagesSettingsScreen extends Widget {
    public static final /* synthetic */ zv8[] p = {new dwd(MessagesSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), zo5.f(zfe.a, MessagesSettingsScreen.class, "containerLinear", "getContainerLinear()Landroid/view/View;", 0), new dwd(MessagesSettingsScreen.class, "effectsView", "getEffectsView()Lru/ok/onechat/reactions/ui/animation/ReactionEffectsView;", 0), new dwd(MessagesSettingsScreen.class, "highlightOverlayView", "getHighlightOverlayView()Lone/me/messages/settings/HighlightOverlayView;", 0)};
    public final ks6 a;
    public final h b;
    public final oi8 c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;
    public final j8e g;
    public final ova h;
    public h7e i;
    public final j8e j;
    public final Rect k;
    public final RectF l;
    public final Rect m;
    public View n;
    public final k36 o;

    public MessagesSettingsScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new cka(2));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = hVar;
        this.c = oi8.f;
        this.d = createViewModelLazy(bwa.class, new hta(2, new iua(1, this)));
        this.e = viewBinding(R.id.oneme_messages_settings_content_recycler);
        this.f = viewBinding(R.id.oneme_messages_settings_linear);
        this.g = viewBinding(R.id.oneme_messages_settings_effects);
        ova ovaVar = new ova(new c7k(19, this), ((a2c) hVar.getAccessor().c(27)).a());
        this.h = ovaVar;
        this.j = viewBinding(R.id.oneme_messages_settings_highlight);
        this.k = new Rect();
        this.l = new RectF();
        this.m = new Rect();
        this.o = new k36(27, this);
        e9i.j0(new fz6(q1().m, new w8(2, ovaVar, ova.class, "submitList", "submitList(Ljava/util/List;)V", 4, 20), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final wv7 o1() {
        return (wv7) this.j.m(this, p[3]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setId(R.id.oneme_messages_settings_container);
        Context context2 = frameLayout.getContext();
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setLayoutParams(layoutParams2);
        linearLayout.setId(R.id.oneme_messages_settings_linear);
        linearLayout.setOrientation(1);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.oneme_messages_settings_toolbar);
        rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.oneme_messages_settings_toolbar_title);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new s9a(12)));
        linearLayout.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(R.id.oneme_messages_settings_content_recycler);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.h);
        recyclerView.setItemAnimator(null);
        oo6 oo6Var = new oo6(25, this);
        a8g a8gVar = pq3.j;
        recyclerView.h(new sbf(a8gVar.h(recyclerView), oo6Var, null, null, null, 60), -1);
        recyclerView.h(new rva(a8gVar.h(recyclerView)), -1);
        linearLayout.addView(recyclerView);
        frameLayout.addView(linearLayout);
        View e6eVar = new e6e(frameLayout.getContext());
        e6eVar.setId(R.id.oneme_messages_settings_effects);
        e6eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(e6eVar);
        View wv7Var = new wv7(frameLayout.getContext());
        wv7Var.setId(R.id.oneme_messages_settings_highlight);
        wv7Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new vqa(3, (lq4) null, 2), wv7Var);
        wv7Var.setVisibility(8);
        frameLayout.addView(wv7Var);
        n1g.N(new qb3(3, null, 5), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        view.removeCallbacks(this.o);
        this.n = null;
        p1().setAdapter(null);
        r1();
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(q1().n, getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 9), 3), getViewLifecycleScope());
    }

    public final RecyclerView p1() {
        return (RecyclerView) this.e.m(this, p[0]);
    }

    public final bwa q1() {
        return (bwa) this.d.getValue();
    }

    public final void r1() {
        h7e h7eVar = this.i;
        if (h7eVar != null) {
            h7eVar.a();
        }
        this.i = null;
        o1().setVisibility(8);
        wv7 wv7VarO1 = o1();
        wv7VarO1.a.clear();
        wv7VarO1.invalidate();
    }

    public MessagesSettingsScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
