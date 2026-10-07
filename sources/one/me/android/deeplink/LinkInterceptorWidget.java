package one.me.android.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a4c;
import defpackage.ar;
import defpackage.c59;
import defpackage.ca2;
import defpackage.cel;
import defpackage.ch8;
import defpackage.cqk;
import defpackage.d59;
import defpackage.d97;
import defpackage.e59;
import defpackage.e9i;
import defpackage.et4;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.gm0;
import defpackage.h8c;
import defpackage.h9c;
import defpackage.ha9;
import defpackage.j95;
import defpackage.je9;
import defpackage.k39;
import defpackage.l49;
import defpackage.lq4;
import defpackage.ltb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nv4;
import defpackage.ny8;
import defpackage.o8c;
import defpackage.poe;
import defpackage.qzb;
import defpackage.rgi;
import defpackage.roe;
import defpackage.rx8;
import defpackage.tre;
import defpackage.tz;
import defpackage.w8c;
import defpackage.xu1;
import defpackage.xvc;
import defpackage.xx6;
import defpackage.ylc;
import defpackage.zo5;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import one.me.android.MainActivity;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B'\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "Lha9;", "localAccountId", "Ll49;", "result", "(Landroid/net/Uri;Lha9;Ll49;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LinkInterceptorWidget extends Widget implements mc4 {
    public final qzb a;
    public final ca2 b;
    public final ny8 c;
    public final ny8 d;
    public g8c e;
    public final boolean f;

    public LinkInterceptorWidget(Bundle bundle) {
        super(bundle);
        this.a = new qzb(m35getAccountScopeuqN4xOY());
        this.b = new ca2(m35getAccountScopeuqN4xOY());
        this.c = createViewModelLazy(d59.class, new ch8(8, new e59(this, 0)));
        this.d = rx8.P(3, new e59(this, 1));
        this.f = true;
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        ((xu1) this.d.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: isDialog, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final void o1(boolean z, ar arVar, int i, int i2) {
        h9c h9cVar = new h9c(new w8c(i2), np4.q(getContext(), i), null, new o8c(2, 0, 0, 14));
        if (z) {
            int i3 = MainActivity.o1;
            xvc.v(arVar, null, null, h9cVar, null, 22);
            arVar.finish();
        } else {
            h8c h8cVar = new h8c(this);
            h8cVar.b = h9cVar;
            h8cVar.p();
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        et4 et4Var = new et4(viewGroup.getContext());
        et4Var.setId(R.id.link_interceptor_widget_view);
        et4Var.setBackgroundColor(0);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        super.onDetach(view);
        g8c g8cVar = this.e;
        if (g8cVar != null) {
            g8cVar.a();
        }
        this.e = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((xu1) this.d.getValue()).b(i, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        Object poeVar;
        xx6 xx6VarF;
        ltb onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            cel.a(onBackPressedDispatcher, getViewLifecycleOwner(), new nv4(25, this));
        }
        Uri uri = (Uri) tre.f0(getArgs(), "uri", Uri.class);
        d59 d59Var = (d59) this.c.getValue();
        l49 l49Var = (l49) tre.f0(getArgs(), "link_result", l49.class);
        d59Var.getClass();
        if (l49Var != null) {
            xx6VarF = new tz(7, l49Var);
        } else if (uri == null) {
            xx6VarF = new tz(7, k39.a);
        } else {
            c59 c59Var = (c59) d59Var.c.getValue();
            try {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames.contains("webappChatId")) {
                    Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                    for (String str : queryParameterNames) {
                        if (!cqk.d(str, "webappChatId")) {
                            Iterator<T> it = uri.getQueryParameters(str).iterator();
                            while (it.hasNext()) {
                                builderClearQuery.appendQueryParameter(str, (String) it.next());
                            }
                        }
                    }
                    poeVar = builderClearQuery.build();
                } else {
                    poeVar = uri;
                }
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Throwable thA = roe.a(poeVar);
            if (thA != null) {
                String name = uri.getClass().getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, zo5.r("exception in removeQuery = ", thA), null);
                    }
                }
            }
            if (poeVar instanceof poe) {
                poeVar = uri;
            }
            xx6VarF = c59Var.f((Uri) poeVar);
        }
        e9i.j0(new fz6(e9i.M0(n1g.v(xx6VarF, getViewLifecycleOwner().f(), n09.e), new rgi((lq4) null, this, 6)), new d97(this, uri, (lq4) null, 7), 3), getViewLifecycleScope());
    }

    public LinkInterceptorWidget(Uri uri, ha9 ha9Var, l49 l49Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("uri", uri), new ylc("link_result", l49Var)));
    }

    public /* synthetic */ LinkInterceptorWidget(Uri uri, ha9 ha9Var, l49 l49Var, int i, j95 j95Var) {
        this(uri, ha9Var, (i & 4) != 0 ? null : l49Var);
    }
}
