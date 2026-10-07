package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class izb extends ViewGroup implements eph, oqe {
    public static final /* synthetic */ zv8[] I = {new z8b(izb.class, "isSelectionEnabled", "isSelectionEnabled()Z"), zo5.e(zfe.a, izb.class, "isRadioSelectionEnabled", "isRadioSelectionEnabled()Z"), new z8b(izb.class, "isItemSelected", "isItemSelected()Z"), new z8b(izb.class, "isRadioItemSelected", "isRadioItemSelected()Z"), new z8b(izb.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/theme/OneMeTheme;"), new z8b(izb.class, "callButtonMode", "getCallButtonMode()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$CallButtonMode;"), new z8b(izb.class, "subtitleTextColor", "getSubtitleTextColor()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Appearance;"), new z8b(izb.class, "trailingElementsPadding", "getTrailingElementsPadding()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Size;"), new z8b(izb.class, "cellHeight", "getCellHeight()Lone/me/sdk/uikit/common/cellitem/OneMeCellSimpleView$Companion$Size;")};
    public final hzb A;
    public final hzb B;
    public final hzb C;
    public View D;
    public View E;
    public View F;
    public View G;
    public final int H;
    public final boolean a;
    public final ny8 b;
    public final ny8 c;
    public int[] d;
    public final TextView e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final wme m;
    public final wme n;
    public final ny8 o;
    public final ny8 p;
    public final wme q;
    public final wme r;
    public final ShapeDrawable s;
    public final ny8 t;
    public final hzb u;
    public final hzb v;
    public final hzb w;
    public final hzb x;
    public final hzb y;
    public final hzb z;

    public izb(final Context context, boolean z) {
        super(context);
        this.a = z;
        final int i = 6;
        final int i2 = 3;
        this.b = rx8.P(3, new af7() { // from class: azb
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
                int i3 = i;
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i4 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE.setSingleLine();
                        textViewE.setTextColor(a8gVar.h(textViewE).getText().e);
                        q9i.g.b(textViewE, bx5.b);
                        np4.C(textViewE, false);
                        izbVar.addView(textViewE, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE;
                    case 2:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.i.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i5 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i5, i5));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        final int i3 = 0;
        this.c = rx8.P(3, new af7() { // from class: azb
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
                int i4 = i3;
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i5 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i5, i5));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE.setSingleLine();
                        textViewE.setTextColor(a8gVar.h(textViewE).getText().e);
                        q9i.g.b(textViewE, bx5.b);
                        np4.C(textViewE, false);
                        izbVar.addView(textViewE, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE;
                    case 2:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.i.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i6 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i6, i6));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        TextView textViewE = qv1.e(context, R.id.oneme_cell_simple_name);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        textViewE.setTextColor(pq3.j.h(textViewE).getText().b);
        q9i.f.b(textViewE, bx5.b);
        np4.C(textViewE, false);
        textViewE.setSingleLine();
        this.e = textViewE;
        final int i4 = 1;
        this.f = rx8.P(3, new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i5) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i6 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i6, i6));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i7 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i7, i7));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        final int i5 = 2;
        this.g = rx8.P(3, new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i7 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i7, i7));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i8 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i8, i8));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        this.h = rx8.P(3, new n52(context, 27));
        this.i = rx8.P(3, new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i6) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i7 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i7, i7));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i8 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i8, i8));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        this.j = rx8.P(3, new n52(context, 28));
        this.k = rx8.P(3, new n52(context, 29));
        final int i6 = 4;
        this.l = rx8.P(3, new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i7) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i8 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i8, i8));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i9 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i9, i9));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        final int i7 = 5;
        this.m = new wme(new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i8) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i9 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i9, i9));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i10 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        final int i8 = 7;
        this.n = new wme(new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i9) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i10 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i11 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        final int i9 = 8;
        this.o = rx8.P(3, new af7() { // from class: azb
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
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i10) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i11 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i12 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        this.p = rx8.P(3, new bzb(context, 0));
        final int i10 = 9;
        this.q = new wme(new af7() { // from class: azb
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
                int i11 = i10;
                a8g a8gVar = pq3.j;
                izb izbVar = this;
                Context context2 = context;
                switch (i11) {
                    case 0:
                        ImageView imageViewD = qv1.d(context2, R.id.oneme_cell_simple_avatar);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(a8gVar.h(imageViewD).b().e);
                        imageViewD.setBackground(shapeDrawable);
                        int i12 = izbVar.H;
                        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(i12, i12));
                        imageViewD.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        return imageViewD;
                    case 1:
                        TextView textViewE2 = qv1.e(context2, R.id.oneme_cell_simple_message);
                        textViewE2.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE2.setSingleLine();
                        textViewE2.setTextColor(a8gVar.h(textViewE2).getText().e);
                        q9i.g.b(textViewE2, bx5.b);
                        np4.C(textViewE2, false);
                        izbVar.addView(textViewE2, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE2;
                    case 2:
                        TextView textViewE3 = qv1.e(context2, R.id.oneme_cell_simple_alias);
                        textViewE3.setEllipsize(TextUtils.TruncateAt.END);
                        textViewE3.setSingleLine();
                        textViewE3.setTextColor(a8gVar.h(textViewE3).getText().e);
                        q9i.i.b(textViewE3, bx5.b);
                        np4.C(textViewE3, false);
                        izbVar.addView(textViewE3, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return textViewE3;
                    case 3:
                        ImageView imageViewD2 = qv1.d(context2, R.id.oneme_cell_simple_icon_info);
                        kbc customTheme = izbVar.getCustomTheme();
                        if (customTheme == null) {
                            customTheme = a8gVar.h(imageViewD2);
                        }
                        imageViewD2.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
                        imageViewD2.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD2;
                    case 4:
                        return izb.c(context2, izbVar);
                    case 5:
                        ImageView imageViewD3 = qv1.d(context2, R.id.oneme_cell_simple_first_trailing_icon);
                        kbc customTheme2 = izbVar.getCustomTheme();
                        if (customTheme2 == null) {
                            customTheme2 = a8gVar.h(imageViewD3);
                        }
                        imageViewD3.setImageTintList(ColorStateList.valueOf(customTheme2.getIcon().d));
                        imageViewD3.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD3;
                    case 6:
                        kwb kwbVar = new kwb(context2);
                        kwbVar.setId(R.id.oneme_cell_simple_avatar);
                        kwbVar.setAvatarShape(awb.a);
                        int i13 = izbVar.H;
                        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i13, i13));
                        return kwbVar;
                    case 7:
                        ImageView imageViewD4 = qv1.d(context2, R.id.oneme_cell_simple_second_trailing_icon);
                        kbc customTheme3 = izbVar.getCustomTheme();
                        if (customTheme3 == null) {
                            customTheme3 = a8gVar.h(imageViewD4);
                        }
                        imageViewD4.setImageTintList(ColorStateList.valueOf(customTheme3.getIcon().d));
                        imageViewD4.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
                        return imageViewD4;
                    case 8:
                        return izb.a(context2, izbVar);
                    default:
                        return izb.b(context2, izbVar);
                }
            }
        });
        this.r = new wme(new bzb(context, 1));
        this.s = new ShapeDrawable();
        this.t = rx8.P(3, new iua(10, this));
        this.u = new hzb(this, 0);
        this.v = new hzb(this, 1);
        this.w = new hzb(this, 2);
        this.x = new hzb(this, 3);
        this.y = new hzb(this, 4);
        this.z = new hzb(this, 5);
        this.A = new hzb(this, 6);
        this.B = new hzb(this, 7);
        this.C = new hzb(this, 8);
        this.H = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        addView(textViewE, new ViewGroup.LayoutParams(-2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static ImageView a(Context context, izb izbVar) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_cell_simple_audio);
        imageView.setImageResource(R.drawable.icon_call);
        kbc customTheme = izbVar.getCustomTheme();
        if (customTheme == null) {
            customTheme = pq3.j.h(imageView);
        }
        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
        x05.j(8.0f, yl5.d().getDisplayMetrics().density, imageView);
        imageView.setBackground(izbVar.getRippleDrawableButton());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        return imageView;
    }

    public static er b(Context context, izb izbVar) {
        er erVar = new er(context, null, R.attr.checkboxStyle);
        erVar.setId(R.id.oneme_cell_simple_checkbox);
        erVar.setPadding(0, 0, 0, 0);
        erVar.setButtonDrawable((Drawable) null);
        erVar.setBackground(izbVar.getCheckboxDrawable());
        erVar.setClickable(false);
        erVar.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        return erVar;
    }

    public static ImageView c(Context context, izb izbVar) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_cell_simple_video);
        imageView.setImageResource(R.drawable.icon_video_call);
        kbc customTheme = izbVar.getCustomTheme();
        if (customTheme == null) {
            customTheme = pq3.j.h(imageView);
        }
        imageView.setImageTintList(ColorStateList.valueOf(customTheme.getIcon().b));
        x05.j(8.0f, yl5.d().getDisplayMetrics().density, imageView);
        imageView.setBackground(izbVar.getRippleDrawableButton());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        return imageView;
    }

    public static final void d(izb izbVar) {
        int i;
        if (n7j.o(izbVar.f)) {
            kbc customTheme = izbVar.getCustomTheme();
            if (customTheme == null) {
                customTheme = pq3.j.h(izbVar);
            }
            int iOrdinal = izbVar.getSubtitleTextColor().ordinal();
            if (iOrdinal == 0) {
                i = customTheme.getText().b;
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return;
                }
                i = customTheme.getText().d;
            }
            izbVar.getSubtitleView().setTextColor(i);
        }
    }

    public static int e(ezb ezbVar) {
        int iOrdinal = ezbVar.ordinal();
        if (iOrdinal == 0) {
            return gm0.K(60.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
        }
        ore.o();
        return 0;
    }

    private final TextView getAliasView() {
        return (TextView) this.g.getValue();
    }

    private final cyb getButtonView() {
        return (cyb) this.k.getValue();
    }

    private final qjg getCheckboxDrawable() {
        return (qjg) this.p.getValue();
    }

    private final l1c getDraweeView() {
        return (l1c) this.j.getValue();
    }

    private final ImageView getFirstTrailingIcon() {
        return (ImageView) this.m.getValue();
    }

    private final ImageView getFirstTrailingImageButton() {
        return (ImageView) this.o.getValue();
    }

    private final ImageView getIconInfoView() {
        return (ImageView) this.i.getValue();
    }

    private final t6c getReactionView() {
        return (t6c) this.h.getValue();
    }

    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.t.getValue();
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = ((bs0) pq3.j.h(this).u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return col.b(i, null, shapeDrawable);
    }

    private final ImageView getSecondTrailingIcon() {
        return (ImageView) this.n.getValue();
    }

    private final ImageView getSecondTrailingImageButton() {
        return (ImageView) this.l.getValue();
    }

    private final TextView getSubtitleView() {
        return (TextView) this.f.getValue();
    }

    public static int q(ezb ezbVar) {
        int iOrdinal = ezbVar.ordinal();
        if (iOrdinal == 0) {
            return gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 1) {
            return gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        }
        if (iOrdinal == 2) {
            return gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        }
        ore.o();
        return 0;
    }

    public final int f(View view) {
        return ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight()) / 2) + getPaddingTop();
    }

    public final void g() {
        getReactionView().invalidate();
    }

    public final View getAnchorButton() {
        return getButtonView();
    }

    public final dzb getCallButtonMode() {
        zv8 zv8Var = I[5];
        return (dzb) this.z.b;
    }

    public final ezb getCellHeight() {
        zv8 zv8Var = I[8];
        return (ezb) this.C.b;
    }

    public final kbc getCustomTheme() {
        zv8 zv8Var = I[4];
        return (kbc) this.y.b;
    }

    public final au5 getDraweeController() {
        return getDraweeView().getController();
    }

    public final czb getSubtitleTextColor() {
        zv8 zv8Var = I[6];
        return (czb) this.A.b;
    }

    public final ezb getTrailingElementsPadding() {
        zv8 zv8Var = I[7];
        return (ezb) this.B.b;
    }

    public final boolean h(String str) {
        return (str == null || str.length() == 0 || getSubtitleView().getPaint().measureText(str) <= ((float) getSubtitleView().getMeasuredWidth())) ? false : true;
    }

    public final void i() {
        if (n7j.o(this.k)) {
            getButtonView().setOnClickListener(null);
            getButtonView().setVisibility(8);
        }
        if (n7j.o(this.o)) {
            getFirstTrailingImageButton().setOnClickListener(null);
            getFirstTrailingImageButton().setVisibility(8);
        }
        if (n7j.o(this.l)) {
            getSecondTrailingImageButton().setOnClickListener(null);
            getSecondTrailingImageButton().setVisibility(8);
        }
    }

    public final void j(long j, CharSequence charSequence, String str) {
        ny8 ny8Var = this.b;
        kwb.v((kwb) ny8Var.getValue(), str, Long.valueOf(j), charSequence);
        View view = this.E;
        if (view != null) {
            removeView(view);
        }
        View view2 = (View) ny8Var.getValue();
        if (view2 != null) {
            addView(view2);
            requestLayout();
        }
        this.E = view2;
    }

    public final void k(CharSequence charSequence, af7 af7Var) {
        cyb buttonView = getButtonView();
        buttonView.setText(charSequence);
        qe7.H(buttonView, 300L, new d8(11, af7Var));
        buttonView.setVisibility(0);
        buttonView.setAppearance(zxb.GHOST);
        buttonView.setTextColor(Integer.valueOf(R.attr.text_themed));
        buttonView.setSize(ayb.h);
        View view = this.G;
        if (view != null) {
            removeView(view);
        }
        addView(buttonView);
        requestLayout();
        this.G = buttonView;
    }

    public final void l(wj7 wj7Var, s1d s1dVar) {
        l1c draweeView = getDraweeView();
        draweeView.setHierarchy(wj7Var);
        draweeView.setController(s1dVar);
        draweeView.setVisibility(0);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        TextView textView = this.e;
        textView.setPadding(iK, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        View view = this.D;
        if (view != null) {
            removeView(view);
        }
        l1c draweeView2 = getDraweeView();
        if (draweeView2 != null) {
            addView(draweeView2);
            requestLayout();
        }
        this.D = draweeView2;
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
    public final void m(int i, int[] iArr) {
        this.d = iArr;
        ny8 ny8Var = this.c;
        ImageView imageView = (ImageView) ny8Var.getValue();
        if (iArr != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
            gradientDrawable.setShape(1);
            imageView.setBackground(gradientDrawable);
            imageView.setImageTintList(null);
        } else {
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            a8g a8gVar = pq3.j;
            paint.setColor(a8gVar.h(imageView).b().e);
            imageView.setBackground(shapeDrawable);
            imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().b));
        }
        imageView.setImageResource(i);
        View view = this.E;
        if (view != null) {
            removeView(view);
        }
        View view2 = (View) ny8Var.getValue();
        if (view2 != null) {
            addView(view2);
            requestLayout();
        }
        this.E = view2;
    }

    public final void n(Integer num, zxb zxbVar, Integer num2, af7 af7Var) {
        if (num == null) {
            ny8 ny8Var = this.k;
            if (ny8Var.d()) {
                ((cyb) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        cyb buttonView = getButtonView();
        buttonView.setIconResource(num.intValue());
        qe7.H(buttonView, 300L, new d8(10, af7Var));
        buttonView.setVisibility(0);
        buttonView.setAppearance(zxbVar);
        buttonView.setSize(ayb.h);
        buttonView.setIconColor(num2);
        View view = this.G;
        if (view != null) {
            removeView(view);
        }
        cyb buttonView2 = getButtonView();
        if (buttonView2 != null) {
            addView(buttonView2);
            requestLayout();
        }
        this.G = buttonView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(pq3.j.h(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.D;
        View view2 = this.E;
        int paddingLeft = getPaddingLeft();
        if (view != null && view.getVisibility() == 0) {
            qyj.M(view, paddingLeft, f(view), 0, 12);
            paddingLeft = c0a.e(12.0f, yl5.d().getDisplayMetrics().density, view.getMeasuredWidth(), paddingLeft);
        }
        if (view2 != null && view2.getVisibility() == 0) {
            qyj.M(view2, paddingLeft, f(view2), 0, 12);
            paddingLeft = c0a.e(12.0f, yl5.d().getDisplayMetrics().density, view2.getMeasuredWidth(), paddingLeft);
        }
        TextView aliasView = n7j.o(this.g) ? getAliasView() : null;
        View view3 = this.F;
        View view4 = this.G;
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        if (view4 != null) {
            measuredWidth -= view4.getMeasuredWidth();
            qyj.M(view4, measuredWidth, f(view4), 0, 12);
        }
        int iQ = view4 == null ? 0 : q(getTrailingElementsPadding());
        if (view3 != null) {
            measuredWidth -= view3.getMeasuredWidth() + iQ;
            qyj.M(view3, measuredWidth, f(view3), 0, 12);
        }
        int iK = (view4 == null || view3 == null) ? 0 : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        if (aliasView != null) {
            qyj.M(aliasView, measuredWidth - (aliasView.getMeasuredWidth() + iK), (getMeasuredHeight() - aliasView.getMeasuredHeight()) / 2, 0, 12);
        }
        boolean zO = n7j.o(this.f);
        TextView textView = this.e;
        if (!zO) {
            qyj.M(textView, paddingLeft, f(textView), 0, 12);
            return;
        }
        int measuredHeight = (((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - textView.getMeasuredHeight()) - getSubtitleView().getMeasuredHeight()) / 2) + getPaddingTop();
        qyj.M(textView, paddingLeft, measuredHeight, 0, 12);
        qyj.M(getSubtitleView(), paddingLeft, textView.getMeasuredHeight() + 2 + measuredHeight, 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int iE;
        int iMax2;
        int iE2;
        float f;
        int i3;
        TextView textView = this.e;
        if (soh.c(textView)) {
            setVerified(true);
        }
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i4 = size - paddingRight;
        View view = this.D;
        View view2 = this.E;
        if (view == null || view.getVisibility() != 0) {
            iMax = 0;
            iE = 0;
        } else {
            measureChild(view, i, i2);
            iE = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, view.getMeasuredWidth());
            iMax = view.getMeasuredHeight();
        }
        if (view2 != null && view2.getVisibility() == 0) {
            measureChild(view2, i, i2);
            iE = c0a.e(12.0f, yl5.d().getDisplayMetrics().density, view2.getMeasuredWidth(), iE);
            iMax = Math.max(iMax, view2.getMeasuredHeight());
        }
        long jA = bj8.a(iE, iMax);
        int i5 = (int) (jA >> 32);
        int i6 = (int) (jA & 4294967295L);
        int i7 = paddingRight + i5;
        TextView aliasView = n7j.o(this.g) ? getAliasView() : null;
        View view3 = this.F;
        View view4 = this.G;
        if (aliasView != null) {
            measureChild(aliasView, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            iE2 = zo5.b(12.0f, yl5.d().getDisplayMetrics().density, aliasView.getMeasuredWidth());
            iMax2 = aliasView.getMeasuredHeight();
        } else {
            iMax2 = 0;
            iE2 = 0;
        }
        if (view4 != null) {
            f = 12.0f;
            i3 = 0;
            measureChild(view4, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
            iE2 = (view3 == null ? gm0.K(yl5.d().getDisplayMetrics().density * 12.0f) : q(getTrailingElementsPadding())) + view4.getMeasuredWidth() + iE2;
            iMax2 = Math.max(iMax2, view4.getMeasuredHeight());
        } else {
            f = 12.0f;
            i3 = 0;
        }
        if (view3 != null) {
            measureChild(view3, View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            iE2 = c0a.e(f, yl5.d().getDisplayMetrics().density, view3.getMeasuredWidth(), iE2);
            iMax2 = Math.max(iMax2, view3.getMeasuredHeight());
        }
        long jA2 = bj8.a(iE2, iMax2);
        int i8 = (int) (jA2 >> 32);
        int i9 = i7 + i8;
        int i10 = i4 - (i5 + i8);
        int iMax3 = Math.max(i6, (int) (jA2 & 4294967295L));
        textView.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(e(getCellHeight()), Integer.MIN_VALUE));
        int measuredHeight = textView.getMeasuredHeight();
        ny8 ny8Var = this.f;
        if (n7j.o(ny8Var)) {
            getSubtitleView().measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(e(getCellHeight()), Integer.MIN_VALUE));
            measuredHeight += getSubtitleView().getMeasuredHeight() + gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        }
        int iMax4 = Math.max(textView.getMeasuredWidth(), n7j.o(ny8Var) ? getSubtitleView().getMeasuredWidth() : i3) + i9;
        int iMax5 = Math.max(e(getCellHeight()), Math.max(iMax3, measuredHeight) + getPaddingBottom() + getPaddingTop());
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(iMax4, size);
        } else if (mode != 1073741824) {
            size = iMax4;
        }
        setMeasuredDimension(size, iMax5);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc customTheme = getCustomTheme();
        if (customTheme != null) {
            kbcVar = customTheme;
        }
        ny8 ny8Var = this.b;
        if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).onThemeChanged(kbcVar);
        }
        getIconInfoView().setImageTintList(ColorStateList.valueOf(-1));
        this.e.setTextColor(kbcVar.getText().b);
        ny8 ny8Var2 = this.f;
        if (ny8Var2.d()) {
            TextView textView = (TextView) ny8Var2.getValue();
            d(this);
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
        }
        ny8 ny8Var3 = this.g;
        if (ny8Var3.d()) {
            ((TextView) ny8Var3.getValue()).setTextColor(kbcVar.getText().d);
        }
        getRippleDrawable().setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
        r();
        wme wmeVar = this.q;
        if (wmeVar.d()) {
            so2.C(getCheckboxDrawable(), kbcVar);
        }
        wme wmeVar2 = this.r;
        if (wmeVar2.d()) {
            s6c s6cVar = (s6c) wmeVar2.getValue();
            s6cVar.setCustomTheme(getCustomTheme());
            s6cVar.onThemeChanged(kbcVar);
        }
        ny8 ny8Var4 = this.k;
        if (ny8Var4.d()) {
            ((cyb) ny8Var4.getValue()).e();
        }
        wme wmeVar3 = this.m;
        if (wmeVar3.d()) {
            ((ImageView) wmeVar3.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        }
        wme wmeVar4 = this.n;
        if (wmeVar4.d()) {
            ((ImageView) wmeVar4.getValue()).setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        }
        ny8 ny8Var5 = this.c;
        if (ny8Var5.d()) {
            ImageView imageView = (ImageView) ny8Var5.getValue();
            int[] iArr = this.d;
            if (iArr != null) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
                gradientDrawable.setShape(1);
                imageView.setBackground(gradientDrawable);
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
                if (imageView.getBackground() != null) {
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                    shapeDrawable.getPaint().setColor(kbcVar.b().e);
                    imageView.setBackground(shapeDrawable);
                }
            }
        }
        ny8 ny8Var6 = this.l;
        if (ny8Var6.d()) {
            ((ImageView) ny8Var6.getValue()).setBackground(getRippleDrawableButton());
        }
        ny8 ny8Var7 = this.o;
        if (ny8Var7.d()) {
            ((ImageView) ny8Var7.getValue()).setBackground(getRippleDrawableButton());
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a || isEnabled() || motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        }
        performClick();
        return true;
    }

    public final void p(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, cf7 cf7Var) {
        ImageView firstTrailingImageButton = getFirstTrailingImageButton();
        qe7.H(firstTrailingImageButton, 300L, new zyb(0, cf7Var));
        firstTrailingImageButton.setImageDrawable(layerDrawable);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 0.0f);
        firstTrailingImageButton.setPadding(iK, iK, iK, iK);
        firstTrailingImageButton.setVisibility(0);
        View view = this.F;
        if (view != null) {
            removeView(view);
        }
        addView(firstTrailingImageButton);
        requestLayout();
        this.F = firstTrailingImageButton;
        ImageView secondTrailingImageButton = getSecondTrailingImageButton();
        qe7.H(secondTrailingImageButton, 300L, new zyb(1, cf7Var));
        secondTrailingImageButton.setImageDrawable(layerDrawable2);
        int iK2 = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        secondTrailingImageButton.setPadding(iK2, iK2, iK2, iK2);
        secondTrailingImageButton.setVisibility(0);
        View view2 = this.G;
        if (view2 != null) {
            removeView(view2);
        }
        addView(secondTrailingImageButton);
        requestLayout();
        this.G = secondTrailingImageButton;
        r();
    }

    public final void r() {
        int i;
        int i2;
        kbc customTheme = getCustomTheme();
        if (customTheme == null) {
            customTheme = pq3.j.h(this);
        }
        ny8 ny8Var = this.o;
        if (ny8Var.d()) {
            ImageView imageView = (ImageView) ny8Var.getValue();
            int iOrdinal = getCallButtonMode().ordinal();
            if (iOrdinal == 0) {
                i2 = customTheme.getIcon().b;
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return;
                }
                i2 = customTheme.getIcon().i;
            }
            imageView.setImageTintList(ColorStateList.valueOf(i2));
        }
        ny8 ny8Var2 = this.l;
        if (ny8Var2.d()) {
            ImageView imageView2 = (ImageView) ny8Var2.getValue();
            int iOrdinal2 = getCallButtonMode().ordinal();
            if (iOrdinal2 == 0) {
                i = customTheme.getIcon().b;
            } else {
                if (iOrdinal2 != 1) {
                    ore.o();
                    return;
                }
                i = customTheme.getIcon().j;
            }
            imageView2.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setAlias(CharSequence charSequence) {
        if ((charSequence == null || r5h.X0(charSequence)) && getAliasView().getVisibility() != 0) {
            return;
        }
        getAliasView().setText(charSequence);
        getAliasView().setVisibility(charSequence == null || r5h.X0(charSequence) ? 8 : 0);
        requestLayout();
    }

    public final void setAvatarOverlay(zvb zvbVar) {
        ((kwb) this.b.getValue()).setOverlay(zvbVar);
    }

    public final void setCallButtonMode(dzb dzbVar) {
        this.z.B(this, I[5], dzbVar);
    }

    public final void setCallButtons(cf7 cf7Var) {
        qe7.H(getFirstTrailingImageButton(), 300L, new zyb(2, cf7Var));
        qe7.H(getSecondTrailingImageButton(), 300L, new zyb(3, cf7Var));
        getFirstTrailingImageButton().setVisibility(0);
        getSecondTrailingImageButton().setVisibility(0);
        View view = this.F;
        if (view != null) {
            removeView(view);
        }
        ImageView firstTrailingImageButton = getFirstTrailingImageButton();
        if (firstTrailingImageButton != null) {
            addView(firstTrailingImageButton);
            requestLayout();
        }
        this.F = firstTrailingImageButton;
        View view2 = this.G;
        if (view2 != null) {
            removeView(view2);
        }
        ImageView secondTrailingImageButton = getSecondTrailingImageButton();
        if (secondTrailingImageButton != null) {
            addView(secondTrailingImageButton);
            requestLayout();
        }
        this.G = secondTrailingImageButton;
    }

    public final void setCellHeight(ezb ezbVar) {
        this.C.B(this, I[8], ezbVar);
    }

    public final void setCheckButtonClickListener(cf7 cf7Var) {
        wme wmeVar = this.q;
        if (wmeVar.d()) {
            er erVar = (er) wmeVar.getValue();
            if (cf7Var != null) {
                erVar.setClickable(true);
                erVar.setOnCheckedChangeListener(new fzb(this, cf7Var, 0));
            } else {
                erVar.setClickable(false);
                erVar.setOnCheckedChangeListener(null);
            }
        }
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.y.B(this, I[4], kbcVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.4f);
    }

    public final void setFirstTrailingIcon(Integer num) {
        if (num == null) {
            wme wmeVar = this.m;
            if (wmeVar.d()) {
                wmeVar.a();
                View view = this.F;
                if (view != null) {
                    removeView(view);
                }
                this.F = null;
                return;
            }
            return;
        }
        ImageView firstTrailingIcon = getFirstTrailingIcon();
        firstTrailingIcon.setImageResource(num.intValue());
        firstTrailingIcon.setVisibility(0);
        View view2 = this.F;
        if (view2 != null) {
            removeView(view2);
        }
        ImageView firstTrailingIcon2 = getFirstTrailingIcon();
        if (firstTrailingIcon2 != null) {
            addView(firstTrailingIcon2);
            requestLayout();
        }
        this.F = firstTrailingIcon2;
    }

    public final void setFirstTrailingIconClickListener(af7 af7Var) {
        wme wmeVar = this.m;
        if (wmeVar.d()) {
            ImageView imageView = (ImageView) wmeVar.getValue();
            if (af7Var == null) {
                imageView.setOnClickListener(null);
            } else {
                qe7.H(imageView, 300L, new gzb(0, af7Var));
            }
        }
    }

    public final void setIconInfo(Integer num) {
        if (num == null) {
            ny8 ny8Var = this.i;
            if (ny8Var.d()) {
                ((ImageView) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        ImageView iconInfoView = getIconInfoView();
        iconInfoView.setImageResource(num.intValue());
        iconInfoView.setVisibility(0);
        View view = this.G;
        if (view != null) {
            removeView(view);
        }
        ImageView iconInfoView2 = getIconInfoView();
        if (iconInfoView2 != null) {
            addView(iconInfoView2);
            requestLayout();
        }
        this.G = iconInfoView2;
    }

    public final void setIsIconBackgroundEnabled(boolean z) {
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            View view = (ImageView) ny8Var.getValue();
            if (!z) {
                view.setBackground(null);
                return;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(pq3.j.h(view).b().e);
            view.setBackground(shapeDrawable);
        }
    }

    public final void setItemSelected(boolean z) {
        this.w.B(this, I[2], Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setBackground(onClickListener != null ? getRippleDrawable() : null);
    }

    public final void setOnline(boolean z) {
        ny8 ny8Var = this.b;
        if (ny8Var.d()) {
            ((kwb) ny8Var.getValue()).setOnlineBadgeVisibility(z);
        }
    }

    public final void setRadioButtonClickListener(cf7 cf7Var) {
        wme wmeVar = this.r;
        if (wmeVar.d()) {
            s6c s6cVar = (s6c) wmeVar.getValue();
            if (cf7Var != null) {
                s6cVar.setClickable(true);
                s6cVar.setOnCheckedChangeListener(new fzb(this, cf7Var, 1));
            } else {
                s6cVar.setClickable(false);
                s6cVar.setOnCheckedChangeListener(null);
            }
        }
    }

    public final void setRadioItemSelected(boolean z) {
        this.x.B(this, I[3], Boolean.valueOf(z));
    }

    public final void setRadioSelectionEnabled(boolean z) {
        this.v.B(this, I[1], Boolean.valueOf(z));
    }

    public final void setReaction(Drawable drawable) {
        if (drawable != null || getReactionView().getVisibility() == 0) {
            ny8 ny8Var = this.g;
            if (ny8Var.d()) {
                getAliasView().setVisibility(8);
            }
            getReactionView().setReaction(drawable);
            View view = this.F;
            if (view != null) {
                removeView(view);
            }
            t6c reactionView = getReactionView().getVisibility() == 0 ? getReactionView() : null;
            if (reactionView != null) {
                addView(reactionView);
                requestLayout();
            }
            this.F = reactionView;
        }
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        this.s.setShape(shape);
    }

    public final void setSecondTrailingIcon(Integer num) {
        if (num == null) {
            wme wmeVar = this.n;
            if (wmeVar.d()) {
                wmeVar.a();
                View view = this.G;
                if (view != null) {
                    removeView(view);
                }
                this.G = null;
                return;
            }
            return;
        }
        ImageView secondTrailingIcon = getSecondTrailingIcon();
        secondTrailingIcon.setImageResource(num.intValue());
        secondTrailingIcon.setVisibility(0);
        View view2 = this.G;
        if (view2 != null) {
            removeView(view2);
        }
        ImageView secondTrailingIcon2 = getSecondTrailingIcon();
        if (secondTrailingIcon2 != null) {
            addView(secondTrailingIcon2);
            requestLayout();
        }
        this.G = secondTrailingIcon2;
    }

    public final void setSecondTrailingIconClickListener(af7 af7Var) {
        wme wmeVar = this.n;
        if (wmeVar.d()) {
            ImageView imageView = (ImageView) wmeVar.getValue();
            if (af7Var == null) {
                imageView.setOnClickListener(null);
            } else {
                qe7.H(imageView, 300L, new gzb(1, af7Var));
            }
        }
    }

    public final void setSelectionEnabled(boolean z) {
        this.u.B(this, I[0], Boolean.valueOf(z));
    }

    public final void setSubtitle(CharSequence charSequence) {
        if ((charSequence == null || r5h.X0(charSequence)) && !n7j.o(this.f)) {
            return;
        }
        getSubtitleView().setText(charSequence);
        getSubtitleView().setVisibility(charSequence == null || r5h.X0(charSequence) ? 8 : 0);
    }

    public final void setSubtitleTextColor(czb czbVar) {
        this.A.B(this, I[6], czbVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public final void setTrailingElementsPadding(ezb ezbVar) {
        this.B.B(this, I[7], ezbVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final void setVerified(boolean z) {
        osi osiVar;
        TextView textView = this.e;
        int iI0 = oc9.i0(soh.e(textView));
        if (z) {
            osi osiVarA = soh.a(textView);
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(textView);
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(getContext(), iI0, ou7.j);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(textView, osiVar);
    }

    public final void setTitle(int i) {
        this.e.setText(i);
    }

    public /* synthetic */ izb(Context context) {
        this(context, false);
    }
}
