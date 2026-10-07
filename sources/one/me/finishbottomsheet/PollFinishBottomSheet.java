package one.me.finishbottomsheet;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a8d;
import defpackage.ayb;
import defpackage.bc1;
import defpackage.c;
import defpackage.c0a;
import defpackage.c8d;
import defpackage.cyb;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h8d;
import defpackage.hta;
import defpackage.i19;
import defpackage.j8e;
import defpackage.k8d;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.r8e;
import defpackage.t3f;
import defpackage.tre;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xc9;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.finishbottomsheet.PollFinishBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/finishbottomsheet/PollFinishBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "messageId", "pollId", "(Lt3f;JJJ)V", "finish-bottomsheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PollFinishBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] B = {new dwd(PollFinishBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PollFinishBottomSheet.class, "messageId", "getMessageId()J", 0), new dwd(PollFinishBottomSheet.class, "pollId", "getPollId()J", 0), new dwd(PollFinishBottomSheet.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final j8e A;
    public final vv u;
    public final vv v;
    public final vv w;
    public final wtc x;
    public final ny8 y;
    public final ny8 z;

    public PollFinishBottomSheet(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.u = new vv("chat_id", cls);
        this.v = new vv("message_id", cls);
        this.w = new vv("poll_id", cls);
        this.x = new wtc(m35getAccountScopeuqN4xOY());
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.y = getSharedViewModel((t3f) ((Parcelable) objF0), h8d.class, null);
        this.z = createViewModelLazy(k8d.class, new hta(17, new a8d(0, this)));
        this.A = viewBinding(R.id.oneme_poll_finish__confirm_button);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        final int i = 1;
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        linearLayoutJ.setPadding(linearLayoutJ.getPaddingLeft(), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), linearLayoutJ.getPaddingRight(), linearLayoutJ.getPaddingBottom());
        TextView textView = new TextView(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        textView.setLayoutParams(layoutParams);
        q9i.a(q9i.c, textView);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setText(R.string.oneme_poll_finish__title);
        int i2 = 3;
        lq4 lq4Var = null;
        n1g.N(new xc9(i2, lq4Var, 10), textView);
        linearLayoutJ.addView(textView);
        TextView textView2 = new TextView(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        q9i.a(q9i.i, textView2);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setText(R.string.oneme_poll_finish__subtitle);
        n1g.N(new xc9(i2, lq4Var, 9), textView2);
        linearLayoutJ.addView(textView2);
        cyb cybVar = new cyb(linearLayoutJ.getContext());
        cybVar.setId(R.id.oneme_poll_finish__confirm_button);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams3.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        cybVar.setLayoutParams(layoutParams3);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_poll_finish__confirm_button));
        final int i3 = 0;
        qe7.H(cybVar, 300L, new View.OnClickListener(this) { // from class: b8d
            public final /* synthetic */ PollFinishBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                PollFinishBottomSheet pollFinishBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = PollFinishBottomSheet.B;
                        k8d k8dVar = (k8d) pollFinishBottomSheet.z.getValue();
                        sgg sggVar = k8dVar.i;
                        if (sggVar == null || !sggVar.isActive()) {
                            a8j.t(k8dVar, ((n0c) ((xhh) k8dVar.f.getValue())).a(), new j8d(k8dVar, null, 0), 2);
                            k8dVar.i = a8j.t(k8dVar, ((n0c) ((xhh) k8dVar.f.getValue())).b(), new j8d(k8dVar, null, 1), 2);
                            break;
                        } else {
                            String str = k8dVar.h;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "finish poll cancelled cuz finish already started", null);
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = PollFinishBottomSheet.B;
                        pollFinishBottomSheet.v1(true);
                        break;
                }
            }
        });
        linearLayoutJ.addView(cybVar);
        cyb cybVar2 = new cyb(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams4.rightMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        cybVar2.setLayoutParams(layoutParams4);
        cybVar2.setSize(aybVar);
        cybVar2.setAppearance(zxb.SECONDARY);
        cybVar2.setText(np4.q(cybVar2.getContext(), R.string.oneme_poll_finish__deny_button));
        qe7.H(cybVar2, 300L, new View.OnClickListener(this) { // from class: b8d
            public final /* synthetic */ PollFinishBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                PollFinishBottomSheet pollFinishBottomSheet = this.b;
                switch (i4) {
                    case 0:
                        zv8[] zv8VarArr = PollFinishBottomSheet.B;
                        k8d k8dVar = (k8d) pollFinishBottomSheet.z.getValue();
                        sgg sggVar = k8dVar.i;
                        if (sggVar == null || !sggVar.isActive()) {
                            a8j.t(k8dVar, ((n0c) ((xhh) k8dVar.f.getValue())).a(), new j8d(k8dVar, null, 0), 2);
                            k8dVar.i = a8j.t(k8dVar, ((n0c) ((xhh) k8dVar.f.getValue())).b(), new j8d(k8dVar, null, 1), 2);
                            break;
                        } else {
                            String str = k8dVar.h;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str, "finish poll cancelled cuz finish already started", null);
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        zv8[] zv8VarArr2 = PollFinishBottomSheet.B;
                        pollFinishBottomSheet.v1(true);
                        break;
                }
            }
        });
        linearLayoutJ.addView(cybVar2);
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ny8 ny8Var = this.z;
        r8e r8eVar = ((k8d) ny8Var.getValue()).k;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new c8d(null, this, 0), i), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((k8d) ny8Var.getValue()).l, getViewLifecycleOwner().f(), n09Var), new c8d(null, this, 1), i), getViewLifecycleScope());
    }

    public PollFinishBottomSheet(t3f t3fVar, long j, long j2, long j3) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("chat_id", Long.valueOf(j)), new ylc("message_id", Long.valueOf(j2)), new ylc("poll_id", Long.valueOf(j3))));
    }
}
