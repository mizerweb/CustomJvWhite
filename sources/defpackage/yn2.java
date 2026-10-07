package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yn2 extends hca implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View n;
    public View o;
    public int p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean v;
    public oca w;
    public ViewTreeObserver x;
    public PopupWindow.OnDismissListener y;
    public boolean z;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ls i = new ls(2, this);
    public final vn2 j = new vn2(0, this);
    public final due k = new due(this);
    public int l = 0;
    public int m = 0;
    public boolean u = false;

    public yn2(Context context, View view, int i, boolean z) {
        this.b = context;
        this.n = view;
        this.d = i;
        this.e = z;
        this.p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // defpackage.x3g
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((xn2) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.pca
    public final boolean b(g7h g7hVar) {
        for (xn2 xn2Var : this.h) {
            if (g7hVar == xn2Var.b) {
                xn2Var.a.c.requestFocus();
                return true;
            }
        }
        if (!g7hVar.hasVisibleItems()) {
            return false;
        }
        j(g7hVar);
        oca ocaVar = this.w;
        if (ocaVar != null) {
            ocaVar.m(g7hVar);
        }
        return true;
    }

    @Override // defpackage.pca
    public final void d(oca ocaVar) {
        this.w = ocaVar;
    }

    @Override // defpackage.x3g
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            xn2[] xn2VarArr = (xn2[]) arrayList.toArray(new xn2[size]);
            for (int i = size - 1; i >= 0; i--) {
                xn2 xn2Var = xn2VarArr[i];
                if (xn2Var.a.z.isShowing()) {
                    xn2Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.pca
    public final void e() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((xn2) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((vba) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.pca
    public final void f(yba ybaVar, boolean z) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ybaVar == ((xn2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((xn2) arrayList.get(i2)).b.d(false);
        }
        xn2 xn2Var = (xn2) arrayList.remove(i);
        yba ybaVar2 = xn2Var.b;
        nca ncaVar = xn2Var.a;
        es esVar = ncaVar.z;
        ybaVar2.s(this);
        if (this.z) {
            kca.b(esVar, null);
            esVar.setAnimationStyle(0);
        }
        ncaVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.p = ((xn2) arrayList.get(size2 - 1)).c;
        } else {
            this.p = this.n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((xn2) arrayList.get(0)).b.d(false);
                return;
            }
            return;
        }
        dismiss();
        oca ocaVar = this.w;
        if (ocaVar != null) {
            ocaVar.f(ybaVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.i);
            }
            this.x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.j);
        this.y.onDismiss();
    }

    @Override // defpackage.pca
    public final boolean g() {
        return false;
    }

    @Override // defpackage.hca
    public final void j(yba ybaVar) {
        ybaVar.c(this, this.b);
        if (a()) {
            u(ybaVar);
        } else {
            this.g.add(ybaVar);
        }
    }

    @Override // defpackage.hca
    public final void l(View view) {
        if (this.n != view) {
            this.n = view;
            this.m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // defpackage.x3g
    public final void m() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((yba) it.next());
        }
        arrayList.clear();
        View view = this.n;
        this.o = view;
        if (view != null) {
            boolean z = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.i);
            }
            this.o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // defpackage.x3g
    public final kv5 n() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((xn2) qv1.f(1, arrayList)).a.c;
    }

    @Override // defpackage.hca
    public final void o(boolean z) {
        this.u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        xn2 xn2Var;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                xn2Var = null;
                break;
            }
            xn2Var = (xn2) arrayList.get(i);
            if (!xn2Var.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (xn2Var != null) {
            xn2Var.b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.hca
    public final void p(int i) {
        if (this.l != i) {
            this.l = i;
            this.m = Gravity.getAbsoluteGravity(i, this.n.getLayoutDirection());
        }
    }

    @Override // defpackage.hca
    public final void q(int i) {
        this.q = true;
        this.s = i;
    }

    @Override // defpackage.hca
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    @Override // defpackage.hca
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // defpackage.hca
    public final void t(int i) {
        this.r = true;
        this.t = i;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u(yba ybaVar) {
        boolean z;
        char c;
        View childAt;
        xn2 xn2Var;
        int i;
        int i2;
        MenuItem item;
        vba vbaVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        vba vbaVar2 = new vba(ybaVar, layoutInflaterFrom, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.u) {
            vbaVar2.c = true;
        } else if (a()) {
            int size = ybaVar.f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = ybaVar.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            vbaVar2.c = z;
        }
        int iK = hca.k(vbaVar2, context, this.c);
        nca ncaVar = new nca(context, null, this.d, 0);
        ncaVar.C = this.k;
        ncaVar.p = this;
        es esVar = ncaVar.z;
        esVar.setOnDismissListener(this);
        ncaVar.o = this.n;
        ncaVar.l = this.m;
        ncaVar.y = true;
        esVar.setFocusable(true);
        esVar.setInputMethodMode(2);
        ncaVar.k(vbaVar2);
        ncaVar.q(iK);
        ncaVar.l = this.m;
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            xn2Var = (xn2) qv1.f(1, arrayList);
            yba ybaVar2 = xn2Var.b;
            int size2 = ybaVar2.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = ybaVar2.getItem(i4);
                if (item.hasSubMenu() && ybaVar == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                c = 0;
                childAt = null;
            } else {
                kv5 kv5Var = xn2Var.a.c;
                ListAdapter adapter = kv5Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    vbaVar = (vba) headerViewListAdapter.getWrappedAdapter();
                } else {
                    vbaVar = (vba) adapter;
                    headersCount = 0;
                }
                int count = vbaVar.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == vbaVar.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - kv5Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < kv5Var.getChildCount()) ? kv5Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            xn2Var = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = nca.D;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(esVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                lca.a(esVar, c);
            }
            kca.a(esVar, null);
            kv5 kv5Var2 = ((xn2) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            kv5Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.o.getWindowVisibleDisplayFrame(rect);
            if (this.p == 1) {
                if (kv5Var2.getWidth() + iArr[0] + iK > rect.right) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else if (iArr[0] - iK < 0) {
                i = 1;
            } else {
                i = 0;
            }
            boolean z2 = i == 1;
            this.p = i;
            ncaVar.o = childAt;
            if ((this.m & 5) != 5) {
                i2 = 0;
                iK = z2 ? childAt.getWidth() : 0 - iK;
            } else if (z2) {
                i2 = 0;
            } else {
                i2 = 0;
                iK = 0 - childAt.getWidth();
            }
            ncaVar.f = iK;
            ncaVar.k = true;
            ncaVar.j = true;
            ncaVar.g(i2);
        } else {
            if (this.q) {
                ncaVar.f = this.s;
            }
            if (this.r) {
                ncaVar.g(this.t);
            }
            Rect rect2 = this.a;
            ncaVar.x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new xn2(ncaVar, ybaVar, this.p));
        ncaVar.m();
        kv5 kv5Var3 = ncaVar.c;
        kv5Var3.setOnKeyListener(this);
        if (xn2Var == null && this.v && ybaVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) kv5Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ybaVar.m);
            kv5Var3.addHeaderView(frameLayout, null, false);
            ncaVar.m();
        }
    }
}
