package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gz8 {
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ gz8(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = i;
        this.b = sideSheetBehavior;
    }

    public static void a(u25 u25Var) {
        if (u25Var != null) {
            try {
                u25Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public final int b() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int c() {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int d(View view) {
        int i = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }
}
