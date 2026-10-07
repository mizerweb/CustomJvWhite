package one.me.devmenu.logsviewer;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a3;
import defpackage.a8g;
import defpackage.ai9;
import defpackage.ch8;
import defpackage.d3;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.gl1;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.k96;
import defpackage.kh9;
import defpackage.mh9;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ow0;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.r07;
import defpackage.rcc;
import defpackage.sy7;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000b"}, d2 = {"Lone/me/devmenu/logsviewer/LogsViewerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "mh9", "nh9", "logsviewer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LogsViewerScreen extends Widget {
    public static final /* synthetic */ zv8[] g;
    public static final int h;
    public final oi8 a;
    public final ow0 b;
    public final h c;
    public final ny8 d;
    public final mh9 e;
    public final mh9 f;

    static {
        dwd dwdVar = new dwd(LogsViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        zfe.a.getClass();
        g = new zv8[]{dwdVar};
        h = View.generateViewId();
    }

    public LogsViewerScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = binding(new kh9(this, 0));
        this.c = new h(m35getAccountScopeuqN4xOY());
        this.d = createViewModelLazy(ai9.class, new ch8(10, new kh9(this, 1)));
        this.e = new mh9(o1().g);
        this.f = new mh9(o1().i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.a;
    }

    public final ai9 o1() {
        return (ai9) this.d.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        zv8 zv8Var = g[0];
        linearLayout.addView((rcc) this.b.getValue(), new FrameLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(linearLayout.getContext());
        editText.setSingleLine(true);
        q9i.a(q9i.e, editText);
        a8g a8gVar = pq3.j;
        editText.setTextColor(a8gVar.h(editText).getText().b);
        editText.addTextChangedListener(new a3(3, this));
        linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        view.setBackgroundColor(a8gVar.h(view).B().b);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, gm0.J(((double) yl5.d().getDisplayMetrics().density) * 0.5d)));
        k96 k96Var = new k96(linearLayout.getContext());
        k96Var.setId(R.id.oneme_devmenu_logsviewer_show_log_recycler_view);
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager(1, false));
        k96Var.setAdapter(this.e);
        k96Var.setThreshold(10);
        k96Var.h(new sy7(new ColorDrawable(-16777216)), -1);
        k96Var.setPager(new gl1(this, 4));
        e9i.j0(new r07(o1().g, o1().i, new d3(k96Var, this, null, 19), 0), getViewLifecycleScope());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(k96Var, layoutParams);
        return linearLayout;
    }

    public LogsViewerScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
