package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class rc4 extends LinearLayout implements eph {
    public final kwb a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final sbi e;
    public final LinkedHashMap f;
    public final /* synthetic */ ConfirmationBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:105:0x0385  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, rc4] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, cyb] */
    public rc4(ConfirmationBottomSheet confirmationBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Integer num, Context context) throws Throwable {
        kwb kwbVar;
        ImageView imageView;
        float f;
        float f2;
        TextView textView;
        sbi sbiVar;
        boolean z;
        char c;
        ?? textView2;
        byte b;
        int i;
        ayb aybVar;
        ynh ynhVarF1;
        int iK;
        super(context);
        this.g = confirmationBottomSheet;
        vv vvVar = confirmationBottomSheet.v;
        zv8 zv8Var = ConfirmationBottomSheet.G[1];
        ic4 ic4Var = (ic4) vvVar.a(confirmationBottomSheet);
        Throwable th = null;
        if (ic4Var != null) {
            kwbVar = new kwb(getContext());
            kwb.w(kwbVar, gm0.K(yl5.d().getDisplayMetrics().density * 80.0f));
            kwbVar.setAvatarShape(awb.a);
            kwb.v(kwbVar, ic4Var.a, Long.valueOf(ic4Var.b), ic4Var.c);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(yl5.d().getDisplayMetrics().density * 80.0f));
            layoutParams.gravity = 1;
            layoutParams.topMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
            addView(kwbVar, layoutParams);
        } else {
            kwbVar = null;
        }
        this.a = kwbVar;
        pc4 pc4VarG1 = confirmationBottomSheet.G1();
        boolean z2 = false;
        char c2 = 2;
        if (pc4VarG1 != null) {
            imageView = new ImageView(getContext());
            int iD = qt4.D(pc4VarG1.getSize());
            if (iD == 0) {
                iK = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
            } else if (iD == 1) {
                iK = gm0.K(21.0f * yl5.d().getDisplayMetrics().density);
            } else {
                if (iD != 2) {
                    ore.o();
                    throw null;
                }
                iK = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
            }
            imageView.setPadding(iK, iK, iK, iK);
            if (pc4VarG1 instanceof nc4) {
                nc4 nc4Var = (nc4) pc4VarG1;
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(imageView.getContext(), nc4Var.a);
                Iterator it = nc4Var.b.iterator();
                while (it.hasNext()) {
                    lvb.A0(enhancedAnimatedVectorDrawable, (String) it.next(), nc4Var.e);
                }
                List<String> list = nc4Var.g;
                if (list != null) {
                    for (String str : list) {
                        Integer num2 = nc4Var.f;
                        if (num2 != null) {
                            lvb.A0(enhancedAnimatedVectorDrawable, str, num2.intValue());
                        }
                    }
                }
                imageView.setImageDrawable(enhancedAnimatedVectorDrawable);
                if (imageView.isAttachedToWindow()) {
                    imageView.postDelayed(new sc4(enhancedAnimatedVectorDrawable, 0), nc4Var.h);
                } else {
                    imageView.addOnAttachStateChangeListener(new tc4(imageView, imageView, nc4Var, enhancedAnimatedVectorDrawable, 0));
                }
            } else {
                if (!(pc4VarG1 instanceof oc4)) {
                    ore.o();
                    throw null;
                }
                imageView.setImageResource(((oc4) pc4VarG1).a);
            }
            ConfirmationBottomSheet.J1(imageView, pc4VarG1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
            layoutParams2.gravity = 1;
            layoutParams2.topMargin = gm0.K(27.0f * yl5.d().getDisplayMetrics().density);
            layoutParams2.bottomMargin = gm0.K(5.0f * yl5.d().getDisplayMetrics().density);
            addView(imageView, layoutParams2);
        } else {
            imageView = null;
        }
        this.b = imageView;
        TextView textView3 = new TextView(getContext());
        q9i.a(q9i.c, textView3);
        textView3.setText(charSequence);
        int i2 = 17;
        textView3.setGravity(17);
        float f3 = 12.0f;
        textView3.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView3.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView3.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = confirmationBottomSheet.G1() == null ? gm0.K(24.0f * yl5.d().getDisplayMetrics().density) : gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        if (confirmationBottomSheet.F1() == null || ((ynhVarF1 = confirmationBottomSheet.F1()) != null && ynhVarF1 == ynh.b)) {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 16.0f;
        } else {
            f = yl5.d().getDisplayMetrics().density;
            f2 = 8.0f;
        }
        layoutParams3.bottomMargin = gm0.K(f2 * f);
        addView(textView3, layoutParams3);
        this.c = textView3;
        if (charSequence2 == null || charSequence2.length() == 0) {
            textView = null;
        } else {
            textView = new TextView(getContext());
            q9i.a(q9i.e, textView);
            textView.setText(charSequence2);
            textView.setGravity(17);
            textView.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), textView.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.gravity = 17;
            layoutParams4.bottomMargin = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
            addView(textView, layoutParams4);
        }
        this.d = textView;
        vv vvVar2 = confirmationBottomSheet.z;
        zv8 zv8Var2 = ConfirmationBottomSheet.G[5];
        lc4 lc4Var = (lc4) vvVar2.a(confirmationBottomSheet);
        if (lc4Var != null) {
            zo3 zo3Var = new zo3(getContext());
            zo3Var.setText(lc4Var.a);
            zo3Var.setChecked(lc4Var.b);
            addView(zo3Var);
            confirmationBottomSheet.D = zo3Var;
            sbiVar = sbi.a;
        } else {
            sbiVar = null;
        }
        this.e = sbiVar;
        int iP0 = wm9.P0(yw3.W0(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0 < 16 ? 16 : iP0);
        for (Object obj : arrayList) {
            kc4 kc4Var = (kc4) obj;
            int i3 = kc4Var.a;
            ynh ynhVar = kc4Var.b;
            Throwable th2 = th;
            int i4 = kc4Var.c;
            float f4 = f3;
            boolean z3 = kc4Var.d;
            int i5 = kc4Var.e;
            int i6 = kc4Var.f;
            if (z3) {
                String strB = ynhVar.b(getContext());
                boolean z4 = (num != null && i3 == num.intValue()) ? true : z2;
                kbc kbcVarT1 = confirmationBottomSheet.t1();
                textView2 = new cyb(getContext());
                if (kbcVarT1 != null) {
                    textView2.setCustomTheme(kbcVarT1);
                }
                textView2.setText(strB == null ? "" : strB);
                zxb zxbVar = zxb.PRIMARY;
                zxb zxbVar2 = i4 == 3 ? zxbVar : zxb.SECONDARY;
                int i7 = i6 == 0 ? -1 : qc4.$EnumSwitchMapping$3[qt4.D(i6)];
                zxb zxbVar3 = zxb.DESTRUCTIVE;
                if (i7 == -1) {
                    int iD2 = qt4.D(i4);
                    if (iD2 == 0) {
                        zxbVar = zxbVar3;
                    } else if (iD2 == 1 || iD2 == 2) {
                        zxbVar = zxbVar2;
                    } else if (iD2 != 3) {
                        ore.o();
                        throw th2;
                    }
                } else if (i7 != 1) {
                    if (i7 != 2 && i7 != 3 && i7 != 4) {
                        ore.o();
                        throw th2;
                    }
                    zxbVar = zxbVar2;
                } else {
                    zxbVar = zxbVar3;
                }
                textView2.setAppearance(zxbVar);
                int i8 = i5 == 0 ? -1 : qc4.$EnumSwitchMapping$4[qt4.D(i5)];
                if (i8 != 1) {
                    c = 2;
                    aybVar = (i8 == 2 || i8 != 3) ? ayb.h : ayb.g;
                } else {
                    c = 2;
                    aybVar = ayb.i;
                }
                textView2.setSize(aybVar);
                z = false;
                qe7.H(textView2, 300L, new hc4(confirmationBottomSheet, i3, 0));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.gravity = 17;
                layoutParams5.bottomMargin = gm0.K(f4 * yl5.d().getDisplayMetrics().density);
                if (z4 && confirmationBottomSheet.F1() == null) {
                    layoutParams5.topMargin = gm0.K(f4 * yl5.d().getDisplayMetrics().density);
                }
                addView(textView2, layoutParams5);
                b = -2;
                i = 17;
            } else {
                z = z2;
                c = c2;
                CharSequence charSequenceB = ynhVar.b(getContext());
                textView2 = new TextView(getContext());
                q9i.a(q9i.p, textView2);
                textView2.setText(charSequenceB);
                textView2.setGravity(17);
                qe7.H(textView2, 300L, new hc4(confirmationBottomSheet, i3, 1));
                textView2.setPadding(textView2.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 15.0f), textView2.getPaddingRight(), gm0.K(15.0f * yl5.d().getDisplayMetrics().density));
                b = -2;
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                i = 17;
                layoutParams6.gravity = 17;
                addView(textView2, layoutParams6);
            }
            linkedHashMap.put(textView2, obj);
            z2 = z;
            c2 = c;
            i2 = i;
            f3 = f4;
            th = th2;
        }
        this.f = linkedHashMap;
        setOrientation(1);
        setGravity(i2);
        kbc kbcVarT2 = confirmationBottomSheet.t1();
        onThemeChanged(kbcVarT2 == null ? pq3.j.h(this) : kbcVarT2);
    }

    public final kwb getAvatarView() {
        return this.a;
    }

    public final Map<View, kc4> getButtonViews() {
        return this.f;
    }

    public final TextView getDescriptionView() {
        return this.d;
    }

    public final ImageView getIconView() {
        return this.b;
    }

    public final sbi getOptionView() {
        return this.e;
    }

    public final TextView getTitleView() {
        return this.c;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i;
        ConfirmationBottomSheet confirmationBottomSheet = this.g;
        kbc kbcVarT1 = confirmationBottomSheet.t1();
        if (kbcVarT1 != null) {
            kbcVar = kbcVarT1;
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            ConfirmationBottomSheet.J1(imageView, confirmationBottomSheet.G1());
        }
        this.c.setTextColor(kbcVar.getText().b);
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(kbcVar.getText().c);
        }
        for (Map.Entry entry : this.f.entrySet()) {
            View view = (View) entry.getKey();
            kc4 kc4Var = (kc4) entry.getValue();
            if (view instanceof cyb) {
                ((cyb) view).e();
            } else if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                int i2 = kc4Var.f;
                if ((i2 == 1 || i2 == 3) && kc4Var.d) {
                    i = kbcVar.getText().c;
                } else {
                    int iD = qt4.D(kc4Var.c);
                    if (iD == 0) {
                        i = kbcVar.getText().j;
                    } else if (iD == 1) {
                        i = kbcVar.getText().c;
                    } else if (iD == 2) {
                        i = kbcVar.getText().b;
                    } else {
                        if (iD != 3) {
                            ore.o();
                            return;
                        }
                        i = kbcVar.getText().h;
                    }
                }
                textView2.setTextColor(i);
            } else {
                continue;
            }
        }
    }
}
