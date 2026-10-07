package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.util.Collection;
import java.util.Iterator;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ri implements qp4 {
    public static final s8 f = new s8();
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public ri(ux0 ux0Var, si siVar, boolean z) {
        this.b = ux0Var;
        this.c = siVar;
        this.a = z;
        ft0 ft0Var = new ft0(this);
        this.e = ft0Var;
        this.d = new ae7(siVar, z, ft0Var);
    }

    @Override // defpackage.qp4
    public void C() {
        View viewFindViewById;
        cq4 cq4Var = (cq4) this.d;
        if (cq4Var == null || (viewFindViewById = cq4Var.findViewById(R.id.context_menu_card_id)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public boolean a(Bitmap bitmap, int i) {
        try {
            ((ae7) this.d).q(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!pj6.a.h(6)) {
                return false;
            }
            pj6.a.e(ri.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    @Override // defpackage.qp4
    public void dismiss() {
        PopupWindow popupWindow = (PopupWindow) this.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.PopupWindow, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.view.View, android.view.ViewGroup, gcd] */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.view.ViewGroup, cq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // defpackage.qp4
    public void u(Widget widget) {
        Activity activity;
        View view;
        boolean z;
        ?? r8;
        int iK;
        ?? r5;
        ?? linearLayout;
        zp4 zp4Var = (zp4) this.b;
        boolean z2 = zp4Var.t;
        boolean z3 = zp4Var.j;
        if (((PopupWindow) this.c) != null || (activity = widget.getActivity()) == null || (view = widget.getView()) == null) {
            return;
        }
        a8g a8gVar = pq3.j;
        kbc kbcVarM = z3 ? a8gVar.k(activity).b : a8gVar.e(activity).m();
        ?? cq4Var = new cq4(kbcVarM, activity, this, zp4Var.i);
        w14 w14Var = new w14(this, 8, widget);
        ?? gcdVar = zp4Var.u;
        Collection collection = zp4Var.c;
        if (gcdVar != 0) {
            gcdVar.setId(R.id.context_menu_card_id);
        } else {
            gcdVar = new gcd(activity, z3);
            gcdVar.setId(R.id.context_menu_card_id);
            Collection<rp4> collection2 = collection;
            if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                Iterator it = collection2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((rp4) it.next()).d != null) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            ynh ynhVar = zp4Var.b;
            if (ynhVar != null) {
                bq4 bq4Var = new bq4(activity, 0);
                q9i.a(q9i.e, bq4Var);
                bq4Var.setMaxLines(1);
                bq4Var.setEllipsize(TextUtils.TruncateAt.END);
                bq4Var.setText(ynhVar.b(activity));
                bq4Var.onThemeChanged(kbcVarM);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                gcdVar.addView(bq4Var, layoutParams);
            }
            for (rp4 rp4Var : collection2) {
                fcd fcdVar = new fcd(activity, z3);
                ynh ynhVar2 = rp4Var.b;
                Integer num = rp4Var.d;
                fcdVar.c(fcdVar, ynhVar2, rp4Var.c, num != null, z);
                fcdVar.b(num, rp4Var.e);
                qe7.H(fcdVar, 300L, new ee(w14Var, 24, rp4Var));
                gcdVar.addView(fcdVar, -1, -2);
            }
        }
        View view2 = zp4Var.r;
        if (view2 != null) {
            linearLayout = new LinearLayout(activity);
            linearLayout.setId(R.id.context_menu_container_id);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            linearLayout.addView(view2, layoutParams2);
            linearLayout.addView(gcdVar, new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 250.0f), -2));
        } else {
            r8 = gcdVar;
        }
        if (view2 == null && !z2) {
            iK = gm0.K(yl5.d().getDisplayMetrics().density * 250.0f);
        } else {
            r8 = linearLayout;
            iK = -2;
        }
        if (z2) {
            gcdVar.setMinimumWidth(gm0.K(250.0f * yl5.d().getDisplayMetrics().density));
        }
        r8.setVisibility(4);
        if (zp4Var.o) {
            Drawable background = cq4Var.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            if (colorDrawable != null) {
                r5 = 0;
                colorDrawable.setAlpha(0);
            } else {
                r5 = 0;
            }
        } else {
            r5 = 0;
        }
        cq4Var.addView(r8, new FrameLayout.LayoutParams(iK, -2, 8388659));
        ?? popupWindow = new PopupWindow((View) cq4Var, -1, -1, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(r5));
        popupWindow.setClippingEnabled(r5);
        popupWindow.setOutsideTouchable(r5);
        popupWindow.setInputMethodMode(2);
        popupWindow.setSoftInputMode(48);
        popupWindow.setAnimationStyle(r5);
        popupWindow.setOnDismissListener(new f21(this, 1, widget));
        this.d = cq4Var;
        this.c = popupWindow;
        aq4 aq4Var = new aq4(r5, this);
        this.e = aq4Var;
        widget.addLifecycleListener(aq4Var);
        popupWindow.showAtLocation(view, 8388659, r5, r5);
        cq4Var.post(new xp4(this, widget, cq4Var, r8, gcdVar, view, 0));
    }

    public ri(uvc uvcVar, vog vogVar, c4h c4hVar, k1k k1kVar, px8 px8Var) {
        this.b = uvcVar;
        this.c = vogVar;
        this.d = c4hVar;
        this.e = k1kVar;
    }

    public ri(zp4 zp4Var) {
        this.b = zp4Var;
    }

    public ri(jj6 jj6Var, b87 b87Var, dth dthVar, b8h b8hVar, boolean z) {
        this.b = jj6Var;
        this.c = b87Var;
        this.d = dthVar;
        this.e = b8hVar;
        this.a = z;
    }
}
