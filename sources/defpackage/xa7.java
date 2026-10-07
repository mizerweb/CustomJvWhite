package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class xa7 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public xa7(Context context, AttributeSet attributeSet, c cVar) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3e.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        a aVarD = cVar.D(id);
        if (classAttribute != null && aVarD == null) {
            if (id == -1) {
                ore.k(c0a.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            bb7 bb7VarH = cVar.H();
            context.getClassLoader();
            a aVarA = bb7VarH.a(classAttribute);
            aVarA.x = id;
            aVarA.y = id;
            aVarA.z = string;
            aVarA.t = cVar;
            aVarA.u = cVar.v;
            aVarA.B();
            tl0 tl0Var = new tl0(cVar);
            tl0Var.o = true;
            aVarA.H = this;
            aVarA.p = true;
            tl0Var.e(getId(), aVarA, string);
            if (tl0Var.g) {
                ore.k("This transaction is already being added to the back stack");
                throw null;
            }
            tl0Var.q.B(tl0Var, true);
        }
        Iterator it = cVar.c.d().iterator();
        while (it.hasNext()) {
            int i = ((e) it.next()).c.y;
            getId();
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof a ? (a) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            c.p(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ixj ixjVarG;
        ixj ixjVarG2 = ixj.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            ixjVarG = ixj.g(lzl.e(onApplyWindowInsetsListener, this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = i7j.a;
            WindowInsets windowInsetsF = ixjVarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = w6j.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    ixjVarG2 = ixj.g(windowInsetsB, this);
                }
            }
            ixjVarG = ixjVarG2;
        }
        if (!ixjVarG.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                i7j.b(getChildAt(i), ixjVarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.d) {
            ArrayList arrayList = this.a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends a> F getFragment() {
        a aVar;
        b bVar;
        c cVarP;
        View view = this;
        while (true) {
            if (view == null) {
                aVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            aVar = tag instanceof a ? (a) tag : null;
            if (aVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (aVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    bVar = null;
                    break;
                }
                if (context instanceof b) {
                    bVar = (b) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (bVar == null) {
                c.u(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            cVarP = bVar.p();
        } else {
            if (!aVar.p()) {
                eu6.e("The Fragment ", aVar, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                return null;
            }
            cVarP = aVar.i();
        }
        return (F) cVarP.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            a(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }
}
