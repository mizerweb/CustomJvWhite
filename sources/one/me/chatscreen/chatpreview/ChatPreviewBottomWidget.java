package one.me.chatscreen.chatpreview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.fze;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.t3f;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z93;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chatscreen/chatpreview/ChatPreviewBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Lha9;", "localAccountId", "(Lt3f;Lha9;)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatPreviewBottomWidget extends Widget {
    public static final /* synthetic */ zv8[] b;
    public final ny8 a;

    static {
        dwd dwdVar = new dwd(ChatPreviewBottomWidget.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0);
        zfe.a.getClass();
        b = new zv8[]{dwdVar};
    }

    public ChatPreviewBottomWidget(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv("scope_id", t3f.class);
        zv8 zv8Var = b[0];
        this.a = getSharedViewModel((t3f) vvVar.a(this), z93.class, null);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(((z93) this.a.getValue()).r, getViewLifecycleOwner().f(), n09.d), new fze((lq4) null, (LinearLayout) view, this, 13), 3), getViewLifecycleScope());
    }

    public ChatPreviewBottomWidget(t3f t3fVar, ha9 ha9Var) {
        this(n1g.i(new ylc("scope_id", t3fVar), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
