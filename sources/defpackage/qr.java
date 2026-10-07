package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class qr implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ vr e;

    public qr(vr vrVar, Window.Callback callback) {
        this.e = vrVar;
        if (callback != null) {
            this.a = callback;
        } else {
            ore.p("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        hwj.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.e.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            vr vrVar = this.e;
            vrVar.B();
            lwj lwjVar = vrVar.n;
            if (lwjVar == null || !lwjVar.h(keyCode, keyEvent)) {
                ur urVar = vrVar.Y;
                if (urVar == null || !vrVar.H(urVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (vrVar.Y == null) {
                        ur urVarA = vrVar.A(0);
                        vrVar.I(urVarA, keyEvent);
                        boolean zH = vrVar.H(urVarA, keyEvent.getKeyCode(), keyEvent);
                        urVarA.k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                ur urVar2 = vrVar.Y;
                if (urVar2 != null) {
                    urVar2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof yba)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            vr vrVar = this.e;
            vrVar.B();
            lwj lwjVar = vrVar.n;
            if (lwjVar != null) {
                lwjVar.c(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        vr vrVar = this.e;
        if (i == 108) {
            vrVar.B();
            lwj lwjVar = vrVar.n;
            if (lwjVar != null) {
                lwjVar.c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            ur urVarA = vrVar.A(i);
            if (urVarA.m) {
                vrVar.t(urVarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        iwj.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        yba ybaVar = menu instanceof yba ? (yba) menu : null;
        if (i == 0 && ybaVar == null) {
            return false;
        }
        if (ybaVar != null) {
            ybaVar.x(true);
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (ybaVar != null) {
            ybaVar.x(false);
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        yba ybaVar = this.e.A(0).h;
        if (ybaVar != null) {
            d(list, ybaVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return gwj.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        vr vrVar = this.e;
        Context context = vrVar.k;
        if (!vrVar.y || i != 0) {
            return gwj.b(this.a, callback, i);
        }
        xde xdeVar = new xde(context, callback);
        q8 q8Var = vrVar.t;
        if (q8Var != null) {
            q8Var.a();
        }
        ih ihVar = new ih(vrVar, xdeVar, false);
        vrVar.B();
        lwj lwjVar = vrVar.n;
        if (lwjVar != null) {
            vrVar.t = lwjVar.m(ihVar);
        }
        if (vrVar.t == null) {
            d9j d9jVar = vrVar.x;
            if (d9jVar != null) {
                d9jVar.b();
            }
            q8 q8Var2 = vrVar.t;
            if (q8Var2 != null) {
                q8Var2.a();
            }
            if (vrVar.u == null) {
                if (vrVar.I) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        hq4 hq4Var = new hq4(context, 0);
                        hq4Var.getTheme().setTo(themeNewTheme);
                        context = hq4Var;
                    }
                    vrVar.u = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    vrVar.v = popupWindow;
                    zjl.e(popupWindow);
                    vrVar.v.setContentView(vrVar.u);
                    vrVar.v.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    vrVar.u.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    vrVar.v.setHeight(-2);
                    vrVar.w = new pi(2, vrVar);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) vrVar.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        vrVar.B();
                        lwj lwjVar2 = vrVar.n;
                        Context contextE = lwjVar2 != null ? lwjVar2.e() : null;
                        if (contextE != null) {
                            context = contextE;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        vrVar.u = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (vrVar.u != null) {
                d9j d9jVar2 = vrVar.x;
                if (d9jVar2 != null) {
                    d9jVar2.b();
                }
                vrVar.u.e();
                rgg rggVar = new rgg(vrVar.u.getContext(), vrVar.u, ihVar);
                if (ihVar.D(rggVar, rggVar.c())) {
                    rggVar.g();
                    vrVar.u.c(rggVar);
                    vrVar.t = rggVar;
                    boolean z = vrVar.z && (viewGroup = vrVar.A) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView = vrVar.u;
                    if (z) {
                        actionBarContextView.setAlpha(0.0f);
                        d9j d9jVarA = i7j.a(vrVar.u);
                        d9jVarA.a(1.0f);
                        vrVar.x = d9jVarA;
                        d9jVarA.d(new lr(1, vrVar));
                    } else {
                        actionBarContextView.setAlpha(1.0f);
                        vrVar.u.setVisibility(0);
                        if (vrVar.u.getParent() instanceof View) {
                            View view = (View) vrVar.u.getParent();
                            WeakHashMap weakHashMap = i7j.a;
                            w6j.c(view);
                        }
                    }
                    if (vrVar.v != null) {
                        vrVar.l.getDecorView().post(vrVar.w);
                    }
                } else {
                    vrVar.t = null;
                }
            }
            vrVar.K();
            vrVar.t = vrVar.t;
        }
        vrVar.K();
        q8 q8Var3 = vrVar.t;
        if (q8Var3 != null) {
            return xdeVar.p(q8Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
