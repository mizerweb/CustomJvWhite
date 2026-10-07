package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class br4 {
    private static final String KEY_ARGS = "Controller.args";
    private static final String KEY_CHILD_ROUTERS = "Controller.childRouters";
    private static final String KEY_CLASS_NAME = "Controller.className";
    private static final String KEY_INSTANCE_ID = "Controller.instanceId";
    private static final String KEY_NEEDS_ATTACH = "Controller.needsAttach";
    private static final String KEY_OVERRIDDEN_POP_HANDLER = "Controller.overriddenPopHandler";
    private static final String KEY_OVERRIDDEN_PUSH_HANDLER = "Controller.overriddenPushHandler";
    private static final String KEY_REQUESTED_PERMISSIONS = "Controller.requestedPermissions";
    private static final String KEY_RETAIN_VIEW_MODE = "Controller.retainViewMode";
    private static final String KEY_SAVED_STATE = "Controller.savedState";
    private static final String KEY_TARGET_INSTANCE_ID = "Controller.target.instanceId";
    private static final String KEY_VIEW_STATE = "Controller.viewState";
    static final String KEY_VIEW_STATE_BUNDLE = "Controller.viewState.bundle";
    private static final String KEY_VIEW_STATE_HIERARCHY = "Controller.viewState.hierarchy";
    private final Bundle args;
    private boolean attached;
    private boolean attachedToUnownedParent;
    private boolean awaitingParentAttach;
    private boolean destroyed;
    private WeakReference<View> destroyedView;
    private boolean hasOptionsMenu;
    private boolean hasSavedViewState;
    String instanceId;
    boolean isBeingDestroyed;
    private boolean isContextAvailable;
    boolean isDetachFrozen;
    private boolean isPerformingExitTransition;
    public final g19 lifecycleOwner;
    private boolean needsAttach;
    final dtb onBackPressedCallback;
    boolean onBackPressedDispatcherEnabled;
    private boolean optionsMenuHidden;
    private gr4 overriddenPopHandler;
    private gr4 overriddenPushHandler;
    private br4 parentController;
    hve router;
    private Bundle savedInstanceState;
    private String targetInstanceId;
    View view;
    private r6j viewAttachHandler;
    boolean viewIsAttached;
    Bundle viewState;
    boolean viewWasDetached;
    private xq4 retainViewMode = xq4.a;
    private final List<ir4> childRouters = new ArrayList();
    private final List<wq4> lifecycleListeners = new ArrayList();
    private final ArrayList<String> requestedPermissions = new ArrayList<>();
    private final ArrayList<ive> onRouterSetListeners = new ArrayList<>();

    public br4(Bundle bundle) {
        Constructor<?> constructor;
        Widget widget = (Widget) this;
        this.onBackPressedCallback = new vq4(widget);
        this.lifecycleOwner = new da2(widget);
        this.args = bundle == null ? new Bundle(getClass().getClassLoader()) : bundle;
        this.instanceId = UUID.randomUUID().toString();
        Constructor<?>[] constructors = getClass().getConstructors();
        if (a1(constructors) == null) {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (constructor == null) {
                throw new RuntimeException(getClass() + " does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            }
        }
        okc okcVar = new okc();
        okcVar.d = Bundle.EMPTY;
        addLifecycleListener(new ka8(okcVar, 1, widget));
    }

    public static Constructor a1(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }

    public static br4 newInstance(Bundle bundle) {
        Constructor<?> constructor;
        br4 br4Var;
        String string = bundle.getString(KEY_CLASS_NAME);
        Class clsA = rml.a(string, false);
        Constructor<?>[] constructors = clsA.getConstructors();
        Constructor constructorA1 = a1(constructors);
        Bundle bundle2 = bundle.getBundle(KEY_ARGS);
        if (bundle2 != null) {
            bundle2.setClassLoader(clsA.getClassLoader());
        }
        try {
            if (constructorA1 != null) {
                br4Var = (br4) constructorA1.newInstance(bundle2);
            } else {
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                }
                br4Var = (br4) constructor.newInstance(null);
                if (bundle2 != null) {
                    br4Var.args.putAll(bundle2);
                }
            }
            br4Var.getClass();
            Bundle bundle3 = bundle.getBundle(KEY_VIEW_STATE);
            br4Var.viewState = bundle3;
            if (bundle3 != null) {
                bundle3.setClassLoader(br4Var.getClass().getClassLoader());
            }
            br4Var.instanceId = bundle.getString(KEY_INSTANCE_ID);
            br4Var.targetInstanceId = bundle.getString(KEY_TARGET_INSTANCE_ID);
            br4Var.requestedPermissions.addAll(bundle.getStringArrayList(KEY_REQUESTED_PERMISSIONS));
            Bundle bundle4 = bundle.getBundle(KEY_OVERRIDDEN_PUSH_HANDLER);
            HashMap map = gr4.c;
            br4Var.overriddenPushHandler = rx8.z(bundle4);
            br4Var.overriddenPopHandler = rx8.z(bundle.getBundle(KEY_OVERRIDDEN_POP_HANDLER));
            br4Var.needsAttach = bundle.getBoolean(KEY_NEEDS_ATTACH);
            br4Var.retainViewMode = xq4.values()[bundle.getInt(KEY_RETAIN_VIEW_MODE, 0)];
            for (Bundle bundle5 : bundle.getParcelableArrayList(KEY_CHILD_ROUTERS)) {
                ir4 ir4Var = new ir4();
                if (ir4Var.j == null) {
                    ir4Var.j = br4Var;
                    ir4Var.S(br4Var.onBackPressedDispatcherEnabled);
                }
                ir4Var.P(bundle5);
                br4Var.childRouters.add(ir4Var);
            }
            Bundle bundle6 = bundle.getBundle(KEY_SAVED_STATE);
            br4Var.savedInstanceState = bundle6;
            if (bundle6 != null) {
                bundle6.setClassLoader(br4Var.getClass().getClassLoader());
            }
            br4Var.b1();
            return br4Var;
        } catch (Exception e) {
            StringBuilder sbV = qt4.v("An exception occurred while creating a new instance of ", string, ". ");
            sbV.append(e.getMessage());
            throw new RuntimeException(sbV.toString(), e);
        }
    }

    private void removeViewReference(Context context) {
        View view = this.view;
        if (view != null) {
            if (context == null) {
                context = view.getContext();
            }
            if (!this.isBeingDestroyed && !this.hasSavedViewState) {
                d1(this.view);
            }
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((wq4) it.next()).s(this, this.view);
            }
            onDestroyView(this.view);
            r6j r6jVar = this.viewAttachHandler;
            if (r6jVar != null) {
                View view2 = this.view;
                view2.removeOnAttachStateChangeListener(r6jVar);
                if (r6jVar.f != null && (view2 instanceof ViewGroup)) {
                    r6j.a((ViewGroup) view2).removeOnAttachStateChangeListener(r6jVar.f);
                    r6jVar.f = null;
                }
            }
            this.viewAttachHandler = null;
            this.viewIsAttached = false;
            if (this.isBeingDestroyed) {
                this.destroyedView = new WeakReference<>(this.view);
            }
            this.view = null;
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((wq4) it2.next()).l(this);
            }
            Iterator<ir4> it3 = this.childRouters.iterator();
            while (it3.hasNext()) {
                it3.next().b0();
            }
        }
        if (this.isBeingDestroyed) {
            if (context == null) {
                context = getActivity();
            }
            if (this.isContextAvailable) {
                onContextUnavailable(context);
            }
            if (this.destroyed) {
                return;
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((wq4) it4.next()).r(this);
            }
            this.destroyed = true;
            onDestroy();
            this.parentController = null;
            Iterator it5 = new ArrayList(this.lifecycleListeners).iterator();
            while (it5.hasNext()) {
                ((wq4) it5.next()).k(this);
            }
        }
    }

    public final void Z0(boolean z) {
        this.isBeingDestroyed = true;
        hve hveVar = this.router;
        if (hveVar != null) {
            hveVar.a0(this.instanceId);
        }
        Iterator<ir4> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().c(false);
        }
        if (!this.attached) {
            removeViewReference(null);
        } else if (z) {
            detach(this.view, true, false);
        }
    }

    public final void activityDestroyed(Activity activity) {
        if (activity.isChangingConfigurations()) {
            detach(this.view, true, false);
        } else {
            Z0(true);
        }
        onContextUnavailable(activity);
    }

    public final void activityPaused(Activity activity) {
        onActivityPaused(activity);
    }

    public final void activityResumed(Activity activity) {
        View view;
        boolean z = this.attached;
        if (!z && (view = this.view) != null && this.viewIsAttached) {
            attach(view);
        } else if (z) {
            this.needsAttach = false;
            this.hasSavedViewState = false;
        }
        onActivityResumed(activity);
    }

    public final void activityStarted(Activity activity) {
        r6j r6jVar = this.viewAttachHandler;
        if (r6jVar != null) {
            r6jVar.c = false;
            r6jVar.b();
        }
        onActivityStarted(activity);
    }

    public final void activityStopped(Activity activity) {
        boolean z = this.attached;
        r6j r6jVar = this.viewAttachHandler;
        if (r6jVar != null) {
            r6jVar.c = true;
            r6jVar.c(true);
        }
        if (z && activity.isChangingConfigurations()) {
            this.needsAttach = true;
        }
        onActivityStopped(activity);
    }

    public final void addLifecycleListener(wq4 wq4Var) {
        if (this.lifecycleListeners.contains(wq4Var)) {
            return;
        }
        this.lifecycleListeners.add(wq4Var);
    }

    public void attach(View view) {
        boolean z = this.router == null || view.getParent() != this.router.i;
        this.attachedToUnownedParent = z;
        if (z || this.isBeingDestroyed) {
            return;
        }
        br4 br4Var = this.parentController;
        if (br4Var != null && !br4Var.attached) {
            this.awaitingParentAttach = true;
            return;
        }
        this.awaitingParentAttach = false;
        this.hasSavedViewState = false;
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((wq4) it.next()).n(this, view);
        }
        this.attached = true;
        this.needsAttach = this.router.h;
        onAttach(view);
        if (this.hasOptionsMenu && !this.optionsMenuHidden) {
            this.router.p();
        }
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((wq4) it2.next()).g(this);
        }
        for (ir4 ir4Var : this.childRouters) {
            Iterator it3 = ir4Var.a.iterator();
            while (true) {
                y1 y1Var = (y1) it3;
                if (!y1Var.hasNext()) {
                    break;
                }
                br4 br4Var2 = ((lve) y1Var.next()).a;
                if (br4Var2.awaitingParentAttach) {
                    br4Var2.attach(br4Var2.view);
                }
            }
            if (ir4Var.n()) {
                ir4Var.K();
            }
        }
    }

    public final void b1() {
        Bundle bundle = this.savedInstanceState;
        if (bundle == null || this.router == null) {
            return;
        }
        onRestoreInstanceState(bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((wq4) it.next()).c(this, this.savedInstanceState);
        }
        this.savedInstanceState = null;
    }

    public final void c1() {
        for (ir4 ir4Var : this.childRouters) {
            if (!ir4Var.n()) {
                View viewFindViewById = this.view.findViewById(ir4Var.k);
                if (viewFindViewById instanceof ViewGroup) {
                    ir4Var.d0(this, (ViewGroup) viewFindViewById);
                    ir4Var.K();
                }
            }
        }
    }

    public final void changeEnded(gr4 gr4Var, hr4 hr4Var) {
        WeakReference<View> weakReference;
        if (!hr4Var.b) {
            this.isPerformingExitTransition = false;
            Iterator<ir4> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().c0(false);
            }
        }
        onChangeEnded(gr4Var, hr4Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((wq4) it2.next()).a(this, gr4Var, hr4Var);
        }
        if (this.isBeingDestroyed && !this.viewIsAttached && !this.attached && (weakReference = this.destroyedView) != null) {
            View view = weakReference.get();
            if (this.router.i != null && view != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = this.router.i;
                if (parent == viewGroup) {
                    viewGroup.removeView(view);
                }
            }
            this.destroyedView = null;
        }
        gr4Var.getClass();
    }

    public final void changeStarted(gr4 gr4Var, hr4 hr4Var) {
        if (!hr4Var.b) {
            this.isPerformingExitTransition = true;
            Iterator<ir4> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().c0(true);
            }
        }
        onChangeStarted(gr4Var, hr4Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((wq4) it2.next()).b(this, gr4Var, hr4Var);
        }
    }

    public final void createOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public final void d1(View view) {
        this.hasSavedViewState = true;
        this.viewState = new Bundle(getClass().getClassLoader());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        view.saveHierarchyState(sparseArray);
        this.viewState.putSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY, sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        onSaveViewState(view, bundle);
        this.viewState.putBundle(KEY_VIEW_STATE_BUNDLE, bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((wq4) it.next()).f(this);
        }
    }

    public final void destroy() {
        Z0(false);
    }

    public void detach(View view, boolean z, boolean z2) {
        if (!this.attachedToUnownedParent) {
            Iterator<ir4> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().H();
            }
        }
        boolean z3 = !z2 && (z || this.retainViewMode == xq4.a || this.isBeingDestroyed);
        if (this.attached) {
            if (this.awaitingParentAttach) {
                this.attached = false;
            } else {
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((wq4) it2.next()).t(this);
                }
                this.attached = false;
                onDetach(view);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.p();
                }
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((wq4) it3.next()).m(this);
                }
            }
        }
        this.awaitingParentAttach = false;
        if (z3) {
            removeViewReference(view != null ? view.getContext() : null);
        }
    }

    public final boolean didRequestPermission(String str) {
        return this.requestedPermissions.contains(str);
    }

    public final void executeWithRouter(ive iveVar) {
        if (this.router != null) {
            iveVar.a();
        } else {
            this.onRouterSetListeners.add(iveVar);
        }
    }

    public final br4 findController(String str) {
        if (this.instanceId.equals(str)) {
            return this;
        }
        Iterator<ir4> it = this.childRouters.iterator();
        while (it.hasNext()) {
            br4 br4VarF = it.next().f(str);
            if (br4VarF != null) {
                return br4VarF;
            }
        }
        return null;
    }

    public final Activity getActivity() {
        hve hveVar = this.router;
        if (hveVar != null) {
            return hveVar.d();
        }
        return null;
    }

    public final Context getApplicationContext() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public Bundle getArgs() {
        return this.args;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public final hve getChildRouter(ViewGroup viewGroup, String str, boolean z, boolean z2) {
        ir4 next;
        int id = viewGroup.getId();
        if (id == -1) {
            ore.k("You must set an id on your container.");
            return null;
        }
        Iterator<ir4> it = this.childRouters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!next.n && next.i == null) {
                String str2 = next.l;
                if (str2 == null) {
                    ore.k("Host ID can't be variable with a null tag");
                    return null;
                }
                if (str2.equals(str)) {
                    next.k = id;
                    break;
                }
                if (next.k != id) {
                }
            } else if (next.k != id && TextUtils.equals(str, next.l)) {
                break;
            }
        }
        if (next == null) {
            if (z) {
                int id2 = viewGroup.getId();
                ir4 ir4Var = new ir4();
                if (!z2 && str == null) {
                    ore.k("ControllerHostedRouter can't be created without a tag if not bounded to its container");
                    return null;
                }
                ir4Var.k = id2;
                ir4Var.l = str;
                ir4Var.n = z2;
                ir4Var.d0(this, viewGroup);
                this.childRouters.add(ir4Var);
                if (this.isPerformingExitTransition) {
                    ir4Var.c0(true);
                }
                return ir4Var;
            }
        } else if (!next.n()) {
            next.d0(this, viewGroup);
            next.K();
        }
        return next;
    }

    public final List<hve> getChildRouters() {
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        arrayList.addAll(this.childRouters);
        return arrayList;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getNeedsAttach() {
        return this.needsAttach;
    }

    public final ltb getOnBackPressedDispatcher() {
        hve hveVar = this.router;
        if (hveVar != null) {
            return hveVar.h();
        }
        return null;
    }

    public gr4 getOverriddenPopHandler() {
        return this.overriddenPopHandler;
    }

    public final gr4 getOverriddenPushHandler() {
        return this.overriddenPushHandler;
    }

    public final br4 getParentController() {
        return this.parentController;
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getResources();
        }
        return null;
    }

    public xq4 getRetainViewMode() {
        return this.retainViewMode;
    }

    public final hve getRouter() {
        return this.router;
    }

    public final br4 getTargetController() {
        if (this.targetInstanceId != null) {
            return this.router.i().f(this.targetInstanceId);
        }
        return null;
    }

    public final View getView() {
        return this.view;
    }

    @Deprecated
    public boolean handleBack() {
        ArrayList arrayList = new ArrayList();
        Iterator<ir4> it = this.childRouters.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().e());
        }
        Collections.sort(arrayList, new ps0(6));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            br4 br4Var = ((lve) it2.next()).a;
            if (br4Var.isAttached()) {
                hve router = br4Var.getRouter();
                router.getClass();
                wk8.k();
                if (router.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final View inflate(ViewGroup viewGroup) {
        View view = this.view;
        if (view != null && view.getParent() != null && this.view.getParent() != viewGroup) {
            View view2 = this.view;
            detach(view2, true, false);
            removeViewReference(view2.getContext());
        }
        if (this.view == null) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((wq4) it.next()).q(this);
            }
            Bundle bundle = this.viewState;
            View viewOnCreateView = onCreateView(LayoutInflater.from(viewGroup.getContext()), viewGroup, bundle == null ? null : bundle.getBundle(KEY_VIEW_STATE_BUNDLE));
            this.view = viewOnCreateView;
            if (viewOnCreateView == viewGroup) {
                ore.k("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
                return null;
            }
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((wq4) it2.next()).j(this, this.view);
            }
            View view3 = this.view;
            Bundle bundle2 = this.viewState;
            if (bundle2 != null) {
                view3.restoreHierarchyState(bundle2.getSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY));
                Bundle bundle3 = this.viewState.getBundle(KEY_VIEW_STATE_BUNDLE);
                bundle3.setClassLoader(getClass().getClassLoader());
                onRestoreViewState(view3, bundle3);
                c1();
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((wq4) it3.next()).d(this);
                }
            }
            if (!this.isBeingDestroyed) {
                v56 v56Var = new v56(1, this);
                r6j r6jVar = new r6j();
                r6jVar.a = false;
                r6jVar.b = false;
                r6jVar.c = false;
                r6jVar.d = 1;
                r6jVar.e = v56Var;
                this.viewAttachHandler = r6jVar;
                this.view.addOnAttachStateChangeListener(r6jVar);
            }
        } else {
            c1();
        }
        return this.view;
    }

    public final boolean isAttached() {
        return this.attached;
    }

    public final boolean isBeingDestroyed() {
        return this.isBeingDestroyed;
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public abstract void onActivityPaused(Activity activity);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onActivityResumed(Activity activity);

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAttach(View view) {
    }

    public void onChangeEnded(gr4 gr4Var, hr4 hr4Var) {
    }

    public abstract void onChangeStarted(gr4 gr4Var, hr4 hr4Var);

    public final void onContextAvailable() {
        Activity activityD = this.router.d();
        if (activityD != null && !this.isContextAvailable) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((wq4) it.next()).o(this);
            }
            boolean z = this.router.f;
            this.onBackPressedDispatcherEnabled = z;
            if (z) {
                if (!(activityD instanceof g74)) {
                    ore.k("Host activities must extend ComponentActivity when enabling OnBackPressedDispatcher support.");
                    return;
                }
                getOnBackPressedDispatcher().b(this.onBackPressedCallback);
            }
            this.isContextAvailable = true;
            onContextAvailable(activityD);
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((wq4) it2.next()).h(this);
            }
        }
        Iterator<ir4> it3 = this.childRouters.iterator();
        while (it3.hasNext()) {
            it3.next().v();
        }
    }

    public final void onContextUnavailable(Context context) {
        for (ir4 ir4Var : this.childRouters) {
            Iterator it = ir4Var.a.iterator();
            while (true) {
                y1 y1Var = (y1) it;
                if (!y1Var.hasNext()) {
                    break;
                } else {
                    ((lve) y1Var.next()).a.onContextUnavailable(context);
                }
            }
            Iterator it2 = ir4Var.d.iterator();
            while (it2.hasNext()) {
                ((br4) it2.next()).onContextUnavailable(context);
            }
        }
        if (this.isContextAvailable) {
            Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
            while (it3.hasNext()) {
                ((wq4) it3.next()).p(this);
            }
            this.isContextAvailable = false;
            onContextUnavailable();
            if (this.onBackPressedDispatcherEnabled) {
                this.onBackPressedCallback.e();
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((wq4) it4.next()).i(this);
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
    }

    public void onDestroyView(View view) {
    }

    public void onDetach(View view) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public abstract void onRestoreInstanceState(Bundle bundle);

    public void onRestoreViewState(View view, Bundle bundle) {
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public void onSaveViewState(View view, Bundle bundle) {
    }

    public final boolean optionsItemSelected(MenuItem menuItem) {
        return this.attached && this.hasOptionsMenu && !this.optionsMenuHidden && onOptionsItemSelected(menuItem);
    }

    public void overridePopHandler(gr4 gr4Var) {
        this.overriddenPopHandler = gr4Var;
    }

    public void overridePushHandler(gr4 gr4Var) {
        this.overriddenPushHandler = gr4Var;
    }

    public final void prepareForHostDetach() {
        this.needsAttach = this.needsAttach || this.attached;
        Iterator<ir4> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().H();
        }
    }

    public final void prepareOptionsMenu(Menu menu) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onPrepareOptionsMenu(menu);
        }
    }

    public final void registerForActivityResult(final int i) {
        executeWithRouter(new ive() { // from class: rq4
            @Override // defpackage.ive
            public final void a() {
                br4 br4Var = this.a;
                br4Var.router.L(i, br4Var.instanceId);
            }
        });
    }

    public final void removeChildRouter(hve hveVar) {
        if ((hveVar instanceof ir4) && this.childRouters.remove(hveVar)) {
            hveVar.c(true);
        }
    }

    public final void removeLifecycleListener(wq4 wq4Var) {
        this.lifecycleListeners.remove(wq4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestPermissions(String[] strArr, int i) {
        this.requestedPermissions.addAll(Arrays.asList(strArr));
        executeWithRouter(new sq4(this, strArr, i, 1));
    }

    public final void requestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.requestedPermissions.removeAll(Arrays.asList(strArr));
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public final Bundle saveInstanceState() {
        View view;
        if (!this.hasSavedViewState && (view = this.view) != null) {
            d1(view);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_CLASS_NAME, getClass().getName());
        bundle.putBundle(KEY_VIEW_STATE, this.viewState);
        bundle.putBundle(KEY_ARGS, this.args);
        bundle.putString(KEY_INSTANCE_ID, this.instanceId);
        bundle.putString(KEY_TARGET_INSTANCE_ID, this.targetInstanceId);
        bundle.putStringArrayList(KEY_REQUESTED_PERMISSIONS, this.requestedPermissions);
        bundle.putBoolean(KEY_NEEDS_ATTACH, this.needsAttach || this.attached);
        bundle.putInt(KEY_RETAIN_VIEW_MODE, this.retainViewMode.ordinal());
        gr4 gr4Var = this.overriddenPushHandler;
        if (gr4Var != null) {
            bundle.putBundle(KEY_OVERRIDDEN_PUSH_HANDLER, gr4Var.j());
        }
        gr4 gr4Var2 = this.overriddenPopHandler;
        if (gr4Var2 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_POP_HANDLER, gr4Var2.j());
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.childRouters.size());
        for (ir4 ir4Var : this.childRouters) {
            Bundle bundle2 = new Bundle();
            ir4Var.Q(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(KEY_CHILD_ROUTERS, arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        onSaveInstanceState(bundle3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((wq4) it.next()).e(this, bundle3);
        }
        bundle.putBundle(KEY_SAVED_STATE, bundle3);
        return bundle;
    }

    public final void setDetachFrozen(boolean z) {
        if (this.isDetachFrozen != z) {
            this.isDetachFrozen = z;
            boolean z2 = (z || this.view == null || !this.viewWasDetached) ? false : true;
            for (ir4 ir4Var : this.childRouters) {
                if (z2) {
                    ir4Var.H();
                }
                ir4Var.c0(z);
            }
            if (z2) {
                View view = this.view;
                detach(view, false, false);
                if (this.view == null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = this.router.i;
                    if (parent == viewGroup) {
                        viewGroup.removeView(view);
                    }
                }
            }
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        boolean z2 = (!this.attached || this.optionsMenuHidden || this.hasOptionsMenu == z) ? false : true;
        this.hasOptionsMenu = z;
        if (z2) {
            this.router.p();
        }
    }

    public final void setNeedsAttach(boolean z) {
        this.needsAttach = z;
    }

    public final void setOptionsMenuHidden(boolean z) {
        boolean z2 = this.attached && this.hasOptionsMenu && this.optionsMenuHidden != z;
        this.optionsMenuHidden = z;
        if (z2) {
            this.router.p();
        }
    }

    public final void setParentController(br4 br4Var) {
        this.parentController = br4Var;
    }

    public void setRetainViewMode(xq4 xq4Var) {
        xq4 xq4Var2 = xq4.a;
        if (xq4Var == null) {
            xq4Var = xq4Var2;
        }
        this.retainViewMode = xq4Var;
        if (xq4Var != xq4Var2 || this.attached) {
            return;
        }
        removeViewReference(null);
    }

    public final void setRouter(hve hveVar) {
        if (this.router == hveVar) {
            b1();
            return;
        }
        this.router = hveVar;
        b1();
        Iterator<ive> it = this.onRouterSetListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.onRouterSetListeners.clear();
    }

    public void setTargetController(br4 br4Var) {
        if (this.targetInstanceId == null) {
            this.targetInstanceId = br4Var != null ? br4Var.getInstanceId() : null;
        } else {
            ore.q("Target controller already set. A controller's target may only be set once.");
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return getActivity().shouldShowRequestPermissionRationale(str);
    }

    public final void startActivity(final Intent intent) {
        executeWithRouter(new ive() { // from class: uq4
            @Override // defpackage.ive
            public final void a() {
                this.a.router.V(intent);
            }
        });
    }

    public final void startActivityForResult(Intent intent, int i) {
        executeWithRouter(new sq4(this, intent, i, 0));
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.router.Y(this.instanceId, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void startActivityForResult(final Intent intent, final int i, final Bundle bundle) {
        executeWithRouter(new ive() { // from class: tq4
            @Override // defpackage.ive
            public final void a() {
                br4 br4Var = this.a;
                br4Var.router.X(br4Var.instanceId, intent, i, bundle);
            }
        });
    }

    public void onContextAvailable(Context context) {
    }

    public final hve getChildRouter(ViewGroup viewGroup, String str) {
        return getChildRouter(viewGroup, str, true);
    }

    public final hve getChildRouter(ViewGroup viewGroup, String str, boolean z) {
        return getChildRouter(viewGroup, str, z, true);
    }

    public final hve getChildRouter(ViewGroup viewGroup) {
        return getChildRouter(viewGroup, null);
    }

    public void onContextUnavailable() {
    }
}
