package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class ar extends b implements dr {
    public vr x;

    public ar() {
        ((b1f) this.d.c).c("androidx:appcompat", new yq(this));
        i(new zq(this));
    }

    @Override // defpackage.g74, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        vr vrVar = (vr) r();
        vrVar.y();
        ((ViewGroup) vrVar.A.findViewById(R.id.content)).addView(view, layoutParams);
        vrVar.m.a(vrVar.l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        hq4 hq4Var;
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        vr vrVar = (vr) r();
        vrVar.n1 = true;
        int i37 = vrVar.r1;
        if (i37 == -100) {
            i37 = kr.b;
        }
        int iD = vrVar.D(context, i37);
        if (kr.d(context)) {
            kr.n(context);
        }
        mc9 mc9VarQ = vr.q(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(vr.u(context, iD, mc9VarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof hq4) {
                    try {
                        ((hq4) context).a(vr.u(context, iD, mc9VarQ, null, false));
                    } catch (IllegalStateException unused2) {
                        if (vr.I1) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f2 = configuration2.fontScale;
                                    if (f != f2) {
                                        configuration3.fontScale = f2;
                                    }
                                    i = configuration.mcc;
                                    i2 = configuration2.mcc;
                                    if (i != i2) {
                                        configuration3.mcc = i2;
                                    }
                                    i3 = configuration.mnc;
                                    i4 = configuration2.mnc;
                                    if (i3 != i4) {
                                        configuration3.mnc = i4;
                                    }
                                    nr.a(configuration, configuration2, configuration3);
                                    i5 = configuration.touchscreen;
                                    i6 = configuration2.touchscreen;
                                    if (i5 != i6) {
                                        configuration3.touchscreen = i6;
                                    }
                                    i7 = configuration.keyboard;
                                    i8 = configuration2.keyboard;
                                    if (i7 != i8) {
                                        configuration3.keyboard = i8;
                                    }
                                    i9 = configuration.keyboardHidden;
                                    i10 = configuration2.keyboardHidden;
                                    if (i9 != i10) {
                                        configuration3.keyboardHidden = i10;
                                    }
                                    i11 = configuration.navigation;
                                    i12 = configuration2.navigation;
                                    if (i11 != i12) {
                                        configuration3.navigation = i12;
                                    }
                                    i13 = configuration.navigationHidden;
                                    i14 = configuration2.navigationHidden;
                                    if (i13 != i14) {
                                        configuration3.navigationHidden = i14;
                                    }
                                    i15 = configuration.orientation;
                                    i16 = configuration2.orientation;
                                    if (i15 != i16) {
                                        configuration3.orientation = i16;
                                    }
                                    i17 = configuration.screenLayout & 15;
                                    i18 = configuration2.screenLayout & 15;
                                    if (i17 != i18) {
                                        configuration3.screenLayout |= i18;
                                    }
                                    i19 = configuration.screenLayout & 192;
                                    i20 = configuration2.screenLayout & 192;
                                    if (i19 != i20) {
                                        configuration3.screenLayout |= i20;
                                    }
                                    i21 = configuration.screenLayout & 48;
                                    i22 = configuration2.screenLayout & 48;
                                    if (i21 != i22) {
                                        configuration3.screenLayout |= i22;
                                    }
                                    i23 = configuration.screenLayout & 768;
                                    i24 = configuration2.screenLayout & 768;
                                    if (i23 != i24) {
                                        configuration3.screenLayout |= i24;
                                    }
                                    ftk.a(configuration, configuration2, configuration3);
                                    i25 = configuration.uiMode & 15;
                                    i26 = configuration2.uiMode & 15;
                                    if (i25 != i26) {
                                        configuration3.uiMode |= i26;
                                    }
                                    i27 = configuration.uiMode & 48;
                                    i28 = configuration2.uiMode & 48;
                                    if (i27 != i28) {
                                        configuration3.uiMode |= i28;
                                    }
                                    i29 = configuration.screenWidthDp;
                                    i30 = configuration2.screenWidthDp;
                                    if (i29 != i30) {
                                        configuration3.screenWidthDp = i30;
                                    }
                                    i31 = configuration.screenHeightDp;
                                    i32 = configuration2.screenHeightDp;
                                    if (i31 != i32) {
                                        configuration3.screenHeightDp = i32;
                                    }
                                    i33 = configuration.smallestScreenWidthDp;
                                    i34 = configuration2.smallestScreenWidthDp;
                                    if (i33 != i34) {
                                        configuration3.smallestScreenWidthDp = i34;
                                    }
                                    i35 = configuration.densityDpi;
                                    i36 = configuration2.densityDpi;
                                    if (i35 != i36) {
                                        configuration3.densityDpi = i36;
                                    }
                                }
                            }
                            Configuration configurationU = vr.u(context, iD, mc9VarQ, configuration3, true);
                            hq4Var = new hq4(context, ru.oneme.app.R.style.Theme_AppCompat_Empty);
                            hq4Var.a(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    y74.a(hq4Var.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = hq4Var;
                        }
                    }
                } else if (vr.I1) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f2 = configuration2.fontScale;
                            if (f != f2) {
                                configuration3.fontScale = f2;
                            }
                            i = configuration.mcc;
                            i2 = configuration2.mcc;
                            if (i != i2) {
                                configuration3.mcc = i2;
                            }
                            i3 = configuration.mnc;
                            i4 = configuration2.mnc;
                            if (i3 != i4) {
                                configuration3.mnc = i4;
                            }
                            nr.a(configuration, configuration2, configuration3);
                            i5 = configuration.touchscreen;
                            i6 = configuration2.touchscreen;
                            if (i5 != i6) {
                                configuration3.touchscreen = i6;
                            }
                            i7 = configuration.keyboard;
                            i8 = configuration2.keyboard;
                            if (i7 != i8) {
                                configuration3.keyboard = i8;
                            }
                            i9 = configuration.keyboardHidden;
                            i10 = configuration2.keyboardHidden;
                            if (i9 != i10) {
                                configuration3.keyboardHidden = i10;
                            }
                            i11 = configuration.navigation;
                            i12 = configuration2.navigation;
                            if (i11 != i12) {
                                configuration3.navigation = i12;
                            }
                            i13 = configuration.navigationHidden;
                            i14 = configuration2.navigationHidden;
                            if (i13 != i14) {
                                configuration3.navigationHidden = i14;
                            }
                            i15 = configuration.orientation;
                            i16 = configuration2.orientation;
                            if (i15 != i16) {
                                configuration3.orientation = i16;
                            }
                            i17 = configuration.screenLayout & 15;
                            i18 = configuration2.screenLayout & 15;
                            if (i17 != i18) {
                                configuration3.screenLayout |= i18;
                            }
                            i19 = configuration.screenLayout & 192;
                            i20 = configuration2.screenLayout & 192;
                            if (i19 != i20) {
                                configuration3.screenLayout |= i20;
                            }
                            i21 = configuration.screenLayout & 48;
                            i22 = configuration2.screenLayout & 48;
                            if (i21 != i22) {
                                configuration3.screenLayout |= i22;
                            }
                            i23 = configuration.screenLayout & 768;
                            i24 = configuration2.screenLayout & 768;
                            if (i23 != i24) {
                                configuration3.screenLayout |= i24;
                            }
                            ftk.a(configuration, configuration2, configuration3);
                            i25 = configuration.uiMode & 15;
                            i26 = configuration2.uiMode & 15;
                            if (i25 != i26) {
                                configuration3.uiMode |= i26;
                            }
                            i27 = configuration.uiMode & 48;
                            i28 = configuration2.uiMode & 48;
                            if (i27 != i28) {
                                configuration3.uiMode |= i28;
                            }
                            i29 = configuration.screenWidthDp;
                            i30 = configuration2.screenWidthDp;
                            if (i29 != i30) {
                                configuration3.screenWidthDp = i30;
                            }
                            i31 = configuration.screenHeightDp;
                            i32 = configuration2.screenHeightDp;
                            if (i31 != i32) {
                                configuration3.screenHeightDp = i32;
                            }
                            i33 = configuration.smallestScreenWidthDp;
                            i34 = configuration2.smallestScreenWidthDp;
                            if (i33 != i34) {
                                configuration3.smallestScreenWidthDp = i34;
                            }
                            i35 = configuration.densityDpi;
                            i36 = configuration2.densityDpi;
                            if (i35 != i36) {
                                configuration3.densityDpi = i36;
                            }
                        }
                    }
                    Configuration configurationU2 = vr.u(context, iD, mc9VarQ, configuration3, true);
                    hq4Var = new hq4(context, ru.oneme.app.R.style.Theme_AppCompat_Empty);
                    hq4Var.a(configurationU2);
                    if (context.getTheme() != null) {
                        y74.a(hq4Var.getTheme());
                    }
                    context = hq4Var;
                }
            }
        } else if (context instanceof hq4) {
            ((hq4) context).a(vr.u(context, iD, mc9VarQ, null, false));
        } else if (vr.I1) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f2 = configuration2.fontScale;
                    if (f != f2) {
                        configuration3.fontScale = f2;
                    }
                    i = configuration.mcc;
                    i2 = configuration2.mcc;
                    if (i != i2) {
                        configuration3.mcc = i2;
                    }
                    i3 = configuration.mnc;
                    i4 = configuration2.mnc;
                    if (i3 != i4) {
                        configuration3.mnc = i4;
                    }
                    nr.a(configuration, configuration2, configuration3);
                    i5 = configuration.touchscreen;
                    i6 = configuration2.touchscreen;
                    if (i5 != i6) {
                        configuration3.touchscreen = i6;
                    }
                    i7 = configuration.keyboard;
                    i8 = configuration2.keyboard;
                    if (i7 != i8) {
                        configuration3.keyboard = i8;
                    }
                    i9 = configuration.keyboardHidden;
                    i10 = configuration2.keyboardHidden;
                    if (i9 != i10) {
                        configuration3.keyboardHidden = i10;
                    }
                    i11 = configuration.navigation;
                    i12 = configuration2.navigation;
                    if (i11 != i12) {
                        configuration3.navigation = i12;
                    }
                    i13 = configuration.navigationHidden;
                    i14 = configuration2.navigationHidden;
                    if (i13 != i14) {
                        configuration3.navigationHidden = i14;
                    }
                    i15 = configuration.orientation;
                    i16 = configuration2.orientation;
                    if (i15 != i16) {
                        configuration3.orientation = i16;
                    }
                    i17 = configuration.screenLayout & 15;
                    i18 = configuration2.screenLayout & 15;
                    if (i17 != i18) {
                        configuration3.screenLayout |= i18;
                    }
                    i19 = configuration.screenLayout & 192;
                    i20 = configuration2.screenLayout & 192;
                    if (i19 != i20) {
                        configuration3.screenLayout |= i20;
                    }
                    i21 = configuration.screenLayout & 48;
                    i22 = configuration2.screenLayout & 48;
                    if (i21 != i22) {
                        configuration3.screenLayout |= i22;
                    }
                    i23 = configuration.screenLayout & 768;
                    i24 = configuration2.screenLayout & 768;
                    if (i23 != i24) {
                        configuration3.screenLayout |= i24;
                    }
                    ftk.a(configuration, configuration2, configuration3);
                    i25 = configuration.uiMode & 15;
                    i26 = configuration2.uiMode & 15;
                    if (i25 != i26) {
                        configuration3.uiMode |= i26;
                    }
                    i27 = configuration.uiMode & 48;
                    i28 = configuration2.uiMode & 48;
                    if (i27 != i28) {
                        configuration3.uiMode |= i28;
                    }
                    i29 = configuration.screenWidthDp;
                    i30 = configuration2.screenWidthDp;
                    if (i29 != i30) {
                        configuration3.screenWidthDp = i30;
                    }
                    i31 = configuration.screenHeightDp;
                    i32 = configuration2.screenHeightDp;
                    if (i31 != i32) {
                        configuration3.screenHeightDp = i32;
                    }
                    i33 = configuration.smallestScreenWidthDp;
                    i34 = configuration2.smallestScreenWidthDp;
                    if (i33 != i34) {
                        configuration3.smallestScreenWidthDp = i34;
                    }
                    i35 = configuration.densityDpi;
                    i36 = configuration2.densityDpi;
                    if (i35 != i36) {
                        configuration3.densityDpi = i36;
                    }
                }
            }
            Configuration configurationU3 = vr.u(context, iD, mc9VarQ, configuration3, true);
            hq4Var = new hq4(context, ru.oneme.app.R.style.Theme_AppCompat_Empty);
            hq4Var.a(configurationU3);
            if (context.getTheme() != null) {
                y74.a(hq4Var.getTheme());
            }
            context = hq4Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((vr) r()).B();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.g74, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((vr) r()).B();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        vr vrVar = (vr) r();
        vrVar.y();
        return vrVar.l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        vr vrVar = (vr) r();
        if (vrVar.o == null) {
            vrVar.B();
            lwj lwjVar = vrVar.n;
            vrVar.o = new yah(lwjVar != null ? lwjVar.e() : vrVar.k);
        }
        return vrVar.o;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = gsi.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        vr vrVar = (vr) r();
        if (vrVar.n != null) {
            vrVar.B();
            vrVar.n.getClass();
            vrVar.C(0);
        }
    }

    @Override // defpackage.g74, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vr vrVar = (vr) r();
        if (vrVar.F && vrVar.z) {
            vrVar.B();
            lwj lwjVar = vrVar.n;
            if (lwjVar != null) {
                lwjVar.g();
            }
        }
        xr xrVarA = xr.a();
        Context context = vrVar.k;
        synchronized (xrVarA) {
            hne hneVar = xrVarA.a;
            synchronized (hneVar) {
                vi9 vi9Var = (vi9) hneVar.b.get(context);
                if (vi9Var != null) {
                    vi9Var.a();
                }
            }
        }
        vrVar.q1 = new Configuration(vrVar.k.getResources().getConfiguration());
        vrVar.o(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        r().f();
    }

    @Override // androidx.fragment.app.b, defpackage.g74, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentT;
        if (!super.onMenuItemSelected(i, menuItem)) {
            vr vrVar = (vr) r();
            vrVar.B();
            lwj lwjVar = vrVar.n;
            if (menuItem.getItemId() != 16908332 || lwjVar == null || (lwjVar.d() & 4) == 0 || (intentT = p90.t(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentT)) {
                navigateUpTo(intentT);
                return true;
            }
            qkh qkhVarB = qkh.b(this);
            qkhVarB.a(this);
            qkhVarB.c();
            try {
                n9.N(this);
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((vr) r()).y();
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        vr vrVar = (vr) r();
        vrVar.B();
        lwj lwjVar = vrVar.n;
        if (lwjVar != null) {
            lwjVar.k(true);
        }
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStart() {
        super.onStart();
        ((vr) r()).o(true, false);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onStop() {
        super.onStop();
        vr vrVar = (vr) r();
        vrVar.B();
        lwj lwjVar = vrVar.n;
        if (lwjVar != null) {
            lwjVar.k(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        r().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((vr) r()).B();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final kr r() {
        if (this.x == null) {
            iif iifVar = kr.a;
            this.x = new vr(this, null, this, this);
        }
        return this.x;
    }

    public final void s() {
        getWindow().getDecorView().setTag(ru.oneme.app.R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(ru.oneme.app.R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(ru.oneme.app.R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(ru.oneme.app.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // defpackage.g74, android.app.Activity
    public void setContentView(int i) {
        s();
        r().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((vr) r()).s1 = i;
    }

    @Override // defpackage.g74, android.app.Activity
    public void setContentView(View view) {
        s();
        r().k(view);
    }

    @Override // defpackage.g74, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        r().l(view, layoutParams);
    }
}
