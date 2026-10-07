package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.b7;
import defpackage.ch3;
import defpackage.cyb;
import defpackage.eg4;
import defpackage.gm0;
import defpackage.gu;
import defpackage.h;
import defpackage.ha9;
import defpackage.j11;
import defpackage.n1g;
import defpackage.np4;
import defpackage.nt4;
import defpackage.o37;
import defpackage.o77;
import defpackage.oi8;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.rx8;
import defpackage.uf4;
import defpackage.uwb;
import defpackage.wf4;
import defpackage.wk8;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "app-update"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ForceUpdateScreen extends Widget {
    public final oi8 a;
    public final gu b;
    public final uwb c;

    public ForceUpdateScreen(Bundle bundle) {
        super(bundle);
        this.a = new oi8(0, 0, 0, new j11(3, 1, false), 7);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.b = (gu) hVar.getAccessor().c(94);
        this.c = (uwb) hVar.getAccessor().c(185);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getD() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.oneme_force_update_app_icon);
        imageView.setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(wk8.o((Context) this.c.a.c(7), R.mipmap.ic_launcher_background));
        int iK = gm0.K(17.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageResource(R.drawable.app_logo);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R.id.oneme_force_update_update_icon);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new b7(2, imageView2));
        imageView2.setBackground(rx8.a(imageView2.getContext(), 1301046487, 78.0f, true));
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        imageView2.setPadding(iK2, iK2, iK2, iK2);
        imageView2.setImageResource(R.drawable.icon_change_camera);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.oneme_force_update_title);
        textView.setGravity(1);
        q9i.a(q9i.b, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setText(R.string.force_update_title);
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.oneme_force_update_subtitle);
        textView2.setGravity(1);
        textView2.setTextColor(p.d(textView2, q9i.e, a8gVar, textView2).b);
        textView2.setText(R.string.force_update_subtitle);
        cyb cybVar = new cyb(getContext());
        cybVar.setId(R.id.oneme_force_update_update_button);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.update_button));
        qe7.H(cybVar, 300L, new o37(2, this));
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        n1g.N(new o77(textView, textView2, null, 0), wf4Var);
        wf4Var.addView(imageView, gm0.K(yl5.d().getDisplayMetrics().density * 120.0f), gm0.K(120.0f * yl5.d().getDisplayMetrics().density));
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 60.0f), gm0.K(60.0f * yl5.d().getDisplayMetrics().density));
        uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 84.0f));
        ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = gm0.K(84.0f * yl5.d().getDisplayMetrics().density);
        wf4Var.addView(imageView2, uf4Var);
        uf4 uf4Var2 = new uf4(-1, -2);
        uf4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        uf4Var2.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        ((ViewGroup.MarginLayoutParams) uf4Var2).bottomMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = gm0.K(50.0f * yl5.d().getDisplayMetrics().density);
        wf4Var.addView(textView, uf4Var2);
        uf4 uf4Var3 = new uf4(-1, -2);
        uf4Var3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        uf4Var3.setMarginEnd(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        wf4Var.addView(textView2, uf4Var3);
        uf4 uf4Var4 = new uf4(-1, -2);
        uf4Var4.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        uf4Var4.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        ((ViewGroup.MarginLayoutParams) uf4Var4).bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        wf4Var.addView(cybVar, uf4Var4);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = imageView.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 7, 0, 7);
        eg4VarH.d(id, 4, textView.getId(), 3);
        eg4VarH.g(id).d.W = 2;
        int id2 = imageView2.getId();
        eg4VarH.d(id2, 3, imageView.getId(), 3);
        eg4VarH.d(id2, 4, imageView.getId(), 4);
        eg4VarH.d(id2, 6, imageView.getId(), 6);
        eg4VarH.d(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        eg4VarH.d(id3, 3, imageView.getId(), 4);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, 0, 7);
        eg4VarH.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        eg4VarH.d(id4, 3, textView.getId(), 4);
        eg4VarH.d(id4, 6, 0, 6);
        eg4VarH.d(id4, 7, 0, 7);
        eg4VarH.d(id4, 4, cybVar.getId(), 3);
        int id5 = cybVar.getId();
        eg4VarH.d(id5, 4, 0, 4);
        eg4VarH.d(id5, 6, 0, 6);
        eg4VarH.d(id5, 7, 0, 7);
        eg4VarH.a(wf4Var);
        return wf4Var;
    }

    public ForceUpdateScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
