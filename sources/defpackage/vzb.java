package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ScrollView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vzb extends iq3 implements eph {
    public tzb k;
    public final Rect l;
    public final p1c m;
    public final LinkedHashMap n;
    public final l8b o;
    public final ny8 p;
    public final ny8 q;

    public vzb(Context context) {
        super(context);
        this.l = new Rect();
        p1c p1cVar = new p1c(context, 14);
        p1cVar.setMinHeight(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        p90.Q(p1cVar, p1cVar.getPaint(), q9i.i);
        a8g a8gVar = pq3.j;
        p1cVar.setTextColor(a8gVar.h(p1cVar).getText().b);
        p1cVar.setHintTextColor(a8gVar.h(p1cVar).getText().e);
        p1cVar.setBackgroundColor(0);
        np4.C(p1cVar, false);
        p1cVar.setGravity(16);
        eq3 eq3Var = new eq3(-2, -2);
        p1cVar.setGravity(16);
        p1cVar.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        p1cVar.setLayoutParams(eq3Var);
        p1cVar.setMaxLines(1);
        this.m = p1cVar;
        this.n = new LinkedHashMap();
        this.o = new l8b();
        this.p = rx8.P(3, new bzb(context, 5));
        this.q = rx8.P(3, new iua(11, this));
        setId(R.id.oneme_contacts_chip_group);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(p1cVar);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(0.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        p1cVar.setKeyListener(new uzb(this));
        d();
    }

    private final Drawable getCancelChipDrawable() {
        return (Drawable) this.q.getValue();
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.p.getValue();
    }

    private final void setChipStyle(cq3 cq3Var) {
        boolean zIsChecked = cq3Var.isChecked();
        a8g a8gVar = pq3.j;
        if (!zIsChecked) {
            cq3Var.setChipBackgroundColor(ColorStateList.valueOf(a8gVar.h(cq3Var).b().d));
            cq3Var.setTextColor(a8gVar.h(cq3Var).getText().b);
        } else {
            cq3Var.setChipBackgroundColor(ColorStateList.valueOf(a8gVar.h(cq3Var).h().a));
            a8gVar.h(cq3Var);
            cq3Var.setTextColor(-1);
        }
    }

    public final void a(final long j, final long j2, final CharSequence charSequence, String str, final String str2) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap.containsKey(lValueOf)) {
            return;
        }
        final cq3 cq3Var = new cq3(getMaterialThemeWrapper());
        cq3Var.setId(Long.hashCode(j));
        cq3Var.setText(str);
        p90.Q(cq3Var, cq3Var.getPaint(), q9i.i);
        cq3Var.setClickable(true);
        cq3Var.setCheckable(true);
        cq3Var.setChecked(false);
        cq3Var.setCheckedIcon(null);
        np4.C(cq3Var, false);
        cq3Var.setEnsureMinTouchTargetSize(false);
        b(cq3Var, cq3Var.isChecked(), j, j2, charSequence, str2);
        cq3Var.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: szb
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.b(cq3Var, z, j, j2, charSequence, str2);
            }
        });
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((cq3) ((Map.Entry) it.next()).getValue()).setChecked(false);
        }
        linkedHashMap.put(Long.valueOf(j), cq3Var);
        addView(cq3Var, getChildCount() - 1);
        d();
        tzb tzbVar = this.k;
        if (tzbVar != null) {
            ViewParent parent = ((vzb) ((fik) tzbVar).c).getParent();
            ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
            if (scrollView != null) {
                scrollView.post(new c3(0, scrollView));
            }
        }
    }

    public final void b(cq3 cq3Var, boolean z, long j, long j2, CharSequence charSequence, String str) {
        vzb vzbVar;
        cq3 cq3Var2;
        if (z) {
            cq3Var.setChipIcon(getCancelChipDrawable());
            vzbVar = this;
            cq3Var2 = cq3Var;
            cq3Var2.setOnTouchListener(new nt1(cq3Var2, 4, new k01(vzbVar, j, cq3Var, 7)));
        } else {
            vzbVar = this;
            cq3Var2 = cq3Var;
            l8b l8bVar = vzbVar.o;
            Object objF = l8bVar.f(j2);
            if (objF == null) {
                objF = new tvb(vzbVar.getContext());
                l8bVar.l(j2, objF);
            }
            tvb tvbVar = (tvb) objF;
            tvbVar.c(charSequence, Long.valueOf(j2), str);
            cq3Var2.setChipIcon(tvbVar);
            cq3Var2.setOnTouchListener(null);
        }
        vzbVar.setChipStyle(cq3Var2);
    }

    public final void c(long j) {
        Long lValueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.n;
        cq3 cq3Var = (cq3) linkedHashMap.get(lValueOf);
        if (cq3Var == null) {
            gm0.Y(vzb.class.getName(), "Early return in removeChip cuz of chipsHolder[id] is null");
            return;
        }
        linkedHashMap.remove(Long.valueOf(j));
        removeView(cq3Var);
        d();
    }

    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new xc0(13, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.l;
        editText.getHitRect(rect);
        rect.left = rect.right;
        rect.right = getRight();
    }

    public final tzb getCallback() {
        return this.k;
    }

    public final EditText getEditText() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.o.a();
        this.n.clear();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable drawable;
        int i = kbcVar.getText().b;
        p1c p1cVar = this.m;
        p1cVar.setTextColor(i);
        p1cVar.setHintTextColor(kbcVar.getText().e);
        f55.f(p1cVar, kbcVar);
        Iterator it = this.n.entrySet().iterator();
        while (it.hasNext()) {
            setChipStyle((cq3) ((Map.Entry) it.next()).getValue());
        }
        ny8 ny8Var = this.q;
        if (!ny8Var.d()) {
            ny8Var = null;
        }
        if (ny8Var == null || (drawable = (Drawable) ny8Var.getValue()) == null) {
            return;
        }
        drawable.setTint(-1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        p1c p1cVar = this.m;
        nl9.d(p1cVar, true);
        p1cVar.performClick();
        return true;
    }

    public final void setCallback(tzb tzbVar) {
        this.k = tzbVar;
    }
}
