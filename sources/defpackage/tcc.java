package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class tcc extends LinearLayout implements zff, eph {
    public final AppCompatTextView a;
    public final v0c b;
    public final cyb c;
    public final ArrayList d;
    public AnimatorSet e;
    public int f;
    public final ny8 g;
    public final ny8 h;

    public tcc(Context context) {
        super(context, null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.oneme_toolbar_title);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        int i = 14;
        n1g.N(new zu(3, (lq4) null, i), appCompatTextView);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        noh nohVar = q9i.b;
        q9i.a(nohVar, appCompatTextView);
        this.a = appCompatTextView;
        v0c v0cVar = new v0c(context);
        v0cVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        v0cVar.setHasBackground(false);
        v0cVar.setTypography(nohVar);
        v0cVar.setTextColor(pq3.j.e(context).m().getText().b);
        v0cVar.setVisibility(8);
        this.b = v0cVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(v0cVar);
        cyb cybVar = new cyb(context);
        cybVar.setSize(ayb.i);
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setId(R.id.oneme_toolbar_close_button);
        cybVar.setIconResource(R.drawable.icon_cross);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        cybVar.setLayoutParams(marginLayoutParams);
        this.c = cybVar;
        this.d = new ArrayList();
        this.f = 1;
        this.g = rx8.P(3, new cka(15));
        this.h = rx8.P(3, new bzb(context, i));
        setElevation(yl5.d().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(cybVar);
        addView(linearLayout);
    }

    public static void d(tcc tccVar, cf7 cf7Var, mcc mccVar) {
        tccVar.getPopupWindow().dismiss();
        cf7Var.invoke(Integer.valueOf(mccVar.a));
    }

    private final Interpolator getOpacityMotionInterpolator() {
        return (Interpolator) this.g.getValue();
    }

    private static /* synthetic */ void getOpacityMotionInterpolator$annotations() {
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.h.getValue();
    }

    @Override // defpackage.zff
    public final void a() {
        this.f = 1;
        e(false, null);
    }

    @Override // defpackage.zff
    public final boolean b() {
        return this.f == 2;
    }

    @Override // defpackage.zff
    public final void c(String str, List list, af7 af7Var, cf7 cf7Var) {
        PopupWindow popupWindow;
        cyb cybVar;
        setSelectionTitle(str);
        ArrayList arrayList = this.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List list2 = list;
        List listN1 = ww3.N1(list2, 5);
        List<mcc> listL1 = ww3.l1(list2, 5);
        List list3 = listL1;
        int i = 2;
        if (list3.isEmpty()) {
            popupWindow = null;
        } else {
            gcd gcdVar = new gcd(getContext(), false);
            gcdVar.setId(R.id.oneme_toolbar_popup);
            for (mcc mccVar : listL1) {
                fcd fcdVar = new fcd(gcdVar.getContext(), false);
                fcdVar.c(fcdVar, new tnh(mccVar.b), null, true, true);
                fcdVar.b(Integer.valueOf(mccVar.c), Integer.valueOf(R.attr.icon_primary));
                qe7.H(fcdVar, 300L, new aa1(this, cf7Var, mccVar, i));
                gcdVar.addView(fcdVar, -1, -2);
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(gcdVar);
        }
        int i2 = 0;
        for (Object obj : listN1) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                xw3.V0();
                throw null;
            }
            mcc mccVar2 = (mcc) obj;
            int i4 = 4;
            if (i2 != 4 || list3.isEmpty()) {
                Context context = getContext();
                zxb zxbVar = mccVar2.e;
                cyb cybVar2 = new cyb(context);
                cybVar2.setSize(ayb.i);
                cybVar2.setAppearance(zxbVar);
                cybVar2.setId(mccVar2.a);
                cybVar2.setIconColor(mccVar2.f);
                cybVar2.setIconResource(mccVar2.c);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
                cybVar2.setLayoutParams(marginLayoutParams);
                if (mccVar2.d) {
                    cybVar2.setEnabled(false);
                } else {
                    qe7.H(cybVar2, 300L, new aeb(cf7Var, i4, mccVar2));
                }
                cybVar = cybVar2;
            } else {
                cybVar = new cyb(getContext());
                cybVar.setSize(ayb.i);
                cybVar.setAppearance(zxb.GHOST);
                cybVar.setId(R.id.oneme_toolbar_overflow_menu_button);
                cybVar.setIconResource(R.drawable.icon_dots_vertical);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMarginStart(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                cybVar.setLayoutParams(marginLayoutParams2);
                qe7.H(cybVar, 300L, new o37(28, popupWindow));
            }
            arrayList.add(cybVar);
            qyj.y(cybVar, gm0.K(40.0f * yl5.d().getDisplayMetrics().density), gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
            addView(cybVar);
            i2 = i3;
        }
        if (this.f == 2) {
            return;
        }
        this.f = 2;
        setCloseListener(new vx9(this, 21, af7Var));
        e(true, null);
    }

    public final void e(boolean z, af7 af7Var) {
        Property property;
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        List listW0 = yhf.w0(yhf.m0(new sw(4, viewGroup), new lh9(21, this)));
        float f = z ? 0.0f : 1.0f;
        float alpha = z ? 0.0f : getAlpha();
        float f2 = z ? 1.0f : 0.0f;
        int i = 0;
        if (z) {
            Iterator it = listW0.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(0);
            }
            setVisibility(0);
            setAlpha(alpha);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        List list = listW0;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            property = View.ALPHA;
            if (!zHasNext) {
                break;
            }
            View view = (View) it2.next();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, view.getAlpha(), f);
            objectAnimatorOfFloat.setDuration(125L);
            objectAnimatorOfFloat.setInterpolator(getOpacityMotionInterpolator());
            arrayList.add(objectAnimatorOfFloat);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<tcc, Float>) property, alpha, f2);
        objectAnimatorOfFloat2.setDuration(125L);
        objectAnimatorOfFloat2.setInterpolator(getOpacityMotionInterpolator());
        animatorSet4.playTogether(objectAnimatorOfFloat2);
        if (arrayList.isEmpty()) {
            animatorSet2.play(animatorSet4);
        } else if (z) {
            animatorSet2.playSequentially(animatorSet3, animatorSet4);
        } else {
            animatorSet2.playSequentially(animatorSet4, animatorSet3);
        }
        if (!z) {
            animatorSet4.addListener(new scc(this, af7Var, listW0, i));
            animatorSet2.addListener(new li(13, this));
        }
        animatorSet2.start();
        this.e = animatorSet2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            lsk.a(animatorSet);
        }
        this.e = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setTextColor(kbcVar.getText().b);
        this.b.setTextColor(kbcVar.getText().b);
        this.c.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        for (View view : this.d) {
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() != 1) {
                    break;
                }
                view.performClick();
                break;
            }
        }
        return true;
    }

    public final void setCloseListener(af7 af7Var) {
        qe7.H(this.c, 300L, new d8(12, af7Var));
    }

    public final void setOffEditMode(af7 af7Var) {
        this.f = 1;
        e(false, af7Var);
    }

    public final void setSelectionTitle(String str) {
        Integer numB0 = y5h.B0(str);
        v0c v0cVar = this.b;
        AppCompatTextView appCompatTextView = this.a;
        if (numB0 != null) {
            appCompatTextView.setVisibility(8);
            v0cVar.setVisibility(0);
            pu4.c(v0cVar, numB0, true, 4);
        } else {
            v0cVar.setVisibility(8);
            appCompatTextView.setVisibility(0);
            appCompatTextView.setText(str);
        }
    }
}
