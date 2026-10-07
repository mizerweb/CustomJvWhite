package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class pye {
    public static int a = 1;

    public static final void a(int i, View view, ViewGroup viewGroup) {
        int iD = qt4.D(i);
        if (iD == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iD == 1) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (c.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iD == 2) {
            if (c.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iD != 3) {
            return;
        }
        if (c.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "send";
        }
        if (i == 2) {
            return "recv";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "cv";
        }
        if (i == 2) {
            return "cn";
        }
        throw null;
    }

    public static /* synthetic */ void d(qye qyeVar) {
        throw null;
    }

    public static /* synthetic */ boolean e(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean f(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, egf egfVar, gcf gcfVar, gcf gcfVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(egfVar, gcfVar, gcfVar2)) {
            if (atomicReferenceFieldUpdater.get(egfVar) != gcfVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "END";
            case 2:
                return "IOS_END";
            case 3:
                return "INCOMING";
            case 4:
                return "BEEP";
            case 5:
                return "BUSY";
            case 6:
                return "CONNECTING";
            case 7:
                return "CONNECTED";
            case 8:
                return "START_RECORD";
            case 9:
                return "STOP_RECORD";
            case 10:
                return "WAITING";
            case 11:
                return "HOLD";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "TALKING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "MUTED";
    }

    public static /* synthetic */ String j(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "SEND";
        }
        return "RECV";
    }

    public static /* synthetic */ String k(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "VIDEO";
        }
        return "AUDIO";
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "DIALOG_EMPTY_STATE";
            case 2:
                return "PREVIEW_STICKER_SCREEN";
            case 3:
                return "KEYBOARD_SHOWCASE_SET";
            case 4:
                return "KEYBOARD_RECENT_SET";
            case 5:
                return "KEYBOARD_POPULAR_SET";
            case 6:
                return "KEYBOARD_FAVORITE_SET";
            case 7:
                return "KEYBOARD_ADDED_STICKERSET";
            case 8:
                return "SHOWCASE_SCREEN";
            case 9:
                return "SUGGEST";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "RECENT";
        }
        if (i == 2) {
            return "FAVORITE";
        }
        if (i == 3) {
            return "POPULAR";
        }
        if (i != 4) {
            return i != 5 ? "null" : "SET_SHOWCASE";
        }
        return "SET";
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "PREPARING";
        }
        if (i == 2) {
            return "UPLOADING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NONE";
        }
        return "FAILED";
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "LOADING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "ERROR";
        }
        return "LOADED";
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "CHAT";
        }
        if (i == 2) {
            return "CHANNEL";
        }
        if (i == 3) {
            return "MESSAGE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "GLOBAL";
        }
        return "CONTACT";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "MIDDLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SOLO";
        }
        return "LAST";
    }

    public static /* synthetic */ String r(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "CENTER";
        }
        return "LEFT";
    }
}
