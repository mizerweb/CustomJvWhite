package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class jh6 extends ex8 {
    public final /* synthetic */ bq3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh6(bq3 bq3Var) {
        super(1);
        this.c = bq3Var;
    }

    @Override // defpackage.ex8
    public final boolean G(int i, int i2, Bundle bundle) {
        int i3;
        bq3 bq3Var = this.c;
        cq3 cq3Var = bq3Var.i;
        if (i == -1) {
            WeakHashMap weakHashMap = i7j.a;
            return cq3Var.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return bq3Var.o(i);
        }
        if (i2 == 2) {
            return bq3Var.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = bq3Var.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = bq3Var.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                bq3Var.k = Integer.MIN_VALUE;
                cq3Var.invalidate();
                bq3Var.p(i3, 65536);
            }
            bq3Var.k = i;
            cq3Var.invalidate();
            bq3Var.p(i, PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS);
            return true;
        }
        if (i2 == 128) {
            if (bq3Var.k != i) {
                return false;
            }
            bq3Var.k = Integer.MIN_VALUE;
            cq3Var.invalidate();
            bq3Var.p(i, 65536);
            return true;
        }
        cq3 cq3Var2 = bq3Var.n;
        if (i2 == 16) {
            if (i == 0) {
                return cq3Var2.performClick();
            }
            if (i == 1) {
                cq3Var2.playSoundEffect(0);
                View.OnClickListener onClickListener = cq3Var2.h;
                if (onClickListener != null) {
                    onClickListener.onClick(cq3Var2);
                    z = true;
                }
                if (cq3Var2.t) {
                    cq3Var2.s.p(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.ex8
    public final x4 u(int i) {
        return new x4(AccessibilityNodeInfo.obtain(this.c.n(i).a));
    }

    @Override // defpackage.ex8
    public final x4 w(int i) {
        bq3 bq3Var = this.c;
        int i2 = i == 2 ? bq3Var.k : bq3Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }
}
