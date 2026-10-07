package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m8 implements pca {
    public final Context a;
    public Context b;
    public yba c;
    public final LayoutInflater d;
    public oca e;
    public rca h;
    public l8 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public j8 s;
    public j8 t;
    public ng7 u;
    public k8 v;
    public final int f = R.layout.abc_action_menu_layout;
    public final int g = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray r = new SparseBooleanArray();
    public final xva w = new xva(1, this);

    public m8(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(cca ccaVar, View view, ViewGroup viewGroup) {
        View actionView = ccaVar.getActionView();
        if (actionView == null || ccaVar.d()) {
            qca qcaVar = view instanceof qca ? (qca) view : (qca) this.d.inflate(this.g, viewGroup, false);
            qcaVar.a(ccaVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qcaVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
            if (this.v == null) {
                this.v = new k8(this);
            }
            actionMenuItemView.setPopupCallback(this.v);
            actionView = (View) qcaVar;
        }
        actionView.setVisibility(ccaVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof o8)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pca
    public final boolean b(g7h g7hVar) {
        boolean z;
        if (g7hVar.hasVisibleItems()) {
            g7h g7hVar2 = g7hVar;
            while (true) {
                yba ybaVar = g7hVar2.z;
                if (ybaVar == this.c) {
                    break;
                }
                g7hVar2 = (g7h) ybaVar;
            }
            cca ccaVar = g7hVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof qca) && ((qca) childAt).getItemData() == ccaVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                g7hVar.A.getClass();
                int size = g7hVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = g7hVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                j8 j8Var = new j8(this, this.b, g7hVar, view);
                this.t = j8Var;
                j8Var.g = z;
                hca hcaVar = j8Var.i;
                if (hcaVar != null) {
                    hcaVar.o(z);
                }
                j8 j8Var2 = this.t;
                if (!j8Var2.b()) {
                    if (j8Var2.e == null) {
                        ore.k("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    j8Var2.d(0, 0, false, false);
                }
                oca ocaVar = this.e;
                if (ocaVar != null) {
                    ocaVar.m(g7hVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pca
    public final boolean c(cca ccaVar) {
        return false;
    }

    @Override // defpackage.pca
    public final void d(oca ocaVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pca
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            yba ybaVar = this.c;
            if (ybaVar != null) {
                ybaVar.j();
                ArrayList arrayListM = this.c.m();
                int size = arrayListM.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    cca ccaVar = (cca) arrayListM.get(i2);
                    if ((ccaVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        cca itemData = childAt instanceof qca ? ((qca) childAt).getItemData() : null;
                        View viewA = a(ccaVar, childAt, viewGroup);
                        if (ccaVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.h).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        yba ybaVar2 = this.c;
        if (ybaVar2 != null) {
            ybaVar2.j();
            ArrayList arrayList2 = ybaVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dca dcaVar = ((cca) arrayList2.get(i3)).A;
            }
        }
        yba ybaVar3 = this.c;
        if (ybaVar3 != null) {
            ybaVar3.j();
            arrayList = ybaVar3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((cca) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        l8 l8Var = this.i;
        if (z) {
            if (l8Var == null) {
                this.i = new l8(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                l8 l8Var2 = this.i;
                actionMenuView.getClass();
                o8 o8VarI = ActionMenuView.i();
                o8VarI.a = true;
                actionMenuView.addView(l8Var2, o8VarI);
            }
        } else if (l8Var != null) {
            Object parent = l8Var.getParent();
            Object obj = this.h;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    @Override // defpackage.pca
    public final void f(yba ybaVar, boolean z) {
        j();
        j8 j8Var = this.t;
        if (j8Var != null && j8Var.b()) {
            j8Var.i.dismiss();
        }
        oca ocaVar = this.e;
        if (ocaVar != null) {
            ocaVar.f(ybaVar, z);
        }
    }

    @Override // defpackage.pca
    public final boolean g() {
        int size;
        ArrayList arrayListM;
        int i;
        boolean z;
        m8 m8Var = this;
        yba ybaVar = m8Var.c;
        if (ybaVar != null) {
            arrayListM = ybaVar.m();
            size = arrayListM.size();
        } else {
            size = 0;
            arrayListM = null;
        }
        int i2 = m8Var.p;
        int i3 = m8Var.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) m8Var.h;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            cca ccaVar = (cca) arrayListM.get(i4);
            int i7 = ccaVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (m8Var.q && ccaVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (m8Var.l && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = m8Var.r;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            cca ccaVar2 = (cca) arrayListM.get(i9);
            int i11 = ccaVar2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = ccaVar2.b;
            if (z3) {
                View viewA = m8Var.a(ccaVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                ccaVar2.e(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                    if (z5) {
                        View viewA2 = m8Var.a(ccaVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            cca ccaVar3 = (cca) arrayListM.get(i13);
                            if (ccaVar3.b == i12) {
                                if ((ccaVar3.x & 32) == 32) {
                                    i8++;
                                }
                                ccaVar3.e(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    ccaVar2.e(z5);
                } else {
                    ccaVar2.e(false);
                }
                i9++;
                i = 2;
                m8Var = this;
                z = true;
            }
            i9++;
            i = 2;
            m8Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.pca
    public final boolean h(cca ccaVar) {
        return false;
    }

    @Override // defpackage.pca
    public final void i(Context context, yba ybaVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = ybaVar;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int measuredWidth = this.n;
        if (this.l) {
            if (this.i == null) {
                l8 l8Var = new l8(this, this.a);
                this.i = l8Var;
                if (this.k) {
                    l8Var.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        Object obj;
        ng7 ng7Var = this.u;
        if (ng7Var != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(ng7Var);
            this.u = null;
            return true;
        }
        j8 j8Var = this.s;
        if (j8Var == null) {
            return false;
        }
        if (j8Var.b()) {
            j8Var.i.dismiss();
        }
        return true;
    }

    public final boolean k() {
        j8 j8Var = this.s;
        return j8Var != null && j8Var.b();
    }

    public final boolean l() {
        yba ybaVar;
        if (this.l && !k() && (ybaVar = this.c) != null && this.h != null && this.u == null) {
            ybaVar.j();
            if (!ybaVar.j.isEmpty()) {
                ng7 ng7Var = new ng7((Object) this, (Object) new j8(this, this.b, this.c, this.i), false, 1);
                this.u = ng7Var;
                ((View) this.h).post(ng7Var);
                return true;
            }
        }
        return false;
    }
}
