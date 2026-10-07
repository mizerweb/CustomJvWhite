package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class fk0 implements hk0 {
    public final Intent a;

    public fk0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk0) && this.a.equals(((fk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
