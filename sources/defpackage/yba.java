package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class yba implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public wba e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public cca v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public yba(Context context) {
        boolean zM;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM = co5.m(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM) {
                z = true;
            }
        }
        this.d = z;
    }

    public final cca a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            ore.p("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        cca ccaVar = new cca(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((cca) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, ccaVar);
                q(true);
                return ccaVar;
            }
        }
        i4 = 0;
        arrayList.add(i4, ccaVar);
        q(true);
        return ccaVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            cca ccaVarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            ccaVarA.setIcon(resolveInfo.loadIcon(packageManager));
            ccaVarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = ccaVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        cca ccaVarA = a(i, i2, i3, charSequence);
        g7h g7hVar = new g7h(this.a, this, ccaVarA);
        ccaVarA.o = g7hVar;
        g7hVar.setHeaderTitle(ccaVarA.e);
        return g7hVar;
    }

    public final void b(pca pcaVar) {
        c(pcaVar, this.a);
    }

    public final void c(pca pcaVar, Context context) {
        this.u.add(new WeakReference(pcaVar));
        pcaVar.i(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        cca ccaVar = this.v;
        if (ccaVar != null) {
            e(ccaVar);
        }
        this.f.clear();
        q(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        d(true);
    }

    public final void d(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pca pcaVar = (pca) weakReference.get();
            if (pcaVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pcaVar.f(this, z);
            }
        }
        this.s = false;
    }

    public boolean e(cca ccaVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zC = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == ccaVar) {
            z();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                pca pcaVar = (pca) weakReference.get();
                if (pcaVar != null) {
                    zC = pcaVar.c(ccaVar);
                    if (zC) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            y();
            if (zC) {
                this.v = null;
            }
        }
        return zC;
    }

    public boolean f(yba ybaVar, MenuItem menuItem) {
        wba wbaVar = this.e;
        return wbaVar != null && wbaVar.F(ybaVar, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cca ccaVar = (cca) arrayList.get(i2);
            if (ccaVar.a == i) {
                return ccaVar;
            }
            if (ccaVar.hasSubMenu() && (menuItemFindItem = ccaVar.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(cca ccaVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        z();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pca pcaVar = (pca) weakReference.get();
            if (pcaVar != null) {
                zH = pcaVar.h(ccaVar);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        y();
        if (zH) {
            this.v = ccaVar;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final cca h(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        i(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (cca) arrayList.get(0);
        }
        boolean zO = o();
        for (int i2 = 0; i2 < size; i2++) {
            cca ccaVar = (cca) arrayList.get(i2);
            char c = zO ? ccaVar.j : ccaVar.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zO && c == '\b' && i == 67))) {
                return ccaVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cca) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(List list, int i, KeyEvent keyEvent) {
        boolean zO = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cca ccaVar = (cca) arrayList.get(i2);
                if (ccaVar.hasSubMenu()) {
                    ccaVar.o.i(list, i, keyEvent);
                }
                char c = zO ? ccaVar.j : ccaVar.h;
                if ((modifiers & 69647) == ((zO ? ccaVar.k : ccaVar.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zO && c == '\b' && i == 67)) && ccaVar.isEnabled()) {
                        list.add(ccaVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return h(i, keyEvent) != null;
    }

    public final void j() {
        ArrayList arrayListM = m();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zG = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                pca pcaVar = (pca) weakReference.get();
                if (pcaVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= pcaVar.g();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zG) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM.size();
                for (int i = 0; i < size; i++) {
                    cca ccaVar = (cca) arrayListM.get(i);
                    if ((ccaVar.x & 32) == 32) {
                        arrayList.add(ccaVar);
                    } else {
                        arrayList2.add(ccaVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m());
            }
            this.k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public yba l() {
        return this;
    }

    public final ArrayList m() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            cca ccaVar = (cca) arrayList2.get(i);
            if (ccaVar.isVisible()) {
                arrayList.add(ccaVar);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean n() {
        return this.w;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return this.d;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return r(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        cca ccaVarH = h(i, keyEvent);
        boolean zR = ccaVarH != null ? r(ccaVarH, null, i2) : false;
        if ((i2 & 2) != 0) {
            d(true);
        }
        return zR;
    }

    public final void q(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        z();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pca pcaVar = (pca) weakReference.get();
            if (pcaVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pcaVar.e();
            }
        }
        y();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean r(MenuItem menuItem, pca pcaVar, int i) {
        dca dcaVar;
        boolean zExpandActionView;
        dca dcaVar2;
        boolean z;
        g7h g7hVar;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        pca pcaVar2;
        cca ccaVar = (cca) menuItem;
        boolean zB = false;
        if (ccaVar == null || !ccaVar.isEnabled()) {
            return false;
        }
        yba ybaVar = ccaVar.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = ccaVar.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(ccaVar)) && !ybaVar.f(ybaVar, ccaVar)) {
            Intent intent = ccaVar.g;
            if (intent != null) {
                try {
                    ybaVar.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    dcaVar = ccaVar.A;
                    if (dcaVar == null) {
                    }
                    zExpandActionView = false;
                    dcaVar2 = ccaVar.A;
                    if (dcaVar2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (ccaVar.d()) {
                        zExpandActionView |= ccaVar.expandActionView();
                        if (zExpandActionView) {
                            d(true);
                        }
                    } else if (ccaVar.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            d(false);
                        }
                        if (!ccaVar.hasSubMenu()) {
                            g7h g7hVar2 = new g7h(this.a, this, ccaVar);
                            ccaVar.o = g7hVar2;
                            g7hVar2.setHeaderTitle(ccaVar.e);
                        }
                        g7hVar = ccaVar.o;
                        if (z) {
                            dcaVar2.b.onPrepareSubMenu(g7hVar);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (pcaVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                pcaVar2 = (pca) weakReference.get();
                                if (pcaVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zB) {
                                    zB = pcaVar2.b(g7hVar);
                                }
                            }
                        }
                        zExpandActionView |= zB;
                        if (!zExpandActionView) {
                            d(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            d(false);
                        }
                        if (!ccaVar.hasSubMenu()) {
                            g7h g7hVar3 = new g7h(this.a, this, ccaVar);
                            ccaVar.o = g7hVar3;
                            g7hVar3.setHeaderTitle(ccaVar.e);
                        }
                        g7hVar = ccaVar.o;
                        if (z) {
                            dcaVar2.b.onPrepareSubMenu(g7hVar);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zB = pcaVar != null ? pcaVar.b(g7hVar) : false;
                            while (r8.hasNext()) {
                                pcaVar2 = (pca) weakReference.get();
                                if (pcaVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zB) {
                                    zB = pcaVar2.b(g7hVar);
                                }
                            }
                        }
                        zExpandActionView |= zB;
                        if (!zExpandActionView) {
                            d(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                dcaVar = ccaVar.A;
                if (dcaVar == null && dcaVar.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        dcaVar2 = ccaVar.A;
        if (dcaVar2 == null && dcaVar2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (ccaVar.d()) {
            zExpandActionView |= ccaVar.expandActionView();
            if (zExpandActionView) {
                d(true);
            }
        } else if (ccaVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                d(false);
            }
            if (!ccaVar.hasSubMenu()) {
                g7h g7hVar4 = new g7h(this.a, this, ccaVar);
                ccaVar.o = g7hVar4;
                g7hVar4.setHeaderTitle(ccaVar.e);
            }
            g7hVar = ccaVar.o;
            if (z) {
                dcaVar2.b.onPrepareSubMenu(g7hVar);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (pcaVar != null) {
                }
                while (r8.hasNext()) {
                    pcaVar2 = (pca) weakReference.get();
                    if (pcaVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zB) {
                        zB = pcaVar2.b(g7hVar);
                    }
                }
            }
            zExpandActionView |= zB;
            if (!zExpandActionView) {
                d(true);
            }
        } else if ((i & 1) == 0) {
            d(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((cca) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((cca) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((cca) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        q(true);
    }

    public final void s(pca pcaVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            pca pcaVar2 = (pca) weakReference.get();
            if (pcaVar2 == null || pcaVar2 == pcaVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cca ccaVar = (cca) arrayList.get(i2);
            if (ccaVar.b == i) {
                ccaVar.x = (ccaVar.x & (-5)) | (z2 ? 4 : 0);
                ccaVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cca ccaVar = (cca) arrayList.get(i2);
            if (ccaVar.b == i) {
                ccaVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            cca ccaVar = (cca) arrayList.get(i2);
            if (ccaVar.b == i) {
                int i3 = ccaVar.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                ccaVar.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(k());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((g7h) item.getSubMenu()).t(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void u(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((g7h) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public void v(wba wbaVar) {
        this.e = wbaVar;
    }

    public final void w(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        q(false);
    }

    public final void x(boolean z) {
        this.x = z;
    }

    public final void y() {
        this.p = false;
        if (this.q) {
            this.q = false;
            q(this.r);
        }
    }

    public final void z() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
