package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public final class vr extends kr implements wba, LayoutInflater.Factory2 {
    public static final h6g G1 = new h6g(0);
    public static final int[] H1 = {R.attr.windowBackground};
    public static final boolean I1 = !"robolectric".equals(Build.FINGERPRINT);
    public ViewGroup A;
    public boolean A1;
    public TextView B;
    public Rect B1;
    public View C;
    public Rect C1;
    public boolean D;
    public nt D1;
    public boolean E;
    public OnBackInvokedDispatcher E1;
    public boolean F;
    public OnBackInvokedCallback F1;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ur[] X;
    public ur Y;
    public boolean Z;
    public final Object j;
    public final Context k;
    public Window l;
    public qr m;
    public lwj n;
    public boolean n1;
    public yah o;
    public boolean o1;
    public CharSequence p;
    public boolean p1;
    public ActionBarOverlayLayout q;
    public Configuration q1;
    public vn7 r;
    public final int r1;
    public zo7 s;
    public int s1;
    public q8 t;
    public int t1;
    public ActionBarContextView u;
    public boolean u1;
    public PopupWindow v;
    public rr v1;
    public pi w;
    public rr w1;
    public boolean x1;
    public int y1;
    public boolean z;
    public d9j x = null;
    public final boolean y = true;
    public final zn z1 = new zn(1, this);

    public vr(Context context, Window window, dr drVar, Object obj) {
        ar arVar = null;
        this.r1 = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof ar)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    arVar = (ar) context;
                    break;
                }
            }
            if (arVar != null) {
                this.r1 = ((vr) arVar.r()).r1;
            }
        }
        if (this.r1 == -100) {
            String name = this.j.getClass().getName();
            h6g h6gVar = G1;
            Integer num = (Integer) h6gVar.get(name);
            if (num != null) {
                this.r1 = num.intValue();
                h6gVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        xr.c();
    }

    public static mc9 q(Context context) {
        mc9 mc9Var;
        mc9 mc9Var2;
        if (Build.VERSION.SDK_INT >= 33 || (mc9Var = kr.c) == null) {
            return null;
        }
        mc9 mc9VarB = nr.b(context.getApplicationContext().getResources().getConfiguration());
        if (mc9Var.c()) {
            mc9Var2 = mc9.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < mc9VarB.d() + mc9Var.d()) {
                Locale localeB = i < mc9Var.d() ? mc9Var.b(i) : mc9VarB.b(i - mc9Var.d());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            mc9Var2 = new mc9(new nc9(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return mc9Var2.c() ? mc9VarB : mc9Var2;
    }

    public static Configuration u(Context context, int i, mc9 mc9Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (mc9Var != null) {
            nr.d(configuration2, mc9Var);
        }
        return configuration2;
    }

    public final ur A(int i) {
        ur[] urVarArr = this.X;
        if (urVarArr == null || urVarArr.length <= i) {
            ur[] urVarArr2 = new ur[i + 1];
            if (urVarArr != null) {
                System.arraycopy(urVarArr, 0, urVarArr2, 0, urVarArr.length);
            }
            this.X = urVarArr2;
            urVarArr = urVarArr2;
        }
        ur urVar = urVarArr[i];
        if (urVar != null) {
            return urVar;
        }
        ur urVar2 = new ur();
        urVar2.a = i;
        urVar2.n = false;
        urVarArr[i] = urVar2;
        return urVar2;
    }

    public final void B() {
        y();
        if (this.F && this.n == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.n = new lwj((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.n = new lwj((Dialog) obj);
            }
            lwj lwjVar = this.n;
            if (lwjVar != null) {
                lwjVar.i(this.A1);
            }
        }
    }

    public final void C(int i) {
        this.y1 = (1 << i) | this.y1;
        if (this.x1) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = i7j.a;
        decorView.postOnAnimation(this.z1);
        this.x1 = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            ore.k("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.w1 == null) {
                            this.w1 = new rr(this, context);
                        }
                        return this.w1.Z();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.v1 == null) {
                        this.v1 = new rr(this, r6a.B(context));
                    }
                    return this.v1.Z();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.Z;
        this.Z = false;
        ur urVarA = A(0);
        if (!urVarA.m) {
            q8 q8Var = this.t;
            if (q8Var != null) {
                q8Var.a();
                return true;
            }
            B();
            lwj lwjVar = this.n;
            if (lwjVar == null || !lwjVar.b()) {
                return false;
            }
        } else if (!z) {
            t(urVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.wba
    public final boolean F(yba ybaVar, MenuItem menuItem) {
        ur urVar;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.p1) {
            yba ybaVarL = ybaVar.l();
            ur[] urVarArr = this.X;
            int length = urVarArr != null ? urVarArr.length : 0;
            for (int i = 0; i < length; i++) {
                urVar = urVarArr[i];
                if (urVar != null && urVar.h == ybaVarL) {
                    if (urVar != null) {
                        return callback.onMenuItemSelected(urVar.a, menuItem);
                    }
                }
            }
            urVar = null;
            if (urVar != null) {
                return callback.onMenuItemSelected(urVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final void G(ur urVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = urVar.m;
        int i2 = urVar.a;
        if (z || this.p1) {
            return;
        }
        Context context = this.k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, urVar.h)) {
            t(urVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && I(urVar, keyEvent)) {
            tr trVar = urVar.e;
            if (trVar != null && !urVar.n) {
                View view = urVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                urVar.l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = urVar.c;
                layoutParams2.windowAnimations = urVar.d;
                windowManager.addView(urVar.e, layoutParams2);
                urVar.m = true;
                if (i2 == 0) {
                    K();
                }
            }
            if (trVar == null) {
                B();
                lwj lwjVar = this.n;
                Context contextE = lwjVar != null ? lwjVar.e() : null;
                if (contextE != null) {
                    context = contextE;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(ru.oneme.app.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(ru.oneme.app.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(ru.oneme.app.R.style.Theme_AppCompat_CompactMenu, true);
                }
                hq4 hq4Var = new hq4(context, 0);
                hq4Var.getTheme().setTo(themeNewTheme);
                urVar.j = hq4Var;
                TypedArray typedArrayObtainStyledAttributes = hq4Var.obtainStyledAttributes(l3e.j);
                urVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                urVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                urVar.e = new tr(this, urVar.j);
                urVar.c = 81;
            } else if (urVar.n && trVar.getChildCount() > 0) {
                urVar.e.removeAllViews();
            }
            View view2 = urVar.g;
            if (view2 == null) {
                if (urVar.h != null) {
                    if (this.s == null) {
                        this.s = new zo7(2, this);
                    }
                    zo7 zo7Var = this.s;
                    if (urVar.i == null) {
                        n79 n79Var = new n79(urVar.j);
                        urVar.i = n79Var;
                        n79Var.d(zo7Var);
                        urVar.h.b(urVar.i);
                    }
                    View view3 = (View) urVar.i.j(urVar.e);
                    urVar.f = view3;
                    if (view3 != null) {
                    }
                }
                urVar.n = true;
                return;
            }
            urVar.f = view2;
            if (urVar.f != null && (urVar.g != null || urVar.i.a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = urVar.f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                urVar.e.setBackgroundResource(urVar.b);
                ViewParent parent = urVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(urVar.f);
                }
                urVar.e.addView(urVar.f, layoutParams3);
                if (!urVar.f.hasFocus()) {
                    urVar.f.requestFocus();
                }
            }
            urVar.n = true;
            return;
            i = -2;
            urVar.l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = urVar.c;
            layoutParams4.windowAnimations = urVar.d;
            windowManager.addView(urVar.e, layoutParams4);
            urVar.m = true;
            if (i2 == 0) {
                K();
            }
        }
    }

    public final boolean H(ur urVar, int i, KeyEvent keyEvent) {
        yba ybaVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((urVar.k || I(urVar, keyEvent)) && (ybaVar = urVar.h) != null) {
            return ybaVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    public final boolean I(ur urVar, KeyEvent keyEvent) {
        yba ybaVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.p1) {
            boolean z = urVar.k;
            int i = urVar.a;
            if (z) {
                return true;
            }
            ur urVar2 = this.Y;
            if (urVar2 != null && urVar2 != urVar) {
                t(urVar2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                urVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.q) != null) {
                actionBarOverlayLayout4.r();
            }
            if (urVar.g == null) {
                yba ybaVar2 = urVar.h;
                if (ybaVar2 == null || urVar.o) {
                    if (ybaVar2 == null) {
                        Context context = this.k;
                        if ((i == 0 || i == 108) && this.q != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ru.oneme.app.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(ru.oneme.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(ru.oneme.app.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                hq4 hq4Var = new hq4(context, 0);
                                hq4Var.getTheme().setTo(themeNewTheme);
                                context = hq4Var;
                            }
                        }
                        yba ybaVar3 = new yba(context);
                        ybaVar3.v(this);
                        yba ybaVar4 = urVar.h;
                        if (ybaVar3 != ybaVar4) {
                            if (ybaVar4 != null) {
                                ybaVar4.s(urVar.i);
                            }
                            urVar.h = ybaVar3;
                            n79 n79Var = urVar.i;
                            if (n79Var != null) {
                                ybaVar3.b(n79Var);
                            }
                        }
                        if (urVar.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.q) != null) {
                                if (this.r == null) {
                                    this.r = new vn7(2, this);
                                }
                                actionBarOverlayLayout2.q(urVar.h, this.r);
                            }
                            urVar.h.z();
                            if (callback.onCreatePanelMenu(i, urVar.h)) {
                                urVar.o = false;
                            } else {
                                ybaVar = urVar.h;
                                if (ybaVar != null) {
                                    if (ybaVar != null) {
                                        ybaVar.s(urVar.i);
                                    }
                                    urVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.q) != null) {
                                    actionBarOverlayLayout.q(null, this.r);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.r == null) {
                                this.r = new vn7(2, this);
                            }
                            actionBarOverlayLayout2.q(urVar.h, this.r);
                        }
                        urVar.h.z();
                        if (callback.onCreatePanelMenu(i, urVar.h)) {
                            ybaVar = urVar.h;
                            if (ybaVar != null) {
                                if (ybaVar != null) {
                                    ybaVar.s(urVar.i);
                                }
                                urVar.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.q(null, this.r);
                            }
                        } else {
                            urVar.o = false;
                        }
                    }
                }
                urVar.h.z();
                Bundle bundle = urVar.p;
                if (bundle != null) {
                    urVar.h.t(bundle);
                    urVar.p = null;
                }
                if (!callback.onPreparePanel(0, urVar.g, urVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.q) != null) {
                        actionBarOverlayLayout3.q(null, this.r);
                    }
                    urVar.h.y();
                    return false;
                }
                urVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                urVar.h.y();
            }
            urVar.k = true;
            urVar.l = false;
            this.Y = urVar;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.E1 != null && (A(0).m || this.t != null)) {
                z = true;
            }
            if (z && this.F1 == null) {
                this.F1 = pr.b(this.E1, this);
            } else {
                if (z || (onBackInvokedCallback = this.F1) == null) {
                    return;
                }
                pr.c(this.E1, onBackInvokedCallback);
                this.F1 = null;
            }
        }
    }

    @Override // defpackage.kr
    public final void c() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof vr) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.kr
    public final void e() {
        String strV;
        this.n1 = true;
        o(false, true);
        z();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strV = p90.v(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strV = null;
            }
            if (strV != null) {
                lwj lwjVar = this.n;
                if (lwjVar == null) {
                    this.A1 = true;
                } else {
                    lwjVar.i(true);
                }
            }
            synchronized (kr.h) {
                kr.g(this);
                kr.g.add(new WeakReference(this));
            }
        }
        this.q1 = new Configuration(this.k.getResources().getConfiguration());
        this.o1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.kr
    public final void f() {
        if (this.j instanceof Activity) {
            synchronized (kr.h) {
                kr.g(this);
            }
        }
        if (this.x1) {
            this.l.getDecorView().removeCallbacks(this.z1);
        }
        this.p1 = true;
        if (this.r1 != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                G1.put(this.j.getClass().getName(), Integer.valueOf(this.r1));
            } else {
                G1.remove(this.j.getClass().getName());
            }
        } else {
            G1.remove(this.j.getClass().getName());
        }
        rr rrVar = this.v1;
        if (rrVar != null) {
            rrVar.t();
        }
        rr rrVar2 = this.w1;
        if (rrVar2 != null) {
            rrVar2.t();
        }
    }

    @Override // defpackage.kr
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            J();
            this.J = true;
            return true;
        }
        if (i == 2) {
            J();
            this.D = true;
            return true;
        }
        if (i == 5) {
            J();
            this.E = true;
            return true;
        }
        if (i == 10) {
            J();
            this.H = true;
            return true;
        }
        if (i == 108) {
            J();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        J();
        this.G = true;
        return true;
    }

    @Override // defpackage.kr
    public final void j(int i) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kr
    public final void k(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kr
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kr
    public final void m(CharSequence charSequence) {
        this.p = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        lwj lwjVar = this.n;
        if (lwjVar != null) {
            lwjVar.l(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.p1) {
            return false;
        }
        int i2 = this.r1;
        if (i2 == -100) {
            i2 = kr.b;
        }
        Context context = this.k;
        int iD = D(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        mc9 mc9VarQ = i3 < 33 ? q(context) : null;
        if (!z2 && mc9VarQ != null) {
            mc9VarQ = nr.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, mc9VarQ, null, false);
        boolean z4 = this.u1;
        boolean z5 = true;
        Object obj = this.j;
        if (z4 || !(obj instanceof Activity)) {
            this.u1 = true;
            i = this.t1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.t1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.t1 = 0;
                }
                this.u1 = true;
                i = this.t1;
            }
        }
        Configuration configuration = this.q1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationU.uiMode & 48;
        mc9 mc9VarB = nr.b(configuration);
        mc9 mc9VarB2 = mc9VarQ == null ? null : nr.b(configurationU);
        int i6 = i4 != i5 ? np0.o : 0;
        if (mc9VarB2 != null && !mc9VarB.equals(mc9VarB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.n1 && ((I1 || this.o1) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                n9.O(activity);
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (mc9VarB2 != null) {
                nr.d(configuration2, mc9VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.s1;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.s1, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof g19) {
                    if (((g19) activity2).f().d.a(n09.c)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.o1 && !this.p1) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (mc9VarB2 != null) {
            nr.c(nr.b(context.getResources().getConfiguration()));
        }
        rr rrVar = this.v1;
        if (i2 == 0) {
            if (rrVar == null) {
                this.v1 = new rr(this, r6a.B(context));
            }
            this.v1.Y();
        } else if (rrVar != null) {
            rrVar.t();
        }
        rr rrVar2 = this.w1;
        if (i2 == 3) {
            if (rrVar2 == null) {
                this.w1 = new rr(this, context);
            }
            this.w1.Y();
        } else if (rrVar2 != null) {
            rrVar2.t();
        }
        return z5;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View gsVar;
        View view2 = null;
        if (this.D1 == null) {
            int[] iArr = l3e.j;
            Context context2 = this.k;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.D1 = new nt();
            } else {
                try {
                    this.D1 = (nt) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.D1 = new nt();
                }
            }
        }
        nt ntVar = this.D1;
        int i = gsi.a;
        ntVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l3e.y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context hq4Var = (resourceId == 0 || ((context instanceof hq4) && ((hq4) context).a == resourceId)) ? context : new hq4(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                gsVar = new gs(hq4Var, attributeSet);
                break;
            case 1:
                gsVar = new fr(hq4Var, attributeSet);
                break;
            case 2:
                gsVar = new ds(hq4Var, attributeSet);
                break;
            case 3:
                gsVar = ntVar.e(hq4Var, attributeSet);
                break;
            case 4:
                gsVar = new bs(hq4Var, attributeSet);
                break;
            case 5:
                gsVar = new is(hq4Var, attributeSet);
                break;
            case 6:
                gsVar = new us(hq4Var, attributeSet);
                break;
            case 7:
                gsVar = ntVar.d(hq4Var, attributeSet);
                break;
            case 8:
                gsVar = new lt(hq4Var, attributeSet);
                break;
            case 9:
                gsVar = new cs(hq4Var, attributeSet, 0);
                break;
            case 10:
                gsVar = ntVar.a(hq4Var, attributeSet);
                break;
            case 11:
                gsVar = ntVar.c(hq4Var, attributeSet);
                break;
            case 12:
                gsVar = new zr(hq4Var, attributeSet);
                break;
            case 13:
                gsVar = ntVar.b(hq4Var, attributeSet);
                break;
            default:
                gsVar = null;
                break;
        }
        if (gsVar == null && context != hq4Var) {
            Object[] objArr = ntVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = hq4Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = nt.g;
                        if (i2 < 3) {
                            View viewF = ntVar.f(hq4Var, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = ntVar.f(hq4Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            gsVar = view2;
        }
        if (gsVar != null) {
            Context context3 = gsVar.getContext();
            if ((context3 instanceof ContextWrapper) && gsVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, nt.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    gsVar.setOnClickListener(new mt(gsVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = hq4Var.obtainStyledAttributes(attributeSet, nt.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = i7j.a;
                    new u6j(ru.oneme.app.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).e(gsVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = hq4Var.obtainStyledAttributes(attributeSet, nt.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    i7j.m(gsVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = hq4Var.obtainStyledAttributes(attributeSet, nt.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    i7j.n(gsVar, typedArrayObtainStyledAttributes6.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return gsVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void p(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.l != null) {
            ore.k("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof qr) {
            ore.k("AppCompat has already installed itself into the Window");
            return;
        }
        qr qrVar = new qr(this, callback);
        this.m = qrVar;
        window.setCallback(qrVar);
        Context context = this.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, H1);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            xr xrVarA = xr.a();
            synchronized (xrVarA) {
                drawableD = xrVarA.a.d(resourceId, context, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.E1) != null) {
            return;
        }
        Object obj = this.j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.F1) != null) {
            pr.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.F1 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.E1 = pr.a(activity);
            } else {
                this.E1 = null;
            }
        } else {
            this.E1 = null;
        }
        K();
    }

    public final void r(int i, ur urVar, yba ybaVar) {
        if (ybaVar == null) {
            if (urVar == null && i >= 0) {
                ur[] urVarArr = this.X;
                if (i < urVarArr.length) {
                    urVar = urVarArr[i];
                }
            }
            if (urVar != null) {
                ybaVar = urVar.h;
            }
        }
        if ((urVar == null || urVar.m) && !this.p1) {
            qr qrVar = this.m;
            Window.Callback callback = this.l.getCallback();
            qrVar.getClass();
            try {
                qrVar.d = true;
                callback.onPanelClosed(i, ybaVar);
            } finally {
                qrVar.d = false;
            }
        }
    }

    public final void s(yba ybaVar) {
        if (this.K) {
            return;
        }
        this.K = true;
        this.q.c();
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.p1) {
            callback.onPanelClosed(108, ybaVar);
        }
        this.K = false;
    }

    public final void t(ur urVar, boolean z) {
        tr trVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && urVar.a == 0 && (actionBarOverlayLayout = this.q) != null && actionBarOverlayLayout.l()) {
            s(urVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && urVar.m && (trVar = urVar.e) != null) {
            windowManager.removeView(trVar);
            if (z) {
                r(urVar.a, urVar, null);
            }
        }
        urVar.k = false;
        urVar.l = false;
        urVar.m = false;
        urVar.f = null;
        urVar.n = true;
        if (this.Y == urVar) {
            this.Y = null;
        }
        if (urVar.a == 0) {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe A[RETURN] */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        ur urVarA;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean zH;
        boolean zI;
        AudioManager audioManager;
        ur urVarA2;
        Object obj = this.j;
        if ((!(obj instanceof gw8) && !(obj instanceof nf)) || (decorView = this.l.getDecorView()) == null || !ti8.i(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                qr qrVar = this.m;
                Window.Callback callback = this.l.getCallback();
                qrVar.getClass();
                try {
                    qrVar.c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    qrVar.c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.Z = (keyEvent.getFlags() & np0.m) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    urVarA2 = A(0);
                                    if (!urVarA2.m) {
                                        I(urVarA2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.t == null) {
                                    urVarA = A(0);
                                    actionBarOverlayLayout = this.q;
                                    context = this.k;
                                    if (actionBarOverlayLayout != null || !actionBarOverlayLayout.b() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        z = urVarA.m;
                                        if (!z || urVarA.l) {
                                            t(urVarA, true);
                                            zH = z;
                                        } else if (urVarA.k) {
                                            if (urVarA.o) {
                                                urVarA.k = false;
                                                zI = I(urVarA, keyEvent);
                                            } else {
                                                zI = true;
                                            }
                                            if (zI) {
                                                G(urVarA, keyEvent);
                                                zH = true;
                                            } else {
                                                zH = false;
                                            }
                                        } else {
                                            zH = false;
                                        }
                                    } else if (this.q.l()) {
                                        zH = this.q.h();
                                    } else if (this.p1 || !I(urVarA, keyEvent)) {
                                        zH = false;
                                    } else {
                                        zH = this.q.s();
                                    }
                                    if (zH) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (E()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    qrVar.c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.Z = (keyEvent.getFlags() & np0.m) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            urVarA2 = A(0);
                            if (!urVarA2.m) {
                                I(urVarA2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.t == null) {
                            urVarA = A(0);
                            actionBarOverlayLayout = this.q;
                            context = this.k;
                            if (actionBarOverlayLayout != null) {
                                z = urVarA.m;
                                if (z) {
                                    t(urVarA, true);
                                    zH = z;
                                } else {
                                    t(urVarA, true);
                                    zH = z;
                                }
                            } else {
                                z = urVarA.m;
                                if (z) {
                                    t(urVarA, true);
                                    zH = z;
                                } else {
                                    t(urVarA, true);
                                    zH = z;
                                }
                            }
                            if (zH) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (E()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.wba
    public final void w(yba ybaVar) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout == null || !actionBarOverlayLayout.b() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.q.k())) {
            ur urVarA = A(0);
            urVarA.n = true;
            t(urVarA, false);
            G(urVarA, null);
            return;
        }
        Window.Callback callback = this.l.getCallback();
        if (this.q.l()) {
            this.q.h();
            if (this.p1) {
                return;
            }
            callback.onPanelClosed(108, A(0).h);
            return;
        }
        if (callback == null || this.p1) {
            return;
        }
        if (this.x1 && (1 & this.y1) != 0) {
            View decorView = this.l.getDecorView();
            zn znVar = this.z1;
            decorView.removeCallbacks(znVar);
            znVar.run();
        }
        ur urVarA2 = A(0);
        yba ybaVar2 = urVarA2.h;
        if (ybaVar2 == null || urVarA2.o || !callback.onPreparePanel(0, urVarA2.g, ybaVar2)) {
            return;
        }
        callback.onMenuOpened(108, urVarA2.h);
        this.q.s();
    }

    public final void x(int i) {
        ur urVarA = A(i);
        if (urVarA.h != null) {
            Bundle bundle = new Bundle();
            urVarA.h.u(bundle);
            if (bundle.size() > 0) {
                urVarA.p = bundle;
            }
            urVarA.h.z();
            urVarA.h.clear();
        }
        urVarA.o = true;
        urVarA.n = true;
        if ((i == 108 || i == 0) && this.q != null) {
            ur urVarA2 = A(0);
            urVarA2.k = false;
            I(urVarA2, null);
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        if (this.z) {
            return;
        }
        Context context = this.k;
        int[] iArr = l3e.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            ore.k("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        z();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) layoutInflaterFrom.inflate(ru.oneme.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ru.oneme.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ru.oneme.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.oneme.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new hq4(context, typedValue.resourceId) : context).inflate(ru.oneme.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ru.oneme.app.R.id.decor_content_parent);
            this.q = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.G) {
                this.q.j(109);
            }
            if (this.D) {
                this.q.j(2);
            }
            if (this.E) {
                this.q.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H);
            sb.append(", windowNoTitle: ");
            ore.p(qt4.r(sb, this.J, " }"));
            return;
        }
        pgg pggVar = new pgg(this);
        WeakHashMap weakHashMap = i7j.a;
        y6j.l(viewGroup, pggVar);
        if (this.q == null) {
            this.B = (TextView) viewGroup.findViewById(ru.oneme.app.R.id.title);
        }
        boolean z = r9j.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.oneme.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new t3a(this));
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.p;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                lwj lwjVar = this.n;
                if (lwjVar != null) {
                    lwjVar.l(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.z = true;
        ur urVarA = A(0);
        if (this.p1 || urVarA.h != null) {
            return;
        }
        C(108);
    }

    public final void z() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        ore.k("We have not been given a Window");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
