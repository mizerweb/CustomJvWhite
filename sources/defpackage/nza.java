package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nza extends wf4 implements eph {
    public mza s;
    public final eu9 t;
    public final ImageView u;
    public final TextView v;
    public final TextView w;
    public final ImageView x;
    public final ImageView y;
    public final y19 z;

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
    public nza(Context context) {
        super(context, null);
        mza mzaVar = mza.a;
        this.s = mzaVar;
        eu9 eu9Var = new eu9(0, 0, context);
        a8g a8gVar = pq3.j;
        eu9Var.c(a8gVar.h(this).getIcon().h);
        this.t = eu9Var;
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.oneme_mini_player_playback);
        uf4 uf4Var = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        uf4Var.t = 0;
        uf4Var.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        uf4Var.i = 0;
        uf4Var.l = 0;
        imageView.setLayoutParams(uf4Var);
        imageView.setBackground(getSelectableItemOvalBackground());
        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageDrawable(eu9Var);
        this.u = imageView;
        TextView textView = new TextView(getContext());
        textView.setId(R.id.oneme_mini_player_title);
        uf4 uf4Var2 = new uf4(0, -2);
        textView.setId(R.id.oneme_mini_player_title);
        uf4Var2.i = 0;
        uf4Var2.s = R.id.oneme_mini_player_playback;
        uf4Var2.u = R.id.oneme_mini_player_speed;
        uf4Var2.k = R.id.oneme_mini_player_subtitle;
        uf4Var2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        ((ViewGroup.MarginLayoutParams) uf4Var2).topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        textView.setLayoutParams(uf4Var2);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(p.d(textView, q9i.i, a8gVar, textView).b);
        this.v = textView;
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.oneme_mini_player_subtitle);
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.j = R.id.oneme_mini_player_title;
        ((ViewGroup.MarginLayoutParams) uf4Var3).topMargin = gm0.K(3.0f * yl5.d().getDisplayMetrics().density);
        uf4Var3.s = R.id.oneme_mini_player_playback;
        uf4Var3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        uf4Var3.u = R.id.oneme_mini_player_speed;
        uf4Var3.l = 0;
        ((ViewGroup.MarginLayoutParams) uf4Var3).bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
        textView2.setLayoutParams(uf4Var3);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(p.d(textView2, q9i.k, a8gVar, textView2).d);
        this.w = textView2;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R.id.oneme_mini_player_speed);
        uf4 uf4Var4 = new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        uf4Var4.u = R.id.oneme_mini_player_close;
        uf4Var4.i = 0;
        uf4Var4.l = 0;
        int iK2 = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        imageView2.setPadding(iK2, iK2, iK2, iK2);
        imageView2.setLayoutParams(uf4Var4);
        imageView2.setBackground(getSelectableItemOvalBackground());
        u(imageView2, mzaVar);
        this.x = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setId(R.id.oneme_mini_player_close);
        int iK3 = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        uf4 uf4Var5 = new uf4(bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, iK3), bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, iK3));
        uf4Var5.v = 0;
        uf4Var5.i = 0;
        uf4Var5.l = 0;
        int iK4 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        imageView3.setPadding(iK4, iK4, iK4, iK4);
        imageView3.setLayoutParams(uf4Var5);
        imageView3.setImageResource(R.drawable.icon_cross_round);
        imageView3.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView3).getIcon().d));
        imageView3.setBackground(getSelectableItemOvalBackground());
        this.y = imageView3;
        y19 y19Var = new y19(R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, getContext());
        z19 z19Var = (z19) y19Var.a;
        o19 o19Var = new o19(z19Var);
        o19Var.b = 300.0f;
        Context context2 = y19Var.getContext();
        y19Var.setIndeterminateDrawable(new yc8(context2, z19Var, o19Var, z19Var.h == 0 ? new q19(z19Var) : new s19(context2, z19Var)));
        y19Var.setProgressDrawable(new dj5(y19Var.getContext(), z19Var, o19Var));
        y19Var.setId(R.id.oneme_mini_player_progress);
        uf4 uf4Var6 = new uf4(-1, gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
        uf4Var6.l = 0;
        y19Var.setLayoutParams(uf4Var6);
        y19Var.setTrackCornerRadius(gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        y19Var.setTrackThickness(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        y19Var.setMin(0);
        y19Var.setMax(1000);
        y19Var.setProgress(0);
        y19Var.setTrackColor(0);
        y19Var.setIndicatorColor(a8gVar.h(y19Var).getIcon().h);
        this.z = y19Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(imageView2);
        addView(imageView3);
        addView(y19Var);
    }

    private final Drawable getSelectableItemOvalBackground() {
        return new RippleDrawable(ColorStateList.valueOf(((fn8) pq3.j.h(this).u().c.b).c), null, new ShapeDrawable(new OvalShape()));
    }

    public final ImageView getCloseButton() {
        return this.y;
    }

    public final ImageView getPlaybackButton() {
        return this.u;
    }

    public final mza getPlaybackSpeed() {
        return this.s;
    }

    public final ImageView getPlaybackSpeedButton() {
        return this.x;
    }

    public final int getPlayedProgress() {
        return this.z.getProgress();
    }

    public final y19 getProgress() {
        return this.z;
    }

    public final TextView getSubtitle() {
        return this.w;
    }

    public final TextView getTitle() {
        return this.v;
    }

    public final View getTooltipAnchor() {
        return this.x;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.t.c(kbcVar.getIcon().h);
        this.u.setBackground(getSelectableItemOvalBackground());
        a8g a8gVar = pq3.j;
        this.v.setTextColor(a8gVar.h(this).getText().b);
        this.w.setTextColor(a8gVar.h(this).getText().d);
        ImageView imageView = this.x;
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().d));
        imageView.setBackground(getSelectableItemOvalBackground());
        ImageView imageView2 = this.y;
        imageView2.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView2).getIcon().d));
        imageView2.setBackground(getSelectableItemOvalBackground());
        this.z.setIndicatorColor(a8gVar.h(this).h().a);
    }

    public final void setIsPlaying(boolean z) {
        eu9 eu9Var = this.t;
        if (z) {
            zv8[] zv8VarArr = eu9.u;
            eu9Var.d();
        } else {
            zv8[] zv8VarArr2 = eu9.u;
            eu9Var.e(true);
        }
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.y;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            qe7.H(imageView, 1000L, onClickListener);
        }
    }

    public final void setOnPlaybackClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.u;
        if (onClickListener == null) {
            imageView.setOnClickListener(null);
        } else {
            qe7.H(imageView, 200L, onClickListener);
        }
    }

    public final void setOnPlaybackSpeedClick(cf7 cf7Var) {
        ImageView imageView = this.x;
        if (cf7Var == null) {
            imageView.setOnClickListener(null);
        } else {
            qe7.H(imageView, 200L, new z36(cf7Var, 28, this));
        }
    }

    public final void setPlaybackSpeed(mza mzaVar) {
        ImageView imageView = this.x;
        if (mzaVar != null) {
            u(imageView, mzaVar);
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void setProgress(float f) {
        y19 y19Var = this.z;
        y19Var.setProgress(oc9.v((int) ((f * (y19Var.getMax() - y19Var.getMin())) + y19Var.getMin()), y19Var.getMin(), y19Var.getMax()));
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.w.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.v.setText(charSequence);
    }

    public final void u(ImageView imageView, mza mzaVar) {
        int i;
        imageView.setVisibility(0);
        int iOrdinal = mzaVar.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.icon_voice_speed_1x;
        } else if (iOrdinal == 1) {
            i = R.drawable.icon_voice_speed_1_5x;
        } else {
            if (iOrdinal != 2) {
                ore.o();
                return;
            }
            i = R.drawable.icon_voice_speed_2x;
        }
        imageView.setImageDrawable(imageView.getContext().getDrawable(i).mutate());
        imageView.setImageTintList(ColorStateList.valueOf(pq3.j.h(imageView).getIcon().d));
        this.s = mzaVar;
    }
}
