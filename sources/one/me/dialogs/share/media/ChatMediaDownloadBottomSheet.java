package one.me.dialogs.share.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.a23;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.b23;
import defpackage.c23;
import defpackage.cyb;
import defpackage.dq5;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hr4;
import defpackage.i80;
import defpackage.kbc;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.n23;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o8c;
import defpackage.og5;
import defpackage.ore;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.qq2;
import defpackage.rx8;
import defpackage.soh;
import defpackage.v50;
import defpackage.vv;
import defpackage.w8c;
import defpackage.wtc;
import defpackage.x7;
import defpackage.xbd;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BE\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "Lha9;", "localAccountId", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Lha9;)V", "share-media"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] B = {new dwd(ChatMediaDownloadBottomSheet.class, "forceDarkTheme", "getForceDarkTheme()Z", 0), zo5.f(zfe.a, ChatMediaDownloadBottomSheet.class, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    public final vv A;
    public final wtc u;
    public final ny8 v;
    public final ny8 w;
    public final ny8 x;
    public og5 y;
    public final vv z;

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.u = wtcVar;
        ny8 ny8VarCreateViewModelLazy = createViewModelLazy(n23.class, new qq2(4, new a23(this, 0)));
        this.v = ny8VarCreateViewModelLazy;
        this.w = rx8.P(3, new a23(this, 1));
        this.x = wtcVar.getAccessor().d(316);
        this.z = new vv("arg:force_dark", Boolean.class);
        this.A = new vv("arg:snack_bot_margin", Integer.class);
        n23 n23Var = (n23) ny8VarCreateViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string == null) {
            ore.p("Required value was null.");
            throw null;
        }
        n23Var.s = a8j.t(n23Var, ((n0c) n23Var.e).b(), new i80(n23Var, j, string, (dq5) dq5.h.get(bundle.getInt("arg:cause")), j2, (lq4) null), 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm0.K(223.0f * yl5.d().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = gm0.K(27.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        kbc kbcVarT1 = t1();
        if (kbcVarT1 == null) {
            kbcVarT1 = pq3.j.h(textView);
        }
        textView.setTextColor(kbcVarT1.getText().b);
        v50 v50Var = (v50) this.w.getValue();
        ArrayList arrayList = soh.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, v50Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        textView.setText(R.string.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        cyb cybVar = new cyb(frameLayout2.getContext());
        cybVar.setLayoutParams(new FrameLayout.LayoutParams(-1, gm0.K(52.0f * yl5.d().getDisplayMetrics().density), 81));
        cybVar.setCustomTheme(t1());
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setTextColor(Integer.valueOf(R.attr.text_themed));
        cybVar.setText(np4.q(getContext(), R.string.oneme_bottom_sheet_cancel));
        qe7.H(cybVar, 300L, new x7(3, this));
        frameLayout2.addView(cybVar);
        return frameLayout2;
    }

    public final void F1(int i, int i2) {
        h8c h8cVar = (h8c) this.x.getValue();
        h8cVar.n(np4.q(getContext(), i));
        h8cVar.h(new w8c(i2));
        zv8 zv8Var = B[1];
        Integer num = (Integer) this.A.a(this);
        if (num != null) {
            h8cVar.c(new o8c(0, 0, num.intValue(), 11));
        }
        h8cVar.p();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        this.y = gr4Var instanceof og5 ? (og5) gr4Var : null;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onDestroyView(View view) throws IllegalAccessException, InvocationTargetException {
        super.onDestroyView(view);
        ((n23) this.v.getValue()).D();
        this.y = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(((n23) this.v.getValue()).r, getViewLifecycleOwner().f(), n09.d), new b23(null, this, 1), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new c23(this, 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final kbc t1() {
        kbc kbcVar = pq3.j.k(getContext()).b;
        zv8 zv8Var = B[0];
        if (((Boolean) this.z.a(this)).booleanValue()) {
            return kbcVar;
        }
        return null;
    }

    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("arg:msg_id", Long.valueOf(j)), new ylc("arg:attach_id", Long.valueOf(j2)), new ylc("arg:local_attach_id", str), new ylc("arg:cause", Integer.valueOf(i)), new ylc("arg:snack_bot_margin", num), new ylc("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}
