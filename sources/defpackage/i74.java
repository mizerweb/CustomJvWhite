package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class i74 extends Dialog implements g19, mtb, c1f {
    public i19 a;
    public final s68 b;
    public final ltb c;

    public i74(Context context, int i) {
        super(context, i);
        this.b = new s68(this);
        this.c = new ltb(new jj2(6, this));
    }

    public static void a(i74 i74Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.c1f
    public final b1f c() {
        return (b1f) this.b.c;
    }

    @Override // defpackage.mtb
    public final ltb d() {
        return this.c;
    }

    @Override // defpackage.g19
    public final i19 f() {
        i19 i19Var = this.a;
        if (i19Var != null) {
            return i19Var;
        }
        i19 i19Var2 = new i19(this);
        this.a = i19Var2;
        return i19Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            ltb ltbVar = this.c;
            ltbVar.e = onBackInvokedDispatcher;
            ltbVar.e(ltbVar.g);
        }
        this.b.b(bundle);
        i19 i19Var = this.a;
        if (i19Var == null) {
            i19Var = new i19(this);
            this.a = i19Var;
        }
        i19Var.d(m09.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        i19 i19Var = this.a;
        if (i19Var == null) {
            i19Var = new i19(this);
            this.a = i19Var;
        }
        i19Var.d(m09.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        i19 i19Var = this.a;
        if (i19Var == null) {
            i19Var = new i19(this);
            this.a = i19Var;
        }
        i19Var.d(m09.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.setContentView(view, layoutParams);
    }
}
