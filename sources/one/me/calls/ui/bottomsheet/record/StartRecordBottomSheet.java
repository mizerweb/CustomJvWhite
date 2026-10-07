package one.me.calls.ui.bottomsheet.record;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.h02;
import defpackage.iig;
import defpackage.izb;
import defpackage.ize;
import defpackage.jvf;
import defpackage.kbc;
import defpackage.ml9;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nt4;
import defpackage.ny8;
import defpackage.p1c;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.rki;
import defpackage.sx1;
import defpackage.t2g;
import defpackage.t3f;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "(Lt3f;)V", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] x;
    public final ny8 u;
    public final sx1 v;
    public final ny8 w;

    static {
        dwd dwdVar = new dwd(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;", 0);
        zfe.a.getClass();
        x = new zv8[]{dwdVar};
    }

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        vv vvVar = new vv(t3f.class, t3f.d, Widget.ARG_SCOPE_ID);
        zv8 zv8Var = x[0];
        this.u = getSharedViewModel((t3f) vvVar.a(this), h02.class, null);
        this.v = new sx1(m35getAccountScopeuqN4xOY());
        this.w = createViewModelLazy(iig.class, new t2g(3, new ize(26, this)));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.call_screen_record_start_title);
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.l(textView).b.getText().b);
        textView.setGravity(17);
        textView.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 0, gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        textView.setText(R.string.call_screen_record_start_title);
        p1c p1cVar = new p1c(linearLayout.getContext(), 14);
        p1cVar.setId(R.id.call_screen_record_start_name);
        q9i.a(q9i.e, p1cVar);
        p1cVar.setHintTextColor(a8gVar.l(p1cVar).b.getText().d);
        p1cVar.setTextColor(a8gVar.l(p1cVar).b.getText().b);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        p1cVar.setPadding(iK, iK, iK, iK);
        p1cVar.setMaxLines(1);
        p1cVar.setSingleLine(true);
        p1cVar.setInputType(524288);
        p1cVar.setHint((CharSequence) ((iig) this.w.getValue()).e.getValue());
        p1cVar.setClipToOutline(true);
        p1cVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        p1cVar.setOutlineProvider(new nt4(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f)));
        p1cVar.setBackgroundColor(a8gVar.l(p1cVar).b.b().e);
        izb izbVar = new izb(linearLayout.getContext(), false);
        izbVar.setId(R.id.call_screen_record_start_target_chat);
        izbVar.setPadding(0, gm0.K(16.0f * yl5.d().getDisplayMetrics().density), 0, gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        izbVar.setTitle(R.string.call_screen_record_start_chat_title);
        izbVar.setSubtitle(izbVar.getContext().getString(R.string.call_screen_record_start_chat_subtitle));
        izbVar.setCustomTheme(a8gVar.l(izbVar).b);
        izbVar.j(0L, "", rki.c(R.drawable.saved_messages_avatar).toString());
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.call_screen_record_start_target_start_btn);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setCustomTheme(a8gVar.l(cybVar).b);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.call_screen_record_start_start_btn));
        qe7.H(cybVar, 300L, new jvf(this, 5, p1cVar));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(p1cVar, -1, -2);
        linearLayout.addView(izbVar, -1, -2);
        linearLayout.addView(cybVar, -1, -2);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ml9.b(this);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        return pq3.j.k(getContext()).b;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        ml9.b(this);
    }

    public StartRecordBottomSheet(t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar)));
    }
}
