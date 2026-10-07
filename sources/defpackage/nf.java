package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nf extends i74 implements DialogInterface, dr {
    public vr d;
    public final wr e;
    public final lf f;

    /* JADX WARN: Type inference failed for: r2v2, types: [wr] */
    public nf(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        super(contextThemeWrapper, i2);
        this.e = new gw8() { // from class: wr
            @Override // defpackage.gw8
            public final boolean a(KeyEvent keyEvent) {
                return this.a.k(keyEvent);
            }
        };
        kr krVarE = e();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((vr) krVarE).s1 = i3;
        krVarE.e();
        this.f = new lf(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        vr vrVar = (vr) e();
        vrVar.y();
        ((ViewGroup) vrVar.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        vrVar.m.a(vrVar.l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().f();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ti8.j(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public final kr e() {
        if (this.d == null) {
            iif iifVar = kr.a;
            this.d = new vr(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        vr vrVar = (vr) e();
        vrVar.y();
        return vrVar.l.findViewById(i);
    }

    public final void g() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final void h(Bundle bundle) {
        e().c();
        super.onCreate(bundle);
        e().e();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        vr vrVar = (vr) e();
        if (vrVar.n != null) {
            vrVar.B();
            vrVar.n.getClass();
            vrVar.C(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().m(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        h(bundle);
        lf lfVar = this.f;
        lfVar.b.setContentView(lfVar.u);
        Context context = lfVar.a;
        Window window = lfVar.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = lfVar.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !lf.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            charSequence = null;
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (lfVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (lfVar.e != null) {
                ((LinearLayout.LayoutParams) ((t19) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            charSequence = null;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = lf.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = lf.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = lf.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        lfVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        lfVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        lfVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            lfVar.m.removeView(lfVar.q);
            if (lfVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) lfVar.m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(lfVar.m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(lfVar.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        lfVar.h = button;
        x7 x7Var = lfVar.A;
        button.setOnClickListener(x7Var);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        Button button2 = lfVar.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(charSequence);
            lfVar.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        lfVar.i = button3;
        button3.setOnClickListener(x7Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(lfVar.j);
        Button button4 = lfVar.i;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(lfVar.j);
            lfVar.i.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        lfVar.l = button5;
        button5.setOnClickListener(x7Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = lfVar.l;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            lfVar.l.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = lfVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = lfVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = lfVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (lfVar.r != null) {
            viewGroupB.addView(lfVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            lfVar.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(lfVar.d) || !lfVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                lfVar.o.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                lfVar.p = textView2;
                textView2.setText(lfVar.d);
                Drawable drawable = lfVar.n;
                if (drawable != null) {
                    lfVar.o.setImageDrawable(drawable);
                } else {
                    lfVar.p.setPadding(lfVar.o.getPaddingLeft(), lfVar.o.getPaddingTop(), lfVar.o.getPaddingRight(), lfVar.o.getPaddingBottom());
                    lfVar.o.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = lfVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = lfVar.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = lfVar.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = lfVar.e;
            if (view2 == null) {
                view2 = lfVar.m;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = i7j.a;
                z6j.b(view2, i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = lfVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = lfVar.s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = lfVar.t;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.m;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void onStop() {
        super.onStop();
        vr vrVar = (vr) e();
        vrVar.B();
        lwj lwjVar = vrVar.n;
        if (lwjVar != null) {
            lwjVar.k(false);
        }
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void setContentView(int i) {
        g();
        e().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().m(getContext().getString(i));
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void setContentView(View view) {
        g();
        e().k(view);
    }

    @Override // defpackage.i74, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        e().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        lf lfVar = this.f;
        lfVar.d = charSequence;
        TextView textView = lfVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
