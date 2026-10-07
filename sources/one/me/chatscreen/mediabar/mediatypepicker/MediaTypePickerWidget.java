package one.me.chatscreen.mediabar.mediatypepicker;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a8j;
import defpackage.b3;
import defpackage.bc1;
import defpackage.ch8;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f4b;
import defpackage.f7a;
import defpackage.fz6;
import defpackage.g4b;
import defpackage.ga0;
import defpackage.gm0;
import defpackage.h;
import defpackage.h47;
import defpackage.h4b;
import defpackage.h8c;
import defpackage.i19;
import defpackage.i7j;
import defpackage.ixj;
import defpackage.j8e;
import defpackage.je9;
import defpackage.k7a;
import defpackage.lq4;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o24;
import defpackage.o7a;
import defpackage.oo6;
import defpackage.ph1;
import defpackage.sj8;
import defpackage.t3f;
import defpackage.tbb;
import defpackage.uf3;
import defpackage.vv;
import defpackage.ww8;
import defpackage.xhh;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.WeakHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerWidget;", "Lone/me/sdk/arch/Widget;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "parentScope", "", ApiProtocol.PARAM_CHAT_ID, "(Lt3f;J)V", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MediaTypePickerWidget extends Widget implements mc4 {
    public static final /* synthetic */ zv8[] i = {new dwd(MediaTypePickerWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, MediaTypePickerWidget.class, "parentScope", "getParentScope()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(MediaTypePickerWidget.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final vv a;
    public final vv b;
    public final h c;
    public final ny8 d;
    public final ny8 e;
    public final tbb f;
    public final h47 g;
    public final j8e h;

    public MediaTypePickerWidget(Bundle bundle) {
        super(bundle);
        this.a = new vv("MediaTypePickerWidget.chat_id", Long.class);
        this.b = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.c = hVar;
        this.d = hVar.getAccessor().d(18);
        int i2 = 24;
        this.e = createViewModelLazy(k7a.class, new ch8(i2, new ww8(18, this)));
        this.f = (tbb) hVar.getAccessor().c(231);
        this.g = new h47(((a2c) hVar.getAccessor().c(27)).a(), new oo6(i2, this), 7);
        this.h = viewBinding(R.id.media_bar__media_type_buttons_recycler);
    }

    @Override // defpackage.mc4
    public final void e(int i2, Bundle bundle) {
        if (i2 == 1) {
            a8j.x(((k7a) this.e.getValue()).c.d, f7a.a);
            return;
        }
        if (i2 != 2) {
            return;
        }
        try {
            String str = sj8.a;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            startActivityForResult(intent, 373);
            tbb.g(this.f, y3f.CHAT_SYSTEM_FILE_VIEWER);
        } catch (ActivityNotFoundException unused) {
            h8c h8cVar = new h8c(this);
            h8cVar.n(np4.q(getContext(), R.string.no_app_found));
            h8cVar.p();
        }
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 373) {
            String strH = zo5.h(i3, "Unexpected onActivityResult code ");
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, "MediaTypePickerWidget", strH, null, null, 8);
                return;
            }
            return;
        }
        g4b g4bVarJ = ((h4b) this.d.getValue()).J(9);
        lq4 lq4Var = null;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            ((h4b) this.d.getValue()).B(f4b.EMPTY_URI_ON_FILE_ACTIVITY_RESULT, g4bVarJ);
        } else {
            k7a k7aVar = (k7a) this.e.getValue();
            yab.i0(k7aVar.b, ((n0c) ((xhh) k7aVar.k.getValue())).b(), 0, new uf3(data, k7aVar, g4bVarJ, lq4Var, 3), 2);
        }
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        float f;
        float f2;
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        View view = new View(linearLayoutJ.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, gm0.K(1.0f * yl5.d().getDisplayMetrics().density)));
        n1g.N(new b3(3, null, 3), view);
        linearLayoutJ.addView(view);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.media_bar__media_type_buttons_recycler);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setAdapter(this.g);
        recyclerView.getContext();
        EvenlySpacedHorizontalLayoutManager evenlySpacedHorizontalLayoutManager = new EvenlySpacedHorizontalLayoutManager(0, false);
        evenlySpacedHorizontalLayoutManager.E = true;
        recyclerView.setLayoutManager(evenlySpacedHorizontalLayoutManager);
        recyclerView.setOverScrollMode(1);
        recyclerView.h(new ph1(6), -1);
        linearLayoutJ.addView(recyclerView);
        WeakHashMap weakHashMap = i7j.a;
        if (!linearLayoutJ.isAttachedToWindow()) {
            linearLayoutJ.addOnAttachStateChangeListener(new ga0(linearLayoutJ, 8, linearLayoutJ));
            return linearLayoutJ;
        }
        if (ixj.g(linearLayoutJ.getRootWindowInsets(), null).a.f(2).d > 0) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 2.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 8.0f;
        }
        linearLayoutJ.setPadding(linearLayoutJ.getPaddingLeft(), linearLayoutJ.getPaddingTop(), linearLayoutJ.getPaddingRight(), gm0.K(f2 * f));
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ny8 ny8Var = this.e;
        o24 o24Var = ((k7a) ny8Var.getValue()).g;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(o24Var, i19VarF, n09Var), new o7a(null, this, 0), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((k7a) ny8Var.getValue()).h, getViewLifecycleOwner().f(), n09Var), new o7a(null, this, 1), i2), getViewLifecycleScope());
    }

    public MediaTypePickerWidget(t3f t3fVar, long j) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("MediaTypePickerWidget.chat_id", Long.valueOf(j))));
    }
}
