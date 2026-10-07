package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ek6 extends tq0 {
    public Long a;
    public zj6 b;
    public final ArrayList c;
    public cf7 d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final LinearLayout i;
    public final TextView j;
    public final LinearLayout k;
    public final FrameLayout l;
    public final LinearLayout m;
    public final q0g n;
    public final LinearLayout o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ImageView t;
    public final TextView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
    public ek6(Context context) {
        super(context, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 6);
        int i = 6;
        this.c = new ArrayList();
        ImageView imageViewD = qv1.d(context, R.id.messages_list_fake_boss_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        imageViewD.setLayoutParams(layoutParams);
        imageViewD.setImageResource(R.drawable.ic_warning_triangle_color);
        this.e = imageViewD;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        layoutParams2.gravity = 1;
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setText(R.string.oneme_not_contact_warning);
        q9i.a(q9i.d, textView);
        this.f = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        float f = 4.0f;
        layoutParams3.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        textView2.setLayoutParams(layoutParams3);
        noh nohVar = q9i.i;
        q9i.a(nohVar, textView2);
        this.g = textView2;
        TextView textViewE = qv1.e(context, R.id.messages_list_fake_boss_country);
        textViewE.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        q9i.a(nohVar, textViewE);
        this.h = textViewE;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView2);
        linearLayout.addView(textViewE);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.messages_list_fake_boss_phone);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.addView(a(R.string.phone_number));
        linearLayout2.addView(linearLayout);
        this.i = linearLayout2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        q9i.a(nohVar, textView3);
        this.j = textView3;
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setId(R.id.messages_list_fake_boss_registration_date);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        linearLayout3.setLayoutParams(layoutParams4);
        linearLayout3.setOrientation(0);
        linearLayout3.addView(a(R.string.fake_boss_registration));
        linearLayout3.addView(textView3);
        this.k = linearLayout3;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.l = frameLayout;
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setId(R.id.messages_list_fake_boss_mutual_chats);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        linearLayout4.setLayoutParams(layoutParams5);
        linearLayout4.setOrientation(0);
        linearLayout4.addView(a(R.string.common_chats_title));
        linearLayout4.addView(frameLayout);
        this.m = linearLayout4;
        q0g q0gVar = new q0g(context);
        q0gVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setOrientation(1);
        int i2 = 0;
        while (true) {
            a8g a8gVar = pq3.j;
            if (i2 >= 3) {
                float f2 = f;
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                frameLayout2.setBackground(qyj.T(Integer.valueOf(((fn8) a8gVar.h(frameLayout2).u().c.b).c), null, null, gm0.K(yl5.d().getDisplayMetrics().density * f2)));
                TextView textView4 = new TextView(frameLayout2.getContext());
                textView4.setText(R.string.fake_boss_show_mutual_chats);
                noh nohVar2 = q9i.i;
                q9i.a(nohVar2, textView4);
                textView4.setVisibility(4);
                frameLayout2.addView(textView4, new LinearLayout.LayoutParams(-2, -2));
                linearLayout5.addView(frameLayout2);
                q0gVar.addView(linearLayout5);
                this.n = q0gVar;
                LinearLayout linearLayout6 = new LinearLayout(context);
                linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout6.setOrientation(1);
                int i3 = 8;
                linearLayout6.setVisibility(8);
                this.o = linearLayout6;
                this.p = rx8.P(3, new n52(context, i));
                this.q = rx8.P(3, new n52(context, 7));
                this.r = rx8.P(3, new n52(context, i3));
                this.s = rx8.P(3, new dx4(context, i3, this));
                ImageView imageView = new ImageView(context);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 16.0f));
                layoutParams6.gravity = 16;
                layoutParams6.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * f2);
                imageView.setLayoutParams(layoutParams6);
                imageView.setImageResource(R.drawable.icon_info);
                this.t = imageView;
                TextView textView5 = new TextView(context);
                textView5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                q9i.a(nohVar2, textView5);
                this.u = textView5;
                LinearLayout linearLayout7 = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams7.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
                layoutParams7.gravity = 1;
                linearLayout7.setLayoutParams(layoutParams7);
                linearLayout7.setOrientation(0);
                linearLayout7.addView(imageView);
                linearLayout7.addView(textView5);
                addView(this.e);
                addView(this.f);
                addView(this.i);
                addView(this.k);
                addView(this.m);
                addView(linearLayout7);
                this.l.addView(q0gVar);
                this.l.addView(linearLayout6);
                onThemeChanged(a8gVar.h(this));
                return;
            }
            FrameLayout frameLayout3 = new FrameLayout(getContext());
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            float f3 = f;
            layoutParams8.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * f3);
            frameLayout3.setLayoutParams(layoutParams8);
            frameLayout3.setBackground(qyj.T(Integer.valueOf(((fn8) a8gVar.h(frameLayout3).u().c.b).c), null, null, gm0.K(yl5.d().getDisplayMetrics().density * f3)));
            TextView textView6 = new TextView(frameLayout3.getContext());
            textView6.setText(" ");
            q9i.a(q9i.i, textView6);
            textView6.setVisibility(4);
            frameLayout3.addView(textView6, new LinearLayout.LayoutParams(-1, -2));
            linearLayout5.addView(frameLayout3);
            i2++;
            f = f3;
        }
    }

    public final TextView a(int i) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(120.0f * yl5.d().getDisplayMetrics().density), -2);
        layoutParams.rightMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(5);
        textView.setTextAlignment(3);
        textView.setText(i);
        q9i.a(q9i.i, textView);
        n1g.N(new dk6(3, null, 0), textView);
        return textView;
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        a8g a8gVar = pq3.j;
        int i = a8gVar.h(this).getText().b;
        int i2 = a8gVar.h(this).getText().d;
        int i3 = a8gVar.h(this).getIcon().d;
        this.f.setTextColor(i);
        zj6 zj6Var = this.b;
        String str = zj6Var != null ? zj6Var.b : null;
        this.g.setTextColor((str == null || str.length() == 0) ? a8gVar.h(this).getText().j : i);
        this.h.setTextColor(i);
        this.j.setTextColor(i);
        zj6 zj6Var2 = this.b;
        if (zj6Var2 != null && (zj6Var2.e instanceof ak6)) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((TextView) it.next()).setTextColor(i);
            }
        }
        ex8 ex8Var = new ex8(28);
        m0g m0gVar = (m0g) ex8Var.b;
        m0gVar.j = false;
        ex8Var.N(900L);
        ex8Var.M(((fn8) kbcVar.u().c.b).c);
        m0gVar.d = kbcVar.b().c;
        ex8Var.L(1.0f);
        this.n.a(ex8Var.s());
        ny8 ny8Var = this.q;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setTextColor(i2);
        }
        ny8 ny8Var2 = this.r;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setImageTintList(ColorStateList.valueOf(i3));
        }
        this.t.setImageTintList(ColorStateList.valueOf(i3));
        this.u.setTextColor(i2);
    }

    public final void setShowContactProfileListener(cf7 cf7Var) {
        this.d = cf7Var;
    }

    public final void setState(zj6 zj6Var) {
        ck6 ck6Var = zj6Var.e;
        this.b = zj6Var;
        this.a = Long.valueOf(zj6Var.a);
        String str = zj6Var.b;
        CharSequence charSequence = zj6Var.c;
        a8g a8gVar = pq3.j;
        TextView textView = this.g;
        if (str == null || str.length() == 0) {
            textView.setText(R.string.phone_number_hidden);
            textView.setTextColor(a8gVar.h(textView).getText().j);
        } else {
            textView.setText(str);
            textView.setTextColor(a8gVar.h(textView).getText().b);
        }
        this.h.setText(charSequence);
        this.j.setText(zj6Var.d);
        boolean z = ck6Var instanceof bk6;
        q0g q0gVar = this.n;
        LinearLayout linearLayout = this.o;
        if (z) {
            q0gVar.setVisibility(0);
            linearLayout.setVisibility(8);
            q0gVar.b.c();
        } else {
            if (!(ck6Var instanceof ak6)) {
                ore.o();
                return;
            }
            q0gVar.b();
            q0gVar.setVisibility(8);
            linearLayout.setVisibility(0);
            u8b u8bVar = ((ak6) ck6Var).a;
            ny8 ny8Var = this.p;
            if (ny8Var.d() && cqk.d(((TextView) ny8Var.getValue()).getParent(), linearLayout)) {
                linearLayout.removeView((View) ny8Var.getValue());
            }
            boolean zI = u8bVar.i();
            ArrayList arrayList = this.c;
            ny8 ny8Var2 = this.s;
            if (zI) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linearLayout.removeView((TextView) it.next());
                }
                arrayList.clear();
                if (ny8Var2.d() && cqk.d(((LinearLayout) ny8Var2.getValue()).getParent(), linearLayout)) {
                    linearLayout.removeView((View) ny8Var2.getValue());
                }
                linearLayout.addView((View) ny8Var.getValue());
            } else {
                if (((LinearLayout) ny8Var2.getValue()).getParent() == null) {
                    linearLayout.addView((View) ny8Var2.getValue());
                }
                hj8 hj8VarF0 = oc9.f0(0, u8bVar.b);
                int i = hj8VarF0.a;
                int i2 = hj8VarF0.b;
                if (i <= i2) {
                    while (true) {
                        if (i < arrayList.size()) {
                            TextView textView2 = (TextView) arrayList.get(i);
                            textView2.setText((CharSequence) u8bVar.g(i));
                            textView2.setVisibility(0);
                        } else {
                            String str2 = (String) u8bVar.g(i);
                            TextView textView3 = new TextView(getContext());
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.bottomMargin = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                            textView3.setLayoutParams(layoutParams);
                            textView3.setText(str2);
                            textView3.setMaxLines(1);
                            textView3.setEllipsize(TextUtils.TruncateAt.END);
                            textView3.setTextColor(p.d(textView3, q9i.i, a8gVar, textView3).b);
                            linearLayout.addView(textView3, i);
                            arrayList.add(textView3);
                        }
                        if (i == i2) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                int size = arrayList.size();
                int i3 = u8bVar.b;
                if (size > i3) {
                    List listT1 = ww3.T1(arrayList.subList(i3, arrayList.size()));
                    Iterator it2 = listT1.iterator();
                    while (it2.hasNext()) {
                        linearLayout.removeView((TextView) it2.next());
                    }
                    Iterator it3 = listT1.iterator();
                    while (it3.hasNext()) {
                        arrayList.remove((TextView) it3.next());
                    }
                }
            }
        }
        int i4 = zj6Var.f;
        int i5 = zj6Var.g;
        this.u.setText(i4);
        this.t.setImageResource(i5);
    }
}
