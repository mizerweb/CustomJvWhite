package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class i7j {
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final t6j e = new t6j();
    public static final v6j f = new v6j();

    public static d9j a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        d9j d9jVar = (d9j) a.get(view);
        if (d9jVar != null) {
            return d9jVar;
        }
        d9j d9jVar2 = new d9j(view);
        a.put(view, d9jVar2);
        return d9jVar2;
    }

    public static void b(View view, ixj ixjVar) {
        WindowInsets windowInsetsF = ixjVar.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? e7j.a(view, windowInsetsF) : w6j.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            ixj.g(windowInsetsA, view);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d7j.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = c7j.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? f7j.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : np0.q);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zo4 h(View view, zo4 zo4Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + zo4Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return f7j.b(view, zo4Var);
        }
        ztb ztbVar = (ztb) view.getTag(R.id.tag_on_receive_content_listener);
        aub aubVar = e;
        if (ztbVar == null) {
            if (view instanceof aub) {
                aubVar = (aub) view;
            }
            return aubVar.a(zo4Var);
        }
        zo4 zo4VarA = ztbVar.a(view, zo4Var);
        if (zo4VarA == null) {
            return null;
        }
        if (view instanceof aub) {
            aubVar = (aub) view;
        }
        return aubVar.a(zo4VarA);
    }

    public static void i(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            if (((s4) arrayListE.get(i2)).a() == i) {
                arrayListE.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, s4 s4Var, g5 g5Var) {
        l4 l4Var;
        s4 s4Var2 = new s4(null, s4Var.b, null, g5Var, s4Var.c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            l4Var = null;
        } else {
            l4Var = accessibilityDelegateC instanceof k4 ? ((k4) accessibilityDelegateC).a : new l4(accessibilityDelegateC);
        }
        if (l4Var == null) {
            l4Var = new l4();
        }
        l(view, l4Var);
        i(view, s4Var2.a());
        e(view).add(s4Var2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            d7j.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void l(View view, l4 l4Var) {
        if (l4Var == null && (c(view) instanceof k4)) {
            l4Var = new l4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(l4Var == null ? null : l4Var.b);
    }

    public static void m(View view, CharSequence charSequence) {
        new u6j(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).e(view, charSequence);
        v6j v6jVar = f;
        if (charSequence == null) {
            v6jVar.a.remove(view);
            view.removeOnAttachStateChangeListener(v6jVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(v6jVar);
        } else {
            v6jVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(v6jVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(v6jVar);
            }
        }
    }

    public static void n(View view, boolean z) {
        new u6j(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).e(view, Boolean.valueOf(z));
    }
}
