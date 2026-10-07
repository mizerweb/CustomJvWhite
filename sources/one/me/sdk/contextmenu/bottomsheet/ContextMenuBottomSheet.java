package one.me.sdk.contextmenu.bottomsheet;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.bb;
import defpackage.br4;
import defpackage.dwd;
import defpackage.er3;
import defpackage.f7;
import defpackage.gm0;
import defpackage.hve;
import defpackage.j22;
import defpackage.ln5;
import defpackage.lve;
import defpackage.mpl;
import defpackage.n1g;
import defpackage.p;
import defpackage.pe3;
import defpackage.q9i;
import defpackage.qp4;
import defpackage.r66;
import defpackage.tre;
import defpackage.tv7;
import defpackage.v30;
import defpackage.vv;
import defpackage.yl5;
import defpackage.ynh;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.Collection;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lone/me/sdk/contextmenu/bottomsheet/ContextMenuBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lqp4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "up4", "context-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContextMenuBottomSheet extends BottomSheetWidget implements qp4 {
    public static final /* synthetic */ zv8[] C = {new dwd(ContextMenuBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), zo5.f(zfe.a, ContextMenuBottomSheet.class, "anchorViewId", "getAnchorViewId()Ljava/lang/Integer;", 0), new dwd(ContextMenuBottomSheet.class, "anchorClass", "getAnchorClass()Ljava/lang/Class;", 0), new dwd(ContextMenuBottomSheet.class, "highlightPadding", "getHighlightPadding()Landroid/graphics/Rect;", 0), new dwd(ContextMenuBottomSheet.class, "highlightRadius", "getHighlightRadius()Ljava/lang/Float;", 0), new dwd(ContextMenuBottomSheet.class, "parentId", "getParentId()Ljava/lang/Integer;", 0), new z8b(ContextMenuBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final vv A;
    public final er3 B;
    public final vv u;
    public final vv v;
    public final vv w;
    public final vv x;
    public final vv y;
    public final vv z;

    public ContextMenuBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv(Bundle.class, null, ApiProtocol.PARAM_PAYLOAD);
        Class<Integer> cls = Integer.class;
        this.v = new vv("anchor_id", cls);
        this.w = new vv("anchor_class", Class.class);
        this.x = new vv("highlight_padding", Rect.class);
        this.y = new vv("highlight_radius", Float.class);
        this.z = new vv("parent_id", cls);
        this.A = new vv(Boolean.class, Boolean.FALSE, "callback_sent");
        this.B = new er3();
        BaseBottomSheetWidget.i.getClass();
        B1(bundle.getBoolean(BaseBottomSheetWidget.k, false));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ynh ynhVar = (ynh) ((Parcelable) tre.f0(getArgs(), "header", ynh.class));
        byte b = 0;
        CharSequence charSequenceB = ynhVar != null ? ynhVar.b(linearLayout.getContext()) : null;
        if (charSequenceB != null) {
            TextView textView = new TextView(linearLayout.getContext());
            q9i.a(q9i.d, textView);
            textView.setText(charSequenceB);
            textView.setGravity(17);
            textView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), textView.getPaddingTop(), gm0.K(32.0f * yl5.d().getDisplayMetrics().density), textView.getPaddingBottom());
            n1g.N(new f7(3, b == true ? 1 : 0, 16), textView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
            layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
            linearLayout.addView(textView, layoutParams);
        }
        Context context = layoutInflater.getContext();
        Bundle bundle = getArgs().getBundle("actions");
        Collection collectionB = bundle != null ? mpl.b(bundle) : null;
        if (collectionB == null) {
            collectionB = r66.a;
        }
        j22 j22Var = new j22(25, this);
        this.B.getClass();
        linearLayout.addView(er3.C(context, collectionB, j22Var));
        return linearLayout;
    }

    @Override // defpackage.qp4
    public final void dismiss() {
        v1(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        ln5 ln5Var = new ln5(this, new pe3(18, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
        } else {
            addLifecycleListener(new bb(this, ln5Var, 2));
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        zv8[] zv8VarArr = C;
        zv8 zv8Var = zv8VarArr[1];
        Integer num = (Integer) this.v.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            zv8 zv8Var2 = zv8VarArr[2];
            Class cls = (Class) this.w.a(this);
            if (cls == null) {
                return;
            }
            v30 v30Var = new v30(iIntValue, cls);
            v30Var.d(this);
            tv7 tv7Var = new tv7(v30Var);
            zv8 zv8Var3 = zv8VarArr[3];
            Rect rect = (Rect) this.x.a(this);
            zv8 zv8Var4 = zv8VarArr[4];
            Float f = (Float) this.y.a(this);
            zv8 zv8Var5 = zv8VarArr[5];
            tv7Var.a(view, rect, f, (Integer) this.z.a(this));
        }
    }

    @Override // defpackage.qp4
    public final void u(Widget widget) {
        setTargetController(widget);
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarU1 = rootController != null ? rootController.u1() : null;
        if (hveVarU1 != null) {
            lve lveVar = new lve(this, null, null, null, false, -1);
            p.k(false, lveVar, true, "BottomSheetWidget");
            hveVarU1.I(lveVar);
        }
    }
}
