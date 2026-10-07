package one.me.vpnconnectedwarning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bc1;
import defpackage.d4f;
import defpackage.dk6;
import defpackage.ebj;
import defpackage.gm0;
import defpackage.ha9;
import defpackage.lq4;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.poe;
import defpackage.q9i;
import defpackage.rx8;
import defpackage.tre;
import defpackage.vbi;
import defpackage.y3f;
import defpackage.yl5;
import defpackage.ylc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/vpnconnectedwarning/VpnConnectedWarningBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ly3f;", "screen", "Lha9;", "localAccountId", "(Ly3f;Lha9;)V", "vpn-connected-warning"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VpnConnectedWarningBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int w = 0;
    public final d4f u;
    public final ny8 v;

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public VpnConnectedWarningBottomSheet(Bundle bundle) {
        Object poeVar;
        d4f d4fVarF;
        super(bundle);
        String string = bundle.getString("arg:stat_screen");
        if (string != null) {
            try {
                poeVar = y3f.valueOf(string);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            y3f y3fVar = (y3f) (poeVar instanceof poe ? null : poeVar);
            if (y3fVar != null) {
                d4fVarF = tre.F(this, y3fVar);
            } else {
                d4fVarF = super.getU();
            }
        } else {
            d4fVarF = super.getU();
        }
        this.u = d4fVarF;
        this.v = rx8.P(3, new vbi(17, this));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayoutJ = bc1.j(getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        ImageView imageView = new ImageView(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 28.0f);
        layoutParams.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable((ebj) this.v.getValue());
        linearLayoutJ.addView(imageView);
        TextView textView = new TextView(linearLayoutJ.getContext());
        textView.setText(R.string.oneme_vpn_connected_title);
        q9i.a(q9i.c, textView);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new dk6(i, lq4Var, 9), textView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams2.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        linearLayoutJ.addView(textView);
        TextView textView2 = new TextView(linearLayoutJ.getContext());
        textView2.setText(R.string.oneme_vpn_connected_description);
        q9i.a(q9i.e, textView2);
        textView2.setGravity(17);
        textView2.setTextAlignment(4);
        n1g.N(new dk6(i, lq4Var, 10), textView2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.gravity = 17;
        textView2.setLayoutParams(layoutParams3);
        linearLayoutJ.addView(textView2);
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate, reason: from getter */
    public final d4f getU() {
        return this.u;
    }

    public VpnConnectedWarningBottomSheet(y3f y3fVar, ha9 ha9Var) {
        this(n1g.i(new ylc("arg:stat_screen", y3fVar.name()), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
