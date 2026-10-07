package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.av6;
import defpackage.bl5;
import defpackage.cl5;
import defpackage.dl5;
import defpackage.fb7;
import defpackage.i74;
import defpackage.ore;
import defpackage.pi;
import defpackage.qe7;
import defpackage.sa7;
import defpackage.tl0;
import defpackage.zo5;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean D1;
    public Dialog F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public Handler u1;
    public final pi v1 = new pi(11, this);
    public final bl5 w1 = new bl5(this);
    public final cl5 x1 = new cl5(this);
    public int y1 = 0;
    public int z1 = 0;
    public boolean A1 = true;
    public boolean B1 = true;
    public int C1 = -1;
    public final av6 E1 = new av6(this, 2);
    public boolean J1 = false;

    @Override // androidx.fragment.app.a
    public final LayoutInflater A(Bundle bundle) {
        LayoutInflater layoutInflaterA = super.A(bundle);
        boolean z = this.B1;
        if (z && !this.D1) {
            if (z && !this.J1) {
                try {
                    this.D1 = true;
                    Dialog dialogQ = Q();
                    this.F1 = dialogQ;
                    if (this.B1) {
                        int i = this.y1;
                        if (i == 1 || i == 2) {
                            dialogQ.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogQ.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogQ.requestWindowFeature(1);
                        }
                        Context contextJ = j();
                        if (contextJ != null) {
                            this.F1.setOwnerActivity((Activity) contextJ);
                        }
                        this.F1.setCancelable(this.A1);
                        this.F1.setOnCancelListener(this.w1);
                        this.F1.setOnDismissListener(this.x1);
                        this.J1 = true;
                    } else {
                        this.F1 = null;
                    }
                    this.D1 = false;
                } catch (Throwable th) {
                    this.D1 = false;
                    throw th;
                }
            }
            if (c.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.F1;
            if (dialog != null) {
                return layoutInflaterA.cloneInContext(dialog.getContext());
            }
        } else if (c.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.B1) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterA;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterA;
    }

    @Override // androidx.fragment.app.a
    public final void H(Bundle bundle) {
        Dialog dialog = this.F1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.y1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.z1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.A1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.B1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.C1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.a
    public final void I() {
        this.G = true;
        Dialog dialog = this.F1;
        if (dialog != null) {
            this.G1 = false;
            dialog.show();
            View decorView = this.F1.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.a
    public final void J() {
        this.G = true;
        Dialog dialog = this.F1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.a
    public final void K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.K(layoutInflater, viewGroup, bundle);
        if (this.F1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.F1.onRestoreInstanceState(bundle2);
    }

    public final void P(boolean z) {
        if (this.H1) {
            return;
        }
        this.H1 = true;
        this.I1 = false;
        Dialog dialog = this.F1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.F1.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.u1.getLooper()) {
                    onDismiss(this.F1);
                } else {
                    this.u1.post(this.v1);
                }
            }
        }
        this.G1 = true;
        if (this.C1 < 0) {
            tl0 tl0Var = new tl0(l());
            tl0Var.o = true;
            tl0Var.g(this);
            tl0Var.d(true);
            return;
        }
        c cVarL = l();
        int i = this.C1;
        if (i < 0) {
            ore.p(zo5.h(i, "Bad id: "));
        } else {
            cVarL.y(new fb7(cVarL, i), true);
            this.C1 = -1;
        }
    }

    public Dialog Q() {
        if (c.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new i74(L(), this.z1);
    }

    @Override // androidx.fragment.app.a
    public final qe7 a() {
        return new dl5(this, new sa7(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.G1) {
            return;
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        P(true);
    }

    @Override // androidx.fragment.app.a
    public final void s() {
        this.G = true;
    }

    @Override // androidx.fragment.app.a
    public final void u(Context context) {
        super.u(context);
        this.p1.f(this.E1);
        if (this.I1) {
            return;
        }
        this.H1 = false;
    }

    @Override // androidx.fragment.app.a
    public void v(Bundle bundle) {
        super.v(bundle);
        this.u1 = new Handler();
        this.B1 = this.y == 0;
        if (bundle != null) {
            this.y1 = bundle.getInt("android:style", 0);
            this.z1 = bundle.getInt("android:theme", 0);
            this.A1 = bundle.getBoolean("android:cancelable", true);
            this.B1 = bundle.getBoolean("android:showsDialog", this.B1);
            this.C1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.a
    public final void y() {
        this.G = true;
        Dialog dialog = this.F1;
        if (dialog != null) {
            this.G1 = true;
            dialog.setOnDismissListener(null);
            this.F1.dismiss();
            if (!this.H1) {
                onDismiss(this.F1);
            }
            this.F1 = null;
            this.J1 = false;
        }
    }

    @Override // androidx.fragment.app.a
    public final void z() {
        this.G = true;
        if (!this.I1 && !this.H1) {
            this.H1 = true;
        }
        this.p1.j(this.E1);
    }
}
