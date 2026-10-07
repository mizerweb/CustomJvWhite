package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zyf extends ViewGroup implements v35, khf, hnh, cw7, b8e, mia, ekc, fhf, k24, azf, i59, z7g, jp5 {
    public final ny8 A;
    public final ny8 B;
    public final ny8 C;
    public final ny8 D;
    public final ny8 E;
    public final u35 F;
    public final p6e a;
    public final gia b;
    public final fkc c;
    public final dhf d;
    public final i24 e;
    public final vyf f;
    public final cf7 g;
    public final ny8 h;
    public xac i;
    public final Paint j;
    public final Rect k;
    public final BitSet l;
    public final int m;
    public final int n;
    public final int o;
    public final l1c p;
    public final ny8 q;
    public final ny8 r;
    public final ny8 s;
    public final ny8 t;
    public final lhf u;
    public zs3 v;
    public af7 w;
    public af7 x;
    public final dka y;
    public final ny8 z;

    public zyf(final Context context, ny8 ny8Var, fz7 fz7Var) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        fkc fkcVar = new fkc();
        dhf dhfVar = new dhf();
        final int i = 1;
        i24 i24Var = new i24(1);
        vyf vyfVar = new vyf();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = fkcVar;
        this.d = dhfVar;
        this.e = i24Var;
        this.f = vyfVar;
        this.g = fz7Var;
        this.h = ny8Var;
        a8g a8gVar = pq3.j;
        this.i = (xac) a8gVar.h(this).f().a;
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.j = paint;
        this.k = new Rect();
        final int i2 = 4;
        this.l = new BitSet(4);
        this.m = 1;
        this.n = 2;
        final int i3 = 3;
        this.o = 3;
        l1c l1cVar = new l1c(context);
        this.p = l1cVar;
        this.q = rx8.P(3, new twf(context, 1));
        this.r = rx8.P(3, new irf(13));
        final int i4 = 0;
        this.s = rx8.P(3, new af7(this) { // from class: yyf
            public final /* synthetic */ zyf b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                zyf zyfVar = this.b;
                switch (i5) {
                    case 0:
                        return zyf.i(zyfVar);
                    default:
                        return zyf.g(zyfVar);
                }
            }
        });
        this.t = rx8.P(3, new af7(this) { // from class: yyf
            public final /* synthetic */ zyf b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i;
                zyf zyfVar = this.b;
                switch (i5) {
                    case 0:
                        return zyf.i(zyfVar);
                    default:
                        return zyf.g(zyfVar);
                }
            }
        });
        this.u = new lhf(this);
        dka dkaVar = new dka(context);
        dkaVar.setId(R.id.messages_list_item_text);
        dkaVar.setLinkLongClickListener(new zo7(26, this));
        dkaVar.setOnLongClickListener(new cw0(8, this));
        dkaVar.setSingleClickAction(new wyf(this, 0));
        dkaVar.setOnDoubleClickListener(new ptf(4, this));
        this.y = dkaVar;
        this.z = rx8.P(3, new af7() { // from class: xyf
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
                zyf zyfVar = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i6 = 0; i6 < 8; i6++) {
                            fArr[i6] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        this.A = rx8.P(3, new af7() { // from class: xyf
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
                int i5 = i;
                a8g a8gVar2 = pq3.j;
                zyf zyfVar = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i6 = 0; i6 < 8; i6++) {
                            fArr[i6] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        final int i5 = 2;
        this.B = rx8.P(3, new af7() { // from class: xyf
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
                zyf zyfVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr[i7] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        this.C = rx8.P(3, new af7() { // from class: xyf
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
                int i6 = i3;
                a8g a8gVar2 = pq3.j;
                zyf zyfVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr[i7] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        this.D = rx8.P(3, new af7() { // from class: xyf
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
                int i6 = i2;
                a8g a8gVar2 = pq3.j;
                zyf zyfVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i7 = 0; i7 < 8; i7++) {
                            fArr[i7] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        final int i6 = 5;
        this.E = rx8.P(3, new af7() { // from class: xyf
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
                zyf zyfVar = this;
                Context context2 = context;
                switch (i7) {
                    case 0:
                        return zyf.a(context2, zyfVar);
                    case 1:
                        return zyf.c(context2, zyfVar);
                    case 2:
                        return zyf.f(context2, zyfVar);
                    case 3:
                        View t58Var = new t58(context2);
                        zyfVar.addView(t58Var, new ViewGroup.LayoutParams(-2, -2));
                        return t58Var;
                    case 4:
                        ImageView imageViewD = qv1.d(context2, R.id.messages_list_item_play);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        a8gVar2.h(imageViewD);
                        paint2.setColor(-1728053248);
                        imageViewD.setBackground(shapeDrawable);
                        imageViewD.setImageResource(R.drawable.icon_play_fill);
                        x05.j(14.0f, yl5.d().getDisplayMetrics().density, imageViewD);
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        a8gVar2.h(imageViewD);
                        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
                        zyfVar.addView(imageViewD, new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), gm0.K(52.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD;
                    default:
                        TextView textView = new TextView(context2);
                        float[] fArr = new float[8];
                        for (int i8 = 0; i8 < 8; i8++) {
                            fArr[i8] = yl5.d().getDisplayMetrics().density * 6.0f;
                        }
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                        Paint paint3 = shapeDrawable2.getPaint();
                        a8gVar2.h(textView);
                        paint3.setColor(-871625458);
                        textView.setBackground(shapeDrawable2);
                        textView.setIncludeFontPadding(false);
                        textView.setGravity(16);
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        int iK2 = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        textView.setPadding(iK, iK2, iK, iK2);
                        q9i.a(q9i.l, textView);
                        a8gVar2.h(textView);
                        textView.setTextColor(-1);
                        textView.setText(np4.q(textView.getContext(), R.string.messages_list_live_stream_badge));
                        a8gVar2.h(textView);
                        Drawable drawableMutate = textView.getContext().getDrawable(R.drawable.icon_live).mutate();
                        sb8.m0(-1, drawableMutate);
                        ArrayList arrayList = soh.a;
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableMutate, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                        zyfVar.addView(textView, new ViewGroup.LayoutParams(-2, -2));
                        return textView;
                }
            }
        });
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.F = u35Var;
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        i24Var.a = this;
        vyfVar.a = this;
        addView(dkaVar, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        addView(l1cVar, new ViewGroup.LayoutParams(-2, -2));
        l1cVar.setupNewController(true);
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = a8gVar.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, zyf zyfVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.y.h(), appCompatTextView);
        appCompatTextView.setTextColor(zyfVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        zyfVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static AppCompatTextView c(Context context, zyf zyfVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.u.h(), appCompatTextView);
        appCompatTextView.setTextColor(zyfVar.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        zyfVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static AppCompatTextView f(Context context, zyf zyfVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        q9i.a(q9i.t, appCompatTextView);
        appCompatTextView.setTextColor(zyfVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        zyfVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static ShapeDrawable g(zyf zyfVar) {
        float f = yl5.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(zyfVar.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    private final int getAdditionalTextColor() {
        return this.i.b.e;
    }

    private final tz0 getBlurPostProcessor() {
        return (tz0) this.q.getValue();
    }

    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.t.getValue();
    }

    private final wo6 getFeaturePrefs() {
        return (wo6) this.h.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.i.d.e;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.i.a.e;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        return ((ix2) this.i.e.c).b;
    }

    private final nvh getPreviewBlurOutlineProvider() {
        return (nvh) this.r.getValue();
    }

    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.s.getValue();
    }

    private final int getTitleColor() {
        return this.i.b.d;
    }

    public static RippleDrawable i(zyf zyfVar) {
        float f = yl5.d().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = zyfVar.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return col.c(internalBubbleBackgroundContentColor, null, new ShapeDrawable(new RoundRectShape(fArr, null, null)), 2);
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.azf
    public final void C() {
        this.f.C();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    @Override // defpackage.azf
    public final float b(int i) {
        return this.f.b(i);
    }

    @Override // defpackage.cw7
    public final void d(List list, qf7 qf7Var) {
        dka dkaVar = this.y;
        CharSequence text = dkaVar.getText();
        if (text == null) {
            return;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty() || qf7Var == null) {
            dka.f(dkaVar);
        } else {
            dkaVar.h((List) qf7Var.invoke(text.toString(), list));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.k;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.p || this.l.get(this.o)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.F.d(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.d.Z();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public af7 getOnDoubleTap() {
        return this.x;
    }

    public zs3 getOnLinkLongClickListener() {
        return this.v;
    }

    public af7 getOnSingleClick() {
        return this.w;
    }

    @Override // defpackage.k24
    public final void h(int i) {
        this.e.h(i);
    }

    @Override // defpackage.k24
    public final boolean k() {
        return this.e.k();
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    public final void n(xac xacVar) {
        int i = xacVar.b.g;
        this.i = xacVar;
        ny8 ny8Var = this.A;
        if (ny8Var.d()) {
            ((AppCompatTextView) ny8Var.getValue()).setTextColor(getTitleColor());
        }
        ny8 ny8Var2 = this.z;
        if (ny8Var2.d()) {
            ((AppCompatTextView) ny8Var2.getValue()).setTextColor(getAdditionalTextColor());
        }
        ny8 ny8Var3 = this.B;
        if (ny8Var3.d()) {
            ((AppCompatTextView) ny8Var3.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.j.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        u35 u35Var = this.F;
        u35Var.setTextColor$message_list(i);
        u35Var.setDateViewStatusColor(i);
        v(xacVar);
    }

    @Override // defpackage.k24
    public final void o() {
        this.e.o();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.k;
        if (rect.isEmpty()) {
            return;
        }
        float f = yl5.d().getDisplayMetrics().density * 12.0f;
        canvas.drawRoundRect(new RectF(rect), f, f, this.j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int i5;
        float f;
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int i6 = (int) ((fea) getBackground()).s;
        int i7 = iK2 * 2;
        int measuredWidth = (getMeasuredWidth() - i6) - i7;
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        lhf lhfVar = this.u;
        if (n7j.o(lhfVar.b)) {
            lhfVar.c(iK2, iK4);
            iK = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a() + iK4);
        } else {
            iK = iK2;
        }
        dhf dhfVar = this.d;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T(((getMeasuredWidth() - iK2) - dhfVar.L()) - i6, ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + iK4);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(iK2, iK);
            iK += giaVar.K();
        }
        dka dkaVar = this.y;
        qyj.M(dkaVar, iK2, iK, 0, 12);
        int iE = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, dkaVar.getMeasuredHeight(), iK);
        int i8 = iK2 + iK3;
        ny8 ny8Var = this.C;
        boolean zO = n7j.o(ny8Var);
        l1c l1cVar = this.p;
        int i9 = this.n;
        BitSet bitSet = this.l;
        if (zO) {
            t58 t58Var = (t58) ny8Var.getValue();
            int i10 = bitSet.get(i9) ? iE : iE + iK3;
            if (l1cVar.getVisibility() == 0) {
                l1cVar.layout(iK2, i10, l1cVar.getMeasuredWidth() + iK2, l1cVar.getMeasuredHeight() + i10);
                l1cVar.setOutlineProvider(getPreviewBlurOutlineProvider());
            }
            qyj.M(t58Var, bitSet.get(i9) ? ((measuredWidth - t58Var.getMeasuredWidth()) / 2) + iK2 : (((getMeasuredWidth() - i6) - iK2) - iK3) - t58Var.getMeasuredWidth(), i10, 0, 12);
            if (bitSet.get(i9)) {
                f = (!bitSet.get(this.o) || ((float) (l1cVar.getMeasuredWidth() - t58Var.getMeasuredWidth())) < (yl5.d().getDisplayMetrics().density * 12.0f) * 2.0f) ? yl5.d().getDisplayMetrics().density * 12.0f : 0.0f;
            } else {
                f = yl5.d().getDisplayMetrics().density * 4.0f;
            }
            float f2 = bitSet.get(i9) ? 0.0f : yl5.d().getDisplayMetrics().density * 4.0f;
            wj7 wj7Var = (wj7) t58Var.getHierarchy();
            eve eveVar = new eve();
            float f3 = f;
            i5 = iK3;
            if (eveVar.c == null) {
                eveVar.c = new float[8];
            }
            float[] fArr = eveVar.c;
            fArr[1] = f3;
            fArr[0] = f3;
            fArr[3] = f3;
            fArr[2] = f3;
            fArr[5] = f2;
            fArr[4] = f2;
            fArr[7] = f2;
            fArr[6] = f2;
            wj7Var.m(eveVar);
            if (bitSet.get(i9)) {
                iE += t58Var.getMeasuredHeight() + i5;
            }
        } else {
            i5 = iK3;
        }
        if (n7j.o(ny8Var)) {
            t58 t58Var2 = (t58) ny8Var.getValue();
            ny8 ny8Var2 = this.D;
            if (n7j.o(ny8Var2)) {
                qyj.M((ImageView) ny8Var2.getValue(), ((t58Var2.getWidth() / 2) + t58Var2.getLeft()) - (n7j.k(ny8Var2) / 2), ((t58Var2.getHeight() / 2) + t58Var2.getTop()) - (n7j.j(ny8Var2) / 2), 0, 12);
            }
            ny8 ny8Var3 = this.E;
            if (n7j.o(ny8Var3)) {
                qyj.M((TextView) ny8Var3.getValue(), zo5.b(8.0f, yl5.d().getDisplayMetrics().density, t58Var2.getLeft()), zo5.b(8.0f, yl5.d().getDisplayMetrics().density, t58Var2.getTop()), 0, 12);
            }
        } else {
            l1cVar.setVisibility(8);
        }
        if (!n7j.o(ny8Var) || !bitSet.get(i9)) {
            iE += i5;
        }
        ny8 ny8Var4 = this.z;
        if (n7j.o(ny8Var4)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) ny8Var4.getValue();
            qyj.M(appCompatTextView, i8, iE, 0, 12);
            iE += appCompatTextView.getMeasuredHeight();
        }
        ny8 ny8Var5 = this.A;
        if (n7j.o(ny8Var5)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ny8Var5.getValue();
            int iB = zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iE);
            qyj.M(appCompatTextView2, i8, iB, 0, 12);
            iE = appCompatTextView2.getMeasuredHeight() + iB;
        }
        ny8 ny8Var6 = this.B;
        if (n7j.o(ny8Var6)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ny8Var6.getValue();
            qyj.M(appCompatTextView3, i8, zo5.b(2.0f, yl5.d().getDisplayMetrics().density, iE), 0, 12);
            appCompatTextView3.getMeasuredHeight();
        }
        i24 i24Var = this.e;
        int iK5 = n7j.o((ny8) i24Var.b) ? i24Var.K() : 0;
        p6e p6eVar = this.a;
        boolean zO2 = n7j.o((ny8) p6eVar.b);
        u35 u35Var = this.F;
        if (zO2) {
            p6eVar.T(iK2, (getMeasuredHeight() - p6eVar.K()) - (((u35Var.getMeasuredWidth() + p6eVar.L()) + i7 > getMeasuredWidth() ? bc1.g(4.0f, yl5.d().getDisplayMetrics().density, 2, u35Var.getMeasuredHeight()) : gm0.K(yl5.d().getDisplayMetrics().density * 10.0f)) + iK5));
        }
        qyj.M(u35Var, ((getMeasuredWidth() - u35Var.getMeasuredWidth()) - iK2) - i6, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, (getMeasuredHeight() - iK5) - u35Var.getMeasuredHeight()), 0, 12);
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.T(0, getMeasuredHeight() - i24Var.K());
        }
        vyf vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.T(getMeasuredWidth() - vyfVar.L(), zo5.D(6.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight()) - vyfVar.K());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0361  */
    /* JADX WARN: Code duplicated, block: B:105:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:112:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0406  */
    /* JADX WARN: Code duplicated, block: B:118:0x0435  */
    /* JADX WARN: Code duplicated, block: B:119:0x0451  */
    /* JADX WARN: Code duplicated, block: B:74:0x0285  */
    /* JADX WARN: Code duplicated, block: B:75:0x0297  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0312  */
    /* JADX WARN: Code duplicated, block: B:90:0x0322  */
    /* JADX WARN: Code duplicated, block: B:92:0x0326  */
    /* JADX WARN: Code duplicated, block: B:94:0x033c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0342  */
    /* JADX WARN: Code duplicated, block: B:97:0x034a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v35 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iF;
        int iK;
        ?? r8;
        boolean z;
        int i3;
        ny8 ny8Var;
        int i4;
        boolean z2;
        ny8 ny8Var2;
        ny8 ny8Var3;
        p6e p6eVar;
        u35 u35Var;
        int measuredWidth;
        int measuredWidth2;
        int iB;
        i24 i24Var;
        vyf vyfVar;
        int iJ;
        int iJ2;
        int iJ3;
        boolean z3;
        if (getDependOnOutsideView()) {
            iF = View.MeasureSpec.getSize(i);
        } else {
            iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        }
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        dka dkaVar = this.y;
        dkaVar.j();
        int i5 = iK2 * 2;
        int iMax = Math.max(dkaVar.getMeasuredWidth() + i5, iF);
        int i6 = iMax - i5;
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        dhf dhfVar = this.d;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.u;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, dhfVar.L());
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, lhfVar.b() + i5 + dhfVar.Z());
            iK = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a() + gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        } else {
            iK = iK2;
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + giaVar.L());
            iK += giaVar.K();
        }
        int iE = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, dkaVar.getMeasuredHeight(), iK);
        int i7 = iK3 * 2;
        int i8 = i6 - i7;
        ny8 ny8Var4 = this.C;
        boolean zO2 = n7j.o(ny8Var4);
        l1c l1cVar = this.p;
        int i9 = this.o;
        int i10 = this.n;
        boolean z4 = true;
        BitSet bitSet = this.l;
        if (zO2) {
            t58 t58Var = (t58) ny8Var4.getValue();
            bitSet.set(i10, t58Var.getImageAttach().c * 2 >= i6 || t58Var.getImageAttach().d * 2 >= i6);
            if (bitSet.get(i10)) {
                t58Var.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 128.0f), 1073741824));
                bitSet.set(i9, t58Var.getMeasuredWidth() < i6 || t58Var.getMeasuredHeight() < gm0.K(yl5.d().getDisplayMetrics().density * 128.0f));
                if (bitSet.get(i9)) {
                    l1cVar.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(t58Var.getMeasuredHeight(), gm0.K(128.0f * yl5.d().getDisplayMetrics().density)), 1073741824));
                }
                i8 = i8;
                z3 = false;
            } else {
                int iK4 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
                t58Var.measure(View.MeasureSpec.makeMeasureSpec(iK4, 1073741824), View.MeasureSpec.makeMeasureSpec(iK4, 1073741824));
                i8 -= iK4 + iK3;
                z3 = false;
                bitSet.set(i9, false);
            }
            z = true;
            r8 = z3;
        } else {
            i7 = i7;
            r8 = 0;
            z = false;
        }
        if (!n7j.o(ny8Var4)) {
            bitSet.set(i10, (boolean) r8);
            bitSet.set(i9, (boolean) r8);
        }
        boolean z5 = bitSet.get(r8);
        ny8 ny8Var5 = this.D;
        if (z5) {
            ((View) ny8Var5.getValue()).setVisibility(bitSet.get(i10) ? 0 : 8);
        } else if (n7j.o(ny8Var5)) {
            ((View) ny8Var5.getValue()).setVisibility(8);
        }
        boolean z6 = bitSet.get(this.m);
        ny8 ny8Var6 = this.E;
        if (!z6) {
            z = z;
            if (n7j.o(ny8Var6)) {
                i3 = 8;
                ((View) ny8Var6.getValue()).setVisibility(8);
            }
            if (bitSet.get(i9) && bitSet.get(i10)) {
                i3 = 0;
            }
            l1cVar.setVisibility(i3);
            ny8Var = this.z;
            if (n7j.o(ny8Var)) {
                i4 = Integer.MIN_VALUE;
                ((AppCompatTextView) ny8Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i2);
                z2 = true;
            } else {
                i4 = Integer.MIN_VALUE;
                z2 = z;
            }
            ny8Var2 = this.A;
            if (n7j.o(ny8Var2)) {
                ((AppCompatTextView) ny8Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
                z2 = true;
            }
            ny8Var3 = this.B;
            if (n7j.o(ny8Var3)) {
                ((AppCompatTextView) ny8Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
                z2 = true;
            }
            if (n7j.o(ny8Var5)) {
                ((ImageView) ny8Var5.getValue()).measure(qv1.a(52.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), 1073741824));
                z2 = true;
            }
            if (n7j.o(ny8Var6)) {
                ((TextView) ny8Var6.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i2);
            } else {
                z4 = z2;
            }
            if (z4) {
                iJ = n7j.j(ny8Var3) + n7j.j(ny8Var2) + n7j.j(ny8Var) + i7;
                if (bitSet.get(i10)) {
                    iJ3 = n7j.j(ny8Var4) + iJ;
                } else {
                    iJ2 = n7j.j(ny8Var4) + i7;
                    if (iJ < iJ2) {
                        iJ = iJ2;
                    }
                    iJ3 = iJ;
                }
                int i11 = iJ3 + iE;
                this.k.set(iK2, iE, iMax - iK2, i11);
                iE = i11;
            }
            p6eVar = this.a;
            if (n7j.o((ny8) p6eVar.b)) {
                p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
                iE = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iE);
                iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + p6eVar.L());
            }
            u35Var = this.F;
            u35Var.measure(i, i2);
            if (n7j.o((ny8) p6eVar.b)) {
                measuredWidth = p6eVar.L();
            } else if (z4) {
                measuredWidth = iMax - i5;
            } else {
                measuredWidth = dkaVar.getMeasuredWidth();
            }
            measuredWidth2 = u35Var.getMeasuredWidth() + measuredWidth + i5;
            if (measuredWidth2 > iF) {
                iB = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight() + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), iE);
            } else {
                iMax = Math.max(iMax, measuredWidth2);
                iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, iE);
            }
            i24Var = this.e;
            if (n7j.o((ny8) i24Var.b)) {
                i24Var.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
                iMax = Math.max(iMax, i24Var.L());
                i24Var.U(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i2);
                iB += i24Var.K();
            }
            vyfVar = this.f;
            if (n7j.o((ny8) vyfVar.b)) {
                vyfVar.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
                int iL = vyfVar.L();
                iMax += iL;
                ((fea) getBackground()).s = iL;
            } else {
                ((fea) getBackground()).s = 0.0f;
            }
            setMeasuredDimension(iMax, iB);
        }
        ((View) ny8Var6.getValue()).setVisibility(bitSet.get(i10) ? 0 : 8);
        i3 = 8;
        if (bitSet.get(i9)) {
            i3 = 0;
        }
        l1cVar.setVisibility(i3);
        ny8Var = this.z;
        if (n7j.o(ny8Var)) {
            i4 = Integer.MIN_VALUE;
            ((AppCompatTextView) ny8Var.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i2);
            z2 = true;
        } else {
            i4 = Integer.MIN_VALUE;
            z2 = z;
        }
        ny8Var2 = this.A;
        if (n7j.o(ny8Var2)) {
            ((AppCompatTextView) ny8Var2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
            z2 = true;
        }
        ny8Var3 = this.B;
        if (n7j.o(ny8Var3)) {
            ((AppCompatTextView) ny8Var3.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
            z2 = true;
        }
        if (n7j.o(ny8Var5)) {
            ((ImageView) ny8Var5.getValue()).measure(qv1.a(52.0f, yl5.d().getDisplayMetrics().density, 1073741824), View.MeasureSpec.makeMeasureSpec(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f), 1073741824));
            z2 = true;
        }
        if (n7j.o(ny8Var6)) {
            ((TextView) ny8Var6.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i2);
        } else {
            z4 = z2;
        }
        if (z4) {
            iJ = n7j.j(ny8Var3) + n7j.j(ny8Var2) + n7j.j(ny8Var) + i7;
            if (bitSet.get(i10)) {
                iJ3 = n7j.j(ny8Var4) + iJ;
            } else {
                iJ2 = n7j.j(ny8Var4) + i7;
                if (iJ < iJ2) {
                    iJ = iJ2;
                }
                iJ3 = iJ;
            }
            int i12 = iJ3 + iE;
            this.k.set(iK2, iE, iMax - iK2, i12);
            iE = i12;
        }
        p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iE = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iE);
            iMax = Math.max(iMax, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + p6eVar.L());
        }
        u35Var = this.F;
        u35Var.measure(i, i2);
        if (n7j.o((ny8) p6eVar.b)) {
            measuredWidth = p6eVar.L();
        } else if (z4) {
            measuredWidth = iMax - i5;
        } else {
            measuredWidth = dkaVar.getMeasuredWidth();
        }
        measuredWidth2 = u35Var.getMeasuredWidth() + measuredWidth + i5;
        if (measuredWidth2 > iF) {
            iB = c0a.e(4.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight() + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), iE);
        } else {
            iMax = Math.max(iMax, measuredWidth2);
            iB = zo5.b(10.0f, yl5.d().getDisplayMetrics().density, iE);
        }
        i24Var = this.e;
        if (n7j.o((ny8) i24Var.b)) {
            i24Var.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, i24Var.L());
            i24Var.U(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), i2);
            iB += i24Var.K();
        }
        vyfVar = this.f;
        if (n7j.o((ny8) vyfVar.b)) {
            vyfVar.U(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), i2);
            int iL2 = vyfVar.L();
            iMax += iL2;
            ((fea) getBackground()).s = iL2;
        } else {
            ((fea) getBackground()).s = 0.0f;
        }
        setMeasuredDimension(iMax, iB);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.b.p(xacVar);
    }

    public final void q(mxf mxfVar, boolean z) {
        g58 g58Var = mxfVar.g;
        this.i = f55.g(pq3.j.h(this).f(), z);
        String str = mxfVar.c;
        ny8 ny8Var = this.z;
        if (str != null) {
            View view = (View) ny8Var.getValue();
            ((AppCompatTextView) view).setText(str);
            view.setVisibility(0);
        } else if (ny8Var.d()) {
            ((View) ny8Var.getValue()).setVisibility(8);
        }
        String str2 = mxfVar.d;
        ny8 ny8Var2 = this.A;
        if (str2 != null) {
            View view2 = (View) ny8Var2.getValue();
            ((AppCompatTextView) view2).setText(str2);
            view2.setVisibility(0);
        } else if (ny8Var2.d()) {
            ((View) ny8Var2.getValue()).setVisibility(8);
        }
        String str3 = mxfVar.e;
        ny8 ny8Var3 = this.B;
        if (str3 != null) {
            View view3 = (View) ny8Var3.getValue();
            ((AppCompatTextView) view3).setText(str3);
            view3.setVisibility(0);
        } else if (ny8Var3.d()) {
            ((View) ny8Var3.getValue()).setVisibility(8);
        }
        ny8 ny8Var4 = this.C;
        if (g58Var != null) {
            View view4 = (View) ny8Var4.getValue();
            ((t58) view4).setImageAttach(g58Var);
            view4.setVisibility(0);
        } else if (ny8Var4.d()) {
            ((View) ny8Var4.getValue()).setVisibility(8);
        }
        BitSet bitSet = this.l;
        l1c l1cVar = this.p;
        if (g58Var != null) {
            zqk.a(l1cVar, g58Var, getBlurPostProcessor(), true);
        } else {
            l1c.j(l1cVar, null, null, 6);
            bitSet.set(this.o, false);
        }
        bitSet.set(0, mxfVar.f != null && ((f5d) getFeaturePrefs()).v() && Build.VERSION.SDK_INT >= 29);
        bitSet.set(this.m, mxfVar.k);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new gk7(this, 4, new xre(this, 14, mxfVar)));
        gestureDetector.setIsLongpressEnabled(true);
        setOnTouchListener(new ek7(gestureDetector, 6));
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.d.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.d.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.k24
    public void setCommentCompactShareProgress(float f) {
        this.e.setCommentCompactShareProgress(f);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.F.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.F.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    public void setForceIfFloating(boolean z) {
        this.b.Z(z);
    }

    @Override // defpackage.mia
    public void setForwardClickListener(qf7 qf7Var) {
        this.b.d = qf7Var;
    }

    @Override // defpackage.v35
    public void setIsChannelMode(boolean z) {
        this.F.setChannelMode$message_list(z);
    }

    @Override // defpackage.b8e
    public void setIsIncoming(boolean z) {
        this.a.c = z;
    }

    @Override // defpackage.mia
    public void setLink(fia fiaVar) {
        this.b.setLink(fiaVar);
    }

    @Override // defpackage.b8e
    public void setMaxReactionsCount(int i) {
        this.a.f = i;
    }

    @Override // defpackage.b8e
    public void setOnClickListener(cf7 cf7Var) {
        this.a.d = cf7Var;
    }

    @Override // defpackage.k24
    public void setOnCommentsEntryClickListener(af7 af7Var) {
        this.e.d = af7Var;
    }

    @Override // defpackage.jp5
    public void setOnDoubleTap(af7 af7Var) {
        this.x = af7Var;
        dka dkaVar = this.y;
        if (af7Var != null) {
            dkaVar.setTryToSingleClickAction(null);
        } else {
            dkaVar.setTryToSingleClickAction(new wyf(this, 1));
        }
    }

    @Override // defpackage.i59
    public void setOnLinkLongClickListener(zs3 zs3Var) {
        this.v = zs3Var;
    }

    @Override // defpackage.azf
    public void setOnShareButtonClickListener(af7 af7Var) {
        this.f.c = af7Var;
    }

    @Override // defpackage.z7g
    public void setOnSingleClick(af7 af7Var) {
        this.w = af7Var;
    }

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.u.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.u.f(i);
    }

    @Override // defpackage.azf
    public void setShareButtonSwipeProgress(float f) {
        this.f.setShareButtonSwipeProgress(f);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.hnh
    public void setTextMessageColors(xac xacVar) {
        this.y.setTextColors(xacVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLayout(aka akaVar) {
        this.y.setLayout(akaVar);
    }

    @Override // defpackage.hnh
    public void setTextMessageLinkClickListener(o59 o59Var) {
        this.y.setLinkListener(o59Var);
    }

    @Override // defpackage.k24
    public final void v(xac xacVar) {
        this.e.v(xacVar);
    }

    @Override // defpackage.azf
    public final void w() {
        this.f.w();
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }
}
