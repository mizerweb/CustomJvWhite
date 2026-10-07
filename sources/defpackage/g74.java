package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class g74 extends Activity implements i8j, rt7, c1f, mtb, g19, gw8 {
    public final i19 a;
    public final mp4 b;
    public final ki3 c;
    public final s68 d;
    public h8j e;
    public final d74 f;
    public final ifh g;
    public final e74 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public boolean o;
    public boolean p;
    public final ifh q;
    public final ifh r;

    public g74() {
        i19 i19Var = new i19(this);
        this.a = i19Var;
        this.b = new mp4(0);
        final b bVar = (b) this;
        this.c = new ki3(new w64(bVar, 0));
        s68 s68Var = new s68(this);
        this.d = s68Var;
        this.f = new d74(bVar);
        this.g = new ifh(new f74(bVar, 2));
        new AtomicInteger();
        this.h = new e74(bVar);
        this.i = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        final int i = 0;
        i19Var.a(new z09() { // from class: x64
            @Override // defpackage.z09
            public final void l(g19 g19Var, m09 m09Var) {
                Window window;
                View viewPeekDecorView;
                int i2 = i;
                b bVar2 = bVar;
                switch (i2) {
                    case 0:
                        if (m09Var == m09.ON_STOP && (window = bVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (m09Var == m09.ON_DESTROY) {
                            bVar2.b.a = null;
                            if (!bVar2.isChangingConfigurations()) {
                                bVar2.b().a();
                            }
                            d74 d74Var = bVar2.f;
                            b bVar3 = d74Var.d;
                            bVar3.getWindow().getDecorView().removeCallbacks(d74Var);
                            bVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(d74Var);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        i19Var.a(new z09() { // from class: x64
            @Override // defpackage.z09
            public final void l(g19 g19Var, m09 m09Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                b bVar2 = bVar;
                switch (i3) {
                    case 0:
                        if (m09Var == m09.ON_STOP && (window = bVar2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (m09Var == m09.ON_DESTROY) {
                            bVar2.b.a = null;
                            if (!bVar2.isChangingConfigurations()) {
                                bVar2.b().a();
                            }
                            d74 d74Var = bVar2.f;
                            b bVar3 = d74Var.d;
                            bVar3.getWindow().getDecorView().removeCallbacks(d74Var);
                            bVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(d74Var);
                        }
                        break;
                }
            }
        });
        i19Var.a(new kee(1, bVar));
        s68Var.a();
        yab.z(this);
        ((b1f) s68Var.c).c("android:support:activity-result", new y64(0, bVar));
        i(new z64(bVar, 0));
        this.q = new ifh(new f74(bVar, 0));
        this.r = new ifh(new f74(bVar, 3));
    }

    @Override // defpackage.gw8
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        this.f.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.i8j
    public final h8j b() {
        if (getApplication() == null) {
            ore.k("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.e == null) {
            c74 c74Var = (c74) getLastNonConfigurationInstance();
            if (c74Var != null) {
                this.e = c74Var.a;
            }
            if (this.e == null) {
                this.e = new h8j();
            }
        }
        return this.e;
    }

    @Override // defpackage.c1f
    public final b1f c() {
        return (b1f) this.d.c;
    }

    @Override // defpackage.mtb
    public final ltb d() {
        return (ltb) this.r.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (ti8.i(decorView, keyEvent)) {
            return true;
        }
        return ti8.j(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (ti8.i(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.rt7
    public final x7b e() {
        x7b x7bVar = new x7b(0);
        if (getApplication() != null) {
            x7bVar.o(e8j.d, getApplication());
        }
        x7bVar.o(yab.e, this);
        x7bVar.o(yab.f, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            x7bVar.o(yab.g, extras);
        }
        return x7bVar;
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.a;
    }

    public final void h(ug4 ug4Var) {
        this.i.add(ug4Var);
    }

    public final void i(rtb rtbVar) {
        mp4 mp4Var = this.b;
        if (((g74) mp4Var.a) != null) {
            rtbVar.a();
        }
        ((CopyOnWriteArraySet) mp4Var.b).add(rtbVar);
    }

    public final void j(ug4 ug4Var) {
        this.m.add(ug4Var);
    }

    public final f8j k() {
        return (f8j) this.q.getValue();
    }

    public final void l() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        q4m.d(getWindow().getDecorView(), this);
    }

    public final void m(Bundle bundle) {
        super.onCreate(bundle);
        int i = tke.b;
        rke.b(this);
    }

    public final void n(Bundle bundle) {
        this.a.g(n09.c);
        super.onSaveInstanceState(bundle);
    }

    public final void o(ug4 ug4Var) {
        this.m.remove(ug4Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.h.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        d().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.b(bundle);
        mp4 mp4Var = this.b;
        mp4Var.a = this;
        Iterator it = ((CopyOnWriteArraySet) mp4Var.b).iterator();
        while (it.hasNext()) {
            ((rtb) it.next()).a();
        }
        m(bundle);
        int i = tke.b;
        rke.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ab7) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
            while (it.hasNext()) {
                if (((ab7) it.next()).a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.o = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.o = false;
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((ug4) it.next()).accept(new i6b(z, 0));
            }
        } catch (Throwable th) {
            this.o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ab7) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.p = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.p = false;
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((ug4) it.next()).accept(new fzc(z, 0));
            }
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((ab7) it.next()).a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.h.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c74 c74Var;
        h8j h8jVar = this.e;
        if (h8jVar == null && (c74Var = (c74) getLastNonConfigurationInstance()) != null) {
            h8jVar = c74Var.a;
        }
        if (h8jVar == null) {
            return null;
        }
        c74 c74Var2 = new c74();
        c74Var2.a = h8jVar;
        return c74Var2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i19 i19Var = this.a;
        if (i19Var != null) {
            i19Var.g(n09.c);
        }
        n(bundle);
        this.d.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (cqk.y()) {
                cqk.f("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ze7 ze7Var = (ze7) this.g.getValue();
            synchronized (ze7Var.b) {
                try {
                    ze7Var.c = true;
                    Iterator it = ze7Var.d.iterator();
                    while (it.hasNext()) {
                        ((af7) it.next()).invoke();
                    }
                    ze7Var.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        l();
        this.f.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        l();
        this.f.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l();
        this.f.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.o) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(new i6b(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.p) {
            return;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((ug4) it.next()).accept(new fzc(z));
        }
    }
}
