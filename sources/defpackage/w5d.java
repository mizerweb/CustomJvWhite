package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w5d extends ViewGroup implements Checkable {
    public static final /* synthetic */ zv8[] q;
    public final TextView a;
    public final ny8 b;
    public final ny8 c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public qjg k;
    public final CheckBox l;
    public final ny8 m;
    public final t5d n;
    public final RippleDrawable o;
    public final int p;

    static {
        z8b z8bVar = new z8b(w5d.class, "model", "getModel()Lone/me/messages/list/loader/model/PollAttachModel$PollAnswerInfo;");
        zfe.a.getClass();
        q = new zv8[]{z8bVar};
    }

    public w5d(final Context context) {
        super(context);
        TextView textView = new TextView(context);
        q9i.a(q9i.z, textView);
        this.a = textView;
        final int i = 0;
        this.b = rx8.P(3, new af7() { // from class: v5d
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                w5d w5dVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        a6d a6dVar = new a6d(context2);
                        a6dVar.setVisibility(8);
                        w5dVar.addView(a6dVar, new ViewGroup.LayoutParams(-2, -2));
                        return a6dVar;
                    case 1:
                        f7d f7dVar = new f7d(context2);
                        f7dVar.setVisibility(8);
                        w5dVar.addView(f7dVar, new ViewGroup.LayoutParams(-2, -2));
                        return f7dVar;
                    default:
                        lr3 lr3Var = new lr3(context2);
                        lr3Var.setIndeterminate(true);
                        lr3Var.setIndicatorSize(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
                        lr3Var.setTrackThickness(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setTrackCornerRadius(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setIndicatorInset(0);
                        yab.d(w5dVar, lr3Var, new ViewGroup.LayoutParams(-2, -2));
                        return lr3Var;
                }
            }
        });
        final int i2 = 1;
        this.c = rx8.P(3, new af7() { // from class: v5d
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                w5d w5dVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        a6d a6dVar = new a6d(context2);
                        a6dVar.setVisibility(8);
                        w5dVar.addView(a6dVar, new ViewGroup.LayoutParams(-2, -2));
                        return a6dVar;
                    case 1:
                        f7d f7dVar = new f7d(context2);
                        f7dVar.setVisibility(8);
                        w5dVar.addView(f7dVar, new ViewGroup.LayoutParams(-2, -2));
                        return f7dVar;
                    default:
                        lr3 lr3Var = new lr3(context2);
                        lr3Var.setIndeterminate(true);
                        lr3Var.setIndicatorSize(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
                        lr3Var.setTrackThickness(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setTrackCornerRadius(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setIndicatorInset(0);
                        yab.d(w5dVar, lr3Var, new ViewGroup.LayoutParams(-2, -2));
                        return lr3Var;
                }
            }
        });
        this.d = gm0.K(14.0f * yl5.d().getDisplayMetrics().density);
        this.e = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        this.f = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
        this.g = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.h = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.j = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        CheckBox checkBox = new CheckBox(context);
        checkBox.setButtonDrawable((Drawable) null);
        checkBox.setBackground(this.k);
        checkBox.setClickable(false);
        this.l = checkBox;
        final int i3 = 2;
        this.m = rx8.P(3, new af7() { // from class: v5d
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                w5d w5dVar = this;
                Context context2 = context;
                switch (i4) {
                    case 0:
                        a6d a6dVar = new a6d(context2);
                        a6dVar.setVisibility(8);
                        w5dVar.addView(a6dVar, new ViewGroup.LayoutParams(-2, -2));
                        return a6dVar;
                    case 1:
                        f7d f7dVar = new f7d(context2);
                        f7dVar.setVisibility(8);
                        w5dVar.addView(f7dVar, new ViewGroup.LayoutParams(-2, -2));
                        return f7dVar;
                    default:
                        lr3 lr3Var = new lr3(context2);
                        lr3Var.setIndeterminate(true);
                        lr3Var.setIndicatorSize(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f));
                        lr3Var.setTrackThickness(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setTrackCornerRadius(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
                        lr3Var.setIndicatorInset(0);
                        yab.d(w5dVar, lr3Var, new ViewGroup.LayoutParams(-2, -2));
                        return lr3Var;
                }
            }
        });
        this.n = new t5d(i2, this);
        int i4 = ((bs0) pq3.j.h(this).u().c.g).c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(i4);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i4), null, shapeDrawable);
        this.o = rippleDrawable;
        this.p = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        addView(checkBox, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setBackground(rippleDrawable);
    }

    public static void a(w5d w5dVar, cf7 cf7Var) {
        b7d model = w5dVar.getModel();
        w6d w6dVar = model != null ? model.d : null;
        v6d v6dVar = w6dVar instanceof v6d ? (v6d) w6dVar : null;
        if (v6dVar != null) {
            cf7Var.invoke(Integer.valueOf(v6dVar.a));
        }
    }

    public static final void b(w5d w5dVar, b7d b7dVar) {
        if (b7dVar == null) {
            return;
        }
        w5dVar.a.setText(b7dVar.b);
        d7d d7dVar = b7dVar.c;
        boolean z = b7dVar.e;
        CheckBox checkBox = w5dVar.l;
        if (z) {
            w5dVar.getProgressView().setVisibility(0);
            checkBox.setVisibility(8);
            w5dVar.getProgressView().setVisibility(0);
        } else {
            ny8 ny8Var = w5dVar.m;
            if (n7j.o(ny8Var)) {
                ((lr3) ny8Var.getValue()).setVisibility(8);
            }
            if (d7dVar.equals(er3.k)) {
                checkBox.setVisibility(8);
            } else if (!(d7dVar instanceof c7d)) {
                ore.o();
                return;
            } else {
                checkBox.setVisibility(0);
                checkBox.setChecked(((c7d) d7dVar).a);
            }
        }
        w6d w6dVar = b7dVar.d;
        if (w6dVar.equals(so2.k)) {
            ny8 ny8Var2 = w5dVar.b;
            if (n7j.o(ny8Var2)) {
                ((a6d) ny8Var2.getValue()).setVisibility(8);
            }
            ny8 ny8Var3 = w5dVar.c;
            if (n7j.o(ny8Var3)) {
                ((f7d) ny8Var3.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (!(w6dVar instanceof v6d)) {
            ore.o();
            return;
        }
        w5dVar.getBarView().setVisibility(0);
        w5dVar.getVoteCountView().setVisibility(0);
        a6d barView = w5dVar.getBarView();
        v6d v6dVar = (v6d) w6dVar;
        float f = v6dVar.a;
        ValueAnimator valueAnimator = barView.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(barView.e, oc9.u(f, 0.0f, 100.0f));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new ak(24, barView));
        valueAnimatorOfFloat.start();
        barView.d = valueAnimatorOfFloat;
        kjl kjlVar = v6dVar.b;
        if (kjlVar instanceof s6d) {
            f7d voteCountView = w5dVar.getVoteCountView();
            int i = ((s6d) kjlVar).a;
            h7d h7dVar = voteCountView.a;
            h7dVar.setCount(i);
            h7dVar.setWinner(false);
            voteCountView.setAvatars(null);
            return;
        }
        if (kjlVar instanceof t6d) {
            f7d voteCountView2 = w5dVar.getVoteCountView();
            t6d t6dVar = (t6d) kjlVar;
            int i2 = t6dVar.b;
            h7d h7dVar2 = voteCountView2.a;
            h7dVar2.setCount(i2);
            h7dVar2.setWinner(false);
            voteCountView2.setAvatars(t6dVar.a);
            return;
        }
        if (!(kjlVar instanceof u6d)) {
            ore.o();
            return;
        }
        f7d voteCountView3 = w5dVar.getVoteCountView();
        u6d u6dVar = (u6d) kjlVar;
        int i3 = u6dVar.a;
        h7d h7dVar3 = voteCountView3.a;
        h7dVar3.setCount(i3);
        h7dVar3.setWinner(true);
        voteCountView3.setAvatars(u6dVar.b);
    }

    private final a6d getBarView() {
        return (a6d) this.b.getValue();
    }

    private final b7d getModel() {
        zv8 zv8Var = q[0];
        return (b7d) this.n.b;
    }

    private final lr3 getProgressView() {
        return (lr3) this.m.getValue();
    }

    private final f7d getVoteCountView() {
        return (f7d) this.c.getValue();
    }

    private final void setModel(b7d b7dVar) {
        this.n.B(this, q[0], b7dVar);
    }

    public final void c(b7d b7dVar) {
        setModel(b7dVar);
    }

    public final void d(xac xacVar) {
        int i = xacVar.d.e;
        uac uacVar = xacVar.c;
        int i2 = uacVar.c;
        this.a.setTextColor(xacVar.b.d);
        ny8 ny8Var = this.b;
        if (n7j.o(ny8Var)) {
            ((a6d) ny8Var.getValue()).b(xacVar);
        }
        ny8 ny8Var2 = this.c;
        if (n7j.o(ny8Var2)) {
            ((f7d) ny8Var2.getValue()).a.setBubbleColors(xacVar);
        }
        qjg qjgVar = this.k;
        int[] iArr = srh.b;
        int[] iArr2 = srh.a;
        if (qjgVar == null) {
            Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_check_round_fill).mutate();
            sb8.m0(i2, drawableMutate);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            int i3 = this.g;
            gradientDrawable.setSize(i3, i3);
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), i);
            qjg qjgVar2 = new qjg(null, null);
            qjgVar2.a(iArr2, drawableMutate);
            qjgVar2.a(iArr, gradientDrawable);
            this.k = qjgVar2;
            this.l.setBackground(qjgVar2);
        } else {
            Drawable drawableB = jrl.b(qjgVar, iArr2);
            Drawable drawableB2 = jrl.b(qjgVar, iArr);
            GradientDrawable gradientDrawable2 = drawableB2 instanceof GradientDrawable ? (GradientDrawable) drawableB2 : null;
            sb8.m0(i2, drawableB);
            if (gradientDrawable2 != null) {
                gradientDrawable2.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), i);
            }
        }
        ny8 ny8Var3 = this.m;
        if (n7j.o(ny8Var3)) {
            ((lr3) ny8Var3.getValue()).setIndicatorColor(uacVar.g);
        }
        this.o.setColor(ColorStateList.valueOf(((bs0) pq3.j.h(this).u().c.g).c));
    }

    public final boolean e() {
        b7d model = getModel();
        return model != null && model.e;
    }

    public final int getCountViewHeight() {
        if (n7j.o(this.c)) {
            return getVoteCountView().getHeight();
        }
        return 0;
    }

    public final int getCounterWidth() {
        if (n7j.o(this.c)) {
            return getVoteCountView().getCounterWidth();
        }
        return 0;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.l.isChecked();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zE = e();
        CheckBox checkBox = this.l;
        int i5 = (zE || !checkBox.isChecked()) ? this.i : 0;
        boolean zE2 = e();
        int i6 = this.p;
        if (zE2) {
            qyj.M(getProgressView(), i5 + i6, (getMeasuredHeight() / 2) - (getProgressView().getMeasuredHeight() / 2), 0, 12);
        } else {
            qyj.M(checkBox, i5 + i6, (getMeasuredHeight() / 2) - (checkBox.getMeasuredHeight() / 2), 0, 12);
        }
        int i7 = this.g + i6 + this.j;
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.a;
        qyj.M(textView, i7, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        if (n7j.o(this.b)) {
            qyj.M(getBarView(), i7, getMeasuredHeight() - getBarView().getMeasuredHeight(), 0, 12);
        }
        if (n7j.o(this.c)) {
            qyj.M(getVoteCountView(), (getMeasuredWidth() - getVoteCountView().getMeasuredWidth()) - i6, (getMeasuredHeight() / 2) - (getVoteCountView().getMeasuredHeight() / 2), 0, 12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iB;
        int size = View.MeasureSpec.getSize(i) - (this.p * 2);
        int i3 = this.d * 2;
        int i4 = this.g;
        int i5 = (size - i4) - this.j;
        if (n7j.o(this.c)) {
            getVoteCountView().measure(i, i2);
            iB = qv1.b(8.0f, yl5.d().getDisplayMetrics().density, getVoteCountView().getMeasuredWidth(), i5);
        } else {
            iB = i5;
        }
        boolean zE = e();
        CheckBox checkBox = this.l;
        if (zE || !checkBox.isChecked()) {
            i4 = this.h;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        if (e()) {
            getProgressView().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        } else {
            checkBox.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
        TextView textView = this.a;
        textView.measure(iMakeMeasureSpec2, i2);
        int measuredHeight = textView.getMeasuredHeight() + i3;
        if (n7j.o(this.b)) {
            getBarView().measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
        }
        setMeasuredDimension(i, Math.max(measuredHeight, this.f));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.l.setChecked(z);
    }

    public final void setRateClickListener(cf7 cf7Var) {
        qe7.H(getVoteCountView(), 300L, new aeb(this, 9, cf7Var));
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.l.toggle();
    }
}
