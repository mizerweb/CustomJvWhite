package one.me.keyboardmedia.emoji;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.b1k;
import defpackage.b46;
import defpackage.c;
import defpackage.c0a;
import defpackage.ch8;
import defpackage.d66;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.e9i;
import defpackage.eo2;
import defpackage.ez9;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.g56;
import defpackage.gm0;
import defpackage.h;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.kog;
import defpackage.lq4;
import defpackage.mw8;
import defpackage.n09;
import defpackage.n1g;
import defpackage.nv4;
import defpackage.nw8;
import defpackage.ny8;
import defpackage.ow8;
import defpackage.q35;
import defpackage.q46;
import defpackage.t3f;
import defpackage.tre;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/keyboardmedia/emoji/KeyboardEmojiWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "forReactionsSettings", "", "", "selectedEmojis", "(Lt3f;ZLjava/util/List;)V", "keyboard-media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class KeyboardEmojiWidget extends Widget {
    public static final /* synthetic */ zv8[] k = {new dwd(KeyboardEmojiWidget.class, "forReactionsSettings", "getForReactionsSettings()Z", 0), zo5.f(zfe.a, KeyboardEmojiWidget.class, "contentRecyclerView", "getContentRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(KeyboardEmojiWidget.class, "tabsRecyclerView", "getTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final h a;
    public final vv b;
    public final ny8 c;
    public final ny8 d;
    public final j8e e;
    public final j8e f;
    public final b46 g;
    public final kog h;
    public final eo2 i;
    public kbc j;

    public KeyboardEmojiWidget(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.a = hVar;
        this.b = new vv(Boolean.class, Boolean.FALSE, "arg_for_reactions_settings");
        this.c = createViewModelLazy(d66.class, new ch8(6, new dx4(this, bundle, 24)));
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        lq4 lq4Var = null;
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.d = getSharedViewModel((t3f) ((Parcelable) objF0), ez9.class, null);
        this.e = viewBinding(R.id.oneme_media_keyboard_emoji_list);
        this.f = viewBinding(R.id.oneme_media_keyboard_emoji_tabs);
        b46 b46Var = new b46(((a2c) hVar.getAccessor().c(27)).a(), new b1k(18, this), p1());
        this.g = b46Var;
        this.h = new kog(((a2c) hVar.getAccessor().c(27)).a(), new nv4(22, this));
        this.i = new eo2(b46Var, new fz7(1, r1(), d66.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 2));
        e9i.j0(new fz6(r1().m, new mw8(this, lq4Var, 0), 3), getLifecycleScope());
    }

    public final RecyclerView o1() {
        return (RecyclerView) this.e.m(this, k[1]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_media_keyboard_emoji_container);
        int i = 0;
        int iK = p1() ? 0 : gm0.K(44.0f * yl5.d().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext());
        recyclerView.setId(R.id.oneme_media_keyboard_emoji_tabs);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iK));
        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        recyclerView.setPadding(iK3, iK2, iK3, iK2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        lq4 lq4Var = null;
        n1g.N(new ow8(this, lq4Var, i), recyclerView);
        frameLayout.addView(recyclerView);
        RecyclerView recyclerView2 = new RecyclerView(frameLayout.getContext());
        recyclerView2.setId(R.id.oneme_media_keyboard_emoji_list);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iK;
        recyclerView2.setLayoutParams(layoutParams);
        n1g.N(new ow8(this, lq4Var, 1), recyclerView2);
        recyclerView2.setClipToPadding(false);
        recyclerView2.setClipChildren(false);
        recyclerView2.setItemAnimator(null);
        int iK4 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        recyclerView2.setPadding(iK4, recyclerView2.getPaddingTop(), iK4, gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        frameLayout.addView(recyclerView2);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        o1().setAdapter(null);
        o1().r0(this.i);
        q1().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        q1().setAdapter(this.h);
        q1().h(new q35(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), 1), -1);
        RecyclerView recyclerViewO1 = o1();
        int iK = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = gm0.K(3.0f * yl5.d().getDisplayMetrics().density);
        int i = 2;
        int i2 = (recyclerViewO1.getContext().getResources().getDisplayMetrics().widthPixels - (iK2 * 2)) / (iK + iK3);
        int i3 = i2 >= 1 ? i2 : 1;
        nw8 nw8Var = new nw8(this, recyclerViewO1);
        recyclerViewO1.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i3);
        gridLayoutManager.K = nw8Var;
        recyclerViewO1.setLayoutManager(gridLayoutManager);
        recyclerViewO1.k(this.i);
        recyclerViewO1.h(new q46(i3, iK3, p1()), -1);
        if (p1()) {
            recyclerViewO1.h(new g56(recyclerViewO1.getContext()), -1);
        }
        recyclerViewO1.setAdapter(this.g);
        int i4 = 3;
        e9i.j0(new fz6(r1().j, new mw8(this, null, i), i4), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((ez9) this.d.getValue()).f, getViewLifecycleOwner().f(), n09.d), new mw8(null, this), i4), getViewLifecycleScope());
    }

    public final boolean p1() {
        zv8 zv8Var = k[0];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final RecyclerView q1() {
        return (RecyclerView) this.f.m(this, k[2]);
    }

    public final d66 r1() {
        return (d66) this.c.getValue();
    }

    public KeyboardEmojiWidget(t3f t3fVar, boolean z, List<? extends CharSequence> list) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_for_reactions_settings", Boolean.valueOf(z)), new ylc("arg_selected_emojis", list)));
    }
}
