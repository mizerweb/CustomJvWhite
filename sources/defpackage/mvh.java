package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mvh extends PopupWindow implements eph {
    public final View a;
    public final af7 b;
    public final af7 c;
    public final af7 d;
    public final int e;
    public int f;
    public final ImageView g;
    public final TextView h;
    public final TextView i;
    public final ImageView j;
    public final Handler k;
    public f4g l;
    public String m;
    public final ny8 n;

    public mvh(Context context, View view, af7 af7Var, af7 af7Var2, int i, int i2, boolean z, int i3) {
        af7 bdbVar = (i3 & 8) != 0 ? new bdb(2, af7Var) : af7Var2;
        bdb bdbVar2 = (i3 & 16) != 0 ? new bdb(3, af7Var) : null;
        int i4 = (i3 & 32) != 0 ? 2 : i;
        int i5 = (i3 & 64) != 0 ? 2 : i2;
        boolean z2 = (i3 & np0.m) != 0 ? false : z;
        this.a = view;
        this.b = af7Var;
        this.c = bdbVar;
        this.d = bdbVar2;
        this.e = i4;
        this.f = i5;
        this.k = new Handler(Looper.getMainLooper());
        ny8 ny8VarP = rx8.P(3, new kvh(this, 1));
        this.n = ny8VarP;
        kbc kbcVar = (kbc) af7Var.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(z2);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.oneme_tooltip_view_icon);
        imageView.setLayoutParams(new uf4(-2, -2));
        imageView.setVisibility(8);
        this.g = imageView;
        TextView textViewE = qv1.e(context, R.id.oneme_tooltip_view_title);
        textViewE.setLayoutParams(new uf4(-1, -2));
        textViewE.setGravity(17);
        textViewE.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewE.setEllipsize(truncateAt);
        textViewE.setTextColor(ColorStateList.valueOf(kbcVar.getText().b));
        q9i.a(q9i.i, textViewE);
        this.h = textViewE;
        ImageView imageViewD = qv1.d(context, R.id.oneme_tooltip_view_close);
        imageViewD.setLayoutParams(new uf4(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density)));
        imageViewD.setImageResource(R.drawable.icon_cross_round);
        ((kbc) af7Var.invoke()).getIcon();
        imageViewD.setImageTintList(ColorStateList.valueOf(-1));
        qe7.H(imageViewD, 300L, new aah(4, this));
        imageViewD.setVisibility(8);
        this.j = imageViewD;
        TextView textViewE2 = qv1.e(context, R.id.oneme_tooltip_view_subtitle);
        textViewE2.setLayoutParams(new uf4(-1, -2));
        textViewE2.setGravity(17);
        textViewE2.setMaxLines(3);
        textViewE2.setEllipsize(truncateAt);
        textViewE2.setTextColor(ColorStateList.valueOf(kbcVar.getText().d));
        q9i.a(q9i.k, textViewE2);
        textViewE2.setVisibility(8);
        this.i = textViewE2;
        wf4 wf4Var = new wf4(context);
        wf4Var.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) + (i4 == 1 ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) : 0), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + (i4 == 2 ? gm0.K(8.0f * yl5.d().getDisplayMetrics().density) : 0));
        wf4Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        wf4Var.setBackground((ivh) ny8VarP.getValue());
        wf4Var.addView(imageViewD);
        wf4Var.addView(imageView);
        wf4Var.addView(textViewE);
        wf4Var.addView(textViewE2);
        wf4Var.setVisibility(8);
        eg4 eg4VarH = ch3.h(wf4Var);
        int id = imageViewD.getId();
        eg4VarH.d(id, 3, 0, 3);
        eg4VarH.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        eg4VarH.d(id2, 6, 0, 6);
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 4, textViewE.getId(), 3);
        eg4VarH.g(id2).d.W = 2;
        int id3 = textViewE.getId();
        eg4VarH.d(id3, 3, imageView.getId(), 4);
        eg4VarH.d(id3, 6, 0, 6);
        eg4VarH.d(id3, 7, imageViewD.getId(), 6);
        eg4VarH.d(id3, 4, textViewE2.getId(), 3);
        int id4 = textViewE2.getId();
        eg4VarH.d(id4, 3, textViewE.getId(), 4);
        new bsb(3, eg4VarH, id4).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH.d(id4, 7, textViewE.getId(), 7);
        eg4VarH.d(id4, 6, textViewE.getId(), 6);
        eg4VarH.d(id4, 4, 0, 4);
        eg4VarH.a(wf4Var);
        setContentView(wf4Var);
    }

    public static void b(mvh mvhVar, View view, boolean z, kvh kvhVar, int i) {
        kvh kvhVar2 = (i & 4) != 0 ? null : kvhVar;
        Object tag = view.getTag(R.id.oneme_tooltip_animation_fade);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (kvhVar2 != null) {
                    kvhVar2.invoke();
                    return;
                }
                return;
            }
        }
        boolean zD = cqk.d(tag, "fade_in");
        boolean zD2 = cqk.d(tag, "fade_out");
        if (zD && z) {
            return;
        }
        if (!zD2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float alpha = view.getAlpha();
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? yl5.d().getDisplayMetrics().density * 24.0f : yl5.d().getDisplayMetrics().density * 0.0f;
            float f3 = z ? yl5.d().getDisplayMetrics().density * 0.0f : 24.0f * yl5.d().getDisplayMetrics().density;
            if (z) {
                view.setTranslationY(f2);
            }
            view.animate().setDuration(150L).alpha(f).translationY(f3).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new lvh(view, str, alpha, f, z, f3, kvhVar2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new kvh(this, 0), 2);
        }
    }

    public final void c(ynh ynhVar) {
        TextView textView = this.h;
        textView.setText(ynhVar.b(textView.getContext()));
    }

    public final void d(Point point, int i) {
        View contentView = getContentView();
        int measuredWidth = 0;
        if (contentView != null) {
            contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = contentView.getMeasuredWidth();
        }
        showAtLocation(this.a, i, point.x - (measuredWidth / 2), point.y);
        View contentView2 = getContentView();
        if (contentView2 != null) {
            b(this, contentView2, true, null, 6);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        try {
            f4g f4gVar = this.l;
            if (f4gVar != null) {
                this.k.removeCallbacks(f4gVar);
            }
        } catch (Exception e) {
            gm0.V(mvh.class.getName(), e.getMessage(), e);
        }
        this.l = null;
        this.m = null;
    }

    public final void e(Point point, int i, long j) {
        f4g f4gVar = this.l;
        Handler handler = this.k;
        if (f4gVar != null) {
            handler.removeCallbacks(f4gVar);
            this.l = null;
        }
        int measuredWidth = 0;
        if (this.f == 2) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredWidth = getContentView().getMeasuredWidth();
        }
        showAtLocation(this.a, i, point.x - (measuredWidth / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, null, 6);
        }
        f4g f4gVar2 = new f4g(11, this);
        handler.postDelayed(f4gVar2, j);
        this.l = f4gVar2;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        af7 af7Var = this.b;
        kbc kbcVar2 = (kbc) af7Var.invoke();
        af7 af7Var2 = this.d;
        this.g.setImageTintList(af7Var2 != null ? ColorStateList.valueOf(((Number) af7Var2.invoke()).intValue()) : null);
        this.h.setTextColor(ColorStateList.valueOf(kbcVar2.getText().b));
        ((ivh) this.n.getValue()).onThemeChanged(kbcVar);
        ((kbc) af7Var.invoke()).getIcon();
        this.j.setImageTintList(ColorStateList.valueOf(-1));
    }
}
