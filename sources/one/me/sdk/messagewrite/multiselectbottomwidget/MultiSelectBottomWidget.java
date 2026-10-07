package one.me.sdk.messagewrite.multiselectbottomwidget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.j8e;
import defpackage.jz;
import defpackage.lq4;
import defpackage.m5b;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.qb3;
import defpackage.qe7;
import defpackage.qz9;
import defpackage.t3f;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z36;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/multiselectbottomwidget/MultiSelectBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "isMessageInputHeight", "(Lt3f;Z)V", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiSelectBottomWidget extends Widget {
    public static final /* synthetic */ zv8[] e = {new dwd(MultiSelectBottomWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), zo5.f(zfe.a, MultiSelectBottomWidget.class, "isMessageInputHeight", "isMessageInputHeight()Z", 0), new dwd(MultiSelectBottomWidget.class, "leftButton", "getLeftButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new dwd(MultiSelectBottomWidget.class, "rightButton", "getRightButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final vv a;
    public final ny8 b;
    public final j8e c;
    public final j8e d;

    public MultiSelectBottomWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        this.a = new vv("ARG_HEIGHT_TYPE", Boolean.class);
        zv8 zv8Var = e[0];
        this.b = getSharedViewModel((t3f) vvVar.a(this), m5b.class, null);
        this.c = viewBinding(R.id.messages_list_context_action_reply);
        this.d = viewBinding(R.id.messages_list_context_action_forward);
    }

    public static void p1(cyb cybVar, boolean z) {
        cybVar.setEnabled(z);
        cybVar.setTextColor(z ? Integer.valueOf(R.attr.text_primary) : Integer.valueOf(R.attr.states_text_primary_static_disabled));
        cybVar.setIconColor(z ? Integer.valueOf(R.attr.icon_primary) : Integer.valueOf(R.attr.icon_mute));
    }

    public final cyb o1(boolean z) {
        cyb cybVar = new cyb(getContext());
        if (z) {
            cybVar.setId(R.id.messages_list_context_action_forward);
            cybVar.setText(np4.q(cybVar.getContext(), R.string.chat_screen_action_forward));
            cybVar.setIcon(cybVar.getContext().getDrawable(R.drawable.icon_forward).mutate());
        } else {
            cybVar.setId(R.id.messages_list_context_action_reply);
            cybVar.setText(np4.q(cybVar.getContext(), R.string.chat_screen_action_reply));
            cybVar.setIcon(cybVar.getContext().getDrawable(R.drawable.icon_reply).mutate());
        }
        cybVar.setSize(ayb.i);
        cybVar.setAppearance(zxb.GHOST);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        zv8[] zv8VarArr = e;
        zv8 zv8Var = zv8VarArr[1];
        vv vvVar = this.a;
        int iK2 = gm0.K(((Boolean) vvVar.a(this)).booleanValue() ? yl5.d().getDisplayMetrics().density * 4.0f : yl5.d().getDisplayMetrics().density * 10.0f);
        int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        zv8 zv8Var2 = zv8VarArr[1];
        layoutParams.setMargins(iK, iK2, iK3, ((Boolean) vvVar.a(this)).booleanValue() ? gm0.K(4.0f * yl5.d().getDisplayMetrics().density) : gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = z ? 8388613 : 8388611;
        cybVar.setLayoutParams(layoutParams);
        qe7.H(cybVar, 300L, new z36(this, 29, cybVar));
        return cybVar;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new qb3(3, null, 6), frameLayout);
        frameLayout.addView(o1(false));
        frameLayout.addView(o1(true));
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(new jz(((m5b) this.b.getValue()).d, 13), getViewLifecycleOwner().f(), n09.d), new qz9((lq4) null, this, 10), 3), getViewLifecycleScope());
    }

    public MultiSelectBottomWidget(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("ARG_HEIGHT_TYPE", Boolean.valueOf(z))));
    }
}
