package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class do5 {
    public final DisplayCutout a;

    public do5(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public static do5 e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new do5(displayCutout);
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return co5.e(this.a);
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return co5.f(this.a);
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return co5.g(this.a);
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return co5.h(this.a);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || do5.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((do5) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
