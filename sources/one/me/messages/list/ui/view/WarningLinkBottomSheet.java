package one.me.messages.list.ui.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8g;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dcj;
import defpackage.dwd;
import defpackage.gm0;
import defpackage.h;
import defpackage.j8e;
import defpackage.jsa;
import defpackage.lq4;
import defpackage.n1g;
import defpackage.nff;
import defpackage.np4;
import defpackage.ny8;
import defpackage.p;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r5h;
import defpackage.t3f;
import defpackage.tre;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/messages/list/ui/view/WarningLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "link", "", "blocked", "(Lt3f;Ljava/lang/String;Z)V", "message-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WarningLinkBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] C = {new dwd(WarningLinkBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), zo5.f(zfe.a, WarningLinkBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)};
    public final j8e A;
    public boolean B;
    public final String u;
    public final boolean v;
    public final int w;
    public final ny8 x;
    public final ny8 y;
    public final j8e z;

    public WarningLinkBottomSheet(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.u = bundle.getString("link_arg");
        boolean z = bundle.getBoolean("block_arg", false);
        this.v = z;
        this.w = z ? 2 : 1;
        t3f t3fVar = (t3f) ((Parcelable) tre.f0(getArgs(), Widget.ARG_SCOPE_ID, t3f.class));
        this.x = getSharedViewModel(t3fVar == null ? getC() : t3fVar, jsa.class, null);
        this.y = hVar.getAccessor().d(242);
        this.z = viewBinding(R.id.messages_list_warning_link_title);
        this.A = viewBinding(R.id.messages_list_warning_link_subtitle);
        this.B = true;
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
        LinearLayout linearLayout = new LinearLayout(getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.messages_list_warning_link_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        boolean z = this.v;
        textView.setText(z ? R.string.link_interceptor_warning_blocked_title : R.string.link_interceptor_warning_open_title);
        q9i.a(q9i.c, textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.messages_list_warning_link_subtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.gravity = 17;
        textView2.setLayoutParams(layoutParams2);
        String str = this.u;
        String string = z ? textView2.getContext().getString(R.string.link_interceptor_warning_blocked_description, str) : textView2.getContext().getString(R.string.link_interceptor_warning_open_description, str);
        if (str == null) {
            str = "";
        }
        int length = r5h.g1(string, str).length() + 50;
        final int i2 = 0;
        if (string.length() > length) {
            string = string.substring(0, length).concat("…");
        }
        textView2.setText(string);
        textView2.setGravity(17);
        textView2.setTextColor(p.d(textView2, q9i.i, a8gVar, textView2).c);
        linearLayout.addView(textView2);
        cyb cybVar = new cyb(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams3);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), z ? R.string.its_clear : R.string.link_interceptor_warning_cancel));
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: ccj
            public final /* synthetic */ WarningLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                WarningLinkBottomSheet warningLinkBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        String str2 = warningLinkBottomSheet.u;
                        int i4 = warningLinkBottomSheet.w;
                        if (str2 != null) {
                            jsa jsaVar = (jsa) warningLinkBottomSheet.x.getValue();
                            zv8[] zv8VarArr = jsa.Z2;
                            jsaVar.j0(str2, false);
                            boolean z2 = warningLinkBottomSheet.v;
                            ny8 ny8Var = warningLinkBottomSheet.y;
                            if (z2) {
                                ((dcj) ny8Var.getValue()).a(1, i4, 2);
                            } else {
                                ((dcj) ny8Var.getValue()).a(1, i4, 1);
                            }
                            warningLinkBottomSheet.B = false;
                            warningLinkBottomSheet.v1(false);
                            break;
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = WarningLinkBottomSheet.C;
                        ((dcj) warningLinkBottomSheet.y.getValue()).a(1, warningLinkBottomSheet.w, 2);
                        warningLinkBottomSheet.B = false;
                        warningLinkBottomSheet.v1(true);
                        break;
                }
            }
        });
        linearLayout.addView(cybVar);
        if (!z) {
            cyb cybVar2 = new cyb(linearLayout.getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            cybVar2.setLayoutParams(layoutParams4);
            cybVar2.setSize(aybVar);
            cybVar2.setAppearance(zxb.SECONDARY);
            cybVar2.setText(np4.q(cybVar2.getContext(), R.string.link_interceptor_warning_accept));
            qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: ccj
                public final /* synthetic */ WarningLinkBottomSheet b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    WarningLinkBottomSheet warningLinkBottomSheet = this.b;
                    switch (i3) {
                        case 0:
                            String str2 = warningLinkBottomSheet.u;
                            int i4 = warningLinkBottomSheet.w;
                            if (str2 != null) {
                                jsa jsaVar = (jsa) warningLinkBottomSheet.x.getValue();
                                zv8[] zv8VarArr = jsa.Z2;
                                jsaVar.j0(str2, false);
                                boolean z2 = warningLinkBottomSheet.v;
                                ny8 ny8Var = warningLinkBottomSheet.y;
                                if (z2) {
                                    ((dcj) ny8Var.getValue()).a(1, i4, 2);
                                } else {
                                    ((dcj) ny8Var.getValue()).a(1, i4, 1);
                                }
                                warningLinkBottomSheet.B = false;
                                warningLinkBottomSheet.v1(false);
                                break;
                            }
                            break;
                        default:
                            zv8[] zv8VarArr2 = WarningLinkBottomSheet.C;
                            ((dcj) warningLinkBottomSheet.y.getValue()).a(1, warningLinkBottomSheet.w, 2);
                            warningLinkBottomSheet.B = false;
                            warningLinkBottomSheet.v1(true);
                            break;
                    }
                }
            });
            linearLayout.addView(cybVar2);
        }
        n1g.N(new nff(this, (lq4) null, 12), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((dcj) this.y.getValue()).a(2, this.w, 0);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void z1() {
        if (this.B) {
            ((dcj) this.y.getValue()).a(1, this.w, 2);
        }
    }

    public WarningLinkBottomSheet(t3f t3fVar, String str, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("link_arg", str), new ylc("block_arg", Boolean.valueOf(z))));
    }
}
