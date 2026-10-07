package one.me.devmenu.threadsviewer;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.drh;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.erh;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h47;
import defpackage.ha9;
import defpackage.j8g;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.rcc;
import defpackage.sy7;
import defpackage.t2g;
import defpackage.wtc;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/devmenu/threadsviewer/ThreadsStateViewerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "h47", "tp4", "threads-viewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThreadsStateViewerScreen extends Widget {
    public static final /* synthetic */ zv8[] f;
    public final oi8 a;
    public final wtc b;
    public final ow0 c;
    public final ny8 d;
    public final h47 e;

    static {
        dwd dwdVar = new dwd(ThreadsStateViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        zfe.a.getClass();
        f = new zv8[]{dwdVar};
    }

    public ThreadsStateViewerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.b = wtcVar;
        this.c = binding(new erh(this, 0));
        this.d = createViewModelLazy(drh.class, new t2g(20, new erh(this, 1)));
        this.e = new h47(this, ((a2c) wtcVar.getAccessor().d(27).getValue()).a());
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        zv8 zv8Var = f[0];
        linearLayout.addView((rcc) this.c.getValue(), new FrameLayout.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.e);
        recyclerView.h(new sy7(new ColorDrawable(-16777216)), -1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 112;
        linearLayout.addView(recyclerView, layoutParams);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((drh) this.d.getValue()).d, getViewLifecycleOwner().f(), n09.d), new j8g((lq4) null, this, 15), 3), getViewLifecycleScope());
    }

    public ThreadsStateViewerScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
