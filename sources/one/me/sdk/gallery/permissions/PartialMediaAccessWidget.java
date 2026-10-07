package one.me.sdk.gallery.permissions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.lq4;
import defpackage.n;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o37;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.xc9;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/sdk/gallery/permissions/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "media-gallery-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PartialMediaAccessWidget extends Widget {
    public final ny8 a;

    public PartialMediaAccessWidget(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(linearLayout2.getContext());
        textView.setText(R.string.media_bar_restricted_media_title);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        q9i.a(q9i.f, textView);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new xc9(i, lq4Var, 6), textView);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(linearLayout2.getContext());
        textView2.setText(R.string.media_bar_restricted_media_subtitle);
        q9i.a(q9i.i, textView2);
        n1g.N(new xc9(i, lq4Var, 7), textView2);
        linearLayout2.addView(textView2);
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), linearLayout2.getPaddingBottom());
        linearLayout.addView(linearLayout2);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setText(np4.q(getContext(), R.string.media_bar_restricted_media_action));
        cybVar.setSize(ayb.j);
        cybVar.setAppearance(zxb.SECONDARY);
        qe7.H(cybVar, 300L, new o37(29, this));
        linearLayout.addView(cybVar);
        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new n(i, lq4Var, 11), linearLayout);
        return linearLayout;
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle);
        this.a = new h(m35getAccountScopeuqN4xOY()).getAccessor().d(34);
    }
}
