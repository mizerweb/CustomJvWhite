package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a69;
import defpackage.ayb;
import defpackage.c3;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f7;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.hn9;
import defpackage.ib;
import defpackage.it3;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jac;
import defpackage.jb;
import defpackage.lq4;
import defpackage.m;
import defpackage.mjg;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qo7;
import defpackage.r;
import defpackage.sfd;
import defpackage.t3f;
import defpackage.t8;
import defpackage.tre;
import defpackage.u59;
import defpackage.v0k;
import defpackage.vv;
import defpackage.xbd;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.util.regex.Pattern;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "Ljb;", "addLinkState", "(Lt3f;Ljb;)V", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] s = {new z8b(AddLinkBottomSheet.class, "parentScopeId", "getParentScopeId()Lone/me/sdk/arch/store/ScopeId;"), zo5.f(zfe.a, AddLinkBottomSheet.class, "editText", "getEditText()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new dwd(AddLinkBottomSheet.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final v0k m;
    public final jb n;
    public final j8e o;
    public final j8e p;
    public final ny8 q;
    public final ny8 r;

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        this.m = new v0k(m35getAccountScopeuqN4xOY());
        vv vvVar = new vv(Widget.ARG_SCOPE_ID, t3f.class);
        Parcelable parcelable = (Parcelable) tre.f0(bundle, "bottom_sheet:add_link:key", jb.class);
        if (parcelable == null) {
            ore.p("Required value was null.");
            throw null;
        }
        this.n = (jb) parcelable;
        this.o = viewBinding(R.id.writebar__add_link_bottom_sheet_input);
        this.p = viewBinding(R.id.writebar__add_link_bottom_sheet_button_add);
        zv8 zv8Var = s[0];
        this.q = getSharedViewModel((t3f) vvVar.a(this), hn9.class, null);
        this.r = createViewModelLazy(a69.class, new r(5, new qo7(8, this)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setPaddingRelative(textView.getPaddingStart(), gm0.K(22.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingEnd(), gm0.K(yl5.d().getDisplayMetrics().density * 22.0f));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(np4.q(getContext(), R.string.writebar__add_link_title));
        q9i.a(q9i.d, textView);
        int i = 3;
        n1g.N(new f7(i, null, 1), textView);
        linearLayout.addView(textView);
        jac jacVar = new jac(linearLayout.getContext());
        jacVar.setId(R.id.writebar__add_link_bottom_sheet_input);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int marginStart = layoutParams2.getMarginStart();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        layoutParams2.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iK2;
        jacVar.setLayoutParams(layoutParams2);
        String str = this.n.c;
        if (str == null) {
            a69 a69Var = (a69) this.r.getValue();
            CharSequence charSequenceC = it3.c(jacVar.getContext());
            a69Var.getClass();
            if (charSequenceC == null || !((Pattern) a69Var.g.getValue()).matcher(charSequenceC).matches()) {
                charSequenceC = null;
            }
            if (charSequenceC == null) {
                charSequenceC = "";
            }
            String string = charSequenceC.toString();
            if (string.length() > 0) {
                mjg mjgVar = a69Var.c;
                mjgVar.j(null, new u59(((u59) mjgVar.getValue()).b, string));
            }
            str = string;
        }
        jacVar.setText(str);
        jacVar.setBackgroundColorAttr(Integer.valueOf(R.attr.background_tertiary));
        jacVar.setTextColor(pq3.j.e(jacVar.getContext()).m().getText().b);
        jacVar.k(new m(7, this));
        jacVar.b.requestFocus();
        jacVar.post(new c3(i, jacVar));
        linearLayout.addView(jacVar);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(R.id.writebar__add_link_bottom_sheet_button_add);
        cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(getContext(), R.string.writebar__add_link_button));
        qe7.H(cybVar, 300L, new t8(2, this));
        linearLayout.addView(cybVar);
        frameLayout.addView(linearLayout, -1, -2);
        View mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
        frameLayout.addView(mt5Var);
    }

    public final jac D1() {
        return (jac) this.o.m(this, s[1]);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((cyb) this.p.m(this, s[2])).setEnabled(D1().getText().length() > 0);
        e9i.j0(new fz6(n1g.v(((a69) this.r.getValue()).d, getViewLifecycleOwner().f(), n09.d), new sfd(4, (lq4) null, this), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new ib(this, 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1 */
    public final oi8 getV() {
        return new oi8(0, 0, 0, new j11(3, 3, false), 7);
    }

    public AddLinkBottomSheet(t3f t3fVar, jb jbVar) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("bottom_sheet:add_link:key", jbVar)));
    }
}
