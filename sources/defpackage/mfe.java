package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mfe extends l4 {
    public final nfe d;
    public final WeakHashMap e = new WeakHashMap();

    public mfe(nfe nfeVar) {
        this.d = nfeVar;
    }

    @Override // defpackage.l4
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        l4 l4Var = (l4) this.e.get(view);
        return l4Var != null ? l4Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.l4
    public final ex8 b(View view) {
        l4 l4Var = (l4) this.e.get(view);
        return l4Var != null ? l4Var.b(view) : super.b(view);
    }

    @Override // defpackage.l4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            l4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.l4
    public final void d(View view, x4 x4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = x4Var.a;
        nfe nfeVar = this.d;
        RecyclerView recyclerView = nfeVar.d;
        RecyclerView recyclerView2 = nfeVar.d;
        boolean zW = recyclerView.W();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zW || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().d0(view, x4Var);
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            l4Var.d(view, x4Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.l4
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            l4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.l4
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        l4 l4Var = (l4) this.e.get(viewGroup);
        return l4Var != null ? l4Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.l4
    public final boolean g(View view, int i, Bundle bundle) {
        nfe nfeVar = this.d;
        RecyclerView recyclerView = nfeVar.d;
        RecyclerView recyclerView2 = nfeVar.d;
        if (recyclerView.W() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            if (l4Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        cfe cfeVar = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    @Override // defpackage.l4
    public final void h(View view, int i) {
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            l4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.l4
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        l4 l4Var = (l4) this.e.get(view);
        if (l4Var != null) {
            l4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
