package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class sic extends OrientationEventListener {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final ks9 b;
    public int c;

    public sic(Context context, ks9 ks9Var) {
        super(context, 3);
        this.a = context;
        this.b = ks9Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        if (i == -1) {
            return;
        }
        Context context = this.a;
        int i3 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i4 = 3;
        if (((((rotation == 0 || rotation == 2) && i3 == 2) || ((rotation == 1 || rotation == 3) && i3 == 1)) ? (char) 2 : (char) 1) == 1) {
            if (i >= 60 && i <= 140) {
                i2 = 1;
            } else if (i >= 140 && i <= 220) {
                i2 = 4;
            } else if (i < 220 || i > 300) {
                i2 = 3;
            } else {
                i2 = 2;
            }
        } else if (i >= 60 && i <= 140) {
            i2 = 3;
        } else if (i >= 140 && i <= 220) {
            i2 = 1;
        } else if (i < 220 || i > 300) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        boolean z = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
        int i5 = this.c;
        ks9 ks9Var = this.b;
        if (z) {
            if (i5 == 0 || i2 == i5) {
                int i6 = context.getResources().getConfiguration().orientation;
                if (i6 == 0) {
                    i4 = i2;
                } else if (i6 != 1) {
                    if (i6 != 2) {
                        i4 = 0;
                    } else {
                        i4 = ric.$EnumSwitchMapping$0[qt4.D(i2)] == 1 ? 1 : 2;
                    }
                } else if (ric.$EnumSwitchMapping$0[qt4.D(i2)] == 2) {
                    i4 = 4;
                }
                this.c = i4;
                if (ks9Var != null) {
                    ks9Var.E(i4, Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 0 && i2 == i5) {
            if (i2 == i5) {
                return;
            }
            int i7 = context.getResources().getConfiguration().orientation;
            if (i7 == 2 && (i2 == 3 || i2 == 4)) {
                return;
            }
            if (i7 == 1 && (i2 == 2 || i2 == 1)) {
                return;
            }
        }
        this.c = i2;
        if (ks9Var != null) {
            ks9Var.E(i2, Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1);
        }
    }
}
