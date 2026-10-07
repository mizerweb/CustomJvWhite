package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ap4 extends ViewGroup implements v35, khf, b8e, mia, ekc, fhf, kfa {
    public final p6e a;
    public final gia b;
    public final dhf c;
    public final fkc d;
    public final Paint e;
    public final Rect f;
    public final float g;
    public final int h;
    public final ny8 i;
    public final ImageView j;
    public final TextView k;
    public final u35 l;
    public final lhf m;

    public ap4(Context context) {
        p6e p6eVar = new p6e();
        gia giaVar = new gia();
        dhf dhfVar = new dhf();
        fkc fkcVar = new fkc();
        super(context);
        this.a = p6eVar;
        this.b = giaVar;
        this.c = dhfVar;
        this.d = fkcVar;
        this.e = new Paint(1);
        this.f = new Rect();
        this.g = yl5.d().getDisplayMetrics().density * 16.0f;
        this.h = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        this.i = rx8.P(3, new pe3(17, this));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.icon_eye_crossed_fill);
        this.j = imageView;
        TextView textView = new TextView(context);
        q9i.a(q9i.t, textView);
        textView.setText(R.string.messages_list_message_content_level_chat_stub_text);
        this.k = textView;
        u35 u35Var = new u35(context);
        u35Var.setBackgroundEnabled$message_list(false);
        this.l = u35Var;
        this.m = new lhf(this);
        p6eVar.a = this;
        giaVar.a = this;
        dhfVar.a = this;
        addView(imageView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(u35Var, new ViewGroup.LayoutParams(-2, -2));
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        xr8 xr8Var = fea.u;
        kbc kbcVarH = pq3.j.h(this);
        xr8Var.getClass();
        setBackground(xr8.j(kbcVarH));
        setTransitionGroup(true);
    }

    private final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.i.getValue();
    }

    @Override // defpackage.mia
    public final void A() {
        this.b.A();
    }

    @Override // defpackage.b8e
    public final void G(xac xacVar, boolean z) {
        this.a.G(xacVar, z);
    }

    public final void a(xac xacVar) {
        this.j.setImageTintList(ColorStateList.valueOf(pq3.j.h(this).getIcon().d));
        wac wacVar = xacVar.b;
        this.k.setTextColor(wacVar.e);
        this.e.setColor(xacVar.a.e);
        getBorderDrawable().getPaint().setColor(xacVar.d.e);
        int i = wacVar.g;
        u35 u35Var = this.l;
        u35Var.setTextColor$message_list(i);
        u35Var.setDateViewStatusColor(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        getBorderDrawable().setBounds(this.f);
        getBorderDrawable().draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    @Override // defpackage.v35
    public final void e(CharSequence charSequence, boolean z) {
        this.l.d(charSequence, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.Z();
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    @Override // defpackage.b8e
    public final void m(boolean z) {
        this.a.m(z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f;
        if (rect.isEmpty()) {
            return;
        }
        RectF rectF = new RectF(rect);
        float f = this.g;
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK;
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int iK3 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iK4 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        lhf lhfVar = this.m;
        if (n7j.o(lhfVar.b)) {
            lhfVar.c(iK2, iK5);
            iK = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a() + iK5);
        } else {
            iK = iK2;
        }
        dhf dhfVar = this.c;
        if (n7j.o((ny8) dhfVar.b) && n7j.o(lhfVar.b)) {
            dhfVar.T((getMeasuredWidth() - iK2) - dhfVar.L(), ((lhfVar.a() / 2) - (dhfVar.K() / 2)) + iK5);
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.T(iK2, iK);
            iK += giaVar.K();
        }
        int iE = c0a.e(6.0f, yl5.d().getDisplayMetrics().density, iK, iK4);
        int i5 = iK3 + iK2;
        ImageView imageView = this.j;
        int measuredHeight = imageView.getMeasuredHeight();
        TextView textView = this.k;
        int iMax = (Math.max(measuredHeight, textView.getMeasuredHeight()) / 2) + iE;
        qyj.M(imageView, i5, iMax - (imageView.getMeasuredHeight() / 2), 0, 12);
        qyj.M(textView, zo5.b(12.0f, yl5.d().getDisplayMetrics().density, imageView.getMeasuredWidth() + i5), iMax - (textView.getMeasuredHeight() / 2), 0, 12);
        p6e p6eVar = this.a;
        boolean zO = n7j.o((ny8) p6eVar.b);
        u35 u35Var = this.l;
        if (zO) {
            p6eVar.T(gm0.K(10.0f * yl5.d().getDisplayMetrics().density), zo5.D(8.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - u35Var.getMeasuredHeight()) - p6eVar.K());
        }
        qyj.M(u35Var, (getMeasuredWidth() - u35Var.getMeasuredWidth()) - iK2, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, getMeasuredHeight() - u35Var.getMeasuredHeight()), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iF;
        int iK;
        int iK2;
        if (getDependOnOutsideView()) {
            iF = View.MeasureSpec.getSize(i);
        } else {
            iF = r5a.f(10.0f, yl5.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        }
        int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        int iK4 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        int iK5 = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        int i3 = iK3 * 2;
        int i4 = iF - i3;
        dhf dhfVar = this.c;
        boolean zO = n7j.o((ny8) dhfVar.b);
        lhf lhfVar = this.m;
        if (zO && n7j.o(lhfVar.b)) {
            dhfVar.U(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iF = Math.max(iF, dhfVar.L());
        }
        if (n7j.o(lhfVar.b)) {
            lhfVar.d(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iF = Math.max(iF, lhfVar.b() + i3 + dhfVar.Z());
            iK = zo5.b(4.0f, yl5.d().getDisplayMetrics().density, lhfVar.a() + gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        } else {
            iK = iK3;
        }
        gia giaVar = this.b;
        if (n7j.o((ny8) giaVar.b)) {
            giaVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iF = Math.max(iF, giaVar.L() + 20);
            iK += giaVar.K();
        }
        int iB = zo5.b(6.0f, yl5.d().getDisplayMetrics().density, iK);
        int i5 = i4 - (iK4 * 2);
        int i6 = this.h;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        ImageView imageView = this.j;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5 - (imageView.getMeasuredWidth() - gm0.K(12.0f * yl5.d().getDisplayMetrics().density)), Integer.MIN_VALUE);
        TextView textView = this.k;
        textView.measure(iMakeMeasureSpec3, i2);
        int iMax = Math.max(imageView.getMeasuredHeight(), textView.getMeasuredHeight()) + (iK5 * 2) + iB;
        this.f.set(iK3, iB, iF - iK3, iMax);
        p6e p6eVar = this.a;
        if (n7j.o((ny8) p6eVar.b)) {
            p6eVar.U(View.MeasureSpec.makeMeasureSpec(iF, Integer.MIN_VALUE), i2);
            iMax = c0a.e(10.0f, yl5.d().getDisplayMetrics().density, p6eVar.K(), iMax);
            iF = Math.max(iF, (gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) * 2) + p6eVar.L());
        }
        u35 u35Var = this.l;
        u35Var.measure(i, i2);
        if (n7j.o((ny8) p6eVar.b)) {
            iK2 = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, u35Var.getMeasuredHeight());
        } else {
            iK2 = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(iF, iMax + iK2);
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        this.b.p(xacVar);
    }

    @Override // defpackage.fhf
    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    @Override // defpackage.fhf
    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    @Override // defpackage.b8e
    public void setChipObserver(t5e t5eVar) {
        this.a.setChipObserver(t5eVar);
    }

    @Override // defpackage.v35
    public void setCountView(CharSequence charSequence) {
        this.l.setCountView$message_list(charSequence);
    }

    @Override // defpackage.v35
    public void setDateViewStatus(f9j f9jVar) {
        this.l.setStatus$message_list(f9jVar);
    }

    @Override // defpackage.ekc
    public void setDependOnOutsideView(boolean z) {
        this.d.a = z;
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
        this.l.setChannelMode$message_list(z);
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

    @Override // defpackage.mia
    public void setReplyClickListener(qf7 qf7Var) {
        this.b.c = qf7Var;
    }

    @Override // defpackage.khf
    public void setSenderName(Layout layout) {
        this.m.e(layout);
    }

    @Override // defpackage.khf
    public void setSenderNameColor(int i) {
        this.m.f(i);
    }

    @Override // defpackage.b8e
    public void setStackFromEnd(boolean z) {
        this.a.g = z;
    }

    @Override // defpackage.b8e
    public final void x(kja kjaVar, boolean z) {
        this.a.x(kjaVar, z);
    }

    @Override // defpackage.kfa
    public final boolean y(MotionEvent motionEvent) {
        return false;
    }
}
