package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.BitSet;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends ViewGroup implements eph, Animatable {
    public static final /* synthetic */ int s1 = 0;
    public final BitSet A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final kwb a;
    public final TextView b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final TextView g;
    public View.OnClickListener h;
    public final ny8 i;
    public final dnb j;
    public Drawable k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public boolean n1;
    public final ny8 o;
    public final e6 o1;
    public Animatable p;
    public long p1;
    public final ny8 q;
    public boolean q1;
    public final ny8 r;
    public osi r1;
    public final ny8 s;
    public final ny8 t;
    public final ny8 u;
    public final ny8 v;
    public final View w;
    public final View x;
    public final View y;
    public final BitSet z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(final Context context) {
        super(context, null, 0, 0);
        final int i = 0;
        kwb kwbVar = new kwb(context);
        kwbVar.setFocusable(0);
        kwb.w(kwbVar, gm0.K(56.0f * yl5.d().getDisplayMetrics().density));
        Rect rect = n7j.a;
        i7j.n(kwbVar, false);
        final int i2 = 2;
        kwbVar.setImportantForAccessibility(2);
        this.a = kwbVar;
        TextView textView = new TextView(context);
        q9i.a(q9i.f.h(), textView);
        a8g a8gVar = pq3.j;
        textView.setTextColor(a8gVar.h(textView).getText().b);
        textView.setSingleLine();
        np4.C(textView, false);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setFocusable(0);
        i7j.n(textView, false);
        this.b = textView;
        final int i3 = 3;
        this.c = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        final int i4 = 6;
        this.d = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        final int i5 = 7;
        this.e = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        final int i6 = 8;
        this.f = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i7) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        TextView textView2 = new TextView(context);
        q9i.a(q9i.i.h(), textView2);
        np4.C(textView2, false);
        textView2.setTextColor(a8gVar.h(textView2).getText().e);
        textView2.setFocusable(0);
        i7j.n(textView2, false);
        this.g = textView2;
        final int i7 = 1;
        this.i = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i8) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        dnb dnbVar = new dnb(context);
        dnbVar.setFocusable(0);
        this.j = dnbVar;
        this.l = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i2;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i8) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        this.m = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i8) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        this.n = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i8) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        this.o = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i2;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i8) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        this.q = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i3;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i8) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        this.r = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i3;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i8) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        final int i8 = 4;
        this.s = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i9) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        this.t = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i9) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        final int i9 = 5;
        this.u = rx8.P(3, new af7() { // from class: tu2
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
            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this;
                Context context2 = context;
                switch (i10) {
                    case 0:
                        rfb rfbVar = new rfb(context2);
                        rfbVar.g(q9i.g.h(), bx5.b);
                        rfbVar.setTextColor(a8gVar2.h(rfbVar).getText().d);
                        rfbVar.setMaxLinesValue(2);
                        rfbVar.setFocusable(0);
                        rfbVar.setFallbackLineSpace(false);
                        rfbVar.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect2 = n7j.a;
                        i7j.n(rfbVar, false);
                        xu2Var.addView(rfbVar, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return rfbVar;
                    case 1:
                        cyb cybVar = new cyb(context2);
                        cybVar.setSize(ayb.j);
                        cybVar.setAppearance(zxb.PRIMARY);
                        qe7.H(cybVar, 300L, new t8(14, xu2Var));
                        xu2Var.addView(cybVar);
                        return cybVar;
                    case 2:
                        oi oiVar = new oi(context2);
                        oiVar.setCallback(xu2Var);
                        oiVar.d(a8gVar2.h(xu2Var).getIcon().d, xu2Var.A.get(xu2Var.G) ? a8gVar2.e(context2).m().b().d : a8gVar2.e(context2).m().b().c);
                        return oiVar;
                    case 3:
                        qoh qohVar = new qoh(context2);
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        qohVar.setBounds(0, 0, iK, iK);
                        qohVar.setCallback(xu2Var);
                        return qohVar;
                    case 4:
                        umg umgVar = new umg(context2);
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        umgVar.setBounds(0, 0, iK2, iK2);
                        umgVar.setCallback(xu2Var);
                        return umgVar;
                    case 5:
                        et6 et6Var = new et6(context2);
                        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        et6Var.setBounds(0, 0, iK3, iK3);
                        et6Var.setCallback(xu2Var);
                        return et6Var;
                    case 6:
                        rfb rfbVar2 = new rfb(context2);
                        rfbVar2.g(q9i.g.h(), bx5.b);
                        rfbVar2.setTextColor(a8gVar2.h(rfbVar2).getText().d);
                        rfbVar2.setMaxLinesValue(2);
                        rfbVar2.setFocusable(0);
                        rfbVar2.setFallbackLineSpace(false);
                        rfbVar2.setEllipsizing(TextUtils.TruncateAt.END);
                        xu2Var.addView(rfbVar2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return rfbVar2;
                    case 7:
                        nz8 nz8Var = new nz8(context2);
                        nz8Var.g(q9i.g.h(), bx5.b);
                        nz8Var.setTextColor(a8gVar2.h(nz8Var).getText().d);
                        nz8Var.setMaxLinesValue(2);
                        nz8Var.setFocusable(0);
                        nz8Var.setFallbackLineSpace(false);
                        nz8Var.setEllipsizing(TextUtils.TruncateAt.END);
                        l8j.a(nz8Var);
                        xu2Var.addView(nz8Var, -1, -2);
                        xu2Var.h(xu2Var.z, true);
                        xu2Var.h(xu2Var.A, false);
                        return nz8Var;
                    default:
                        nz8 nz8Var2 = new nz8(context2);
                        nz8Var2.g(q9i.g.h(), bx5.b);
                        nz8Var2.setTextColor(a8gVar2.h(nz8Var2).getText().d);
                        nz8Var2.setMaxLinesValue(2);
                        nz8Var2.setFocusable(0);
                        nz8Var2.setFallbackLineSpace(false);
                        nz8Var2.setEllipsizing(TextUtils.TruncateAt.END);
                        Rect rect3 = n7j.a;
                        i7j.n(nz8Var2, false);
                        xu2Var.addView(nz8Var2, -1, -2);
                        xu2Var.k(xu2Var.z, true);
                        xu2Var.k(xu2Var.A, false);
                        return nz8Var2;
                }
            }
        });
        this.v = rx8.P(3, new af7(this) { // from class: uu2
            public final /* synthetic */ xu2 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                a8g a8gVar2 = pq3.j;
                xu2 xu2Var = this.b;
                switch (i10) {
                    case 0:
                        Drawable drawableMutate = xu2Var.getContext().getDrawable(R.drawable.icon_status_delivered).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate);
                        return drawableMutate;
                    case 1:
                        Drawable drawableMutate2 = xu2Var.getContext().getDrawable(R.drawable.icon_status_read).mutate();
                        sb8.m0(a8gVar2.h(xu2Var).getIcon().h, drawableMutate2);
                        return drawableMutate2;
                    case 2:
                        Drawable drawableMutate3 = xu2Var.getContext().getDrawable(R.drawable.icon_warning_fill).mutate();
                        sb8.m0(((fn8) a8gVar2.h(xu2Var).u().d.i).d, drawableMutate3);
                        return drawableMutate3;
                    case 3:
                        mc0 mc0Var = new mc0();
                        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        mc0Var.setBounds(0, 0, iK, iK);
                        mc0Var.setCallback(xu2Var);
                        return mc0Var;
                    case 4:
                        r1j r1jVar = new r1j();
                        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                        r1jVar.setBounds(0, 0, iK2, iK2);
                        r1jVar.setCallback(xu2Var);
                        return r1jVar;
                    default:
                        return new RippleDrawable(ColorStateList.valueOf(((bs0) a8gVar2.h(xu2Var).u().c.g).c), null, new ColorDrawable(-1));
                }
            }
        });
        View view = new View(context);
        Drawable drawableMutate = view.getContext().getDrawable(R.drawable.icon_pin_fill).mutate();
        sb8.m0(a8gVar.h(view).getIcon().e, drawableMutate);
        view.setBackground(drawableMutate);
        view.setFocusable(0);
        this.w = view;
        View view2 = new View(context);
        Drawable drawableMutate2 = view2.getContext().getDrawable(R.drawable.icon_notifications_crossed_fill).mutate();
        sb8.m0(a8gVar.h(view2).getIcon().e, drawableMutate2);
        view2.setBackground(drawableMutate2);
        view2.setFocusable(0);
        this.x = view2;
        View view3 = new View(context);
        view3.setBackground(new ColorDrawable(-16711936));
        view3.setFocusable(0);
        this.y = view3;
        BitSet bitSet = new BitSet(11);
        this.z = bitSet;
        BitSet bitSet2 = new BitSet(11);
        this.A = bitSet2;
        this.B = 1;
        this.C = 2;
        this.D = 3;
        this.E = 4;
        this.F = 5;
        this.G = 6;
        this.H = 7;
        this.I = 8;
        this.J = 9;
        this.K = 10;
        this.o1 = new e6(7, this);
        setBackground(getRippleDrawable());
        addView(kwbVar);
        addView(textView, -1, -2);
        addView(textView2);
        addView(view2);
        addView(dnbVar);
        addView(view);
        addView(view3);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 9.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(9.0f * yl5.d().getDisplayMetrics().density));
        bitSet.set(0, bitSet.size(), true);
        bitSet2.set(0, bitSet2.size(), false);
        setClipChildren(false);
        setClipToPadding(true);
        i7j.n(this, true);
    }

    private final w36 getActiveSubtitleView() {
        if (this.c.d()) {
            return getSubtitleView();
        }
        if (this.e.d()) {
            return getOldSubtitleView();
        }
        return null;
    }

    private final w36 getActiveTypingView() {
        if (this.d.d()) {
            return getTypingView();
        }
        if (this.f.d()) {
            return getOldTypingView();
        }
        return null;
    }

    private final nz8 getOldSubtitleView() {
        return (nz8) this.e.getValue();
    }

    private final nz8 getOldTypingView() {
        return (nz8) this.f.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.v.getValue();
    }

    private final rfb getSubtitleView() {
        return (rfb) this.c.getValue();
    }

    private final rfb getTypingView() {
        return (rfb) this.d.getValue();
    }

    private static /* synthetic */ void getViewsChanged$annotations() {
    }

    private static /* synthetic */ void getViewsVisible$annotations() {
    }

    public final int a(int i) {
        int iB = qv1.b(12.0f, yl5.d().getDisplayMetrics().density, this.a.getMeasuredWidth(), (i - getPaddingStart()) - getPaddingEnd());
        BitSet bitSet = this.A;
        int i2 = this.E;
        if (bitSet.get(i2)) {
            iB -= this.j.getMeasuredWidth();
        }
        int i3 = this.I;
        if (bitSet.get(i3)) {
            iB -= this.y.getMeasuredWidth();
        }
        int i4 = this.K;
        if (bitSet.get(i4)) {
            iB = qv1.b(12.0f, yl5.d().getDisplayMetrics().density, ((cyb) this.i.getValue()).getMeasuredWidth(), iB);
        }
        return (bitSet.get(i3) || bitSet.get(i2) || bitSet.get(i4)) ? zo5.D(12.0f, yl5.d().getDisplayMetrics().density, iB) : iB;
    }

    public final int b(int i) {
        float f;
        float f2;
        int iB = qv1.b(12.0f, yl5.d().getDisplayMetrics().density, this.a.getMeasuredWidth(), (i - getPaddingStart()) - getPaddingEnd()) - this.g.getMeasuredWidth();
        BitSet bitSet = this.A;
        int i2 = this.F;
        if (bitSet.get(i2)) {
            if (this.k != null) {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 16.0f;
            } else {
                f = yl5.d().getDisplayMetrics().density;
                f2 = 0.0f;
            }
            iB -= gm0.K(f2 * f);
        }
        boolean z = bitSet.get(i2);
        int i3 = this.D;
        if (z && bitSet.get(i3)) {
            iB = zo5.D(2.0f, yl5.d().getDisplayMetrics().density, iB);
        }
        int i4 = this.G;
        if (bitSet.get(i4)) {
            iB -= this.w.getMeasuredWidth();
            if (bitSet.get(i3) || bitSet.get(i2)) {
                iB = zo5.D(4.0f, yl5.d().getDisplayMetrics().density, iB);
            }
        }
        if (bitSet.get(this.H)) {
            iB = qv1.b(4.0f, yl5.d().getDisplayMetrics().density, this.x.getMeasuredWidth(), iB);
        }
        return (bitSet.get(i3) || bitSet.get(i2) || bitSet.get(i4)) ? zo5.D(12.0f, yl5.d().getDisplayMetrics().density, iB) : iB;
    }

    public final boolean c(String str) {
        View asView;
        if (str != null && str.length() != 0) {
            w36 activeSubtitleView = getActiveSubtitleView();
            float f = activeSubtitleView != null ? activeSubtitleView.f(str) : 0.0f;
            w36 activeSubtitleView2 = getActiveSubtitleView();
            if (f > ((activeSubtitleView2 == null || (asView = activeSubtitleView2.getAsView()) == null) ? 0 : asView.getMeasuredWidth())) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        View asView;
        View asView2;
        if (i < 0) {
            i = 0;
        }
        int iB = b(i);
        int iA = a(i);
        int iMakeMeasureSpec = iB <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
        TextView textView = this.b;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(textView.getLineHeight(), 1073741824);
        if (iA < 0) {
            iA = 0;
        }
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iA, Integer.MIN_VALUE);
        w36 activeSubtitleView = getActiveSubtitleView();
        int lineHeight = activeSubtitleView != null ? activeSubtitleView.getLineHeight() : 0;
        w36 activeSubtitleView2 = getActiveSubtitleView();
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(lineHeight * (activeSubtitleView2 != null ? activeSubtitleView2.getMaxLinesValue() : 2), Integer.MIN_VALUE);
        int i2 = this.B;
        BitSet bitSet = this.A;
        if (bitSet.get(i2)) {
            textView.forceLayout();
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (bitSet.get(this.C)) {
            w36 activeSubtitleView3 = getActiveSubtitleView();
            if (activeSubtitleView3 != null && (asView2 = activeSubtitleView3.getAsView()) != null) {
                asView2.forceLayout();
            }
            w36 activeSubtitleView4 = getActiveSubtitleView();
            if (activeSubtitleView4 != null && (asView = activeSubtitleView4.getAsView()) != null) {
                asView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
        }
        requestLayout();
        invalidate();
    }

    public final void e(Uri uri, CharSequence charSequence, Long l) {
        String string = uri != null ? uri.toString() : null;
        Long lValueOf = Long.valueOf(l.longValue());
        if (charSequence == null) {
            charSequence = "";
        }
        kwb.v(this.a, string, lValueOf, charSequence);
        this.z.set(0, true);
        requestLayout();
        this.A.set(0, true);
    }

    public final void f(BitSet bitSet, boolean z) {
        bitSet.set(this.E, z);
    }

    public final void g(CharSequence charSequence, boolean z) {
        w36 oldSubtitleView = z ? getOldSubtitleView() : getSubtitleView();
        CharSequence textValue = oldSubtitleView.getTextValue();
        BitSet bitSet = this.z;
        boolean z2 = true;
        if (textValue != charSequence) {
            oldSubtitleView.setTextValue(charSequence);
            h(bitSet, true);
        }
        BitSet bitSet2 = this.A;
        h(bitSet2, (charSequence == null || r5h.X0(charSequence) || bitSet2.get(this.J)) ? false : true);
        int i = this.C;
        if (!bitSet.get(i) && bitSet2.get(i) == oldSubtitleView.b()) {
            z2 = false;
        }
        bitSet.set(i, z2);
        oldSubtitleView.e(pq3.j.h(this));
        invalidate();
        requestLayout();
    }

    public final void h(BitSet bitSet, boolean z) {
        bitSet.set(this.C, z);
    }

    public final void i(int i, CharSequence charSequence, boolean z) {
        w36 oldTypingView = z ? getOldTypingView() : getTypingView();
        w36 oldSubtitleView = z ? getOldSubtitleView() : getSubtitleView();
        Animatable animatableL = l(i);
        CharSequence textValue = oldTypingView.getTextValue();
        BitSet bitSet = this.z;
        boolean z2 = true;
        if (textValue != charSequence) {
            oldTypingView.setTextValue(charSequence);
            k(bitSet, true);
        }
        Animatable animatable = this.p;
        a8g a8gVar = pq3.j;
        if (animatableL != animatable) {
            if (animatable != null) {
                animatable.stop();
            }
            this.p = animatableL;
            eph ephVar = animatableL instanceof eph ? (eph) animatableL : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(a8gVar.h(this));
            }
            k(bitSet, true);
        }
        boolean z3 = (charSequence == null || r5h.X0(charSequence)) ? false : true;
        BitSet bitSet2 = this.A;
        k(bitSet2, z3);
        CharSequence spannableText = oldSubtitleView.getSpannableText();
        int i2 = this.J;
        bitSet2.set(this.C, (spannableText == null || r5h.X0(spannableText) || bitSet2.get(i2)) ? false : true);
        if (!bitSet.get(i2) && bitSet2.get(i2) == oldSubtitleView.b()) {
            z2 = false;
        }
        bitSet.set(i2, z2);
        oldTypingView.e(a8gVar.h(this));
        if (bitSet.get(i2)) {
            Animatable animatable2 = this.p;
            if (animatable2 != null) {
                animatable2.start();
            }
        } else {
            this.p = null;
        }
        requestLayout();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Animatable animatable;
        w36 activeTypingView = getActiveTypingView();
        if (activeTypingView == null || !activeTypingView.b() || (animatable = this.p) == null || animatable == null || !animatable.isRunning()) {
            Object obj = this.k;
            Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
            if ((animatable2 == null || !animatable2.isRunning()) && !this.a.isRunning()) {
                return false;
            }
        }
        return true;
    }

    public final void j(dnh dnhVar, int i) {
        Animatable animatableL = l(i);
        int i2 = this.C;
        int i3 = this.J;
        boolean z = false;
        BitSet bitSet = this.z;
        BitSet bitSet2 = this.A;
        if (dnhVar != null) {
            getTypingView().setLayout(dnhVar);
            k(bitSet2, !r5h.X0(dnhVar.a.a().getText()));
            w36 activeSubtitleView = getActiveSubtitleView();
            CharSequence spannableText = activeSubtitleView != null ? activeSubtitleView.getSpannableText() : null;
            if (spannableText != null && !r5h.X0(spannableText) && !bitSet2.get(i3)) {
                z = true;
            }
            bitSet2.set(i2, z);
            k(bitSet, true);
        } else {
            k(bitSet2, false);
            w36 activeSubtitleView2 = getActiveSubtitleView();
            CharSequence spannableText2 = activeSubtitleView2 != null ? activeSubtitleView2.getSpannableText() : null;
            if (spannableText2 != null && !r5h.X0(spannableText2)) {
                z = true;
            }
            bitSet2.set(i2, z);
            k(bitSet, true);
        }
        Animatable animatable = this.p;
        if (animatableL != animatable) {
            if (animatable != null) {
                animatable.stop();
            }
            this.p = animatableL;
            eph ephVar = animatableL instanceof eph ? (eph) animatableL : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(pq3.j.h(this));
            }
            k(bitSet, true);
        }
        if (bitSet.get(i3)) {
            Animatable animatable2 = this.p;
            if (animatable2 != null) {
                animatable2.start();
            }
        } else {
            this.p = null;
        }
        requestLayout();
    }

    public final void k(BitSet bitSet, boolean z) {
        bitSet.set(this.J, z);
    }

    public final Animatable l(int i) {
        int i2 = i == 0 ? -1 : wu2.$EnumSwitchMapping$0[qt4.D(i)];
        ny8 ny8Var = this.u;
        switch (i2) {
            case -1:
                return null;
            case 0:
            default:
                ore.o();
                return null;
            case 1:
                return (Animatable) this.t.getValue();
            case 2:
                return (Animatable) this.r.getValue();
            case 3:
                return (Animatable) this.s.getValue();
            case 4:
                return (Animatable) ny8Var.getValue();
            case 5:
                return (Animatable) this.q.getValue();
            case 6:
                return (Animatable) ny8Var.getValue();
            case 7:
                return (Animatable) ny8Var.getValue();
        }
    }

    public final void m(int i, boolean z) {
        dnb dnbVar = this.j;
        cnb cnbVar = dnbVar.d;
        int i2 = cnbVar.a;
        cnb cnbVarA = cnb.a(cnbVar, i, false, false, false, 14);
        dnbVar.d = cnbVarA;
        if (i2 != i) {
            v0c v0cVar = dnbVar.j;
            int i3 = dnbVar.g;
            BitSet bitSet = dnbVar.e;
            pu4.c(v0cVar, Integer.valueOf(cnbVarA.a), z && bitSet.get(i3), 4);
            v0cVar.setAppearance(p0c.a);
            v0cVar.setMute(cnbVarA.d);
            bitSet.set(i3, cnbVarA.e);
            dnbVar.requestLayout();
        }
        BitSet bitSet2 = this.A;
        int i4 = this.E;
        bitSet2.set(i4, bitSet2.get(i4) || i > 0);
        f(this.z, true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(pq3.j.h(this));
        start();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BitSet bitSet = this.z;
        bitSet.set(0, bitSet.size(), true);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q1 = false;
        stop();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w36 activeTypingView = getActiveTypingView();
        if (activeTypingView == null || !activeTypingView.b()) {
            Drawable drawable = this.k;
            if (drawable != null) {
                TextView textView = this.g;
                float x = (textView.getX() - gm0.K(16.0f * yl5.d().getDisplayMetrics().density)) - gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
                float height = ((textView.getHeight() - drawable.getBounds().height()) / 2.0f) + textView.getY();
                int iSave = canvas.save();
                canvas.translate(x, height);
                try {
                    drawable.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Object obj = this.p;
        Drawable drawable2 = obj instanceof Drawable ? (Drawable) obj : null;
        if (drawable2 == null) {
            return;
        }
        float fHeight = ((activeTypingView.d().height() - gm0.K(16.0f * yl5.d().getDisplayMetrics().density)) / 2.0f) + activeTypingView.getAsView().getTop();
        float left = activeTypingView.getAsView().getLeft();
        int iSave2 = canvas.save();
        canvas.translate(left, fHeight);
        canvas.clipRect(drawable2.getBounds());
        drawable2.draw(canvas);
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD;
        w36 activeTypingView;
        View asView;
        w36 activeSubtitleView;
        View asView2;
        View asView3;
        View asView4;
        float measuredHeight = ((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) / 2.0f) + getPaddingTop();
        kwb kwbVar = this.a;
        int measuredWidth = (int) (measuredHeight - (kwbVar.getMeasuredWidth() / 2.0f));
        BitSet bitSet = this.A;
        if (bitSet.get(0)) {
            yab.j0(getPaddingStart(), measuredWidth, getPaddingStart() + kwbVar.getMeasuredWidth(), kwbVar.getMeasuredHeight() + measuredWidth, this.a, this);
        }
        int iB = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getMeasuredWidth() + getPaddingStart());
        boolean z2 = bitSet.get(this.B);
        TextView textView = this.b;
        if (z2) {
            yab.j0(iB, getPaddingTop(), textView.getMeasuredWidth() + iB, getPaddingTop() + textView.getMeasuredHeight(), textView, this);
        }
        float measuredHeight2 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        View view = this.x;
        int measuredHeight3 = (int) (measuredHeight2 - (view.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.H)) {
            yab.j0((z2 ? zo5.b(4.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth()) : 0) + iB, measuredHeight3, view.getMeasuredWidth() + iB + (z2 ? zo5.b(4.0f, yl5.d().getDisplayMetrics().density, textView.getMeasuredWidth()) : 0), view.getMeasuredHeight() + measuredHeight3, view, this);
        }
        int iB2 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, kwbVar.getMeasuredWidth() + getPaddingStart());
        int iB3 = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, textView.getBottom());
        if (bitSet.get(this.C) && (activeSubtitleView = getActiveSubtitleView()) != null && (asView2 = activeSubtitleView.getAsView()) != null) {
            w36 activeSubtitleView2 = getActiveSubtitleView();
            int measuredWidth2 = ((activeSubtitleView2 == null || (asView4 = activeSubtitleView2.getAsView()) == null) ? 0 : asView4.getMeasuredWidth()) + iB2;
            w36 activeSubtitleView3 = getActiveSubtitleView();
            qyj.L(asView2, iB2, iB3, measuredWidth2, ((activeSubtitleView3 == null || (asView3 = activeSubtitleView3.getAsView()) == null) ? 0 : asView3.getMeasuredHeight()) + iB3);
        }
        if (bitSet.get(this.J) && (activeTypingView = getActiveTypingView()) != null && (asView = activeTypingView.getAsView()) != null) {
            qyj.M(asView, iB2, iB3, 0, 12);
        }
        int measuredWidth3 = getMeasuredWidth() - getPaddingEnd();
        float measuredHeight4 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        View view2 = this.w;
        int measuredHeight5 = (int) (measuredHeight4 - (view2.getMeasuredHeight() / 2.0f));
        int i5 = this.G;
        if (bitSet.get(i5)) {
            yab.j0(measuredWidth3 - view2.getMeasuredWidth(), measuredHeight5, measuredWidth3, view2.getMeasuredHeight() + measuredHeight5, view2, this);
        }
        int iD2 = bitSet.get(i5) ? zo5.D(4.0f, yl5.d().getDisplayMetrics().density, measuredWidth3 - view2.getMeasuredWidth()) : getMeasuredWidth() - getPaddingEnd();
        float measuredHeight6 = (textView.getMeasuredHeight() / 2.0f) + textView.getTop();
        TextView textView2 = this.g;
        int measuredHeight7 = (int) (measuredHeight6 - (textView2.getMeasuredHeight() / 2.0f));
        if (bitSet.get(this.D)) {
            yab.j0(iD2 - textView2.getMeasuredWidth(), measuredHeight7, iD2, textView2.getMeasuredHeight() + measuredHeight7, textView2, this);
        }
        int measuredWidth4 = getMeasuredWidth() - getPaddingEnd();
        boolean z3 = bitSet.get(this.K);
        dnb dnbVar = this.j;
        if (z3) {
            cyb cybVar = (cyb) this.i.getValue();
            int measuredWidth5 = measuredWidth4 - cybVar.getMeasuredWidth();
            iD = ((cybVar.getMeasuredHeight() - dnbVar.getMeasuredHeight()) / 2) + iB3;
            qyj.M(cybVar, measuredWidth5, iB3, 0, 12);
            measuredWidth4 = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, measuredWidth5);
        } else {
            iD = zo5.D(1.0f, yl5.d().getDisplayMetrics().density, iB3);
        }
        int i6 = iD;
        int iD3 = measuredWidth4;
        int i7 = this.E;
        if (bitSet.get(i7)) {
            yab.j0(iD3 - dnbVar.getMeasuredWidth(), i6, iD3, dnbVar.getMeasuredHeight() + i6, dnbVar, this);
        }
        if (bitSet.get(i7)) {
            iD3 = zo5.D(4.0f, yl5.d().getDisplayMetrics().density, iD3 - dnbVar.getMeasuredWidth());
        }
        if (bitSet.get(this.I)) {
            View view3 = this.y;
            yab.j0(iD3 - view3.getMeasuredWidth(), iB3, iD3, view3.getMeasuredHeight() + iB3, view3, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:117:0x023e  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c6 A[PHI: r8
  0x02c6: PHI (r8v8 w36) = (r8v3 w36), (r8v4 w36) binds: [B:138:0x02c4, B:141:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d9 A[PHI: r10
  0x02d9: PHI (r10v11 w36) = (r10v6 w36), (r10v7 w36) binds: [B:145:0x02d7, B:148:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x0308  */
    /* JADX WARN: Code duplicated, block: B:190:0x035d  */
    /* JADX WARN: Code duplicated, block: B:201:0x037b  */
    /* JADX WARN: Code duplicated, block: B:224:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:226:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:228:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:230:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        ny8 ny8Var;
        View view;
        View view2;
        View view3;
        boolean z;
        int size;
        int iK;
        int iB;
        int i4;
        int iA;
        int iMakeMeasureSpec;
        w36 activeSubtitleView;
        int lineHeight;
        w36 activeSubtitleView2;
        int maxLinesValue;
        int i5;
        int iMakeMeasureSpec2;
        boolean z2;
        w36 activeTypingView;
        boolean z3;
        boolean z4;
        e6 e6Var;
        boolean z5;
        Handler handler;
        ?? B;
        w36 activeTypingView2;
        w36 activeTypingView3;
        View asView;
        View asView2;
        View asView3;
        w36 activeSubtitleView3;
        w36 activeSubtitleView4;
        View asView4;
        View asView5;
        w36 activeSubtitleView5;
        View asView6;
        int iMakeMeasureSpec3;
        View asView7;
        View asView8;
        TextView textView = this.b;
        if (soh.c(textView)) {
            setVerified(true);
        }
        BitSet bitSet = this.A;
        int i6 = bitSet.get(0) ? 0 : 8;
        kwb kwbVar = this.a;
        kwbVar.setVisibility(i6);
        int i7 = this.B;
        textView.setVisibility(bitSet.get(i7) ? 0 : 8);
        w36 activeSubtitleView6 = getActiveSubtitleView();
        int i8 = this.C;
        if (activeSubtitleView6 != null && (asView8 = activeSubtitleView6.getAsView()) != null) {
            asView8.setVisibility(bitSet.get(i8) ? 0 : 8);
        }
        w36 activeTypingView4 = getActiveTypingView();
        int i9 = this.J;
        if (activeTypingView4 != null && (asView7 = activeTypingView4.getAsView()) != null) {
            asView7.setVisibility(bitSet.get(i9) ? 0 : 8);
        }
        int i10 = this.D;
        int i11 = bitSet.get(i10) ? 0 : 8;
        TextView textView2 = this.g;
        textView2.setVisibility(i11);
        int i12 = this.H;
        int i13 = bitSet.get(i12) ? 0 : 8;
        View view4 = this.x;
        view4.setVisibility(i13);
        int i14 = this.E;
        int i15 = bitSet.get(i14) ? 0 : 8;
        dnb dnbVar = this.j;
        dnbVar.setVisibility(i15);
        int i16 = this.G;
        int i17 = bitSet.get(i16) ? 0 : 8;
        View view5 = this.w;
        view5.setVisibility(i17);
        int i18 = this.I;
        int i19 = bitSet.get(i18) ? 0 : 8;
        View view6 = this.y;
        view6.setVisibility(i19);
        boolean z6 = bitSet.get(i9);
        Animatable animatable = this.p;
        if (z6) {
            if (animatable != null) {
                animatable.start();
            }
        } else if (animatable != null) {
            animatable.stop();
        }
        int i20 = this.K;
        boolean z7 = bitSet.get(i20);
        Rect rect = n7j.a;
        ny8 ny8Var2 = this.i;
        if (z7) {
            ny8Var = ny8Var2;
            i3 = i20;
            ((View) ny8Var2.getValue()).setVisibility(0);
        } else {
            i3 = i20;
            ny8Var = ny8Var2;
            if (ny8Var.d()) {
                ((View) ny8Var.getValue()).setVisibility(8);
            }
        }
        long j = this.p1;
        int i21 = (int) (j & 4294967295L);
        BitSet bitSet2 = this.z;
        if (i21 == i) {
            view = view4;
            view2 = view5;
            if (((int) (j << 32)) == i2) {
                view3 = view;
            }
            this.p1 = (((long) i2) << 32) | ((long) i);
            if (View.MeasureSpec.getMode(i) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                size = getContext().getResources().getDisplayMetrics().widthPixels;
            } else {
                size = View.MeasureSpec.getSize(i);
            }
            iK = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
            if (bitSet.get(0) && bitSet2.get(0)) {
                kwbVar.measure(View.MeasureSpec.makeMeasureSpec(iK, 1073741824), View.MeasureSpec.makeMeasureSpec(iK, 1073741824));
            }
            if (bitSet.get(i10)) {
                textView2.measure(0, 0);
            }
            if (bitSet.get(i16) && bitSet2.get(i16)) {
                view2.measure(qv1.a(16.0f, yl5.d().getDisplayMetrics().density, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), Integer.MIN_VALUE));
            }
            if (bitSet.get(i12) && bitSet2.get(i12)) {
                view3.measure(qv1.a(16.0f, yl5.d().getDisplayMetrics().density, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm0.K(16.0f * yl5.d().getDisplayMetrics().density), Integer.MIN_VALUE));
            }
            iB = b(size);
            if (bitSet.get(i7) && (bitSet2.get(i7) || bitSet2.get(i10) || bitSet2.get(this.F) || bitSet2.get(i16) || bitSet2.get(i12) || textView.isLayoutRequested())) {
                if (iB <= 0) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iB, Integer.MIN_VALUE);
                }
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(textView.getLineHeight(), 1073741824);
                textView.forceLayout();
                textView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            }
            if (bitSet.get(i14) && bitSet2.get(i14)) {
                dnbVar.measure(0, 0);
            }
            if (bitSet.get(i18) && bitSet2.get(i18)) {
                view6.measure(qv1.a(68.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 1073741824));
            }
            i4 = i3;
            if (bitSet.get(i4) && bitSet2.get(i4)) {
                ((cyb) ny8Var.getValue()).measure(0, 0);
            }
            iA = a(size);
            if (iA < 0) {
                iA = 0;
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iA, Integer.MIN_VALUE);
            activeSubtitleView = getActiveSubtitleView();
            if (activeSubtitleView != null && (activeSubtitleView = getActiveTypingView()) == null) {
                lineHeight = 0;
            } else {
                lineHeight = activeSubtitleView.getLineHeight();
            }
            activeSubtitleView2 = getActiveSubtitleView();
            if (activeSubtitleView2 != null && (activeSubtitleView2 = getActiveTypingView()) == null) {
                maxLinesValue = 2;
            } else {
                maxLinesValue = activeSubtitleView2.getMaxLinesValue();
            }
            i5 = lineHeight * maxLinesValue;
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            if (!bitSet2.get(i8) || bitSet2.get(i18) || bitSet2.get(i14) || bitSet2.get(i4)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.q1 && bitSet.get(i8) && (z2 || ((activeSubtitleView5 = getActiveSubtitleView()) != null && (asView6 = activeSubtitleView5.getAsView()) != null && asView6.isLayoutRequested()))) {
                activeSubtitleView3 = getActiveSubtitleView();
                if (activeSubtitleView3 != null && (asView5 = activeSubtitleView3.getAsView()) != null) {
                    asView5.forceLayout();
                }
                activeSubtitleView4 = getActiveSubtitleView();
                if (activeSubtitleView4 != null && (asView4 = activeSubtitleView4.getAsView()) != null) {
                    asView4.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
            }
            activeTypingView = getActiveTypingView();
            if (activeTypingView == null && (asView3 = activeTypingView.getAsView()) != null && asView3.isLayoutRequested()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!bitSet2.get(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v1 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1059
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xu2.onMeasure(int, int):void");
        }

        @Override // defpackage.eph
        public final void onThemeChanged(kbc kbcVar) {
            Drawable drawable;
            Drawable drawable2;
            oi oiVar;
            Drawable drawable3;
            this.a.onThemeChanged(kbcVar);
            int i = kbcVar.getText().b;
            TextView textView = this.b;
            textView.setTextColor(i);
            w36 activeSubtitleView = getActiveSubtitleView();
            if (activeSubtitleView != null) {
                activeSubtitleView.setTextColor(kbcVar.getText().d);
            }
            int i2 = kbcVar.getText().e;
            TextView textView2 = this.g;
            textView2.setTextColor(i2);
            this.j.onThemeChanged(kbcVar);
            ny8 ny8Var = this.i;
            if (ny8Var.d()) {
                ((cyb) ny8Var.getValue()).e();
            }
            sb8.m0(kbcVar.getIcon().e, this.w.getBackground());
            sb8.m0(kbcVar.getIcon().e, this.x.getBackground());
            ny8 ny8Var2 = this.m;
            ny8 ny8Var3 = ny8Var2.d() ? ny8Var2 : null;
            if (ny8Var3 != null && (drawable3 = (Drawable) ny8Var3.getValue()) != null) {
                sb8.m0(kbcVar.getIcon().h, drawable3);
            }
            ny8 ny8Var4 = this.l;
            if (!ny8Var4.d()) {
                ny8Var4 = null;
            }
            if (ny8Var4 != null && (oiVar = (oi) ny8Var4.getValue()) != null) {
                a8g a8gVar = pq3.j;
                oiVar.d(a8gVar.h(this).getIcon().d, this.A.get(this.G) ? a8gVar.e(getContext()).m().b().d : a8gVar.e(getContext()).m().b().c);
            }
            if (!ny8Var2.d()) {
                ny8Var2 = null;
            }
            if (ny8Var2 != null && (drawable2 = (Drawable) ny8Var2.getValue()) != null) {
                sb8.m0(kbcVar.getIcon().h, drawable2);
            }
            ny8 ny8Var5 = this.n;
            if (!ny8Var5.d()) {
                ny8Var5 = null;
            }
            if (ny8Var5 != null && (drawable = (Drawable) ny8Var5.getValue()) != null) {
                sb8.m0(kbcVar.getIcon().h, drawable);
            }
            ny8 ny8Var6 = this.o;
            if (!ny8Var6.d()) {
                ny8Var6 = null;
            }
            Drawable drawable4 = ny8Var6 != null ? (Drawable) ny8Var6.getValue() : null;
            EnhancedVectorDrawable enhancedVectorDrawable = drawable4 instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable4 : null;
            if (enhancedVectorDrawable != null) {
                lvb.A0(enhancedVectorDrawable, "error", kbcVar.h().d);
            }
            getRippleDrawable().setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
            CharSequence text = textView.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), eph.class) : null;
            if (spans == null) {
                spans = new eph[0];
            }
            for (Object obj : spans) {
                eph ephVar = (eph) obj;
                ephVar.onThemeChanged(kbcVar);
                soh.b(textView, ephVar);
            }
            w36 activeSubtitleView2 = getActiveSubtitleView();
            if (activeSubtitleView2 != null) {
                activeSubtitleView2.e(kbcVar);
            }
            CharSequence text2 = textView2.getText();
            Spanned spanned2 = text2 instanceof Spanned ? (Spanned) text2 : null;
            Object[] spans2 = spanned2 != null ? spanned2.getSpans(0, textView2.getText().length(), eph.class) : null;
            if (spans2 == null) {
                spans2 = new eph[0];
            }
            for (Object obj2 : spans2) {
                eph ephVar2 = (eph) obj2;
                ephVar2.onThemeChanged(kbcVar);
                soh.b(textView2, ephVar2);
            }
            Animatable animatable = this.p;
            eph ephVar3 = animatable instanceof eph ? (eph) animatable : null;
            if (ephVar3 != null) {
                ephVar3.onThemeChanged(kbcVar);
            }
            w36 activeTypingView = getActiveTypingView();
            if (activeTypingView != null) {
                activeTypingView.e(kbcVar);
            }
            invalidate();
        }

        public final void setAvatarClickListener(View.OnClickListener onClickListener) {
            qe7.H(this.a, 300L, onClickListener);
        }

        public final void setAvatarLongClickListener(View.OnLongClickListener onLongClickListener) {
            this.a.setOnLongClickListener(onLongClickListener);
        }

        public final void setCall(CharSequence charSequence) {
            boolean z = charSequence == null || r5h.X0(charSequence);
            BitSet bitSet = this.A;
            int i = this.I;
            bitSet.set(i, !z);
            this.z.set(i, true);
            requestLayout();
        }

        public final void setCallBadge(boolean z) {
            this.a.setCallBadgeVisibility(z);
            this.z.set(0, true);
            requestLayout();
        }

        public final void setLiveStreamBadge(boolean z) {
            this.a.setLiveStreamBadgeVisibility(z);
            this.z.set(0, true);
            requestLayout();
        }

        public final void setMention(boolean z) {
            this.j.c(z);
            BitSet bitSet = this.A;
            int i = this.E;
            bitSet.set(i, bitSet.get(i) || z);
            f(this.z, true);
            requestLayout();
        }

        public final void setMultiselectAnimating(boolean z) {
            this.q1 = z;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0025  */
        public final void setMuted(boolean z) {
            boolean z2;
            BitSet bitSet = this.A;
            int i = this.H;
            bitSet.set(i, z);
            BitSet bitSet2 = this.z;
            if (bitSet2.get(i)) {
                z2 = true;
            } else {
                if ((this.x.getVisibility() == 0) != bitSet.get(i)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            bitSet2.set(i, z2);
            dnb dnbVar = this.j;
            cnb cnbVar = dnbVar.d;
            boolean z3 = cnbVar.d;
            dnbVar.d = cnb.a(cnbVar, 0, false, false, z, 7);
            if (z3 != z) {
                dnbVar.b(z, pq3.j.h(dnbVar));
            }
            int i2 = this.E;
            bitSet.set(i2, bitSet.get(i2) || z);
            bitSet2.set(i2, true);
            requestLayout();
        }

        public final void setOnline(boolean z) {
            this.a.setOnlineBadgeVisibility(z);
            this.z.set(0, true);
            requestLayout();
        }

        public final void setPinned(boolean z) {
            oi oiVar;
            this.A.set(this.G, z);
            ny8 ny8Var = this.l;
            if (!ny8Var.d()) {
                ny8Var = null;
            }
            if (ny8Var != null && (oiVar = (oi) ny8Var.getValue()) != null) {
                a8g a8gVar = pq3.j;
                oiVar.d(a8gVar.h(this).getIcon().d, a8gVar.e(getContext()).m().b().d);
            }
            requestLayout();
        }

        public final void setReaction(boolean z) {
            this.j.d(z);
            BitSet bitSet = this.A;
            int i = this.E;
            bitSet.set(i, bitSet.get(i) || z);
            f(this.z, true);
            requestLayout();
        }

        public final void setStatus(vu2 vu2Var) {
            Drawable drawable;
            int iOrdinal = vu2Var.ordinal();
            if (iOrdinal == 0) {
                drawable = null;
            } else if (iOrdinal == 1) {
                drawable = (Drawable) this.l.getValue();
            } else if (iOrdinal == 2) {
                drawable = (Drawable) this.m.getValue();
            } else if (iOrdinal == 3) {
                drawable = (Drawable) this.n.getValue();
            } else {
                if (iOrdinal != 4) {
                    ore.o();
                    return;
                }
                drawable = (Drawable) this.o.getValue();
            }
            if (drawable != null) {
                eph ephVar = drawable instanceof eph ? (eph) drawable : null;
                if (ephVar != null) {
                    ephVar.onThemeChanged(pq3.j.h(this));
                }
            } else {
                drawable = null;
            }
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
            boolean z = this.k != drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
            }
            boolean z2 = this.k != drawable;
            BitSet bitSet = this.z;
            int i = this.F;
            bitSet.set(i, z2);
            this.k = drawable;
            this.A.set(i, drawable != null);
            invalidate();
            if (z) {
                requestLayout();
            }
        }

        public final void setSubtitle(dnh dnhVar) {
            getSubtitleView().setLayout(dnhVar);
            boolean zX0 = r5h.X0(dnhVar.a.a().getText());
            BitSet bitSet = this.A;
            h(bitSet, (zX0 || bitSet.get(this.J)) ? false : true);
            h(this.z, true);
            invalidate();
            requestLayout();
        }

        public final void setTime(CharSequence charSequence) {
            TextView textView = this.g;
            CharSequence text = textView.getText();
            int i = this.D;
            BitSet bitSet = this.z;
            boolean z = true;
            if (text != charSequence) {
                textView.setText(charSequence);
                bitSet.set(i, true);
            }
            boolean z2 = (charSequence == null || r5h.X0(charSequence)) ? false : true;
            BitSet bitSet2 = this.A;
            bitSet2.set(i, z2);
            if (!bitSet.get(i)) {
                if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                    z = false;
                }
            }
            bitSet.set(i, z);
            requestLayout();
        }

        public final void setTitle(CharSequence charSequence) {
            TextView textView = this.b;
            CharSequence text = textView.getText();
            int i = this.B;
            BitSet bitSet = this.z;
            boolean z = true;
            if (text != charSequence) {
                textView.setText(charSequence);
                bitSet.set(i, true);
            }
            boolean z2 = (charSequence == null || r5h.X0(charSequence)) ? false : true;
            BitSet bitSet2 = this.A;
            bitSet2.set(i, z2);
            if (!bitSet.get(i)) {
                if (bitSet2.get(i) == (textView.getVisibility() == 0)) {
                    z = false;
                }
            }
            bitSet.set(i, z);
            kbc kbcVarH = pq3.j.h(this);
            CharSequence text2 = textView.getText();
            Spanned spanned = text2 instanceof Spanned ? (Spanned) text2 : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, textView.getText().length(), eph.class) : null;
            if (spans == null) {
                spans = new eph[0];
            }
            for (Object obj : spans) {
                eph ephVar = (eph) obj;
                ephVar.onThemeChanged(kbcVarH);
                soh.b(textView, ephVar);
            }
            requestLayout();
        }

        public final void setTrailingButton(CharSequence charSequence) {
            BitSet bitSet = this.z;
            int i = this.K;
            BitSet bitSet2 = this.A;
            if (charSequence == null || r5h.X0(charSequence)) {
                bitSet.set(i, bitSet2.get(i));
                bitSet2.set(i, false);
                return;
            }
            boolean z = bitSet.get(i);
            ny8 ny8Var = this.i;
            bitSet.set(i, (!z && bitSet2.get(i) && cqk.d(((cyb) ny8Var.getValue()).getText(), charSequence)) ? false : true);
            bitSet2.set(i, true);
            ((cyb) ny8Var.getValue()).setText(charSequence);
        }

        public final void setTrailingButtonClickListener(View.OnClickListener onClickListener) {
            this.h = onClickListener;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x004a  */
        public final void setVerified(boolean z) {
            osi osiVar;
            TextView textView = this.b;
            int iI0 = oc9.i0(soh.e(textView));
            a8g a8gVar = pq3.j;
            if (z) {
                osi osiVarA = soh.a(textView);
                if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                    osi osiVar2 = this.r1;
                    if (osiVar2 != null) {
                        osiVar2.onThemeChanged(a8gVar.h(this));
                        return;
                    }
                    return;
                }
            }
            if (z) {
                osi osiVarA2 = soh.a(textView);
                if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                    osiVar = this.r1;
                    if (osiVar == null || osiVar.a != iI0) {
                        osiVar = new osi(getContext(), iI0, khb.d);
                        this.r1 = osiVar;
                    }
                } else {
                    osiVar = null;
                }
            } else {
                osiVar = null;
            }
            osi osiVar3 = this.r1;
            if (osiVar3 != null) {
                osiVar3.onThemeChanged(a8gVar.h(this));
            }
            soh.d(textView, osiVar);
        }

        @Override // android.graphics.drawable.Animatable
        public final void start() {
            Animatable animatable;
            w36 activeTypingView = getActiveTypingView();
            if (activeTypingView != null && activeTypingView.b() && (animatable = this.p) != null) {
                animatable.start();
            }
            Object obj = this.k;
            Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
            if (animatable2 != null) {
                animatable2.start();
            }
            this.a.start();
        }

        @Override // android.graphics.drawable.Animatable
        public final void stop() {
            Animatable animatable;
            w36 activeTypingView = getActiveTypingView();
            if (activeTypingView != null && activeTypingView.b() && (animatable = this.p) != null) {
                animatable.stop();
            }
            Object obj = this.k;
            Animatable animatable2 = obj instanceof Animatable ? (Animatable) obj : null;
            if (animatable2 != null) {
                animatable2.stop();
            }
            this.a.stop();
        }

        @Override // android.view.View
        public final boolean verifyDrawable(Drawable drawable) {
            return (drawable instanceof Animatable) || super.verifyDrawable(drawable);
        }
    }
