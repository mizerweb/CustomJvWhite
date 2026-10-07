package one.me.settings.multilang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.ch8;
import defpackage.e9i;
import defpackage.el6;
import defpackage.f7;
import defpackage.ft0;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.jc9;
import defpackage.je9;
import defpackage.k96;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o54;
import defpackage.pc9;
import defpackage.q9i;
import defpackage.rsf;
import defpackage.sc9;
import defpackage.vne;
import defpackage.ww8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zo5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import org.apache.http.HttpStatus;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/multilang/LocaleBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-locale"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocaleBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int z = 0;
    public final h u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public final rsf y;

    public LocaleBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = hVar;
        this.v = hVar.getAccessor().d(78);
        this.w = hVar.getAccessor().d(HttpStatus.SC_NOT_MODIFIED);
        this.x = createViewModelLazy(sc9.class, new ch8(9, new ww8(7, this)));
        this.y = new rsf(new ft0(this), ((a2c) hVar.getAccessor().c(27)).a());
    }

    public static final void F1(LocaleBottomSheet localeBottomSheet, long j) {
        String str = localeBottomSheet.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "updateLocale id: "), null);
            }
        }
        String strB = ((sc9) localeBottomSheet.x.getValue()).B((int) j);
        ((pc9) ((sc9) localeBottomSheet.x.getValue()).h.getValue()).a(2, strB);
        ((jc9) localeBottomSheet.v.getValue()).d(localeBottomSheet.getContext(), strB);
        ((o54) localeBottomSheet.w.getValue()).a(true);
        sc9 sc9Var = (sc9) localeBottomSheet.x.getValue();
        gm0.n(sc9Var.l, "reinitSession");
        ((vne) sc9Var.f.getValue()).b();
        Context context = (Context) localeBottomSheet.u.getAccessor().c(7);
        Intent intent = new Intent("action.LOCALE_CHANGED");
        intent.setPackage(localeBottomSheet.getContext().getPackageName());
        context.sendBroadcast(intent);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.oneme_locale_bottom_sheet_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        n1g.N(new f7(3, null, 26), textView);
        textView.setText(R.string.bottom_sheet_title);
        linearLayout.addView(textView);
        k96 k96Var = new k96(linearLayout.getContext());
        k96Var.setId(R.id.oneme_locale_recycler_view);
        k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        k96Var.getContext();
        k96Var.setLayoutManager(new LinearLayoutManager());
        k96Var.setOverScrollMode(2);
        k96Var.setAdapter(this.y);
        linearLayout.addView(k96Var);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        e9i.j0(new fz6(n1g.v(((sc9) this.x.getValue()).k, getViewLifecycleOwner().f(), n09.d), new el6((lq4) null, this, 20), 3), getViewLifecycleScope());
    }

    public LocaleBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
