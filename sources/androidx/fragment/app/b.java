package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import defpackage.b1f;
import defpackage.g74;
import defpackage.hb7;
import defpackage.i19;
import defpackage.m09;
import defpackage.n09;
import defpackage.t3a;
import defpackage.ua7;
import defpackage.va7;
import defpackage.y64;
import defpackage.z64;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends g74 {
    public boolean u;
    public boolean v;
    public final t3a s = new t3a(new va7(this));
    public final i19 t = new i19(this);
    public boolean w = true;

    public b() {
        ((b1f) this.d.c).c("android:support:lifecycle", new y64(1, this));
        h(new ua7(0, this));
        this.k.add(new ua7(1, this));
        i(new z64(this, 1));
    }

    public static boolean q(c cVar) {
        boolean zQ = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                va7 va7Var = aVar.u;
                if ((va7Var == null ? null : va7Var.k) != null) {
                    zQ |= q(aVar.i());
                }
                if (aVar.o1.d.a(n09.d)) {
                    aVar.o1.g(n09.c);
                    zQ = true;
                }
            }
        }
        return zQ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.u);
        printWriter.print(" mResumed=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        if (getApplication() != null) {
            androidx.loader.app.b.b(this).a(str3, printWriter);
        }
        ((va7) this.s.a).j.w(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.g74, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.s.o();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.g74, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.d(m09.ON_CREATE);
        hb7 hb7Var = ((va7) this.s.a).j;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((va7) this.s.a).j.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((va7) this.s.a).j.l();
        this.t.d(m09.ON_DESTROY);
    }

    @Override // defpackage.g74, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((va7) this.s.a).j.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.v = false;
        ((va7) this.s.a).j.u(5);
        this.t.d(m09.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.t.d(m09.ON_RESUME);
        hb7 hb7Var = ((va7) this.s.a).j;
        hb7Var.G = false;
        hb7Var.H = false;
        hb7Var.N.g = false;
        hb7Var.u(7);
    }

    @Override // defpackage.g74, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.s.o();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        t3a t3aVar = this.s;
        t3aVar.o();
        super.onResume();
        this.v = true;
        ((va7) t3aVar.a).j.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        t3a t3aVar = this.s;
        t3aVar.o();
        va7 va7Var = (va7) t3aVar.a;
        super.onStart();
        this.w = false;
        if (!this.u) {
            this.u = true;
            hb7 hb7Var = va7Var.j;
            hb7Var.G = false;
            hb7Var.H = false;
            hb7Var.N.g = false;
            hb7Var.u(4);
        }
        va7Var.j.A(true);
        this.t.d(m09.ON_START);
        hb7 hb7Var2 = va7Var.j;
        hb7Var2.G = false;
        hb7Var2.H = false;
        hb7Var2.N.g = false;
        hb7Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.s.o();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.w = true;
        while (q(p())) {
        }
        hb7 hb7Var = ((va7) this.s.a).j;
        hb7Var.H = true;
        hb7Var.N.g = true;
        hb7Var.u(4);
        this.t.d(m09.ON_STOP);
    }

    public final hb7 p() {
        return ((va7) this.s.a).j;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((va7) this.s.a).j.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
