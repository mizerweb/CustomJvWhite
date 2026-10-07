package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class lwj implements a8 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public a65 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public kwj i;
    public kwj j;
    public ih k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public gg1 s;
    public boolean t;
    public boolean u;
    public final jwj v;
    public final jwj w;
    public final zfh x;

    public lwj(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new jwj(this, 0);
        this.w = new jwj(this, 1);
        this.x = new zfh(this);
        View decorView = activity.getWindow().getDecorView();
        f(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        d9j d9jVarI;
        d9j d9jVarI2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                n(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            n(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        a65 a65Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((gvh) a65Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((gvh) a65Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            gvh gvhVar = (gvh) a65Var;
            d9jVarI = i7j.a(gvhVar.a);
            d9jVarI.a(0.0f);
            d9jVarI.c(100L);
            d9jVarI.d(new fvh(gvhVar, 4));
            d9jVarI2 = this.f.i(0, 200L);
        } else {
            gvh gvhVar2 = (gvh) a65Var;
            d9j d9jVarA = i7j.a(gvhVar2.a);
            d9jVarA.a(1.0f);
            d9jVarA.c(200L);
            d9jVarA.d(new fvh(gvhVar2, 0));
            d9jVarI = this.f.i(8, 100L);
            d9jVarI2 = d9jVarA;
        }
        gg1 gg1Var = new gg1();
        ArrayList arrayList = (ArrayList) gg1Var.c;
        arrayList.add(d9jVarI);
        View view = (View) d9jVarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) d9jVarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(d9jVarI2);
        gg1Var.c();
    }

    public final boolean b() {
        zuh zuhVar;
        a65 a65Var = this.e;
        if (a65Var == null || (zuhVar = ((gvh) a65Var).a.n1) == null || zuhVar.b == null) {
            return false;
        }
        zuh zuhVar2 = ((gvh) a65Var).a.n1;
        cca ccaVar = zuhVar2 == null ? null : zuhVar2.b;
        if (ccaVar == null) {
            return true;
        }
        ccaVar.collapseActionView();
        return true;
    }

    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ore.m();
    }

    public final int d() {
        return ((gvh) this.e).b;
    }

    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ru.oneme.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void f(View view) {
        a65 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.oneme.app.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ru.oneme.app.R.id.action_bar);
        if (callbackFindViewById instanceof a65) {
            wrapper = (a65) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ru.oneme.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.oneme.app.R.id.action_bar_container);
        this.d = actionBarContainer;
        a65 a65Var = this.e;
        if (a65Var == null || this.f == null || actionBarContainer == null) {
            ore.k(lwj.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((gvh) a65Var).a.getContext();
        this.a = context;
        if ((((gvh) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        j(context.getResources().getBoolean(ru.oneme.app.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, l3e.a, ru.oneme.app.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                ore.k("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = i7j.a;
            y6j.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        j(this.a.getResources().getBoolean(ru.oneme.app.R.bool.abc_action_bar_embed_tabs));
    }

    public final boolean h(int i, KeyEvent keyEvent) {
        yba ybaVar;
        kwj kwjVar = this.i;
        if (kwjVar == null || (ybaVar = kwjVar.d) == null) {
            return false;
        }
        ybaVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return ybaVar.performShortcut(i, keyEvent, 0);
    }

    public final void i(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        gvh gvhVar = (gvh) this.e;
        int i2 = gvhVar.b;
        this.h = true;
        gvhVar.a((i & 4) | (i2 & (-5)));
    }

    public final void j(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((gvh) this.e).getClass();
        } else {
            ((gvh) this.e).getClass();
            this.d.setTabContainer(null);
        }
        gvh gvhVar = (gvh) this.e;
        gvhVar.getClass();
        gvhVar.a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void k(boolean z2) {
        gg1 gg1Var;
        this.t = z2;
        if (z2 || (gg1Var = this.s) == null) {
            return;
        }
        gg1Var.a();
    }

    public final void l(CharSequence charSequence) {
        gvh gvhVar = (gvh) this.e;
        if (gvhVar.g) {
            return;
        }
        Toolbar toolbar = gvhVar.a;
        gvhVar.h = charSequence;
        if ((gvhVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (gvhVar.g) {
                i7j.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final kwj m(ih ihVar) {
        kwj kwjVar = this.i;
        if (kwjVar != null) {
            kwjVar.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        kwj kwjVar2 = new kwj(this, this.f.getContext(), ihVar);
        yba ybaVar = kwjVar2.d;
        ybaVar.z();
        try {
            boolean zG = ((xde) kwjVar2.e.a).G(kwjVar2, ybaVar);
            ybaVar.y();
            if (!zG) {
                return null;
            }
            this.i = kwjVar2;
            kwjVar2.g();
            this.f.c(kwjVar2);
            a(true);
            return kwjVar2;
        } catch (Throwable th) {
            ybaVar.y();
            throw th;
        }
    }

    public final void n(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        zfh zfhVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                gg1 gg1Var = this.s;
                if (gg1Var != null) {
                    gg1Var.a();
                }
                int i = this.n;
                jwj jwjVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    jwjVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                gg1 gg1Var2 = new gg1();
                ArrayList arrayList = (ArrayList) gg1Var2.c;
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                d9j d9jVarA = i7j.a(this.d);
                d9jVarA.e(f);
                View view2 = (View) d9jVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(zfhVar != null ? new xcf(zfhVar, view2) : null);
                }
                if (!gg1Var2.a) {
                    arrayList.add(d9jVarA);
                }
                if (this.o && view != null) {
                    d9j d9jVarA2 = i7j.a(view);
                    d9jVarA2.e(f);
                    if (!gg1Var2.a) {
                        arrayList.add(d9jVarA2);
                    }
                }
                boolean z5 = gg1Var2.a;
                if (!z5) {
                    gg1Var2.d = y;
                }
                if (!z5) {
                    gg1Var2.b = 250L;
                }
                if (!z5) {
                    gg1Var2.e = jwjVar;
                }
                this.s = gg1Var2;
                gg1Var2.c();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        gg1 gg1Var3 = this.s;
        if (gg1Var3 != null) {
            gg1Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        jwj jwjVar2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            gg1 gg1Var4 = new gg1();
            ArrayList arrayList2 = (ArrayList) gg1Var4.c;
            d9j d9jVarA3 = i7j.a(this.d);
            d9jVarA3.e(0.0f);
            View view3 = (View) d9jVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(zfhVar != null ? new xcf(zfhVar, view3) : null);
            }
            if (!gg1Var4.a) {
                arrayList2.add(d9jVarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                d9j d9jVarA4 = i7j.a(view);
                d9jVarA4.e(0.0f);
                if (!gg1Var4.a) {
                    arrayList2.add(d9jVarA4);
                }
            }
            boolean z6 = gg1Var4.a;
            if (!z6) {
                gg1Var4.d = z;
            }
            if (!z6) {
                gg1Var4.b = 250L;
            }
            if (!z6) {
                gg1Var4.e = jwjVar2;
            }
            this.s = gg1Var4;
            gg1Var4.c();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            jwjVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = i7j.a;
            w6j.c(actionBarOverlayLayout);
        }
    }

    public lwj(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new jwj(this, 0);
        this.w = new jwj(this, 1);
        this.x = new zfh(this);
        f(dialog.getWindow().getDecorView());
    }
}
