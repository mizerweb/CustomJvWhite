package one.me.chatscreen.chatstatus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.ie3;
import defpackage.j8e;
import defpackage.jz;
import defpackage.ke3;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.qb3;
import defpackage.t3f;
import defpackage.vv;
import defpackage.xd3;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatstatus/ChatStatusBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lie3;", "chatStatus", "(Lt3f;Lie3;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatStatusBottomWidget extends Widget {
    public static final /* synthetic */ zv8[] c = {new z8b(ChatStatusBottomWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;"), zo5.f(zfe.a, ChatStatusBottomWidget.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final ny8 a;
    public final j8e b;

    public ChatStatusBottomWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        zv8 zv8Var = c[0];
        this.a = getSharedViewModel((t3f) vvVar.a(this), xd3.class, null);
        this.b = viewBinding(R.id.chat__bottom_container_chat_status_button);
    }

    public final xd3 o1() {
        return (xd3) this.a.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        n1g.N(new qb3(3, null, 1), frameLayout);
        cyb cybVar = new cyb(frameLayout.getContext());
        cybVar.setId(R.id.chat__bottom_container_chat_status_button);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.GHOST);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
        cybVar.setLayoutParams(layoutParams);
        frameLayout.addView(cybVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(new jz(o1().R1, 13), getViewLifecycleOwner().f(), n09.d), new ke3(0, (lq4) null, this), 3), getViewLifecycleScope());
    }

    public ChatStatusBottomWidget(t3f t3fVar, ie3 ie3Var) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_key_chat_status", ie3Var)));
    }
}
